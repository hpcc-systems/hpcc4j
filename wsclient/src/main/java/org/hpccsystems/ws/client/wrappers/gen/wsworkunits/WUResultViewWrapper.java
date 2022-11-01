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
 * Class name: WUResultViewWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultView
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.603Z
 */
public class WUResultViewWrapper
{
    protected String local_wuid;
    protected String local_viewName;
    protected int local_sequence;
    protected String local_resultName;

    public WUResultViewWrapper() {}

    public WUResultViewWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultView wuresultview)
    {
        copy( wuresultview );
    }
    public WUResultViewWrapper( String _wuid, String _viewName, int _sequence, String _resultName )
    {
        this.local_wuid = _wuid;
        this.local_viewName = _viewName;
        this.local_sequence = _sequence;
        this.local_resultName = _resultName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultView raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_viewName = raw.getViewName();
        this.local_sequence = raw.getSequence();
        this.local_resultName = raw.getResultName();

    }

    @Override
    public String toString()
    {
        return "WUResultViewWrapper [" + "wuid = " + local_wuid + ", " + "viewName = " + local_viewName + ", " + "sequence = " + local_sequence + ", " + "resultName = " + local_resultName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultView getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultView raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultView();
        raw.setWuid( local_wuid);
        raw.setViewName( local_viewName);
        raw.setSequence( local_sequence);
        raw.setResultName( local_resultName);
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
    public void setViewName( String _viewName )
    {
        this.local_viewName = _viewName;
    }
    public String getViewName( )
    {
        return this.local_viewName;
    }
    public void setSequence( int _sequence )
    {
        this.local_sequence = _sequence;
    }
    public int getSequence( )
    {
        return this.local_sequence;
    }
    public void setResultName( String _resultName )
    {
        this.local_resultName = _resultName;
    }
    public String getResultName( )
    {
        return this.local_resultName;
    }
}