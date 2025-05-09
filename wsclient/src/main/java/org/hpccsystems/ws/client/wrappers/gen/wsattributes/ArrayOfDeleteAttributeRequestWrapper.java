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
 * Class name: ArrayOfDeleteAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfDeleteAttributeRequestWrapper
{
    protected List<DeleteAttributeRequestWrapper> local_deleteAttributeRequest = null;

    public ArrayOfDeleteAttributeRequestWrapper() {}

    public ArrayOfDeleteAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest arrayofdeleteattributerequest)
    {
        copy( arrayofdeleteattributerequest );
    }
    public ArrayOfDeleteAttributeRequestWrapper( List<DeleteAttributeRequestWrapper> _deleteAttributeRequest )
    {
        this.local_deleteAttributeRequest = _deleteAttributeRequest;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getDeleteAttributeRequest() != null)
        {
            this.local_deleteAttributeRequest = new ArrayList<DeleteAttributeRequestWrapper>();
            for ( int i = 0; i < raw.getDeleteAttributeRequest().length; i++)
            {
                this.local_deleteAttributeRequest.add(new DeleteAttributeRequestWrapper(raw.getDeleteAttributeRequest()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDeleteAttributeRequestWrapper [" + "deleteAttributeRequest = " + local_deleteAttributeRequest + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest();
        if (this.local_deleteAttributeRequest!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributeRequest[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributeRequest[this.local_deleteAttributeRequest.size()];
            for ( int i = 0; i < this.local_deleteAttributeRequest.size(); i++)
            {
                arr[i] = this.local_deleteAttributeRequest.get(i) .getRaw();
            }
            raw.setDeleteAttributeRequest(arr);
        }
        return raw;
    }


    public void setDeleteAttributeRequest( List<DeleteAttributeRequestWrapper> _deleteAttributeRequest )
    {
        this.local_deleteAttributeRequest = _deleteAttributeRequest;
    }
    public List<DeleteAttributeRequestWrapper> getDeleteAttributeRequest( )
    {
        return this.local_deleteAttributeRequest;
    }
}