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
 * Class name: WUGetZAPInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUGetZAPInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wUID;
    protected String local_eSPApplication;
    protected String local_thorProcesses;
    protected String local_buildVersion;
    protected String local_archive;
    protected String local_emailTo;
    protected String local_emailFrom;
    protected String local_message;
    protected boolean local_isContainerized;

    public WUGetZAPInfoResponseWrapper() {}

    public WUGetZAPInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse wugetzapinforesponse)
    {
        copy( wugetzapinforesponse );
    }
    public WUGetZAPInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wUID, String _eSPApplication, String _thorProcesses, String _buildVersion, String _archive, String _emailTo, String _emailFrom, String _message, boolean _isContainerized )
    {
        this.local_exceptions = _exceptions;
        this.local_wUID = _wUID;
        this.local_eSPApplication = _eSPApplication;
        this.local_thorProcesses = _thorProcesses;
        this.local_buildVersion = _buildVersion;
        this.local_archive = _archive;
        this.local_emailTo = _emailTo;
        this.local_emailFrom = _emailFrom;
        this.local_message = _message;
        this.local_isContainerized = _isContainerized;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wUID = raw.getWUID();
        this.local_eSPApplication = raw.getESPApplication();
        this.local_thorProcesses = raw.getThorProcesses();
        this.local_buildVersion = raw.getBuildVersion();
        this.local_archive = raw.getArchive();
        this.local_emailTo = raw.getEmailTo();
        this.local_emailFrom = raw.getEmailFrom();
        this.local_message = raw.getMessage();
        this.local_isContainerized = raw.getIsContainerized();

    }

    @Override
    public String toString()
    {
        return "WUGetZAPInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wUID = " + local_wUID + ", " + "eSPApplication = " + local_eSPApplication + ", " + "thorProcesses = " + local_thorProcesses + ", " + "buildVersion = " + local_buildVersion + ", " + "archive = " + local_archive + ", " + "emailTo = " + local_emailTo + ", " + "emailFrom = " + local_emailFrom + ", " + "message = " + local_message + ", " + "isContainerized = " + local_isContainerized + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWUID( local_wUID);
        raw.setESPApplication( local_eSPApplication);
        raw.setThorProcesses( local_thorProcesses);
        raw.setBuildVersion( local_buildVersion);
        raw.setArchive( local_archive);
        raw.setEmailTo( local_emailTo);
        raw.setEmailFrom( local_emailFrom);
        raw.setMessage( local_message);
        raw.setIsContainerized( local_isContainerized);
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
    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setESPApplication( String _eSPApplication )
    {
        this.local_eSPApplication = _eSPApplication;
    }
    public String getESPApplication( )
    {
        return this.local_eSPApplication;
    }
    public void setThorProcesses( String _thorProcesses )
    {
        this.local_thorProcesses = _thorProcesses;
    }
    public String getThorProcesses( )
    {
        return this.local_thorProcesses;
    }
    public void setBuildVersion( String _buildVersion )
    {
        this.local_buildVersion = _buildVersion;
    }
    public String getBuildVersion( )
    {
        return this.local_buildVersion;
    }
    public void setArchive( String _archive )
    {
        this.local_archive = _archive;
    }
    public String getArchive( )
    {
        return this.local_archive;
    }
    public void setEmailTo( String _emailTo )
    {
        this.local_emailTo = _emailTo;
    }
    public String getEmailTo( )
    {
        return this.local_emailTo;
    }
    public void setEmailFrom( String _emailFrom )
    {
        this.local_emailFrom = _emailFrom;
    }
    public String getEmailFrom( )
    {
        return this.local_emailFrom;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
    public void setIsContainerized( boolean _isContainerized )
    {
        this.local_isContainerized = _isContainerized;
    }
    public boolean getIsContainerized( )
    {
        return this.local_isContainerized;
    }
}