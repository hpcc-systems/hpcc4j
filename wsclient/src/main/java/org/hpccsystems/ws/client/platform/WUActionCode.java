/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

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

//As defined in  HPCC-Platform/common/workunit/workunit.hpp

//Not to be confused with the ECLWUActions defined in  HPCC-Platform/esp/scm/ws_workunits.ecm
// and used in the method WUActionRequest, WUActionType parameter and represented in the generated stub:
// org.hpccsystems.ws.client.gen.wsworkunits.vx_yz.ECLWUActions;

public enum WUActionCode
{
    WUActionUnknown,
    WUActionCompile,
    WUActionCheck,
    WUActionRun,
    WUActionExecuteExisting,
    WUActionPause, 
    WUActionPauseNow, 
    WUActionResume, 
    WUActionSize;
    
    public static WUActionCode fromInteger(Integer value) 
    {
        if (value == null)
            return WUActionUnknown;

        switch(value)
        {
            case 0:
                return WUActionUnknown;
            case 1:
                return WUActionCompile;
            case 2:
                return WUActionCheck;
            case 3:
                return WUActionRun;
            case 4:
                return WUActionExecuteExisting;
            case 5:
                return WUActionPause;
            case 6:
                return WUActionPauseNow;
            case 7:
                return WUActionResume;
            case 8:
                return WUActionSize;
            default:
                return WUActionUnknown;
        }
    }
    
    public static WUActionCode fromName(String name) 
    {
        if (name == null || name.isEmpty())
            return WUActionUnknown;

        if (name.equalsIgnoreCase("compile"))
            return WUActionCompile;
        if (name.equalsIgnoreCase("check"))
            return WUActionCheck;
        if (name.equalsIgnoreCase("run"))
            return WUActionRun;
        if (name.equalsIgnoreCase("executeexisting"))
            return WUActionExecuteExisting;
        if (name.equalsIgnoreCase("pause"))
            return WUActionPause;
        if (name.equalsIgnoreCase("pausenow"))
            return WUActionPauseNow;
        if (name.equalsIgnoreCase("resume"))
            return WUActionResume;
        if (name.equalsIgnoreCase("size"))
            return WUActionSize;
        
        return WUActionUnknown;
    }
}
