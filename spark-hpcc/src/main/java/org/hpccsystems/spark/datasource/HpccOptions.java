package org.hpccsystems.spark.datasource;

import java.util.TreeMap;

import org.hpccsystems.dfs.client.CompressionAlgorithm;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * A helper class that extracts options from the key value pairs provided by Spark.
 */
public class HpccOptions
{
    public Connection           connectionInfo = null;
    public String               clusterName    = null;
    public String               fileName       = null;
    public String               projectList    = null;
    public CompressionAlgorithm compression    = CompressionAlgorithm.DEFAULT;
    public String               filterString   = null;
    public int                  expirySeconds  = 120;
    public int                  filePartLimit  = -1;
    public boolean              useTLK         = false;

    public String               traceID        = "";
    public String               spanID         = "";

    public HpccOptions(TreeMap<String, String> parameters) throws Exception
    {
        // Extract connection
        String connectionString = null;
        if (parameters.containsKey("host"))
        {
            connectionString = (String) parameters.get("host");
        }

        String username = null;
        if (parameters.containsKey("username"))
        {
            username = (String) parameters.get("username");
        }

        String password = null;
        if (parameters.containsKey("password"))
        {
            password = (String) parameters.get("password");
        }

        connectionInfo = new Connection(connectionString);
        connectionInfo.setUserName(username);
        connectionInfo.setPassword(password);

        if (parameters.containsKey("path"))
        {
            fileName = (String) parameters.get("path");

            // Remove leading forward slashes
            fileName = fileName.replaceAll("^/+", "");

            String[] filePathParts = fileName.split("/|::");
            fileName = String.join("::", filePathParts);

        }

        if (parameters.containsKey("cluster"))
        {
            clusterName = (String) parameters.get("cluster");
        }

        // Use default value in HpccOptions
        if (parameters.containsKey("fileaccesstimeout"))
        {
            String timeoutStr = (String) parameters.get("fileaccesstimeout");
            expirySeconds = Integer.parseInt(timeoutStr);
        }

        if (parameters.containsKey("limitperfilepart"))
        {
            String limitStr = (String) parameters.get("limitperfilepart");
            filePartLimit = Integer.parseInt(limitStr);
        }

        if (parameters.containsKey("projectlist"))
        {
            projectList = (String) parameters.get("projectlist");
        }

        if (parameters.containsKey("usetlk"))
        {
            String useTLKStr = (String) parameters.get("usetlk");
            useTLK = Boolean.parseBoolean(useTLKStr.toLowerCase());
        }

        compression = CompressionAlgorithm.DEFAULT;
        if (parameters.containsKey("compression"))
        {

            String compressionStr = (String) parameters.get("compression");
            compressionStr = compressionStr.toLowerCase();

            switch (compressionStr)
            {
                case "none":
                {
                    compression = CompressionAlgorithm.NONE;
                    break;
                }
                case "lz4":
                {
                    compression = CompressionAlgorithm.LZ4;
                    break;
                }
                case "flz":
                {
                    compression = CompressionAlgorithm.FLZ;
                    break;
                }
                case "lzw":
                {
                    compression = CompressionAlgorithm.LZW;
                    break;
                }
                default:
                {
                    compression = CompressionAlgorithm.DEFAULT;
                    break;
                }
            }
        }

        if (parameters.containsKey("filter"))
        {
            filterString = (String) parameters.get("filter");
        }

        if (parameters.containsKey("traceid"))
        {
            traceID = (String) parameters.get("traceid");
        }

        if (parameters.containsKey("spanid"))
        {
            spanID = (String) parameters.get("spanid");
        }
    }

    @Override
    public String toString()
    {
        String tostring = "[Connection: '" +  connectionInfo + "', " + "clusterName: '" + clusterName;
        tostring += "', fileName: '" + fileName + "', projectList: '" + projectList + "', compression: '" + compression + "',";
        tostring += "filterString: '" + filterString + "', " + "expirySeconds: '" + expirySeconds + "', filePartLimit: '" + filePartLimit + "']";

        return tostring;
    }
}
