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
 * Class name: TargetQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class TargetQueryRequestWrapper
{
    protected HPCCQueueTypeWrapper local_type;

    public TargetQueryRequestWrapper() {}

    public TargetQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest targetqueryrequest)
    {
        copy( targetqueryrequest );
    }
    public TargetQueryRequestWrapper( HPCCQueueTypeWrapper _type )
    {
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getType() != null)
            this.local_type = new HPCCQueueTypeWrapper( raw.getType());

    }

    @Override
    public String toString()
    {
        return "TargetQueryRequestWrapper [" + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest();
        if (local_type != null)
            raw.setType( local_type.getRaw());
        return raw;
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