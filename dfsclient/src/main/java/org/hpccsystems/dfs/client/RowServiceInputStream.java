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
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.log4j.Logger;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.network.Network;

/**
 * The connection to a specific THOR node for a specific file part.
 *
 */
public class RowServiceInputStream extends InputStream 
{
    private boolean                  active;
    private boolean                  closed;
    private boolean                  simulateFail;
    private boolean                  forceCursorUse;
    private byte[]                   cursorBin;
    private int                      handle;
    private DataPartition            dataPart;
    private FieldDef                 recordDefinition              = null;
    private String                   jsonRecordDefinition          = null;
    private FieldDef                 projectedRecordDefinition     = null;
    private String                   projectedJsonRecordDefinition = null;
    private java.io.DataInputStream  dis;
    private java.io.DataOutputStream dos;

    private int                      filePartCopyIndexPointer = 0;  //pointer into the prioritizedCopyIndexes struct
    private List<Integer>            prioritizedCopyIndexes = new ArrayList<Integer>();

    private byte[]                   readBuffer;
    private int                      readBufferLen = 0;
    private int                      readPos = 0;
    private int                      markPos = -1;

    private Socket                   sock;
    static int                       DEFAULT_CONNECT_TIMEOUT_MILIS = 5000; // 5 second connection timeout
    private int                      connectTimeout = DEFAULT_CONNECT_TIMEOUT_MILIS;
    
    public static final Charset      HPCCCharSet                   = Charset.forName("ISO-8859-1");

    // Note: The platform may respond with more data than this if records are larger than this limit.
    public static final int          MaxReadSizeKB                 = 4096;

    private static final Logger      log                           = Logger.getLogger(RowServiceInputStream.class.getName());

    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd) throws Exception 
    {
        this(dp,rd,pRd,DEFAULT_CONNECT_TIMEOUT_MILIS);
    }
    /**
     * A plain socket connect to a THOR node for remote read
     * 
     * @param hpccPart
     *            the remote file name and IP
     * @param rd
     *            the JSON definition for the read input and output
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout) throws Exception
    {
        this.recordDefinition = rd;
        this.projectedRecordDefinition = pRd;

        this.jsonRecordDefinition = RecordDefinitionTranslator.toJsonRecord(this.recordDefinition).toString();
        this.projectedJsonRecordDefinition = RecordDefinitionTranslator.toJsonRecord(this.projectedRecordDefinition).toString();

        this.dataPart = dp;
        
        int copycount = dataPart.getCopyCount();
        for (int index = 0; index < copycount; index++)
        {
            String currentCopyLocation = dataPart.getCopyIP(index);
            if(Network.isLocalAddress(currentCopyLocation))
                prioritizedCopyIndexes.add(0,index);
            else
                prioritizedCopyIndexes.add(index);
        }

        this.active = false;
        this.closed = false;
        this.handle = 0;
        this.cursorBin = new byte[0];
        this.simulateFail = false;
        this.connectTimeout=connectTimeout;
        // Read buffer is 2x to allow for partial record reads for records larger than MaxReadSizeKB.
        // Note: this is currently not partial reads are not currently supported by the row service
        this.readBuffer = new byte[MaxReadSizeKB*1024*2];
        
        this.readBlock();
    }

    private boolean setNextFilePartCopy()
    {
        if (filePartCopyIndexPointer + 1 >= prioritizedCopyIndexes.size())
            return false;

        filePartCopyIndexPointer++;
        return true;
    }

    /**
     * The SSL usage on the DAFILESRV side
     * 
     * @return use ssl flag
     */
    public boolean getUseSSL()
    {
        return this.dataPart.getUseSsl();
    }

    /**
     * The primary IP for the file part
     * 
     * @return IP address
     */
    public String getIP()
    {
        return this.dataPart.getCopyIP(prioritizedCopyIndexes.get(filePartCopyIndexPointer));
    }

    /**
     * The port number for the remote read service
     * 
     * @return port number
     */
    public int getPort()
    {
        return this.dataPart.getPort();
    }

    /**
     * The read transaction in JSON format
     * 
     * @return read transaction
     */
    public String getTrans()
    {
        return this.makeInitialRequest();
    }

    /**
     * The request string used with a handle
     * 
     * @return JSON string
     */
    public String getHandleTrans()
    {
        return this.makeHandleRequest();
    }

    /**
     * transaction when a cursor is required for the next read.
     * 
     * @return a JSON request
     */
    public String getCursorTrans()
    {
        return this.makeCursorRequest();
    }

    /**
     * Is the read active?
     */
    public boolean isActive()
    {
        return this.active;
    }

    /**
     * Is the remote file closed? The file is closed after all of the partition content has been transferred.
     * 
     * @return true if closed.
     */
    public boolean isClosed()
    {
        return this.closed;
    }

    /**
     * Remote read handle for next read
     * 
     * @return the handle
     */
    public int getHandle()
    {
        return handle;
    }

    /**
     * Simulate a handle failure and use the file cursor instead. The handle is set to an invalid value so the THOR node
     * will indicate that the handle is unknown and request a cursor.
     * 
     * @param v
     *            true indicates that an invalid handle should be sent to force the fall back to a cursor. NOTE: this
     *            class reads ahead, so the use this before the first read.
     * @return the prior value
     */
    public boolean setSimulateFail(boolean v)
    {
        boolean old = this.simulateFail;
        this.simulateFail = v;
        return old;
    }

    /**
     * Force the use of cursors instead of handles for testing.
     * 
     * @param v
     *            the setting
     * @return the previous setting
     */
    public boolean setForceCursorUse(boolean v)
    {
        boolean old = this.forceCursorUse;
        this.forceCursorUse = v;
        return old;
    }

    /**
     * Read a block of the remote file from a THOR node
     * 
     * @param buffer
     *            Will attempt to reuse the provided buffer. Passing null will allocate a new buffer.
     * @return the block sent by the node
     * @throws HpccFileException
     *             a problem with the read operation
     */
    void readBlock() throws HpccFileException
    {
        if (this.closed)
        {
            return;
        }

        if (!this.active) // attempt to the first read
        {
            makeActive();
        }

        int len = readReplyLen();
        if (len == 0)
        {
            try
            {
                close();
            } 
            catch (IOException e)
            {
                throw new HpccFileException(e.getMessage());
            }
            return;
        }

        if (len < 4)
        {
            throw new HpccFileException("Early data termination, no handle");
        }

        try
        {
            this.handle = dis.readInt();
            if (this.handle == 0)
            {
                len = retryWithCursor();
                if (len == 0)
                {
                    close();
                    return;
                }

                if (len < 4)
                {
                    throw new HpccFileException("Early data termination on retry, no handle");
                }

                this.handle = dis.readInt();
                if (this.handle == 0)
                {
                    throw new HpccFileException("Read retry failed");
                }
            }
        }
        catch (IOException e)
        {
            throw new HpccFileException("Error during read block", e);
        }
        int dataLen = 0;
        try
        {
            dataLen = dis.readInt();
            if (dataLen == 0)
            {
                close();
                return;
            }

            // Compact the array before reading in new data
            int remainingBytesInBuffer = this.readBufferLen - this.readPos;
            this.readBufferLen = remainingBytesInBuffer + dataLen;

            // Expand read buffer if necessary
            if (this.readBufferLen > this.readBuffer.length) {
                byte[] newBuffer = new byte[this.readBufferLen];
                System.arraycopy(this.readBuffer,this.readPos,newBuffer,0,remainingBytesInBuffer);
                this.readBuffer = newBuffer;
            } else {
                System.arraycopy(this.readBuffer,this.readPos,this.readBuffer,0,remainingBytesInBuffer);
            }

            // Update the markPos 
            if (this.markPos >= 0) {
                this.markPos -= this.readPos;
            }

            if (dataLen > this.readBuffer.length) {
                throw new HpccFileException("Error during read block, available data len is larger than read buffer. This should not happen");
            }
            dis.readFully(this.readBuffer, remainingBytesInBuffer, dataLen);
            this.readPos = 0;

            int cursorLen = dis.readInt();
            if (cursorLen == 0)
            {
                close();
                return;
            }

            if (this.cursorBin == null || cursorLen > this.cursorBin.length)
            {
                this.cursorBin = new byte[cursorLen];
            }
            dis.readFully(this.cursorBin,0,cursorLen);

        }
        catch (IOException e)
        {
            throw new HpccFileException("Error during read block", e);
        }
        if (this.simulateFail) this.handle = -1;
        String readAheadTrans = (this.forceCursorUse) ? this.getCursorTrans() : this.getHandleTrans();
        try
        {
            int lenTrans = readAheadTrans.length();
            this.dos.writeInt(lenTrans);
            this.dos.write(readAheadTrans.getBytes(HPCCCharSet), 0, lenTrans);
            this.dos.flush();
        }
        catch (IOException e)
        {
            throw new HpccFileException("Failure sending read ahead transaction", e);
        }

        return;
    }

    public int available() throws IOException
    {
        return this.readBufferLen - this.readPos;
    }

    public void close() throws IOException
    {
        if (this.closed == false)
        {
            this.closed = true;
            this.dos.close();
            this.dis.close();
            this.sock.close();
            this.dos = null;
            this.dis = null;
            this.sock = null;
        }
    }

    public void mark(int readLimit)
    {
        // Check to see if we can handle this readLimit with the current buffer / readPos
        int availableReadCapacity = this.readBuffer.length - this.readPos;
        if (availableReadCapacity < readLimit) 
        {
            // Check to see if compaction will work
            if (this.readBuffer.length > readLimit) 
            {
                int remainingBytesInBuffer = this.readBufferLen - this.readPos;
                System.arraycopy(this.readBuffer,this.readPos,this.readBuffer,0,remainingBytesInBuffer);
                this.readPos = 0;
            }
            // Need a larger buffer
            else
            {
                byte[] newBuffer = new byte[readLimit];
                int remainingBytesInBuffer = this.readBufferLen - this.readPos;
                System.arraycopy(this.readBuffer,this.readPos,newBuffer,0,remainingBytesInBuffer);
                this.readBuffer = newBuffer;
                this.readPos = 0;
            }
        }
        
        this.markPos = this.readPos;
    }

    public boolean markSupported()
    {
        return true;
    }

    // Returns next byte [0-255] -1 on EOS
    public int read() throws IOException
    {
        boolean onLastByteOfBuffer = this.readPos == this.readBufferLen;
        if (onLastByteOfBuffer) {
            try {
                this.readBlock();
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }

        if (this.available() < 1) {
            return -1;
        }

        int ret = this.readBuffer[this.readPos];
        this.readPos++;
        return ret;
    }

    // Returns -1 on EOS
    public int read(byte[] b) throws IOException
    {
        return read(b,0,b.length); 
    }

    // Returns -1 on EOS
    public int read(byte[] b, int off, int len) throws IOException
    {
        boolean needMoreData = (this.readPos + len) >= this.readBufferLen;
        if (needMoreData) {
            try {
                this.readBlock();
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }

        if (this.available() < len) {
            return -1;
        }

        System.arraycopy(this.readBuffer,this.readPos,b,off,len);
        this.readPos += len;
        return len;
    }

    public void reset() throws IOException
    {
        if (this.markPos < 0) {
            throw new IOException("Unable to reset to marked position."
                    + "Either a mark has not been set or the reset length exceeds internal buffer length.");
        }

        this.readPos = this.markPos;
        this.markPos = -1;
    }

    public long skip(long n) throws IOException
    {
        // Have to read the data if we need to skip
        long remainingBytesToSkip = n;
        while (remainingBytesToSkip > 0) {
            if (this.available() == 0 && this.closed) {
                break;
            }

            long bytesToSkip = remainingBytesToSkip;
            if (bytesToSkip > MaxReadSizeKB * 1024) {
                bytesToSkip = MaxReadSizeKB * 1024;
            }

            boolean needMoreData = (this.readPos + bytesToSkip) >= this.readBufferLen;
            if (needMoreData) {
                try {
                    this.readBlock();
                } catch (Exception e) {
                    throw new IOException(e.getMessage());
                }
            }

            if (bytesToSkip > this.readBufferLen) {
                bytesToSkip = this.readBufferLen;
            }

            this.readPos += bytesToSkip;
            remainingBytesToSkip -= bytesToSkip;
        }

        return (n - remainingBytesToSkip);
    }

    /**
     * Open client socket to the primary and open the streams
     * 
     * @throws HpccFileException
     */
    private void makeActive() throws HpccFileException
    {
        this.active = false;
        this.handle = 0;
        this.cursorBin = new byte[0];

        while (true)
        {
            try
            {
                log.debug("Attempting to connect to file part : '" + dataPart.getThisPart() + "' Copy: '" + (filePartCopyIndexPointer + 1) + "' on IP: '" + getIP() + "'");

                try
                {
                    if (getUseSSL())
                    {
                        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        sock = (SSLSocket) ssf.createSocket();

                        // Optimize for bandwidth over latency and connection time.
                        // We are opening up a long standing connection and potentially reading a significant amount of
                        // data
                        // So we don't care as much about individual packet latency or connection time overhead
                        sock.setPerformancePreferences(0, 1, 2);
                        sock.connect(new InetSocketAddress(this.getIP(), this.dataPart.getPort()), this.connectTimeout);

                        log.debug("Attempting SSL handshake...");
                        ((SSLSocket) sock).startHandshake();
                        log.debug("SSL handshake successful...");
                        log.debug("   Remote address = " + sock.getInetAddress().toString() + " Remote port = "
                                + sock.getPort());
                    }
                    else
                    {
                        SocketFactory sf = SocketFactory.getDefault();
                        sock = sf.createSocket();

                        // Optimize for bandwidth over latency and connection time.
                        // We are opening up a long standing connection and potentially reading a significant amount of
                        // data
                        // So we don't care as much about individual packet latency or connection time overhead
                        sock.setPerformancePreferences(0, 1, 2);
                        sock.connect(new InetSocketAddress(this.getIP(), this.dataPart.getPort()), this.connectTimeout);
                    }
                    log.debug("Connected: Remote address = " + sock.getInetAddress().toString() + " Remote port = "
                            + sock.getPort());
                }
                catch (java.net.UnknownHostException e)
                {
                    throw new HpccFileException("Bad file part addr " + this.getIP(), e);
                }
                catch (java.io.IOException e)
                {
                    throw new HpccFileException(e);
                }

                try
                {
                    this.dos = new java.io.DataOutputStream(sock.getOutputStream());
                    this.dis = new java.io.DataInputStream(sock.getInputStream());
                }
                catch (java.io.IOException e)
                {
                    throw new HpccFileException("Failed to create streams", e);
                }
                this.active = true;
                try
                {
                    String readTrans = makeInitialRequest();
                    int transLen = readTrans.length();
                    this.dos.writeInt(transLen);
                    this.dos.write(readTrans.getBytes(HPCCCharSet), 0, transLen);
                    this.dos.flush();
                }
                catch (IOException e)
                {
                    throw new HpccFileException("Failed on initial remote read read trans", e);
                }
                return;
            }
            catch (Exception e)
            {
                log.error("Could not reach file part: '" + dataPart.getThisPart() + "' copy: '" + (filePartCopyIndexPointer + 1) + "' on IP: '" + getIP() + "'");
                log.error(e.getMessage());

                if (!setNextFilePartCopy())
                    // This should be a multi exception
                    throw new HpccFileException("Unsuccessfuly attempted to connect to all file part copies", e);
            }
        }
    }

    /**
     * Creates a request string using the record definition, filename, and current state of the file transfer.
     * 
     * @return JSON request string
     */
    private String makeInitialRequest()
    {

        StringBuilder sb = new StringBuilder(2048);
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\", \n");
        sb.append("\"replyLimit\" : " + RowServiceInputStream.MaxReadSizeKB + ",\n");
        sb.append(makeNodeObject());
        sb.append("\n}\n");
        return sb.toString();
    }

    /**
     * Make the node part of the JSON request string
     * 
     * @return Json
     */
    private String makeNodeObject()
    {
        StringBuilder sb = new StringBuilder(
                50 + jsonRecordDefinition.length() + projectedJsonRecordDefinition.length());
        sb.append(" \"node\" : {\n ");
        // sb.append("{\n \"kind\" : \"");
        // sb.append((this.dataPart.isIndex())? "indexread" : "diskread");
        // sb.append("\",\n \"metaInfo\" : \"");
        sb.append("\"metaInfo\" : \"");
        sb.append(this.dataPart.getFileAccessBlob());
        sb.append("\",\n \"filePart\" : \"");
        sb.append(this.dataPart.getThisPart());
        sb.append("\", \n");
        if (!this.dataPart.getFilter().isEmpty())
        {
            sb.append(" ");
            sb.append(this.dataPart.getFilter().toJsonObject());
            sb.append(",\n");
        }

        sb.append("\n \"input\" : ");
        sb.append(jsonRecordDefinition);
        sb.append(", \n \"output\" : ");
        sb.append(projectedJsonRecordDefinition);
        sb.append("\n }");
        return sb.toString();
    }

    /**
     * Request using a handle to read the next block.
     * 
     * @return the request as a JSON string
     */
    private String makeHandleRequest()
    {
        StringBuilder sb = new StringBuilder(100);
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("  \"handle\" : \"");
        sb.append(Integer.toString(this.handle));
        sb.append("\" \n}");

        return sb.toString();
    }

    private String makeCursorRequest()
    {
        StringBuilder sb = new StringBuilder(130 + this.jsonRecordDefinition.length()
                + this.projectedJsonRecordDefinition.length() + (int) (this.cursorBin.length * 1.4));
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("\"replyLimit\" : " + RowServiceInputStream.MaxReadSizeKB + ",\n");
        sb.append(makeNodeObject());
        sb.append(",\n");
        sb.append("  \"cursorBin\" : \"");
        sb.append(java.util.Base64.getEncoder().encodeToString(this.cursorBin));
        sb.append("\" \n}\n");
        return sb.toString();
    }

    /**
     * Read the reply length and process failures if indicated.
     * 
     * @return length of the reply less failure indicator
     * @throws HpccFileException
     */
    private int readReplyLen() throws HpccFileException
    {
        int len = 0;
        boolean hi_flag = false; // is a response without this set always an error?
        try
        {
            len = dis.readInt();
            if (len < 0)
            {
                hi_flag = true;
                len &= 0x7FFFFFFF;
            }

            if (len == 0) return 0;

            int status = dis.readInt();
            len -= 4; // account for the status int 4-byte
            if (status != RFCCodes.RFCStreamNoError)
            {
                StringBuilder sb = new StringBuilder();
                sb.append("\nReceived ERROR from Thor node (");
                sb.append(this.getIP());
                sb.append("): Code: '");
                sb.append(status);
                sb.append("'");

                if (len > 0)
                {
                    byte[] message = new byte[len];
                    dis.readFully(message, 0, len);
                    sb.append(" Message: '");
                    sb.append(new String(message));
                    sb.append("'");
                }

                switch (status)
                {
                    case RFCCodes.DAFSERR_cmdstream_invalidexpiry:
                        sb.append(
                                "\nInvalid file access expiry reported - change File Access Expiry (HPCCFile) and retry");
                        break;
                    case RFCCodes.DAFSERR_cmdstream_authexpired:
                        sb.append(
                                "\nFile access expired before initial request - Retry and consider increasing File Access Expiry (HPCCFile)");
                        break;
                    default:
                        break;
                }
                throw new HpccFileException(sb.toString());
            }
        }
        catch (IOException e)
        {
            throw new HpccFileException("Error during read block", e);
        }
        return len;
    }

    /**
     * Retry with a cursor and read the reply. Process failures as indicated.
     * 
     * @return the length pf the reply less failure indication
     * @throws HpccFileException
     */
    private int retryWithCursor() throws HpccFileException
    {
        String retryTrans = this.makeCursorRequest();
        int len = retryTrans.length();
        try
        {
            this.dos.writeInt(len);
            this.dos.write(retryTrans.getBytes(HPCCCharSet), 0, len);
            this.dos.flush();
        }
        catch (IOException e)
        {
            throw new HpccFileException("Failed on remote read read retry", e);
        }
        return readReplyLen();
    }
}
