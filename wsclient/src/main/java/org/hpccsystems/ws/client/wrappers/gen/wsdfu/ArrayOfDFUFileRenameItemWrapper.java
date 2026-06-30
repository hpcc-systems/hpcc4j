package org.hpccsystems.ws.client.wrappers.gen.wsdfu;

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
 * Class name: ArrayOfDFUFileRenameItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class ArrayOfDFUFileRenameItemWrapper
{
    protected List<DFUFileRenameItemWrapper> local_dFUFileRenameItem = null;

    public ArrayOfDFUFileRenameItemWrapper() {}

    public ArrayOfDFUFileRenameItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameItem arrayofdfufilerenameitem)
    {
        copy( arrayofdfufilerenameitem );
    }
    public ArrayOfDFUFileRenameItemWrapper( List<DFUFileRenameItemWrapper> _dFUFileRenameItem )
    {
        this.local_dFUFileRenameItem = _dFUFileRenameItem;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameItem raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFileRenameItem() != null)
        {
            this.local_dFUFileRenameItem = new ArrayList<DFUFileRenameItemWrapper>();
            for ( int i = 0; i < raw.getDFUFileRenameItem().length; i++)
            {
                this.local_dFUFileRenameItem.add(new DFUFileRenameItemWrapper(raw.getDFUFileRenameItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFileRenameItemWrapper [" + "dFUFileRenameItem = " + local_dFUFileRenameItem + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameItem raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameItem();
        if (this.local_dFUFileRenameItem!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem[this.local_dFUFileRenameItem.size()];
            for ( int i = 0; i < this.local_dFUFileRenameItem.size(); i++)
            {
                arr[i] = this.local_dFUFileRenameItem.get(i) .getRaw();
            }
            raw.setDFUFileRenameItem(arr);
        }
        return raw;
    }


    public void setDFUFileRenameItem( List<DFUFileRenameItemWrapper> _dFUFileRenameItem )
    {
        this.local_dFUFileRenameItem = _dFUFileRenameItem;
    }
    public List<DFUFileRenameItemWrapper> getDFUFileRenameItem( )
    {
        return this.local_dFUFileRenameItem;
    }
}