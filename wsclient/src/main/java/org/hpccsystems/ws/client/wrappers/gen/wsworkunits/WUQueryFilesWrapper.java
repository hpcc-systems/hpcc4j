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
 * Class name: WUQueryFilesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.966Z
 */
public class WUQueryFilesWrapper
{
    protected String local_target;
    protected String local_queryId;

    public WUQueryFilesWrapper() {}

    public WUQueryFilesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles wuqueryfiles)
    {
        copy( wuqueryfiles );
    }
    public WUQueryFilesWrapper( String _target, String _queryId )
    {
        this.local_target = _target;
        this.local_queryId = _queryId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_queryId = raw.getQueryId();

    }

    @Override
    public String toString()
    {
        return "WUQueryFilesWrapper [" + "target = " + local_target + ", " + "queryId = " + local_queryId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles();
        raw.setTarget( local_target);
        raw.setQueryId( local_queryId);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
}