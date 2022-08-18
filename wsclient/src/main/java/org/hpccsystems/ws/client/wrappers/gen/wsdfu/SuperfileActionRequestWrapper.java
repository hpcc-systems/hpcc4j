package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: SuperfileActionRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.164Z
 */
public class SuperfileActionRequestWrapper
{
    protected String local_action;
    protected String local_superfile;
    protected List<String> local_subfiles = null;
    protected String local_before;
    protected boolean local_delete;
    protected boolean local_removeSuperfile;

    public SuperfileActionRequestWrapper() {}

    public SuperfileActionRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest superfileactionrequest)
    {
        copy( superfileactionrequest );
    }
    public SuperfileActionRequestWrapper( String _action, String _superfile, List<String> _subfiles, String _before, boolean _delete, boolean _removeSuperfile )
    {
        this.local_action = _action;
        this.local_superfile = _superfile;
        this.local_subfiles = _subfiles;
        this.local_before = _before;
        this.local_delete = _delete;
        this.local_removeSuperfile = _removeSuperfile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest raw )
    {
        if (raw == null)
            return;

        this.local_action = raw.getAction();
        this.local_superfile = raw.getSuperfile();
        if (raw.getSubfiles() != null)
        {
            this.local_subfiles = new ArrayList<String>();
            for ( int i = 0; i < raw.getSubfiles().getItem().length; i++)
            {
                this.local_subfiles.add(new String(raw.getSubfiles().getItem()[i]));
            }
        }        this.local_before = raw.getBefore();
        this.local_delete = raw.getDelete();
        this.local_removeSuperfile = raw.getRemoveSuperfile();

    }

    @Override
    public String toString()
    {
        return "SuperfileActionRequestWrapper [" + "action = " + local_action + ", " + "superfile = " + local_superfile + ", " + "subfiles = " + local_subfiles + ", " + "before = " + local_before + ", " + "delete = " + local_delete + ", " + "removeSuperfile = " + local_removeSuperfile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest();
        raw.setAction( local_action);
        raw.setSuperfile( local_superfile);
        if (this.local_subfiles!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_subfiles.size(); i++)
            {
                arr.addItem(this.local_subfiles.get(i));
            }
            raw.setSubfiles(arr);
        }
        raw.setBefore( local_before);
        raw.setDelete( local_delete);
        raw.setRemoveSuperfile( local_removeSuperfile);
        return raw;
    }


    public void setAction( String _action )
    {
        this.local_action = _action;
    }
    public String getAction( )
    {
        return this.local_action;
    }
    public void setSuperfile( String _superfile )
    {
        this.local_superfile = _superfile;
    }
    public String getSuperfile( )
    {
        return this.local_superfile;
    }
    public void setSubfiles( List<String> _subfiles )
    {
        this.local_subfiles = _subfiles;
    }
    public List<String> getSubfiles( )
    {
        return this.local_subfiles;
    }
    public void setBefore( String _before )
    {
        this.local_before = _before;
    }
    public String getBefore( )
    {
        return this.local_before;
    }
    public void setDelete( boolean _delete )
    {
        this.local_delete = _delete;
    }
    public boolean getDelete( )
    {
        return this.local_delete;
    }
    public void setRemoveSuperfile( boolean _removeSuperfile )
    {
        this.local_removeSuperfile = _removeSuperfile;
    }
    public boolean getRemoveSuperfile( )
    {
        return this.local_removeSuperfile;
    }
}