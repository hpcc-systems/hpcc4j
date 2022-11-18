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
 * Class name: FileAccessRoleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileAccessRole
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.323Z
 */
public class FileAccessRoleWrapper
{
    protected String local_fileAccessRole;

    public FileAccessRoleWrapper() {}

    public FileAccessRoleWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileAccessRole fileaccessrole)
    {
        copy( fileaccessrole );
    }
    public FileAccessRoleWrapper( String _fileAccessRole )
    {
        this.local_fileAccessRole = _fileAccessRole;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileAccessRole raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getFileAccessRole();

    }

    @Override
    public String toString()
    {
        return "FileAccessRoleWrapper [" + "fileAccessRole = " + local_fileAccessRole + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileAccessRole getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileAccessRole raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setFileAccessRole(fileAccessRole);
        return raw;
    }


    public void setFileAccessRole( String _fileAccessRole )
    {
        this.local_fileAccessRole = _fileAccessRole;
    }
    public String getFileAccessRole( )
    {
        return this.local_fileAccessRole;
    }
}