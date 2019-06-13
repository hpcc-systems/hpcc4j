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

import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;

public class PhysicalFile extends DataSingleton
{
    private static Map<Integer, PhysicalFile> PhysicalFiles = new HashMap<Integer, PhysicalFile>();

    public static synchronized PhysicalFile get(Platform platform, String name)
    {
        PhysicalFile physicalFile = new PhysicalFile(platform, name);
        if (PhysicalFiles.containsKey(physicalFile.hashCode()))
        {
            return PhysicalFiles.get(physicalFile.hashCode());
        }
        else
        {
            PhysicalFiles.put(physicalFile.hashCode(), physicalFile);
        }
        return physicalFile;
    }

    public static synchronized PhysicalFile get(Platform platform, PhysicalFileStruct fileStruct)
    {
        PhysicalFile physicalFile = get(platform, fileStruct.getName());
        physicalFile.update(fileStruct);

        return physicalFile;
    }

    private Platform           platform;
    private PhysicalFileStruct physicalfilestruct;

    public enum Notification
    {
        PHYSICALFILE
    }

    private PhysicalFile(Platform platform, String name)
    {
        this.platform = platform;
        physicalfilestruct = new PhysicalFileStruct();
        physicalfilestruct.setName(name);
    }

    public String getName()
    {
        return physicalfilestruct.getName();
    }

    public Long getFilesize()
    {
        return physicalfilestruct.getFilesize();
    }
    
    public String getModifiedtime()
    {
        return physicalfilestruct.getModifiedtime();
    }

    public boolean getIsDir()
    {
        return physicalfilestruct.getIsDir();
    }

    public String getPath()
    {
        return physicalfilestruct.getPath();
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
    }

    // Updates ---
    public void update(PhysicalFileStruct file)
    {
        if (physicalfilestruct.getName().equals(file.getName()))
        {
            physicalfilestruct = file;
        }
    }

    public void update(PhysicalFileStructWrapper file)
    {
        if (physicalfilestruct.getName().equals(file.getName()))
        {
            physicalfilestruct = file.getRaw();
        }
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof PhysicalFile))
        {
            return false;
        }
        PhysicalFile that = (PhysicalFile) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(physicalfilestruct.getName(), that.physicalfilestruct.getName());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, physicalfilestruct.getName());
        return result;
    }
}
