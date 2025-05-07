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
 * Class name: DesprayWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class DesprayWrapper
{
    protected String local_destGroup;
    protected String local_sourceLogicalName;
    protected String local_destIP;
    protected String local_destPath;
    protected String local_destPlane;
    protected DataHandler local_dstxml;
    protected boolean local_overwrite;
    protected int local_maxConnections;
    protected int local_throttle;
    protected int local_transferBufferSize;
    protected String local_splitprefix;
    protected boolean local_norecover;
    protected boolean local_wrap;
    protected boolean local_multiCopy;
    protected boolean local_singleConnection;
    protected String local_dFUServerQueue;
    protected boolean local_compress;
    protected String local_encrypt;
    protected String local_decrypt;

    public DesprayWrapper() {}

    public DesprayWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray despray)
    {
        copy( despray );
    }
    public DesprayWrapper( String _destGroup, String _sourceLogicalName, String _destIP, String _destPath, String _destPlane, DataHandler _dstxml, boolean _overwrite, int _maxConnections, int _throttle, int _transferBufferSize, String _splitprefix, boolean _norecover, boolean _wrap, boolean _multiCopy, boolean _singleConnection, String _dFUServerQueue, boolean _compress, String _encrypt, String _decrypt )
    {
        this.local_destGroup = _destGroup;
        this.local_sourceLogicalName = _sourceLogicalName;
        this.local_destIP = _destIP;
        this.local_destPath = _destPath;
        this.local_destPlane = _destPlane;
        this.local_dstxml = _dstxml;
        this.local_overwrite = _overwrite;
        this.local_maxConnections = _maxConnections;
        this.local_throttle = _throttle;
        this.local_transferBufferSize = _transferBufferSize;
        this.local_splitprefix = _splitprefix;
        this.local_norecover = _norecover;
        this.local_wrap = _wrap;
        this.local_multiCopy = _multiCopy;
        this.local_singleConnection = _singleConnection;
        this.local_dFUServerQueue = _dFUServerQueue;
        this.local_compress = _compress;
        this.local_encrypt = _encrypt;
        this.local_decrypt = _decrypt;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray raw )
    {
        if (raw == null)
            return;

        this.local_destGroup = raw.getDestGroup();
        this.local_sourceLogicalName = raw.getSourceLogicalName();
        this.local_destIP = raw.getDestIP();
        this.local_destPath = raw.getDestPath();
        this.local_destPlane = raw.getDestPlane();
        this.local_dstxml = raw.getDstxml();
        this.local_overwrite = raw.getOverwrite();
        this.local_maxConnections = raw.getMaxConnections();
        this.local_throttle = raw.getThrottle();
        this.local_transferBufferSize = raw.getTransferBufferSize();
        this.local_splitprefix = raw.getSplitprefix();
        this.local_norecover = raw.getNorecover();
        this.local_wrap = raw.getWrap();
        this.local_multiCopy = raw.getMultiCopy();
        this.local_singleConnection = raw.getSingleConnection();
        this.local_dFUServerQueue = raw.getDFUServerQueue();
        this.local_compress = raw.getCompress();
        this.local_encrypt = raw.getEncrypt();
        this.local_decrypt = raw.getDecrypt();

    }

    @Override
    public String toString()
    {
        return "DesprayWrapper [" + "destGroup = " + local_destGroup + ", " + "sourceLogicalName = " + local_sourceLogicalName + ", " + "destIP = " + local_destIP + ", " + "destPath = " + local_destPath + ", " + "destPlane = " + local_destPlane + ", " + "dstxml = " + local_dstxml + ", " + "overwrite = " + local_overwrite + ", " + "maxConnections = " + local_maxConnections + ", " + "throttle = " + local_throttle + ", " + "transferBufferSize = " + local_transferBufferSize + ", " + "splitprefix = " + local_splitprefix + ", " + "norecover = " + local_norecover + ", " + "wrap = " + local_wrap + ", " + "multiCopy = " + local_multiCopy + ", " + "singleConnection = " + local_singleConnection + ", " + "dFUServerQueue = " + local_dFUServerQueue + ", " + "compress = " + local_compress + ", " + "encrypt = " + local_encrypt + ", " + "decrypt = " + local_decrypt + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray();
        raw.setDestGroup( local_destGroup);
        raw.setSourceLogicalName( local_sourceLogicalName);
        raw.setDestIP( local_destIP);
        raw.setDestPath( local_destPath);
        raw.setDestPlane( local_destPlane);
        raw.setDstxml( local_dstxml);
        raw.setOverwrite( local_overwrite);
        raw.setMaxConnections( local_maxConnections);
        raw.setThrottle( local_throttle);
        raw.setTransferBufferSize( local_transferBufferSize);
        raw.setSplitprefix( local_splitprefix);
        raw.setNorecover( local_norecover);
        raw.setWrap( local_wrap);
        raw.setMultiCopy( local_multiCopy);
        raw.setSingleConnection( local_singleConnection);
        raw.setDFUServerQueue( local_dFUServerQueue);
        raw.setCompress( local_compress);
        raw.setEncrypt( local_encrypt);
        raw.setDecrypt( local_decrypt);
        return raw;
    }


    public void setDestGroup( String _destGroup )
    {
        this.local_destGroup = _destGroup;
    }
    public String getDestGroup( )
    {
        return this.local_destGroup;
    }
    public void setSourceLogicalName( String _sourceLogicalName )
    {
        this.local_sourceLogicalName = _sourceLogicalName;
    }
    public String getSourceLogicalName( )
    {
        return this.local_sourceLogicalName;
    }
    public void setDestIP( String _destIP )
    {
        this.local_destIP = _destIP;
    }
    public String getDestIP( )
    {
        return this.local_destIP;
    }
    public void setDestPath( String _destPath )
    {
        this.local_destPath = _destPath;
    }
    public String getDestPath( )
    {
        return this.local_destPath;
    }
    public void setDestPlane( String _destPlane )
    {
        this.local_destPlane = _destPlane;
    }
    public String getDestPlane( )
    {
        return this.local_destPlane;
    }
    public void setDstxml( DataHandler _dstxml )
    {
        this.local_dstxml = _dstxml;
    }
    public DataHandler getDstxml( )
    {
        return this.local_dstxml;
    }
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
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
    public void setSplitprefix( String _splitprefix )
    {
        this.local_splitprefix = _splitprefix;
    }
    public String getSplitprefix( )
    {
        return this.local_splitprefix;
    }
    public void setNorecover( boolean _norecover )
    {
        this.local_norecover = _norecover;
    }
    public boolean getNorecover( )
    {
        return this.local_norecover;
    }
    public void setWrap( boolean _wrap )
    {
        this.local_wrap = _wrap;
    }
    public boolean getWrap( )
    {
        return this.local_wrap;
    }
    public void setMultiCopy( boolean _multiCopy )
    {
        this.local_multiCopy = _multiCopy;
    }
    public boolean getMultiCopy( )
    {
        return this.local_multiCopy;
    }
    public void setSingleConnection( boolean _singleConnection )
    {
        this.local_singleConnection = _singleConnection;
    }
    public boolean getSingleConnection( )
    {
        return this.local_singleConnection;
    }
    public void setDFUServerQueue( String _dFUServerQueue )
    {
        this.local_dFUServerQueue = _dFUServerQueue;
    }
    public String getDFUServerQueue( )
    {
        return this.local_dFUServerQueue;
    }
    public void setCompress( boolean _compress )
    {
        this.local_compress = _compress;
    }
    public boolean getCompress( )
    {
        return this.local_compress;
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
}