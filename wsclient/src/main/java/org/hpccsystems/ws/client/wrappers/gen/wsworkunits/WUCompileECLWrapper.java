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
 * Class name: WUCompileECLWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECL
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.888Z
 */
public class WUCompileECLWrapper
{
    protected String local_eCL;
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_queue;
    protected String local_cluster;
    protected String local_snapshot;
    protected boolean local_includeDependencies;
    protected boolean local_includeComplexity;
    protected int local_timeToWait;

    public WUCompileECLWrapper() {}

    public WUCompileECLWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECL wucompileecl)
    {
        copy( wucompileecl );
    }
    public WUCompileECLWrapper( String _eCL, String _moduleName, String _attributeName, String _queue, String _cluster, String _snapshot, boolean _includeDependencies, boolean _includeComplexity, int _timeToWait )
    {
        this.local_eCL = _eCL;
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_queue = _queue;
        this.local_cluster = _cluster;
        this.local_snapshot = _snapshot;
        this.local_includeDependencies = _includeDependencies;
        this.local_includeComplexity = _includeComplexity;
        this.local_timeToWait = _timeToWait;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECL raw )
    {
        if (raw == null)
            return;

        this.local_eCL = raw.getECL();
        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_queue = raw.getQueue();
        this.local_cluster = raw.getCluster();
        this.local_snapshot = raw.getSnapshot();
        this.local_includeDependencies = raw.getIncludeDependencies();
        this.local_includeComplexity = raw.getIncludeComplexity();
        this.local_timeToWait = raw.getTimeToWait();

    }

    @Override
    public String toString()
    {
        return "WUCompileECLWrapper [" + "eCL = " + local_eCL + ", " + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "queue = " + local_queue + ", " + "cluster = " + local_cluster + ", " + "snapshot = " + local_snapshot + ", " + "includeDependencies = " + local_includeDependencies + ", " + "includeComplexity = " + local_includeComplexity + ", " + "timeToWait = " + local_timeToWait + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECL getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECL raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECL();
        raw.setECL( local_eCL);
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setQueue( local_queue);
        raw.setCluster( local_cluster);
        raw.setSnapshot( local_snapshot);
        raw.setIncludeDependencies( local_includeDependencies);
        raw.setIncludeComplexity( local_includeComplexity);
        raw.setTimeToWait( local_timeToWait);
        return raw;
    }


    public void setECL( String _eCL )
    {
        this.local_eCL = _eCL;
    }
    public String getECL( )
    {
        return this.local_eCL;
    }
    public void setModuleName( String _moduleName )
    {
        this.local_moduleName = _moduleName;
    }
    public String getModuleName( )
    {
        return this.local_moduleName;
    }
    public void setAttributeName( String _attributeName )
    {
        this.local_attributeName = _attributeName;
    }
    public String getAttributeName( )
    {
        return this.local_attributeName;
    }
    public void setQueue( String _queue )
    {
        this.local_queue = _queue;
    }
    public String getQueue( )
    {
        return this.local_queue;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setSnapshot( String _snapshot )
    {
        this.local_snapshot = _snapshot;
    }
    public String getSnapshot( )
    {
        return this.local_snapshot;
    }
    public void setIncludeDependencies( boolean _includeDependencies )
    {
        this.local_includeDependencies = _includeDependencies;
    }
    public boolean getIncludeDependencies( )
    {
        return this.local_includeDependencies;
    }
    public void setIncludeComplexity( boolean _includeComplexity )
    {
        this.local_includeComplexity = _includeComplexity;
    }
    public boolean getIncludeComplexity( )
    {
        return this.local_includeComplexity;
    }
    public void setTimeToWait( int _timeToWait )
    {
        this.local_timeToWait = _timeToWait;
    }
    public int getTimeToWait( )
    {
        return this.local_timeToWait;
    }
}