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
 * Class name: ArrayOfNamedValueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.786Z
 */
public class ArrayOfNamedValueWrapper
{
    protected List<NamedValueWrapper> local_namedValue = null;

    public ArrayOfNamedValueWrapper() {}

    public ArrayOfNamedValueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue arrayofnamedvalue)
    {
        copy( arrayofnamedvalue );
    }
    public ArrayOfNamedValueWrapper( List<NamedValueWrapper> _namedValue )
    {
        this.local_namedValue = _namedValue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue raw )
    {
        if (raw == null)
            return;

        if (raw.getNamedValue() != null)
        {
            this.local_namedValue = new ArrayList<NamedValueWrapper>();
            for ( int i = 0; i < raw.getNamedValue().length; i++)
            {
                this.local_namedValue.add(new NamedValueWrapper(raw.getNamedValue()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfNamedValueWrapper [" + "namedValue = " + local_namedValue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue();
        if (this.local_namedValue!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NamedValue[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NamedValue[this.local_namedValue.size()];
            for ( int i = 0; i < this.local_namedValue.size(); i++)
            {
                arr[i] = this.local_namedValue.get(i) .getRaw();
            }
            raw.setNamedValue(arr);
        }
        return raw;
    }


    public void setNamedValue( List<NamedValueWrapper> _namedValue )
    {
        this.local_namedValue = _namedValue;
    }
    public List<NamedValueWrapper> getNamedValue( )
    {
        return this.local_namedValue;
    }
}