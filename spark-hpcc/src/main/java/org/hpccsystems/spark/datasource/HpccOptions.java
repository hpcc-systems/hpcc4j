package org.hpccsystems.spark.datasource;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;

import org.hpccsystems.dfs.client.BinaryRecordReader;
import org.hpccsystems.dfs.client.CompressionAlgorithm;
import org.hpccsystems.ws.client.utils.Connection;

import org.hpccsystems.spark.HpccFile;

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
    public double               recordSamplingRate   = HpccFile.MAX_RECORD_SAMPLING_RATE;
    public long                 recordSamplingSeed   = HpccFile.USE_RANDOM_SEED;
    public boolean              useTLK         = false;
    public int                  stringProcessingFlags = BinaryRecordReader.NO_STRING_PROCESSING;
    public List<Integer>        fileParts      = new ArrayList<Integer>();

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

        if (parameters.containsKey("stringprocessing"))
        {
            String flagsStr = (String) parameters.get("stringprocessing");
            flagsStr = flagsStr.toLowerCase();

            String[] flagParts = flagsStr.split(",");
            for (String part : flagParts)
            {
                switch (part.trim())
                {
                    case "none":
                        stringProcessingFlags = BinaryRecordReader.NO_STRING_PROCESSING;
                        break;
                    case "trim":
                        stringProcessingFlags |= BinaryRecordReader.TRIM_STRINGS;
                        break;
                    case "trim_fixed":
                        stringProcessingFlags |= BinaryRecordReader.TRIM_FIXED_LEN_STRINGS;
                        break;
                    case "empty_to_null":
                        stringProcessingFlags |= BinaryRecordReader.CONVERT_EMPTY_STRINGS_TO_NULL;
                        break;
                    default:
                        throw new Exception("Invalid string processing flag: " + part);
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

        if (parameters.containsKey("recordsamplingrate"))
        {
            String recordSamplingRateStr = (String) parameters.get("recordsamplingrate");
            try
            {
                recordSamplingRate = Double.parseDouble(recordSamplingRateStr);
                if (recordSamplingRate < HpccFile.MIN_RECORD_SAMPLING_RATE)
                {
                    recordSamplingRate = HpccFile.MIN_RECORD_SAMPLING_RATE;
                }
                else if (recordSamplingRate > HpccFile.MAX_RECORD_SAMPLING_RATE)
                {
                    recordSamplingRate = HpccFile.MAX_RECORD_SAMPLING_RATE;
                }
            }
            catch (NumberFormatException e)
            {
                throw new Exception("Invalid sampling rate: " + recordSamplingRateStr, e);
            }
        }

        if (parameters.containsKey("recordsamplingseed"))
        {
            String recordSamplingSeedStr = (String) parameters.get("recordsamplingseed");
            try
            {
                recordSamplingSeed = Long.parseLong(recordSamplingSeedStr);
                if (recordSamplingSeed < 0)
                {
                    recordSamplingSeed = HpccFile.USE_RANDOM_SEED;
                }
            }
            catch (NumberFormatException e)
            {
                throw new Exception("Invalid sampling seed: " + recordSamplingSeedStr, e);
            }
        }

        if (parameters.containsKey("fileparts"))
        {
            String filePartsStr = (String) parameters.get("fileparts");
            String[] filePartsStrArray = filePartsStr.split(",");
            for (String filePartStr : filePartsStrArray)
            {
                filePartStr = filePartStr.trim();
                // Check if str is a range
                if (filePartStr.contains("-"))
                {
                    int start = 0, end = 0;
                    String[] range = filePartStr.split("-");
                    try
                    {
                        start = Integer.parseInt(range[0]);
                        end = Integer.parseInt(range[1]);
                    }
                    catch (NumberFormatException e)
                    {
                        throw new Exception("Invalid fileParts range: " + filePartStr, e);
                    }

                    for (int i = start; i <= end; i++)
                    {
                        fileParts.add(i);
                    }
                } 
                else
                {
                    try 
                    {
                        fileParts.add(Integer.parseInt(filePartStr));
                    }
                    catch (NumberFormatException e)
                    {
                        throw new Exception("Invalid fileParts value: " + filePartStr, e);
                    }
                }
            }
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
