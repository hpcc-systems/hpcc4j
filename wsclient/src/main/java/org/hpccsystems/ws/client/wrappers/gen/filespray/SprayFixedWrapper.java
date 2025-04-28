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
 * Class name: SprayFixedWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class SprayFixedWrapper
{
    protected String local_sourceIP;
    protected String local_sourcePlane;
    protected String local_sourcePath;
    protected DataHandler local_srcxml;
    protected String local_sourceFormat;
    protected int local_sourceRecordSize;
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
    protected boolean local_wrap;
    protected boolean local_failIfNoSourceFile;
    protected boolean local_recordStructurePresent;
    protected boolean local_quotedTerminator;
    protected int local_expireDays;
    protected String local_dFUServerQueue;

    public SprayFixedWrapper() {}

    public SprayFixedWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed sprayfixed)
    {
        copy( sprayfixed );
    }
    public SprayFixedWrapper( String _sourceIP, String _sourcePlane, String _sourcePath, DataHandler _srcxml, String _sourceFormat, int _sourceRecordSize, String _destGroup, String _destLogicalName, int _destNumParts, boolean _overwrite, boolean _replicate, int _replicateOffset, int _maxConnections, int _throttle, int _transferBufferSize, String _prefix, boolean _nosplit, boolean _norecover, boolean _compress, boolean _push, boolean _pull, boolean _noCommon, String _encrypt, String _decrypt, boolean _wrap, boolean _failIfNoSourceFile, boolean _recordStructurePresent, boolean _quotedTerminator, int _expireDays, String _dFUServerQueue )
    {
        this.local_sourceIP = _sourceIP;
        this.local_sourcePlane = _sourcePlane;
        this.local_sourcePath = _sourcePath;
        this.local_srcxml = _srcxml;
        this.local_sourceFormat = _sourceFormat;
        this.local_sourceRecordSize = _sourceRecordSize;
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
        this.local_wrap = _wrap;
        this.local_failIfNoSourceFile = _failIfNoSourceFile;
        this.local_recordStructurePresent = _recordStructurePresent;
        this.local_quotedTerminator = _quotedTerminator;
        this.local_expireDays = _expireDays;
        this.local_dFUServerQueue = _dFUServerQueue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed raw )
    {
        if (raw == null)
            return;

        this.local_sourceIP = raw.getSourceIP();
        this.local_sourcePlane = raw.getSourcePlane();
        this.local_sourcePath = raw.getSourcePath();
        this.local_srcxml = raw.getSrcxml();
        this.local_sourceFormat = raw.getSourceFormat();
        this.local_sourceRecordSize = raw.getSourceRecordSize();
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
        this.local_wrap = raw.getWrap();
        this.local_failIfNoSourceFile = raw.getFailIfNoSourceFile();
        this.local_recordStructurePresent = raw.getRecordStructurePresent();
        this.local_quotedTerminator = raw.getQuotedTerminator();
        this.local_expireDays = raw.getExpireDays();
        this.local_dFUServerQueue = raw.getDFUServerQueue();

    }

    @Override
    public String toString()
    {
        return "SprayFixedWrapper [" + "sourceIP = " + local_sourceIP + ", " + "sourcePlane = " + local_sourcePlane + ", " + "sourcePath = " + local_sourcePath + ", " + "srcxml = " + local_srcxml + ", " + "sourceFormat = " + local_sourceFormat + ", " + "sourceRecordSize = " + local_sourceRecordSize + ", " + "destGroup = " + local_destGroup + ", " + "destLogicalName = " + local_destLogicalName + ", " + "destNumParts = " + local_destNumParts + ", " + "overwrite = " + local_overwrite + ", " + "replicate = " + local_replicate + ", " + "replicateOffset = " + local_replicateOffset + ", " + "maxConnections = " + local_maxConnections + ", " + "throttle = " + local_throttle + ", " + "transferBufferSize = " + local_transferBufferSize + ", " + "prefix = " + local_prefix + ", " + "nosplit = " + local_nosplit + ", " + "norecover = " + local_norecover + ", " + "compress = " + local_compress + ", " + "push = " + local_push + ", " + "pull = " + local_pull + ", " + "noCommon = " + local_noCommon + ", " + "encrypt = " + local_encrypt + ", " + "decrypt = " + local_decrypt + ", " + "wrap = " + local_wrap + ", " + "failIfNoSourceFile = " + local_failIfNoSourceFile + ", " + "recordStructurePresent = " + local_recordStructurePresent + ", " + "quotedTerminator = " + local_quotedTerminator + ", " + "expireDays = " + local_expireDays + ", " + "dFUServerQueue = " + local_dFUServerQueue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed();
        raw.setSourceIP( local_sourceIP);
        raw.setSourcePlane( local_sourcePlane);
        raw.setSourcePath( local_sourcePath);
        raw.setSrcxml( local_srcxml);
        raw.setSourceFormat( local_sourceFormat);
        raw.setSourceRecordSize( local_sourceRecordSize);
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
        raw.setWrap( local_wrap);
        raw.setFailIfNoSourceFile( local_failIfNoSourceFile);
        raw.setRecordStructurePresent( local_recordStructurePresent);
        raw.setQuotedTerminator( local_quotedTerminator);
        raw.setExpireDays( local_expireDays);
        raw.setDFUServerQueue( local_dFUServerQueue);
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
    public void setSourceFormat( String _sourceFormat )
    {
        this.local_sourceFormat = _sourceFormat;
    }
    public String getSourceFormat( )
    {
        return this.local_sourceFormat;
    }
    public void setSourceRecordSize( int _sourceRecordSize )
    {
        this.local_sourceRecordSize = _sourceRecordSize;
    }
    public int getSourceRecordSize( )
    {
        return this.local_sourceRecordSize;
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
    public void setWrap( boolean _wrap )
    {
        this.local_wrap = _wrap;
    }
    public boolean getWrap( )
    {
        return this.local_wrap;
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
}