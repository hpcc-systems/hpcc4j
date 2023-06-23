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
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUFileBloomWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileBloomWrapper
{
    protected long local_fieldMask;
    protected List<String> local_fieldNames = null;
    protected long local_limit;
    protected String local_probability;

    public DFUFileBloomWrapper() {}

    public DFUFileBloomWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom dfufilebloom)
    {
        copy( dfufilebloom );
    }
    public DFUFileBloomWrapper( long _fieldMask, List<String> _fieldNames, long _limit, String _probability )
    {
        this.local_fieldMask = _fieldMask;
        this.local_fieldNames = _fieldNames;
        this.local_limit = _limit;
        this.local_probability = _probability;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom raw )
    {
        if (raw == null)
            return;

        this.local_fieldMask = raw.getFieldMask();
        if (raw.getFieldNames() != null && raw.getFieldNames().getItem() != null)
        {
            this.local_fieldNames = new ArrayList<String>();
            for ( int i = 0; i < raw.getFieldNames().getItem().length; i++)
            {
                this.local_fieldNames.add(new String(raw.getFieldNames().getItem()[i]));
            }
        }        this.local_limit = raw.getLimit();
        this.local_probability = raw.getProbability();

    }

    @Override
    public String toString()
    {
        return "DFUFileBloomWrapper [" + "fieldMask = " + local_fieldMask + ", " + "fieldNames = " + local_fieldNames + ", " + "limit = " + local_limit + ", " + "probability = " + local_probability + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom();
        raw.setFieldMask( local_fieldMask);
        if (this.local_fieldNames!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_fieldNames.size(); i++)
            {
                arr.addItem(this.local_fieldNames.get(i));
            }
            raw.setFieldNames(arr);
        }
        raw.setLimit( local_limit);
        raw.setProbability( local_probability);
        return raw;
    }


    public void setFieldMask( long _fieldMask )
    {
        this.local_fieldMask = _fieldMask;
    }
    public long getFieldMask( )
    {
        return this.local_fieldMask;
    }
    public void setFieldNames( List<String> _fieldNames )
    {
        this.local_fieldNames = _fieldNames;
    }
    public List<String> getFieldNames( )
    {
        return this.local_fieldNames;
    }
    public void setLimit( long _limit )
    {
        this.local_limit = _limit;
    }
    public long getLimit( )
    {
        return this.local_limit;
    }
    public void setProbability( String _probability )
    {
        this.local_probability = _probability;
    }
    public String getProbability( )
    {
        return this.local_probability;
    }
}