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
 * Class name: DFUFileRenameResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileRenameResultWrapper
{
    protected String local_oldName;
    protected String local_newName;
    protected boolean local_success;
    protected String local_message;

    public DFUFileRenameResultWrapper() {}

    public DFUFileRenameResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult dfufilerenameresult)
    {
        copy( dfufilerenameresult );
    }
    public DFUFileRenameResultWrapper( String _oldName, String _newName, boolean _success, String _message )
    {
        this.local_oldName = _oldName;
        this.local_newName = _newName;
        this.local_success = _success;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult raw )
    {
        if (raw == null)
            return;

        this.local_oldName = raw.getOldName();
        this.local_newName = raw.getNewName();
        this.local_success = raw.getSuccess();
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "DFUFileRenameResultWrapper [" + "oldName = " + local_oldName + ", " + "newName = " + local_newName + ", " + "success = " + local_success + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult();
        raw.setOldName( local_oldName);
        raw.setNewName( local_newName);
        raw.setSuccess( local_success);
        raw.setMessage( local_message);
        return raw;
    }


    public void setOldName( String _oldName )
    {
        this.local_oldName = _oldName;
    }
    public String getOldName( )
    {
        return this.local_oldName;
    }
    public void setNewName( String _newName )
    {
        this.local_newName = _newName;
    }
    public String getNewName( )
    {
        return this.local_newName;
    }
    public void setSuccess( boolean _success )
    {
        this.local_success = _success;
    }
    public boolean getSuccess( )
    {
        return this.local_success;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
}