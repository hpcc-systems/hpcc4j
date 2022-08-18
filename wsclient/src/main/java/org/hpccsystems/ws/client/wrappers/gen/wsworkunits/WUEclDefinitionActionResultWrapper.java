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
 * Class name: WUEclDefinitionActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.908Z
 */
public class WUEclDefinitionActionResultWrapper
{
    protected String local_eclDefinition;
    protected String local_action;
    protected String local_wUID;
    protected String local_queryID;
    protected String local_result;

    public WUEclDefinitionActionResultWrapper() {}

    public WUEclDefinitionActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult wuecldefinitionactionresult)
    {
        copy( wuecldefinitionactionresult );
    }
    public WUEclDefinitionActionResultWrapper( String _eclDefinition, String _action, String _wUID, String _queryID, String _result )
    {
        this.local_eclDefinition = _eclDefinition;
        this.local_action = _action;
        this.local_wUID = _wUID;
        this.local_queryID = _queryID;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult raw )
    {
        if (raw == null)
            return;

        this.local_eclDefinition = raw.getEclDefinition();
        this.local_action = raw.getAction();
        this.local_wUID = raw.getWUID();
        this.local_queryID = raw.getQueryID();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WUEclDefinitionActionResultWrapper [" + "eclDefinition = " + local_eclDefinition + ", " + "action = " + local_action + ", " + "wUID = " + local_wUID + ", " + "queryID = " + local_queryID + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult();
        raw.setEclDefinition( local_eclDefinition);
        raw.setAction( local_action);
        raw.setWUID( local_wUID);
        raw.setQueryID( local_queryID);
        raw.setResult( local_result);
        return raw;
    }


    public void setEclDefinition( String _eclDefinition )
    {
        this.local_eclDefinition = _eclDefinition;
    }
    public String getEclDefinition( )
    {
        return this.local_eclDefinition;
    }
    public void setAction( String _action )
    {
        this.local_action = _action;
    }
    public String getAction( )
    {
        return this.local_action;
    }
    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setQueryID( String _queryID )
    {
        this.local_queryID = _queryID;
    }
    public String getQueryID( )
    {
        return this.local_queryID;
    }
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
}