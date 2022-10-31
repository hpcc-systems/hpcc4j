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
 * Class name: WUSyntaxCheckECLWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.610Z
 */
public class WUSyntaxCheckECLWrapper
{
    protected String local_eCL;
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_queue;
    protected String local_cluster;
    protected String local_snapshot;
    protected int local_timeToWait;
    protected boolean local_persistWorkunit;
    protected ArrayOfDebugValueWrapper local_debugValues;

    public WUSyntaxCheckECLWrapper() {}

    public WUSyntaxCheckECLWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL wusyntaxcheckecl)
    {
        copy( wusyntaxcheckecl );
    }
    public WUSyntaxCheckECLWrapper( String _eCL, String _moduleName, String _attributeName, String _queue, String _cluster, String _snapshot, int _timeToWait, boolean _persistWorkunit, ArrayOfDebugValueWrapper _debugValues )
    {
        this.local_eCL = _eCL;
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_queue = _queue;
        this.local_cluster = _cluster;
        this.local_snapshot = _snapshot;
        this.local_timeToWait = _timeToWait;
        this.local_persistWorkunit = _persistWorkunit;
        this.local_debugValues = _debugValues;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL raw )
    {
        if (raw == null)
            return;

        this.local_eCL = raw.getECL();
        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_queue = raw.getQueue();
        this.local_cluster = raw.getCluster();
        this.local_snapshot = raw.getSnapshot();
        this.local_timeToWait = raw.getTimeToWait();
        this.local_persistWorkunit = raw.getPersistWorkunit();
        if (raw.getDebugValues() != null)
            this.local_debugValues = new ArrayOfDebugValueWrapper( raw.getDebugValues());

    }

    @Override
    public String toString()
    {
        return "WUSyntaxCheckECLWrapper [" + "eCL = " + local_eCL + ", " + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "queue = " + local_queue + ", " + "cluster = " + local_cluster + ", " + "snapshot = " + local_snapshot + ", " + "timeToWait = " + local_timeToWait + ", " + "persistWorkunit = " + local_persistWorkunit + ", " + "debugValues = " + local_debugValues + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL();
        raw.setECL( local_eCL);
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setQueue( local_queue);
        raw.setCluster( local_cluster);
        raw.setSnapshot( local_snapshot);
        raw.setTimeToWait( local_timeToWait);
        raw.setPersistWorkunit( local_persistWorkunit);
        if (local_debugValues != null)
            raw.setDebugValues( local_debugValues.getRaw());
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
    public void setTimeToWait( int _timeToWait )
    {
        this.local_timeToWait = _timeToWait;
    }
    public int getTimeToWait( )
    {
        return this.local_timeToWait;
    }
    public void setPersistWorkunit( boolean _persistWorkunit )
    {
        this.local_persistWorkunit = _persistWorkunit;
    }
    public boolean getPersistWorkunit( )
    {
        return this.local_persistWorkunit;
    }
    public void setDebugValues( ArrayOfDebugValueWrapper _debugValues )
    {
        this.local_debugValues = _debugValues;
    }
    public ArrayOfDebugValueWrapper getDebugValues( )
    {
        return this.local_debugValues;
    }
}