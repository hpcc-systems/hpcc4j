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
 * Class name: WUCreateZAPInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUCreateZAPInfoWrapper
{
    protected String local_wuid;
    protected String local_eSPApplication;
    protected String local_thorProcesses;
    protected String local_buildVersion;
    protected String local_problemDescription;
    protected String local_whatChanged;
    protected String local_whereSlow;
    protected String local_zAPFileName;
    protected String local_includeThorSlaveLog;
    protected String local_zAPPassword;
    protected boolean local_sendEmail;
    protected boolean local_attachZAPReportToEmail;
    protected String local_emailFrom;
    protected String local_emailSubject;
    protected String local_emailBody;
    protected LogAccessFilterWrapper local_logFilter;
    protected boolean local_includeRelatedLogs;
    protected boolean local_includePerComponentLogs;

    public WUCreateZAPInfoWrapper() {}

    public WUCreateZAPInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfo wucreatezapinfo)
    {
        copy( wucreatezapinfo );
    }
    public WUCreateZAPInfoWrapper( String _wuid, String _eSPApplication, String _thorProcesses, String _buildVersion, String _problemDescription, String _whatChanged, String _whereSlow, String _zAPFileName, String _includeThorSlaveLog, String _zAPPassword, boolean _sendEmail, boolean _attachZAPReportToEmail, String _emailFrom, String _emailSubject, String _emailBody, LogAccessFilterWrapper _logFilter, boolean _includeRelatedLogs, boolean _includePerComponentLogs )
    {
        this.local_wuid = _wuid;
        this.local_eSPApplication = _eSPApplication;
        this.local_thorProcesses = _thorProcesses;
        this.local_buildVersion = _buildVersion;
        this.local_problemDescription = _problemDescription;
        this.local_whatChanged = _whatChanged;
        this.local_whereSlow = _whereSlow;
        this.local_zAPFileName = _zAPFileName;
        this.local_includeThorSlaveLog = _includeThorSlaveLog;
        this.local_zAPPassword = _zAPPassword;
        this.local_sendEmail = _sendEmail;
        this.local_attachZAPReportToEmail = _attachZAPReportToEmail;
        this.local_emailFrom = _emailFrom;
        this.local_emailSubject = _emailSubject;
        this.local_emailBody = _emailBody;
        this.local_logFilter = _logFilter;
        this.local_includeRelatedLogs = _includeRelatedLogs;
        this.local_includePerComponentLogs = _includePerComponentLogs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfo raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_eSPApplication = raw.getESPApplication();
        this.local_thorProcesses = raw.getThorProcesses();
        this.local_buildVersion = raw.getBuildVersion();
        this.local_problemDescription = raw.getProblemDescription();
        this.local_whatChanged = raw.getWhatChanged();
        this.local_whereSlow = raw.getWhereSlow();
        this.local_zAPFileName = raw.getZAPFileName();
        this.local_includeThorSlaveLog = raw.getIncludeThorSlaveLog();
        this.local_zAPPassword = raw.getZAPPassword();
        this.local_sendEmail = raw.getSendEmail();
        this.local_attachZAPReportToEmail = raw.getAttachZAPReportToEmail();
        this.local_emailFrom = raw.getEmailFrom();
        this.local_emailSubject = raw.getEmailSubject();
        this.local_emailBody = raw.getEmailBody();
        if (raw.getLogFilter() != null)
            this.local_logFilter = new LogAccessFilterWrapper( raw.getLogFilter());
        this.local_includeRelatedLogs = raw.getIncludeRelatedLogs();
        this.local_includePerComponentLogs = raw.getIncludePerComponentLogs();

    }

    @Override
    public String toString()
    {
        return "WUCreateZAPInfoWrapper [" + "wuid = " + local_wuid + ", " + "eSPApplication = " + local_eSPApplication + ", " + "thorProcesses = " + local_thorProcesses + ", " + "buildVersion = " + local_buildVersion + ", " + "problemDescription = " + local_problemDescription + ", " + "whatChanged = " + local_whatChanged + ", " + "whereSlow = " + local_whereSlow + ", " + "zAPFileName = " + local_zAPFileName + ", " + "includeThorSlaveLog = " + local_includeThorSlaveLog + ", " + "zAPPassword = " + local_zAPPassword + ", " + "sendEmail = " + local_sendEmail + ", " + "attachZAPReportToEmail = " + local_attachZAPReportToEmail + ", " + "emailFrom = " + local_emailFrom + ", " + "emailSubject = " + local_emailSubject + ", " + "emailBody = " + local_emailBody + ", " + "logFilter = " + local_logFilter + ", " + "includeRelatedLogs = " + local_includeRelatedLogs + ", " + "includePerComponentLogs = " + local_includePerComponentLogs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfo();
        raw.setWuid( local_wuid);
        raw.setESPApplication( local_eSPApplication);
        raw.setThorProcesses( local_thorProcesses);
        raw.setBuildVersion( local_buildVersion);
        raw.setProblemDescription( local_problemDescription);
        raw.setWhatChanged( local_whatChanged);
        raw.setWhereSlow( local_whereSlow);
        raw.setZAPFileName( local_zAPFileName);
        raw.setIncludeThorSlaveLog( local_includeThorSlaveLog);
        raw.setZAPPassword( local_zAPPassword);
        raw.setSendEmail( local_sendEmail);
        raw.setAttachZAPReportToEmail( local_attachZAPReportToEmail);
        raw.setEmailFrom( local_emailFrom);
        raw.setEmailSubject( local_emailSubject);
        raw.setEmailBody( local_emailBody);
        if (local_logFilter != null)
            raw.setLogFilter( local_logFilter.getRaw());
        raw.setIncludeRelatedLogs( local_includeRelatedLogs);
        raw.setIncludePerComponentLogs( local_includePerComponentLogs);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
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
    public void setProblemDescription( String _problemDescription )
    {
        this.local_problemDescription = _problemDescription;
    }
    public String getProblemDescription( )
    {
        return this.local_problemDescription;
    }
    public void setWhatChanged( String _whatChanged )
    {
        this.local_whatChanged = _whatChanged;
    }
    public String getWhatChanged( )
    {
        return this.local_whatChanged;
    }
    public void setWhereSlow( String _whereSlow )
    {
        this.local_whereSlow = _whereSlow;
    }
    public String getWhereSlow( )
    {
        return this.local_whereSlow;
    }
    public void setZAPFileName( String _zAPFileName )
    {
        this.local_zAPFileName = _zAPFileName;
    }
    public String getZAPFileName( )
    {
        return this.local_zAPFileName;
    }
    public void setIncludeThorSlaveLog( String _includeThorSlaveLog )
    {
        this.local_includeThorSlaveLog = _includeThorSlaveLog;
    }
    public String getIncludeThorSlaveLog( )
    {
        return this.local_includeThorSlaveLog;
    }
    public void setZAPPassword( String _zAPPassword )
    {
        this.local_zAPPassword = _zAPPassword;
    }
    public String getZAPPassword( )
    {
        return this.local_zAPPassword;
    }
    public void setSendEmail( boolean _sendEmail )
    {
        this.local_sendEmail = _sendEmail;
    }
    public boolean getSendEmail( )
    {
        return this.local_sendEmail;
    }
    public void setAttachZAPReportToEmail( boolean _attachZAPReportToEmail )
    {
        this.local_attachZAPReportToEmail = _attachZAPReportToEmail;
    }
    public boolean getAttachZAPReportToEmail( )
    {
        return this.local_attachZAPReportToEmail;
    }
    public void setEmailFrom( String _emailFrom )
    {
        this.local_emailFrom = _emailFrom;
    }
    public String getEmailFrom( )
    {
        return this.local_emailFrom;
    }
    public void setEmailSubject( String _emailSubject )
    {
        this.local_emailSubject = _emailSubject;
    }
    public String getEmailSubject( )
    {
        return this.local_emailSubject;
    }
    public void setEmailBody( String _emailBody )
    {
        this.local_emailBody = _emailBody;
    }
    public String getEmailBody( )
    {
        return this.local_emailBody;
    }
    public void setLogFilter( LogAccessFilterWrapper _logFilter )
    {
        this.local_logFilter = _logFilter;
    }
    public LogAccessFilterWrapper getLogFilter( )
    {
        return this.local_logFilter;
    }
    public void setIncludeRelatedLogs( boolean _includeRelatedLogs )
    {
        this.local_includeRelatedLogs = _includeRelatedLogs;
    }
    public boolean getIncludeRelatedLogs( )
    {
        return this.local_includeRelatedLogs;
    }
    public void setIncludePerComponentLogs( boolean _includePerComponentLogs )
    {
        this.local_includePerComponentLogs = _includePerComponentLogs;
    }
    public boolean getIncludePerComponentLogs( )
    {
        return this.local_includePerComponentLogs;
    }
}