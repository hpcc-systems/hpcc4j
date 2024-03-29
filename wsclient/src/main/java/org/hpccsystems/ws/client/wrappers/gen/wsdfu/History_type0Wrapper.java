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
 * Class name: History_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class History_type0Wrapper
{
    protected List<HistoryWrapper> local_origin = null;

    public History_type0Wrapper() {}

    public History_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History_type0 history_type0)
    {
        copy( history_type0 );
    }
    public History_type0Wrapper( List<HistoryWrapper> _origin )
    {
        this.local_origin = _origin;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getOrigin() != null)
        {
            this.local_origin = new ArrayList<HistoryWrapper>();
            for ( int i = 0; i < raw.getOrigin().length; i++)
            {
                this.local_origin.add(new HistoryWrapper(raw.getOrigin()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "History_type0Wrapper [" + "origin = " + local_origin + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History_type0();
        if (this.local_origin!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History[this.local_origin.size()];
            for ( int i = 0; i < this.local_origin.size(); i++)
            {
                arr[i] = this.local_origin.get(i) .getRaw();
            }
            raw.setOrigin(arr);
        }
        return raw;
    }


    public void setOrigin( List<HistoryWrapper> _origin )
    {
        this.local_origin = _origin;
    }
    public List<HistoryWrapper> getOrigin( )
    {
        return this.local_origin;
    }
}