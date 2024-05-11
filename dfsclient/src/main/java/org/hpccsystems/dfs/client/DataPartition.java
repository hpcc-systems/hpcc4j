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

import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.dfs.cluster.ClusterRemapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;

/**
 * A partition of data. One physical file or key accessed by HPCC Systems remote read.
 */
public class DataPartition implements Serializable
{
    public static final long serialVersionUID = 1L;
    private String[]         copyLocations;
    private String[]         copyPaths;
    private int              this_part;
    private int              num_parts;
    private int              rowservicePort;
    private boolean          useSSL;
    private FileFilter       fileFilter;
    private String           fileAccessBlob;
    private FileType         fileType;
    private boolean          isTLK;

    public static enum FileType
    {
        FLAT (
                "disk", true
        ), // disk is the prefix used in dafilesrv for flat files
        INDEX (
                "index", true
        ), INDEX_LOCAL (
                "indexlocal", true
        ), INDEX_PARTITIONED (
                "indexpartitioned", true
        ), JSON (
                "json", true
        ), CSV (
                "csv", false
        ), XML (
                "xml", false
        );

        private String  name             = null;
        private boolean typeCanBeDeduced = false;

        /**
         * Instantiates a new file type.
         *
         * @param type
         *            the type
         * @param deduced
         *            the deduced
         */
        FileType(String type, boolean deduced)
        {
            name = type;
            typeCanBeDeduced = deduced;
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Enum#toString()
         */
        public String toString()
        {
            return name;
        }

        /**
         * Type can be deduced.
         *
         * @return true, if successful
         */
        public boolean typeCanBeDeduced()
        {
            return typeCanBeDeduced;
        }

        public static FileType fromWrappedFileType(DFUFileTypeWrapper wrappedType) throws Exception
        {
            switch (wrappedType)
            {
                case Flat:
                    return FileType.FLAT;
                case Index:
                    return FileType.INDEX;
                case Xml:
                    return FileType.XML;
                case Csv:
                    return FileType.CSV;
                case Json:
                    return FileType.JSON;
                case IndexLocal:
                    return FileType.INDEX_LOCAL;
                case IndexPartitioned:
                    return FileType.INDEX_PARTITIONED;
                default:
                    throw new Exception("Unknown file type: " + wrappedType);
            }
        }
    };

    /**
     * Instantiates a new data partition.
     *
     * @param copyLocations
     *            the copy locations
     * @param copyPaths
     *            the copy paths
     * @param partNum
     *            the part num
     * @param numParts
     *            the num parts
     * @param rowServicePort
     *            the row service port
     * @param shouldUseSSL
     *            the should use SSL
     * @param fileAccessBlob
     *            the file access blob
     */
    public DataPartition(String[] copyLocations, String[] copyPaths, int partNum, int numParts, int rowServicePort, boolean shouldUseSSL,
            String fileAccessBlob)
    {
        this(copyLocations, copyPaths, partNum, numParts, rowServicePort, shouldUseSSL, null, fileAccessBlob);
    }

    /**
     * Construct the data part, used by makeParts.
     *
     * @param copyLocations
     *            the copy locations
     * @param copyPaths
     *            the copy paths
     * @param partNum
     *            part number
     * @param numParts
     *            number of parts
     * @param rowServicePort
     *            the row service port
     * @param shouldUseSSL
     *            the should use SSL
     * @param filter
     *            the file filter object
     * @param fileAccessBlob
     *            file access token
     */
    private DataPartition(String[] copyLocations, String[] copyPaths, int partNum, int numParts, int rowServicePort, boolean shouldUseSSL,
            FileFilter filter, String fileAccessBlob)
    {
        this(copyLocations, copyPaths, partNum, numParts, rowServicePort, shouldUseSSL, null, fileAccessBlob, FileType.FLAT);
    }

    /**
     * Construct the data part, used by makeParts.
     *
     * @param copylocations
     *            locations of all copies of this file part
     * @param copyPaths
     *            the copy paths
     * @param this_part
     *            part number
     * @param num_parts
     *            number of parts
     * @param clearport
     *            port number of clear communications
     * @param sslport
     *            port number of ssl communications
     * @param filter
     *            the file filter object
     * @param fileAccessBlob
     *            file access token
     * @param fileType
     *            the file type
     */
    private DataPartition(String[] copylocations, String[] copyPaths, int this_part, int num_parts, int clearport, boolean sslport, FileFilter filter,
            String fileAccessBlob, FileType fileType)
    {
        this.this_part = this_part;
        this.num_parts = num_parts;
        this.rowservicePort = clearport;
        this.useSSL = sslport;
        this.fileFilter = filter;
        if (this.fileFilter == null)
        {
            this.fileFilter = new FileFilter();
        }
        this.fileType = fileType;

        this.fileAccessBlob = fileAccessBlob;
        this.copyLocations = copylocations;
        this.copyPaths = copyPaths;
    }

    /**
     * Security access blob.
     *
     * @return security access blob
     */
    public String getFileAccessBlob()
    {
        return this.fileAccessBlob;
    }

    /**
     * Set the security access blob.
     *
     * @param accessBlob security access blob
     */
    public void setFileAccessBlob(String accessBlob)
    {
        this.fileAccessBlob = accessBlob;
    }

    /**
     * The underying file format for this partition .
     *
     * @return file type
     */
    public FileType getFileType()
    {
        return this.fileType;
    }

    /**
     * File part copy locations.
     *
     * @return copy locations
     */
    public String[] getCopyLocations()
    {
        return this.copyLocations;
    }

    /**
     * Location of the ith copy of this file part.
     *
     * @param copyindex
     *            the copyindex
     * @return ip address
     */
    public String getCopyIP(int copyindex)
    {
        int copiescount = copyLocations.length;
        if (copyindex < 0 || copyindex >= copiescount)
        {
            return null;
        }

        return copyLocations[copyindex];
    }

    /**
     * Set the copy IP
     *
     * @param copyIndex
     *            the copyindex
     * @param copyIP The IP of the file part copy
     */
    public void setCopyIP(int copyIndex, String copyIP)
    {
        if (copyIndex < 0 || copyIndex >= copyLocations.length)
        {
            return;
        }

        copyLocations[copyIndex] = copyIP;
    }

    /**
     * Add file part copy
     *
     * @param index The index at which to insert the file part copy
     * @param copyIP The IP of the new file part copy
     * @param copyPath The path of the new file part copy
     * @throws Exception The exception
     */
    public void add(int index, String copyIP, String copyPath) throws Exception
    {
        if (index < 0 || index > copyLocations.length)
        {
            throw new InvalidParameterException("Insertion index: " + index + " is invalid."
                        + "Expected index in range of: [0," + copyLocations.length + "]");
        }

        if (copyIP == null || copyPath == null)
        {
            throw new InvalidParameterException("Copy IP or Path are invalid, must be non-null.");
        }

        List<String> copyLocationsList = new ArrayList<>(Arrays.asList(copyLocations));
        copyLocationsList.add(index, copyIP);
        copyLocations = copyLocationsList.toArray(new String[0]);

        List<String> copyPathList = new ArrayList<>(Arrays.asList(copyPaths));
        copyPathList.add(index, copyPath);
        copyPaths = copyPathList.toArray(new String[0]);
    }

    /**
     * Count of copies available for this file part.
     * @return copy locations size
     */
    public int getCopyCount()
    {
        return copyLocations.length;
    }

    /**
     * Port used for communication in clear.
     * @return port number
     */
    public int getPort()
    {
        return rowservicePort;
    }

    /**
     * Port used for SSL communication.
     *
     * @return port
     */
    public boolean getUseSsl()
    {
        return useSSL;
    }

    /**
     * Copy Path.
     *
     * @param index
     *            the index
     * @return name
     */
    public String getCopyPath(int index)
    {
        if (index >= copyPaths.length)
        {
            return null;
        }

        return copyPaths[index];
    }

    /**
     * This part's id.
     *
     * @return the id of this part
     */
    public int getThisPart()
    {
        return this.this_part;
    }

    /**
     * Number of parts for this file.
     *
     * @return number of parts
     */
    public int getNumParts()
    {
        return this.num_parts;
    }

    /**
     * The filter object to select specific rows.
     *
     * @return the filter object.
     */
    public FileFilter getFilter()
    {
        return this.fileFilter;
    }

    /**
     * Set the filter object to select specific rows.
     *
     * @param filter file filter
     * @return the partition
     */
    public DataPartition setFilter(FileFilter filter)
    {
        this.fileFilter = filter;
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("part ").append(this.getThisPart()).append(", copy locations: {");
        for (int copyindex = 0; copyindex < getCopyCount(); copyindex++)
        {
            if (copyindex > 0) sb.append(", ");
            sb.append(this.getCopyIP(copyindex));
        }
        sb.append("} :");
        sb.append(this.getPort());
        return sb.toString();
    }

    /**
     * Make an array of data partitions for the supplied HPCC File.
     *
     * @param dfupartcopies
     *            the dfupartcopies
     * @param clusterremapper
     *            the clusterremapper
     * @param max_parts
     *            the maximum number of partitions or zero for no limit
     * @param fileAccessBlob
     *            the file access blob
     * @return an array of partitions
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public static DataPartition[] createPartitions(DFUFilePartWrapper[] dfupartcopies, ClusterRemapper clusterremapper, int max_parts,
            String fileAccessBlob) throws HpccFileException
    {
        return createPartitions(dfupartcopies, clusterremapper, max_parts, FileFilter.nullFilter(), fileAccessBlob);
    }

    /**
     * Creates the partitions.
     *
     * @param dfuparts
     *            the dfuparts
     * @param clusterremapper
     *            the clusterremapper
     * @param max_parts
     *            the max parts
     * @param filter
     *            the filter
     * @param fileAccessBlob
     *            the file access blob
     * @return the data partition[]
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public static DataPartition[] createPartitions(DFUFilePartWrapper[] dfuparts, ClusterRemapper clusterremapper, int max_parts, FileFilter filter,
            String fileAccessBlob) throws HpccFileException
    {
        return createPartitions(dfuparts, clusterremapper, max_parts, FileFilter.nullFilter(), fileAccessBlob, FileType.FLAT);
    }

    /**
     * Creates the partitions.
     *
     * @param dfuparts
     *            the dfuparts
     * @param clusterremapper
     *            the clusterremapper
     * @param max_parts
     *            the max parts
     * @param filter
     *            the filter
     * @param fileAccessBlob
     *            the file access blob
     * @param fileType
     *            the file type
     * @return the data partition[]
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public static DataPartition[] createPartitions(DFUFilePartWrapper[] dfuparts, ClusterRemapper clusterremapper, int max_parts, FileFilter filter,
            String fileAccessBlob, FileType fileType) throws HpccFileException
    {
        DataPartition[] rslt = new DataPartition[dfuparts.length];

        try
        {
            for (int i = 0; i < dfuparts.length; i++)
            {
                int numCopies = dfuparts[i].getCopies().length;
                String[] copyPaths = new String[numCopies];
                for (int j = 0; j < numCopies; j++)
                {
                    copyPaths[j] = dfuparts[i].getCopies()[j].getCopyPath();
                }

                DataPartition new_dp = new DataPartition(clusterremapper.reviseIPs(dfuparts[i].getCopies()), copyPaths, dfuparts[i].getPartIndex(),
                        dfuparts.length, clusterremapper.revisePort(null), clusterremapper.getUsesSSLConnection(null), filter, fileAccessBlob,
                        fileType);
                new_dp.isTLK = dfuparts[i].isTopLevelKey();

                rslt[i] = new_dp;
            }
        }
        catch (Exception e)
        {
            throw new HpccFileException("Could not create DataPartition!\n" + e.getMessage());
        }
        return rslt;
    }

    /**
     * Index.
     *
     * @return the int
     */
    public int index()
    {
        return this.this_part - 1;
    }

    /**
     * Is this data partition the TLK
     *
     * @return isTLK
     */
    public boolean isTLK()
    {
        return this.isTLK;
    }

}
