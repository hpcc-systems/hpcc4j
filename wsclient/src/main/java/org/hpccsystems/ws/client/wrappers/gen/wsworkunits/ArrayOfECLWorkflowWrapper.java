package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: ArrayOfECLWorkflowWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.782Z
 */
public class ArrayOfECLWorkflowWrapper
{
    protected List<ECLWorkflowWrapper> local_eCLWorkflow = null;

    public ArrayOfECLWorkflowWrapper() {}

    public ArrayOfECLWorkflowWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow arrayofeclworkflow)
    {
        copy( arrayofeclworkflow );
    }
    public ArrayOfECLWorkflowWrapper( List<ECLWorkflowWrapper> _eCLWorkflow )
    {
        this.local_eCLWorkflow = _eCLWorkflow;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow raw )
    {
        if (raw == null)
            return;

        if (raw.getECLWorkflow() != null)
        {
            this.local_eCLWorkflow = new ArrayList<ECLWorkflowWrapper>();
            for ( int i = 0; i < raw.getECLWorkflow().length; i++)
            {
                this.local_eCLWorkflow.add(new ECLWorkflowWrapper(raw.getECLWorkflow()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLWorkflowWrapper [" + "eCLWorkflow = " + local_eCLWorkflow + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow();
        if (this.local_eCLWorkflow!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow[this.local_eCLWorkflow.size()];
            for ( int i = 0; i < this.local_eCLWorkflow.size(); i++)
            {
                arr[i] = this.local_eCLWorkflow.get(i) .getRaw();
            }
            raw.setECLWorkflow(arr);
        }
        return raw;
    }


    public void setECLWorkflow( List<ECLWorkflowWrapper> _eCLWorkflow )
    {
        this.local_eCLWorkflow = _eCLWorkflow;
    }
    public List<ECLWorkflowWrapper> getECLWorkflow( )
    {
        return this.local_eCLWorkflow;
    }
}