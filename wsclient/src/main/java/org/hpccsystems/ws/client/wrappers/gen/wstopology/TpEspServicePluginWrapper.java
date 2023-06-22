package org.hpccsystems.ws.client.wrappers.gen.wstopology;

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
 * Class name: TpEspServicePluginWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpEspServicePluginWrapper
{
    protected String local_shortName;
    protected String local_longName;
    protected String local_folderName;
    protected String local_widgetName;

    public TpEspServicePluginWrapper() {}

    public TpEspServicePluginWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin tpespserviceplugin)
    {
        copy( tpespserviceplugin );
    }
    public TpEspServicePluginWrapper( String _shortName, String _longName, String _folderName, String _widgetName )
    {
        this.local_shortName = _shortName;
        this.local_longName = _longName;
        this.local_folderName = _folderName;
        this.local_widgetName = _widgetName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin raw )
    {
        if (raw == null)
            return;

        this.local_shortName = raw.getShortName();
        this.local_longName = raw.getLongName();
        this.local_folderName = raw.getFolderName();
        this.local_widgetName = raw.getWidgetName();

    }

    @Override
    public String toString()
    {
        return "TpEspServicePluginWrapper [" + "shortName = " + local_shortName + ", " + "longName = " + local_longName + ", " + "folderName = " + local_folderName + ", " + "widgetName = " + local_widgetName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin();
        raw.setShortName( local_shortName);
        raw.setLongName( local_longName);
        raw.setFolderName( local_folderName);
        raw.setWidgetName( local_widgetName);
        return raw;
    }


    public void setShortName( String _shortName )
    {
        this.local_shortName = _shortName;
    }
    public String getShortName( )
    {
        return this.local_shortName;
    }
    public void setLongName( String _longName )
    {
        this.local_longName = _longName;
    }
    public String getLongName( )
    {
        return this.local_longName;
    }
    public void setFolderName( String _folderName )
    {
        this.local_folderName = _folderName;
    }
    public String getFolderName( )
    {
        return this.local_folderName;
    }
    public void setWidgetName( String _widgetName )
    {
        this.local_widgetName = _widgetName;
    }
    public String getWidgetName( )
    {
        return this.local_widgetName;
    }
}