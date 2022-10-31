package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: SetJobPriorityWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.319Z
 */
public class SetJobPriorityWrapper
{
    protected String local_queueName;
    protected String local_wuid;
    protected String local_priority;
    protected ArrayOfSMCJobWrapper local_sMCJobs;

    public SetJobPriorityWrapper() {}

    public SetJobPriorityWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority setjobpriority)
    {
        copy( setjobpriority );
    }
    public SetJobPriorityWrapper( String _queueName, String _wuid, String _priority, ArrayOfSMCJobWrapper _sMCJobs )
    {
        this.local_queueName = _queueName;
        this.local_wuid = _wuid;
        this.local_priority = _priority;
        this.local_sMCJobs = _sMCJobs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority raw )
    {
        if (raw == null)
            return;

        this.local_queueName = raw.getQueueName();
        this.local_wuid = raw.getWuid();
        this.local_priority = raw.getPriority();
        if (raw.getSMCJobs() != null)
            this.local_sMCJobs = new ArrayOfSMCJobWrapper( raw.getSMCJobs());

    }

    @Override
    public String toString()
    {
        return "SetJobPriorityWrapper [" + "queueName = " + local_queueName + ", " + "wuid = " + local_wuid + ", " + "priority = " + local_priority + ", " + "sMCJobs = " + local_sMCJobs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority();
        raw.setQueueName( local_queueName);
        raw.setWuid( local_wuid);
        raw.setPriority( local_priority);
        if (local_sMCJobs != null)
            raw.setSMCJobs( local_sMCJobs.getRaw());
        return raw;
    }


    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setPriority( String _priority )
    {
        this.local_priority = _priority;
    }
    public String getPriority( )
    {
        return this.local_priority;
    }
    public void setSMCJobs( ArrayOfSMCJobWrapper _sMCJobs )
    {
        this.local_sMCJobs = _sMCJobs;
    }
    public ArrayOfSMCJobWrapper getSMCJobs( )
    {
        return this.local_sMCJobs;
    }
}