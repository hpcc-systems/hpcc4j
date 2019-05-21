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

import org.json.JSONObject;

import org.apache.log4j.Logger;
import org.hpccsystems.dfs.cluster.ClusterRemapper;
import org.hpccsystems.dfs.cluster.RemapInfo;
import org.hpccsystems.dfs.client.ColumnPruner;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;

public class HPCCFile implements Serializable
{

    /**
     * Access to file content on a collection of one or more HPCC clusters.
     *
     */
    static private final long    serialVersionUID              = 1L;

    private static final Logger  log                           = Logger.getLogger(HPCCFile.class.getName());

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
     * @throws HpccFileException
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
     * @param targetColumnList
     *            a comma separated list of column names in dotted notation for columns within compound columns.
     * @param filter
     *            a file filter to select records of interest
     * @param remap_info
     *            address and port re-mapping info for THOR cluster
     * @param maxParts
     *            optional the maximum number of partitions or zero for no max
     * @param targetfilecluster
     *            optional - the hpcc cluster the target file resides in
     * @throws HpccFileException
     */
    public HPCCFile(String fileName, Connection espconninfo, String targetColumnList, String filter, RemapInfo remap_info, int maxParts,
            String targetfilecluster) throws HpccFileException
    {
        this.fileName = fileName;
        this.recordDefinition = null;
        this.projectedRecordDefinition = null;
        this.columnPruner = new ColumnPruner(targetColumnList);
        this.espConnInfo = espconninfo;
        this.filter = new FileFilter(filter);
        clusterRemapInfo = remap_info;
    }

    /**
     * @return
     */
    public String getProjectList()
    {
        return columnPruner.getFieldListString();
    }

    /**
     * @param projectList
     * @throws Exception 
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
     * @return initial file access expiry in seconds
     */
    public int getFileAccessExpirySecs()
    {
        return fileAccessExpirySecs;
    }

    /**
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
     * @return
     */
    public String getTargetfilecluster()
    {
        return targetfilecluster;
    }

    /**
     * @param targetfilecluster sets the target file cluster
     * @return this HPCCFile
     */
    public HPCCFile setTargetfilecluster(String targetfilecluster)
    {
        this.targetfilecluster = targetfilecluster;
        return this;
    }

    /**
     * @return
     */
    public RemapInfo getClusterRemapInfo()
    {
        return clusterRemapInfo;
    }

    /**
     * @param remapinfo
     * @return this HPCCFile
     */
    public HPCCFile setClusterRemapInfo(RemapInfo remapinfo)
    {
        this.clusterRemapInfo = remapinfo;
        return this;
    }

    /**
     * @return
     */
    public FileFilter getFilter()
    {
        return filter;
    }

    /**
     * @param filterexpression
     * @return this HPCCFile
     */
    public HPCCFile setFilter(String filterexpression)
    {
        this.filter = new FileFilter(filterexpression);
        return this;
    }

    /**
     * @return
     */
    public String getFileName()
    {
        return fileName;
    }

    /**
     * @throws HpccFileException
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
            if (fileinfoforread.getFileType() != DFUFileType.Flat)
            {
                String filetype="unknown";
                if (fileinfoforread.getFileType() != null)
                {
                      filetype=fileinfoforread.getFileType().toString();
                }
                throw new Exception("Cannot stream file '" + fileName + "' - File type: '" +  filetype + "' not supported!");
            }
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

        try
        {
            if (fileinfoforread.getNumParts() > 0)
            {
                ClusterRemapper clusterremapper = ClusterRemapper.makeMapper(clusterRemapInfo, fileinfoforread);
                this.dataParts = DataPartition.createPartitions(fileinfoforread.getFileParts(), clusterremapper,
                        /* maxParts currently ignored anyway */0, filter, fileinfoforread.getFileAccessInfoBlob());
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
     * The partitions for the file residing on an HPCC cluster
     * 
     * @return
     * @throws HpccFileException
     */
    public DataPartition[] getFileParts() throws HpccFileException
    {
        if (dataParts == null) createDataParts();

        return dataParts;
    }

    /**
     * The record definition for a file on an HPCC cluster.
     * 
     * @return
     * @throws HpccFileException
     */
    public final FieldDef getRecordDefinition() throws HpccFileException
    {
        if (dataParts == null) createDataParts();

        return recordDefinition;
    }

    /**
     * The record definition for a file on an HPCC cluster.
     * 
     * @return
     * @throws HpccFileException
     */
    public final FieldDef getProjectedRecordDefinition() throws HpccFileException
    {
        if (dataParts == null) createDataParts();

        return projectedRecordDefinition;
    }

    /**
     * Is this an index?
     * 
     * @return true if yes
     */
    public boolean isIndex()
    {
        return this.isIndex;
    }

    private static DFUFileAccessInfoWrapper fetchReadFileInfo(String fileName, HPCCWsDFUClient hpccClient, int expirySeconds, String clusterName)
            throws Exception
    {
        String uniqueID = "HPCC-FILE: " + UUID.randomUUID().toString();
        return hpccClient.getFileAccess(fileName, clusterName, expirySeconds, uniqueID);
    }

    private static String acquireReadFileAccess(String fileName, HPCCWsDFUClient hpccClient, int expirySeconds, String clusterName) throws Exception
    {
        return acquireFileAccess(fileName, hpccClient, expirySeconds, clusterName);
    }

    private static String acquireWriteFileAccess(String fileName, HPCCWsDFUClient hpccClient, int expirySeconds, String clusterName) throws Exception
    {
        return acquireFileAccess(fileName, hpccClient, expirySeconds, clusterName);
    }

    private static String acquireFileAccess(String fileName, HPCCWsDFUClient hpcc, int expirySeconds, String clusterName) throws Exception
    {
        String uniqueID = "HPCC-FILE: " + UUID.randomUUID().toString();
        return hpcc.getFileAccessBlob(fileName, clusterName, expirySeconds, uniqueID);
    }
}
