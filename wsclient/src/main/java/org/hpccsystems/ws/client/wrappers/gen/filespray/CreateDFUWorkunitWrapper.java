package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: CreateDFUWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-07-25T17:33:52.291Z
 */
public class CreateDFUWorkunitWrapper
{
    protected String local_dFUServerQueue;

    public CreateDFUWorkunitWrapper() {}

    public CreateDFUWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit createdfuworkunit)
    {
        copy( createdfuworkunit );
    }
    public CreateDFUWorkunitWrapper( String _dFUServerQueue )
    {
        this.local_dFUServerQueue = _dFUServerQueue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_dFUServerQueue = raw.getDFUServerQueue();

    }

    @Override
    public String toString()
    {
        return "CreateDFUWorkunitWrapper [" + "dFUServerQueue = " + local_dFUServerQueue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit();
        raw.setDFUServerQueue( local_dFUServerQueue);
        return raw;
    }


    public void setDFUServerQueue( String _dFUServerQueue )
    {
        this.local_dFUServerQueue = _dFUServerQueue;
    }
    public String getDFUServerQueue( )
    {
        return this.local_dFUServerQueue;
    }
}