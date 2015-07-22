/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.util.Collection;
import java.util.HashSet;

import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.gen.filespray.v1_06.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpDropZone;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

public class DropZone extends DataSingleton
{
    public static DataSingletonCollection All = new DataSingletonCollection();

    public static DropZone get(Platform platform, String name)
    {
        if (name == null || name.isEmpty())
        {
            return null;
        }

        return (DropZone) All.get(new DropZone(platform, name));
    }

    private Platform                platform;
    private TpDropZone              info;
    private Collection<LogicalFile> files;

    DropZone(Platform platform, String name)
    {
        this.platform = platform;
        info = new TpDropZone();
        info.setName(name);
        files = new HashSet<LogicalFile>();
    }

    public String getName()
    {
        return info.getName();
    }

    public String getIP()
    {
        // TODO - Check if more than one folder per drop zone ---
        if (info.getTpMachines() != null && info.getTpMachines().length > 0)
        {
            return info.getTpMachines()[0].getNetaddress();
        }
        return "";
    }

    public String getOS()
    {
        // TODO - Check if more than one folder per drop zone ---
        if (info.getTpMachines() != null && info.getTpMachines().length > 0)
        {
            return info.getTpMachines()[0].getOS().toString();
        }
        return "";
    }

    public String getDirectory()
    {
        // TODO - Check if more than one folder per drop zone ---
        if (info.getTpMachines() != null && info.getTpMachines().length > 0)
        {
            return info.getTpMachines()[0].getDirectory();
        }
        return null;
    }

    // Files ---
    synchronized LogicalFile getFile(String name)
    {
        return LogicalFile.get(platform, name);
    }

    LogicalFile getFile(PhysicalFileStruct fileStruct)
    {
        LogicalFile file = getFile(fileStruct.getName());
        file.Update(fileStruct);
        return file;
    }

    public LogicalFile[] getFiles()
    {
        fullRefresh();
        return files.toArray(new LogicalFile[0]);
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
            HPCCFileSprayClient fileSprayClient = platform.getFileSprayClient();
            PhysicalFileStruct[] response = fileSprayClient.listFiles(getIP(), getDirectory(), getOS());
            update(response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void update(TpDropZone dz)
    {
        if (info.getName().equals(dz.getName()))
        {
            info = dz;
            setChanged();
        }
    }

    synchronized boolean update(PhysicalFileStruct[] rawFileStructs)
    {
        if (rawFileStructs != null)
        {
            files.clear();
            for (PhysicalFileStruct file : rawFileStructs)
            {
                files.add(getFile(file)); // Will mark changed if needed ---
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof DropZone))
        {
            return false;
        }
        DropZone that = (DropZone) aThat;

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
