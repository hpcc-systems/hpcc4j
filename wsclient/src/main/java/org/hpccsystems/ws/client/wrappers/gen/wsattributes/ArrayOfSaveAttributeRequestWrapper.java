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
 * Class name: ArrayOfSaveAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfSaveAttributeRequestWrapper
{
    protected List<SaveAttributeRequestWrapper> local_saveAttributeRequest = null;

    public ArrayOfSaveAttributeRequestWrapper() {}

    public ArrayOfSaveAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest arrayofsaveattributerequest)
    {
        copy( arrayofsaveattributerequest );
    }
    public ArrayOfSaveAttributeRequestWrapper( List<SaveAttributeRequestWrapper> _saveAttributeRequest )
    {
        this.local_saveAttributeRequest = _saveAttributeRequest;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getSaveAttributeRequest() != null)
        {
            this.local_saveAttributeRequest = new ArrayList<SaveAttributeRequestWrapper>();
            for ( int i = 0; i < raw.getSaveAttributeRequest().length; i++)
            {
                this.local_saveAttributeRequest.add(new SaveAttributeRequestWrapper(raw.getSaveAttributeRequest()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfSaveAttributeRequestWrapper [" + "saveAttributeRequest = " + local_saveAttributeRequest + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest();
        if (this.local_saveAttributeRequest!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest[this.local_saveAttributeRequest.size()];
            for ( int i = 0; i < this.local_saveAttributeRequest.size(); i++)
            {
                arr[i] = this.local_saveAttributeRequest.get(i) .getRaw();
            }
            raw.setSaveAttributeRequest(arr);
        }
        return raw;
    }


    public void setSaveAttributeRequest( List<SaveAttributeRequestWrapper> _saveAttributeRequest )
    {
        this.local_saveAttributeRequest = _saveAttributeRequest;
    }
    public List<SaveAttributeRequestWrapper> getSaveAttributeRequest( )
    {
        return this.local_saveAttributeRequest;
    }
}