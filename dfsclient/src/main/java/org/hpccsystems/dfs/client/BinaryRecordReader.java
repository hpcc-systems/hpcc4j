/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.client;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.errors.UnparsableContentException;

import org.hpccsystems.dfs.client.IRecordBuilder;
import org.hpccsystems.dfs.client.IRecordReader;

class CountingInputStream extends InputStream
{
    long        streamPos   = 0;
    long        markPos     = 0;
    InputStream inputStream = null;

    CountingInputStream(InputStream is)
    {
        this.inputStream = is;
    }

    long getStreamPosition()
    {
        return streamPos;
    }

    public int available() throws IOException
    {
        return this.inputStream.available();
    }

    public void close() throws IOException
    {
        this.inputStream.close();
    }

    public void mark(int readlimit)
    {
        this.markPos = streamPos;
        this.inputStream.mark(readlimit);
    }

    public boolean markSupported()
    {
        return this.inputStream.markSupported();
    }

    // Returns next byte [0-255] -1 on EOS
    public int read() throws IOException
    {
        int ret = this.inputStream.read();
        if (ret > -1)
        {
            streamPos++;
        }
        return ret;
    }

    // Returns -1 on EOS
    public int read(byte[] b) throws IOException
    {
        int ret = this.inputStream.read(b);
        if (ret > 0)
        {
            streamPos += ret;
        }

        return ret;
    }

    // Returns -1 on EOS
    public int read(byte[] b, int off, int len) throws IOException
    {
        int ret = this.inputStream.read(b, off, len);
        if (ret > 0)
        {
            streamPos += ret;
        }

        return ret;
    }

    public void reset() throws IOException
    {
        this.streamPos = markPos;
        this.inputStream.reset();
    }

    public long skip(long n) throws IOException
    {
        long ret = this.inputStream.skip(n);
        streamPos += ret;

        return ret;
    }
}

/**
 * Reads HPCC Cluster data in binary format.
 */
public class BinaryRecordReader implements IRecordReader
{
    protected IRecordBuilder     rootRecordBuilder;
    private CountingInputStream  inputStream;
    private FieldDef             rootRecordDefinition;
    protected boolean            defaultLE;
    private byte[]               scratchBuffer       = new byte[SCRATCH_BUFFER_SIZE];
    private StringBuilder        scratchStrBuilder   = new StringBuilder(8192);

    //
    private static final Charset sbcSet              = Charset.forName("ISO-8859-1");
    private static final Charset utf8Set             = Charset.forName("UTF-8");
    private static final Charset utf16beSet          = Charset.forName("UTF-16BE");
    private static final Charset utf16leSet          = Charset.forName("UTF-16LE");
    private static final Logger  log                 = Logger.getLogger(BinaryRecordReader.class.getName());

    // Scratch buffer to avoid temp allocations
    private static final int     SCRATCH_BUFFER_SIZE = 256;

    // Used when reading decimal values
    private static final long[]  powTable            = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L,
            100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L };
    private static final int[]   signMap             = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, +1, -1, +1, -1, +1, +1 };

    private static final int     MASK_32_LOWER_HALF  = 0xffff;

    /**
     * A Binary record reader.
     * 
     * @param fp
     *            the file part to be read
     * @param rd
     *            the record def
     */
    public BinaryRecordReader(InputStream is) throws Exception
    {
        this.inputStream = new CountingInputStream(is);
        this.defaultLE = true;

        if (this.inputStream.markSupported() == false)
        {
            throw new Exception("BinaryRecordReader requires provided InputStream to support mark()");
        }
    }

    public void initialize(IRecordBuilder rb) throws Exception
    {
        this.rootRecordBuilder = rb;
        if (rb == null)
        {
            throw new Exception("Error initializing BinaryRecordReader. IRecordBuilder must not be null.");
        }

        this.rootRecordDefinition = rb.getRecordDefinition();
        if (this.rootRecordDefinition == null)
        {
            throw new Exception("Error initializing BinaryRecordReader. IRecordBuilder provided a null record definition.");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.spark.thor.IRecordReader#hasNext()
     */
    public boolean hasNext() throws HpccFileException
    {
        if (this.rootRecordBuilder == null)
        {
            throw new HpccFileException("RecordReader must be initialized before being used.");
        }

        int nextByte = -1;
        try
        {
            if (this.inputStream.available() > 0)
            {
                return true;
            }

            // Peek the next byte to see if there is remaining data. If -1 we reached EOS
            // Read limit is arbitrary we will only be reading one byte
            this.inputStream.mark(2);
            nextByte = this.inputStream.read();
            this.inputStream.reset();
        }
        catch (IOException e)
        {
            throw new HpccFileException(e.getMessage());
        }

        return nextByte != -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.spark.thor.IRecordReader#getNext()
     */
    public Object getNext() throws HpccFileException
    {
        if (this.rootRecordBuilder == null)
        {
            throw new HpccFileException("RecordReader must be initialized before being used.");
        }

        if (!this.hasNext()) throw new NoSuchElementException("No next record!");

        Object record = null;
        try
        {
            record = parseRecord(this.rootRecordDefinition, this.rootRecordBuilder, this.defaultLE);
            if (record == null)
            {
                throw new HpccFileException("RecordContent not found, or invalid record structure. Check logs for more information.");
            }

        }
        catch (Exception e)
        {
            throw new HpccFileException("Failed to parse next record: " + e.getMessage(), e);
        }

        return record;
    }
   
    /**
     * Returns the number of bytes available to read immediately.
     */
    public int getAvailable() throws IOException
    {
        return this.inputStream.available();
    }

    /**
     * Parse a non-hierarchical field
     * 
     * @param ReadContext
     *            the source byte array of the data from the HPCC cluster
     * @param FieldDef
     *            the field definition for the Record definition
     * @param isLittleEndian
     * @return ParsedFieldResult
     * @throws UnparsableContentException
     */
    private Object parseFlatField(FieldDef fd, boolean isLittleEndian) throws UnparsableContentException, IOException
    {
        Object fieldValue = null;
        int dataLen = 0;

        int minLength = 4;
        if (fd.isFixed())
        {
            if (fd.getDataLen() > Integer.MAX_VALUE)
            {
                throw new UnparsableContentException("Data length: " + fd.getDataLen() + " exceeds max supported length: " + Integer.MAX_VALUE);
            }
            minLength = (int) fd.getDataLen();
        }

        if (minLength > this.inputStream.available())
        {
            throw new UnparsableContentException("Data ended prematurely parsing field " + fd.getFieldName());
        }

        // Embedded field lengths are little endian
        switch (fd.getFieldType())
        {
            case INTEGER:
                // fixed number of bytes in type info
                long intValue = 0;
                if (fd.isUnsigned())
                {
                    intValue = getUnsigned((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                    if (intValue < 0)
                    {
                        log.warn("Detected possible unsigned value overflow in field '" + fd.getFieldName() + "'. Ensure proper value interpretation");
                    }
                }
                else
                {
                    intValue = getInt((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                }
                fieldValue = new Long(intValue);
                break;
            case REAL:
                // fixed number of bytes (4 or 8) in type info
                double u = getReal((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                fieldValue = new Double(u);
                break;
            case DECIMAL:
                BigDecimal decValue = null;

                dataLen = (int) fd.getDataLen();
                if (dataLen > this.inputStream.available())
                {
                    throw new UnparsableContentException("Data ended prematurely");
                }

                if (fd.isUnsigned())
                {
                    decValue = getUnsignedDecimal(fd.getPrecision(), fd.getScale(), (int) fd.getDataLen());
                }
                else
                {
                    decValue = getSignedDecimal(fd.getPrecision(), fd.getScale(), (int) fd.getDataLen());
                }

                fieldValue = decValue;
                break;
            case BINARY:
                // full word length followed by data bytes or length in type
                // definition when fixed (e.g., DATA v DATA20)
                if (fd.isFixed())
                {
                    dataLen = (int) fd.getDataLen();
                }
                else
                {
                    dataLen = (int) getInt(4, isLittleEndian);
                }

                if (dataLen > this.inputStream.available())
                {
                    throw new UnparsableContentException("Data ended prematurely");
                }
                byte[] bytes = new byte[dataLen];
                this.inputStream.read(bytes);
                fieldValue = bytes;
                break;
            case BOOLEAN:
                // fixed length for each boolean value specified by type def
                long value = getInt((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                fieldValue = new Boolean(value != 0);
                break;
            case CHAR:
                fieldValue = getString(fd.getSourceType(), 1);
                break;
            case STRING:
            {
                int codePoints = 0;
                if (fd.isFixed())
                {
                    if (fd.getDataLen() > Integer.MAX_VALUE)
                    {
                        throw new UnparsableContentException(
                                "Data length: " + fd.getDataLen() + " exceeds max supported length: " + Integer.MAX_VALUE);
                    }

                    codePoints = (int) fd.getDataLen();
                }
                else
                {
                    codePoints = ((int) getInt(4, isLittleEndian));
                }

                fieldValue = getString(fd.getSourceType(), codePoints);
                break;
            }
            case VAR_STRING:
            {
                // Var strings are null terminated. In the case of Unicode this a 2-byte null character
                // Var strings support a fixed length
                if (fd.isFixed())
                {
                    if (fd.getDataLen() > Integer.MAX_VALUE)
                    {
                        throw new UnparsableContentException(
                                "Data length: " + fd.getDataLen() + " exceeds max supported length: " + Integer.MAX_VALUE);
                    }

                    int codePoints = (int) fd.getDataLen();
                    String strValue = getString(fd.getSourceType(), codePoints);

                    // Unicode uses two byte nulls
                    if (fd.getSourceType().isUTF16())
                    {
                        this.inputStream.skip(2);
                        // strValue += "\0\0";
                    }
                    else
                    {
                        this.inputStream.skip(1);
                        // strValue += "\0";
                    }
                    fieldValue = strValue;
                }
                else
                {
                    fieldValue = getNullTerminatedString(fd.getSourceType());
                }
                break;
            }
            default:
                throw new UnparsableContentException("Unexpected type: " + fd.getFieldType() + " for field: " + fd.getFieldName());
        }

        return fieldValue;
    }

    /**
     * Parse a record
     * 
     * @param readContext
     *            the source byte array of the data from the HPCC cluster
     * @param recordDef
     *            the field definition for the Record definition
     * @param recordBuilder
     *            the record builder to use to construct the record
     * @param isLittleEndian
     * @return ParsedFieldResult
     * @throws UnparsableContentException
     */
    private Object parseRecord(FieldDef recordDef, IRecordBuilder recordBuilder, boolean isLittleEndian)
            throws UnparsableContentException, IOException
    {

        try
        {
            recordBuilder.startRecord();
        }
        catch (Exception e)
        {
            throw new UnparsableContentException("Unable to start record with error: " + e.getMessage());
        }

        for (int fieldIndex = 0; fieldIndex < recordDef.getNumDefs(); fieldIndex++)
        {
            FieldDef fd = recordDef.getDef(fieldIndex);
            Object fieldValue = null;
            switch (fd.getFieldType())
            {
                case INTEGER:
                case REAL:
                case DECIMAL:
                case BINARY:
                case BOOLEAN:
                case STRING:
                case CHAR:
                case VAR_STRING:
                    fieldValue = parseFlatField(fd, isLittleEndian);
                    break;
                case RECORD:
                {
                    IRecordBuilder childRecordBuilder = recordBuilder.getChildRecordBuilder(fieldIndex);
                    if (childRecordBuilder == null)
                    {
                        throw new UnparsableContentException("Recieved null child IRecordBulder for field:" + fd.getFieldName());
                    }
                    fieldValue = parseRecord(fd, childRecordBuilder, isLittleEndian);
                    break;
                }
                case SET:
                    // Data layout for SETS & DATASETS are similar. Exception is SETS have a preceding unused byte.
                    // After getting past this byte a SET can be read with the same code used for DATASETS
                    this.inputStream.skip(1);
                case DATASET:
                {
                    if (fd.getNumDefs() != 1)
                    {
                        throw new UnparsableContentException("Set should have a single child type." + fd.getNumDefs() + " child types found.");
                    }

                    int dataLen = (int) getInt(4, isLittleEndian);
                    if (dataLen > this.inputStream.available())
                    {
                        throw new UnparsableContentException("Set ended early " + dataLen);
                    }

                    int childCountGuess = 1;
                    if (fd.getDataLen() > 0)
                    {
                        childCountGuess = dataLen / (int) fd.getDataLen();
                    }

                    FieldDef childFd = fd.getDef(0);
                    ArrayList<Object> ws = new ArrayList<Object>(childCountGuess);
                    switch (childFd.getFieldType())
                    {
                        case INTEGER:
                        case REAL:
                        case DECIMAL:
                        case BINARY:
                        case BOOLEAN:
                        case STRING:
                        case CHAR:
                        case VAR_STRING:
                        {
                            long setEndPos = this.inputStream.getStreamPosition() + dataLen;
                            while (this.inputStream.getStreamPosition() < setEndPos)
                            {
                                ws.add(parseFlatField(childFd, isLittleEndian));
                            }
                            break;
                        }
                        case RECORD:
                        {
                            IRecordBuilder childRecordBuilder = recordBuilder.getChildRecordBuilder(fieldIndex);
                            if (childRecordBuilder == null)
                            {
                                throw new UnparsableContentException("Recieved null child IRecordBulder for field:" + fd.getFieldName());
                            }

                            long setEndPos = this.inputStream.getStreamPosition() + dataLen;
                            while (this.inputStream.getStreamPosition() < setEndPos)
                            {
                                ws.add(parseRecord(childFd, childRecordBuilder, isLittleEndian));
                            }
                            break;
                        }
                        default:
                            String msg = "Dataset unhandled child type: " + childFd.getFieldType();
                            throw new UnparsableContentException(msg);
                    }

                    fieldValue = ws;
                    break;
                }
                default:
                    String msg = "Unhandled type: " + fd.getFieldType();
                    throw new UnparsableContentException(msg);
            }

            try
            {
                recordBuilder.setFieldValue(fieldIndex, fieldValue);
            }
            catch (Exception e)
            {
                throw new UnparsableContentException("Unable to set field value for field: " + fd.getFieldName() + " with error: " + e.getMessage());
            }
        }
        try
        {
            return recordBuilder.finalizeRecord();
        }
        catch (Exception e)
        {
            throw new UnparsableContentException("Unable to finalize record with error: " + e.getMessage());
        }
    }

    /**
     * Get an integer from the byte array
     * 
     * @param b
     *            the byte array from the HPCC THOR node
     * @param pos
     *            the position in the array
     * @param len
     *            the length, 1 to 8 bytes
     * @param little_endian
     *            true if the value is little endian
     * @return the integer extracted as a long
     */
    private long getInt(int len, boolean little_endian) throws IOException
    {
        long v = getUnsigned(len, little_endian);

        // Make the value negative if it should have been by extending sign bit
        long negMask = (0x80 << (len - 1) * 8);
        if ((v & negMask) != 0)
        {
            for (int i = len; i < 8; i++)
            {
                v |= (0xffL << (i * 8));
            }
        }

        return v;
    }

    /**
     * Get an unsigned int from the byte array
     * 
     * @param b
     *            the byte array from the HPCC THOR node
     * @param pos
     *            the position in the array
     * @param len
     *            the length, 1 to 8 bytes
     * @param little_endian
     *            true if the value is little endian
     * @return the integer extracted as a long
     */
    private long getUnsigned(int len, boolean little_endian) throws IOException
    {
        this.inputStream.read(this.scratchBuffer, 0, len);
        long v = 0;
        for (int i = 0; i < len; i++)
        {
            v = (v << 8) | (((long) (this.scratchBuffer[((little_endian) ? len - 1 - i : i)] & 0xff)));
        }
        return v;
    }

    /**
     * Get a real from the byte array
     * 
     * @param b
     *            the byte array of data from the THOR node
     * @param pos
     *            the position in the array
     * @param len
     *            the length, 4 or 8
     * @param little_endian
     *            true if the value is little endian
     * @return the extracted real as a double
     */
    private double getReal(int len, boolean little_endian) throws IOException
    {
        this.inputStream.read(this.scratchBuffer, 0, len);
        double u = 0;
        if (len == 4)
        {
            int u4 = 0;
            for (int i = 0; i < 4; i++)
            {
                u4 = (u4 << 8) | (((int) (this.scratchBuffer[((little_endian) ? len - 1 - i : i)] & 0xff)));
            }
            u = Float.intBitsToFloat(u4);
        }
        else if (len == 8)
        {
            long u8 = 0;
            for (int i = 0; i < 8; i++)
            {
                u8 = (u8 << 8) | (((long) (this.scratchBuffer[((little_endian) ? len - 1 - i : i)] & 0xff)));
            }
            u = Double.longBitsToDouble(u8);
        }
        return u;
    }

    /**
     * Get a unsigned decimal from the byte array
     * 
     * @param b
     *            the byte array of data from the THOR node
     * @param pos
     *            the position in the array
     * @param len
     *            packed field of numDigits in upper half and precision in lower half
     * @return BigDecimal
     */
    private BigDecimal getUnsignedDecimal(int numDigits, int precision, int dataLen) throws IOException
    {
        this.inputStream.read(this.scratchBuffer, 0, dataLen);
        BigDecimal ret = new BigDecimal(0);

        int idx = 0;
        int curDigit = numDigits - 1;

        while (idx < dataLen)
        {
            long value = 0;

            // We can consume 16 digits / 8 bytes at a time without overflowing.
            int numToConsume = 8;
            if ((idx + numToConsume) > dataLen)
            {
                numToConsume = dataLen - idx;
            }

            for (int j = 0; j < numToConsume; j++, idx++)
            {
                value += powTable[15 - (j * 2 + 0)] * ((this.scratchBuffer[idx] >> 4) & 0x0f);
                value += powTable[15 - (j * 2 + 1)] * (this.scratchBuffer[idx] & 0x0f);
            }

            int scale = (curDigit - precision) - 15;
            ret = ret.add(new BigDecimal(BigInteger.valueOf(value), -scale, MathContext.UNLIMITED));
            curDigit -= numToConsume * 2;
        }

        return ret;
    }

    /**
     * Get a decimal from the byte array
     * 
     * @param b
     *            the byte array of data from the THOR node
     * @param pos
     *            the position in the array
     * @param len
     *            packed field of numDigits in upper half and precision in lower half
     * @return BigDecimal
     */
    private BigDecimal getSignedDecimal(int numDigits, int precision, int dataLen) throws IOException
    {
        this.inputStream.read(this.scratchBuffer, 0, dataLen);

        final int zeroDigit = 32;
        int lsb = zeroDigit - precision;
        int msb = lsb + numDigits;

        byte lastByte = this.scratchBuffer[dataLen - 1];
        long signMul = 1;
        if (signMap[lastByte & 0x0f] == -1)
        {
            signMul = -1;
        }

        int idx = 0;
        int curDigit = numDigits;

        // Read value from last byte. Lower nibble contains sign ignore it
        long value = (lastByte >> 4) & 0x0f;
        value *= signMul;
        BigDecimal ret = new BigDecimal(BigInteger.valueOf(value), precision, MathContext.UNLIMITED);

        // If the # of digits is odd the last byte only contains the sign
        if (numDigits % 2 == 1)
        {
            curDigit--;
        }

        // If the most significant byte == max int digits then only
        // the lower nibble is used
        if (msb == 32)
        {
            value = powTable[15] * this.scratchBuffer[idx] & 0xf;
            value *= signMul;

            int scale = (curDigit - precision) - 15;
            ret = ret.add(new BigDecimal(BigInteger.valueOf(value), -scale, MathContext.UNLIMITED));

            idx++;
            curDigit--;
        }

        while (idx < dataLen - 1)
        {
            value = 0;

            // We can consume 16 digits / 8 bytes at a time without overflowing.
            int numToConsume = 8;
            if ((idx + numToConsume) > dataLen - 1)
            {
                numToConsume = (dataLen - 1) - idx;
            }

            for (int j = 0; j < numToConsume; j++, idx++)
            {
                value += powTable[15 - (j * 2 + 0)] * ((this.scratchBuffer[idx] >> 4) & 0x0f);
                value += powTable[15 - (j * 2 + 1)] * (this.scratchBuffer[idx] & 0x0f);
            }

            value *= signMul;
            int scale = (curDigit - precision) - 15;
            BigDecimal decVal = new BigDecimal(BigInteger.valueOf(value), -scale, MathContext.UNLIMITED);
            ret = ret.add(decVal);

            curDigit -= numToConsume * 2;
        }

        return ret;
    }

    private String getNullTerminatedString(HpccSrcType stype) throws IOException
    {
        Charset charset = sbcSet;
        switch (stype)
        {

            case SINGLE_BYTE_CHAR:
                charset = sbcSet;
                break;
            case UTF16BE:
                charset = utf16beSet;
                break;
            case UTF16LE:
                charset = utf16leSet;
                break;
            default:
                throw new IOException("Unsupported source type for null terminated string: " + stype);
        }

        // Note: separate for loops because consuming 2 bytes at a
        // time makes null check easier. Do not have to check for alignment etc
        if (stype.isUTF16())
        {
            int remainingData = this.inputStream.available();
            for (int i = 0; i < remainingData - 1;)
            {
                int readSize = remainingData - 1 - i;
                if (readSize > scratchBuffer.length)
                {
                    readSize = scratchBuffer.length;
                }

                this.inputStream.mark(readSize);
                this.inputStream.read(scratchBuffer, 0, readSize);

                int eosLocation = -1;
                for (int j = 0; j < readSize; j += 2, i += 2)
                {
                    if (scratchBuffer[j] == '\0' && scratchBuffer[j + 1] == '\0')
                    {
                        eosLocation = i;
                        break;
                    }
                }

                int bytesRemainingInBuilder = scratchStrBuilder.capacity() - scratchStrBuilder.length();
                if (bytesRemainingInBuilder < eosLocation)
                {
                    scratchStrBuilder.ensureCapacity(scratchStrBuilder.capacity() + 8192);
                }

                if (eosLocation != -1)
                {
                    scratchStrBuilder.append(new String(scratchBuffer, 0, eosLocation, charset));

                    // Reset back to our mark and the skip forward so we don't consume bytes 
                    // passed the end of the string
                    this.inputStream.reset();
                    this.inputStream.skip(eosLocation + 2);

                    break;
                }
                else
                {
                    scratchStrBuilder.append(new String(scratchBuffer, 0, readSize, charset));
                }
            }
        }
        else
        {
            int remainingData = this.inputStream.available();
            for (int i = 0; i < remainingData - 1;)
            {
                int readSize = remainingData - i;
                if (readSize > scratchBuffer.length)
                {
                    readSize = scratchBuffer.length;
                }

                this.inputStream.mark(readSize);
                this.inputStream.read(scratchBuffer, 0, readSize);

                int eosLocation = -1;
                for (int j = 0; j < readSize; j++, i++)
                {
                    if (scratchBuffer[j] == '\0')
                    {
                        eosLocation = i;
                        break;
                    }
                }

                int bytesRemainingInBuilder = scratchStrBuilder.capacity() - scratchStrBuilder.length();
                if (bytesRemainingInBuilder < eosLocation)
                {
                    scratchStrBuilder.ensureCapacity(scratchStrBuilder.capacity() + 8192);
                }

                if (eosLocation != -1)
                {
                    scratchStrBuilder.append(new String(scratchBuffer, 0, eosLocation, charset));

                    // Reset back to our mark and the skip forward so we don't consume bytes 
                    // passed the end of the string
                    this.inputStream.reset();
                    this.inputStream.skip(eosLocation + 1);

                    break;
                }
                else
                {
                    scratchStrBuilder.append(new String(scratchBuffer, 0, readSize, charset));
                }
            }
        }

        String ret = scratchStrBuilder.toString();
        scratchStrBuilder.setLength(0);
        return ret;
    }

    /**
     * Extract a string from the byte array
     * 
     * @param styp
     *            the source type in the byte array
     * @param b
     *            the byte array from the THOR node
     * @param pos
     *            the position in the array
     * @param len
     *            the number of bytes
     * @return the extracted string
     */
    private String getString(HpccSrcType styp, int codePoints) throws IOException
    {

        Charset charset = utf8Set;
        switch (styp)
        {
            case UTF8:
                charset = utf8Set;
                break;
            case SINGLE_BYTE_CHAR:
                charset = sbcSet;
                break;
            case UTF16BE:
                charset = utf16beSet;
                break;
            case UTF16LE:
                charset = utf16leSet;
                break;
            case QSTRING:
                charset = sbcSet;
                break;
            default:
                throw new IOException("Unknown source type");
        }

        scratchStrBuilder.ensureCapacity(codePoints * 2);
        switch (styp)
        {
            case UTF8:
            {
                int remainingCodePoints = codePoints;
                while (remainingCodePoints > 0)
                {

                    // Remaining code points isn't equal to the number of bytes, but it is conservative
                    // so we won't go try and read past the end of the string
                    int bytesToRead = remainingCodePoints;
                    if (bytesToRead > SCRATCH_BUFFER_SIZE)
                    {
                        bytesToRead = SCRATCH_BUFFER_SIZE;
                    }

                    int bytesActuallyRead = this.inputStream.read(this.scratchBuffer, 0, bytesToRead);
                    if (bytesActuallyRead != bytesToRead)
                    {
                        throw new IOException("InputStream ended unexpectedly");
                    }

                    // loop over bytes read and count codepoints.
                    int bytesScanned = 0;
                    for (; bytesScanned < bytesToRead;)
                    {
                        if ((this.scratchBuffer[bytesScanned] & 0x80) == 0)
                            bytesScanned++;
                        else if ((this.scratchBuffer[bytesScanned] & 0xE0) == 0xC0)
                            bytesScanned += 2;
                        else if ((this.scratchBuffer[bytesScanned] & 0xF0) == 0xE0)
                            bytesScanned += 3;
                        else if ((this.scratchBuffer[bytesScanned] & 0xF8) == 0xF0)
                            bytesScanned += 4;
                        else
                            throw new IOException("Illegal UTF-8 sequence");

                        remainingCodePoints--;
                    }

                    int bytesInBuffer = bytesScanned;
                    if (bytesScanned > bytesToRead)
                    {
                        bytesInBuffer = bytesToRead;
                    }
                    scratchStrBuilder.append(new String(this.scratchBuffer, 0, bytesInBuffer, charset));

                    // Need to handle misaligned codepoints at the end.
                    // IE first byte is in the buffer but the last 3 arent.
                    int misalignedBytes = bytesScanned - bytesToRead;
                    if (misalignedBytes > 0)
                    {
                        bytesActuallyRead = this.inputStream.read(this.scratchBuffer, 0, misalignedBytes);
                        if (bytesActuallyRead != bytesToRead)
                        {
                            throw new IOException("InputStream ended unexpectedly");
                        }
                        scratchStrBuilder.append(new String(this.scratchBuffer, 0, misalignedBytes, charset));
                    }
                }
                break;
            }
            case SINGLE_BYTE_CHAR:
            case UTF16BE:
            case UTF16LE:
            {
                int remainingBytesToRead = getLenFromCodePoints(styp, codePoints);
                if (remainingBytesToRead > this.inputStream.available())
                {
                    throw new IOException("String data ended early");
                }

                while (remainingBytesToRead > 0)
                {
                    int readSize = remainingBytesToRead;
                    if (readSize > SCRATCH_BUFFER_SIZE)
                    {
                        readSize = SCRATCH_BUFFER_SIZE;
                    }

                    this.inputStream.read(this.scratchBuffer, 0, readSize);

                    scratchStrBuilder.append(new String(this.scratchBuffer, 0, readSize, charset));
                    remainingBytesToRead -= readSize;
                }
                break;
            }
            case QSTRING:
            {
                int len = getLenFromCodePoints(styp, codePoints);
                if (len > this.inputStream.available())
                {
                    throw new IOException("String data ended early");
                }

                int expandedLen = (len * 4) / 3;
                int bytesConsumed = 0;
                while (bytesConsumed < expandedLen)
                {
                    // Use the first half of the scratch buffer as a place to read in bytes
                    // from the IOStream. The second half will be used to construct the expanded
                    // string

                    int bytesToExpand = expandedLen;
                    int halfScratchBufferSize = SCRATCH_BUFFER_SIZE / 2;
                    if (bytesToExpand > halfScratchBufferSize)
                    {
                        bytesToExpand = halfScratchBufferSize;
                    }

                    int compressedBytes = ((bytesToExpand + 1) * 3) / 4;
                    this.inputStream.read(this.scratchBuffer, 0, compressedBytes);

                    int pos = 0;
                    int writePos = 0;
                    for (; writePos < (bytesToExpand - 3); writePos += 4, pos += 3)
                    {
                        int b0 = this.scratchBuffer[pos] & 0xff;
                        int b1 = this.scratchBuffer[pos + 1] & 0xff;
                        int b2 = this.scratchBuffer[pos + 2] & 0xff;

                        scratchBuffer[halfScratchBufferSize + writePos + 0] = (byte) (' ' + (b0 >> 2));
                        scratchBuffer[halfScratchBufferSize + writePos + 1] = (byte) (' ' + ((b0 & 0x3) << 4 | (b1 >> 4)));
                        scratchBuffer[halfScratchBufferSize + writePos + 2] = (byte) (' ' + ((b1 & 0xf) << 2 | (b2 >> 6)));
                        scratchBuffer[halfScratchBufferSize + writePos + 3] = (byte) (' ' + (b2 & 0x3f));
                    }

                    switch (bytesToExpand % 4)
                    {
                        case 3:
                        {
                            int b1 = this.scratchBuffer[pos + 1] & 0xff;
                            int b2 = this.scratchBuffer[pos + 2] & 0xff;
                            scratchBuffer[halfScratchBufferSize + writePos + 2] = (byte) (' ' + ((b1 & 0xf) << 2 | (b2 >> 6)));
                            writePos++;
                            // fallthrough
                        }
                        case 2:
                        {
                            int b0 = this.scratchBuffer[pos] & 0xff;
                            int b1 = this.scratchBuffer[pos + 1] & 0xff;
                            scratchBuffer[halfScratchBufferSize + writePos + 1] = (byte) (' ' + ((b0 & 0x3) << 4 | (b1 >> 4)));
                            writePos++;
                            // fallthrough
                        }
                        case 1:
                        {
                            int b0 = this.scratchBuffer[pos] & 0xff;
                            scratchBuffer[halfScratchBufferSize + writePos + 0] = (byte) (' ' + (b0 >> 2));
                            writePos++;
                            break;
                        }
                        case 0:
                            break;
                    }

                    bytesConsumed += bytesToExpand;
                    scratchStrBuilder.append(new String(scratchBuffer, halfScratchBufferSize, bytesToExpand, sbcSet));
                }
                break;
            }
            default:
                throw new IOException("Unknown source type");
        }

        String ret = scratchStrBuilder.toString();
        scratchStrBuilder.setLength(0);
        return ret;
    }

    /**
     * Get the number of code units (number of bytes) used to encode cp coded characters.
     * 
     * @param styp
     *            the source data type
     * @param cp
     *            the number of code points.
     * @return the number of bytes
     * @throws UnparsableContentException
     *             when the end of the buffer was reach unexpected or the stream of data was incorrect, such as an
     *             illegal byte sequence for UTF8.
     */
    private int getLenFromCodePoints(HpccSrcType styp, int cp) throws IOException
    {
        int bytes = 0;
        switch (styp)
        {
            case UTF8:
                throw new IOException("BinaryRecordReader: getCodeUnits does not support scanning utf8 strings.");
            case QSTRING:
                bytes = ((cp + 1) * 3) / 4;
                break;
            case SINGLE_BYTE_CHAR:
                bytes = cp;
                break;
            case UTF16BE:
                if ((cp * 2) > this.inputStream.available())
                {
                    throw new IOException("Early end of data");
                }
                bytes = cp * 2;
                // work = (int) getInt(b, pos + ((cp - 1) * 2), 2, false);
                // // check the last character to make sure it is not a truncated pair
                // if (Character.isHighSurrogate((char) work))
                // { // truncated pair to fix?
                //     b[pos + ((cp - 1) * 2)] = 0;
                //     b[pos + ((cp - 1) * 2) + 1] = 0x20; // make this a blank
                // }
                break;
            case UTF16LE:
                if ((cp * 2) > this.inputStream.available())
                {
                    throw new IOException("Early end of data");
                }
                bytes = cp * 2;

                // work = (int) getInt(b, pos + ((cp - 1) * 2), 2, true);
                // // check the last character to make sure it is not a truncated pair
                // if (Character.isHighSurrogate((char) work))
                // { // truncated pair to fix?
                //     b[pos + ((cp - 1) * 2)] = 0x20;
                //     b[pos + ((cp - 1) * 2) + 1] = 0; // make this a blank
                // }
                break;
            default:
                throw new IOException("Unknown data source type for a string of: " + styp.toString());
        }
        return bytes;
    }
}
