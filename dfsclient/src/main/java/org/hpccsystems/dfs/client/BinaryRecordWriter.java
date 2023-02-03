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

import org.hpccsystems.dfs.client.IRecordWriter;
import org.hpccsystems.dfs.client.IRecordAccessor;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

/**
 * Serializes records into the provided OutputStream utilizing the provided IRecordAccessor to access record data.
 * 
 * The IRecordAccessor must match the type of records that are provided to {@link #writeRecord(Object) writeRecord}.
 * The data written to the OutputStream will be in the HPCC Systems binary record format.
 */
public class BinaryRecordWriter implements IRecordWriter
{
    private static final Logger log                 = LogManager.getLogger(BinaryRecordWriter.class);

    private static final int    DataLenFieldSize    = 4;
    private static final int    DefaultBufferSizeKB = 4096;
    private static final byte   NegativeSignValue   = 0x0d;
    private static final byte   PositiveSignValue   = 0x0f;
    private static final int    MASK_32_LOWER_HALF  = 0xffff;
    private static final int    SCRATCH_BUFFER_SIZE = 256;

    // DO NOT CHANGE THESE VALUES. HERE FOR CODE READABILITY ONLY
    private static final int     QSTR_COMPRESSED_CHUNK_LEN = 3;
    private static final int     QSTR_EXPANDED_CHUNK_LEN   = 4;

    private byte[]              scratchBuffer       = new byte[SCRATCH_BUFFER_SIZE];

    private OutputStream        outputStream        = null;
    private ByteBuffer          buffer              = null;
    private long                bytesWritten        = 0;
    private IRecordAccessor     rootRecordAccessor  = null;

    private StreamOperationMessages  messages = new StreamOperationMessages();

    public String getStreamMessages()
    {
        return messages.getMessagesSummary();
    }

    public int getStreamMessageCount()
    {
        return messages.getTotalMessageCount();
    }

    /**
     * BinaryRecordWriter Initializes writing procedure, and converts the provided Schema to a SparkField stucture.
     *
     * @param output
     *            OutputStream to write to.
     * @throws Exception
     *             the exception
     */
    public BinaryRecordWriter(OutputStream output) throws Exception
    {
        this(output, ByteOrder.nativeOrder());
    }

    /**
     * Instantiates a new binary record writer.
     *
     * @param output
     *            the output
     * @param byteOrder
     *            the byte order
     * @throws Exception
     *             the exception
     */
    public BinaryRecordWriter(OutputStream output, ByteOrder byteOrder) throws Exception
    {
        this.outputStream = output;

        this.buffer = ByteBuffer.allocate(BinaryRecordWriter.DefaultBufferSizeKB * 1024);
        this.buffer.order(byteOrder);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordWriter#initialize(org.hpccsystems.dfs.client.IRecordAccessor)
     */
    public void initialize(IRecordAccessor recordAccessor)
    {
        this.rootRecordAccessor = recordAccessor;
    }

    /**
     * writeRecord Converts the provided Object into an HPCC record and writes it to the output channel.
     *
     * @param record
     *            the record
     * @throws Exception
     *             the exception
     */
    public void writeRecord(Object record) throws Exception
    {
        writeRecord(this.rootRecordAccessor, record);
    }

    /**
     * Write record.
     *
     * @param recordAccessor
     *            the record accessor
     * @param record
     *            the record
     * @throws Exception
     *             the exception
     */
    private void writeRecord(IRecordAccessor recordAccessor, Object record) throws Exception
    {
        // If we have less than 32 bytes left in the buffer flush to the channel
        // Note: variable length fields still need to check remaining capacity
        if (this.buffer.remaining() <= 32)
        {
            this.flush();
        }

        recordAccessor.setRecord(record);
        for (int i = 0; i < recordAccessor.getNumFields(); i++)
        {
            FieldDef fd = recordAccessor.getFieldDefinition(i);
            Object fieldValue = recordAccessor.getFieldValue(i);
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
                        writeField(fd, fieldValue);
                    }
                    catch (Exception e)
                    {
                        throw new Exception("Error while writing field: " + fd.getFieldName() + " of type: " + fd.getFieldType() + ": ", e);
                    }
                    break;
                case RECORD:
                    writeRecord(recordAccessor.getChildRecordAccessor(i), fieldValue);
                    break;
                case SET:
                case DATASET:
                {
                    List<Object> listValue = null;
                    if (fieldValue instanceof List)
                    {
                        listValue = (List<Object>) fieldValue;
                    }
                    else if (fieldValue == null)
                    {
                        listValue = new ArrayList<Object>();
                    }
                    else
                    {
                        throw new Exception("Error writing list. Expected List got: " + fieldValue.getClass().getName());
                    }

                    writeList(fd, recordAccessor.getChildRecordAccessor(i), listValue);
                    break;
                }
                default:
                    throw new Exception("Unsupported type: " + fd.getFieldType() + " for field: " + fd.getFieldName());
            };
        }
    }

    /**
     * flush
     * Flush buffered data to InputStream. This is a blocking operation.
     *
     * @throws Exception
     *             the exception
     */
    public void flush() throws Exception
    {
        byte[] data = this.buffer.array();
        int dataLen = this.buffer.position();
        this.outputStream.write(data, 0, dataLen);
        this.bytesWritten += dataLen;

        this.buffer.clear();
    }

    /**
     * getBufferCapacity
     * Returns the internal buffer capacity.
     *
     * @return the buffer capacity
     */
    public int getBufferCapacity()
    {
        return this.buffer.capacity();
    }

    /**
     * getRemainingBufferCapacity
     * Returns the remaining capacity in the internal buffer.
     *
     * @return the remaining buffer capacity
     */
    public int getRemainingBufferCapacity()
    {
        return this.buffer.remaining();
    }

    /**
     * finalize Must be called after all records have been written. Will flush the internal buffer to the output
     * channel.
     *
     * @throws Exception
     *             the exception
     */
    public void finalize() throws Exception
    {
        this.flush();
        this.outputStream.close();
    }

    /**
     * getTotalBytesWritten Returns the total bytes written thus far. This will not match the bytes written to the
     * ByteChannel until finialize is called.
     *
     * @return long
     */
    public long getTotalBytesWritten()
    {
        return this.bytesWritten;
    }

    /**
     * Write field.
     *
     * @param fd
     *            the fd
     * @param fieldValue
     *            the field value
     * @throws Exception
     *             the exception
     */
    @SuppressWarnings("unchecked")
    private void writeField(FieldDef fd, Object fieldValue) throws Exception
    {
        // If we have less than 32 bytes left in the buffer flush to the channel
        // Note: variable length fields still need to check remaining capacity
        if (this.buffer.remaining() <= 32)
        {
            this.flush();
        }

        switch (fd.getFieldType())
        {
            case BINARY:
            {
                byte[] data = fieldValue == null ? new byte[0] : (byte[]) fieldValue;
                if (fd.isFixed())
                {
                    int bytesToWrite = data.length;
                    if (bytesToWrite > fd.getDataLen())
                    {
                        messages.addMessage("Warning: Potential truncation of binary data for field: '" + fd.getFieldName() + "'");
                        bytesToWrite = (int) fd.getDataLen();
                    }

                    writeByteArray(data, 0, bytesToWrite);

                    // Fill in remaining length with 0
                    int numFillBytes = (int) fd.getDataLen() - bytesToWrite;
                    while (numFillBytes > 0)
                    {
                        int fillLength = numFillBytes;
                        if (fillLength > SCRATCH_BUFFER_SIZE)
                        {
                            fillLength = SCRATCH_BUFFER_SIZE;
                        }

                        Arrays.fill(scratchBuffer, 0, fillLength, (byte) '\0');
                        writeByteArray(scratchBuffer, 0, fillLength);
                        numFillBytes -= fillLength;
                    }
                }
                else
                {
                    long dataSize = data.length;
                    writeUnsigned(dataSize);
                    writeByteArray(data);
                }
                break;
            }
            case BOOLEAN:
            {
                Boolean value = fieldValue==null?Boolean.valueOf(false):(Boolean) fieldValue;
                byte byteValue = 0;
                if (value)
                {
                    byteValue = 1;
                }
                this.buffer.put(byteValue);
                break;
            }
            case INTEGER:
            case FILEPOS:
            {
                Long value = null;
                if (fieldValue==null) 
                {
                    value=Long.valueOf(0);
                }
                else if (fieldValue instanceof Long)
                {
                    value = (Long) fieldValue;
                }
                else if (fieldValue instanceof Integer)
                {
                    value = ((Integer) fieldValue).longValue();
                }
                else if (fieldValue instanceof BigInteger)
                {
                    value = ((BigInteger) fieldValue).longValue();
                }
                else if (fieldValue instanceof BigDecimal)
                {
                    value = ((BigDecimal) fieldValue).longValue();
                }
                else if (fieldValue instanceof Short)
                {
                    value = ((Short) fieldValue).longValue();
                }
                else if (fieldValue instanceof Byte)
                {
                    value = ((Byte) fieldValue).longValue();
                }
                else
                {
                    throw new Exception("Unsupported integer type: " + fieldValue.getClass().getName() + " for field " + fd.getFieldName());
                }

                if (fd.getDataLen() == 1)
                {
                    this.buffer.put(value.byteValue());
                }
                else if (fd.getDataLen() == 2)
                {
                    this.buffer.putShort(value.shortValue());
                }
                else if (fd.getDataLen() == 4)
                {
                    this.buffer.putInt(value.intValue());
                }
                else if (fd.getDataLen() == 8)
                {
                    this.buffer.putLong(value);
                }
                else if (fd.getDataLen() < 8 && fd.getDataLen() > 0)
                {
                    long lastByteIdx = fd.getDataLen() -1;
                    for (int i = 0; i < lastByteIdx; i++)
                    {
                        this.buffer.put((byte) ((value >> (i*8)) & 0xFF));
                    }
                   
                    long signBit = value < 0 ? 0x80L : 0;
                    this.buffer.put((byte) (((value >> (lastByteIdx*8)) & 0xFF) | signBit));
                }
                else
                {
                    throw new Exception("Unsupported integer length: " + fd.getDataLen() + " for field: " + fd.getFieldName());
                }

                break;
            }
            case DECIMAL:
            {
                BigDecimal value = fieldValue==null ? BigDecimal.valueOf(0) : (BigDecimal) fieldValue;
                writeDecimal(fd, value);
                break;
            }
            case REAL:
            {
                Double value = 0.0;
                if (fieldValue instanceof Double)
                {
                    value = (Double) fieldValue;
                }
                else if (fieldValue instanceof Integer)
                {
                    value = ((Float) fieldValue).doubleValue();
                }

                if (fd.getDataLen() == 4)
                {
                    this.buffer.putFloat(value.floatValue());
                }
                else if (fd.getDataLen() == 8)
                {
                    this.buffer.putDouble(value);
                }
                else
                {
                    throw new Exception("Unsupported real length: " + fd.getDataLen() + " for field: " + fd.getFieldName());
                }
                break;
            }
            case CHAR:
            {
                byte c='\0';
                if (fieldValue!=null) 
                {
                    String value = (String) fieldValue;
                    c = (byte) value.charAt(0);
                }
                this.buffer.put(c);
                break;
            }
            case VAR_STRING:
            case STRING:
            {
                String value = fieldValue != null ? (String) fieldValue : "";
                byte[] data = new byte[0];
                if (fd.getSourceType() == HpccSrcType.UTF16LE)
                {
                    data = value.getBytes("UTF-16LE");
                }
                else if (fd.getSourceType() == HpccSrcType.UTF16BE)
                {
                    data = value.getBytes("UTF-16BE");
                }
                else if (fd.getSourceType() == HpccSrcType.UTF8)
                {
                    data = value.getBytes("UTF-8");
                }
                else if (fd.getSourceType() == HpccSrcType.SINGLE_BYTE_CHAR)
                {
                    data = value.getBytes("ISO-8859-1");
                }
                else if (fd.getSourceType() == HpccSrcType.QSTRING)
                {
                    byte[] tempData = value.getBytes("ISO-8859-1");

                    // We are multiplying expandedLen by the QSTR compression ratio. We are doing this in integers
                    // so we need to handle rounding up correctly by adding divisor-1 or (QSTR_EXPANDED_CHUNK_LEN-1) in this case
                    int compressedDataLen = tempData.length * QSTR_COMPRESSED_CHUNK_LEN + (QSTR_EXPANDED_CHUNK_LEN-1);
                    compressedDataLen /= QSTR_EXPANDED_CHUNK_LEN;
                    data = new byte[compressedDataLen];
                    
                    int bitOffset = 0;
                    for (int i = 0; i < tempData.length; i++)
                    {
                        int byteIdx = bitOffset / 8;
                        int qstrByteValue = (tempData[i] & 0xff) - ' ';
                        int charIdxMod = i % QSTR_EXPANDED_CHUNK_LEN;
                        switch (charIdxMod)
                        {
                            case 3:
                                // The full 6 bits of Char 3 are in the bot 6 bits of byte 3
                                data[byteIdx] |= (byte) (qstrByteValue & 0x3F);
                                break;
                            case 2:
                                // The top 4 bits of Char 2 are in the bot 4 bits of byte1
                                data[byteIdx] |= (byte) ((qstrByteValue & 0x3C) >> 2);
                                
                                // The bot 2 bits of Char 2 are in the top 2 bits of byte2
                                data[byteIdx+1] = (byte) ((qstrByteValue & 0x3) << 6);
                                break;
                            case 1:
                                // Top 2 bits of Char 1 are in the bot 2 bits of byte 0
                                data[byteIdx] |= (byte) ((qstrByteValue & 0x30) >> 4);

                                //The bot 4 bits of Char 1 are in the top 4 bits of byte 1
                                data[byteIdx+1] = (byte) ((qstrByteValue & 0xF) << 4);
                                break;
                            case 0:
                                // Char 0 is in the top 6 bits of byte 0
                                data[byteIdx] = (byte) ((qstrByteValue & 0x3F) << 2);
                                break;
                        }

                        bitOffset += 6;
                    }
                }
                else
                {
                    throw new Exception(
                            "Unsupported string encoding type: " + fd.getSourceType() + " encountered while writing field: " + fd.getFieldName());
                }

                if (fd.isFixed())
                {
                    if (fd.getDataLen() > Integer.MAX_VALUE)
                    {
                        throw new Exception("String length: " + fd.getDataLen() + " exceeds max supported length: " + Integer.MAX_VALUE);
                    }

                    int bytesToWrite = (int) fd.getDataLen();
                    if (fd.getFieldType() == FieldType.VAR_STRING)
                    {
                        bytesToWrite++;
                    }

                    if (fd.getSourceType().isUTF16())
                    {
                        bytesToWrite *= 2;
                    }

                    // Var Strings end with a null character
                    // The length should always be long enough but it is better to check anyway
                    if (data.length >= bytesToWrite)
                    {
                        if (fd.getFieldType() == FieldType.VAR_STRING && bytesToWrite > 0)
                        {
                            data[bytesToWrite - 1] = '\0';
                            if (fd.getSourceType().isUTF16() && bytesToWrite > 1)
                            {
                                data[bytesToWrite - 2] = '\0';
                            }
                        }

                        writeByteArray(data, 0, bytesToWrite);
                    }
                    else
                    {
                        writeByteArray(data, 0, data.length);
                        int numFillBytes = bytesToWrite - data.length;
                        while (numFillBytes > 0)
                        {
                            int fillLength = numFillBytes;
                            if (fillLength > SCRATCH_BUFFER_SIZE)
                            {
                                fillLength = SCRATCH_BUFFER_SIZE;
                            }

                            Arrays.fill(scratchBuffer, 0, fillLength, (byte) '\0');
                            writeByteArray(scratchBuffer, 0, fillLength);
                            numFillBytes -= fillLength;
                        }
                    }
                }
                else
                {
                    if (fd.getFieldType() == FieldType.VAR_STRING)
                    {
                        writeByteArray(data, 0, data.length);

                        if (fd.getFieldType() == FieldType.VAR_STRING)
                        {
                            byte nullByte = '\0';
                            this.buffer.put(nullByte);
                            if (fd.getSourceType().isUTF16())
                            {
                                this.buffer.put(nullByte);
                            }
                        }
                    }
                    else
                    {
                        writeUnsigned(value==null?0:value.length());
                        writeByteArray(data);
                    }
                }
                break;
            }
            default:
            {
                throw new Exception("Unsupported type encountered while writing field. This should not happen");
            }
        }
    }

    /**
     * Calculate field size.
     *
     * @param fd
     *            the fd
     * @param recordAccessor
     *            the record accessor
     * @param fieldValue
     *            the field value
     * @return the long
     * @throws Exception
     *             the exception
     */
    @SuppressWarnings("unchecked")
    private long calculateFieldSize(FieldDef fd, IRecordAccessor recordAccessor, Object fieldValue) throws Exception
    {
        switch (fd.getFieldType())
        {
            case SET:
            case DATASET:
            {
                List<Object> listValue = null;
                if (fieldValue instanceof List)
                {
                    listValue = (List<Object>) fieldValue;
                }
                else
                {
                    throw new Exception("Error writing list. Expected List, got: " + fieldValue.getClass().getName());
                }

                long dataLen = BinaryRecordWriter.DataLenFieldSize;
                boolean isSet = fd.getDef(0).getFieldType() != FieldType.RECORD;
                if (isSet)
                {
                    dataLen++;
                }

                for (Object o : listValue)
                {
                    dataLen += calculateFieldSize(fd.getDef(0), recordAccessor, o);
                }
                return dataLen;
            }
            case BINARY:
            {
                if (fd.isFixed())
                {
                    return fd.getDataLen();
                }
                else
                {
                    byte[] data = (byte[]) fieldValue;
                    return data.length + BinaryRecordWriter.DataLenFieldSize;
                }
            }
            case BOOLEAN:
            {
                return 1;
            }
            case INTEGER:
            case FILEPOS:
            case DECIMAL:
            case REAL:
            {
                return fd.getDataLen();
            }
            case CHAR:
            {
                return 1;
            }
            case VAR_STRING:
            case STRING:
            {
                if (fd.isFixed())
                {
                    long dataLen = 0;
                    if (fd.getSourceType().isUTF16())
                    {
                        dataLen = fd.getDataLen() * 2;
                        if (fd.getFieldType() == FieldType.VAR_STRING)
                        {
                            dataLen += 2;
                        }
                    }
                    else if (fd.getSourceType() == HpccSrcType.SINGLE_BYTE_CHAR)
                    {
                        dataLen = fd.getDataLen();
                        if (fd.getFieldType() == FieldType.VAR_STRING)
                        {
                            dataLen += 1;
                        }
                    }
                    else if (fd.getSourceType() == HpccSrcType.UTF8)
                    {
                        throw new Exception("Fixed length utf8 strings are not supported.");
                    }
                    else if (fd.getSourceType() == HpccSrcType.QSTRING)
                    {
                        dataLen = fd.getDataLen();
                    }
                    else
                    {
                        throw new Exception(
                                "Unsupported string encoding type: " + fd.getSourceType() + " encountered while writing field: " + fd.getFieldName());
                    }

                    return dataLen;
                }

                String value = (String) fieldValue;
                byte[] data = null;

                if (fd.getSourceType() == HpccSrcType.UTF16LE)
                {
                    data = value.getBytes("UTF-16LE");
                }
                else if (fd.getSourceType() == HpccSrcType.UTF16BE)
                {
                    data = value.getBytes("UTF-16BE");
                }
                else if (fd.getSourceType() == HpccSrcType.UTF8)
                {
                    data = value.getBytes("UTF-8");
                }
                else if (fd.getSourceType() == HpccSrcType.SINGLE_BYTE_CHAR)
                {
                    data = value.getBytes("ISO-8859-1");
                }
                else if (fd.getSourceType() == HpccSrcType.QSTRING)
                {
                    data = value.getBytes("ISO-8859-1");
                    // We are multiplying expandedLen by the QSTR compression ratio. We are doing this in integers
                    // so we need to handle rounding up correctly by adding divisor-1 or (QSTR_EXPANDED_CHUNK_LEN-1) in this case
                    int compressedDataLen = data.length * QSTR_COMPRESSED_CHUNK_LEN + (QSTR_EXPANDED_CHUNK_LEN-1);
                    compressedDataLen /= QSTR_EXPANDED_CHUNK_LEN;
                    data = new byte[compressedDataLen];
                }
                else
                {
                    throw new Exception(
                            "Unsupported string encoding type: " + fd.getSourceType() + " encountered while writing field: " + fd.getFieldName());
                }

                if (fd.getFieldType() == FieldType.STRING)
                {
                    return data.length + BinaryRecordWriter.DataLenFieldSize;
                }
                else
                {
                    int eosLen = 1;
                    if (fd.getSourceType().isUTF16())
                    {
                        eosLen++;
                    }

                    return data.length + eosLen;
                }

            }
            case RECORD:
            {
                recordAccessor.setRecord(fieldValue);
                long dataLen = 0;
                for (int i = 0; i < recordAccessor.getNumFields(); i++)
                {
                    dataLen += calculateFieldSize(recordAccessor.getFieldDefinition(i), recordAccessor.getChildRecordAccessor(i),
                            recordAccessor.getFieldValue(i));
                }
                return dataLen;
            }
            default:
            {
                throw new Exception("Unsupported type encountered while writing field. This should not happen");
            }
        }
    }

    /**
     * Write list.
     *
     * @param fd
     *            the fd
     * @param childRecordAccessor
     *            the child record accessor
     * @param list
     *            the list
     * @throws Exception
     *             the exception
     */
    private void writeList(FieldDef fd, IRecordAccessor childRecordAccessor, List<Object> list) throws Exception
    {
        // Data layout for SETS & DATASETS are similar. Exception is SETS have a preceding unused byte.
        boolean isSet = fd.getDef(0).getFieldType() != FieldType.RECORD;
        if (isSet)
        {
            this.buffer.put((byte) 0);
        }

        // calculated size includes the data size field & and padding byte if present
        // We want only the data size of the child array
        long dataSetSize = calculateFieldSize(fd, childRecordAccessor, list);
        dataSetSize -= BinaryRecordWriter.DataLenFieldSize;
        if (isSet)
        {
            dataSetSize--;
        }

        // Write the dataset size to the buffer
        writeUnsigned(dataSetSize);

        if (isSet)
        {
            for (Object value : list)
            {
                try
                {
                    this.writeField(fd.getDef(0), value);
                }
                catch (Exception e)
                {
                    throw new Exception("Error while writing field: " + fd.getFieldName() + " of type: " + fd.getFieldType() + ": ", e);
                }
            }
        }
        else
        {
            for (Object value : list)
            {
                this.writeRecord(childRecordAccessor, value);
            }
        }
    }

    /**
     * Write decimal.
     *
     * @param fd
     *            the fd
     * @param decimalValue
     *            the decimal value
     */
    private void writeDecimal(FieldDef fd, BigDecimal decimalValue)
    {
        int dataLen = (int) fd.getDataLen();
        for (int i = 0; i < dataLen; i++)
        {
            this.scratchBuffer[i] = 0;
        }

        boolean isNegative = decimalValue.signum() == -1;
        if (fd.isUnsigned())
        {
            if (isNegative)
            {
                decimalValue = BigDecimal.ZERO;
            }
        }
        else
        {
            if (isNegative)
            {
                decimalValue = decimalValue.negate();
                this.scratchBuffer[dataLen - 1] |= BinaryRecordWriter.NegativeSignValue;
            }
            else
            {
                this.scratchBuffer[dataLen - 1] |= BinaryRecordWriter.PositiveSignValue;
            }
        }

        int desiredPrecision = fd.getPrecision();
        int desiredScale = fd.getScale();

        // This will give us back an integer value of just the significant digits in the new scale.
        // Correctly truncating decimal sig digits and dropping int digits larger than precision - scale
        BigInteger unscaledInt = decimalValue.scaleByPowerOfTen(desiredScale).toBigIntegerExact();

        int signOffset = 4;
        if (fd.isUnsigned())
        {
            signOffset = 0;
        }

        // 1e18
        BigInteger divisor = BigInteger.valueOf(1000000000000000000L);
        for (int currentDigit = 0; currentDigit < desiredPrecision;) 
        {
            // Consume 18 digits at a time
            BigInteger[] quotientRemainder = unscaledInt.divideAndRemainder(divisor);
            unscaledInt = quotientRemainder[0];

            long val = quotientRemainder[1].longValue();
            for (int j = 0; j < 18 && currentDigit < desiredPrecision; j++, currentDigit++)
            {
                int bitOffset = currentDigit * 4 + signOffset;
                int byteOffset = bitOffset / 8;
                int bitShift = bitOffset % 8;

                long digit = val % 10;
                val /= 10;
                this.scratchBuffer[dataLen - 1 - byteOffset] |= (digit << bitShift);
            }
        }

        this.buffer.put(this.scratchBuffer, 0, dataLen);
    }

    /**
     * Write unsigned.
     *
     * @param value
     *            the value
     */
    private void writeUnsigned(long value)
    {
        for (int i = 0; i < 4; i++)
        {
            int index = i;
            if (this.buffer.order() == ByteOrder.BIG_ENDIAN)
            {
                index = 3 - i;
            }

            byte byteValue = (byte) ((value >> (index * 8)) & 0xff);
            this.buffer.put(byteValue);
        }
    }

    /**
     * Write byte array.
     *
     * @param data
     *            the data
     * @throws Exception
     *             the exception
     */
    private void writeByteArray(byte[] data) throws Exception
    {
        writeByteArray(data, 0, data.length);
    }

    /**
     * Write byte array.
     *
     * @param data
     *            the data
     * @param offset
     *            the offset
     * @param dataEnd
     *            the data end
     * @throws Exception
     *             the exception
     */
    private void writeByteArray(byte[] data, int offset, int dataEnd) throws Exception
    {
        do
        {
            int writeSize = dataEnd - offset;
            if (writeSize > this.buffer.remaining())
            {
                writeSize = this.buffer.remaining();
            }

            this.buffer.put(data, offset, writeSize);
            offset += writeSize;

            if (this.buffer.remaining() <= 32)
            {
                this.flush();
            }

        }
        while (offset < dataEnd);
    }

}
