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
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;

public class LogicalFile extends DataSingleton
{
    private static Map<Integer, LogicalFile> LogicalFiles = new HashMap<Integer, LogicalFile>();

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

    public String getName()
    {
        return dfulogicalfile.getName();
    }

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

    public String getDir()
    {
        if (dfufiledetail.getDir() == null)
        {
            fullRefresh();
        }
        return dfufiledetail.getDir();
    }

    @Override
    protected boolean isComplete()
    {
        return true;
    }

    @Override
    protected void fastRefresh()
    {
        fullRefresh();
    }

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
        notifyObservers(Notification.LOGICALFILE);
    }

    // Updates ---
    public void update(DFULogicalFile lf)
    {
        if (dfulogicalfile.getName().equals(lf.getName()))
        {
            dfulogicalfile = lf;
        }
    }

    void update(DFUFileDetailWrapper fd)
    {
        if (fd != null && dfufiledetail.getName().equals(fd.getName()))
        {
            dfufiledetail = fd;
        }
    }

    public void Update(ECLSourceFile sf)
    {
        if (eclsourcefile.getName().equals(sf.getName()))
        {
            eclsourcefile = sf;
        }
    }

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

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, dfulogicalfile.getName());
        return result;
    }
}
