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
 * WrapperMaker version: 1.7
 * Class name: SMCJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * Service version: 1.26
 */
public class SMCJobWrapper
{
    protected String local_wuid;
    protected String local_queueName;

    public SMCJobWrapper() {}

    public SMCJobWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob smcjob)
    {
        copy( smcjob );
    }
    public SMCJobWrapper( String _wuid, String _queueName )
    {
        this.local_wuid = _wuid;
        this.local_queueName = _queueName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_queueName = raw.getQueueName();

    }

    @Override
    public String toString()
    {
        return "SMCJobWrapper [" + "wuid = " + local_wuid + ", " + "queueName = " + local_queueName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob();
        raw.setWuid( local_wuid);
        raw.setQueueName( local_queueName);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
}