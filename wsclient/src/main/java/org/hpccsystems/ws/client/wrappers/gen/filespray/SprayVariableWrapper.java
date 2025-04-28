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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: SprayVariableWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class SprayVariableWrapper
{
    protected String local_sourceIP;
    protected String local_sourcePlane;
    protected String local_sourcePath;
    protected DataHandler local_srcxml;
    protected int local_sourceMaxRecordSize;
    protected int local_sourceFormat;
    protected boolean local_noSourceCsvSeparator;
    protected String local_sourceCsvSeparate;
    protected String local_sourceCsvTerminate;
    protected String local_sourceCsvQuote;
    protected String local_sourceCsvEscape;
    protected String local_sourceRowTag;
    protected String local_destGroup;
    protected String local_destLogicalName;
    protected int local_destNumParts;
    protected boolean local_overwrite;
    protected boolean local_replicate;
    protected int local_replicateOffset;
    protected int local_maxConnections;
    protected int local_throttle;
    protected int local_transferBufferSize;
    protected String local_prefix;
    protected boolean local_nosplit;
    protected boolean local_norecover;
    protected boolean local_compress;
    protected boolean local_push;
    protected boolean local_pull;
    protected boolean local_noCommon;
    protected String local_encrypt;
    protected String local_decrypt;
    protected boolean local_failIfNoSourceFile;
    protected boolean local_recordStructurePresent;
    protected boolean local_quotedTerminator;
    protected String local_sourceRowPath;
    protected boolean local_isJSON;
    protected int local_expireDays;
    protected String local_dFUServerQueue;
    protected String local_srcUsername;
    protected String local_srcPassword;

    public SprayVariableWrapper() {}

    public SprayVariableWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable sprayvariable)
    {
        copy( sprayvariable );
    }
    public SprayVariableWrapper( String _sourceIP, String _sourcePlane, String _sourcePath, DataHandler _srcxml, int _sourceMaxRecordSize, int _sourceFormat, boolean _noSourceCsvSeparator, String _sourceCsvSeparate, String _sourceCsvTerminate, String _sourceCsvQuote, String _sourceCsvEscape, String _sourceRowTag, String _destGroup, String _destLogicalName, int _destNumParts, boolean _overwrite, boolean _replicate, int _replicateOffset, int _maxConnections, int _throttle, int _transferBufferSize, String _prefix, boolean _nosplit, boolean _norecover, boolean _compress, boolean _push, boolean _pull, boolean _noCommon, String _encrypt, String _decrypt, boolean _failIfNoSourceFile, boolean _recordStructurePresent, boolean _quotedTerminator, String _sourceRowPath, boolean _isJSON, int _expireDays, String _dFUServerQueue, String _srcUsername, String _srcPassword )
    {
        this.local_sourceIP = _sourceIP;
        this.local_sourcePlane = _sourcePlane;
        this.local_sourcePath = _sourcePath;
        this.local_srcxml = _srcxml;
        this.local_sourceMaxRecordSize = _sourceMaxRecordSize;
        this.local_sourceFormat = _sourceFormat;
        this.local_noSourceCsvSeparator = _noSourceCsvSeparator;
        this.local_sourceCsvSeparate = _sourceCsvSeparate;
        this.local_sourceCsvTerminate = _sourceCsvTerminate;
        this.local_sourceCsvQuote = _sourceCsvQuote;
        this.local_sourceCsvEscape = _sourceCsvEscape;
        this.local_sourceRowTag = _sourceRowTag;
        this.local_destGroup = _destGroup;
        this.local_destLogicalName = _destLogicalName;
        this.local_destNumParts = _destNumParts;
        this.local_overwrite = _overwrite;
        this.local_replicate = _replicate;
        this.local_replicateOffset = _replicateOffset;
        this.local_maxConnections = _maxConnections;
        this.local_throttle = _throttle;
        this.local_transferBufferSize = _transferBufferSize;
        this.local_prefix = _prefix;
        this.local_nosplit = _nosplit;
        this.local_norecover = _norecover;
        this.local_compress = _compress;
        this.local_push = _push;
        this.local_pull = _pull;
        this.local_noCommon = _noCommon;
        this.local_encrypt = _encrypt;
        this.local_decrypt = _decrypt;
        this.local_failIfNoSourceFile = _failIfNoSourceFile;
        this.local_recordStructurePresent = _recordStructurePresent;
        this.local_quotedTerminator = _quotedTerminator;
        this.local_sourceRowPath = _sourceRowPath;
        this.local_isJSON = _isJSON;
        this.local_expireDays = _expireDays;
        this.local_dFUServerQueue = _dFUServerQueue;
        this.local_srcUsername = _srcUsername;
        this.local_srcPassword = _srcPassword;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable raw )
    {
        if (raw == null)
            return;

        this.local_sourceIP = raw.getSourceIP();
        this.local_sourcePlane = raw.getSourcePlane();
        this.local_sourcePath = raw.getSourcePath();
        this.local_srcxml = raw.getSrcxml();
        this.local_sourceMaxRecordSize = raw.getSourceMaxRecordSize();
        this.local_sourceFormat = raw.getSourceFormat();
        this.local_noSourceCsvSeparator = raw.getNoSourceCsvSeparator();
        this.local_sourceCsvSeparate = raw.getSourceCsvSeparate();
        this.local_sourceCsvTerminate = raw.getSourceCsvTerminate();
        this.local_sourceCsvQuote = raw.getSourceCsvQuote();
        this.local_sourceCsvEscape = raw.getSourceCsvEscape();
        this.local_sourceRowTag = raw.getSourceRowTag();
        this.local_destGroup = raw.getDestGroup();
        this.local_destLogicalName = raw.getDestLogicalName();
        this.local_destNumParts = raw.getDestNumParts();
        this.local_overwrite = raw.getOverwrite();
        this.local_replicate = raw.getReplicate();
        this.local_replicateOffset = raw.getReplicateOffset();
        this.local_maxConnections = raw.getMaxConnections();
        this.local_throttle = raw.getThrottle();
        this.local_transferBufferSize = raw.getTransferBufferSize();
        this.local_prefix = raw.getPrefix();
        this.local_nosplit = raw.getNosplit();
        this.local_norecover = raw.getNorecover();
        this.local_compress = raw.getCompress();
        this.local_push = raw.getPush();
        this.local_pull = raw.getPull();
        this.local_noCommon = raw.getNoCommon();
        this.local_encrypt = raw.getEncrypt();
        this.local_decrypt = raw.getDecrypt();
        this.local_failIfNoSourceFile = raw.getFailIfNoSourceFile();
        this.local_recordStructurePresent = raw.getRecordStructurePresent();
        this.local_quotedTerminator = raw.getQuotedTerminator();
        this.local_sourceRowPath = raw.getSourceRowPath();
        this.local_isJSON = raw.getIsJSON();
        this.local_expireDays = raw.getExpireDays();
        this.local_dFUServerQueue = raw.getDFUServerQueue();
        this.local_srcUsername = raw.getSrcUsername();
        this.local_srcPassword = raw.getSrcPassword();

    }

    @Override
    public String toString()
    {
        return "SprayVariableWrapper [" + "sourceIP = " + local_sourceIP + ", " + "sourcePlane = " + local_sourcePlane + ", " + "sourcePath = " + local_sourcePath + ", " + "srcxml = " + local_srcxml + ", " + "sourceMaxRecordSize = " + local_sourceMaxRecordSize + ", " + "sourceFormat = " + local_sourceFormat + ", " + "noSourceCsvSeparator = " + local_noSourceCsvSeparator + ", " + "sourceCsvSeparate = " + local_sourceCsvSeparate + ", " + "sourceCsvTerminate = " + local_sourceCsvTerminate + ", " + "sourceCsvQuote = " + local_sourceCsvQuote + ", " + "sourceCsvEscape = " + local_sourceCsvEscape + ", " + "sourceRowTag = " + local_sourceRowTag + ", " + "destGroup = " + local_destGroup + ", " + "destLogicalName = " + local_destLogicalName + ", " + "destNumParts = " + local_destNumParts + ", " + "overwrite = " + local_overwrite + ", " + "replicate = " + local_replicate + ", " + "replicateOffset = " + local_replicateOffset + ", " + "maxConnections = " + local_maxConnections + ", " + "throttle = " + local_throttle + ", " + "transferBufferSize = " + local_transferBufferSize + ", " + "prefix = " + local_prefix + ", " + "nosplit = " + local_nosplit + ", " + "norecover = " + local_norecover + ", " + "compress = " + local_compress + ", " + "push = " + local_push + ", " + "pull = " + local_pull + ", " + "noCommon = " + local_noCommon + ", " + "encrypt = " + local_encrypt + ", " + "decrypt = " + local_decrypt + ", " + "failIfNoSourceFile = " + local_failIfNoSourceFile + ", " + "recordStructurePresent = " + local_recordStructurePresent + ", " + "quotedTerminator = " + local_quotedTerminator + ", " + "sourceRowPath = " + local_sourceRowPath + ", " + "isJSON = " + local_isJSON + ", " + "expireDays = " + local_expireDays + ", " + "dFUServerQueue = " + local_dFUServerQueue + ", " + "srcUsername = " + local_srcUsername + ", " + "srcPassword = " + local_srcPassword + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable();
        raw.setSourceIP( local_sourceIP);
        raw.setSourcePlane( local_sourcePlane);
        raw.setSourcePath( local_sourcePath);
        raw.setSrcxml( local_srcxml);
        raw.setSourceMaxRecordSize( local_sourceMaxRecordSize);
        raw.setSourceFormat( local_sourceFormat);
        raw.setNoSourceCsvSeparator( local_noSourceCsvSeparator);
        raw.setSourceCsvSeparate( local_sourceCsvSeparate);
        raw.setSourceCsvTerminate( local_sourceCsvTerminate);
        raw.setSourceCsvQuote( local_sourceCsvQuote);
        raw.setSourceCsvEscape( local_sourceCsvEscape);
        raw.setSourceRowTag( local_sourceRowTag);
        raw.setDestGroup( local_destGroup);
        raw.setDestLogicalName( local_destLogicalName);
        raw.setDestNumParts( local_destNumParts);
        raw.setOverwrite( local_overwrite);
        raw.setReplicate( local_replicate);
        raw.setReplicateOffset( local_replicateOffset);
        raw.setMaxConnections( local_maxConnections);
        raw.setThrottle( local_throttle);
        raw.setTransferBufferSize( local_transferBufferSize);
        raw.setPrefix( local_prefix);
        raw.setNosplit( local_nosplit);
        raw.setNorecover( local_norecover);
        raw.setCompress( local_compress);
        raw.setPush( local_push);
        raw.setPull( local_pull);
        raw.setNoCommon( local_noCommon);
        raw.setEncrypt( local_encrypt);
        raw.setDecrypt( local_decrypt);
        raw.setFailIfNoSourceFile( local_failIfNoSourceFile);
        raw.setRecordStructurePresent( local_recordStructurePresent);
        raw.setQuotedTerminator( local_quotedTerminator);
        raw.setSourceRowPath( local_sourceRowPath);
        raw.setIsJSON( local_isJSON);
        raw.setExpireDays( local_expireDays);
        raw.setDFUServerQueue( local_dFUServerQueue);
        raw.setSrcUsername( local_srcUsername);
        raw.setSrcPassword( local_srcPassword);
        return raw;
    }


    public void setSourceIP( String _sourceIP )
    {
        this.local_sourceIP = _sourceIP;
    }
    public String getSourceIP( )
    {
        return this.local_sourceIP;
    }
    public void setSourcePlane( String _sourcePlane )
    {
        this.local_sourcePlane = _sourcePlane;
    }
    public String getSourcePlane( )
    {
        return this.local_sourcePlane;
    }
    public void setSourcePath( String _sourcePath )
    {
        this.local_sourcePath = _sourcePath;
    }
    public String getSourcePath( )
    {
        return this.local_sourcePath;
    }
    public void setSrcxml( DataHandler _srcxml )
    {
        this.local_srcxml = _srcxml;
    }
    public DataHandler getSrcxml( )
    {
        return this.local_srcxml;
    }
    public void setSourceMaxRecordSize( int _sourceMaxRecordSize )
    {
        this.local_sourceMaxRecordSize = _sourceMaxRecordSize;
    }
    public int getSourceMaxRecordSize( )
    {
        return this.local_sourceMaxRecordSize;
    }
    public void setSourceFormat( int _sourceFormat )
    {
        this.local_sourceFormat = _sourceFormat;
    }
    public int getSourceFormat( )
    {
        return this.local_sourceFormat;
    }
    public void setNoSourceCsvSeparator( boolean _noSourceCsvSeparator )
    {
        this.local_noSourceCsvSeparator = _noSourceCsvSeparator;
    }
    public boolean getNoSourceCsvSeparator( )
    {
        return this.local_noSourceCsvSeparator;
    }
    public void setSourceCsvSeparate( String _sourceCsvSeparate )
    {
        this.local_sourceCsvSeparate = _sourceCsvSeparate;
    }
    public String getSourceCsvSeparate( )
    {
        return this.local_sourceCsvSeparate;
    }
    public void setSourceCsvTerminate( String _sourceCsvTerminate )
    {
        this.local_sourceCsvTerminate = _sourceCsvTerminate;
    }
    public String getSourceCsvTerminate( )
    {
        return this.local_sourceCsvTerminate;
    }
    public void setSourceCsvQuote( String _sourceCsvQuote )
    {
        this.local_sourceCsvQuote = _sourceCsvQuote;
    }
    public String getSourceCsvQuote( )
    {
        return this.local_sourceCsvQuote;
    }
    public void setSourceCsvEscape( String _sourceCsvEscape )
    {
        this.local_sourceCsvEscape = _sourceCsvEscape;
    }
    public String getSourceCsvEscape( )
    {
        return this.local_sourceCsvEscape;
    }
    public void setSourceRowTag( String _sourceRowTag )
    {
        this.local_sourceRowTag = _sourceRowTag;
    }
    public String getSourceRowTag( )
    {
        return this.local_sourceRowTag;
    }
    public void setDestGroup( String _destGroup )
    {
        this.local_destGroup = _destGroup;
    }
    public String getDestGroup( )
    {
        return this.local_destGroup;
    }
    public void setDestLogicalName( String _destLogicalName )
    {
        this.local_destLogicalName = _destLogicalName;
    }
    public String getDestLogicalName( )
    {
        return this.local_destLogicalName;
    }
    public void setDestNumParts( int _destNumParts )
    {
        this.local_destNumParts = _destNumParts;
    }
    public int getDestNumParts( )
    {
        return this.local_destNumParts;
    }
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
    }
    public void setReplicate( boolean _replicate )
    {
        this.local_replicate = _replicate;
    }
    public boolean getReplicate( )
    {
        return this.local_replicate;
    }
    public void setReplicateOffset( int _replicateOffset )
    {
        this.local_replicateOffset = _replicateOffset;
    }
    public int getReplicateOffset( )
    {
        return this.local_replicateOffset;
    }
    public void setMaxConnections( int _maxConnections )
    {
        this.local_maxConnections = _maxConnections;
    }
    public int getMaxConnections( )
    {
        return this.local_maxConnections;
    }
    public void setThrottle( int _throttle )
    {
        this.local_throttle = _throttle;
    }
    public int getThrottle( )
    {
        return this.local_throttle;
    }
    public void setTransferBufferSize( int _transferBufferSize )
    {
        this.local_transferBufferSize = _transferBufferSize;
    }
    public int getTransferBufferSize( )
    {
        return this.local_transferBufferSize;
    }
    public void setPrefix( String _prefix )
    {
        this.local_prefix = _prefix;
    }
    public String getPrefix( )
    {
        return this.local_prefix;
    }
    public void setNosplit( boolean _nosplit )
    {
        this.local_nosplit = _nosplit;
    }
    public boolean getNosplit( )
    {
        return this.local_nosplit;
    }
    public void setNorecover( boolean _norecover )
    {
        this.local_norecover = _norecover;
    }
    public boolean getNorecover( )
    {
        return this.local_norecover;
    }
    public void setCompress( boolean _compress )
    {
        this.local_compress = _compress;
    }
    public boolean getCompress( )
    {
        return this.local_compress;
    }
    public void setPush( boolean _push )
    {
        this.local_push = _push;
    }
    public boolean getPush( )
    {
        return this.local_push;
    }
    public void setPull( boolean _pull )
    {
        this.local_pull = _pull;
    }
    public boolean getPull( )
    {
        return this.local_pull;
    }
    public void setNoCommon( boolean _noCommon )
    {
        this.local_noCommon = _noCommon;
    }
    public boolean getNoCommon( )
    {
        return this.local_noCommon;
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
    public void setSourceRowPath( String _sourceRowPath )
    {
        this.local_sourceRowPath = _sourceRowPath;
    }
    public String getSourceRowPath( )
    {
        return this.local_sourceRowPath;
    }
    public void setIsJSON( boolean _isJSON )
    {
        this.local_isJSON = _isJSON;
    }
    public boolean getIsJSON( )
    {
        return this.local_isJSON;
    }
    public void setExpireDays( int _expireDays )
    {
        this.local_expireDays = _expireDays;
    }
    public int getExpireDays( )
    {
        return this.local_expireDays;
    }
    public void setDFUServerQueue( String _dFUServerQueue )
    {
        this.local_dFUServerQueue = _dFUServerQueue;
    }
    public String getDFUServerQueue( )
    {
        return this.local_dFUServerQueue;
    }
    public void setSrcUsername( String _srcUsername )
    {
        this.local_srcUsername = _srcUsername;
    }
    public String getSrcUsername( )
    {
        return this.local_srcUsername;
    }
    public void setSrcPassword( String _srcPassword )
    {
        this.local_srcPassword = _srcPassword;
    }
    public String getSrcPassword( )
    {
        return this.local_srcPassword;
    }
}