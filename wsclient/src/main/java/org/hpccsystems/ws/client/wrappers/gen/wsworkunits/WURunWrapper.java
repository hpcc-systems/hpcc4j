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
 * Class name: WURunWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.604Z
 */
public class WURunWrapper
{
    protected String local_querySet;
    protected String local_query;
    protected String local_wuid;
    protected boolean local_cloneWorkunit;
    protected String local_cluster;
    protected int local_wait;
    protected String local_input;
    protected boolean local_noRootTag;
    protected ArrayOfNamedValueWrapper local_debugValues;
    protected ArrayOfNamedValueWrapper local_variables;
    protected ArrayOfApplicationValueWrapper local_applicationValues;
    protected WUExceptionSeverityWrapper local_exceptionSeverity;

    public WURunWrapper() {}

    public WURunWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun wurun)
    {
        copy( wurun );
    }
    public WURunWrapper( String _querySet, String _query, String _wuid, boolean _cloneWorkunit, String _cluster, int _wait, String _input, boolean _noRootTag, ArrayOfNamedValueWrapper _debugValues, ArrayOfNamedValueWrapper _variables, ArrayOfApplicationValueWrapper _applicationValues, WUExceptionSeverityWrapper _exceptionSeverity )
    {
        this.local_querySet = _querySet;
        this.local_query = _query;
        this.local_wuid = _wuid;
        this.local_cloneWorkunit = _cloneWorkunit;
        this.local_cluster = _cluster;
        this.local_wait = _wait;
        this.local_input = _input;
        this.local_noRootTag = _noRootTag;
        this.local_debugValues = _debugValues;
        this.local_variables = _variables;
        this.local_applicationValues = _applicationValues;
        this.local_exceptionSeverity = _exceptionSeverity;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun raw )
    {
        if (raw == null)
            return;

        this.local_querySet = raw.getQuerySet();
        this.local_query = raw.getQuery();
        this.local_wuid = raw.getWuid();
        this.local_cloneWorkunit = raw.getCloneWorkunit();
        this.local_cluster = raw.getCluster();
        this.local_wait = raw.getWait();
        this.local_input = raw.getInput();
        this.local_noRootTag = raw.getNoRootTag();
        if (raw.getDebugValues() != null)
            this.local_debugValues = new ArrayOfNamedValueWrapper( raw.getDebugValues());
        if (raw.getVariables() != null)
            this.local_variables = new ArrayOfNamedValueWrapper( raw.getVariables());
        if (raw.getApplicationValues() != null)
            this.local_applicationValues = new ArrayOfApplicationValueWrapper( raw.getApplicationValues());
        if (raw.getExceptionSeverity() != null)
            this.local_exceptionSeverity = new WUExceptionSeverityWrapper( raw.getExceptionSeverity());

    }

    @Override
    public String toString()
    {
        return "WURunWrapper [" + "querySet = " + local_querySet + ", " + "query = " + local_query + ", " + "wuid = " + local_wuid + ", " + "cloneWorkunit = " + local_cloneWorkunit + ", " + "cluster = " + local_cluster + ", " + "wait = " + local_wait + ", " + "input = " + local_input + ", " + "noRootTag = " + local_noRootTag + ", " + "debugValues = " + local_debugValues + ", " + "variables = " + local_variables + ", " + "applicationValues = " + local_applicationValues + ", " + "exceptionSeverity = " + local_exceptionSeverity + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun();
        raw.setQuerySet( local_querySet);
        raw.setQuery( local_query);
        raw.setWuid( local_wuid);
        raw.setCloneWorkunit( local_cloneWorkunit);
        raw.setCluster( local_cluster);
        raw.setWait( local_wait);
        raw.setInput( local_input);
        raw.setNoRootTag( local_noRootTag);
        if (local_debugValues != null)
            raw.setDebugValues( local_debugValues.getRaw());
        if (local_variables != null)
            raw.setVariables( local_variables.getRaw());
        if (local_applicationValues != null)
            raw.setApplicationValues( local_applicationValues.getRaw());
        if (local_exceptionSeverity != null)
            raw.setExceptionSeverity( local_exceptionSeverity.getRaw());
        return raw;
    }


    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setQuery( String _query )
    {
        this.local_query = _query;
    }
    public String getQuery( )
    {
        return this.local_query;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setCloneWorkunit( boolean _cloneWorkunit )
    {
        this.local_cloneWorkunit = _cloneWorkunit;
    }
    public boolean getCloneWorkunit( )
    {
        return this.local_cloneWorkunit;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
    public void setInput( String _input )
    {
        this.local_input = _input;
    }
    public String getInput( )
    {
        return this.local_input;
    }
    public void setNoRootTag( boolean _noRootTag )
    {
        this.local_noRootTag = _noRootTag;
    }
    public boolean getNoRootTag( )
    {
        return this.local_noRootTag;
    }
    public void setDebugValues( ArrayOfNamedValueWrapper _debugValues )
    {
        this.local_debugValues = _debugValues;
    }
    public ArrayOfNamedValueWrapper getDebugValues( )
    {
        return this.local_debugValues;
    }
    public void setVariables( ArrayOfNamedValueWrapper _variables )
    {
        this.local_variables = _variables;
    }
    public ArrayOfNamedValueWrapper getVariables( )
    {
        return this.local_variables;
    }
    public void setApplicationValues( ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_applicationValues = _applicationValues;
    }
    public ArrayOfApplicationValueWrapper getApplicationValues( )
    {
        return this.local_applicationValues;
    }
    public void setExceptionSeverity( WUExceptionSeverityWrapper _exceptionSeverity )
    {
        this.local_exceptionSeverity = _exceptionSeverity;
    }
    public WUExceptionSeverityWrapper getExceptionSeverity( )
    {
        return this.local_exceptionSeverity;
    }
}