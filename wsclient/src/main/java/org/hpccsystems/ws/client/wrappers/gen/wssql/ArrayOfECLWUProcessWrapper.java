package org.hpccsystems.ws.client.wrappers.gen.wssql;

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
 * Class name: ArrayOfECLWUProcessWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLWUProcess
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class ArrayOfECLWUProcessWrapper
{
    protected List<ECLWUProcessWrapper> local_eCLWUProcess = null;

    public ArrayOfECLWUProcessWrapper() {}

    public ArrayOfECLWUProcessWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLWUProcess arrayofeclwuprocess)
    {
        copy( arrayofeclwuprocess );
    }
    public ArrayOfECLWUProcessWrapper( List<ECLWUProcessWrapper> _eCLWUProcess )
    {
        this.local_eCLWUProcess = _eCLWUProcess;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLWUProcess raw )
    {
        if (raw == null)
            return;

        if (raw.getECLWUProcess() != null)
        {
            this.local_eCLWUProcess = new ArrayList<ECLWUProcessWrapper>();
            for ( int i = 0; i < raw.getECLWUProcess().length; i++)
            {
                this.local_eCLWUProcess.add(new ECLWUProcessWrapper(raw.getECLWUProcess()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLWUProcessWrapper [" + "eCLWUProcess = " + local_eCLWUProcess + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLWUProcess getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLWUProcess raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLWUProcess();
        if (this.local_eCLWUProcess!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess[this.local_eCLWUProcess.size()];
            for ( int i = 0; i < this.local_eCLWUProcess.size(); i++)
            {
                arr[i] = this.local_eCLWUProcess.get(i) .getRaw();
            }
            raw.setECLWUProcess(arr);
        }
        return raw;
    }


    public void setECLWUProcess( List<ECLWUProcessWrapper> _eCLWUProcess )
    {
        this.local_eCLWUProcess = _eCLWUProcess;
    }
    public List<ECLWUProcessWrapper> getECLWUProcess( )
    {
        return this.local_eCLWUProcess;
    }
}