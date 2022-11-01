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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ECLSourceFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.446Z
 */
public class ECLSourceFileWrapper
{
    protected String local_fileCluster;
    protected String local_name;
    protected boolean local_isSuperFile;
    protected int local_subs;
    protected int local_count;
    protected ArrayOfECLSourceFileWrapper local_eCLSourceFiles;

    public ECLSourceFileWrapper() {}

    public ECLSourceFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile eclsourcefile)
    {
        copy( eclsourcefile );
    }
    public ECLSourceFileWrapper( String _fileCluster, String _name, boolean _isSuperFile, int _subs, int _count, ArrayOfECLSourceFileWrapper _eCLSourceFiles )
    {
        this.local_fileCluster = _fileCluster;
        this.local_name = _name;
        this.local_isSuperFile = _isSuperFile;
        this.local_subs = _subs;
        this.local_count = _count;
        this.local_eCLSourceFiles = _eCLSourceFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile raw )
    {
        if (raw == null)
            return;

        this.local_fileCluster = raw.getFileCluster();
        this.local_name = raw.getName();
        this.local_isSuperFile = raw.getIsSuperFile();
        this.local_subs = raw.getSubs();
        this.local_count = raw.getCount();
        if (raw.getECLSourceFiles() != null)
            this.local_eCLSourceFiles = new ArrayOfECLSourceFileWrapper( raw.getECLSourceFiles());

    }

    @Override
    public String toString()
    {
        return "ECLSourceFileWrapper [" + "fileCluster = " + local_fileCluster + ", " + "name = " + local_name + ", " + "isSuperFile = " + local_isSuperFile + ", " + "subs = " + local_subs + ", " + "count = " + local_count + ", " + "eCLSourceFiles = " + local_eCLSourceFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile();
        raw.setFileCluster( local_fileCluster);
        raw.setName( local_name);
        raw.setIsSuperFile( local_isSuperFile);
        raw.setSubs( local_subs);
        raw.setCount( local_count);
        if (local_eCLSourceFiles != null)
            raw.setECLSourceFiles( local_eCLSourceFiles.getRaw());
        return raw;
    }


    public void setFileCluster( String _fileCluster )
    {
        this.local_fileCluster = _fileCluster;
    }
    public String getFileCluster( )
    {
        return this.local_fileCluster;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setIsSuperFile( boolean _isSuperFile )
    {
        this.local_isSuperFile = _isSuperFile;
    }
    public boolean getIsSuperFile( )
    {
        return this.local_isSuperFile;
    }
    public void setSubs( int _subs )
    {
        this.local_subs = _subs;
    }
    public int getSubs( )
    {
        return this.local_subs;
    }
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setECLSourceFiles( ArrayOfECLSourceFileWrapper _eCLSourceFiles )
    {
        this.local_eCLSourceFiles = _eCLSourceFiles;
    }
    public ArrayOfECLSourceFileWrapper getECLSourceFiles( )
    {
        return this.local_eCLSourceFiles;
    }
}