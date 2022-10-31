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
 * TimeStamp: 2022-10-31T03:30:27.543Z
 */
public class WUGetZAPInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wUID;
    protected String local_eSPIPAddress;
    protected String local_thorIPAddress;
    protected String local_buildVersion;
    protected String local_archive;
    protected String local_emailTo;
    protected String local_emailFrom;

    public WUGetZAPInfoResponseWrapper() {}

    public WUGetZAPInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse wugetzapinforesponse)
    {
        copy( wugetzapinforesponse );
    }
    public WUGetZAPInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wUID, String _eSPIPAddress, String _thorIPAddress, String _buildVersion, String _archive, String _emailTo, String _emailFrom )
    {
        this.local_exceptions = _exceptions;
        this.local_wUID = _wUID;
        this.local_eSPIPAddress = _eSPIPAddress;
        this.local_thorIPAddress = _thorIPAddress;
        this.local_buildVersion = _buildVersion;
        this.local_archive = _archive;
        this.local_emailTo = _emailTo;
        this.local_emailFrom = _emailFrom;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wUID = raw.getWUID();
        this.local_eSPIPAddress = raw.getESPIPAddress();
        this.local_thorIPAddress = raw.getThorIPAddress();
        this.local_buildVersion = raw.getBuildVersion();
        this.local_archive = raw.getArchive();
        this.local_emailTo = raw.getEmailTo();
        this.local_emailFrom = raw.getEmailFrom();

    }

    @Override
    public String toString()
    {
        return "WUGetZAPInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wUID = " + local_wUID + ", " + "eSPIPAddress = " + local_eSPIPAddress + ", " + "thorIPAddress = " + local_thorIPAddress + ", " + "buildVersion = " + local_buildVersion + ", " + "archive = " + local_archive + ", " + "emailTo = " + local_emailTo + ", " + "emailFrom = " + local_emailFrom + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfoResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWUID( local_wUID);
        raw.setESPIPAddress( local_eSPIPAddress);
        raw.setThorIPAddress( local_thorIPAddress);
        raw.setBuildVersion( local_buildVersion);
        raw.setArchive( local_archive);
        raw.setEmailTo( local_emailTo);
        raw.setEmailFrom( local_emailFrom);
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
    public void setESPIPAddress( String _eSPIPAddress )
    {
        this.local_eSPIPAddress = _eSPIPAddress;
    }
    public String getESPIPAddress( )
    {
        return this.local_eSPIPAddress;
    }
    public void setThorIPAddress( String _thorIPAddress )
    {
        this.local_thorIPAddress = _thorIPAddress;
    }
    public String getThorIPAddress( )
    {
        return this.local_thorIPAddress;
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
}