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
import java.util.Map;

import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils.HPCCEnvOSCode;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;

public class PhysicalMachine extends DataSingleton
{
    private static final Logger       log          = Logger.getLogger(PhysicalMachine.class.getName());
    private static Map<Integer, PhysicalMachine> physicalMachines = new HashMap<Integer, PhysicalMachine>();

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

    private PhysicalMachine(Platform platform, String name)
    {
        this.platform = platform;
        physicalmachinestruct = new TpMachine();
        physicalmachinestruct.setName(name);
        files = new HashSet<PhysicalFile>();
    }

    public String getName()
    {
        return physicalmachinestruct.getName();
    }

    public String getConfigNetaddress()
    {
        return physicalmachinestruct.getConfigNetaddress();
    }

    public String getNetaddress()
    {
        return physicalmachinestruct.getNetaddress();
    }

    public String getDirectory()
    {
        return physicalmachinestruct.getDirectory();
    }

    public String getDomain()
    {
        return physicalmachinestruct.getDomain();
    }

    public int getOS()
    {
        return physicalmachinestruct.getOS();
    }

    public HPCCEnvOSCode getOSCode()
    {
        return HPCCEnvOSCode.fromCode(physicalmachinestruct.getOS());
    }

    public String getOSName()
    {
        return HPCCEnvOSCode.fromCode(physicalmachinestruct.getOS()).getName();
    }

    public String getPath()
    {
        return physicalmachinestruct.getPath();
    }

    // Files ---
    synchronized PhysicalFile getFile(String name)
    {
        return PhysicalFile.get(platform, name);
    }

    PhysicalFile getFile(PhysicalFileStruct fileStruct)
    {
        return PhysicalFile.get(platform, fileStruct);
    }

    public PhysicalFile [] getFiles()
    {
        fullRefresh();
        return files.toArray(new PhysicalFile[0]);
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
            HPCCFileSprayClient wsfsclient = platform.getWsClient().getFileSprayClient();
            PhysicalFileStructWrapper[] dzfiles = wsfsclient.listFiles(physicalmachinestruct.getNetaddress(), physicalmachinestruct.getDirectory(), null);
            update(dzfiles);
        }
        catch (Exception e)
        {
            log.error("Could not refresh files list for PhysicalMachine: '" + physicalmachinestruct.getName() + "'");
            e.printStackTrace();
        }
        notifyObservers(Notification.PHYSICALMACHINE);
    }

    // Updates ---
    private void update(PhysicalFileStructWrapper[] dzfiles)
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

    public void update(TpMachine tpmachinestruct)
    {
        if (physicalmachinestruct.getName().equals(tpmachinestruct.getName()))
        {
            physicalmachinestruct = tpmachinestruct;
        }
    }

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

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, physicalmachinestruct.getName());
        return result;
    }
}
