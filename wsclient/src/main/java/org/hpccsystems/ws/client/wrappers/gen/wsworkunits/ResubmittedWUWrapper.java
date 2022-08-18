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
 * Class name: ResubmittedWUWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.861Z
 */
public class ResubmittedWUWrapper
{
    protected String local_wUID;
    protected String local_parentWUID;

    public ResubmittedWUWrapper() {}

    public ResubmittedWUWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU resubmittedwu)
    {
        copy( resubmittedwu );
    }
    public ResubmittedWUWrapper( String _wUID, String _parentWUID )
    {
        this.local_wUID = _wUID;
        this.local_parentWUID = _parentWUID;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU raw )
    {
        if (raw == null)
            return;

        this.local_wUID = raw.getWUID();
        this.local_parentWUID = raw.getParentWUID();

    }

    @Override
    public String toString()
    {
        return "ResubmittedWUWrapper [" + "wUID = " + local_wUID + ", " + "parentWUID = " + local_parentWUID + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU();
        raw.setWUID( local_wUID);
        raw.setParentWUID( local_parentWUID);
        return raw;
    }


    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setParentWUID( String _parentWUID )
    {
        this.local_parentWUID = _parentWUID;
    }
    public String getParentWUID( )
    {
        return this.local_parentWUID;
    }
}