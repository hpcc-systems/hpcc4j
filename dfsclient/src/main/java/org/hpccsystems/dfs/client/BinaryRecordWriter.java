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

import org.apache.log4j.Logger;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.io.OutputStream;
import java.util.List;

import java.util.Arrays;

public class BinaryRecordWriter implements IRecordWriter
{
    private static final Logger log                 = Logger.getLogger(BinaryRecordWriter.class.getName());

    private static final int    DataLenFieldSize    = 4;
    private static final int    DefaultBufferSizeKB = 4096;
    private static final byte   NegativeSignValue   = 0x0d;
    private static final byte   PositiveSignValue   = 0x0f;
    private static final int    MASK_32_LOWER_HALF  = 0xffff;
    private static final int    SCRATCH_BUFFER_SIZE = 256;

    private byte[]              scratchBuffer       = new byte[SCRATCH_BUFFER_SIZE];

    private OutputStream        outputStream        = null;
    private ByteBuffer          buffer              = null;
    private long                bytesWritten        = 0;
    private IRecordAccessor     rootRecordAccessor  = null;

    /**
     * BinaryRecordWriter Initializes writing procedure, and converts the provided Schema to a SparkField stucture
     * 
     * @param output
     *            OutputStream to write to. 
     * @param schema
     *            The Spark schema used for all subsequent calls to writeRecord
     * @throws Exception
     */
    public BinaryRecordWriter(OutputStream output) throws Exception
    {
        this(output, ByteOrder.nativeOrder());
    }

    public BinaryRecordWriter(OutputStream output, ByteOrder byteOrder) throws Exception
    {
        this.outputStream = output;

        this.buffer = ByteBuffer.allocate(BinaryRecordWriter.DefaultBufferSizeKB * 1024);
        this.buffer.order(byteOrder);
    }

    public void initialize(IRecordAccessor recordAccessor)
    {
        this.rootRecordAccessor = recordAccessor;
    }

    /**
     * writeRecord Converts the provided Object into an HPCC record and writes it to the output channel
     * 
     * @param Object
     * @throws Exception
     */
    public void writeRecord(Object record) throws Exception
    {
        writeRecord(this.rootRecordAccessor, record);
    }

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
                case REAL:
                case DECIMAL:
                case BINARY:
                case BOOLEAN:
                case STRING:
                case CHAR:
                case VAR_STRING:
                    writeField(fd, fieldValue);
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
     * @throws Exception 
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
     * Returns the internal buffer capacity
     * @return 
     */
    public int getBufferCapacity()
    {
        return this.buffer.capacity();
    }

    /**
     * getRemainingBufferCapacity
     * Returns the remaining capacity in the internal buffer
     * @return
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
     * @throws Exception
     */
    public long getTotalBytesWritten()
    {
        return this.bytesWritten;
    }

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
                byte[] data = (byte[]) fieldValue;
                long dataSize = data.length;
                writeUnsigned(dataSize);
                writeByteArray(data);
                break;
            }
            case BOOLEAN:
            {
                Boolean value = (Boolean) fieldValue;
                byte byteValue = 0;
                if (value)
                {
                    byteValue = 1;
                }
                this.buffer.put(byteValue);
                break;
            }
            case INTEGER:
            {
                Long value = null;
                if (fieldValue instanceof Long)
                {
                    value = (Long) fieldValue;
                }
                else if (fieldValue instanceof Integer)
                {
                    value = ((Integer) fieldValue).longValue();
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
                    throw new Exception("Unsupported integer type: " + fieldValue.getClass().getName());
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
                else
                {
                    throw new Exception("Unsupported integer length: " + fd.getDataLen() + " for field: " + fd.getFieldName());
                }
                break;
            }
            case DECIMAL:
            {
                if (fd.isUnsigned())
                {
                    throw new Exception("Writing unsigned decimals is not currently supported.");
                }

                BigDecimal value = (BigDecimal) fieldValue;
                writeDecimal(fd, value);
                break;
            }
            case REAL:
            {
                if (fd.getDataLen() == 4)
                {
                    Double value = (Double) fieldValue;
                    this.buffer.putFloat(value.floatValue());
                }
                else if (fd.getDataLen() == 8)
                {
                    Double value = (Double) fieldValue;
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
                String value = (String) fieldValue;
                byte c = (byte) value.charAt(0);
                this.buffer.put(c);
            }
            case VAR_STRING:
            case STRING:
            {
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
                    throw new Exception("Writing QStrings is currently unsupported.");
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
                        writeUnsigned(value.length());
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
                byte[] data = (byte[]) fieldValue;
                return data.length + BinaryRecordWriter.DataLenFieldSize;
            }
            case BOOLEAN:
            {
                return 1;
            }
            case INTEGER:
            {
                return fd.getDataLen();
            }
            case DECIMAL:
            {
                if (fd.isUnsigned())
                {
                    throw new Exception("Writing unsigned decimals not supported");
                }

                return fd.getDataLen();
            }
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
                        throw new Exception("Writing QStrings is currently unsupported.");
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
                    throw new Exception("Writing QStrings is currently unsupported.");
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
                this.writeField(fd.getDef(0), value);
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

    private void writeDecimal(FieldDef fd, BigDecimal decimalValue)
    {
        int precision = fd.getPrecision();
        int scale = fd.getScale();
        int dataLen = (int) fd.getDataLen();

        int mostSigDigit = precision - scale;
        boolean isNegative = decimalValue.signum() == -1;
        if (isNegative)
        {
            decimalValue = decimalValue.negate();
        }

        String decimalStr = decimalValue.stripTrailingZeros().toPlainString();

        // Strip leading zeros. We only want sig digits
        int numLeadingZeros = 0;
        while (decimalStr.charAt(numLeadingZeros) == '0')
        {
            numLeadingZeros++;
        }
        decimalStr = decimalStr.substring(numLeadingZeros);

        int intDigits = decimalStr.indexOf('.');

        byte[] workingBuffer = new byte[dataLen];
        Arrays.fill(workingBuffer, (byte) 0);

        // Calculate padding at the beginning.
        int bitOffset = (mostSigDigit - intDigits) * 4;
        if (bitOffset == 0)
        {
            bitOffset = 4;
        }

        // Even precision values are shifted by an additional 4 bits
        if (precision % 2 == 0)
        {
            bitOffset += 4;
        }

        for (int i = 0; i < decimalStr.length(); i++)
        {
            if (decimalStr.charAt(i) == '.')
            {
                continue;
            }
            int byteOffset = bitOffset / 8;
            int bitShift = (bitOffset + 4) % 8;

            int digit = (decimalStr.charAt(i) - '0');
            workingBuffer[byteOffset] |= (digit << bitShift);
            bitOffset += 4;
        }

        if (isNegative)
        {
            workingBuffer[dataLen - 1] |= BinaryRecordWriter.NegativeSignValue;
        }
        else
        {
            workingBuffer[dataLen - 1] |= BinaryRecordWriter.PositiveSignValue;
        }

        this.buffer.put(workingBuffer);
    }

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

    private void writeByteArray(byte[] data) throws Exception
    {
        writeByteArray(data, 0, data.length);
    }

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
