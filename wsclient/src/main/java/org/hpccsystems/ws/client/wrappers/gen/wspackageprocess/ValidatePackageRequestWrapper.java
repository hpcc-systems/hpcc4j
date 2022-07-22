package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ValidatePackageRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-07-25T17:42:18.184Z
 */
public class ValidatePackageRequestWrapper
{
    protected String local_info;
    protected String local_target;
    protected String local_process;
    protected boolean local_active;
    protected String local_pMID;
    protected String local_queryIdToVerify;
    protected List<String> local_queriesToVerify = null;
    protected List<String> local_queriesToIgnore = null;
    protected boolean local_checkDFS;
    protected boolean local_globalScope;
    protected boolean local_ignoreWarnings;
    protected boolean local_ignoreOptionalFiles;

    public ValidatePackageRequestWrapper() {}

    public ValidatePackageRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest validatepackagerequest)
    {
        copy( validatepackagerequest );
    }
    public ValidatePackageRequestWrapper( String _info, String _target, String _process, boolean _active, String _pMID, String _queryIdToVerify, List<String> _queriesToVerify, List<String> _queriesToIgnore, boolean _checkDFS, boolean _globalScope, boolean _ignoreWarnings, boolean _ignoreOptionalFiles )
    {
        this.local_info = _info;
        this.local_target = _target;
        this.local_process = _process;
        this.local_active = _active;
        this.local_pMID = _pMID;
        this.local_queryIdToVerify = _queryIdToVerify;
        this.local_queriesToVerify = _queriesToVerify;
        this.local_queriesToIgnore = _queriesToIgnore;
        this.local_checkDFS = _checkDFS;
        this.local_globalScope = _globalScope;
        this.local_ignoreWarnings = _ignoreWarnings;
        this.local_ignoreOptionalFiles = _ignoreOptionalFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest raw )
    {
        if (raw == null)
            return;

        this.local_info = raw.getInfo();
        this.local_target = raw.getTarget();
        this.local_process = raw.getProcess();
        this.local_active = raw.getActive();
        this.local_pMID = raw.getPMID();
        this.local_queryIdToVerify = raw.getQueryIdToVerify();
        if (raw.getQueriesToVerify() != null)
        {
            this.local_queriesToVerify = new ArrayList<String>();
            for ( int i = 0; i < raw.getQueriesToVerify().getItem().length; i++)
            {
                this.local_queriesToVerify.add(new String(raw.getQueriesToVerify().getItem()[i]));
            }
        }        if (raw.getQueriesToIgnore() != null)
        {
            this.local_queriesToIgnore = new ArrayList<String>();
            for ( int i = 0; i < raw.getQueriesToIgnore().getItem().length; i++)
            {
                this.local_queriesToIgnore.add(new String(raw.getQueriesToIgnore().getItem()[i]));
            }
        }        this.local_checkDFS = raw.getCheckDFS();
        this.local_globalScope = raw.getGlobalScope();
        this.local_ignoreWarnings = raw.getIgnoreWarnings();
        this.local_ignoreOptionalFiles = raw.getIgnoreOptionalFiles();

    }

    @Override
    public String toString()
    {
        return "ValidatePackageRequestWrapper [" + "info = " + local_info + ", " + "target = " + local_target + ", " + "process = " + local_process + ", " + "active = " + local_active + ", " + "pMID = " + local_pMID + ", " + "queryIdToVerify = " + local_queryIdToVerify + ", " + "queriesToVerify = " + local_queriesToVerify + ", " + "queriesToIgnore = " + local_queriesToIgnore + ", " + "checkDFS = " + local_checkDFS + ", " + "globalScope = " + local_globalScope + ", " + "ignoreWarnings = " + local_ignoreWarnings + ", " + "ignoreOptionalFiles = " + local_ignoreOptionalFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest();
        raw.setInfo( local_info);
        raw.setTarget( local_target);
        raw.setProcess( local_process);
        raw.setActive( local_active);
        raw.setPMID( local_pMID);
        raw.setQueryIdToVerify( local_queryIdToVerify);
        if (this.local_queriesToVerify!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_queriesToVerify.size(); i++)
            {
                arr.addItem(this.local_queriesToVerify.get(i));
            }
            raw.setQueriesToVerify(arr);
        }
        if (this.local_queriesToIgnore!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_queriesToIgnore.size(); i++)
            {
                arr.addItem(this.local_queriesToIgnore.get(i));
            }
            raw.setQueriesToIgnore(arr);
        }
        raw.setCheckDFS( local_checkDFS);
        raw.setGlobalScope( local_globalScope);
        raw.setIgnoreWarnings( local_ignoreWarnings);
        raw.setIgnoreOptionalFiles( local_ignoreOptionalFiles);
        return raw;
    }


    public void setInfo( String _info )
    {
        this.local_info = _info;
    }
    public String getInfo( )
    {
        return this.local_info;
    }
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setActive( boolean _active )
    {
        this.local_active = _active;
    }
    public boolean getActive( )
    {
        return this.local_active;
    }
    public void setPMID( String _pMID )
    {
        this.local_pMID = _pMID;
    }
    public String getPMID( )
    {
        return this.local_pMID;
    }
    public void setQueryIdToVerify( String _queryIdToVerify )
    {
        this.local_queryIdToVerify = _queryIdToVerify;
    }
    public String getQueryIdToVerify( )
    {
        return this.local_queryIdToVerify;
    }
    public void setQueriesToVerify( List<String> _queriesToVerify )
    {
        this.local_queriesToVerify = _queriesToVerify;
    }
    public List<String> getQueriesToVerify( )
    {
        return this.local_queriesToVerify;
    }
    public void setQueriesToIgnore( List<String> _queriesToIgnore )
    {
        this.local_queriesToIgnore = _queriesToIgnore;
    }
    public List<String> getQueriesToIgnore( )
    {
        return this.local_queriesToIgnore;
    }
    public void setCheckDFS( boolean _checkDFS )
    {
        this.local_checkDFS = _checkDFS;
    }
    public boolean getCheckDFS( )
    {
        return this.local_checkDFS;
    }
    public void setGlobalScope( boolean _globalScope )
    {
        this.local_globalScope = _globalScope;
    }
    public boolean getGlobalScope( )
    {
        return this.local_globalScope;
    }
    public void setIgnoreWarnings( boolean _ignoreWarnings )
    {
        this.local_ignoreWarnings = _ignoreWarnings;
    }
    public boolean getIgnoreWarnings( )
    {
        return this.local_ignoreWarnings;
    }
    public void setIgnoreOptionalFiles( boolean _ignoreOptionalFiles )
    {
        this.local_ignoreOptionalFiles = _ignoreOptionalFiles;
    }
    public boolean getIgnoreOptionalFiles( )
    {
        return this.local_ignoreOptionalFiles;
    }
}