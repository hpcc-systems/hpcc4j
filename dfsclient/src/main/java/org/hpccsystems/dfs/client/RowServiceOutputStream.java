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
import java.io.OutputStream;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.json.JSONObject;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.ecl.FieldDef;

public class RowServiceOutputStream extends OutputStream
{
    private static final Logger  log                           = LogManager.getLogger(RowServiceOutputStream.class);
    private static int           DEFAULT_CONNECT_TIMEOUT_MILIS = 1000;                                              // 1 second connection timeout
    private static int           SCRATCH_BUFFER_LEN            = 2048;

    private String               rowServiceIP                  = null;
    private int                  rowServicePort                = -1;
    private FieldDef             recordDef                     = null;
    private String               filePath                      = null;
    private int                  filePartIndex                 = -1;
    private String               accessToken                   = null;
    private CompressionAlgorithm compressionAlgo               = CompressionAlgorithm.NONE;

    private Socket               socket                        = null;

    private long                 handle                        = -1;
    private ByteBuffer           scratchBuffer                 = ByteBuffer.allocate(SCRATCH_BUFFER_LEN);

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
        this.rowServiceIP = ip;
        this.rowServicePort = port;
        this.recordDef = recordDef;
        this.filePartIndex = filePartIndex;
        this.filePath = filePartPath;
        this.accessToken = accessToken;
        this.compressionAlgo = fileCompression;

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
                socket.connect(new InetSocketAddress(this.rowServiceIP, this.rowServicePort), DEFAULT_CONNECT_TIMEOUT_MILIS);

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
        }
        catch (Exception e)
        {
            String errorMessage = "Exception occured while attempting to connect to row service: " + e.getMessage();
            log.error(errorMessage);
            throw new Exception(errorMessage);
        }

        // Go ahead and make the initial write request. This won't write any data to file
        // but it will cause the file to be opened on the remote server and keeps our access
        // token from expiring before we can start writing
        makeInitialWriteRequest();
    }

    /**
     * Make initial write request.
     *
     * @throws Exception
     *             the exception
     */
    private void makeInitialWriteRequest() throws Exception
    {
        String jsonRecordDef = RecordDefinitionTranslator.toJsonRecord(this.recordDef).toString();

        String initialRequest = "\n{\n" + "    \"format\" : \"binary\",\n" + "    \"replyLimit\" : " + SCRATCH_BUFFER_LEN + ",\n"
                + "    \"node\" : {\n" + "        \"kind\" : \"diskwrite\",\n" + "        \"metaInfo\" : \"" + this.accessToken + "\",\n"
                + "        \"fileName\" : \"" + this.filePath + "\",\n" + "        \"filePart\" : \"" + this.filePartIndex + "\",\n"
                + "        \"compressed\" : \"" + this.compressionAlgo + "\",\n" + "        \"input\" : " + jsonRecordDef + "\n" + "    }\n" + "}\n";

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

        this.socket.getOutputStream().write(requestBuffer.array(), 0, headerLen);
        this.socket.getOutputStream().flush();
        this.readResponse();
    }

    /**
     * Read response.
     *
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private void readResponse() throws IOException
    {
        this.scratchBuffer.clear();
        this.socket.getInputStream().read(scratchBuffer.array(), 0, 4);
        int len = scratchBuffer.getInt() & 0x7FFFFFFF;

        // We should always have a status & handle returned by the row service
        if (len < 8)
        {
            throw new IOException("Received short or truncated response from row service. Aborting.");
        }

        this.socket.getInputStream().read(scratchBuffer.array(), 4, len);

        int status = this.scratchBuffer.getInt();
        if (status != RFCCodes.RFCStreamNoError)
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Row service returned error code: '");
            sb.append(status);
            sb.append("'");

            if (len - 4 > 0)
            {
                final byte[] bytes = new byte[scratchBuffer.remaining()];
                scratchBuffer.get(bytes);
                sb.append(" Message: '");
                sb.append(new String(bytes));
                sb.append("'");
            }
            sb.append(" - Aborting.");

            throw new IOException(sb.toString());
        }

        this.handle = this.scratchBuffer.getInt();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.OutputStream#close()
     */
    public void close() throws IOException
    {
        this.flush();
        this.socket.close();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.OutputStream#flush()
     */
    public void flush() throws IOException
    {
        this.socket.getOutputStream().flush();
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
        String request = "{ \"format\" : \"binary\", \"handle\" : \"" + this.handle + "\" }";
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

        this.socket.getOutputStream().write(this.scratchBuffer.array(), 0, headerLen);
        this.socket.getOutputStream().write(b, off, len);
        this.socket.getOutputStream().flush();
        this.readResponse();
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
