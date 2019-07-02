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
import java.util.Comparator;

import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.dfs.cluster.ClusterRemapper;
import org.hpccsystems.ws.client.platform.DFUFilePartInfo;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;

/**
 * A partition of data.  One physical file
 * or key accessed by HPCC remote read.
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

    public static enum FileType
    {
        FLAT("disk",true),  // disk is the prefix used in dafilesrv for flat files
        INDEX("index",true),
        CSV("csv",false),
        XML("xml",false);

        private String  name             = null;
        private boolean typeCanBeDeduced = false;

        FileType(String type, boolean deduced)
        {
            name = type;
            typeCanBeDeduced = deduced;
        }

        public String toString()
        {
            return name;
        }

        public boolean typeCanBeDeduced()
        {
            return typeCanBeDeduced;
        }
    };

    public DataPartition(String[] copyLocations, String[] copyPaths, int partNum, int numParts, int rowServicePort, boolean shouldUseSSL,
            String fileAccessBlob)
    {
        this(copyLocations, copyPaths, partNum, numParts, rowServicePort, shouldUseSSL, null, fileAccessBlob);
    }
    /**
     * Construct the data part, used by makeParts
     * @param copylocations locations of all copies of this file part
     * @param partNum part number
     * @param numParts number of parts
     * @param clearport port number of clear communications
     * @param sslport port number of ssl communications
     * @param filter the file filter object
     * @param fileAccessBlob file access token
     */
    private DataPartition(String[] copyLocations, String[] copyPaths, int partNum, int numParts, int rowServicePort, boolean shouldUseSSL, FileFilter filter,
            String fileAccessBlob)
    {
        this(copyLocations, copyPaths, partNum, numParts, rowServicePort, shouldUseSSL, null, fileAccessBlob, FileType.FLAT);
    }

    /**
     * Construct the data part, used by makeParts
     * @param copylocations locations of all copies of this file part
     * @param this_part part number
     * @param num_parts number of parts
     * @param clearport port number of clear communications
     * @param sslport port number of ssl communications
     * @param filter the file filter object
     * @param fileAccessBlob file access token
     * @param FileType underlying file format for this data partition
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
     * Security access blob
     * @return security access blob
     */
    public String getFileAccessBlob()
    {
        return this.fileAccessBlob;
    }

    /**
     * The underying file format for this partition 
     * @return file type
     */
    public FileType getFileType()
    {
        return this.fileType;
    }

    /**
     * File part copy locations
     * @return copy locations
     */
    public String[] getCopyLocations()
    {
        return this.copyLocations;
    }

    /**
     * Location of the ith copy of this file part
     * @return ip address
     */
    public String getCopyIP(int copyindex)
    {
        int copiescount = copyLocations.length;
        if (copyindex < 0 || copyindex >= copiescount) return null;

        return copyLocations[copyindex];
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
     * Port used for SSL communication
     * @return port
     */
    public boolean getUseSsl()
    {
        return useSSL;
    }

    /**
     * Copy Path
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
     * This part's id
     * @return the id of this part
     */
    public int getThisPart()
    {
        return this.this_part;
    }

    /**
     * Number of parts for this file
     * @return number of parts
     */
    public int getNumParts()
    {
        return this.num_parts;
    }

    /**
     * The filter object to select specific rows
     * @return the filter object.
     */
    public FileFilter getFilter()
    {
        return this.fileFilter;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getThisPart());
        sb.append(" copy locations: {");
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
     * @param fdis the file detail information, multiple if multiple sub-files
     * @param remap_info remap the IP or ports
     * @param max_parts the maximum number of partitions or zero for no limit
     * @return an array of partitions
     * @throws HpccFileException
     */
    public static DataPartition[] createPartitions(DFUFilePartWrapper[] dfupartcopies, ClusterRemapper clusterremapper, int max_parts,
            String fileAccessBlob) throws HpccFileException
    {
        return createPartitions(dfupartcopies, clusterremapper, max_parts, FileFilter.nullFilter(), fileAccessBlob);
    }

    public static DataPartition[] createPartitions(DFUFilePartWrapper[] dfuparts, ClusterRemapper clusterremapper, int max_parts, FileFilter filter,
            String fileAccessBlob) throws HpccFileException
    {
        return createPartitions(dfuparts, clusterremapper, max_parts, FileFilter.nullFilter(), fileAccessBlob, FileType.FLAT);
    }
    
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
                        dfuparts.length, clusterremapper.revisePort(null), clusterremapper.getUsesSSLConnection(null), filter, fileAccessBlob, fileType);
                rslt[i] = new_dp;
            }
        }
        catch (Exception e)
        {
            throw new HpccFileException("Could not create DataPartition!\n" + e.getMessage());
        }
        return rslt;
    }

    /* (non-Javadoc)
     * @see org.apache.spark.Partition#index()
     */
    public int index()
    {
        return this.this_part - 1;
    }
}
