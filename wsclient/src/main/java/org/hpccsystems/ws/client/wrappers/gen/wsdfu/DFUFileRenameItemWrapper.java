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
 * Class name: DFUFileRenameItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileRenameItemWrapper
{
    protected String local_oldName;
    protected String local_newName;

    public DFUFileRenameItemWrapper() {}

    public DFUFileRenameItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem dfufilerenameitem)
    {
        copy( dfufilerenameitem );
    }
    public DFUFileRenameItemWrapper( String _oldName, String _newName )
    {
        this.local_oldName = _oldName;
        this.local_newName = _newName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem raw )
    {
        if (raw == null)
            return;

        this.local_oldName = raw.getOldName();
        this.local_newName = raw.getNewName();

    }

    @Override
    public String toString()
    {
        return "DFUFileRenameItemWrapper [" + "oldName = " + local_oldName + ", " + "newName = " + local_newName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameItem();
        raw.setOldName( local_oldName);
        raw.setNewName( local_newName);
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
}