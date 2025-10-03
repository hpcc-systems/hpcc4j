/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;

public class LogicalFile extends DataSingleton
{
    private static Map<Integer, LogicalFile> LogicalFiles = new HashMap<Integer, LogicalFile>();

    /**
     * Gets the.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     * @return the logical file
     */
    public static synchronized LogicalFile get(Platform platform, String name)
    {
        LogicalFile logicalFile = new LogicalFile(platform, name);
        if (LogicalFiles.containsKey(logicalFile.hashCode()))
        {
            return LogicalFiles.get(logicalFile.hashCode());
        }
        else
        {
            LogicalFiles.put(logicalFile.hashCode(), logicalFile);
        }
        return logicalFile;
    }

    private Platform           platform;
    private DFULogicalFile     dfulogicalfile;
    private DFUFileDetailWrapper      dfufiledetail;
    private ECLSourceFile      eclsourcefile;

    public enum Notification
    {
        LOGICALFILE
    }

    /**
     * Instantiates a new logical file.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     */
    private LogicalFile(Platform platform, String name)
    {
        this.platform = platform;
        dfulogicalfile = new DFULogicalFile();
        dfulogicalfile.setName(name);
        dfufiledetail = new DFUFileDetailWrapper();
        dfufiledetail.setName(name);
        eclsourcefile = new ECLSourceFile();
        eclsourcefile.setName(name);
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return dfulogicalfile.getName();
    }

    /**
     * Gets the workunit.
     *
     * @return the workunit
     */
    public Workunit getWorkunit()
    {
        if (dfufiledetail.getWuid() == null)
        {
            fullRefresh();
        }
        if (dfufiledetail.getWuid() == null || !dfufiledetail.getWuid().startsWith("W"))
        {
            return null;
        }
        return platform.getWorkunit(dfufiledetail.getWuid());
    }

    /**
     * Gets the file spray workunit.
     *
     * @return the file spray workunit
     */
    public FileSprayWorkunit getFileSprayWorkunit()
    {
        if (dfufiledetail.getWuid() == null)
        {
            fullRefresh();
        }
        if (dfufiledetail.getWuid() == null || !dfufiledetail.getWuid().startsWith("D"))
        {
            return null;
        }
        return platform.getFileSprayWorkunit(dfufiledetail.getWuid());
    }

    /**
     * Gets the dir.
     *
     * @return the dir
     */
    public String getDir()
    {
        if (dfufiledetail.getDir() == null)
        {
            fullRefresh();
        }
        return dfufiledetail.getDir();
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    protected boolean isComplete()
    {
        return true;
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fastRefresh()
     */
    @Override
    protected void fastRefresh()
    {
        fullRefresh();
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fullRefresh()
     */
    @Override
    protected void fullRefresh()
    {
        try
        {
            HPCCWsDFUClient wsDfuClient = platform.getWsClient().getWsDFUClient();
            DFUInfoWrapper fileInfo = wsDfuClient.getFileInfo(dfulogicalfile.getName(), null);
            update(fileInfo.getFileDetail());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /**
     * Update.
     *
     * @param lf
     *            the lf
     */
    // Updates ---
    public void update(DFULogicalFile lf)
    {
        if (dfulogicalfile.getName().equals(lf.getName()))
        {
            dfulogicalfile = lf;
        }
    }

    /**
     * Update.
     *
     * @param fd
     *            the fd
     */
    void update(DFUFileDetailWrapper fd)
    {
        if (fd != null && dfufiledetail.getName().equals(fd.getName()))
        {
            dfufiledetail = fd;
        }
    }

    /**
     * Update.
     *
     * @param sf
     *            the sf
     */
    public void Update(ECLSourceFile sf)
    {
        if (eclsourcefile.getName().equals(sf.getName()))
        {
            eclsourcefile = sf;
        }
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof LogicalFile))
        {
            return false;
        }
        LogicalFile that = (LogicalFile) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(dfulogicalfile.getName(), that.dfulogicalfile.getName());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, dfulogicalfile.getName());
        return result;
    }
}
