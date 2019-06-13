package org.hpccsystems.ws.client.wrappers.gen.filespray;



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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.857Z
 */
public class DFUWorkunitWrapper
{
protected String local_iD;
protected String local_dFUServerName;
protected String local_clusterName;
protected String local_jobName;
protected String local_queue;
protected String local_user;
protected boolean local_isProtected;
protected int local_command;
protected String local_commandMessage;
protected int local_percentDone;
protected int local_secsLeft;
protected String local_progressMessage;
protected String local_summaryMessage;
protected int local_state;
protected String local_sourceLogicalName;
protected String local_sourceIP;
protected String local_sourceFilePath;
protected String local_sourceDali;
protected int local_sourceRecordSize;
protected int local_sourceFormat;
protected String local_rowTag;
protected int local_sourceNumParts;
protected String local_sourceDirectory;
protected String local_destLogicalName;
protected String local_destGroupName;
protected String local_destDirectory;
protected String local_destIP;
protected String local_destFilePath;
protected int local_destFormat;
protected int local_destNumParts;
protected int local_destRecordSize;
protected boolean local_replicate;
protected boolean local_overwrite;
protected boolean local_compress;
protected String local_sourceCsvSeparate;
protected String local_sourceCsvQuote;
protected String local_sourceCsvTerminate;
protected String local_sourceCsvEscape;
protected String local_timeStarted;
protected String local_timeStopped;
protected String local_stateMessage;
protected String local_monitorEventName;
protected boolean local_monitorSub;
protected int local_monitorShotLimit;
protected String local_sourceDiffKeyName;
protected String local_destDiffKeyName;
protected boolean local_archived;
protected String local_encrypt;
protected String local_decrypt;
protected boolean local_failIfNoSourceFile;
protected boolean local_recordStructurePresent;
protected boolean local_quotedTerminator;
protected boolean local_preserveCompression;
protected int local_expireDays;

	public DFUWorkunitWrapper() {}

	public DFUWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit dfuworkunit)
	{
		copy( dfuworkunit );
	}
	public DFUWorkunitWrapper( String _iD, String _dFUServerName, String _clusterName, String _jobName, String _queue, String _user, boolean _isProtected, int _command, String _commandMessage, int _percentDone, int _secsLeft, String _progressMessage, String _summaryMessage, int _state, String _sourceLogicalName, String _sourceIP, String _sourceFilePath, String _sourceDali, int _sourceRecordSize, int _sourceFormat, String _rowTag, int _sourceNumParts, String _sourceDirectory, String _destLogicalName, String _destGroupName, String _destDirectory, String _destIP, String _destFilePath, int _destFormat, int _destNumParts, int _destRecordSize, boolean _replicate, boolean _overwrite, boolean _compress, String _sourceCsvSeparate, String _sourceCsvQuote, String _sourceCsvTerminate, String _sourceCsvEscape, String _timeStarted, String _timeStopped, String _stateMessage, String _monitorEventName, boolean _monitorSub, int _monitorShotLimit, String _sourceDiffKeyName, String _destDiffKeyName, boolean _archived, String _encrypt, String _decrypt, boolean _failIfNoSourceFile, boolean _recordStructurePresent, boolean _quotedTerminator, boolean _preserveCompression, int _expireDays )
	{
		this.local_iD = _iD;
		this.local_dFUServerName = _dFUServerName;
		this.local_clusterName = _clusterName;
		this.local_jobName = _jobName;
		this.local_queue = _queue;
		this.local_user = _user;
		this.local_isProtected = _isProtected;
		this.local_command = _command;
		this.local_commandMessage = _commandMessage;
		this.local_percentDone = _percentDone;
		this.local_secsLeft = _secsLeft;
		this.local_progressMessage = _progressMessage;
		this.local_summaryMessage = _summaryMessage;
		this.local_state = _state;
		this.local_sourceLogicalName = _sourceLogicalName;
		this.local_sourceIP = _sourceIP;
		this.local_sourceFilePath = _sourceFilePath;
		this.local_sourceDali = _sourceDali;
		this.local_sourceRecordSize = _sourceRecordSize;
		this.local_sourceFormat = _sourceFormat;
		this.local_rowTag = _rowTag;
		this.local_sourceNumParts = _sourceNumParts;
		this.local_sourceDirectory = _sourceDirectory;
		this.local_destLogicalName = _destLogicalName;
		this.local_destGroupName = _destGroupName;
		this.local_destDirectory = _destDirectory;
		this.local_destIP = _destIP;
		this.local_destFilePath = _destFilePath;
		this.local_destFormat = _destFormat;
		this.local_destNumParts = _destNumParts;
		this.local_destRecordSize = _destRecordSize;
		this.local_replicate = _replicate;
		this.local_overwrite = _overwrite;
		this.local_compress = _compress;
		this.local_sourceCsvSeparate = _sourceCsvSeparate;
		this.local_sourceCsvQuote = _sourceCsvQuote;
		this.local_sourceCsvTerminate = _sourceCsvTerminate;
		this.local_sourceCsvEscape = _sourceCsvEscape;
		this.local_timeStarted = _timeStarted;
		this.local_timeStopped = _timeStopped;
		this.local_stateMessage = _stateMessage;
		this.local_monitorEventName = _monitorEventName;
		this.local_monitorSub = _monitorSub;
		this.local_monitorShotLimit = _monitorShotLimit;
		this.local_sourceDiffKeyName = _sourceDiffKeyName;
		this.local_destDiffKeyName = _destDiffKeyName;
		this.local_archived = _archived;
		this.local_encrypt = _encrypt;
		this.local_decrypt = _decrypt;
		this.local_failIfNoSourceFile = _failIfNoSourceFile;
		this.local_recordStructurePresent = _recordStructurePresent;
		this.local_quotedTerminator = _quotedTerminator;
		this.local_preserveCompression = _preserveCompression;
		this.local_expireDays = _expireDays;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit raw )
	{
		if (raw == null)
			return;

		this.local_iD = raw.getID();
		this.local_dFUServerName = raw.getDFUServerName();
		this.local_clusterName = raw.getClusterName();
		this.local_jobName = raw.getJobName();
		this.local_queue = raw.getQueue();
		this.local_user = raw.getUser();
		this.local_isProtected = raw.getIsProtected();
		this.local_command = raw.getCommand();
		this.local_commandMessage = raw.getCommandMessage();
		this.local_percentDone = raw.getPercentDone();
		this.local_secsLeft = raw.getSecsLeft();
		this.local_progressMessage = raw.getProgressMessage();
		this.local_summaryMessage = raw.getSummaryMessage();
		this.local_state = raw.getState();
		this.local_sourceLogicalName = raw.getSourceLogicalName();
		this.local_sourceIP = raw.getSourceIP();
		this.local_sourceFilePath = raw.getSourceFilePath();
		this.local_sourceDali = raw.getSourceDali();
		this.local_sourceRecordSize = raw.getSourceRecordSize();
		this.local_sourceFormat = raw.getSourceFormat();
		this.local_rowTag = raw.getRowTag();
		this.local_sourceNumParts = raw.getSourceNumParts();
		this.local_sourceDirectory = raw.getSourceDirectory();
		this.local_destLogicalName = raw.getDestLogicalName();
		this.local_destGroupName = raw.getDestGroupName();
		this.local_destDirectory = raw.getDestDirectory();
		this.local_destIP = raw.getDestIP();
		this.local_destFilePath = raw.getDestFilePath();
		this.local_destFormat = raw.getDestFormat();
		this.local_destNumParts = raw.getDestNumParts();
		this.local_destRecordSize = raw.getDestRecordSize();
		this.local_replicate = raw.getReplicate();
		this.local_overwrite = raw.getOverwrite();
		this.local_compress = raw.getCompress();
		this.local_sourceCsvSeparate = raw.getSourceCsvSeparate();
		this.local_sourceCsvQuote = raw.getSourceCsvQuote();
		this.local_sourceCsvTerminate = raw.getSourceCsvTerminate();
		this.local_sourceCsvEscape = raw.getSourceCsvEscape();
		this.local_timeStarted = raw.getTimeStarted();
		this.local_timeStopped = raw.getTimeStopped();
		this.local_stateMessage = raw.getStateMessage();
		this.local_monitorEventName = raw.getMonitorEventName();
		this.local_monitorSub = raw.getMonitorSub();
		this.local_monitorShotLimit = raw.getMonitorShotLimit();
		this.local_sourceDiffKeyName = raw.getSourceDiffKeyName();
		this.local_destDiffKeyName = raw.getDestDiffKeyName();
		this.local_archived = raw.getArchived();
		this.local_encrypt = raw.getEncrypt();
		this.local_decrypt = raw.getDecrypt();
		this.local_failIfNoSourceFile = raw.getFailIfNoSourceFile();
		this.local_recordStructurePresent = raw.getRecordStructurePresent();
		this.local_quotedTerminator = raw.getQuotedTerminator();
		this.local_preserveCompression = raw.getPreserveCompression();
		this.local_expireDays = raw.getExpireDays();

	}

	@Override
	public String toString()
	{
		return "DFUWorkunitWrapper [" + "iD = " + local_iD + ", " + "dFUServerName = " + local_dFUServerName + ", " + "clusterName = " + local_clusterName + ", " + "jobName = " + local_jobName + ", " + "queue = " + local_queue + ", " + "user = " + local_user + ", " + "isProtected = " + local_isProtected + ", " + "command = " + local_command + ", " + "commandMessage = " + local_commandMessage + ", " + "percentDone = " + local_percentDone + ", " + "secsLeft = " + local_secsLeft + ", " + "progressMessage = " + local_progressMessage + ", " + "summaryMessage = " + local_summaryMessage + ", " + "state = " + local_state + ", " + "sourceLogicalName = " + local_sourceLogicalName + ", " + "sourceIP = " + local_sourceIP + ", " + "sourceFilePath = " + local_sourceFilePath + ", " + "sourceDali = " + local_sourceDali + ", " + "sourceRecordSize = " + local_sourceRecordSize + ", " + "sourceFormat = " + local_sourceFormat + ", " + "rowTag = " + local_rowTag + ", " + "sourceNumParts = " + local_sourceNumParts + ", " + "sourceDirectory = " + local_sourceDirectory + ", " + "destLogicalName = " + local_destLogicalName + ", " + "destGroupName = " + local_destGroupName + ", " + "destDirectory = " + local_destDirectory + ", " + "destIP = " + local_destIP + ", " + "destFilePath = " + local_destFilePath + ", " + "destFormat = " + local_destFormat + ", " + "destNumParts = " + local_destNumParts + ", " + "destRecordSize = " + local_destRecordSize + ", " + "replicate = " + local_replicate + ", " + "overwrite = " + local_overwrite + ", " + "compress = " + local_compress + ", " + "sourceCsvSeparate = " + local_sourceCsvSeparate + ", " + "sourceCsvQuote = " + local_sourceCsvQuote + ", " + "sourceCsvTerminate = " + local_sourceCsvTerminate + ", " + "sourceCsvEscape = " + local_sourceCsvEscape + ", " + "timeStarted = " + local_timeStarted + ", " + "timeStopped = " + local_timeStopped + ", " + "stateMessage = " + local_stateMessage + ", " + "monitorEventName = " + local_monitorEventName + ", " + "monitorSub = " + local_monitorSub + ", " + "monitorShotLimit = " + local_monitorShotLimit + ", " + "sourceDiffKeyName = " + local_sourceDiffKeyName + ", " + "destDiffKeyName = " + local_destDiffKeyName + ", " + "archived = " + local_archived + ", " + "encrypt = " + local_encrypt + ", " + "decrypt = " + local_decrypt + ", " + "failIfNoSourceFile = " + local_failIfNoSourceFile + ", " + "recordStructurePresent = " + local_recordStructurePresent + ", " + "quotedTerminator = " + local_quotedTerminator + ", " + "preserveCompression = " + local_preserveCompression + ", " + "expireDays = " + local_expireDays + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit();
		raw.setID( local_iD);
		raw.setDFUServerName( local_dFUServerName);
		raw.setClusterName( local_clusterName);
		raw.setJobName( local_jobName);
		raw.setQueue( local_queue);
		raw.setUser( local_user);
		raw.setIsProtected( local_isProtected);
		raw.setCommand( local_command);
		raw.setCommandMessage( local_commandMessage);
		raw.setPercentDone( local_percentDone);
		raw.setSecsLeft( local_secsLeft);
		raw.setProgressMessage( local_progressMessage);
		raw.setSummaryMessage( local_summaryMessage);
		raw.setState( local_state);
		raw.setSourceLogicalName( local_sourceLogicalName);
		raw.setSourceIP( local_sourceIP);
		raw.setSourceFilePath( local_sourceFilePath);
		raw.setSourceDali( local_sourceDali);
		raw.setSourceRecordSize( local_sourceRecordSize);
		raw.setSourceFormat( local_sourceFormat);
		raw.setRowTag( local_rowTag);
		raw.setSourceNumParts( local_sourceNumParts);
		raw.setSourceDirectory( local_sourceDirectory);
		raw.setDestLogicalName( local_destLogicalName);
		raw.setDestGroupName( local_destGroupName);
		raw.setDestDirectory( local_destDirectory);
		raw.setDestIP( local_destIP);
		raw.setDestFilePath( local_destFilePath);
		raw.setDestFormat( local_destFormat);
		raw.setDestNumParts( local_destNumParts);
		raw.setDestRecordSize( local_destRecordSize);
		raw.setReplicate( local_replicate);
		raw.setOverwrite( local_overwrite);
		raw.setCompress( local_compress);
		raw.setSourceCsvSeparate( local_sourceCsvSeparate);
		raw.setSourceCsvQuote( local_sourceCsvQuote);
		raw.setSourceCsvTerminate( local_sourceCsvTerminate);
		raw.setSourceCsvEscape( local_sourceCsvEscape);
		raw.setTimeStarted( local_timeStarted);
		raw.setTimeStopped( local_timeStopped);
		raw.setStateMessage( local_stateMessage);
		raw.setMonitorEventName( local_monitorEventName);
		raw.setMonitorSub( local_monitorSub);
		raw.setMonitorShotLimit( local_monitorShotLimit);
		raw.setSourceDiffKeyName( local_sourceDiffKeyName);
		raw.setDestDiffKeyName( local_destDiffKeyName);
		raw.setArchived( local_archived);
		raw.setEncrypt( local_encrypt);
		raw.setDecrypt( local_decrypt);
		raw.setFailIfNoSourceFile( local_failIfNoSourceFile);
		raw.setRecordStructurePresent( local_recordStructurePresent);
		raw.setQuotedTerminator( local_quotedTerminator);
		raw.setPreserveCompression( local_preserveCompression);
		raw.setExpireDays( local_expireDays);
		return raw;
	}


	public void setID( String _iD )
	{
		this.local_iD = _iD;
	}
	public String getID( )
	{
		return this.local_iD;
	}
	public void setDFUServerName( String _dFUServerName )
	{
		this.local_dFUServerName = _dFUServerName;
	}
	public String getDFUServerName( )
	{
		return this.local_dFUServerName;
	}
	public void setClusterName( String _clusterName )
	{
		this.local_clusterName = _clusterName;
	}
	public String getClusterName( )
	{
		return this.local_clusterName;
	}
	public void setJobName( String _jobName )
	{
		this.local_jobName = _jobName;
	}
	public String getJobName( )
	{
		return this.local_jobName;
	}
	public void setQueue( String _queue )
	{
		this.local_queue = _queue;
	}
	public String getQueue( )
	{
		return this.local_queue;
	}
	public void setUser( String _user )
	{
		this.local_user = _user;
	}
	public String getUser( )
	{
		return this.local_user;
	}
	public void setIsProtected( boolean _isProtected )
	{
		this.local_isProtected = _isProtected;
	}
	public boolean getIsProtected( )
	{
		return this.local_isProtected;
	}
	public void setCommand( int _command )
	{
		this.local_command = _command;
	}
	public int getCommand( )
	{
		return this.local_command;
	}
	public void setCommandMessage( String _commandMessage )
	{
		this.local_commandMessage = _commandMessage;
	}
	public String getCommandMessage( )
	{
		return this.local_commandMessage;
	}
	public void setPercentDone( int _percentDone )
	{
		this.local_percentDone = _percentDone;
	}
	public int getPercentDone( )
	{
		return this.local_percentDone;
	}
	public void setSecsLeft( int _secsLeft )
	{
		this.local_secsLeft = _secsLeft;
	}
	public int getSecsLeft( )
	{
		return this.local_secsLeft;
	}
	public void setProgressMessage( String _progressMessage )
	{
		this.local_progressMessage = _progressMessage;
	}
	public String getProgressMessage( )
	{
		return this.local_progressMessage;
	}
	public void setSummaryMessage( String _summaryMessage )
	{
		this.local_summaryMessage = _summaryMessage;
	}
	public String getSummaryMessage( )
	{
		return this.local_summaryMessage;
	}
	public void setState( int _state )
	{
		this.local_state = _state;
	}
	public int getState( )
	{
		return this.local_state;
	}
	public void setSourceLogicalName( String _sourceLogicalName )
	{
		this.local_sourceLogicalName = _sourceLogicalName;
	}
	public String getSourceLogicalName( )
	{
		return this.local_sourceLogicalName;
	}
	public void setSourceIP( String _sourceIP )
	{
		this.local_sourceIP = _sourceIP;
	}
	public String getSourceIP( )
	{
		return this.local_sourceIP;
	}
	public void setSourceFilePath( String _sourceFilePath )
	{
		this.local_sourceFilePath = _sourceFilePath;
	}
	public String getSourceFilePath( )
	{
		return this.local_sourceFilePath;
	}
	public void setSourceDali( String _sourceDali )
	{
		this.local_sourceDali = _sourceDali;
	}
	public String getSourceDali( )
	{
		return this.local_sourceDali;
	}
	public void setSourceRecordSize( int _sourceRecordSize )
	{
		this.local_sourceRecordSize = _sourceRecordSize;
	}
	public int getSourceRecordSize( )
	{
		return this.local_sourceRecordSize;
	}
	public void setSourceFormat( int _sourceFormat )
	{
		this.local_sourceFormat = _sourceFormat;
	}
	public int getSourceFormat( )
	{
		return this.local_sourceFormat;
	}
	public void setRowTag( String _rowTag )
	{
		this.local_rowTag = _rowTag;
	}
	public String getRowTag( )
	{
		return this.local_rowTag;
	}
	public void setSourceNumParts( int _sourceNumParts )
	{
		this.local_sourceNumParts = _sourceNumParts;
	}
	public int getSourceNumParts( )
	{
		return this.local_sourceNumParts;
	}
	public void setSourceDirectory( String _sourceDirectory )
	{
		this.local_sourceDirectory = _sourceDirectory;
	}
	public String getSourceDirectory( )
	{
		return this.local_sourceDirectory;
	}
	public void setDestLogicalName( String _destLogicalName )
	{
		this.local_destLogicalName = _destLogicalName;
	}
	public String getDestLogicalName( )
	{
		return this.local_destLogicalName;
	}
	public void setDestGroupName( String _destGroupName )
	{
		this.local_destGroupName = _destGroupName;
	}
	public String getDestGroupName( )
	{
		return this.local_destGroupName;
	}
	public void setDestDirectory( String _destDirectory )
	{
		this.local_destDirectory = _destDirectory;
	}
	public String getDestDirectory( )
	{
		return this.local_destDirectory;
	}
	public void setDestIP( String _destIP )
	{
		this.local_destIP = _destIP;
	}
	public String getDestIP( )
	{
		return this.local_destIP;
	}
	public void setDestFilePath( String _destFilePath )
	{
		this.local_destFilePath = _destFilePath;
	}
	public String getDestFilePath( )
	{
		return this.local_destFilePath;
	}
	public void setDestFormat( int _destFormat )
	{
		this.local_destFormat = _destFormat;
	}
	public int getDestFormat( )
	{
		return this.local_destFormat;
	}
	public void setDestNumParts( int _destNumParts )
	{
		this.local_destNumParts = _destNumParts;
	}
	public int getDestNumParts( )
	{
		return this.local_destNumParts;
	}
	public void setDestRecordSize( int _destRecordSize )
	{
		this.local_destRecordSize = _destRecordSize;
	}
	public int getDestRecordSize( )
	{
		return this.local_destRecordSize;
	}
	public void setReplicate( boolean _replicate )
	{
		this.local_replicate = _replicate;
	}
	public boolean getReplicate( )
	{
		return this.local_replicate;
	}
	public void setOverwrite( boolean _overwrite )
	{
		this.local_overwrite = _overwrite;
	}
	public boolean getOverwrite( )
	{
		return this.local_overwrite;
	}
	public void setCompress( boolean _compress )
	{
		this.local_compress = _compress;
	}
	public boolean getCompress( )
	{
		return this.local_compress;
	}
	public void setSourceCsvSeparate( String _sourceCsvSeparate )
	{
		this.local_sourceCsvSeparate = _sourceCsvSeparate;
	}
	public String getSourceCsvSeparate( )
	{
		return this.local_sourceCsvSeparate;
	}
	public void setSourceCsvQuote( String _sourceCsvQuote )
	{
		this.local_sourceCsvQuote = _sourceCsvQuote;
	}
	public String getSourceCsvQuote( )
	{
		return this.local_sourceCsvQuote;
	}
	public void setSourceCsvTerminate( String _sourceCsvTerminate )
	{
		this.local_sourceCsvTerminate = _sourceCsvTerminate;
	}
	public String getSourceCsvTerminate( )
	{
		return this.local_sourceCsvTerminate;
	}
	public void setSourceCsvEscape( String _sourceCsvEscape )
	{
		this.local_sourceCsvEscape = _sourceCsvEscape;
	}
	public String getSourceCsvEscape( )
	{
		return this.local_sourceCsvEscape;
	}
	public void setTimeStarted( String _timeStarted )
	{
		this.local_timeStarted = _timeStarted;
	}
	public String getTimeStarted( )
	{
		return this.local_timeStarted;
	}
	public void setTimeStopped( String _timeStopped )
	{
		this.local_timeStopped = _timeStopped;
	}
	public String getTimeStopped( )
	{
		return this.local_timeStopped;
	}
	public void setStateMessage( String _stateMessage )
	{
		this.local_stateMessage = _stateMessage;
	}
	public String getStateMessage( )
	{
		return this.local_stateMessage;
	}
	public void setMonitorEventName( String _monitorEventName )
	{
		this.local_monitorEventName = _monitorEventName;
	}
	public String getMonitorEventName( )
	{
		return this.local_monitorEventName;
	}
	public void setMonitorSub( boolean _monitorSub )
	{
		this.local_monitorSub = _monitorSub;
	}
	public boolean getMonitorSub( )
	{
		return this.local_monitorSub;
	}
	public void setMonitorShotLimit( int _monitorShotLimit )
	{
		this.local_monitorShotLimit = _monitorShotLimit;
	}
	public int getMonitorShotLimit( )
	{
		return this.local_monitorShotLimit;
	}
	public void setSourceDiffKeyName( String _sourceDiffKeyName )
	{
		this.local_sourceDiffKeyName = _sourceDiffKeyName;
	}
	public String getSourceDiffKeyName( )
	{
		return this.local_sourceDiffKeyName;
	}
	public void setDestDiffKeyName( String _destDiffKeyName )
	{
		this.local_destDiffKeyName = _destDiffKeyName;
	}
	public String getDestDiffKeyName( )
	{
		return this.local_destDiffKeyName;
	}
	public void setArchived( boolean _archived )
	{
		this.local_archived = _archived;
	}
	public boolean getArchived( )
	{
		return this.local_archived;
	}
	public void setEncrypt( String _encrypt )
	{
		this.local_encrypt = _encrypt;
	}
	public String getEncrypt( )
	{
		return this.local_encrypt;
	}
	public void setDecrypt( String _decrypt )
	{
		this.local_decrypt = _decrypt;
	}
	public String getDecrypt( )
	{
		return this.local_decrypt;
	}
	public void setFailIfNoSourceFile( boolean _failIfNoSourceFile )
	{
		this.local_failIfNoSourceFile = _failIfNoSourceFile;
	}
	public boolean getFailIfNoSourceFile( )
	{
		return this.local_failIfNoSourceFile;
	}
	public void setRecordStructurePresent( boolean _recordStructurePresent )
	{
		this.local_recordStructurePresent = _recordStructurePresent;
	}
	public boolean getRecordStructurePresent( )
	{
		return this.local_recordStructurePresent;
	}
	public void setQuotedTerminator( boolean _quotedTerminator )
	{
		this.local_quotedTerminator = _quotedTerminator;
	}
	public boolean getQuotedTerminator( )
	{
		return this.local_quotedTerminator;
	}
	public void setPreserveCompression( boolean _preserveCompression )
	{
		this.local_preserveCompression = _preserveCompression;
	}
	public boolean getPreserveCompression( )
	{
		return this.local_preserveCompression;
	}
	public void setExpireDays( int _expireDays )
	{
		this.local_expireDays = _expireDays;
	}
	public int getExpireDays( )
	{
		return this.local_expireDays;
	}
}