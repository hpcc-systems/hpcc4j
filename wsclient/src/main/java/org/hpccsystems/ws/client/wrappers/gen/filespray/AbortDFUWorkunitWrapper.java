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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: AbortDFUWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class AbortDFUWorkunitWrapper
{
    protected String local_wuid;

    public AbortDFUWorkunitWrapper() {}

    public AbortDFUWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit abortdfuworkunit)
    {
        copy( abortdfuworkunit );
    }
    public AbortDFUWorkunitWrapper( String _wuid )
    {
        this.local_wuid = _wuid;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();

    }

    @Override
    public String toString()
    {
        return "AbortDFUWorkunitWrapper [" + "wuid = " + local_wuid + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit();
        raw.setWuid( local_wuid);
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
}