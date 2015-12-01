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
import org.hpccsystems.ws.client.gen.filespray.v1_12.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.wsdfu.v1_32.DFUFileDetail;
import org.hpccsystems.ws.client.gen.wsdfu.v1_32.DFUInfoResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_32.DFULogicalFile;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

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
    private DFULogicalFile     info;
    private DFUFileDetail      info2;
    private ECLSourceFile      info3;
    private PhysicalFileStruct info4;

    public enum Notification
    {
        LOGICALFILE
    }

    private LogicalFile(Platform platform, String name)
    {
        this.platform = platform;
        info = new DFULogicalFile();
        info.setName(name);
        info2 = new DFUFileDetail();
        info2.setName(name);
        info3 = new ECLSourceFile();
        info3.setName(name);
        info4 = new PhysicalFileStruct();
        info4.setName(name);
    }

    public String getName()
    {
        return info.getName();
    }

    public Workunit getWorkunit()
    {
        if (info2.getWuid() == null)
        {
            fullRefresh();
        }
        if (info2.getWuid() == null || !info2.getWuid().startsWith("W"))
        {
            return null;
        }
        return platform.getWorkunit(info2.getWuid());
    }

    public FileSprayWorkunit getFileSprayWorkunit()
    {
        if (info2.getWuid() == null)
        {
            fullRefresh();
        }
        if (info2.getWuid() == null || !info2.getWuid().startsWith("D"))
        {
            return null;
        }
        return platform.getFileSprayWorkunit(info2.getWuid());
    }

    public String getDir()
    {
        if (info2.getDir() == null)
        {
            fullRefresh();
        }
        return info2.getDir();
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
            HPCCWsDFUClient wsDfuClient = platform.getWsDfuClient();
            DFUInfoResponse fileInfo = wsDfuClient.getFileInfo(info.getName(), null);
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
        if (info.getName().equals(lf.getName()))
        {
            info = lf;
        }
    }

    void update(DFUFileDetail fd)
    {
        if (fd != null && info2.getName().equals(fd.getName()))
        {
            info2 = fd;
        }
    }

    public void Update(ECLSourceFile sf)
    {
        if (info3.getName().equals(sf.getName()))
        {
            info3 = sf;
        }
    }

    public void Update(PhysicalFileStruct fileStruct)
    {
        if (info4.getName().equals(fileStruct.getName()))
        {
            info4 = fileStruct;
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
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(info.getName(), that.info.getName());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, info.getName());
        return result;
    }
}
