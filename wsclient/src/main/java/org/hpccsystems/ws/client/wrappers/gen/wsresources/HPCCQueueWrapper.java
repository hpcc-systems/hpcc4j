package org.hpccsystems.ws.client.wrappers.gen.wsresources;

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
 * Class name: HPCCQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class HPCCQueueWrapper
{
    protected String local_name;
    protected HPCCQueueTypeWrapper local_type;

    public HPCCQueueWrapper() {}

    public HPCCQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue hpccqueue)
    {
        copy( hpccqueue );
    }
    public HPCCQueueWrapper( String _name, HPCCQueueTypeWrapper _type )
    {
        this.local_name = _name;
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        if (raw.getType() != null)
            this.local_type = new HPCCQueueTypeWrapper( raw.getType());

    }

    @Override
    public String toString()
    {
        return "HPCCQueueWrapper [" + "name = " + local_name + ", " + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue();
        raw.setName( local_name);
        if (local_type != null)
            raw.setType( local_type.getRaw());
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setType( HPCCQueueTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public HPCCQueueTypeWrapper getType( )
    {
        return this.local_type;
    }
}