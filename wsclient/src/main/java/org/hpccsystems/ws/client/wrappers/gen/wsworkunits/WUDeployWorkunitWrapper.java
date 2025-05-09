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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUDeployWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUDeployWorkunitWrapper
{
    protected String local_cluster;
    protected String local_name;
    protected int local_wait;
    protected String local_objType;
    protected String local_fileName;
    protected DataHandler local_object;
    protected int local_resultLimit;
    protected String local_queryMainDefinition;
    protected String local_snapshot;
    protected ArrayOfNamedValueWrapper local_debugValues;
    protected boolean local_protect;

    public WUDeployWorkunitWrapper() {}

    public WUDeployWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunit wudeployworkunit)
    {
        copy( wudeployworkunit );
    }
    public WUDeployWorkunitWrapper( String _cluster, String _name, int _wait, String _objType, String _fileName, DataHandler _object, int _resultLimit, String _queryMainDefinition, String _snapshot, ArrayOfNamedValueWrapper _debugValues, boolean _protect )
    {
        this.local_cluster = _cluster;
        this.local_name = _name;
        this.local_wait = _wait;
        this.local_objType = _objType;
        this.local_fileName = _fileName;
        this.local_object = _object;
        this.local_resultLimit = _resultLimit;
        this.local_queryMainDefinition = _queryMainDefinition;
        this.local_snapshot = _snapshot;
        this.local_debugValues = _debugValues;
        this.local_protect = _protect;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_name = raw.getName();
        this.local_wait = raw.getWait();
        this.local_objType = raw.getObjType();
        this.local_fileName = raw.getFileName();
        this.local_object = raw.getObject();
        this.local_resultLimit = raw.getResultLimit();
        this.local_queryMainDefinition = raw.getQueryMainDefinition();
        this.local_snapshot = raw.getSnapshot();
        if (raw.getDebugValues() != null)
            this.local_debugValues = new ArrayOfNamedValueWrapper( raw.getDebugValues());
        this.local_protect = raw.getProtect();

    }

    @Override
    public String toString()
    {
        return "WUDeployWorkunitWrapper [" + "cluster = " + local_cluster + ", " + "name = " + local_name + ", " + "wait = " + local_wait + ", " + "objType = " + local_objType + ", " + "fileName = " + local_fileName + ", " + "object = " + local_object + ", " + "resultLimit = " + local_resultLimit + ", " + "queryMainDefinition = " + local_queryMainDefinition + ", " + "snapshot = " + local_snapshot + ", " + "debugValues = " + local_debugValues + ", " + "protect = " + local_protect + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunit();
        raw.setCluster( local_cluster);
        raw.setName( local_name);
        raw.setWait( local_wait);
        raw.setObjType( local_objType);
        raw.setFileName( local_fileName);
        raw.setObject( local_object);
        raw.setResultLimit( local_resultLimit);
        raw.setQueryMainDefinition( local_queryMainDefinition);
        raw.setSnapshot( local_snapshot);
        if (local_debugValues != null)
            raw.setDebugValues( local_debugValues.getRaw());
        raw.setProtect( local_protect);
        return raw;
    }


    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
    public void setObjType( String _objType )
    {
        this.local_objType = _objType;
    }
    public String getObjType( )
    {
        return this.local_objType;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setObject( DataHandler _object )
    {
        this.local_object = _object;
    }
    public DataHandler getObject( )
    {
        return this.local_object;
    }
    public void setResultLimit( int _resultLimit )
    {
        this.local_resultLimit = _resultLimit;
    }
    public int getResultLimit( )
    {
        return this.local_resultLimit;
    }
    public void setQueryMainDefinition( String _queryMainDefinition )
    {
        this.local_queryMainDefinition = _queryMainDefinition;
    }
    public String getQueryMainDefinition( )
    {
        return this.local_queryMainDefinition;
    }
    public void setSnapshot( String _snapshot )
    {
        this.local_snapshot = _snapshot;
    }
    public String getSnapshot( )
    {
        return this.local_snapshot;
    }
    public void setDebugValues( ArrayOfNamedValueWrapper _debugValues )
    {
        this.local_debugValues = _debugValues;
    }
    public ArrayOfNamedValueWrapper getDebugValues( )
    {
        return this.local_debugValues;
    }
    public void setProtect( boolean _protect )
    {
        this.local_protect = _protect;
    }
    public boolean getProtect( )
    {
        return this.local_protect;
    }
}