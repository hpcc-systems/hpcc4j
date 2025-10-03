/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DFUWorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.EspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.GetDFUWorkunitResponseWrapper;

public class FileSprayWorkunit extends DataSingleton
{
    public static DataSingletonCollection All = new DataSingletonCollection();

    /**
     * Gets the.
     *
     * @param platform
     *            the platform
     * @param wuid
     *            the wuid
     * @return the file spray workunit
     */
    public static FileSprayWorkunit get(Platform platform, String wuid)
    {
        if (wuid == null || wuid.isEmpty())
        {
            return null;
        }

        return (FileSprayWorkunit) All.get(new FileSprayWorkunit(platform, wuid));
    }

    private Platform    platform;
    private DFUWorkunitWrapper info;

    public enum Notification
    {
        LOGICALFILEWORKUNIT,
    }

    /**
     * Instantiates a new file spray workunit.
     *
     * @param platform
     *            the platform
     * @param id
     *            the id
     */
    FileSprayWorkunit(Platform platform, String id)
    {
        this.platform = platform;
        info = new DFUWorkunitWrapper();
        info.setID(id);
    }

    /**
     * Gets the platform.
     *
     * @return the platform
     */
    public Platform getPlatform()
    {
        return platform;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getID()
    {
        return info.getID();
    }

    /**
     * Gets the state ID.
     *
     * @return the state ID
     */
    /*
     * enum DFUstate { 0 DFUstate_unknown, 1 DFUstate_scheduled, 2 DFUstate_queued, 3 DFUstate_started, 4
     * DFUstate_aborted, 5 DFUstate_failed, 6 DFUstate_finished, 7 DFUstate_monitoring, 8 DFUstate_aborting
     *
     * WUStateNoLongerOnServer 999
     */
    public WUState getStateID()
    {
        switch (info.getState())
        {
            case 1:
                return WUState.SCHEDULED;
            case 2:
                return WUState.WAIT;
            case 3:
                return WUState.RUNNING;
            case 4:
                return WUState.ABORTED;
            case 5:
                return WUState.FAILED;
            case 6:
                return WUState.COMPLETED;
            case 7:
                return WUState.COMPLETED;
            case 8:
                return WUState.ABORTING;
            case 999:
                return WUState.UNKNOWN_ONSERVER;
        }
        return WUState.UNKNOWN;
    }

    /**
     * Gets the logical file.
     *
     * @param name
     *            the name
     * @return the logical file
     */
    // Logical Files ---
    synchronized LogicalFile getLogicalFile(String name)
    {
        return LogicalFile.get(platform, name);
    }

    /**
     * Gets the logical file.
     *
     * @return the logical file
     */
    public LogicalFile getLogicalFile()
    {
        if (info.getSourceLogicalName() == null || info.getDestLogicalName() == null)
        {
            fullRefresh();
        }

        String logicalFileName = info.getSourceLogicalName();
        if (logicalFileName == null || logicalFileName.isEmpty())
        {
            logicalFileName = info.getDestLogicalName();
        }

        if (logicalFileName == null || logicalFileName.isEmpty())
        {
            return null;
        }

        return getLogicalFile(logicalFileName);
    }

    /**
     * Gets the file path.
     *
     * @return the file path
     */
    public String getFilePath()
    {
        if (info.getSourceLogicalName() == null || info.getDestLogicalName() == null)
        {
            fullRefresh();
        }

        String filePath = info.getSourceFilePath();
        if (filePath == null || filePath.isEmpty())
        {
            filePath = info.getDestFilePath();
        }

        if (filePath == null || filePath.isEmpty())
        {
            return null;
        }

        return filePath;
    }

    /**
     * Checks if is despray.
     *
     * @return true, if is despray
     */
    public boolean isDespray()
    {
        if (info.getSourceLogicalName() == null || info.getDestLogicalName() == null)
        {
            fullRefresh();
        }
        if (info.getSourceLogicalName() != null && info.getDestFilePath() != null)
        {
            return true;
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    public boolean isComplete()
    {
        return HPCCWsWorkUnitsClient.isWorkunitComplete(getStateID());
    }

    /**
     * Refresh state.
     */
    public void refreshState()
    {
        fullRefresh();
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
            HPCCFileSprayClient fileSprayClient = platform.getWsClient().getFileSprayClient();
            GetDFUWorkunitResponseWrapper response = fileSprayClient.getDFUWorkunit(info.getID());
            if (response.getResult() == null)
            { // Call succeeded, but no response...
                for (EspExceptionWrapper e : response.getExceptions().getException())
                {
                    if (e.getCode().equals("20082"))
                    { // No longer exists...
                        info.setState(999);
                        break;
                    }
                }
            }
            else
            {
                update(response.getResult());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Update.
     *
     * @param dfuWorkunitWrapper
     *            the dfu workunit wrapper
     * @return true, if successful
     */
    // Updates ---
    public boolean update(DFUWorkunitWrapper dfuWorkunitWrapper)
    {
        boolean retVal = false;
        if (dfuWorkunitWrapper != null && info.getID().equals(dfuWorkunitWrapper.getID()) && !info.equals(dfuWorkunitWrapper))
        {
            if (updateState(dfuWorkunitWrapper))
            {
                retVal = true;
            }
            if (updateLogicalFiles(dfuWorkunitWrapper))
            {
                retVal = true;
            }
        }
        monitor();
        return retVal;
    }

    /**
     * Update state.
     *
     * @param dfuWorkunitWrapper
     *            the dfu workunit wrapper
     * @return true, if successful
     */
    synchronized boolean updateState(DFUWorkunitWrapper dfuWorkunitWrapper)
    {
        if (dfuWorkunitWrapper != null && info.getID().equals(dfuWorkunitWrapper.getID()) && EqualsUtil.hasChanged(info.getState(), dfuWorkunitWrapper.getState()))
        {
            info.setState(dfuWorkunitWrapper.getState());
            return true;
        }
        return false;
    }

    /**
     * Update logical files.
     *
     * @param dfuWorkunitWrapper
     *            the dfu workunit wrapper
     * @return true, if successful
     */
    synchronized boolean updateLogicalFiles(DFUWorkunitWrapper dfuWorkunitWrapper)
    {
        if (dfuWorkunitWrapper != null
                && info.getID().equals(dfuWorkunitWrapper.getID())
                && (EqualsUtil.hasChanged(info.getSourceLogicalName(), dfuWorkunitWrapper.getSourceLogicalName()) || EqualsUtil
                        .hasChanged(info.getDestLogicalName(), dfuWorkunitWrapper.getDestLogicalName())))
        {
            info = dfuWorkunitWrapper;
            return true;
        }
        return false;
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

        if (!(aThat instanceof FileSprayWorkunit))
        {
            return false;
        }
        FileSprayWorkunit that = (FileSprayWorkunit) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(info.getID(), that.info.getID());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, info.getID());
        return result;
    }

    /**
     * Gets the cluster name.
     *
     * @return the cluster name
     */
    public Object getClusterName()
    {
        if (info.getClusterName() == null)
        {
            fullRefresh();
        }
        return info.getClusterName();
    }
}
