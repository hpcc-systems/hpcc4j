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
 * Class name: WUFileOptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileOption
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUFileOptionWrapper
{
    protected WUFileTypeWrapper local_fileType;
    protected String local_name;
    protected String local_iPAddress;
    protected String local_description;
    protected String local_process;
    protected String local_logDate;
    protected String local_clusterGroup;
    protected String local_plainText;
    protected int local_slaveNumber;
    protected long local_sizeLimit;
    protected UnsignedInt local_maxLogRecords;
    protected LogSelectColumnModeWrapper local_logSelectColumnMode;
    protected LogAccessLogFormatWrapper local_logFormat;
    protected UnsignedInt local_logSearchTimeBuffSecs;
    protected List<String> local_logColumns = null;

    public WUFileOptionWrapper() {}

    public WUFileOptionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileOption wufileoption)
    {
        copy( wufileoption );
    }
    public WUFileOptionWrapper( WUFileTypeWrapper _fileType, String _name, String _iPAddress, String _description, String _process, String _logDate, String _clusterGroup, String _plainText, int _slaveNumber, long _sizeLimit, UnsignedInt _maxLogRecords, LogSelectColumnModeWrapper _logSelectColumnMode, LogAccessLogFormatWrapper _logFormat, UnsignedInt _logSearchTimeBuffSecs, List<String> _logColumns )
    {
        this.local_fileType = _fileType;
        this.local_name = _name;
        this.local_iPAddress = _iPAddress;
        this.local_description = _description;
        this.local_process = _process;
        this.local_logDate = _logDate;
        this.local_clusterGroup = _clusterGroup;
        this.local_plainText = _plainText;
        this.local_slaveNumber = _slaveNumber;
        this.local_sizeLimit = _sizeLimit;
        this.local_maxLogRecords = _maxLogRecords;
        this.local_logSelectColumnMode = _logSelectColumnMode;
        this.local_logFormat = _logFormat;
        this.local_logSearchTimeBuffSecs = _logSearchTimeBuffSecs;
        this.local_logColumns = _logColumns;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileOption raw )
    {
        if (raw == null)
            return;

        if (raw.getFileType() != null)
            this.local_fileType = new WUFileTypeWrapper( raw.getFileType());
        this.local_name = raw.getName();
        this.local_iPAddress = raw.getIPAddress();
        this.local_description = raw.getDescription();
        this.local_process = raw.getProcess();
        this.local_logDate = raw.getLogDate();
        this.local_clusterGroup = raw.getClusterGroup();
        this.local_plainText = raw.getPlainText();
        this.local_slaveNumber = raw.getSlaveNumber();
        this.local_sizeLimit = raw.getSizeLimit();
        this.local_maxLogRecords = raw.getMaxLogRecords();
        if (raw.getLogSelectColumnMode() != null)
            this.local_logSelectColumnMode = new LogSelectColumnModeWrapper( raw.getLogSelectColumnMode());
        if (raw.getLogFormat() != null)
            this.local_logFormat = new LogAccessLogFormatWrapper( raw.getLogFormat());
        this.local_logSearchTimeBuffSecs = raw.getLogSearchTimeBuffSecs();
        if (raw.getLogColumns() != null && raw.getLogColumns().getItem() != null)
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
        return "WUFileOptionWrapper [" + "fileType = " + local_fileType + ", " + "name = " + local_name + ", " + "iPAddress = " + local_iPAddress + ", " + "description = " + local_description + ", " + "process = " + local_process + ", " + "logDate = " + local_logDate + ", " + "clusterGroup = " + local_clusterGroup + ", " + "plainText = " + local_plainText + ", " + "slaveNumber = " + local_slaveNumber + ", " + "sizeLimit = " + local_sizeLimit + ", " + "maxLogRecords = " + local_maxLogRecords + ", " + "logSelectColumnMode = " + local_logSelectColumnMode + ", " + "logFormat = " + local_logFormat + ", " + "logSearchTimeBuffSecs = " + local_logSearchTimeBuffSecs + ", " + "logColumns = " + local_logColumns + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileOption getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileOption raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileOption();
        if (local_fileType != null)
            raw.setFileType( local_fileType.getRaw());
        raw.setName( local_name);
        raw.setIPAddress( local_iPAddress);
        raw.setDescription( local_description);
        raw.setProcess( local_process);
        raw.setLogDate( local_logDate);
        raw.setClusterGroup( local_clusterGroup);
        raw.setPlainText( local_plainText);
        raw.setSlaveNumber( local_slaveNumber);
        raw.setSizeLimit( local_sizeLimit);
        raw.setMaxLogRecords( local_maxLogRecords);
        if (local_logSelectColumnMode != null)
            raw.setLogSelectColumnMode( local_logSelectColumnMode.getRaw());
        if (local_logFormat != null)
            raw.setLogFormat( local_logFormat.getRaw());
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


    public void setFileType( WUFileTypeWrapper _fileType )
    {
        this.local_fileType = _fileType;
    }
    public WUFileTypeWrapper getFileType( )
    {
        return this.local_fileType;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
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
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setLogDate( String _logDate )
    {
        this.local_logDate = _logDate;
    }
    public String getLogDate( )
    {
        return this.local_logDate;
    }
    public void setClusterGroup( String _clusterGroup )
    {
        this.local_clusterGroup = _clusterGroup;
    }
    public String getClusterGroup( )
    {
        return this.local_clusterGroup;
    }
    public void setPlainText( String _plainText )
    {
        this.local_plainText = _plainText;
    }
    public String getPlainText( )
    {
        return this.local_plainText;
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