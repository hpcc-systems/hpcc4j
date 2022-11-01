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
 * Class name: FileListResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.829Z
 */
public class FileListResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_netaddr;
    protected String local_path;
    protected String local_mask;
    protected int local_oS;
    protected boolean local_directoryOnly;
    protected String local_acceptLanguage;
    protected ArrayOfPhysicalFileStructWrapper local_files;

    public FileListResponseWrapper() {}

    public FileListResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse filelistresponse)
    {
        copy( filelistresponse );
    }
    public FileListResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _netaddr, String _path, String _mask, int _oS, boolean _directoryOnly, String _acceptLanguage, ArrayOfPhysicalFileStructWrapper _files )
    {
        this.local_exceptions = _exceptions;
        this.local_netaddr = _netaddr;
        this.local_path = _path;
        this.local_mask = _mask;
        this.local_oS = _oS;
        this.local_directoryOnly = _directoryOnly;
        this.local_acceptLanguage = _acceptLanguage;
        this.local_files = _files;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_netaddr = raw.getNetaddr();
        this.local_path = raw.getPath();
        this.local_mask = raw.getMask();
        this.local_oS = raw.getOS();
        this.local_directoryOnly = raw.getDirectoryOnly();
        this.local_acceptLanguage = raw.getAcceptLanguage();
        if (raw.getFiles() != null)
            this.local_files = new ArrayOfPhysicalFileStructWrapper( raw.getFiles());

    }

    @Override
    public String toString()
    {
        return "FileListResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "netaddr = " + local_netaddr + ", " + "path = " + local_path + ", " + "mask = " + local_mask + ", " + "oS = " + local_oS + ", " + "directoryOnly = " + local_directoryOnly + ", " + "acceptLanguage = " + local_acceptLanguage + ", " + "files = " + local_files + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setNetaddr( local_netaddr);
        raw.setPath( local_path);
        raw.setMask( local_mask);
        raw.setOS( local_oS);
        raw.setDirectoryOnly( local_directoryOnly);
        raw.setAcceptLanguage( local_acceptLanguage);
        if (local_files != null)
            raw.setFiles( local_files.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setNetaddr( String _netaddr )
    {
        this.local_netaddr = _netaddr;
    }
    public String getNetaddr( )
    {
        return this.local_netaddr;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setMask( String _mask )
    {
        this.local_mask = _mask;
    }
    public String getMask( )
    {
        return this.local_mask;
    }
    public void setOS( int _oS )
    {
        this.local_oS = _oS;
    }
    public int getOS( )
    {
        return this.local_oS;
    }
    public void setDirectoryOnly( boolean _directoryOnly )
    {
        this.local_directoryOnly = _directoryOnly;
    }
    public boolean getDirectoryOnly( )
    {
        return this.local_directoryOnly;
    }
    public void setAcceptLanguage( String _acceptLanguage )
    {
        this.local_acceptLanguage = _acceptLanguage;
    }
    public String getAcceptLanguage( )
    {
        return this.local_acceptLanguage;
    }
    public void setFiles( ArrayOfPhysicalFileStructWrapper _files )
    {
        this.local_files = _files;
    }
    public ArrayOfPhysicalFileStructWrapper getFiles( )
    {
        return this.local_files;
    }
}