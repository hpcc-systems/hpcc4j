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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: CopyWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class CopyWrapper
{
    protected String local_sourceLogicalName;
    protected String local_destGroup;
    protected String local_destGroupRoxie;
    protected String local_destLogicalName;
    protected String local_sourceDali;
    protected String local_srcusername;
    protected String local_srcpassword;
    protected boolean local_overwrite;
    protected boolean local_ensure;
    protected boolean local_replicate;
    protected int local_replicateOffset;
    protected int local_maxConnections;
    protected int local_throttle;
    protected int local_transferBufferSize;
    protected boolean local_nosplit;
    protected boolean local_norecover;
    protected boolean local_compress;
    protected boolean local_wrap;
    protected boolean local_multicopy;
    protected String local_sourceDiffKeyName;
    protected String local_destDiffKeyName;
    protected boolean local_superCopy;
    protected boolean local_push;
    protected boolean local_pull;
    protected boolean local_ifnewer;
    protected boolean local_noCommon;
    protected String local_encrypt;
    protected String local_decrypt;
    protected boolean local_preserveCompression;
    protected String local_dFUServerQueue;
    protected int local_expireDays;
    protected String local_keyCompression;

    public CopyWrapper() {}

    public CopyWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy copy)
    {
        copy( copy );
    }
    public CopyWrapper( String _sourceLogicalName, String _destGroup, String _destGroupRoxie, String _destLogicalName, String _sourceDali, String _srcusername, String _srcpassword, boolean _overwrite, boolean _ensure, boolean _replicate, int _replicateOffset, int _maxConnections, int _throttle, int _transferBufferSize, boolean _nosplit, boolean _norecover, boolean _compress, boolean _wrap, boolean _multicopy, String _sourceDiffKeyName, String _destDiffKeyName, boolean _superCopy, boolean _push, boolean _pull, boolean _ifnewer, boolean _noCommon, String _encrypt, String _decrypt, boolean _preserveCompression, String _dFUServerQueue, int _expireDays, String _keyCompression )
    {
        this.local_sourceLogicalName = _sourceLogicalName;
        this.local_destGroup = _destGroup;
        this.local_destGroupRoxie = _destGroupRoxie;
        this.local_destLogicalName = _destLogicalName;
        this.local_sourceDali = _sourceDali;
        this.local_srcusername = _srcusername;
        this.local_srcpassword = _srcpassword;
        this.local_overwrite = _overwrite;
        this.local_ensure = _ensure;
        this.local_replicate = _replicate;
        this.local_replicateOffset = _replicateOffset;
        this.local_maxConnections = _maxConnections;
        this.local_throttle = _throttle;
        this.local_transferBufferSize = _transferBufferSize;
        this.local_nosplit = _nosplit;
        this.local_norecover = _norecover;
        this.local_compress = _compress;
        this.local_wrap = _wrap;
        this.local_multicopy = _multicopy;
        this.local_sourceDiffKeyName = _sourceDiffKeyName;
        this.local_destDiffKeyName = _destDiffKeyName;
        this.local_superCopy = _superCopy;
        this.local_push = _push;
        this.local_pull = _pull;
        this.local_ifnewer = _ifnewer;
        this.local_noCommon = _noCommon;
        this.local_encrypt = _encrypt;
        this.local_decrypt = _decrypt;
        this.local_preserveCompression = _preserveCompression;
        this.local_dFUServerQueue = _dFUServerQueue;
        this.local_expireDays = _expireDays;
        this.local_keyCompression = _keyCompression;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy raw )
    {
        if (raw == null)
            return;

        this.local_sourceLogicalName = raw.getSourceLogicalName();
        this.local_destGroup = raw.getDestGroup();
        this.local_destGroupRoxie = raw.getDestGroupRoxie();
        this.local_destLogicalName = raw.getDestLogicalName();
        this.local_sourceDali = raw.getSourceDali();
        this.local_srcusername = raw.getSrcusername();
        this.local_srcpassword = raw.getSrcpassword();
        this.local_overwrite = raw.getOverwrite();
        this.local_ensure = raw.getEnsure();
        this.local_replicate = raw.getReplicate();
        this.local_replicateOffset = raw.getReplicateOffset();
        this.local_maxConnections = raw.getMaxConnections();
        this.local_throttle = raw.getThrottle();
        this.local_transferBufferSize = raw.getTransferBufferSize();
        this.local_nosplit = raw.getNosplit();
        this.local_norecover = raw.getNorecover();
        this.local_compress = raw.getCompress();
        this.local_wrap = raw.getWrap();
        this.local_multicopy = raw.getMulticopy();
        this.local_sourceDiffKeyName = raw.getSourceDiffKeyName();
        this.local_destDiffKeyName = raw.getDestDiffKeyName();
        this.local_superCopy = raw.getSuperCopy();
        this.local_push = raw.getPush();
        this.local_pull = raw.getPull();
        this.local_ifnewer = raw.getIfnewer();
        this.local_noCommon = raw.getNoCommon();
        this.local_encrypt = raw.getEncrypt();
        this.local_decrypt = raw.getDecrypt();
        this.local_preserveCompression = raw.getPreserveCompression();
        this.local_dFUServerQueue = raw.getDFUServerQueue();
        this.local_expireDays = raw.getExpireDays();
        this.local_keyCompression = raw.getKeyCompression();

    }

    @Override
    public String toString()
    {
        return "CopyWrapper [" + "sourceLogicalName = " + local_sourceLogicalName + ", " + "destGroup = " + local_destGroup + ", " + "destGroupRoxie = " + local_destGroupRoxie + ", " + "destLogicalName = " + local_destLogicalName + ", " + "sourceDali = " + local_sourceDali + ", " + "srcusername = " + local_srcusername + ", " + "srcpassword = " + local_srcpassword + ", " + "overwrite = " + local_overwrite + ", " + "ensure = " + local_ensure + ", " + "replicate = " + local_replicate + ", " + "replicateOffset = " + local_replicateOffset + ", " + "maxConnections = " + local_maxConnections + ", " + "throttle = " + local_throttle + ", " + "transferBufferSize = " + local_transferBufferSize + ", " + "nosplit = " + local_nosplit + ", " + "norecover = " + local_norecover + ", " + "compress = " + local_compress + ", " + "wrap = " + local_wrap + ", " + "multicopy = " + local_multicopy + ", " + "sourceDiffKeyName = " + local_sourceDiffKeyName + ", " + "destDiffKeyName = " + local_destDiffKeyName + ", " + "superCopy = " + local_superCopy + ", " + "push = " + local_push + ", " + "pull = " + local_pull + ", " + "ifnewer = " + local_ifnewer + ", " + "noCommon = " + local_noCommon + ", " + "encrypt = " + local_encrypt + ", " + "decrypt = " + local_decrypt + ", " + "preserveCompression = " + local_preserveCompression + ", " + "dFUServerQueue = " + local_dFUServerQueue + ", " + "expireDays = " + local_expireDays + ", " + "keyCompression = " + local_keyCompression + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy();
        raw.setSourceLogicalName( local_sourceLogicalName);
        raw.setDestGroup( local_destGroup);
        raw.setDestGroupRoxie( local_destGroupRoxie);
        raw.setDestLogicalName( local_destLogicalName);
        raw.setSourceDali( local_sourceDali);
        raw.setSrcusername( local_srcusername);
        raw.setSrcpassword( local_srcpassword);
        raw.setOverwrite( local_overwrite);
        raw.setEnsure( local_ensure);
        raw.setReplicate( local_replicate);
        raw.setReplicateOffset( local_replicateOffset);
        raw.setMaxConnections( local_maxConnections);
        raw.setThrottle( local_throttle);
        raw.setTransferBufferSize( local_transferBufferSize);
        raw.setNosplit( local_nosplit);
        raw.setNorecover( local_norecover);
        raw.setCompress( local_compress);
        raw.setWrap( local_wrap);
        raw.setMulticopy( local_multicopy);
        raw.setSourceDiffKeyName( local_sourceDiffKeyName);
        raw.setDestDiffKeyName( local_destDiffKeyName);
        raw.setSuperCopy( local_superCopy);
        raw.setPush( local_push);
        raw.setPull( local_pull);
        raw.setIfnewer( local_ifnewer);
        raw.setNoCommon( local_noCommon);
        raw.setEncrypt( local_encrypt);
        raw.setDecrypt( local_decrypt);
        raw.setPreserveCompression( local_preserveCompression);
        raw.setDFUServerQueue( local_dFUServerQueue);
        raw.setExpireDays( local_expireDays);
        raw.setKeyCompression( local_keyCompression);
        return raw;
    }


    public void setSourceLogicalName( String _sourceLogicalName )
    {
        this.local_sourceLogicalName = _sourceLogicalName;
    }
    public String getSourceLogicalName( )
    {
        return this.local_sourceLogicalName;
    }
    public void setDestGroup( String _destGroup )
    {
        this.local_destGroup = _destGroup;
    }
    public String getDestGroup( )
    {
        return this.local_destGroup;
    }
    public void setDestGroupRoxie( String _destGroupRoxie )
    {
        this.local_destGroupRoxie = _destGroupRoxie;
    }
    public String getDestGroupRoxie( )
    {
        return this.local_destGroupRoxie;
    }
    public void setDestLogicalName( String _destLogicalName )
    {
        this.local_destLogicalName = _destLogicalName;
    }
    public String getDestLogicalName( )
    {
        return this.local_destLogicalName;
    }
    public void setSourceDali( String _sourceDali )
    {
        this.local_sourceDali = _sourceDali;
    }
    public String getSourceDali( )
    {
        return this.local_sourceDali;
    }
    public void setSrcusername( String _srcusername )
    {
        this.local_srcusername = _srcusername;
    }
    public String getSrcusername( )
    {
        return this.local_srcusername;
    }
    public void setSrcpassword( String _srcpassword )
    {
        this.local_srcpassword = _srcpassword;
    }
    public String getSrcpassword( )
    {
        return this.local_srcpassword;
    }
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
    }
    public void setEnsure( boolean _ensure )
    {
        this.local_ensure = _ensure;
    }
    public boolean getEnsure( )
    {
        return this.local_ensure;
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
    public void setWrap( boolean _wrap )
    {
        this.local_wrap = _wrap;
    }
    public boolean getWrap( )
    {
        return this.local_wrap;
    }
    public void setMulticopy( boolean _multicopy )
    {
        this.local_multicopy = _multicopy;
    }
    public boolean getMulticopy( )
    {
        return this.local_multicopy;
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
    public void setSuperCopy( boolean _superCopy )
    {
        this.local_superCopy = _superCopy;
    }
    public boolean getSuperCopy( )
    {
        return this.local_superCopy;
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
    public void setIfnewer( boolean _ifnewer )
    {
        this.local_ifnewer = _ifnewer;
    }
    public boolean getIfnewer( )
    {
        return this.local_ifnewer;
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
    public void setPreserveCompression( boolean _preserveCompression )
    {
        this.local_preserveCompression = _preserveCompression;
    }
    public boolean getPreserveCompression( )
    {
        return this.local_preserveCompression;
    }
    public void setDFUServerQueue( String _dFUServerQueue )
    {
        this.local_dFUServerQueue = _dFUServerQueue;
    }
    public String getDFUServerQueue( )
    {
        return this.local_dFUServerQueue;
    }
    public void setExpireDays( int _expireDays )
    {
        this.local_expireDays = _expireDays;
    }
    public int getExpireDays( )
    {
        return this.local_expireDays;
    }
    public void setKeyCompression( String _keyCompression )
    {
        this.local_keyCompression = _keyCompression;
    }
    public String getKeyCompression( )
    {
        return this.local_keyCompression;
    }
}