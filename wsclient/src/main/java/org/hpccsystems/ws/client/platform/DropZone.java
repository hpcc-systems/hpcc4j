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
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachine;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils.HPCCEnvOSCode;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpMachineWrapper;

public class DropZone extends DataSingleton
{
    public static DataSingletonCollection All = new DataSingletonCollection();

    /**
     * Gets the.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     * @return the drop zone
     */
    public static DropZone get(Platform platform, String name)
    {
        if (name == null || name.isEmpty())
        {
            return null;
        }

        return (DropZone) All.get(new DropZone(platform, name));
    }

    private Platform                platform;
    private TpDropZone              dzInfo;
    private Collection<PhysicalMachine> machines;

    /**
     * Instantiates a new drop zone.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     */
    DropZone(Platform platform, String name)
    {
        this.platform = platform;
        dzInfo = new TpDropZone();
        dzInfo.setName(name);
        machines = new HashSet<PhysicalMachine>();
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return dzInfo.getName();
    }

    /**
     * locates and returns a string array of ips or hostnames that
     * are defined within the dropzones environment.xml definition.
     * If these values are hostnames, they will likely be different
     * than the getNetAddress returns,  which are mapped to IP.
     *
     * @return String [] of IP's or hostnames
     * @since 1.2.0
     */
    public String[] getConfiguredNetAddresses()
    {
        if (dzInfo.getTpMachines() != null && dzInfo.getTpMachines().getTpMachine().length > 0)
        {
            String[] cnaList = new String[dzInfo.getTpMachines().getTpMachine().length];
            TpMachine[] tpMachines = dzInfo.getTpMachines().getTpMachine();
            for(int i = 0; i < tpMachines.length; i++)
            {
                cnaList[i] = new String(tpMachines[i].getConfigNetaddress());
            }
            return cnaList;
        }
        return null;
    }

    /**
     * locates and returns the real net address of a dropzone instance
     * which is mapped from the configuredNetAddresses, which can be
     * hostnames and dynamically assigned.
     *
     * @return String [] of IP's
     * @since 1.2.0
     */
    public String[] getNetAddresses()
    {
        if (dzInfo.getTpMachines() != null && dzInfo.getTpMachines().getTpMachine().length > 0)
        {
            TpMachine[] tpMachines = dzInfo.getTpMachines().getTpMachine();
            if (tpMachines != null)
            {
                String[] naList = new String[tpMachines.length];
                for(int i = 0; i < tpMachines.length; i++)
                {
                    naList[i] = new String(tpMachines[i].getNetaddress());
                }
                return naList;
            }
        }
        return null;
    }

    /**
     * Find DZ machine.
     *
     * @param serveraddress
     *            the serveraddress
     * @return the tp machine
     * @throws Exception
     *             the exception
     */
    private TpMachine findDZMachine(String serveraddress) throws Exception
    {
        if (dzInfo != null)
        {
            TpMachine[] dropzonemachines = dzInfo.getTpMachines().getTpMachine();
            if (serveraddress == null || serveraddress.length() == 0)
            {
                if (dropzonemachines.length == 1)
                    return dropzonemachines[0];
                else
                    throw new Exception("Cannot determine Dropzone server - must provide server address");
            }

            for (TpMachine dzmachine : dropzonemachines)
            {
                if (dzmachine.getNetaddress().equals(serveraddress) || dzmachine.getConfigNetaddress().equals(serveraddress))
                    return dzmachine;
            }
        }
        else
            throw new Exception("Cannot determine Dropzone server OS - Dropzone information not available");

        throw new Exception("Cannot determine Dropzone server based on network address: " + serveraddress);
    }

    /**
     * Get OS type of Dropzone server IF Dropzone is comprised of a single server.
     *
     * @return the os
     * @throws Exception
     *             the exception
     */
    public String getOS() throws Exception
    {
        return getOS(null);
    }

    /**
     * Gets the os.
     *
     * @param serveraddress
     *            the serveraddress
     * @return the os
     * @throws Exception
     *             the exception
     */
    public String getOS(String serveraddress) throws Exception
    {
        return (HPCCEnvOSCode.fromCode(findDZMachine(serveraddress).getOS())).getName();
    }

    /**
     * Find the Dropzone's directory.
     *
     * @return the directory
     * @throws Exception
     *             the exception
     */
    public String getDirectory() throws Exception
    {
        return dzInfo.getPath();
    }

    /**
     * Gets the machine.
     *
     * @param name
     *            the name
     * @return the machine
     */
    // Machines ---
    synchronized PhysicalMachine getMachine(String name)
    {
        return PhysicalMachine.get(platform, name);
    }

    /**
     * Gets the machine.
     *
     * @param machinestruct
     *            the machinestruct
     * @return the machine
     */
    PhysicalMachine getMachine(TpMachine machinestruct)
    {
        PhysicalMachine machine = getMachine(machinestruct.getName());
        machine.update(machinestruct);
        return machine;
    }

    /**
     * Gets the machines.
     *
     * @return the machines
     */
    public PhysicalMachine [] getMachines()
    {
        fullRefresh();
        return machines.toArray(new PhysicalMachine[0]);
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
            update(platform.getWsClient().getWsTopologyClient().queryDropzoneMachines(dzInfo.getName()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Update.
     *
     * @param queryDropzoneMachines
     *            the query dropzone machines
     */
    private void update(List<TpMachineWrapper> queryDropzoneMachines)
    {
         if (queryDropzoneMachines != null)
         {
             machines.clear();
             for (TpMachineWrapper machine : queryDropzoneMachines)
             {
                 PhysicalMachine physicalMachine = getMachine(machine.getName());
                 if (physicalMachine != null)
                 {
                     physicalMachine.update(machine);
                     machines.add(physicalMachine); // Will mark changed if needed ---
                 }
             }
         }
    }

    /**
     * Update.
     *
     * @param queryDropzoneMachines
     *            the query dropzone machines
     */
    private void update(TpMachine[] queryDropzoneMachines)
    {
        if (queryDropzoneMachines != null && queryDropzoneMachines.length > 0)
        {
            machines.clear();
            //for (TpMachineWrapper machine : queryDropzoneMachines)
            for (TpMachine machine : queryDropzoneMachines)
            {
                PhysicalMachine physicalMachine = getMachine(machine.getName());
                if (physicalMachine != null)
                {
                    physicalMachine.update(machine);
                    machines.add(physicalMachine); // Will mark changed if needed ---
                }
            }
        }
    }

    /**
     * Update.
     *
     * @param dz
     *            the dz
     */
    public void update(TpDropZone dz)
    {
        if (dzInfo.getName().equals(dz.getName()))
        {
            dzInfo = dz;
            update(dz.getTpMachines().getTpMachine());

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

        if (!(aThat instanceof DropZone))
        {
            return false;
        }
        DropZone that = (DropZone) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform)
            && EqualsUtil.areEqual(dzInfo.getName(), that.dzInfo.getName())
            && EqualsUtil.areEqual(dzInfo.getPath(), that.dzInfo.getPath());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, dzInfo.getName());
        result = HashCodeUtil.hash(result, dzInfo.getPath());
        return result;
    }
}
