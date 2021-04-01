package org.hpccsystems.ws.client.wrappers.gen.wssmc;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
import org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: LockWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.031Z
 */
public class LockWrapper
{
	protected String local_ePIP;
	protected String local_xPath;
	protected String local_logicalFile;
	protected long local_sessionID;
	protected UnsignedInt local_durationMS;
	protected String local_timeLocked;
	protected String local_modes;
	protected List<String> local_modeNames = null;

	public LockWrapper() {}

	public LockWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock lock)
	{
		copy( lock );
	}
	public LockWrapper( String _ePIP, String _xPath, String _logicalFile, long _sessionID, UnsignedInt _durationMS, String _timeLocked, String _modes, List<String> _modeNames )
	{
		this.local_ePIP = _ePIP;
		this.local_xPath = _xPath;
		this.local_logicalFile = _logicalFile;
		this.local_sessionID = _sessionID;
		this.local_durationMS = _durationMS;
		this.local_timeLocked = _timeLocked;
		this.local_modes = _modes;
		this.local_modeNames = _modeNames;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock raw )
	{
		if (raw == null)
			return;

		this.local_ePIP = raw.getEPIP();
		this.local_xPath = raw.getXPath();
		this.local_logicalFile = raw.getLogicalFile();
		this.local_sessionID = raw.getSessionID();
		this.local_durationMS = raw.getDurationMS();
		this.local_timeLocked = raw.getTimeLocked();
		this.local_modes = raw.getModes();
		if (raw.getModeNames() != null)
		{
			this.local_modeNames = new ArrayList<String>();
			for ( int i = 0; i < raw.getModeNames().getItem().length; i++)
			{
				this.local_modeNames.add(new String(raw.getModeNames().getItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "LockWrapper [" + "ePIP = " + local_ePIP + ", " + "xPath = " + local_xPath + ", " + "logicalFile = " + local_logicalFile + ", " + "sessionID = " + local_sessionID + ", " + "durationMS = " + local_durationMS + ", " + "timeLocked = " + local_timeLocked + ", " + "modes = " + local_modes + ", " + "modeNames = " + local_modeNames + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock();
		raw.setEPIP( local_ePIP);
		raw.setXPath( local_xPath);
		raw.setLogicalFile( local_logicalFile);
		raw.setSessionID( local_sessionID);
		raw.setDurationMS( local_durationMS);
		raw.setTimeLocked( local_timeLocked);
		raw.setModes( local_modes);
		if (this.local_modeNames!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_modeNames.size(); i++)
			{
				arr.addItem(this.local_modeNames.get(i));
			}
			raw.setModeNames(arr);
		}
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
	public void setLogicalFile( String _logicalFile )
	{
		this.local_logicalFile = _logicalFile;
	}
	public String getLogicalFile( )
	{
		return this.local_logicalFile;
	}
	public void setSessionID( long _sessionID )
	{
		this.local_sessionID = _sessionID;
	}
	public long getSessionID( )
	{
		return this.local_sessionID;
	}
	public void setDurationMS( UnsignedInt _durationMS )
	{
		this.local_durationMS = _durationMS;
	}
	public UnsignedInt getDurationMS( )
	{
		return this.local_durationMS;
	}
	public void setTimeLocked( String _timeLocked )
	{
		this.local_timeLocked = _timeLocked;
	}
	public String getTimeLocked( )
	{
		return this.local_timeLocked;
	}
	public void setModes( String _modes )
	{
		this.local_modes = _modes;
	}
	public String getModes( )
	{
		return this.local_modes;
	}
	public void setModeNames( List<String> _modeNames )
	{
		this.local_modeNames = _modeNames;
	}
	public List<String> getModeNames( )
	{
		return this.local_modeNames;
	}
}