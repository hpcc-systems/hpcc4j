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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUArrayActionRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.850Z
 */
public class DFUArrayActionRequestWrapper
{
    protected DFUArrayActionsWrapper local_type;
    protected boolean local_noDelete;
    protected String local_backToPage;
    protected List<String> local_logicalFiles = null;
    protected boolean local_removeFromSuperfiles;
    protected boolean local_removeRecursively;
    protected DFUChangeProtectionWrapper local_protect;
    protected DFUChangeRestrictionWrapper local_restrict;

    public DFUArrayActionRequestWrapper() {}

    public DFUArrayActionRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest dfuarrayactionrequest)
    {
        copy( dfuarrayactionrequest );
    }
    public DFUArrayActionRequestWrapper( DFUArrayActionsWrapper _type, boolean _noDelete, String _backToPage, List<String> _logicalFiles, boolean _removeFromSuperfiles, boolean _removeRecursively, DFUChangeProtectionWrapper _protect, DFUChangeRestrictionWrapper _restrict )
    {
        this.local_type = _type;
        this.local_noDelete = _noDelete;
        this.local_backToPage = _backToPage;
        this.local_logicalFiles = _logicalFiles;
        this.local_removeFromSuperfiles = _removeFromSuperfiles;
        this.local_removeRecursively = _removeRecursively;
        this.local_protect = _protect;
        this.local_restrict = _restrict;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getType() != null)
            this.local_type = new DFUArrayActionsWrapper( raw.getType());
        this.local_noDelete = raw.getNoDelete();
        this.local_backToPage = raw.getBackToPage();
        if (raw.getLogicalFiles() != null)
        {
            this.local_logicalFiles = new ArrayList<String>();
            for ( int i = 0; i < raw.getLogicalFiles().getItem().length; i++)
            {
                this.local_logicalFiles.add(new String(raw.getLogicalFiles().getItem()[i]));
            }
        }        this.local_removeFromSuperfiles = raw.getRemoveFromSuperfiles();
        this.local_removeRecursively = raw.getRemoveRecursively();
        if (raw.getProtect() != null)
            this.local_protect = new DFUChangeProtectionWrapper( raw.getProtect());
        if (raw.getRestrict() != null)
            this.local_restrict = new DFUChangeRestrictionWrapper( raw.getRestrict());

    }

    @Override
    public String toString()
    {
        return "DFUArrayActionRequestWrapper [" + "type = " + local_type + ", " + "noDelete = " + local_noDelete + ", " + "backToPage = " + local_backToPage + ", " + "logicalFiles = " + local_logicalFiles + ", " + "removeFromSuperfiles = " + local_removeFromSuperfiles + ", " + "removeRecursively = " + local_removeRecursively + ", " + "protect = " + local_protect + ", " + "restrict = " + local_restrict + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest();
        raw.setType( local_type.getRaw());
        raw.setNoDelete( local_noDelete);
        raw.setBackToPage( local_backToPage);
        if (this.local_logicalFiles!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_logicalFiles.size(); i++)
            {
                arr.addItem(this.local_logicalFiles.get(i));
            }
            raw.setLogicalFiles(arr);
        }
        raw.setRemoveFromSuperfiles( local_removeFromSuperfiles);
        raw.setRemoveRecursively( local_removeRecursively);
        raw.setProtect( local_protect.getRaw());
        raw.setRestrict( local_restrict.getRaw());
        return raw;
    }


    public void setType( DFUArrayActionsWrapper _type )
    {
        this.local_type = _type;
    }
    public DFUArrayActionsWrapper getType( )
    {
        return this.local_type;
    }
    public void setNoDelete( boolean _noDelete )
    {
        this.local_noDelete = _noDelete;
    }
    public boolean getNoDelete( )
    {
        return this.local_noDelete;
    }
    public void setBackToPage( String _backToPage )
    {
        this.local_backToPage = _backToPage;
    }
    public String getBackToPage( )
    {
        return this.local_backToPage;
    }
    public void setLogicalFiles( List<String> _logicalFiles )
    {
        this.local_logicalFiles = _logicalFiles;
    }
    public List<String> getLogicalFiles( )
    {
        return this.local_logicalFiles;
    }
    public void setRemoveFromSuperfiles( boolean _removeFromSuperfiles )
    {
        this.local_removeFromSuperfiles = _removeFromSuperfiles;
    }
    public boolean getRemoveFromSuperfiles( )
    {
        return this.local_removeFromSuperfiles;
    }
    public void setRemoveRecursively( boolean _removeRecursively )
    {
        this.local_removeRecursively = _removeRecursively;
    }
    public boolean getRemoveRecursively( )
    {
        return this.local_removeRecursively;
    }
    public void setProtect( DFUChangeProtectionWrapper _protect )
    {
        this.local_protect = _protect;
    }
    public DFUChangeProtectionWrapper getProtect( )
    {
        return this.local_protect;
    }
    public void setRestrict( DFUChangeRestrictionWrapper _restrict )
    {
        this.local_restrict = _restrict;
    }
    public DFUChangeRestrictionWrapper getRestrict( )
    {
        return this.local_restrict;
    }
}