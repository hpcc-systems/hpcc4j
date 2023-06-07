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
 * Class name: WUAnalyseHotspotResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspotResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUAnalyseHotspotResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_rootScope;
    protected long local_rootTime;
    protected Activities_type0Wrapper local_activities;
    protected Dependencies_type0Wrapper local_dependencies;

    public WUAnalyseHotspotResponseWrapper() {}

    public WUAnalyseHotspotResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspotResponse wuanalysehotspotresponse)
    {
        copy( wuanalysehotspotresponse );
    }
    public WUAnalyseHotspotResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _rootScope, long _rootTime, Activities_type0Wrapper _activities, Dependencies_type0Wrapper _dependencies )
    {
        this.local_exceptions = _exceptions;
        this.local_rootScope = _rootScope;
        this.local_rootTime = _rootTime;
        this.local_activities = _activities;
        this.local_dependencies = _dependencies;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspotResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_rootScope = raw.getRootScope();
        this.local_rootTime = raw.getRootTime();
        if (raw.getActivities() != null)
            this.local_activities = new Activities_type0Wrapper( raw.getActivities());
        if (raw.getDependencies() != null)
            this.local_dependencies = new Dependencies_type0Wrapper( raw.getDependencies());

    }

    @Override
    public String toString()
    {
        return "WUAnalyseHotspotResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "rootScope = " + local_rootScope + ", " + "rootTime = " + local_rootTime + ", " + "activities = " + local_activities + ", " + "dependencies = " + local_dependencies + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspotResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspotResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAnalyseHotspotResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setRootScope( local_rootScope);
        raw.setRootTime( local_rootTime);
        if (local_activities != null)
            raw.setActivities( local_activities.getRaw());
        if (local_dependencies != null)
            raw.setDependencies( local_dependencies.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setRootScope( String _rootScope )
    {
        this.local_rootScope = _rootScope;
    }
    public String getRootScope( )
    {
        return this.local_rootScope;
    }
    public void setRootTime( long _rootTime )
    {
        this.local_rootTime = _rootTime;
    }
    public long getRootTime( )
    {
        return this.local_rootTime;
    }
    public void setActivities( Activities_type0Wrapper _activities )
    {
        this.local_activities = _activities;
    }
    public Activities_type0Wrapper getActivities( )
    {
        return this.local_activities;
    }
    public void setDependencies( Dependencies_type0Wrapper _dependencies )
    {
        this.local_dependencies = _dependencies;
    }
    public Dependencies_type0Wrapper getDependencies( )
    {
        return this.local_dependencies;
    }
}