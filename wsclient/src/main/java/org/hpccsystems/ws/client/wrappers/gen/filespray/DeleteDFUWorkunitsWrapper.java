package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DeleteDFUWorkunitsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-07-25T17:33:52.294Z
 */
public class DeleteDFUWorkunitsWrapper
{
    protected List<String> local_wuids = null;

    public DeleteDFUWorkunitsWrapper() {}

    public DeleteDFUWorkunitsWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits deletedfuworkunits)
    {
        copy( deletedfuworkunits );
    }
    public DeleteDFUWorkunitsWrapper( List<String> _wuids )
    {
        this.local_wuids = _wuids;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits raw )
    {
        if (raw == null)
            return;

        if (raw.getWuids() != null)
        {
            this.local_wuids = new ArrayList<String>();
            for ( int i = 0; i < raw.getWuids().getItem().length; i++)
            {
                this.local_wuids.add(new String(raw.getWuids().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "DeleteDFUWorkunitsWrapper [" + "wuids = " + local_wuids + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits();
        if (this.local_wuids!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_wuids.size(); i++)
            {
                arr.addItem(this.local_wuids.get(i));
            }
            raw.setWuids(arr);
        }
        return raw;
    }


    public void setWuids( List<String> _wuids )
    {
        this.local_wuids = _wuids;
    }
    public List<String> getWuids( )
    {
        return this.local_wuids;
    }
}