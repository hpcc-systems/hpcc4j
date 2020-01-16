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
import org.json.JSONObject;

public class HPCCFile implements Serializable
{

    /**
     * Access to file content on a collection of one or more HPCC clusters.
     *
     */
    static private final long    serialVersionUID              = 1L;

    private static final Logger  log                           = LogManager.getLogger(HPCCFile.class);

    private DataPartition[]      dataParts;
    private FieldDef             recordDefinition;
    private FieldDef             projectedRecordDefinition;
    private boolean              isIndex;
    static private final int     DEFAULT_ACCESS_EXPIRY_SECONDS = 120;
    private int                  fileAccessExpirySecs          = DEFAULT_ACCESS_EXPIRY_SECONDS;

    private transient Connection espConnInfo;
    private String               fileName;
    private String               targetfilecluster             = "";
    private RemapInfo            clusterRemapInfo              = new RemapInfo();
    private FileFilter           filter;
    private ColumnPruner         columnPruner;

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
            if (filter != null && !filter.isEmpty()) this.filter = new FileFilter(filter);
        }
        catch (Exception e)
        {
            throw new HpccFileException("Could not create HPCCFile due to invalid FileFilter", e);
        }

        clusterRemapInfo = remap_info;
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

        String fileTypeStr = fileinfoforread.getFileType().toString().toUpperCase();
        DataPartition.FileType fileType = DataPartition.FileType.valueOf(fileTypeStr);
        try
        {
            if (fileinfoforread.getNumParts() > 0)
            {
                ClusterRemapper clusterremapper = ClusterRemapper.makeMapper(clusterRemapInfo, fileinfoforread);
                this.dataParts = DataPartition.createPartitions(fileinfoforread.getFileParts(), clusterremapper,
                        /* maxParts currently ignored anyway */0, filter, fileinfoforread.getFileAccessInfoBlob(), fileType);
                this.recordDefinition = RecordDefinitionTranslator.parseJsonRecordDefinition(new JSONObject(originalRecDefInJSON));
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
     * The partitions for the file residing on an HPCC cluster.
     *
     * @return the file parts
     * @throws HpccFileException
     *             the hpcc file exception
     */
    public DataPartition[] getFileParts() throws HpccFileException
    {
        if (dataParts == null) createDataParts();

        return dataParts;
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
        if (dataParts == null) createDataParts();

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
        if (dataParts == null) createDataParts();

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
}
