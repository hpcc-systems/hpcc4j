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

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.log4j.Logger;
import org.hpccsystems.dfs.client.RecordDef;
import org.hpccsystems.commons.errors.HpccFileException;

/**
 * The connection to a specific THOR node for a specific file part.
 *
 */
public class PlainConnection
{
    private boolean                  active;
    private boolean                  closed;
    private boolean                  simulateFail;
    private boolean                  forceCursorUse;
    private byte[]                   cursorBin;
    private final byte[]             emptyBuffer                   = new byte[0];
    private int                      handle;
    private DataPartition            dataPart;
    private RecordDef                recordDefinition;
    private java.io.DataInputStream  dis;
    private java.io.DataOutputStream dos;

    private Socket                   sock;
    private int                      currentFilePartCopyIndex;
    private int                      DEFAULT_CONNECT_TIMEOUT_MILIS = 1000;

    public static final Charset      HPCCCharSet                   = Charset.forName("ISO-8859-1");

    // Note: The platform may respond with more data than this if records are larger than this limit.
    public static final int          MaxReadSizeKB                 = 4096;

    private static final Logger      log                           = Logger.getLogger(PlainConnection.class.getName());

    /**
     * A plain socket connect to a THOR node for remote read
     * @param hpccPart the remote file name and IP
     * @param rd the JSON definition for the read input and output
     */
    public PlainConnection(DataPartition dp, RecordDef rd)
    {
        this.recordDefinition = rd;
        this.dataPart = dp;
        this.active = false;
        this.closed = false;
        this.handle = 0;
        this.cursorBin = new byte[0];
        this.simulateFail = false;
        this.currentFilePartCopyIndex = 0;
    }

    private boolean setNextFilePartCopy()
    {
        if (currentFilePartCopyIndex + 1 >= dataPart.getCopyCount()) return false;

        currentFilePartCopyIndex++;
        return true;
    }

    /**
     * The SSL usage on the DAFILESRV side
     * @return use ssl flag
     */
    public boolean getUseSSL()
    {
        return this.dataPart.getUseSsl();
    }

    /**
     * The primary IP for the file part
     * @return IP address
     */
    public String getIP()
    {
        return this.dataPart.getCopyIP(currentFilePartCopyIndex);
    }

    /**
     * The port number for the remote read service
     * @return port number
     */
    public int getPort()
    {
        return this.dataPart.getPort();
    }

    /**
     * The read transaction in JSON format
     * @return read transaction
     */
    public String getTrans()
    {
        return this.makeInitialRequest();
    }

    /**
     * The request string used with a handle
     * @return JSON string
     */
    public String getHandleTrans()
    {
        return this.makeHandleRequest();
    }

    /**
     * transaction when a cursor is required for the next read.
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
     * Is the remote file closed?  The file is closed after
     * all of the partition content has been transferred.
     * @return true if closed.
     */
    public boolean isClosed()
    {
        return this.closed;
    }

    /**
     * Remote read handle for next read
     * @return the handle
     */
    public int getHandle()
    {
        return handle;
    }

    /**
     * Simulate a handle failure and use the file cursor instead.  The
     * handle is set to an invalid value so the THOR node will indicate
     * that the handle is unknown and request a cursor.
     * @param v true indicates that an invalid handle should be sent
     * to force the fall back to a cursor.  NOTE: this class reads
     * ahead, so the use this before the first read.
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
     * @param v the setting
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
     * @param buffer Will attempt to reuse the provided buffer. Passing null will allocate a new buffer.
     * @return the block sent by the node
     * @throws HpccFileException a problem with the read operation
     */
    public byte[] readBlock(byte[] buffer) throws HpccFileException
    {
        if (this.closed)
        {
            return this.emptyBuffer; // no data left to send
        }

        if (!this.active) // attempt to the first read
        {
            makeActive();
        }

        int len = readReplyLen();
        if (len == 0)
        {
            this.closed = true;
            return this.emptyBuffer;
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
                    this.closed = true;
                    return this.emptyBuffer;
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
                closeConnection();
                return this.emptyBuffer;
            }

            if (buffer == null || buffer.length != dataLen)
            {
                buffer = new byte[dataLen];
            }
            dis.readFully(buffer, 0, dataLen);

            int cursorLen = dis.readInt();
            if (cursorLen == 0)
            {
                log.error("Unable to read cursor location from network stream. Closing connection.");
                closeConnection();
                return buffer;
            }
            if (this.cursorBin == null || cursorLen > this.cursorBin.length)
            {
                this.cursorBin = new byte[cursorLen];
            }
            dis.readFully(this.cursorBin);

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

        return buffer;
    }

    /**
     * Open client socket to the primary and open the streams
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
                log.debug("Attempting to connect to file part : '" + dataPart.getThisPart() + "' Copy: '" + (currentFilePartCopyIndex + 1)
                        + "' on IP: '" + getIP() + "'");

                try
                {
                    if (getUseSSL())
                    {
                        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        sock = (SSLSocket) ssf.createSocket();

                        // Optimize for bandwidth over latency and connection time.
                        // We are opening up a long standing connection and potentially reading a significant amount of data
                        // So we don't care as much about individual packet latency or connection time overhead
                        sock.setPerformancePreferences(0, 1, 2);
                        sock.connect(new InetSocketAddress(this.getIP(), this.dataPart.getPort()), DEFAULT_CONNECT_TIMEOUT_MILIS);

                        log.debug("Attempting SSL handshake...");
                        ((SSLSocket) sock).startHandshake();
                        log.debug("SSL handshake successful...");
                        log.debug("   Remote address = " + sock.getInetAddress().toString() + " Remote port = " + sock.getPort());
                    }
                    else
                    {
                        SocketFactory sf = SocketFactory.getDefault();
                        sock = sf.createSocket();

                        // Optimize for bandwidth over latency and connection time.
                        // We are opening up a long standing connection and potentially reading a significant amount of data
                        // So we don't care as much about individual packet latency or connection time overhead
                        sock.setPerformancePreferences(0, 1, 2);
                        sock.connect(new InetSocketAddress(this.getIP(), this.dataPart.getPort()), DEFAULT_CONNECT_TIMEOUT_MILIS);
                    }
                    log.debug("Connected: Remote address = " + sock.getInetAddress().toString() + " Remote port = " + sock.getPort());
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
                log.error("Could not reach file part: '" + dataPart.getThisPart() + "' copy: '" + (currentFilePartCopyIndex + 1) + "' on IP: '"
                        + getIP());
                log.error(e.getMessage());

                if (!setNextFilePartCopy()) throw new HpccFileException("Unsuccessfuly attempted to connect to all file part copies", e); // this should be a multi exception
            }
        }
    }

    /**
     * Creates a request string using the record definition, filename,
     * and current state of the file transfer.
     * @return JSON request string
     */
    private String makeInitialRequest()
    {
        StringBuilder sb = new StringBuilder(
                100 + this.recordDefinition.getJsonInputDef().length() + this.recordDefinition.getJsonOutputDef().length());
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\", \n");
        sb.append("\"replyLimit\" : " + PlainConnection.MaxReadSizeKB + ",\n");
        sb.append(makeNodeObject());
        sb.append("\n}\n");
        return sb.toString();
    }

    /**
     * Make the node part of the JSON request string
     * @return Json
     */
    private String makeNodeObject()
    {
        StringBuilder sb = new StringBuilder(
                50 + this.recordDefinition.getJsonInputDef().length() + this.recordDefinition.getJsonOutputDef().length());
        sb.append(" \"node\" : {\n ");
        //sb.append("{\n \"kind\" : \"");
        //sb.append((this.dataPart.isIndex())? "indexread"  : "diskread");
        //sb.append("\",\n \"metaInfo\" : \"");
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
        sb.append(this.recordDefinition.getJsonInputDef());
        sb.append(", \n \"output\" : ");
        sb.append(this.recordDefinition.getJsonOutputDef());
        sb.append("\n }");
        return sb.toString();
    }

    /**
     * Request using a handle to read the next block.
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
        StringBuilder sb = new StringBuilder(130 + this.recordDefinition.getJsonInputDef().length()
                + this.recordDefinition.getJsonOutputDef().length() + (int) (this.cursorBin.length * 1.4));
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("\"replyLimit\" : " + PlainConnection.MaxReadSizeKB + ",\n");
        sb.append(makeNodeObject());
        sb.append(",\n");
        sb.append("  \"cursorBin\" : \"");
        sb.append(java.util.Base64.getEncoder().encodeToString(this.cursorBin));
        sb.append("\" \n}\n");
        return sb.toString();
    }

    /**
     * Close the connection and clear the references
     * @throws HpccFileException
     */
    private void closeConnection() throws HpccFileException
    {
        this.closed = true;
        try
        {
            dos.close();
            dis.close();
            sock.close();
        }
        catch (IOException e)
        {}  // ignore this
        this.dos = null;
        this.dis = null;
        this.sock = null;
    }

    /**
     * Read the reply length and process failures if indicated.
     * @return length of the reply less failure indicator
     * @throws HpccFileException
     */
    private int readReplyLen() throws HpccFileException
    {
        int len = 0;
        boolean hi_flag = false;  // is a response without this set always an error?
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
                        sb.append("\nInvalid file access expiry reported - change File Access Expiry (HPCCFile) and retry");
                        break;
                    case RFCCodes.DAFSERR_cmdstream_authexpired:
                        sb.append("\nFile access expired before initial request - Retry and consider increasing File Access Expiry (HPCCFile)");
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
     * Retry with a cursor and read the reply.  Process failures as indicated.
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
