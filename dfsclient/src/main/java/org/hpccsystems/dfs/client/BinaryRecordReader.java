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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.errors.UnparsableContentException;
import org.hpccsystems.commons.utils.Utils;

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
 * Deserializes data from the provided InputStream and constructs records via the provided IRecordBuilder.
 *
 * Data in the InputStream is expected to be in the HPCC Systems binary record format.
 */
public class BinaryRecordReader implements IRecordReader
{
    protected IRecordBuilder     rootRecordBuilder;
    private CountingInputStream  inputStream;
    private FieldDef             rootRecordDefinition;
    protected boolean            defaultLE;
    private long                 streamPosAfterLastRecord = 0;
    private boolean              isIndex = false;
    private boolean              useDecimalForUnsigned8 = false;

    public static final int      NO_STRING_PROCESSING = 0;
    public static final int      TRIM_STRINGS = 1;
    public static final int      TRIM_FIXED_LEN_STRINGS = 2;
    public static final int      CONVERT_EMPTY_STRINGS_TO_NULL = 4;

    private boolean              shouldTrimFixedLenStrings = false;
    private boolean              shouldTrimStrings = false;
    private boolean              convertEmptyStringsToNull = false;

    private byte[]               scratchBuffer = new byte[BUFFER_GROW_SIZE];

    private static final Charset sbcSet              = Charset.forName("ISO-8859-1");
    private static final Charset utf8Set             = Charset.forName("UTF-8");
    private static final Charset utf16beSet          = Charset.forName("UTF-16BE");
    private static final Charset utf16leSet          = Charset.forName("UTF-16LE");
    private static final Logger  log                 = LogManager.getLogger(BinaryRecordReader.class);


    // Used when reading decimal values
    private static final long[]  powTable            = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L,
                                                         100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L };
    private static final int[]   signMap             = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, +1, -1, +1, -1, +1, +1 };

    private static final int     MASK_32_LOWER_HALF  = 0xffff;
    private static final int     BUFFER_GROW_SIZE    = 8192;
    private static final int     OPTIMIZED_STRING_READ_AHEAD = 32;

    // Max java UTF16 string length
    private static final int     MAX_STRING_LENGTH = 1073741823;

    // DO NOT CHANGE THESE VALUES. HERE FOR CODE READABILITY ONLY
    private static final int     QSTR_COMPRESSED_CHUNK_LEN = 3;
    private static final int     QSTR_EXPANDED_CHUNK_LEN   = 4;

    private StreamOperationMessages  messages = new StreamOperationMessages();

    public String getStreamMessages()
    {
        return messages.getMessagesSummary();
    }

    public int getStreamMessageCount()
    {
        return messages.getTotalMessageCount();
    }

    public long getStreamPosAfterLastRecord()
    {
        return this.streamPosAfterLastRecord;
    }

    public BinaryRecordReader(InputStream is) throws Exception
    {
        this(is,0);
    }

    /**
     * A Binary record reader.
     *
     * @param is the input stream
     * @param streamPos the position in the stream to start reading at
     * @throws Exception
     *             the exception
     */
    public BinaryRecordReader(InputStream is, long streamPos) throws Exception
    {
        if (streamPos < 0)
        {
            throw new Exception("BinaryRecordReader: invalid initial streamPos provided: " + streamPos);
        }

        this.inputStream = new CountingInputStream(is);
        this.inputStream.streamPos = streamPos;
        this.defaultLE = true;

        if (this.inputStream.markSupported() == false)
        {
            throw new Exception("BinaryRecordReader requires provided InputStream to support mark()");
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.dfs.client.IRecordReader#initialize(org.hpccsystems.dfs.client.IRecordBuilder)
     */
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

    /**
     * Determines if unsigned 8 values should be parsed into BigDecimals to avoid long overflow.
     *
     * @param useDecimal use decimal
     */
    public void setUseDecimalForUnsigned8(boolean useDecimal)
    {
        useDecimalForUnsigned8 = useDecimal;
    }

    /**
     * Returns whether unsigned 8 values are parsed into BigDecimals to avoid long overflow.
     *
     * @return use decimal
     */
    public boolean getUseDecimalForUnsigned8()
    {
        return useDecimalForUnsigned8;
    }

    /**
     * Should be set if this record reader is reading an index file.
     *
     * @param isIdx Is this an index file?
     */
    public void setIsIndex(boolean isIdx)
    {
        this.isIndex = isIdx;
    }

    /**
     * Set string processing flags.
     *
     * @param flags string processing flags
     */
    public void setStringProcessingFlags(int flags)
    {
        shouldTrimStrings = (flags & TRIM_STRINGS) != 0;
        shouldTrimFixedLenStrings = (flags & TRIM_FIXED_LEN_STRINGS) != 0;
        convertEmptyStringsToNull = (flags & CONVERT_EMPTY_STRINGS_TO_NULL) != 0;
    }

    /**
     * Get string processing flags.
     * 
     * @return string processing flags
     */
    public int getStringProcessingFlags()
    {
        int flags = 0;
        if (shouldTrimStrings) flags |= TRIM_STRINGS;
        if (shouldTrimFixedLenStrings) flags |= TRIM_FIXED_LEN_STRINGS;
        if (convertEmptyStringsToNull) flags |= CONVERT_EMPTY_STRINGS_TO_NULL;
        return flags;
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
            throw new HpccFileException("BinaryRecordReader.hasNext(): RecordReader must be initialized before being used. rootRecordBuilder is null, hasNext() failed.");
        }

        int nextByte = -1;
        try
        {
            if (this.inputStream.available() > 0)
            {
                return true;
            }
        }
        catch (IOException e)
        {
            // Available may throw an IOException if no data is available and the stream is closed
            // This shouldn't be treated as an error, but an indication of EOS
            return false;
        }

        try
        {
            // Peek the next byte to see if there is remaining data. If -1 we reached EOS
            // Read limit is arbitrary we will only be reading one byte
            this.inputStream.mark(2);
            nextByte = this.inputStream.read();
            this.inputStream.reset();
        }
        catch (IOException e)
        {
            throw new HpccFileException("BinaryRecordReader.hasNext(): failed to peek at the next byte in the input stream:" + e.getMessage(),e);
        }

        return nextByte >= 0;
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
            throw new HpccFileException("BinaryRecordReader.getNext(): RecordReader must be initialized before being used, rootRecordBuilder is null.");
        }

        if (!this.hasNext()) throw new NoSuchElementException("No next record!");

        Object record = null;
        try
        {
            record = parseRecord(this.rootRecordDefinition, this.rootRecordBuilder, this.defaultLE);
            if (record == null)
            {
                throw new HpccFileException("BinaryRecordReader.getNext(): RecordContent not found, or invalid record structure. Check logs for more information.");
            }

        }
        catch (Exception e)
        {
            throw new HpccFileException("BinaryRecordReader.getNext(): Failed to parse next record: " + e.getMessage(), e);
        }

        this.streamPosAfterLastRecord = this.inputStream.getStreamPosition();
        return record;
    }

    /**
     * Returns the number of bytes available to read immediately.
     *
     * @return the available
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public int getAvailable() throws IOException
    {
        return this.inputStream.available();
    }

    /**
     * Parse a non-hierarchical field.
     *
     * @param fd
     *            the fd
     * @param isLittleEndian
     *            the is little endian
     * @return ParsedFieldResult
     * @throws UnparsableContentException
     *             the unparsable content exception
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private Object parseFlatField(FieldDef fd, boolean isLittleEndian) throws UnparsableContentException, IOException
    {
        Object fieldValue = null;
        int dataLen = 0;

        if (fd.isFixed() && fd.getDataLen() > Integer.MAX_VALUE)
        {
            throw new UnparsableContentException("BinaryRecordReader.parseFlatField(): Data length: " + fd.getDataLen() + " exceeds max supported length: " + Integer.MAX_VALUE);
        }

        // Embedded field lengths are little endian
        switch (fd.getFieldType())
        {
            case FILEPOS:
            case INTEGER:
                // fixed number of bytes in type info
                long intValue = 0;
                if (fd.isUnsigned())
                {
                    intValue = getUnsigned((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                    if (useDecimalForUnsigned8 && fd.getDataLen() == 8)
                    {
                        BigInteger bi = Utils.extractUnsigned8Val(intValue);
                        fieldValue = new BigDecimal(bi);
                    }
                    else
                    {
                        fieldValue = Long.valueOf(intValue);
                        if (intValue < 0)
                        {
                            messages.addMessage("Warning: Possible unsigned overflow in column: '" + fd.getFieldName()
                                            + "'. Convert values to BigInteger via org.hpccsystems.commons.utils.extractUnsigned8 if necessary, "
                                            + " or call BinaryRecordReader.setUseDecimalForUnsigned8() before reading to convert unsigned8 values to BigDecimal values.");
                        }
                    }
                }
                else
                {
                    intValue = getInt((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                    fieldValue = Long.valueOf(intValue);
                }
                break;
            case REAL:
                // fixed number of bytes (4 or 8) in type info
                double u = getReal((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                fieldValue = Double.valueOf(u);
                break;
            case DECIMAL:
                BigDecimal decValue = null;

                dataLen = (int) fd.getDataLen();
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

                byte[] bytes = new byte[dataLen];

                int bytesConsumed = 0;
                while (bytesConsumed < dataLen)
                {
                    int bytesRead = this.inputStream.read(bytes,bytesConsumed,dataLen-bytesConsumed);
                    if (bytesRead < 0)
                    {
                        IOException e = new IOException("Error, Unexpected EOS while constructing binary value.");
                        throw e;
                    }

                    bytesConsumed += bytesRead;
                }

                fieldValue = bytes;
                break;
            case BOOLEAN:
                // fixed length for each boolean value specified by type def
                long value = getInt((int) fd.getDataLen(), fd.getSourceType() == HpccSrcType.LITTLE_ENDIAN);
                fieldValue = Boolean.valueOf(value != 0);
                break;
            case CHAR:
                fieldValue = getString(fd.getSourceType(), 1, false);
                break;
            case STRING:
            {
                boolean shouldTrim = shouldTrimStrings;
                int codePoints = 0;
                if (fd.isFixed())
                {
                    if (fd.getDataLen() > Integer.MAX_VALUE)
                    {
                        throw new UnparsableContentException(
                                "Data length: " + fd.getDataLen() + " exceeds max supported length: " + Integer.MAX_VALUE);
                    }

                    codePoints = (int) fd.getDataLen();

                    shouldTrim = shouldTrim || shouldTrimFixedLenStrings;
                }
                else
                {
                    codePoints = ((int) getInt(4, isLittleEndian));
                }

                if (codePoints > MAX_STRING_LENGTH)
                {
                    throw new UnparsableContentException("String length exceeds maximum supported length: " + MAX_STRING_LENGTH);
                }

                fieldValue = getString(fd.getSourceType(), codePoints, shouldTrim);
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

                    boolean shouldTrim = shouldTrimStrings || shouldTrimFixedLenStrings;

                    int codePoints = (int) fd.getDataLen();
                    String strValue = getString(fd.getSourceType(), codePoints, shouldTrim);

                    // Unicode uses two byte nulls
                    if (fd.getSourceType().isUTF16())
                    {
                        this.inputStream.skip(2);
                    }
                    else
                    {
                        this.inputStream.skip(1);
                    }
                    fieldValue = strValue;
                }
                else
                {
                    boolean shouldTrim = shouldTrimStrings;
                    try
                    {
                        fieldValue = getNullTerminatedString(fd.getSourceType(), shouldTrim);
                    }
                    catch (IOException e)
                    {
                        throw new UnparsableContentException("Parsing VAR_STRING: " + fd.getFieldName() + " failed with error: " + e.getMessage(), e);
                    }
                }
                break;
            }
            default:
                throw new UnparsableContentException("Unexpected type: " + fd.getFieldType() + " for field: " + fd.getFieldName());
        }

        return fieldValue;
    }

    /**
     * Parse a record.
     *
     * @param recordDef
     *            the field definition for the Record definition
     * @param recordBuilder
     *            the record builder to use to construct the record
     * @param isLittleEndian
     *            the is little endian
     * @return ParsedFieldResult
     * @throws UnparsableContentException
     *             the unparsable content exception
     * @throws IOException
     *             Signals that an I/O exception has occurred.
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
            if (fd.isBlob())
            {
                // If we encounter a blob field, we only have access to the blob file location
                // So read that location and construct a default value field
                long blobFileLoc = (long) getUnsigned(8, true);
                try
                {
                    switch (fd.getFieldType())
                    {
                        case BINARY:
                            recordBuilder.setFieldValue(fieldIndex, new byte[0]);
                            continue;
                        case STRING:
                        case VAR_STRING:
                            recordBuilder.setFieldValue(fieldIndex, "");
                            continue;
                        case SET:
                        case DATASET:
                            recordBuilder.setFieldValue(fieldIndex, new ArrayList<Object>());
                            continue;
                        default:
                            throw new UnparsableContentException("Unexpected blob type: " + fd.getFieldType() + " for field: " + fd.getFieldName());
                    }
                }
                catch (IllegalAccessException e)
                {
                    throw new UnparsableContentException("Unable to set field value for field: " + fd.getFieldName() + " with error: " + e.getMessage());
                }
            }

            Object fieldValue = null;
            switch (fd.getFieldType())
            {
                case INTEGER:
                case FILEPOS:
                case REAL:
                case DECIMAL:
                case BINARY:
                case BOOLEAN:
                case STRING:
                case CHAR:
                case VAR_STRING:
                    try
                    {
                        fieldValue = parseFlatField(fd, isLittleEndian);
                    }
                    catch(Exception e)
                    {
                        throw new IOException("Error while parsing field: " + fd.getFieldName() + " of type: " + fd.getFieldType() + ": ", e);
                    }
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
                        case FILEPOS:
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
                                try
                                {
                                    ws.add(parseFlatField(childFd, isLittleEndian));
                                }
                                catch(Exception e)
                                {
                                    throw new IOException("Error while parsing field: " + fd.getFieldName() + " of type: " + fd.getFieldType() + ": ", e);
                                }
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

    private void ensureScratchBufferCapacity(int requiredCapacity)
    {
        if (this.scratchBuffer.length < requiredCapacity)
        {
            this.scratchBuffer = Arrays.copyOf(this.scratchBuffer, requiredCapacity + BUFFER_GROW_SIZE);
        }
    }

    private void readIntoScratchBuffer(int offset, int dataLen) throws IOException
    {
        int requiredCapacity = offset + dataLen;
        ensureScratchBufferCapacity(requiredCapacity);

        int position = offset;
        int bytesConsumed = 0;
        while (bytesConsumed < dataLen)
        {
            int bytesRead = this.inputStream.read(this.scratchBuffer, position, dataLen-bytesConsumed);
            if (bytesRead < 0)
            {
                IOException e = new IOException("Unexpected end of stream: dataLen: " + dataLen + " bytesConsumed: " + bytesConsumed + " streamPos: " + this.inputStream.streamPos);
                e.printStackTrace();
                throw e;
            }

            position += bytesRead;
            bytesConsumed += bytesRead;
        }
    }

    /**
     * Get an integer from the byte array.
     *
     * @param len
     *            the length, 1 to 8 bytes
     * @param little_endian
     *            true if the value is little endian
     * @return the integer extracted as a long
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private long getInt(int len, boolean little_endian) throws IOException
    {
        long v = getUnsigned(len, little_endian);

        // Make the value negative if it should have been by extending sign bit
        long negMask = (0x80L << (len - 1) * 8);
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
     * Get an unsigned int from the byte array.
     *
     * @param len
     *            the length, 1 to 8 bytes
     * @param little_endian
     *            true if the value is little endian
     * @return the integer extracted as a long
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private long getUnsigned(int len, boolean little_endian) throws IOException
    {
        readIntoScratchBuffer(0, len);
        long v = 0;
        for (int i = 0; i < len; i++)
        {
            int idx = ((little_endian) ? len - 1 - i : i);
            v = (v << 8) | (((long) (this.scratchBuffer[idx] & 0xff)));
        }
        return v;
    }

    /**
     * Get a real from the byte array.
     *
     * @param len
     *            the length, 4 or 8
     * @param little_endian
     *            true if the value is little endian
     * @return the extracted real as a double
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private double getReal(int len, boolean little_endian) throws IOException
    {
        readIntoScratchBuffer(0, len);

        double u = 0;
        if (len == 4)
        {
            int u4 = 0;
            for (int i = 0; i < 4; i++)
            {
                int idx = ((little_endian) ? len - 1 - i : i);
                u4 = (u4 << 8) | (((int) (this.scratchBuffer[idx] & 0xff)));
            }
            u = Float.intBitsToFloat(u4);
        }
        else if (len == 8)
        {
            long u8 = 0;
            for (int i = 0; i < 8; i++)
            {
                int idx = ((little_endian) ? len - 1 - i : i);
                u8 = (u8 << 8) | (((long) (this.scratchBuffer[idx] & 0xff)));
            }
            u = Double.longBitsToDouble(u8);
        }
        return u;
    }

    /**
     * Get a unsigned decimal from the byte array.
     *
     * @param numDigits
     *            the num digits
     * @param precision
     *            the precision
     * @param dataLen
     *            the data len
     * @return BigDecimal
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private BigDecimal getUnsignedDecimal(int numDigits, int precision, int dataLen) throws IOException
    {
        readIntoScratchBuffer(0, dataLen);

        BigDecimal ret = new BigDecimal(0);

        int idx = 0;
        int curDigit = numDigits;

        // If the # of digits is odd the top most nibble is unused and we don't want to include it
        // in the scale calculations below. Due to how the scale calculation works below this means
        // we decrement the starting value of curDigit in the case of even length decimals
        if ((numDigits % 2) == 0)
        {
            curDigit--;
        }

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
     * Get a decimal from the byte array.
     *
     * @param numDigits
     *            the num digits
     * @param precision
     *            the precision
     * @param dataLen
     *            the data len
     * @return BigDecimal
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private BigDecimal getSignedDecimal(int numDigits, int precision, int dataLen) throws IOException
    {
        readIntoScratchBuffer(0, dataLen);

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

    /**
     * Trims the string within the scratch buffer by modifying the provided string range
     *
     * @param isUnicode is the string unicode
     * @param range array with starting and ending byte of string within the scratch buffer
    */
    private void trimStringInScratchBuffer(boolean isUnicode, int[] range)
    {
        if (isUnicode)
        {
            while (range[0] < range[1] - 1)
            {
                // Need to create a 16bit codepoint from two signed bytes. Mask with 0xFF to get unsigned values,
                // shift upper byte by 8 and OR with lower byte to get the expected 16bit codepoint
                int codePoint = (this.scratchBuffer[range[0]] & 0xFF) | ((this.scratchBuffer[range[0]+1] & 0xFF) << 8);
                if (!Character.isWhitespace(codePoint))
                {
                    break;
                }

                range[0] += 2;
            }

            while (range[1] > range[0])
            {
                // Need to create a 16bit codepoint from two signed bytes. Mask with 0xFF to get unsigned values,
                // shift upper byte by 8 and OR with lower byte to get the expected 16bit codepoint
                int codePoint = (this.scratchBuffer[range[1]-2] & 0xFF) | ((this.scratchBuffer[range[1]-1] & 0xFF) << 8);

                // Need to check against EOS (0x0) in trim fixed len strings correctly
                if (!Character.isWhitespace(codePoint) && codePoint != 0x0)
                {
                    break;
                }

                range[1] -= 2;
            }
        }
        else
        {
            while (range[0] < range[1])
            {
                int codePoint = (this.scratchBuffer[range[0]] & 0xFF);
                if (!Character.isWhitespace(codePoint))
                {
                    break;
                }

                range[0]++;
            }

            while (range[1] > range[0])
            {
                // Need to check against EOS (0x0) in trim fixed len strings correctly
                int codePoint = (this.scratchBuffer[range[1]-1] & 0xFF);
                if (!Character.isWhitespace(codePoint) && codePoint != 0x0)
                {
                    break;
                }

                range[1]--;
            }
        }
    }

    /**
     * Gets the null terminated string.
     *
     * @param stype
     *            the stype
     * @return the null terminated string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private String getNullTerminatedString(HpccSrcType stype, boolean shouldTrim) throws IOException
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

        // Read OPTIMIZED_STRING_READ_AHEAD bytes at a time until we find the end of the string
        int eosLocation = -1;
        int strByteLen = 0;
        while (eosLocation < 0)
        {
            int readSize = 0;
            try
            {
                readSize = this.inputStream.available();
            }
            catch(Exception e)
            {
                throw new IOException("Error, unexpected EOS while constructing UTF16 string.");
            }

            // Always read an even number of bytes for UTF16
            if (stype.isUTF16()) {
                readSize = ((readSize + 1) / 2) * 2;
            }

            if (readSize > OPTIMIZED_STRING_READ_AHEAD)
            {
                readSize = OPTIMIZED_STRING_READ_AHEAD;
            }

            if ((strByteLen + readSize) > MAX_STRING_LENGTH)
            {
                throw new IOException("Error, string length exceeds maximum supported length: " + MAX_STRING_LENGTH);
            }

            this.inputStream.mark(OPTIMIZED_STRING_READ_AHEAD);
            readIntoScratchBuffer(strByteLen, readSize);

            // Note: separate for loops because consuming 2 bytes at a
            // time makes null check easier. Do not have to check for alignment etc
            if (stype.isUTF16())
            {
                for (int j = 0; j < readSize-1; j += 2)
                {
                    if (scratchBuffer[strByteLen + j] == '\0' && scratchBuffer[strByteLen + j + 1] == '\0')
                    {
                        eosLocation = j;
                        break;
                    }
                }
            }
            else
            {
                for (int j = 0; j < readSize; j++)
                {
                    if (scratchBuffer[strByteLen + j] == '\0')
                    {
                        eosLocation = j;
                        break;
                    }
                }
            }

            if (eosLocation != -1)
            {
                strByteLen += eosLocation;

                // Reset back to our mark and the skip forward so we don't consume bytes
                // passed the end of the string
                this.inputStream.reset();

                if (stype.isUTF16())
                {
                    this.inputStream.skip(eosLocation + 2);
                }
                else
                {
                    this.inputStream.skip(eosLocation + 1);
                }

                break;
            }
            else
            {
                strByteLen += readSize;
            }
        }

        int[] strRange = {0, strByteLen};
        if (shouldTrim)
        {
            boolean isUnicode = (stype == HpccSrcType.UTF16BE || stype == HpccSrcType.UTF16LE);
            trimStringInScratchBuffer(isUnicode, strRange);
        }

        strByteLen = strRange[1] - strRange[0];
        if (strByteLen == 0 && convertEmptyStringsToNull)
        {
            return null;
        }

        return new String(scratchBuffer,strRange[0],strByteLen,charset);
    }

    /**
     * Extract a string from the byte array.
     *
     * @param styp
     *            the source type in the byte array
     * @param codePoints
     *            the code points
     * @return the extracted string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private String getString(HpccSrcType styp, int codePoints, boolean shouldTrim) throws IOException
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

        if (codePoints <= 0)
        {
            return new String(this.scratchBuffer, 0, 0, charset);
        }

        int strByteLen = 0;
        ensureScratchBufferCapacity(codePoints * 2);
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
                    readIntoScratchBuffer(strByteLen,bytesToRead);

                    // loop over bytes read and count codepoints.
                    int bytesScanned = 0;
                    for (; bytesScanned < bytesToRead;)
                    {
                        if ((this.scratchBuffer[strByteLen + bytesScanned] & 0x80) == 0)
                            bytesScanned++;
                        else if ((this.scratchBuffer[strByteLen + bytesScanned] & 0xE0) == 0xC0)
                            bytesScanned += 2;
                        else if ((this.scratchBuffer[strByteLen + bytesScanned] & 0xF0) == 0xE0)
                            bytesScanned += 3;
                        else if ((this.scratchBuffer[strByteLen + bytesScanned] & 0xF8) == 0xF0)
                            bytesScanned += 4;
                        else
                            throw new IOException("Illegal UTF-8 sequence");

                        remainingCodePoints--;
                    }

                    strByteLen += bytesToRead;

                    // Need to handle misaligned codepoints at the end.
                    // IE first byte is in the buffer but the last 3 arent.
                    int misalignedBytes = bytesScanned - bytesToRead;
                    if (misalignedBytes > 0)
                    {
                        readIntoScratchBuffer(strByteLen, misalignedBytes);
                        strByteLen += misalignedBytes;
                    }
                }

                break;
            }
            case SINGLE_BYTE_CHAR:
            case UTF16BE:
            case UTF16LE:
            {
                int bytesToRead = getLenFromCodePoints(styp, codePoints);
                readIntoScratchBuffer(strByteLen, bytesToRead);
                strByteLen += bytesToRead;
                break;
            }
            case QSTRING:
            {
                int expandedLen = codePoints;

                // We are multiplying expandedLen by the QSTR compression ratio. We are doing this in integers
                // so we need to handle rounding up correctly by adding divisor-1 or (QSTR_EXPANDED_CHUNK_LEN-1) in this case
                int compressedLen = expandedLen * QSTR_COMPRESSED_CHUNK_LEN + (QSTR_EXPANDED_CHUNK_LEN-1);
                compressedLen /= QSTR_EXPANDED_CHUNK_LEN;

                ensureScratchBufferCapacity(expandedLen + compressedLen);

                int compressedBytesRead = 0;
                int compressedBytesConsumed = 0;
                while (compressedBytesRead < compressedLen)
                {
                    // Use the second half of the remaining buffer space as a temp place to read in compressed bytes.
                    // Beginning of the buffer will be used to construct the string

                    // Scratch buffer is divided into two parts. First expandedLen bytes are for the final expanded string
                    // Remaining bytes are for reading in the compressed string.
                    int readPos = expandedLen + compressedBytesConsumed;
                    readIntoScratchBuffer(readPos, compressedLen);

                    // We want to consume only a whole chunk so round off residual chars
                    // Below we will handle any residual bytes. (strLen % 4)
                    int charsToWrite = (expandedLen / QSTR_EXPANDED_CHUNK_LEN) * QSTR_EXPANDED_CHUNK_LEN;

                    int writePos = 0;
                    for (; writePos < charsToWrite; writePos += QSTR_EXPANDED_CHUNK_LEN, readPos += QSTR_COMPRESSED_CHUNK_LEN)
                    {
                        int b0 = this.scratchBuffer[readPos] & 0xff;
                        int b1 = this.scratchBuffer[readPos + 1] & 0xff;
                        int b2 = this.scratchBuffer[readPos + 2] & 0xff;

                        scratchBuffer[strByteLen + writePos + 0] = (byte) (' ' + (b0 >> 2));
                        scratchBuffer[strByteLen + writePos + 1] = (byte) (' ' + ((b0 & 0x3) << 4 | (b1 >> 4)));
                        scratchBuffer[strByteLen + writePos + 2] = (byte) (' ' + ((b1 & 0xf) << 2 | (b2 >> 6)));
                        scratchBuffer[strByteLen + writePos + 3] = (byte) (' ' + (b2 & 0x3f));

                        compressedBytesConsumed += QSTR_COMPRESSED_CHUNK_LEN;
                    }

                    compressedBytesRead += compressedLen;
                    strByteLen += writePos;
                }

                // Need to handle any residual chars. IE: case where string isn't a multiple of 4 chars
                int writePos = 0;
                int readPos = expandedLen + compressedBytesConsumed;
                int remainingChars = expandedLen - strByteLen;
                switch (remainingChars)
                {
                    case 3:
                    {
                        int b1 = this.scratchBuffer[readPos + 1] & 0xff;
                        int b2 = this.scratchBuffer[readPos + 2] & 0xff;
                        scratchBuffer[strByteLen + writePos+2] = (byte) (' ' + ((b1 & 0xf) << 2 | (b2 >> 6)));
                        // fallthrough
                    }
                    case 2:
                    {
                        int b0 = this.scratchBuffer[readPos] & 0xff;
                        int b1 = this.scratchBuffer[readPos + 1] & 0xff;
                        scratchBuffer[strByteLen + writePos+1] = (byte) (' ' + ((b0 & 0x3) << 4 | (b1 >> 4)));
                        // fallthrough
                    }
                    case 1:
                    {
                        int b0 = this.scratchBuffer[readPos] & 0xff;
                        scratchBuffer[strByteLen + writePos+0] = (byte) (' ' + (b0 >> 2));
                        break;
                    }
                    case 0:
                        break;
                    default:
                        throw new IOException("Error while parsing QSTR invalid number of residual bytes: " + remainingChars);
                }
                strByteLen += writePos + remainingChars;
                break;
            }
            default:
                throw new IOException("Unknown source type");
        }

        int[] strRange = {0, strByteLen};
        if (shouldTrim)
        {
            boolean isUnicode = (styp == HpccSrcType.UTF16BE || styp == HpccSrcType.UTF16LE);
            trimStringInScratchBuffer(isUnicode, strRange);
        }

        strByteLen = strRange[1] - strRange[0];
        if (strByteLen == 0 && convertEmptyStringsToNull)
        {
            return null;
        }

        return new String(scratchBuffer,strRange[0],strByteLen,charset);
    }

    /**
     * Get the number of code units (number of bytes) used to encode cp coded characters.
     *
     * @param styp
     *            the source data type
     * @param cp
     *            the number of code points.
     * @return the number of bytes
     * @throws IOException
     *             Signals that an I/O exception has occurred.
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
                bytes = cp * 2;
                break;
            case UTF16LE:
                bytes = cp * 2;
                break;
            default:
                throw new IOException("Unknown data source type for a string of: " + styp.toString());
        }
        return bytes;
    }
}
