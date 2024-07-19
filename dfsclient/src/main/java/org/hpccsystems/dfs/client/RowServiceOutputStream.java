/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
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
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.AttributedCharacterIterator.Attribute;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.json.JSONObject;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.semconv.ServerAttributes;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.ecl.FieldDef;

/**
 * An output stream that uses the row service and HPCC Systems web services file creation APIs to write to a specific file part.
 */
public class RowServiceOutputStream extends OutputStream
{
    private static final Logger  log                           = LogManager.getLogger(RowServiceOutputStream.class);
    public static final int      DEFAULT_CONNECT_TIMEOUT_MILIS = 5000; // 5 second connection timeout
    public static final int      DEFAULT_SOCKET_OP_TIMEOUT_MS  = 15000; // 15 second timeout on reads
    private static int           SCRATCH_BUFFER_LEN            = 2048;

    private String               rowServiceVersion             = "";
    private String               rowServiceIP                  = null;
    private int                  rowServicePort                = -1;
    private FieldDef             recordDef                     = null;
    private String               filePath                      = null;
    private int                  filePartIndex                 = -1;
    private String               accessToken                   = null;
    private CompressionAlgorithm compressionAlgo               = CompressionAlgorithm.NONE;
    private int                  sockOpTimeoutMs               = DEFAULT_SOCKET_OP_TIMEOUT_MS;

    private Socket               socket                        = null;
    private DataInputStream      dis                           = null;
    private DataOutputStream     dos                           = null;

    private boolean              useOldProtocol                = false;
    private long                 bytesWritten                  = 0;
    private long                 handle                        = -1;
    private ByteBuffer           scratchBuffer                 = ByteBuffer.allocate(SCRATCH_BUFFER_LEN);

    private Span                 writeSpan                     = null;
    private String               traceContextHeader            = null;

    private static class RowServiceResponse
    {
        int len = 0;
        int errorCode = 0;
        int handle = -1;
        String errorMessage = null;
    }

    /**
     * Creates RowServiceOutputStream to be used to stream data to target dafilesrv on HPCC cluster
     * Assumes SSL connection required/available.
     *
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param accessToken
     *            the access token
     * @param recordDef
     *            the record def
     * @param filePartIndex
     *            the file part index
     * @param filePartPath
     *            the file part path
     * @param fileCompression
     *            the file compression
     * @throws Exception
     *             the exception
     * @deprecated -- use 8 param version instead which contains optional useSSL param
     */
    @Deprecated
    RowServiceOutputStream(String ip, int port, String accessToken, FieldDef recordDef, int filePartIndex, String filePartPath,
            CompressionAlgorithm fileCompression) throws Exception
    {
        this(ip, port, true, accessToken, recordDef, filePartIndex, filePartPath, fileCompression);
    }

    /**
     * Creates RowServiceOutputStream to be used to stream data to target dafilesrv on HPCC cluster.
     *
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param useSSL
     *            the use SSL
     * @param accessToken
     *            the access token
     * @param recordDef
     *            the record def
     * @param filePartIndex
     *            the file part index
     * @param filePartPath
     *            the file part path
     * @param fileCompression
     *            the file compression
     * @throws Exception
     *             the exception
     */
    RowServiceOutputStream(String ip, int port, boolean useSSL, String accessToken, FieldDef recordDef, int filePartIndex, String filePartPath,
            CompressionAlgorithm fileCompression) throws Exception
    {
        this(ip,port,useSSL,accessToken,recordDef,filePartIndex,filePartPath,fileCompression, DEFAULT_CONNECT_TIMEOUT_MILIS);
    }

    /**
     * Creates RowServiceOutputStream to be used to stream data to target dafilesrv on HPCC cluster.
     *
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param useSSL
     *            the use SSL
     * @param accessToken
     *            the access token
     * @param recordDef
     *            the record def
     * @param filePartIndex
     *            the file part index
     * @param filePartPath
     *            the file part path
     * @param fileCompression
     *            the file compression
     * @param connectTimeoutMs
     *            the socket connect timeout in ms (default is 5000)
     * @throws Exception
     *             the exception
     */
    RowServiceOutputStream(String ip, int port, boolean useSSL, String accessToken, FieldDef recordDef, int filePartIndex, String filePartPath,
            CompressionAlgorithm fileCompression, int connectTimeoutMs) throws Exception
    {
        this(ip,port,useSSL,accessToken,recordDef,filePartIndex,filePartPath,fileCompression, connectTimeoutMs, DEFAULT_SOCKET_OP_TIMEOUT_MS, null);
    }

    /**
     * Creates RowServiceOutputStream to be used to stream data to target dafilesrv on HPCC cluster.
     *
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param useSSL
     *            the use SSL
     * @param accessToken
     *            the access token
     * @param recordDef
     *            the record def
     * @param filePartIndex
     *            the file part index
     * @param filePartPath
     *            the file part path
     * @param fileCompression
     *            the file compression
     * @param connectTimeoutMs
     *            the socket connect timeout in ms (default is 5000)
     * @param socketOpTimeoutMS
     *            the socket operation(read/write) timeout in ms (default is 15000)
     * @throws Exception
     *             the exception
     */
    RowServiceOutputStream(String ip, int port, boolean useSSL, String accessToken, FieldDef recordDef, int filePartIndex, String filePartPath,
            CompressionAlgorithm fileCompression, int connectTimeoutMs, int sockOpTimeoutMS) throws Exception
    {
        this(ip,port,useSSL,accessToken,recordDef,filePartIndex,filePartPath,fileCompression, connectTimeoutMs, sockOpTimeoutMS, null);
    }

    /**
     * Creates RowServiceOutputStream to be used to stream data to target dafilesrv on HPCC cluster.
     *
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param useSSL
     *            the use SSL
     * @param accessToken
     *            the access token
     * @param recordDef
     *            the record def
     * @param filePartIndex
     *            the file part index
     * @param filePartPath
     *            the file part path
     * @param fileCompression
     *            the file compression
     * @param connectTimeoutMs
     *            the socket connect timeout in ms (default is 5000)
     * @param socketOpTimeoutMS
     *            the socket operation(read/write) timeout in ms (default is 15000)
     * @param writeSpan
     *            the opentelemetry span to use for tracing
     * @throws Exception
     *             the exception
     */
    RowServiceOutputStream(String ip, int port, boolean useSSL, String accessToken, FieldDef recordDef, int filePartIndex, String filePartPath,
            CompressionAlgorithm fileCompression, int connectTimeoutMs, int sockOpTimeoutMS, Span writeSpan) throws Exception
    {
        this.rowServiceIP = ip;
        this.rowServicePort = port;
        this.recordDef = recordDef;
        this.filePartIndex = filePartIndex;
        this.filePath = filePartPath;
        this.accessToken = accessToken;
        this.compressionAlgo = fileCompression;

        if (sockOpTimeoutMS < 0)
        {
            sockOpTimeoutMS = DEFAULT_SOCKET_OP_TIMEOUT_MS;
        }
        this.sockOpTimeoutMs = sockOpTimeoutMS;

        if (connectTimeoutMs < 0)
        {
            connectTimeoutMs = DEFAULT_CONNECT_TIMEOUT_MILIS;
        }

        if (writeSpan != null && writeSpan.getSpanContext().isValid())
        {
            this.writeSpan = writeSpan;
            this.traceContextHeader = org.hpccsystems.ws.client.utils.Utils.getTraceParentHeader(writeSpan);
        }

        if (this.writeSpan != null)
        {
            writeSpan.addEvent("RowServiceOutputStream.connect", getServerAttributes());
        }

        try
        {
            if (useSSL)
            {
                SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
                this.socket = (SSLSocket) ssf.createSocket();

                // Optimize for bandwidth over latency and connection time.
                // We are opening up a long standing connection and writing a significant amount of data
                // So we don't care as much about individual packet latency or connection time overhead
                socket.setPerformancePreferences(0, 1, 2);
                socket.connect(new InetSocketAddress(this.rowServiceIP, this.rowServicePort), connectTimeoutMs);

                log.debug("Attempting SSL handshake...");
                ((SSLSocket) this.socket).startHandshake();
                log.debug("SSL handshake successful...");
                log.debug("   Remote address = " + this.socket.getInetAddress().toString() + " Remote port = " + this.socket.getPort());
            }
            else
            {
                SocketFactory sf = SocketFactory.getDefault();
                this.socket = sf.createSocket();

                // Optimize for bandwidth over latency and connection time.
                // We are opening up a long standing connection and potentially reading a significant amount of
                // data
                // So we don't care as much about individual packet latency or connection time overhead
                this.socket.setPerformancePreferences(0, 1, 2);
                this.socket.connect(new InetSocketAddress(rowServiceIP, rowServicePort), DEFAULT_CONNECT_TIMEOUT_MILIS);
            }

            this.socket.setSoTimeout(sockOpTimeoutMs);

            this.dos = new DataOutputStream(socket.getOutputStream());
            this.dis = new DataInputStream(socket.getInputStream());

        }
        catch (Exception e)
        {
            String errorMessage = "Exception occured while attempting to connect to row service (" + rowServiceIP + ":" + rowServicePort + "): " + e.getMessage();
            log.error(errorMessage);

            Exception wrappedException = new Exception(errorMessage, e);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        //------------------------------------------------------------------------------
        // Check protocol version
        //------------------------------------------------------------------------------

        if (writeSpan != null)
        {
            writeSpan.addEvent("RowServiceOutputStream.versionRequest", getServerAttributes());
        }

        try
        {
            String msg = makeGetVersionRequest();
            int msgLen = msg.length();

            this.dos.writeInt(msgLen);
            this.dos.write(msg.getBytes(StandardCharsets.ISO_8859_1), 0, msgLen);
            this.dos.flush();
        }
        catch (IOException e)
        {
            HpccFileException wrappedException = new HpccFileException("Failed on initial remote read read trans", e);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        RowServiceResponse response = readResponse();
        if (response.len == 0)
        {
            useOldProtocol = true;
        }
        else
        {
            useOldProtocol = false;

            byte[] versionBytes = new byte[response.len];
            try
            {
                this.dis.readFully(versionBytes);
            }
            catch (IOException e)
            {
                HpccFileException wrappedException = new HpccFileException("Error while attempting to read version response.", e);
                if (writeSpan != null)
                {
                    writeSpan.recordException(wrappedException, getServerAttributes());
                }

                throw wrappedException;
            }

            rowServiceVersion = new String(versionBytes, StandardCharsets.ISO_8859_1);
        }

        // Go ahead and make the initial write request. This won't write any data to file
        // but it will cause the file to be opened on the remote server and keeps our access
        // token from expiring before we can start writing
        makeInitialWriteRequest();
    }

    private Attributes getServerAttributes()
    {
        return Attributes.of(ServerAttributes.SERVER_ADDRESS, this.rowServiceIP,
                             ServerAttributes.SERVER_PORT, Long.valueOf(this.rowServicePort));
    }

    private String makeGetVersionRequest()
    {
        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";

        final String versionMsg = RFCCodes.RFCStreamReadCmd + "{ \"command\" : \"version\", \"handle\": \"-1\", " + trace + " \"format\": \"binary\" }";
        return versionMsg;
    }

    private void makeInitialWriteRequest() throws Exception
    {
        String jsonRecordDef = RecordDefinitionTranslator.toJsonRecord(this.recordDef).toString();

        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";
        String initialRequest = "\n{\n"
                + "    \"format\" : \"binary\",\n"
                + trace
                + "    \"replyLimit\" : " + SCRATCH_BUFFER_LEN + ",\n"
                + (useOldProtocol ? "" : "\"command\" : \"newstream\",\n")
                + "    \"node\" : {\n"
                + "        \"kind\" : \"diskwrite\",\n"
                + "        \"metaInfo\" : \"" + this.accessToken + "\",\n"
                + "        \"fileName\" : \"" + this.filePath + "\",\n"
                + "        \"filePart\" : \"" + this.filePartIndex + "\",\n"
                + "        \"compressed\" : \"" + this.compressionAlgo + "\",\n"
                + "        \"input\" : " + jsonRecordDef + "\n"
                + "    }\n"
                + "}\n";

        // Resize scratch buffer if necessary
        byte[] jsonRequestData = initialRequest.getBytes("ISO-8859-1");

        ByteBuffer requestBuffer = ByteBuffer.allocate(jsonRequestData.length + 256);
        requestBuffer.mark();
        requestBuffer.putInt(0); // Placeholder for packetlen
        requestBuffer.put((byte) RFCCodes.RFCStreamGeneral);
        requestBuffer.putInt(jsonRequestData.length); // Subtract off RFC Code
        requestBuffer.put(jsonRequestData);

        int rowDataLen = 0;
        requestBuffer.putInt(rowDataLen);

        // Update packetlen
        int headerLen = requestBuffer.position();
        int packetLen = headerLen + rowDataLen - 4; // Packlen is not included
        requestBuffer.reset();
        requestBuffer.putInt(packetLen);

        this.dos.write(requestBuffer.array(), 0, headerLen);
        this.dos.flush();

        RowServiceResponse response = this.readResponse();
        this.handle = response.handle;

        if (response.errorCode != RFCCodes.RFCStreamNoError)
        {
            IOException wrappedException = new IOException(response.errorMessage);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }
    }

    private String makeCloseHandleRequest()
    {
        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";

        StringBuilder sb = new StringBuilder(256);
        sb.delete(0, sb.length());

        sb.append("{ \"format\" : \"binary\",\n");
        sb.append(trace);
        sb.append("  \"handle\" : \"" + Long.toString(this.handle) + "\",");
        sb.append("  \"command\" : \"close\"");
        sb.append("\n}");

        return sb.toString();
    }

    private void sendCloseFileRequest() throws IOException
    {
        if (useOldProtocol)
        {
            return;
        }

        String closeFileRequest = makeCloseHandleRequest();
        int jsonRequestLen = closeFileRequest.length();

        try
        {
            this.dos.writeInt(jsonRequestLen + 4 + 1);
            this.dos.write((int)RFCCodes.RFCStreamGeneral);
            this.dos.writeInt(jsonRequestLen);
            this.dos.write(closeFileRequest.getBytes(StandardCharsets.ISO_8859_1));
            this.dos.flush();
        }
        catch (IOException e)
        {
            IOException wrappedException = new IOException("Failed on close file with error: ", e);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        RowServiceResponse response = null;
        try
        {
            response = readResponse();
        }
        catch (HpccFileException e)
        {
            IOException wrappedException = new IOException("Failed to close file. Unable to read response with error: ", e);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        if (response.errorCode != RFCCodes.RFCStreamNoError)
        {
            IOException wrappedException = new IOException(response.errorMessage);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }
    }

    private RowServiceResponse readResponse() throws HpccFileException
    {
        RowServiceResponse response = new RowServiceResponse();
        try
        {
            response.len = dis.readInt();
            if (response.len < 0)
            {
                response.len &= 0x7FFFFFFF;
            }

            if (response.len == 0)
            {
                response.len = -1;
                return response;
            }

            response.errorCode = dis.readInt();
            response.len -= 4;

            if (response.errorCode != RFCCodes.RFCStreamNoError)
            {
                StringBuilder sb = new StringBuilder();
                sb.delete(0, sb.length());

                sb.append("\nReceived ERROR from Thor node (");
                sb.append(this.rowServiceIP);
                sb.append("): Code: '");
                sb.append(response.errorCode);
                sb.append("'");

                if (response.len > 0)
                {
                    byte[] message = new byte[response.len];
                    dis.readFully(message, 0, response.len);
                    sb.append(" Message: '");
                    sb.append(new String(message));
                    sb.append("'");
                }

                switch (response.errorCode)
                {
                    case RFCCodes.DAFSERR_cmdstream_invalidexpiry:
                        sb.append("\nInvalid file access expiry reported - change File Access Expiry (HPCCFile) and retry");
                        break;
                    case RFCCodes.DAFSERR_cmdstream_authexpired:
                        sb.append("\nFile access expired before initial request - Retry and consider increasing File Access Expiry (HPCCFile) to something greater than " + this.sockOpTimeoutMs);
                        break;
                    default:
                        break;
                }

                response.len = -1;
                response.errorMessage = sb.toString();
                return response;
            }

            if (response.len < 4)
            {
                HpccFileException wrappedException = new HpccFileException("Early data termination, no handle");
                if (writeSpan != null)
                {
                    writeSpan.recordException(wrappedException, getServerAttributes());
                }

                throw wrappedException;
            }

            response.handle = dis.readInt();
            response.len -= 4;
        }
        catch (IOException e)
        {
            HpccFileException wrappedException = new HpccFileException("Error while attempting to read row service response: ", e);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        return response;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.io.OutputStream#close()
     */
    public void close() throws IOException
    {
        this.flush();

        if (!useOldProtocol)
        {
            this.sendCloseFileRequest();
        }
        else if (bytesWritten == 0 && compressionAlgo != CompressionAlgorithm.NONE)
        {
            IOException wrappedException = new IOException("Fatal error while closing file. Writing compressed files with 0 length is not supported with the remote HPCC cluster.");
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        this.socket.close();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.io.OutputStream#flush()
     */
    public void flush() throws IOException
    {
        this.dos.flush();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.io.OutputStream#write(byte[])
     */
    public void write(byte[] b) throws IOException
    {
        this.write(b, 0, b.length);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.io.OutputStream#write(byte[], int, int)
     */
    public void write(byte[] b, int off, int len) throws IOException
    {
        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";

        String request = "{ \"format\" : \"binary\", \"handle\" : \"" + this.handle + "\","
                       + trace
                       + (useOldProtocol ? "" : "\"command\" : \"continue\"") + " }";
        byte[] jsonRequestData = request.getBytes("ISO-8859-1");

        this.scratchBuffer.clear();
        this.scratchBuffer.mark();
        this.scratchBuffer.putInt(0); // Placeholder for packetlen
        this.scratchBuffer.put((byte) RFCCodes.RFCStreamGeneral);
        this.scratchBuffer.putInt(jsonRequestData.length); // Subtract RFCCode char out
        this.scratchBuffer.put(jsonRequestData);

        int rowDataLen = len;
        this.scratchBuffer.putInt(rowDataLen);

        // Update packetlen
        int headerLen = this.scratchBuffer.position();
        int packetLen = headerLen + len - 4; // Packlen is not included
        this.scratchBuffer.reset();
        this.scratchBuffer.putInt(packetLen);

        this.dos.write(this.scratchBuffer.array(), 0, headerLen);
        this.dos.write(b, off, len);
        this.dos.flush();

        bytesWritten += len;

        RowServiceResponse response = null;
        try
        {
            response = readResponse();
            this.handle = response.handle;
        }
        catch (HpccFileException e)
        {
            IOException wrappedException = new IOException("Failed during write operation. Unable to read response with error: ", e);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }

        if (response.errorCode != RFCCodes.RFCStreamNoError)
        {
            IOException wrappedException = new IOException(response.errorMessage);
            if (writeSpan != null)
            {
                writeSpan.recordException(wrappedException, getServerAttributes());
            }

            throw wrappedException;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.io.OutputStream#write(int)
     */
    public void write(int b) throws IOException
    {
        this.scratchBuffer.array()[0] = (byte) b;
        this.write(scratchBuffer.array(), 0, 1);
    }
}
