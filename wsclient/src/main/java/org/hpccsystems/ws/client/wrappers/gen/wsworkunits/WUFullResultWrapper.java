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
 * Class name: WUFullResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.533Z
 */
public class WUFullResultWrapper
{
    protected String local_wuid;
    protected boolean local_noRootTag;
    protected WUExceptionSeverityWrapper local_exceptionSeverity;

    public WUFullResultWrapper() {}

    public WUFullResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResult wufullresult)
    {
        copy( wufullresult );
    }
    public WUFullResultWrapper( String _wuid, boolean _noRootTag, WUExceptionSeverityWrapper _exceptionSeverity )
    {
        this.local_wuid = _wuid;
        this.local_noRootTag = _noRootTag;
        this.local_exceptionSeverity = _exceptionSeverity;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResult raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_noRootTag = raw.getNoRootTag();
        if (raw.getExceptionSeverity() != null)
            this.local_exceptionSeverity = new WUExceptionSeverityWrapper( raw.getExceptionSeverity());

    }

    @Override
    public String toString()
    {
        return "WUFullResultWrapper [" + "wuid = " + local_wuid + ", " + "noRootTag = " + local_noRootTag + ", " + "exceptionSeverity = " + local_exceptionSeverity + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResult();
        raw.setWuid( local_wuid);
        raw.setNoRootTag( local_noRootTag);
        if (local_exceptionSeverity != null)
            raw.setExceptionSeverity( local_exceptionSeverity.getRaw());
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
    public void setNoRootTag( boolean _noRootTag )
    {
        this.local_noRootTag = _noRootTag;
    }
    public boolean getNoRootTag( )
    {
        return this.local_noRootTag;
    }
    public void setExceptionSeverity( WUExceptionSeverityWrapper _exceptionSeverity )
    {
        this.local_exceptionSeverity = _exceptionSeverity;
    }
    public WUExceptionSeverityWrapper getExceptionSeverity( )
    {
        return this.local_exceptionSeverity;
    }
}