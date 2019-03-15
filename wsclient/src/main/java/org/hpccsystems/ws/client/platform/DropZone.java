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

import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZone;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachine;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils.HPCCEnvOSCode;

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
    private TpDropZone              dzInfo;
    private Collection<PhysicalMachine> machines;

    DropZone(Platform platform, String name)
    {
        this.platform = platform;
        dzInfo = new TpDropZone();
        dzInfo.setName(name);
        machines = new HashSet<PhysicalMachine>();
    }

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
        if (dzInfo.getTpMachines() != null && dzInfo.getTpMachines().length > 0)
        {
            String[] cnaList = new String[dzInfo.getTpMachines().length];
            for(int i = 0; i < dzInfo.getTpMachines().length; i++)
            {
                cnaList[i] = new String(dzInfo.getTpMachines()[i].getConfigNetaddress());
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
        if (dzInfo.getTpMachines() != null && dzInfo.getTpMachines().length > 0)
        {
            String[] naList = new String[dzInfo.getTpMachines().length];
            for(int i = 0; i < dzInfo.getTpMachines().length; i++)
            {
                naList[i] = new String(dzInfo.getTpMachines()[i].getNetaddress());
            }
            return naList;
        }
        return null;
    }

    private TpMachine findDZMachine(String serveraddress) throws Exception
    {
        if (dzInfo != null)
        {
            TpMachine[] dropzonemachines = dzInfo.getTpMachines();
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
     * Get OS type of Dropzone server IF Dropzone is comprised of a single server
     * @return
     * @throws Exception
     */
    public String getOS() throws Exception
    {
        return getOS(null);
    }

    public String getOS(String serveraddress) throws Exception
    {
        return (HPCCEnvOSCode.fromCode(findDZMachine(serveraddress).getOS())).getName();
    }

    /**
     * Find the Dropzone's directory
     * @return
     * @throws Exception
     */
    public String getDirectory() throws Exception
    {
        return dzInfo.getPath();
    }

    // Machines ---
    synchronized PhysicalMachine getMachine(String name)
    {
        return PhysicalMachine.get(platform, name);
    }

    PhysicalMachine getMachine(TpMachine machinestruct)
    {
        PhysicalMachine machine = getMachine(machinestruct.getName());
        machine.update(machinestruct);
        return machine;
    }

    public PhysicalMachine [] getMachines()
    {
        fullRefresh();
        return machines.toArray(new PhysicalMachine[0]);
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
            update(platform.getWsTopologyClient().queryDropzoneMachines(dzInfo.getName()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void update(TpMachine[] queryDropzoneMachines)
    {
         if (queryDropzoneMachines != null)
         {
             machines.clear();
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

    public void update(TpDropZone dz)
    {
        if (dzInfo.getName().equals(dz.getName()))
        {
            dzInfo = dz;
            update(dz.getTpMachines());
            setChanged();
        }
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
        return EqualsUtil.areEqual(platform, that.platform)
            && EqualsUtil.areEqual(dzInfo.getName(), that.dzInfo.getName())
            && EqualsUtil.areEqual(dzInfo.getPath(), that.dzInfo.getPath());
    }

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
