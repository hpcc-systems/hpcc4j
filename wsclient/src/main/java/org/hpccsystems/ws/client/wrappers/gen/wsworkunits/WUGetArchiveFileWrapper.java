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
 * Class name: WUGetArchiveFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.914Z
 */
public class WUGetArchiveFileWrapper
{
    protected String local_wUID;
    protected String local_moduleName;
    protected String local_fileName;
    protected String local_path;

    public WUGetArchiveFileWrapper() {}

    public WUGetArchiveFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFile wugetarchivefile)
    {
        copy( wugetarchivefile );
    }
    public WUGetArchiveFileWrapper( String _wUID, String _moduleName, String _fileName, String _path )
    {
        this.local_wUID = _wUID;
        this.local_moduleName = _moduleName;
        this.local_fileName = _fileName;
        this.local_path = _path;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFile raw )
    {
        if (raw == null)
            return;

        this.local_wUID = raw.getWUID();
        this.local_moduleName = raw.getModuleName();
        this.local_fileName = raw.getFileName();
        this.local_path = raw.getPath();

    }

    @Override
    public String toString()
    {
        return "WUGetArchiveFileWrapper [" + "wUID = " + local_wUID + ", " + "moduleName = " + local_moduleName + ", " + "fileName = " + local_fileName + ", " + "path = " + local_path + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFile();
        raw.setWUID( local_wUID);
        raw.setModuleName( local_moduleName);
        raw.setFileName( local_fileName);
        raw.setPath( local_path);
        return raw;
    }


    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setModuleName( String _moduleName )
    {
        this.local_moduleName = _moduleName;
    }
    public String getModuleName( )
    {
        return this.local_moduleName;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
}