package org.hpccsystems.ws.client.wrappers.gen.wstopology;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfLogFileStructWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class ArrayOfLogFileStructWrapper
{
    protected List<LogFileStructWrapper> local_logFileStruct = null;

    public ArrayOfLogFileStructWrapper() {}

    public ArrayOfLogFileStructWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct arrayoflogfilestruct)
    {
        copy( arrayoflogfilestruct );
    }
    public ArrayOfLogFileStructWrapper( List<LogFileStructWrapper> _logFileStruct )
    {
        this.local_logFileStruct = _logFileStruct;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct raw )
    {
        if (raw == null)
            return;

        if (raw.getLogFileStruct() != null)
        {
            this.local_logFileStruct = new ArrayList<LogFileStructWrapper>();
            for ( int i = 0; i < raw.getLogFileStruct().length; i++)
            {
                this.local_logFileStruct.add(new LogFileStructWrapper(raw.getLogFileStruct()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfLogFileStructWrapper [" + "logFileStruct = " + local_logFileStruct + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct();
        if (this.local_logFileStruct!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct[this.local_logFileStruct.size()];
            for ( int i = 0; i < this.local_logFileStruct.size(); i++)
            {
                arr[i] = this.local_logFileStruct.get(i) .getRaw();
            }
            raw.setLogFileStruct(arr);
        }
        return raw;
    }


    public void setLogFileStruct( List<LogFileStructWrapper> _logFileStruct )
    {
        this.local_logFileStruct = _logFileStruct;
    }
    public List<LogFileStructWrapper> getLogFileStruct( )
    {
        return this.local_logFileStruct;
    }
}