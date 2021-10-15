/*
 * ##############################################################################
 *
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
 * ##############################################################################
 */

package org.hpccsystems.dfs.client;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.util.UUID;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.dfs.cluster.ClusterRemapper;
import org.hpccsystems.dfs.cluster.RemapInfo;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.json.JSONObject;

/**
 * Access to file content on a collection of one or more HPCC Systems clusters.
 *
 */
public class HPCCFile implements Serializable
{
    static private final long    serialVersionUID              = 1L;

    private static final Logger  log                           = LogManager.getLogger(HPCCFile.class);

    private DataPartition[]      dataParts;
    private DataPartition        tlkPartition                  = null;
    private PartitionProcessor   partitionProcessor            = null;
    private long                 dataPartsCreationTimeMS       = -1;

    private FieldDef             recordDefinition;
    private FieldDef             projectedRecordDefinition;
    private boolean              isIndex                       = false;
    static private final int     DEFAULT_ACCESS_EXPIRY_SECONDS = 120;
    private int                  fileAccessExpirySecs          = DEFAULT_ACCESS_EXPIRY_SECONDS;

    private transient Connection espConnInfo;
    private String               fileName;
    private String               targetfilecluster             = "";
    private RemapInfo            clusterRemapInfo              = new RemapInfo();
    private FileFilter           filter;
    private ColumnPruner         columnPruner;
    private DFUFileDetailWrapper originalFileMetadata          = null;
    /**
     * Constructor for the HpccFile. Captures HPCC logical file information from the DALI Server for the clusters behind
     * the ESP named by the Connection.
     *
     * @param fileName
     *            The HPCC file name
     * @param espconninfo
     *            The ESP connection info (protocol,address,port,user,pass)
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public HPCCFile(String fileName, Connection espconninfo) throws HpccFileException
    {
        this(fileName, espconninfo, "", "", new RemapInfo(), 0, "");
    }

    /**
     * Constructor for the HpccFile. Captures HPCC logical file information from the DALI Server for the clusters behind
     * the ESP named by the Connection.
     *
     * @param fileName
     *            The HPCC file name
     * @param connectionString
     *            to eclwatch. Format: {http|https}://{HOST}:{PORT}.
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @throws MalformedURLException
     *             the malformed URL exception
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public HPCCFile(String fileName, String connectionString, String user, String pass) throws MalformedURLException, HpccFileException
    {
        this(fileName, new Connection(connectionString));
        espConnInfo.setUserName(user);
        espConnInfo.setPassword(pass);
    }

    /**
     * Constructor for the HpccFile. Captures HPCC logical file information from the DALI Server for the clusters behind
     * the ESP named by the IP address and re-maps the address information for the THOR nodes to visible addresses when
     * the THOR clusters are virtual.
     *
     * @param fileName
     *            The HPCC file name
     * @param espconninfo
     *            the espconninfo
     * @param targetColumnList
     *            a comma separated list of column names in dotted notation for columns within compound columns.
     * @param filter
     *            a file filter to select records of interest (SQL where syntax)
     * @param remap_info
     *            address and port re-mapping info for THOR cluster
     * @param maxParts
     *            optional the maximum number of partitions or zero for no max
     * @param targetfilecluster
     *            optional - the hpcc cluster the target file resides in
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public HPCCFile(String fileName, Connection espconninfo, String targetColumnList, String filter, RemapInfo remap_info, int maxParts,
            String targetfilecluster) throws HpccFileException
    {
        this.fileName = fileName;
        this.recordDefinition = null;
        this.projectedRecordDefinition = null;
        this.columnPruner = new ColumnPruner(targetColumnList);
        this.espConnInfo = espconninfo;
        try
        {
            if (filter != null && !filter.isEmpty())
                this.filter = new FileFilter(filter);
        }
        catch (Exception e)
        {
            throw new HpccFileException("Could not create HPCCFile due to invalid FileFilter", e);
        }

        clusterRemapInfo = remap_info;
        this.targetfilecluster = targetfilecluster;
    }

    /**
     * Extracts the file part from a fileposition value.
     *
     * @param fpos file position
     * @return the project list
     */
    public static int getFilePartFromFPos(long fpos)
    {
        // Last 16 bits store information on file part & if this is a local fpos
        return (int) ((fpos >>> 48L) & 0x7fffL);
    }

    /**
     * Extracts the offset in the file part from a fileposition value. 
     *
     * @param fpos file position
     * @return the project list
     */
    public static long getOffsetFromFPos(long fpos) 
    {
        // First 48 bits store the offset
        return fpos & 0xffffffffffffL;
    }

    /**
     * Gets the project list.
     *
     * @return the project list
     */
    public String getProjectList()
    {
        return columnPruner.getFieldListString();
    }

    /**
     * Sets the project list.
     *
     * @param projectList
     *            the project list
     * @return the HPCC file
     * @throws Exception
     *             the exception
     */
    public HPCCFile setProjectList(String projectList) throws Exception
    {
        this.columnPruner = new ColumnPruner(projectList);
        if (this.recordDefinition != null)
        {
            this.projectedRecordDefinition = this.columnPruner.pruneRecordDefinition(this.recordDefinition);
        }
        return this;
    }

    /**
     * Gets the file access expiry secs.
     *
     * @return initial file access expiry in seconds
     */
    public int getFileAccessExpirySecs()
    {
        return fileAccessExpirySecs;
    }

    /**
     * Sets the file access expiry secs.
     *
     * @param fileAccessExpirySecs
     *            initial access to a file is granted for a period of time. This param can change the duration of that
     *            file access.
     * @return this HPCCFile
     */
    public HPCCFile setFileAccessExpirySecs(int fileAccessExpirySecs)
    {
        this.fileAccessExpirySecs = fileAccessExpirySecs;

        // Force the data parts to be recreated
        this.dataParts = null;

        return this;
    }

    /**
     * Gets the targetfilecluster.
     *
     * @return the targetfilecluster
     */
    public String getTargetfilecluster()
    {
        return targetfilecluster;
    }

    /**
     * Sets the targetfilecluster.
     *
     * @param targetfilecluster
     *            sets the target file cluster
     * @return this HPCCFile
     */
    public HPCCFile setTargetfilecluster(String targetfilecluster)
    {
        this.targetfilecluster = targetfilecluster;

        // Force the data parts to be recreated
        this.dataParts = null;

        return this;
    }

    /**
     * Gets the cluster remap info.
     *
     * @return the cluster remap info
     */
    public RemapInfo getClusterRemapInfo()
    {
        return clusterRemapInfo;
    }

    /**
     * Sets the cluster remap info.
     *
     * @param remapinfo
     *            the remapinfo
     * @return this HPCCFile
     */
    public HPCCFile setClusterRemapInfo(RemapInfo remapinfo)
    {
        this.clusterRemapInfo = remapinfo;

        // Force the data parts to be recreated
        this.dataParts = null;

        return this;
    }

    /**
     * Gets the filter.
     *
     * @return the filter
     */
    public FileFilter getFilter()
    {
        return filter;
    }

    /**
     * Sets the filter.
     *
     * @param filterexpression
     *            - uses SQL 'where' syntax
     * @return this HPCCFile
     * @throws Exception
     *             the exception
     */
    public HPCCFile setFilter(String filterexpression) throws Exception
    {
        this.filter = new FileFilter(filterexpression);

        if (this.dataParts != null)
        {
            for (int i = 0; i < this.dataParts.length; i++)
            {
                this.dataParts[i].setFilter(this.filter);
            }
        }

        return this;
    }

    /**
     * Sets the filter.
     *
     * @param filefilter the filter
     * @return this HPCCFile
     * @throws Exception
     *             the exception
     */
    public HPCCFile setFilter(FileFilter filefilter) throws Exception
    {
        this.filter = filefilter;
        return this;
    }

    /**
     * Gets the file name.
     *
     * @return the file name
     */
    public String getFileName()
    {
        return fileName;
    }

    /**
     * Creates the data parts.
     *
     * @throws HpccFileException
     *             the hpcc file exception
     */
    private void createDataParts() throws HpccFileException
    {
        long fileAccessExpiryMS = fileAccessExpirySecs * 1000;
        long dataPartsAgeMS = System.currentTimeMillis() - dataPartsCreationTimeMS;
        boolean accessTokenExpired = dataPartsAgeMS >= fileAccessExpiryMS;
        if (dataParts != null)
        {
            if (accessTokenExpired)
                log.info("Refreshing data parts due to access token expiration.");
            else
                return;
        }

        dataPartsCreationTimeMS = System.currentTimeMillis();

        HPCCWsDFUClient dfuClient = HPCCWsDFUClient.get(espConnInfo);
        if (dfuClient.hasInitError())
        {
            String errmesg = "Could not fetch '" + fileName + "' info from WsDFU ESP due to wsdfuclient init error: " + dfuClient.getInitError();
            log.error(errmesg);
            throw new HpccFileException(errmesg);
        }

        String originalRecDefInJSON = "";
        DFUFileAccessInfoWrapper fileinfoforread = null;
        try
        {
            fileinfoforread = fetchReadFileInfo(fileName, dfuClient, fileAccessExpirySecs, targetfilecluster);
            this.isIndex = fileinfoforread.getFileType().isIndex();

            originalRecDefInJSON = fileinfoforread.getRecordTypeInfoJson();
            if (originalRecDefInJSON == null)
            {
                throw new Exception("File record definiton returned from ESP was null");
            }
        }
        catch (Exception e)
        {
            log.error("Unable to retrieve file or record information: " + e.getMessage());
            throw new HpccFileException("Unable to retrieve file or record information: " + e.getMessage(), e);
        }

        DataPartition.FileType fileType = DataPartition.FileType.FLAT;
        try
        {
            fileType = DataPartition.FileType.fromWrappedFileType(fileinfoforread.getFileType());
        }
        catch (Exception e)
        {
            throw new HpccFileException(e);
        }

        try
        {
            if (fileinfoforread.getNumParts() > 0)
            {
                ClusterRemapper clusterremapper = ClusterRemapper.makeMapper(clusterRemapInfo, fileinfoforread);
                this.dataParts = DataPartition.createPartitions(fileinfoforread.getFileParts(), clusterremapper,
                        /* maxParts currently ignored anyway */0, filter, fileinfoforread.getFileAccessInfoBlob(), fileType);

                // Check to see if this file has a TLK. The TLK will always be the last partition.
                // If we do have a TLK remove it from the standard list of data partitions.
                if (this.isIndex())
                {
                    DataPartition lastPart = this.dataParts[this.dataParts.length-1];
                    if (lastPart.isTLK())
                    {
                        this.tlkPartition = lastPart;
                        this.dataParts = Arrays.copyOfRange(this.dataParts,0,this.dataParts.length-1);
                    }
                }

                this.recordDefinition = RecordDefinitionTranslator.parseJsonRecordDefinition(new JSONObject(originalRecDefInJSON));

                try
                {
                    this.partitionProcessor = new PartitionProcessor(this.recordDefinition, this.dataParts, this.tlkPartition);
                }
                catch (Exception e)
                {
                    log.error("Error while constructing partition processor, reading will continue without partition filtering: " + e.getMessage());
                    this.partitionProcessor = new PartitionProcessor(this.recordDefinition, this.dataParts, null);
                }

                this.projectedRecordDefinition = this.columnPruner.pruneRecordDefinition(this.recordDefinition);
            }
            else
                throw new HpccFileException("Could not fetch metadata for file: '" + fileName + "'");

        }
        catch (Exception e)
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to acquire file access or retrieve meta info for: '").append(fileName).append("'");
            sb.append(" with error: " + e.getMessage());
            throw new HpccFileException(sb.toString(), e);
        }
    }

    /**
     * The partitions for the file residing on an HPCC cluster. If a filter has been set on an index file
     * Only the partitions matching the filter will be returned.
     *
     * @return the file parts
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public DataPartition[] getFileParts() throws HpccFileException
    {
        return findMatchingPartitions(this.filter).toArray(new DataPartition[0]);
    }

    /**
     * Return the list of partitions with records matching the provided filter
     *
     * @param filter the filter
     * @return the file parts
     * @throws HpccFileException the exception
     */
    public List<DataPartition> findMatchingPartitions(FileFilter filter) throws HpccFileException
    {
        createDataParts();
        List<DataPartition> matchedPartitions = this.partitionProcessor.findMatchingPartitions(filter);
        return matchedPartitions;
    }

    public PartitionProcessor getPartitionProcessor()
    {
        return this.partitionProcessor;
    }

    /**
     * The record definition for a file on an HPCC cluster.
     *
     * @return the record definition
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public final FieldDef getRecordDefinition() throws HpccFileException
    {
        createDataParts();
        return recordDefinition;
    }

    /**
     * The record definition for a file on an HPCC cluster.
     *
     * @return the projected record definition
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public final FieldDef getProjectedRecordDefinition() throws HpccFileException
    {
        createDataParts();
        return projectedRecordDefinition;
    }

    /**
     * Is this an index?.
     *
     * @return true if yes
     */
    public boolean isIndex()
    {
        return this.isIndex;
    }

    /**
     * Fetch read file info.
     *
     * @param fileName
     *            the file name
     * @param hpccClient
     *            the hpcc client
     * @param expirySeconds
     *            the expiry seconds
     * @param clusterName
     *            the cluster name
     * @return the DFU file access info wrapper
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    private static DFUFileAccessInfoWrapper fetchReadFileInfo(String fileName, HPCCWsDFUClient hpccClient, int expirySeconds, String clusterName)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        String uniqueID = "HPCC-FILE: " + UUID.randomUUID().toString();
        return hpccClient.getFileAccess(fileName, clusterName, expirySeconds, uniqueID);
    }

    /**
     * Acquire read file access.
     *
     * @param fileName
     *            the file name
     * @param hpccClient
     *            the hpcc client
     * @param expirySeconds
     *            the expiry seconds
     * @param clusterName
     *            the cluster name
     * @return the string
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    private static String acquireReadFileAccess(String fileName, HPCCWsDFUClient hpccClient, int expirySeconds, String clusterName)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        return acquireFileAccess(fileName, hpccClient, expirySeconds, clusterName);
    }

    /**
     * Acquire write file access.
     *
     * @param fileName
     *            the file name
     * @param hpccClient
     *            the hpcc client
     * @param expirySeconds
     *            the expiry seconds
     * @param clusterName
     *            the cluster name
     * @return the string
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    private static String acquireWriteFileAccess(String fileName, HPCCWsDFUClient hpccClient, int expirySeconds, String clusterName)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        return acquireFileAccess(fileName, hpccClient, expirySeconds, clusterName);
    }

    /**
     * Acquire file access.
     *
     * @param fileName
     *            the file name
     * @param hpcc
     *            the hpcc
     * @param expirySeconds
     *            the expiry seconds
     * @param clusterName
     *            the cluster name
     * @return the string
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    private static String acquireFileAccess(String fileName, HPCCWsDFUClient hpcc, int expirySeconds, String clusterName)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        String uniqueID = "HPCC-FILE: " + UUID.randomUUID().toString();
        return hpcc.getFileAccessBlob(fileName, clusterName, expirySeconds, uniqueID);
    }
    
    /**
     * @return the file metadata information for this HPCCFile (if it exists)
     */
    public DFUFileDetailWrapper getOriginalFileMetadata() 
    {
        if (originalFileMetadata==null) 
        {
            HPCCWsDFUClient dfuClient = HPCCWsDFUClient.get(espConnInfo);
            if (dfuClient.hasInitError())
            {
                String errmesg = "Could not fetch '" + fileName + "' info from WsDFU ESP due to wsdfuclient init error: " + dfuClient.getInitError();
                log.error(errmesg);
            }
            try
            {
                originalFileMetadata=dfuClient.getFileDetails(fileName,targetfilecluster);
            }
            catch (Exception e)
            {
                log.error("Unable to retrieve file or record information: " + e.getMessage(),e);
            }
        }
        return originalFileMetadata;
    }
}
