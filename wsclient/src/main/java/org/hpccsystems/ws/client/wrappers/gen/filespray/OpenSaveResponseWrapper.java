package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: OpenSaveResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.841Z
 */
public class OpenSaveResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_location;
    protected String local_path;
    protected String local_name;
    protected String local_type;
    protected String local_dateTime;
    protected boolean local_viewable;

    public OpenSaveResponseWrapper() {}

    public OpenSaveResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse opensaveresponse)
    {
        copy( opensaveresponse );
    }
    public OpenSaveResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _location, String _path, String _name, String _type, String _dateTime, boolean _viewable )
    {
        this.local_exceptions = _exceptions;
        this.local_location = _location;
        this.local_path = _path;
        this.local_name = _name;
        this.local_type = _type;
        this.local_dateTime = _dateTime;
        this.local_viewable = _viewable;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_location = raw.getLocation();
        this.local_path = raw.getPath();
        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_dateTime = raw.getDateTime();
        this.local_viewable = raw.getViewable();

    }

    @Override
    public String toString()
    {
        return "OpenSaveResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "location = " + local_location + ", " + "path = " + local_path + ", " + "name = " + local_name + ", " + "type = " + local_type + ", " + "dateTime = " + local_dateTime + ", " + "viewable = " + local_viewable + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setLocation( local_location);
        raw.setPath( local_path);
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setDateTime( local_dateTime);
        raw.setViewable( local_viewable);
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
    public void setLocation( String _location )
    {
        this.local_location = _location;
    }
    public String getLocation( )
    {
        return this.local_location;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setDateTime( String _dateTime )
    {
        this.local_dateTime = _dateTime;
    }
    public String getDateTime( )
    {
        return this.local_dateTime;
    }
    public void setViewable( boolean _viewable )
    {
        this.local_viewable = _viewable;
    }
    public boolean getViewable( )
    {
        return this.local_viewable;
    }
}