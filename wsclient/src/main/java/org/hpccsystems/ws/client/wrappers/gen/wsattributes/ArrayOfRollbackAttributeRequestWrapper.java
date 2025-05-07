package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: ArrayOfRollbackAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRollbackAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfRollbackAttributeRequestWrapper
{
    protected List<RollbackAttributeRequestWrapper> local_rollbackAttributeRequest = null;

    public ArrayOfRollbackAttributeRequestWrapper() {}

    public ArrayOfRollbackAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRollbackAttributeRequest arrayofrollbackattributerequest)
    {
        copy( arrayofrollbackattributerequest );
    }
    public ArrayOfRollbackAttributeRequestWrapper( List<RollbackAttributeRequestWrapper> _rollbackAttributeRequest )
    {
        this.local_rollbackAttributeRequest = _rollbackAttributeRequest;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRollbackAttributeRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getRollbackAttributeRequest() != null)
        {
            this.local_rollbackAttributeRequest = new ArrayList<RollbackAttributeRequestWrapper>();
            for ( int i = 0; i < raw.getRollbackAttributeRequest().length; i++)
            {
                this.local_rollbackAttributeRequest.add(new RollbackAttributeRequestWrapper(raw.getRollbackAttributeRequest()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfRollbackAttributeRequestWrapper [" + "rollbackAttributeRequest = " + local_rollbackAttributeRequest + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRollbackAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRollbackAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRollbackAttributeRequest();
        if (this.local_rollbackAttributeRequest!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributeRequest[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributeRequest[this.local_rollbackAttributeRequest.size()];
            for ( int i = 0; i < this.local_rollbackAttributeRequest.size(); i++)
            {
                arr[i] = this.local_rollbackAttributeRequest.get(i) .getRaw();
            }
            raw.setRollbackAttributeRequest(arr);
        }
        return raw;
    }


    public void setRollbackAttributeRequest( List<RollbackAttributeRequestWrapper> _rollbackAttributeRequest )
    {
        this.local_rollbackAttributeRequest = _rollbackAttributeRequest;
    }
    public List<RollbackAttributeRequestWrapper> getRollbackAttributeRequest( )
    {
        return this.local_rollbackAttributeRequest;
    }
}