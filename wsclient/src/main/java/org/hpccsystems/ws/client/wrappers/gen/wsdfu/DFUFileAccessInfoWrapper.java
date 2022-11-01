package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUFileAccessInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.866Z
 */
public class DFUFileAccessInfoWrapper
{
    protected String local_metaInfoBlob;
    protected String local_expiryTime;
    protected int local_numParts;
    protected ArrayOfDFUPartLocationWrapper local_fileLocations;
    protected ArrayOfDFUFilePartWrapper local_fileParts;
    protected String local_recordTypeInfoJson;
    protected int local_fileAccessPort;
    protected boolean local_fileAccessSSL;

    public DFUFileAccessInfoWrapper() {}

    public DFUFileAccessInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessInfo dfufileaccessinfo)
    {
        copy( dfufileaccessinfo );
    }
    public DFUFileAccessInfoWrapper( String _metaInfoBlob, String _expiryTime, int _numParts, ArrayOfDFUPartLocationWrapper _fileLocations, ArrayOfDFUFilePartWrapper _fileParts, String _recordTypeInfoJson, int _fileAccessPort, boolean _fileAccessSSL )
    {
        this.local_metaInfoBlob = _metaInfoBlob;
        this.local_expiryTime = _expiryTime;
        this.local_numParts = _numParts;
        this.local_fileLocations = _fileLocations;
        this.local_fileParts = _fileParts;
        this.local_recordTypeInfoJson = _recordTypeInfoJson;
        this.local_fileAccessPort = _fileAccessPort;
        this.local_fileAccessSSL = _fileAccessSSL;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessInfo raw )
    {
        if (raw == null)
            return;

        this.local_metaInfoBlob = raw.getMetaInfoBlob();
        this.local_expiryTime = raw.getExpiryTime();
        this.local_numParts = raw.getNumParts();
        if (raw.getFileLocations() != null)
            this.local_fileLocations = new ArrayOfDFUPartLocationWrapper( raw.getFileLocations());
        if (raw.getFileParts() != null)
            this.local_fileParts = new ArrayOfDFUFilePartWrapper( raw.getFileParts());
        this.local_recordTypeInfoJson = raw.getRecordTypeInfoJson();
        this.local_fileAccessPort = raw.getFileAccessPort();
        this.local_fileAccessSSL = raw.getFileAccessSSL();

    }

    @Override
    public String toString()
    {
        return "DFUFileAccessInfoWrapper [" + "metaInfoBlob = " + local_metaInfoBlob + ", " + "expiryTime = " + local_expiryTime + ", " + "numParts = " + local_numParts + ", " + "fileLocations = " + local_fileLocations + ", " + "fileParts = " + local_fileParts + ", " + "recordTypeInfoJson = " + local_recordTypeInfoJson + ", " + "fileAccessPort = " + local_fileAccessPort + ", " + "fileAccessSSL = " + local_fileAccessSSL + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessInfo();
        raw.setMetaInfoBlob( local_metaInfoBlob);
        raw.setExpiryTime( local_expiryTime);
        raw.setNumParts( local_numParts);
        raw.setFileLocations( local_fileLocations.getRaw());
        raw.setFileParts( local_fileParts.getRaw());
        raw.setRecordTypeInfoJson( local_recordTypeInfoJson);
        raw.setFileAccessPort( local_fileAccessPort);
        raw.setFileAccessSSL( local_fileAccessSSL);
        return raw;
    }


    public void setMetaInfoBlob( String _metaInfoBlob )
    {
        this.local_metaInfoBlob = _metaInfoBlob;
    }
    public String getMetaInfoBlob( )
    {
        return this.local_metaInfoBlob;
    }
    public void setExpiryTime( String _expiryTime )
    {
        this.local_expiryTime = _expiryTime;
    }
    public String getExpiryTime( )
    {
        return this.local_expiryTime;
    }
    public void setNumParts( int _numParts )
    {
        this.local_numParts = _numParts;
    }
    public int getNumParts( )
    {
        return this.local_numParts;
    }
    public void setFileLocations( ArrayOfDFUPartLocationWrapper _fileLocations )
    {
        this.local_fileLocations = _fileLocations;
    }
    public ArrayOfDFUPartLocationWrapper getFileLocations( )
    {
        return this.local_fileLocations;
    }
    public void setFileParts( ArrayOfDFUFilePartWrapper _fileParts )
    {
        this.local_fileParts = _fileParts;
    }
    public ArrayOfDFUFilePartWrapper getFileParts( )
    {
        return this.local_fileParts;
    }
    public void setRecordTypeInfoJson( String _recordTypeInfoJson )
    {
        this.local_recordTypeInfoJson = _recordTypeInfoJson;
    }
    public String getRecordTypeInfoJson( )
    {
        return this.local_recordTypeInfoJson;
    }
    public void setFileAccessPort( int _fileAccessPort )
    {
        this.local_fileAccessPort = _fileAccessPort;
    }
    public int getFileAccessPort( )
    {
        return this.local_fileAccessPort;
    }
    public void setFileAccessSSL( boolean _fileAccessSSL )
    {
        this.local_fileAccessSSL = _fileAccessSSL;
    }
    public boolean getFileAccessSSL( )
    {
        return this.local_fileAccessSSL;
    }
}