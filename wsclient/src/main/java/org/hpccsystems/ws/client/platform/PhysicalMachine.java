/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.ws.client.platform;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachine;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils.HPCCEnvOSCode;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpMachineWrapper;

public class PhysicalMachine extends DataSingleton
{
    private static final Logger       log          = LogManager.getLogger(PhysicalMachine.class);
    private static Map<Integer, PhysicalMachine> physicalMachines = new HashMap<Integer, PhysicalMachine>();

    /**
     * Gets the.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     * @return the physical machine
     */
    public static synchronized PhysicalMachine get(Platform platform, String name)
    {
        PhysicalMachine physicalMachine = new PhysicalMachine(platform, name);
        if (physicalMachines.containsKey(physicalMachine.hashCode()))
        {
            return physicalMachines.get(physicalMachine.hashCode());
        }
        else
        {
            physicalMachines.put(physicalMachine.hashCode(), physicalMachine);
        }
        return physicalMachine;
    }

    private Platform           platform;
    private TpMachine physicalmachinestruct;
    private Collection<PhysicalFile> files;

    public enum Notification
    {
        PHYSICALMACHINE
    }

    /**
     * Instantiates a new physical machine.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     */
    private PhysicalMachine(Platform platform, String name)
    {
        this.platform = platform;
        physicalmachinestruct = new TpMachine();
        physicalmachinestruct.setName(name);
        files = new HashSet<PhysicalFile>();
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return physicalmachinestruct.getName();
    }

    /**
     * Gets the config netaddress.
     *
     * @return the config netaddress
     */
    public String getConfigNetaddress()
    {
        return physicalmachinestruct.getConfigNetaddress();
    }

    /**
     * Gets the netaddress.
     *
     * @return the netaddress
     */
    public String getNetaddress()
    {
        return physicalmachinestruct.getNetaddress();
    }

    /**
     * Gets the directory.
     *
     * @return the directory
     */
    public String getDirectory()
    {
        return physicalmachinestruct.getDirectory();
    }

    /**
     * Gets the domain.
     *
     * @return the domain
     */
    public String getDomain()
    {
        return physicalmachinestruct.getDomain();
    }

    /**
     * Gets the os.
     *
     * @return the os
     */
    public int getOS()
    {
        return physicalmachinestruct.getOS();
    }

    /**
     * Gets the OS code.
     *
     * @return the OS code
     */
    public HPCCEnvOSCode getOSCode()
    {
        return HPCCEnvOSCode.fromCode(physicalmachinestruct.getOS());
    }

    /**
     * Gets the OS name.
     *
     * @return the OS name
     */
    public String getOSName()
    {
        return HPCCEnvOSCode.fromCode(physicalmachinestruct.getOS()).getName();
    }

    /**
     * Gets the path.
     *
     * @return the path
     */
    public String getPath()
    {
        return physicalmachinestruct.getPath();
    }

    /**
     * Gets the file.
     *
     * @param name
     *            the name
     * @return the file
     */
    // Files ---
    synchronized PhysicalFile getFile(String name)
    {
        return PhysicalFile.get(platform, name);
    }

    /**
     * Gets the file.
     *
     * @param fileStruct
     *            the file struct
     * @return the file
     */
    PhysicalFile getFile(PhysicalFileStructWrapper fileStruct)
    {
        return PhysicalFile.get(platform, fileStruct);
    }

    /**
     * Gets the files.
     *
     * @return the files
     */
    public PhysicalFile [] getFiles()
    {
        fullRefresh();
        return files.toArray(new PhysicalFile[0]);
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
            HPCCFileSprayClient wsfsclient = platform.getWsClient().getFileSprayClient();
            List<PhysicalFileStructWrapper> dzfiles = wsfsclient.listFiles(physicalmachinestruct.getNetaddress(), physicalmachinestruct.getDirectory(), null);
            update(dzfiles);
        }
        catch (Exception e)
        {
            log.error("Could not refresh files list for PhysicalMachine: '" + physicalmachinestruct.getName() + "'");
            e.printStackTrace();
        }

    }

    /**
     * Update.
     *
     * @param dzfiles
     *            the dzfiles
     */
    // Updates ---
    private void update(List<PhysicalFileStructWrapper> dzfiles)
    {
         if (dzfiles != null)
         {
             files.clear();
             for (PhysicalFileStructWrapper file : dzfiles)
             {
                 PhysicalFile physicalFile = getFile(file.getName());
                 physicalFile.update(file);
                 files.add(physicalFile);
             }
         }
    }

    /**
     * Update.
     *
     * @param tpmachinestruct
     *            the tpmachinestruct
     */
    public void update(TpMachine tpmachinestruct)
    {
        if (physicalmachinestruct.getName().equals(tpmachinestruct.getName()))
        {
            physicalmachinestruct = tpmachinestruct;
        }
    }

    /**
     * Update.
     *
     * @param tpmachinestruct
     *            the tpmachinestruct
     */
    public void update(TpMachineWrapper tpmachinestruct)
    {
        update(tpmachinestruct.getRaw());
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

        if (!(aThat instanceof PhysicalMachine))
        {
            return false;
        }
        PhysicalMachine that = (PhysicalMachine) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(physicalmachinestruct.getName(), that.physicalmachinestruct.getName());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, physicalmachinestruct.getName());
        return result;
    }
}
