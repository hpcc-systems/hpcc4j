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
 * Class name: WUAnalyseHotspotWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspot
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUAnalyseHotspotWrapper
{
    protected String local_wuid;
    protected String local_rootScope;
    protected boolean local_optOnlyActive;
    protected boolean local_onlyCriticalPath;
    protected boolean local_includeProperties;
    protected boolean local_includeStatistics;
    protected double local_thresholdPercent;
    protected WUPropertyOptionsWrapper local_propertyOptions;

    public WUAnalyseHotspotWrapper() {}

    public WUAnalyseHotspotWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspot wuanalysehotspot)
    {
        copy( wuanalysehotspot );
    }
    public WUAnalyseHotspotWrapper( String _wuid, String _rootScope, boolean _optOnlyActive, boolean _onlyCriticalPath, boolean _includeProperties, boolean _includeStatistics, double _thresholdPercent, WUPropertyOptionsWrapper _propertyOptions )
    {
        this.local_wuid = _wuid;
        this.local_rootScope = _rootScope;
        this.local_optOnlyActive = _optOnlyActive;
        this.local_onlyCriticalPath = _onlyCriticalPath;
        this.local_includeProperties = _includeProperties;
        this.local_includeStatistics = _includeStatistics;
        this.local_thresholdPercent = _thresholdPercent;
        this.local_propertyOptions = _propertyOptions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspot raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_rootScope = raw.getRootScope();
        this.local_optOnlyActive = raw.getOptOnlyActive();
        this.local_onlyCriticalPath = raw.getOnlyCriticalPath();
        this.local_includeProperties = raw.getIncludeProperties();
        this.local_includeStatistics = raw.getIncludeStatistics();
        this.local_thresholdPercent = raw.getThresholdPercent();
        if (raw.getPropertyOptions() != null)
            this.local_propertyOptions = new WUPropertyOptionsWrapper( raw.getPropertyOptions());

    }

    @Override
    public String toString()
    {
        return "WUAnalyseHotspotWrapper [" + "wuid = " + local_wuid + ", " + "rootScope = " + local_rootScope + ", " + "optOnlyActive = " + local_optOnlyActive + ", " + "onlyCriticalPath = " + local_onlyCriticalPath + ", " + "includeProperties = " + local_includeProperties + ", " + "includeStatistics = " + local_includeStatistics + ", " + "thresholdPercent = " + local_thresholdPercent + ", " + "propertyOptions = " + local_propertyOptions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspot getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspot raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspot();
        raw.setWuid( local_wuid);
        raw.setRootScope( local_rootScope);
        raw.setOptOnlyActive( local_optOnlyActive);
        raw.setOnlyCriticalPath( local_onlyCriticalPath);
        raw.setIncludeProperties( local_includeProperties);
        raw.setIncludeStatistics( local_includeStatistics);
        raw.setThresholdPercent( local_thresholdPercent);
        if (local_propertyOptions != null)
            raw.setPropertyOptions( local_propertyOptions.getRaw());
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
    public void setRootScope( String _rootScope )
    {
        this.local_rootScope = _rootScope;
    }
    public String getRootScope( )
    {
        return this.local_rootScope;
    }
    public void setOptOnlyActive( boolean _optOnlyActive )
    {
        this.local_optOnlyActive = _optOnlyActive;
    }
    public boolean getOptOnlyActive( )
    {
        return this.local_optOnlyActive;
    }
    public void setOnlyCriticalPath( boolean _onlyCriticalPath )
    {
        this.local_onlyCriticalPath = _onlyCriticalPath;
    }
    public boolean getOnlyCriticalPath( )
    {
        return this.local_onlyCriticalPath;
    }
    public void setIncludeProperties( boolean _includeProperties )
    {
        this.local_includeProperties = _includeProperties;
    }
    public boolean getIncludeProperties( )
    {
        return this.local_includeProperties;
    }
    public void setIncludeStatistics( boolean _includeStatistics )
    {
        this.local_includeStatistics = _includeStatistics;
    }
    public boolean getIncludeStatistics( )
    {
        return this.local_includeStatistics;
    }
    public void setThresholdPercent( double _thresholdPercent )
    {
        this.local_thresholdPercent = _thresholdPercent;
    }
    public double getThresholdPercent( )
    {
        return this.local_thresholdPercent;
    }
    public void setPropertyOptions( WUPropertyOptionsWrapper _propertyOptions )
    {
        this.local_propertyOptions = _propertyOptions;
    }
    public WUPropertyOptionsWrapper getPropertyOptions( )
    {
        return this.local_propertyOptions;
    }
}