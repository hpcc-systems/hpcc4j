package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: LockQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.302Z
 */
public class LockQueryWrapper
{
    protected String local_ePIP;
    protected String local_xPath;
    protected UnsignedInt local_durationMSLow;
    protected UnsignedInt local_durationMSHigh;
    protected String local_timeLockedLow;
    protected String local_timeLockedHigh;
    protected LockModesWrapper local_mode;
    protected boolean local_allFileLocks;

    public LockQueryWrapper() {}

    public LockQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery lockquery)
    {
        copy( lockquery );
    }
    public LockQueryWrapper( String _ePIP, String _xPath, UnsignedInt _durationMSLow, UnsignedInt _durationMSHigh, String _timeLockedLow, String _timeLockedHigh, LockModesWrapper _mode, boolean _allFileLocks )
    {
        this.local_ePIP = _ePIP;
        this.local_xPath = _xPath;
        this.local_durationMSLow = _durationMSLow;
        this.local_durationMSHigh = _durationMSHigh;
        this.local_timeLockedLow = _timeLockedLow;
        this.local_timeLockedHigh = _timeLockedHigh;
        this.local_mode = _mode;
        this.local_allFileLocks = _allFileLocks;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery raw )
    {
        if (raw == null)
            return;

        this.local_ePIP = raw.getEPIP();
        this.local_xPath = raw.getXPath();
        this.local_durationMSLow = raw.getDurationMSLow();
        this.local_durationMSHigh = raw.getDurationMSHigh();
        this.local_timeLockedLow = raw.getTimeLockedLow();
        this.local_timeLockedHigh = raw.getTimeLockedHigh();
        if (raw.getMode() != null)
            this.local_mode = new LockModesWrapper( raw.getMode());
        this.local_allFileLocks = raw.getAllFileLocks();

    }

    @Override
    public String toString()
    {
        return "LockQueryWrapper [" + "ePIP = " + local_ePIP + ", " + "xPath = " + local_xPath + ", " + "durationMSLow = " + local_durationMSLow + ", " + "durationMSHigh = " + local_durationMSHigh + ", " + "timeLockedLow = " + local_timeLockedLow + ", " + "timeLockedHigh = " + local_timeLockedHigh + ", " + "mode = " + local_mode + ", " + "allFileLocks = " + local_allFileLocks + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery();
        raw.setEPIP( local_ePIP);
        raw.setXPath( local_xPath);
        raw.setDurationMSLow( local_durationMSLow);
        raw.setDurationMSHigh( local_durationMSHigh);
        raw.setTimeLockedLow( local_timeLockedLow);
        raw.setTimeLockedHigh( local_timeLockedHigh);
        if (local_mode != null)
            raw.setMode( local_mode.getRaw());
        raw.setAllFileLocks( local_allFileLocks);
        return raw;
    }


    public void setEPIP( String _ePIP )
    {
        this.local_ePIP = _ePIP;
    }
    public String getEPIP( )
    {
        return this.local_ePIP;
    }
    public void setXPath( String _xPath )
    {
        this.local_xPath = _xPath;
    }
    public String getXPath( )
    {
        return this.local_xPath;
    }
    public void setDurationMSLow( UnsignedInt _durationMSLow )
    {
        this.local_durationMSLow = _durationMSLow;
    }
    public UnsignedInt getDurationMSLow( )
    {
        return this.local_durationMSLow;
    }
    public void setDurationMSHigh( UnsignedInt _durationMSHigh )
    {
        this.local_durationMSHigh = _durationMSHigh;
    }
    public UnsignedInt getDurationMSHigh( )
    {
        return this.local_durationMSHigh;
    }
    public void setTimeLockedLow( String _timeLockedLow )
    {
        this.local_timeLockedLow = _timeLockedLow;
    }
    public String getTimeLockedLow( )
    {
        return this.local_timeLockedLow;
    }
    public void setTimeLockedHigh( String _timeLockedHigh )
    {
        this.local_timeLockedHigh = _timeLockedHigh;
    }
    public String getTimeLockedHigh( )
    {
        return this.local_timeLockedHigh;
    }
    public void setMode( LockModesWrapper _mode )
    {
        this.local_mode = _mode;
    }
    public LockModesWrapper getMode( )
    {
        return this.local_mode;
    }
    public void setAllFileLocks( boolean _allFileLocks )
    {
        this.local_allFileLocks = _allFileLocks;
    }
    public boolean getAllFileLocks( )
    {
        return this.local_allFileLocks;
    }
}