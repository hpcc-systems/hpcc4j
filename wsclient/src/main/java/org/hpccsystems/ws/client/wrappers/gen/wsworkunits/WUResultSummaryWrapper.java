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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUResultSummaryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummary
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.988Z
 */
public class WUResultSummaryWrapper
{
    protected String local_wuid;
    protected int local_sequence;

    public WUResultSummaryWrapper() {}

    public WUResultSummaryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummary wuresultsummary)
    {
        copy( wuresultsummary );
    }
    public WUResultSummaryWrapper( String _wuid, int _sequence )
    {
        this.local_wuid = _wuid;
        this.local_sequence = _sequence;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummary raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_sequence = raw.getSequence();

    }

    @Override
    public String toString()
    {
        return "WUResultSummaryWrapper [" + "wuid = " + local_wuid + ", " + "sequence = " + local_sequence + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummary getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummary raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummary();
        raw.setWuid( local_wuid);
        raw.setSequence( local_sequence);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setSequence( int _sequence )
    {
        this.local_sequence = _sequence;
    }
    public int getSequence( )
    {
        return this.local_sequence;
    }
}