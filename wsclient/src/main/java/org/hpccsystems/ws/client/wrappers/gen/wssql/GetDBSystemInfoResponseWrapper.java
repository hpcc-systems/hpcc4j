package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: GetDBSystemInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.394Z
 */
public class GetDBSystemInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_name;
    protected String local_fullVersion;
    protected String local_major;
    protected String local_minor;
    protected String local_point;
    protected String local_project;
    protected String local_maturity;
    protected String local_wsSQLFullVersion;
    protected String local_wsSQLMajor;
    protected String local_wsSQLMinor;
    protected String local_wsSQLPoint;
    protected String local_wsSQLProject;
    protected String local_wsSQLMaturity;

    public GetDBSystemInfoResponseWrapper() {}

    public GetDBSystemInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse getdbsysteminforesponse)
    {
        copy( getdbsysteminforesponse );
    }
    public GetDBSystemInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _name, String _fullVersion, String _major, String _minor, String _point, String _project, String _maturity, String _wsSQLFullVersion, String _wsSQLMajor, String _wsSQLMinor, String _wsSQLPoint, String _wsSQLProject, String _wsSQLMaturity )
    {
        this.local_exceptions = _exceptions;
        this.local_name = _name;
        this.local_fullVersion = _fullVersion;
        this.local_major = _major;
        this.local_minor = _minor;
        this.local_point = _point;
        this.local_project = _project;
        this.local_maturity = _maturity;
        this.local_wsSQLFullVersion = _wsSQLFullVersion;
        this.local_wsSQLMajor = _wsSQLMajor;
        this.local_wsSQLMinor = _wsSQLMinor;
        this.local_wsSQLPoint = _wsSQLPoint;
        this.local_wsSQLProject = _wsSQLProject;
        this.local_wsSQLMaturity = _wsSQLMaturity;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_name = raw.getName();
        this.local_fullVersion = raw.getFullVersion();
        this.local_major = raw.getMajor();
        this.local_minor = raw.getMinor();
        this.local_point = raw.getPoint();
        this.local_project = raw.getProject();
        this.local_maturity = raw.getMaturity();
        this.local_wsSQLFullVersion = raw.getWsSQLFullVersion();
        this.local_wsSQLMajor = raw.getWsSQLMajor();
        this.local_wsSQLMinor = raw.getWsSQLMinor();
        this.local_wsSQLPoint = raw.getWsSQLPoint();
        this.local_wsSQLProject = raw.getWsSQLProject();
        this.local_wsSQLMaturity = raw.getWsSQLMaturity();

    }

    @Override
    public String toString()
    {
        return "GetDBSystemInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "name = " + local_name + ", " + "fullVersion = " + local_fullVersion + ", " + "major = " + local_major + ", " + "minor = " + local_minor + ", " + "point = " + local_point + ", " + "project = " + local_project + ", " + "maturity = " + local_maturity + ", " + "wsSQLFullVersion = " + local_wsSQLFullVersion + ", " + "wsSQLMajor = " + local_wsSQLMajor + ", " + "wsSQLMinor = " + local_wsSQLMinor + ", " + "wsSQLPoint = " + local_wsSQLPoint + ", " + "wsSQLProject = " + local_wsSQLProject + ", " + "wsSQLMaturity = " + local_wsSQLMaturity + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setName( local_name);
        raw.setFullVersion( local_fullVersion);
        raw.setMajor( local_major);
        raw.setMinor( local_minor);
        raw.setPoint( local_point);
        raw.setProject( local_project);
        raw.setMaturity( local_maturity);
        raw.setWsSQLFullVersion( local_wsSQLFullVersion);
        raw.setWsSQLMajor( local_wsSQLMajor);
        raw.setWsSQLMinor( local_wsSQLMinor);
        raw.setWsSQLPoint( local_wsSQLPoint);
        raw.setWsSQLProject( local_wsSQLProject);
        raw.setWsSQLMaturity( local_wsSQLMaturity);
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
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setFullVersion( String _fullVersion )
    {
        this.local_fullVersion = _fullVersion;
    }
    public String getFullVersion( )
    {
        return this.local_fullVersion;
    }
    public void setMajor( String _major )
    {
        this.local_major = _major;
    }
    public String getMajor( )
    {
        return this.local_major;
    }
    public void setMinor( String _minor )
    {
        this.local_minor = _minor;
    }
    public String getMinor( )
    {
        return this.local_minor;
    }
    public void setPoint( String _point )
    {
        this.local_point = _point;
    }
    public String getPoint( )
    {
        return this.local_point;
    }
    public void setProject( String _project )
    {
        this.local_project = _project;
    }
    public String getProject( )
    {
        return this.local_project;
    }
    public void setMaturity( String _maturity )
    {
        this.local_maturity = _maturity;
    }
    public String getMaturity( )
    {
        return this.local_maturity;
    }
    public void setWsSQLFullVersion( String _wsSQLFullVersion )
    {
        this.local_wsSQLFullVersion = _wsSQLFullVersion;
    }
    public String getWsSQLFullVersion( )
    {
        return this.local_wsSQLFullVersion;
    }
    public void setWsSQLMajor( String _wsSQLMajor )
    {
        this.local_wsSQLMajor = _wsSQLMajor;
    }
    public String getWsSQLMajor( )
    {
        return this.local_wsSQLMajor;
    }
    public void setWsSQLMinor( String _wsSQLMinor )
    {
        this.local_wsSQLMinor = _wsSQLMinor;
    }
    public String getWsSQLMinor( )
    {
        return this.local_wsSQLMinor;
    }
    public void setWsSQLPoint( String _wsSQLPoint )
    {
        this.local_wsSQLPoint = _wsSQLPoint;
    }
    public String getWsSQLPoint( )
    {
        return this.local_wsSQLPoint;
    }
    public void setWsSQLProject( String _wsSQLProject )
    {
        this.local_wsSQLProject = _wsSQLProject;
    }
    public String getWsSQLProject( )
    {
        return this.local_wsSQLProject;
    }
    public void setWsSQLMaturity( String _wsSQLMaturity )
    {
        this.local_wsSQLMaturity = _wsSQLMaturity;
    }
    public String getWsSQLMaturity( )
    {
        return this.local_wsSQLMaturity;
    }
}