/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
//import org.apache.spark.sql.catalyst.expressions.GenericRow;
//import org.apache.spark.sql.Row;
//import org.apache.spark.sql.catalyst.expressions.GenericRowWithSchema;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.errors.UnparsableContentException;

//import scala.collection.JavaConverters;

//import scala.collection.JavaConverters;

/**
 * Reads HPCC Cluster data in binary format.
 */
public class BinaryRecordReader implements IRecordReader {
  protected RecordDef recDef;
  private int part;
  private PlainConnection pc;
  protected byte[] buffer;
  protected int curr_pos;
  private long pos;
  private boolean active;
  protected boolean defaultLE;
  //
  private static final Charset sbcSet = Charset.forName("ISO-8859-1");
  private static final Charset utf8Set = Charset.forName("UTF-8");
  private static final Charset utf16beSet = Charset.forName("UTF-16BE");
  private static final Charset utf16leSet = Charset.forName("UTF-16LE");
  private static final Logger log = Logger.getLogger(BinaryRecordReader.class.getName());

  // Used when reading decimal values
  private static final long[] powTable = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000,
                            10000000000L,100000000000L,1000000000000L,10000000000000L,100000000000000L,1000000000000000L};
  private static final int[] signMap = { 0,0,0,0,0,0,0,0,0,0,+1,-1,+1,-1,+1,+1 };

  private static final int MASK_32_LOWER_HALF = 0xffff;

  public static class ParsedFieldResult
  {
    public Object fieldValue = null;
    public int bytesConsumed = 0;
  };

  //
  /**
   * A Binary record reader.
   * @param fp the file part to be read
   * @param rd the record def
   */
  public BinaryRecordReader(DataPartition dp, RecordDef rd) {
    this.recDef = rd;
    this.pc = new PlainConnection(dp, rd);
    this.buffer = null; 
    this.curr_pos = 0;
    this.active = false;
    this.pos = 0;
    this.part = dp.getThisPart();
    this.defaultLE = true;
  }

  /* (non-Javadoc)
   * @see org.hpccsystems.spark.thor.IRecordReader#hasNext()
   */
  public boolean hasNext() throws HpccFileException
  {
    if (!this.active) {
      this.curr_pos = 0;
      this.active = true;
      this.buffer = pc.readBlock(this.buffer);
    }
    if (this.curr_pos < this.buffer.length) return true;
    if (pc.isClosed()) return false;
    this.buffer = pc.readBlock(this.buffer);
    if (this.buffer.length == 0) return false;
    this.curr_pos = 0;
    return true;
  }

  /* (non-Javadoc)
   * @see org.hpccsystems.spark.thor.IRecordReader#getNext()
   */
  public Object getNext() throws HpccFileException
  {
      if (!this.hasNext())
        throw new NoSuchElementException("No next record!");

    ParsedFieldResult parsedfield = null;
    try
    {
      FieldDef fd = this.recDef.getRootDef();

      parsedfield = parseField(this.buffer, this.curr_pos, fd, this.defaultLE);
      if (parsedfield.fieldValue == null || parsedfield.bytesConsumed == 0)
      {
        throw new HpccFileException("RecordContent not found, or invalid record structure. Check logs for more information.");
      }

      //if (parsedfield.fieldValue instanceof Row)
      //{
    	//  result = (Row) parsedfield.fieldValue;
      //} 
      //else 
      //{
      //  throw new HpccFileException("Invalid record structure. The top level field should always be a record. Please report this a bug.");
      //}
      
      this.curr_pos += parsedfield.bytesConsumed;
    } catch (UnparsableContentException e) {
      throw new HpccFileException("Failed to parse next record", e);
    }
    return parsedfield;
  }
  /**
   * Parse the byte array starting at position start for a field 
   * with the type and layout specified by the FieldDef.
   * @param src the source byte array of the data from the HPCC cluster
   * @param start the start position in the buffer
   * @param fd the field definition for the Record definition
   * @return ParsedFieldResult
   * @throws UnparsableContentException
   */
  private static ParsedFieldResult parseField(byte[] src, int start, FieldDef fd, boolean isLittleEndian) 
    throws UnparsableContentException {

    Object fieldValue = null;
    int consumed = 0;
    int dataLen = 0;
    int dataStart = 0;
    int dataStop = 0;

    int testLength = (fd.isFixed()) ? fd.getDataLen()   : 4;
    if (start+consumed+testLength > src.length) {
      StringBuilder sb = new StringBuilder();
      sb.append("Data ended prematurely parsing field ");
      sb.append(fd.getFieldName());
      throw new UnparsableContentException(sb.toString());
    }
  
      // Embedded field lengths are little endian
    switch (fd.getFieldType()) {
      case INTEGER:
        // fixed number of bytes in type info
        long intValue = 0;
        if (fd.isUnsigned()) {
          intValue = getUnsigned(src, start+consumed, fd.getDataLen(),
                          fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
          if (intValue < 0) {
            throw new UnparsableContentException("Integer overflow. Max 8 byte integer value: " + Long.MAX_VALUE);
          }
        } else {
          intValue = getInt(src, start+consumed, fd.getDataLen(),
                          fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
        }
        fieldValue = new Long(intValue);
        consumed += fd.getDataLen();
        break;
      case REAL:
        // fixed number of bytes (4 or 8) in type info
        double u = getReal(src, start+consumed, fd.getDataLen(),
                          fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
        fieldValue = new Double(u);
        consumed += fd.getDataLen();
        break;
      case DECIMAL:
        BigDecimal decValue = null;

        int numDigits = fd.getDataLen() & MASK_32_LOWER_HALF;
        if (fd.isUnsigned()) {
          dataLen = (numDigits+1) / 2;
        } else {
          dataLen = (numDigits+2) / 2;
        }

        dataStart = start+consumed;
        if (dataLen+dataStart > src.length) {
         throw new UnparsableContentException("Data ended prematurely");
        }

        if (fd.isUnsigned()) {
          decValue = getUnsignedDecimal(src, dataStart, fd.getDataLen());
        } else {
          decValue = getSignedDecimal(src, dataStart, fd.getDataLen());
        }

        fieldValue = decValue;
        consumed += dataLen;
        break;
      case BINARY:
        // full word length followed by data bytes or length in type
        // definition when fixed (e.g., DATA v DATA20)
        if (fd.isFixed()) {
          dataLen = fd.getDataLen();
        } else {
          dataLen = (int)getInt(src, start+consumed, 4, isLittleEndian);
          consumed += 4;
        }
        dataStart = start+consumed;
        if (dataLen+dataStart > src.length) {
          throw new UnparsableContentException("Data ended prematurely");
        }
        byte[] bytes = Arrays.copyOfRange(src, dataStart, dataStart+dataLen);
        fieldValue = bytes;
        consumed += dataLen;
        break;
      case BOOLEAN:
        // fixed length for each boolean value specified by type def
        long value = getInt(src,start+consumed,fd.getDataLen(),
                            fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
        fieldValue = new Boolean(value != 0);
        consumed += fd.getDataLen();
        break;
      case STRING:
        // fixed and variable length strings.  utf8 and utf-16 have
        // length specified in code points.  Fixed length UTF-16 may
        // have an illegal end as a high surrogate.  If so, terminal
        // high surrogate is blotted.
        if (fd.isFixed()) {
          dataLen = getCodeUnits(fd.getSourceType(), src, start+consumed,
                                  fd.getDataLen());
        } else {
          int cp = ((int)getInt(src, start+consumed, 4, isLittleEndian));
          dataLen = getCodeUnits(fd.getSourceType(), src, start+consumed+4, cp);
          consumed += 4;
        }
        if (start+consumed+dataLen > src.length) {
          throw new UnparsableContentException("String data ended early");
        }
        fieldValue = getString(fd.getSourceType(), src, start+consumed, dataLen);
        consumed += dataLen;
        break;
      case VAR_STRING:
        // Var strings are null terminated. In the case of Unicode this a 2-byte null character
        dataLen = -1;
        int remainingData = src.length - (start+consumed);
        HpccSrcType srcType = fd.getSourceType();
        boolean isUnicode = srcType == HpccSrcType.UTF16BE || srcType == HpccSrcType.UTF16LE;

        // Note: separate for loops because consuming 2 bytes at a
        // time makes null check easier. Do not have to check for alignment etc
        if (isUnicode) {
          for (int i = 0; i < remainingData-1; i+=2) {
            if (src[i] == '\0' && src[i+1] == '\0') {
              dataLen = i;
              break;
            }
          }
        } else {
          for (int i = 0; i < remainingData; i++) {
            if (src[i] == '\0') {
              dataLen = i;
              break;
            }
          }
        }
        
        if (dataLen == -1) {
          throw new UnparsableContentException("Unable to read varstring. Null character not found");
        }

        fieldValue = getString(fd.getSourceType(), src, start+consumed, dataLen);

        // Var strings support a fixed length
        if (fd.isFixed()) {
          dataLen = getCodeUnits(fd.getSourceType(), src, start+consumed,fd.getDataLen());
        }
       
        // Unicode uses 2-byte nulls
        consumed += dataLen + 1;
        if (isUnicode) {
          consumed++;
        }
        break;
      case RECORD:
        Object[] childFields = new Object[fd.getNumFields()];
        for (int fieldIndex = 0; fieldIndex < fd.getNumFields(); fieldIndex++)
        {
          FieldDef childFd = fd.getDef(fieldIndex);
          ParsedFieldResult result = parseField(src, start+consumed, childFd, isLittleEndian);
          childFields[fieldIndex] = result.fieldValue;
          consumed += result.bytesConsumed;
        }
        //fieldValue = new GenericRowWithSchema(childFields,fd.asSchema());
        fieldValue = childFields;
        break;
      case SET:
        // Data layout for SETS & DATASETS are similar. Exception is SETS have a preceding unused byte.
        // After getting past this byte a SET can be read with the same code used for DATASETS
        consumed++;
      case DATASET:
        if(fd.getNumDefs() != 1)
        {
          throw new UnparsableContentException("Set should have a single child type." + fd.getNumDefs() + " child types found.");
        }

        dataLen = (int)getInt(src, start+consumed, 4, isLittleEndian);
        consumed+=4;
        if (start+consumed+dataLen>src.length) {
          throw new UnparsableContentException("Set ended early " + dataLen);
        }
        int childCountGuess = 1;
        if (fd.getDataLen() > 0) {
          childCountGuess = dataLen / fd.getDataLen();
        }
        ArrayList<Object> ws = new ArrayList<Object>(childCountGuess);
        dataStart = start + consumed;
        dataStop = dataStart + dataLen;
        while (start + consumed < dataStop)
        {
          ParsedFieldResult result = parseField(src, start+consumed, fd.getDef(0), isLittleEndian);
          ws.add(result.fieldValue);
          consumed += result.bytesConsumed;
        }
        //fieldValue = JavaConverters.asScalaBufferConverter(ws).asScala().seq();
        fieldValue  = ws.toArray(new Object[ws.size()]); //look into what the above line actually does
        break;
      default:
        String msg = "Unhandled type: " + fd.getFieldType().toString();
        throw new UnparsableContentException(msg);
    }

    ParsedFieldResult result = new ParsedFieldResult();
    result.bytesConsumed = consumed;
    result.fieldValue = fieldValue;
    return result;
  }
  /**
   * Get an integer from the byte array
   * @param b the byte array from the HPCC THOR node
   * @param pos the position in the array
   * @param len the length, 1 to 8 bytes
   * @param little_endian true if the value is little endian
   * @return the integer extracted as a long
   */
  private static long getInt(byte[] b, int pos, int len, boolean little_endian) {
    long v = getUnsigned(b, pos, len, little_endian);

    // Make the value negative if it should have been by extending sign bit
    long negMask = (0x80 << (len-1)*8 );
    if ((v & negMask) != 0) {
      for (int i = len; i < 8; i++) {
        v |= (0xffL << (i * 8));
      }
    }

    return v;
  }
  /**
   * Get an unsigned int from the byte array
   * @param b the byte array from the HPCC THOR node
   * @param pos the position in the array
   * @param len the length, 1 to 8 bytes
   * @param little_endian true if the value is little endian
   * @return the integer extracted as a long
   */
  private static long getUnsigned(byte[] b, int pos, int len, boolean little_endian) {
    long v = 0;
    for (int i=0; i<len; i++) {
      v = (v << 8) |
          (((long)(b[pos + ((little_endian) ? len-1-i  : i)] & 0xff)));
    }
    return v;
  }
  /**
   * Get a real from the byte array
   * @param b the byte array of data from the THOR node
   * @param pos the position in the array
   * @param len the length, 4 or 8
   * @param little_endian true if the value is little endian
   * @return the extracted real as a double
   */
  private static double getReal(byte[] b, int pos, int len, boolean little_endian) {
    double u = 0;
    if (len == 4) {
      int u4 = 0;
      for (int i=0; i<4; i++) {
        u4 = (u4 << 8) |
            (((int)(b[pos + ((little_endian) ? len-1-i  : i)] & 0xff)));
      }
      u = Float.intBitsToFloat(u4);
    } else if (len == 8) {
      long u8 = 0;
      for (int i=0; i<8; i++) {
        u8 = (u8 << 8) |
            (((long)(b[pos + ((little_endian) ? len-1-i  : i)] & 0xff)));
      }
      u = Double.longBitsToDouble(u8);
    }
    return u;
  }
  /**
   * Get a unsigned decimal from the byte array
   * @param b the byte array of data from the THOR node
   * @param pos the position in the array
   * @param len packed field of numDigits in upper half and precision in lower half
   * @return BigDecimal
   */
  private static BigDecimal getUnsignedDecimal(byte[] b, int pos, int len)
  {
    int numDigits = len & 0xffff;
    int precision = len >> 16;
    int dataLen = (numDigits+1) / 2;

    BigDecimal ret = new BigDecimal(0);

    int idx = 0;
    int curDigit = numDigits-1;

    while(idx < dataLen) {
      long value = 0;

      // We can consume 16 digits / 8 bytes at a time without overflowing.
      int numToConsume = 8;
      if ( (idx + numToConsume) > dataLen ) {
        numToConsume = dataLen - idx;
      }

      for (int j = 0; j < numToConsume; j++, idx++) {
        value += powTable[15-(j*2+0)] * ((b[pos+idx] >> 4) & 0x0f);
        value += powTable[15-(j*2+1)] * (b[pos+idx] & 0x0f);
      }

      int scale = (curDigit - precision) - 15;
      ret = ret.add(new BigDecimal(BigInteger.valueOf(value),-scale,MathContext.UNLIMITED));
      curDigit -= numToConsume*2;
    }

    return ret;
  }
  /**
   * Get a decimal from the byte array
   * @param b the byte array of data from the THOR node
   * @param pos the position in the array
   * @param len packed field of numDigits in upper half and precision in lower half
   * @return BigDecimal
   */
  private static BigDecimal getSignedDecimal(byte[] b, int pos, int len)
  {
    int numDigits = len & MASK_32_LOWER_HALF;
    int precision = len >> 16;
    int dataLen = (numDigits+2) / 2;

    final int zeroDigit = 32;
    int lsb = zeroDigit - precision;
    int msb = lsb + numDigits;

    byte lastByte = b[pos+dataLen-1];
    long signMul = 1;
    if (signMap[lastByte & 0x0f] == -1) {
      signMul = -1;
    }

    int idx = 0;
    int curDigit = numDigits;

    // Read value from last byte. Lower nibble contains sign ignore it
    long value = (lastByte >> 4) & 0x0f;
    value *= signMul;
    BigDecimal ret = new BigDecimal(BigInteger.valueOf(value), precision,MathContext.UNLIMITED);

    // If the # of digits is odd the last byte only contains the sign
    if (numDigits % 2 == 1) {
      curDigit--;
    }

    // If the most significant byte == max int digits then only
    // the lower nibble is used
    if (msb == 32) {
      value = powTable[15] * b[idx] & 0xf;
      value *= signMul;

      int scale = (curDigit - precision) - 15;
      ret = ret.add(new BigDecimal(BigInteger.valueOf(value),-scale,MathContext.UNLIMITED));

      idx++;
      curDigit--;
    }

    while(idx < dataLen-1) {
      value = 0;

      // We can consume 16 digits / 8 bytes at a time without overflowing.
      int numToConsume = 8;
      if ( (idx + numToConsume) > dataLen-1 ) {
        numToConsume = (dataLen - 1) - idx;
      }

      for (int j = 0; j < numToConsume; j++, idx++) {
        value += powTable[15-(j*2+0)] * ((b[pos+idx] >> 4) & 0x0f);
        value += powTable[15-(j*2+1)] * (b[pos+idx] & 0x0f);
      }

      value *= signMul;
      int scale = (curDigit - precision) - 15;
      BigDecimal decVal = new BigDecimal(BigInteger.valueOf(value),-scale,MathContext.UNLIMITED);
      ret = ret.add(decVal);

      curDigit -= numToConsume*2;
    }

    return ret;
  }
  /**
   * Extract a string from the byte array
   * @param styp the source type in the byte array
   * @param b the byte array from the THOR node
   * @param pos the position in the array
   * @param len the number of bytes
   * @return the extracted string
   */
  private static String getString(HpccSrcType styp, byte[] b, int pos, int len)
          throws UnparsableContentException {
    String rslt = "";
    switch (styp) {
      case UTF8:
        rslt = new String(b, pos, len, utf8Set);
        break;
      case SINGLE_BYTE_CHAR:
        rslt = new String(b, pos, len, sbcSet);
        break;
      case UTF16BE:
        rslt = new String(b, pos, len, utf16beSet);
        break;
      case UTF16LE:
        rslt = new String(b, pos, len, utf16leSet);
        break;
      default:
        throw new UnparsableContentException("Unknown source type");
    }
    return rslt;
  }
  /**
   * Get the number of code units (number of bytes) used to encode cp coded
   * characters.
   * @param styp the source data type
   * @param b the byte array buffer
   * @param pos the current position in the buffer
   * @param cp the number of code points.
   * @return the number of bytes
   * @throws UnparsableContentException when the end of the buffer was reach
   * unexpected or the stream of data was incorrect, such as an illegal byte
   * sequence for UTF8.
   */
  private static int getCodeUnits(HpccSrcType styp, byte[] b, int pos, int cp)
        throws UnparsableContentException {
    int bytes = 0;
    int work = 0;
    switch (styp) {
      case UTF8:
        for (int i=0; i<cp && pos+bytes<b.length; i++) {
          if ((b[pos+bytes] & 0x80) == 0) bytes++;
          else if ((b[pos+bytes] & 0xE0) == 0xC0) bytes+=2;
          else if ((b[pos+bytes] & 0xF0) == 0xE0) bytes+=3;
          else if ((b[pos+bytes] & 0xF8) == 0xF0) bytes+=4;
          else throw new UnparsableContentException("Illegal UTF-8 sequence");
        }
        break;
      case SINGLE_BYTE_CHAR:
        bytes = cp;
        break;
      case UTF16BE:
        if (pos+(cp*2) > b.length) {
          throw new UnparsableContentException("Early end of data");
        }
        work = (int) getInt(b, pos+((cp-1)*2), 2, false);
        // check the last character to make sure it is not a truncated pair
        if (Character.isHighSurrogate((char)work)) { // truncated pair to fix?
          b[pos+((cp-1)*2)] = 0;
          b[pos+((cp-1)*2)+1] = 0x20;   // make this a blank
        }
        bytes = cp*2;
        break;
      case UTF16LE:
        if (pos+(cp*2) > b.length) {
          throw new UnparsableContentException("Early end of data at " + pos);
        }
        work = (int) getInt(b, pos+((cp-1)*2), 2, true);
        // check the last character to make sure it is not a truncated pair
        if (Character.isHighSurrogate((char)work)) { // truncated pair to fix?
          b[pos+((cp-1)*2)] = 0x20;
          b[pos+((cp-1)*2)+1] = 0;  // make this a blank
        }
        bytes = cp * 2;
        break;
      default:
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown data source type for a string of: ");
        sb.append(styp.toString());
        throw new UnparsableContentException(sb.toString());
    }
    return bytes;
  }
}
