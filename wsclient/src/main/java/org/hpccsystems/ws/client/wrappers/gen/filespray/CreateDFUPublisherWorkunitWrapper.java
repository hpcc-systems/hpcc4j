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
 * Class name: CreateDFUPublisherWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class CreateDFUPublisherWorkunitWrapper
{
    protected String local_dFUServerQueue;

    public CreateDFUPublisherWorkunitWrapper() {}

    public CreateDFUPublisherWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit createdfupublisherworkunit)
    {
        copy( createdfupublisherworkunit );
    }
    public CreateDFUPublisherWorkunitWrapper( String _dFUServerQueue )
    {
        this.local_dFUServerQueue = _dFUServerQueue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_dFUServerQueue = raw.getDFUServerQueue();

    }

    @Override
    public String toString()
    {
        return "CreateDFUPublisherWorkunitWrapper [" + "dFUServerQueue = " + local_dFUServerQueue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit();
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