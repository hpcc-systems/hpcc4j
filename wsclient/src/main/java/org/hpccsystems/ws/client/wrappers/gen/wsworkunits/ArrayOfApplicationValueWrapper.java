package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: ArrayOfApplicationValueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.773Z
 */
public class ArrayOfApplicationValueWrapper
{
    protected List<ApplicationValueWrapper> local_applicationValue = null;

    public ArrayOfApplicationValueWrapper() {}

    public ArrayOfApplicationValueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue arrayofapplicationvalue)
    {
        copy( arrayofapplicationvalue );
    }
    public ArrayOfApplicationValueWrapper( List<ApplicationValueWrapper> _applicationValue )
    {
        this.local_applicationValue = _applicationValue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue raw )
    {
        if (raw == null)
            return;

        if (raw.getApplicationValue() != null)
        {
            this.local_applicationValue = new ArrayList<ApplicationValueWrapper>();
            for ( int i = 0; i < raw.getApplicationValue().length; i++)
            {
                this.local_applicationValue.add(new ApplicationValueWrapper(raw.getApplicationValue()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfApplicationValueWrapper [" + "applicationValue = " + local_applicationValue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue();
        if (this.local_applicationValue!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue[this.local_applicationValue.size()];
            for ( int i = 0; i < this.local_applicationValue.size(); i++)
            {
                arr[i] = this.local_applicationValue.get(i) .getRaw();
            }
            raw.setApplicationValue(arr);
        }
        return raw;
    }


    public void setApplicationValue( List<ApplicationValueWrapper> _applicationValue )
    {
        this.local_applicationValue = _applicationValue;
    }
    public List<ApplicationValueWrapper> getApplicationValue( )
    {
        return this.local_applicationValue;
    }
}