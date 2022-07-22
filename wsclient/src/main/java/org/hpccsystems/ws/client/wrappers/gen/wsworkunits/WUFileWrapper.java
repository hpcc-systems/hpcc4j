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
import org.apache.axis2.databinding.types.UnsignedInt;
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.912Z
 */
public class WUFileWrapper
{
    protected String local_name;
    protected String local_wuid;
    protected String local_type;
    protected int local_option;
    protected String local_slaveIP;
    protected String local_iPAddress;
    protected String local_description;
    protected String local_querySet;
    protected String local_query;
    protected String local_process;
    protected String local_clusterGroup;
    protected String local_logDate;
    protected int local_slaveNumber;
    protected long local_sizeLimit;
    protected ErrorMessageFormatWrapper local_errorMessageFormat;
    protected String local_plainText;
    protected UnsignedInt local_maxLogRecords;
    protected LogSelectColumnModeWrapper local_logSelectColumnMode;
    protected LogAccessLogFormatWrapper local_logFormat;
    protected UnsignedInt local_logSearchTimeBuffSecs;
    protected List<String> local_logColumns = null;

    public WUFileWrapper() {}

    public WUFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile wufile)
    {
        copy( wufile );
    }
    public WUFileWrapper( String _name, String _wuid, String _type, int _option, String _slaveIP, String _iPAddress, String _description, String _querySet, String _query, String _process, String _clusterGroup, String _logDate, int _slaveNumber, long _sizeLimit, ErrorMessageFormatWrapper _errorMessageFormat, String _plainText, UnsignedInt _maxLogRecords, LogSelectColumnModeWrapper _logSelectColumnMode, LogAccessLogFormatWrapper _logFormat, UnsignedInt _logSearchTimeBuffSecs, List<String> _logColumns )
    {
        this.local_name = _name;
        this.local_wuid = _wuid;
        this.local_type = _type;
        this.local_option = _option;
        this.local_slaveIP = _slaveIP;
        this.local_iPAddress = _iPAddress;
        this.local_description = _description;
        this.local_querySet = _querySet;
        this.local_query = _query;
        this.local_process = _process;
        this.local_clusterGroup = _clusterGroup;
        this.local_logDate = _logDate;
        this.local_slaveNumber = _slaveNumber;
        this.local_sizeLimit = _sizeLimit;
        this.local_errorMessageFormat = _errorMessageFormat;
        this.local_plainText = _plainText;
        this.local_maxLogRecords = _maxLogRecords;
        this.local_logSelectColumnMode = _logSelectColumnMode;
        this.local_logFormat = _logFormat;
        this.local_logSearchTimeBuffSecs = _logSearchTimeBuffSecs;
        this.local_logColumns = _logColumns;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_wuid = raw.getWuid();
        this.local_type = raw.getType();
        this.local_option = raw.getOption();
        this.local_slaveIP = raw.getSlaveIP();
        this.local_iPAddress = raw.getIPAddress();
        this.local_description = raw.getDescription();
        this.local_querySet = raw.getQuerySet();
        this.local_query = raw.getQuery();
        this.local_process = raw.getProcess();
        this.local_clusterGroup = raw.getClusterGroup();
        this.local_logDate = raw.getLogDate();
        this.local_slaveNumber = raw.getSlaveNumber();
        this.local_sizeLimit = raw.getSizeLimit();
        if (raw.getErrorMessageFormat() != null)
            this.local_errorMessageFormat = new ErrorMessageFormatWrapper( raw.getErrorMessageFormat());
        this.local_plainText = raw.getPlainText();
        this.local_maxLogRecords = raw.getMaxLogRecords();
        if (raw.getLogSelectColumnMode() != null)
            this.local_logSelectColumnMode = new LogSelectColumnModeWrapper( raw.getLogSelectColumnMode());
        if (raw.getLogFormat() != null)
            this.local_logFormat = new LogAccessLogFormatWrapper( raw.getLogFormat());
        this.local_logSearchTimeBuffSecs = raw.getLogSearchTimeBuffSecs();
        if (raw.getLogColumns() != null)
        {
            this.local_logColumns = new ArrayList<String>();
            for ( int i = 0; i < raw.getLogColumns().getItem().length; i++)
            {
                this.local_logColumns.add(new String(raw.getLogColumns().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "WUFileWrapper [" + "name = " + local_name + ", " + "wuid = " + local_wuid + ", " + "type = " + local_type + ", " + "option = " + local_option + ", " + "slaveIP = " + local_slaveIP + ", " + "iPAddress = " + local_iPAddress + ", " + "description = " + local_description + ", " + "querySet = " + local_querySet + ", " + "query = " + local_query + ", " + "process = " + local_process + ", " + "clusterGroup = " + local_clusterGroup + ", " + "logDate = " + local_logDate + ", " + "slaveNumber = " + local_slaveNumber + ", " + "sizeLimit = " + local_sizeLimit + ", " + "errorMessageFormat = " + local_errorMessageFormat + ", " + "plainText = " + local_plainText + ", " + "maxLogRecords = " + local_maxLogRecords + ", " + "logSelectColumnMode = " + local_logSelectColumnMode + ", " + "logFormat = " + local_logFormat + ", " + "logSearchTimeBuffSecs = " + local_logSearchTimeBuffSecs + ", " + "logColumns = " + local_logColumns + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile();
        raw.setName( local_name);
        raw.setWuid( local_wuid);
        raw.setType( local_type);
        raw.setOption( local_option);
        raw.setSlaveIP( local_slaveIP);
        raw.setIPAddress( local_iPAddress);
        raw.setDescription( local_description);
        raw.setQuerySet( local_querySet);
        raw.setQuery( local_query);
        raw.setProcess( local_process);
        raw.setClusterGroup( local_clusterGroup);
        raw.setLogDate( local_logDate);
        raw.setSlaveNumber( local_slaveNumber);
        raw.setSizeLimit( local_sizeLimit);
        raw.setPlainText( local_plainText);
        raw.setMaxLogRecords( local_maxLogRecords);
        raw.setLogSearchTimeBuffSecs( local_logSearchTimeBuffSecs);
        if (this.local_logColumns!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_logColumns.size(); i++)
            {
                arr.addItem(this.local_logColumns.get(i));
            }
            raw.setLogColumns(arr);
        }
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setOption( int _option )
    {
        this.local_option = _option;
    }
    public int getOption( )
    {
        return this.local_option;
    }
    public void setSlaveIP( String _slaveIP )
    {
        this.local_slaveIP = _slaveIP;
    }
    public String getSlaveIP( )
    {
        return this.local_slaveIP;
    }
    public void setIPAddress( String _iPAddress )
    {
        this.local_iPAddress = _iPAddress;
    }
    public String getIPAddress( )
    {
        return this.local_iPAddress;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
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
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setClusterGroup( String _clusterGroup )
    {
        this.local_clusterGroup = _clusterGroup;
    }
    public String getClusterGroup( )
    {
        return this.local_clusterGroup;
    }
    public void setLogDate( String _logDate )
    {
        this.local_logDate = _logDate;
    }
    public String getLogDate( )
    {
        return this.local_logDate;
    }
    public void setSlaveNumber( int _slaveNumber )
    {
        this.local_slaveNumber = _slaveNumber;
    }
    public int getSlaveNumber( )
    {
        return this.local_slaveNumber;
    }
    public void setSizeLimit( long _sizeLimit )
    {
        this.local_sizeLimit = _sizeLimit;
    }
    public long getSizeLimit( )
    {
        return this.local_sizeLimit;
    }
    public void setErrorMessageFormat( ErrorMessageFormatWrapper _errorMessageFormat )
    {
        this.local_errorMessageFormat = _errorMessageFormat;
    }
    public ErrorMessageFormatWrapper getErrorMessageFormat( )
    {
        return this.local_errorMessageFormat;
    }
    public void setPlainText( String _plainText )
    {
        this.local_plainText = _plainText;
    }
    public String getPlainText( )
    {
        return this.local_plainText;
    }
    public void setMaxLogRecords( UnsignedInt _maxLogRecords )
    {
        this.local_maxLogRecords = _maxLogRecords;
    }
    public UnsignedInt getMaxLogRecords( )
    {
        return this.local_maxLogRecords;
    }
    public void setLogSelectColumnMode( LogSelectColumnModeWrapper _logSelectColumnMode )
    {
        this.local_logSelectColumnMode = _logSelectColumnMode;
    }
    public LogSelectColumnModeWrapper getLogSelectColumnMode( )
    {
        return this.local_logSelectColumnMode;
    }
    public void setLogFormat( LogAccessLogFormatWrapper _logFormat )
    {
        this.local_logFormat = _logFormat;
    }
    public LogAccessLogFormatWrapper getLogFormat( )
    {
        return this.local_logFormat;
    }
    public void setLogSearchTimeBuffSecs( UnsignedInt _logSearchTimeBuffSecs )
    {
        this.local_logSearchTimeBuffSecs = _logSearchTimeBuffSecs;
    }
    public UnsignedInt getLogSearchTimeBuffSecs( )
    {
        return this.local_logSearchTimeBuffSecs;
    }
    public void setLogColumns( List<String> _logColumns )
    {
        this.local_logColumns = _logColumns;
    }
    public List<String> getLogColumns( )
    {
        return this.local_logColumns;
    }
}