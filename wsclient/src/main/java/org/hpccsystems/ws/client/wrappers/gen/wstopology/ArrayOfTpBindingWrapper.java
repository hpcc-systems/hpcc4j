package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: ArrayOfTpBindingWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2021-10-27T23:40:06.304Z
 */
public class ArrayOfTpBindingWrapper
{
    protected List<TpBindingWrapper> local_tpBinding = null;

    public ArrayOfTpBindingWrapper() {}

    public ArrayOfTpBindingWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding arrayoftpbinding)
    {
        copy( arrayoftpbinding );
    }
    public ArrayOfTpBindingWrapper( List<TpBindingWrapper> _tpBinding )
    {
        this.local_tpBinding = _tpBinding;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding raw )
    {
        if (raw == null)
            return;

        if (raw.getTpBinding() != null)
        {
            this.local_tpBinding = new ArrayList<TpBindingWrapper>();
            for ( int i = 0; i < raw.getTpBinding().length; i++)
            {
                this.local_tpBinding.add(new TpBindingWrapper(raw.getTpBinding()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpBindingWrapper [" + "tpBinding = " + local_tpBinding + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding();
        if (this.local_tpBinding!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpBinding[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpBinding[this.local_tpBinding.size()];
            for ( int i = 0; i < this.local_tpBinding.size(); i++)
            {
                arr[i] = this.local_tpBinding.get(i) .getRaw();
            }
            raw.setTpBinding(arr);
        }
        return raw;
    }


    public void setTpBinding( List<TpBindingWrapper> _tpBinding )
    {
        this.local_tpBinding = _tpBinding;
    }
    public List<TpBindingWrapper> getTpBinding( )
    {
        return this.local_tpBinding;
    }
}