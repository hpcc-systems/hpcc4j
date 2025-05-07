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
 * Class name: ArrayOfRenameAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfRenameAttributeRequestWrapper
{
    protected List<RenameAttributeRequestWrapper> local_renameAttributeRequest = null;

    public ArrayOfRenameAttributeRequestWrapper() {}

    public ArrayOfRenameAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest arrayofrenameattributerequest)
    {
        copy( arrayofrenameattributerequest );
    }
    public ArrayOfRenameAttributeRequestWrapper( List<RenameAttributeRequestWrapper> _renameAttributeRequest )
    {
        this.local_renameAttributeRequest = _renameAttributeRequest;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getRenameAttributeRequest() != null)
        {
            this.local_renameAttributeRequest = new ArrayList<RenameAttributeRequestWrapper>();
            for ( int i = 0; i < raw.getRenameAttributeRequest().length; i++)
            {
                this.local_renameAttributeRequest.add(new RenameAttributeRequestWrapper(raw.getRenameAttributeRequest()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfRenameAttributeRequestWrapper [" + "renameAttributeRequest = " + local_renameAttributeRequest + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest();
        if (this.local_renameAttributeRequest!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest[this.local_renameAttributeRequest.size()];
            for ( int i = 0; i < this.local_renameAttributeRequest.size(); i++)
            {
                arr[i] = this.local_renameAttributeRequest.get(i) .getRaw();
            }
            raw.setRenameAttributeRequest(arr);
        }
        return raw;
    }


    public void setRenameAttributeRequest( List<RenameAttributeRequestWrapper> _renameAttributeRequest )
    {
        this.local_renameAttributeRequest = _renameAttributeRequest;
    }
    public List<RenameAttributeRequestWrapper> getRenameAttributeRequest( )
    {
        return this.local_renameAttributeRequest;
    }
}