package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: ECLAttributeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ECLAttributeWrapper
{
    protected String local_moduleName;
    protected String local_name;
    protected String local_type;
    protected int local_version;
    protected int local_latestVersion;
    protected int local_sandboxVersion;
    protected int local_flags;
    protected int local_access;
    protected boolean local_isLocked;
    protected boolean local_isCheckedOut;
    protected boolean local_isSandbox;
    protected boolean local_isOrphaned;
    protected int local_resultType;
    protected String local_lockedBy;
    protected String local_modifiedBy;
    protected String local_modifiedDate;
    protected String local_description;
    protected String local_checksum;
    protected String local_text;
    protected MatchedLines_type0Wrapper local_matchedLines;

    public ECLAttributeWrapper() {}

    public ECLAttributeWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute eclattribute)
    {
        copy( eclattribute );
    }
    public ECLAttributeWrapper( String _moduleName, String _name, String _type, int _version, int _latestVersion, int _sandboxVersion, int _flags, int _access, boolean _isLocked, boolean _isCheckedOut, boolean _isSandbox, boolean _isOrphaned, int _resultType, String _lockedBy, String _modifiedBy, String _modifiedDate, String _description, String _checksum, String _text, MatchedLines_type0Wrapper _matchedLines )
    {
        this.local_moduleName = _moduleName;
        this.local_name = _name;
        this.local_type = _type;
        this.local_version = _version;
        this.local_latestVersion = _latestVersion;
        this.local_sandboxVersion = _sandboxVersion;
        this.local_flags = _flags;
        this.local_access = _access;
        this.local_isLocked = _isLocked;
        this.local_isCheckedOut = _isCheckedOut;
        this.local_isSandbox = _isSandbox;
        this.local_isOrphaned = _isOrphaned;
        this.local_resultType = _resultType;
        this.local_lockedBy = _lockedBy;
        this.local_modifiedBy = _modifiedBy;
        this.local_modifiedDate = _modifiedDate;
        this.local_description = _description;
        this.local_checksum = _checksum;
        this.local_text = _text;
        this.local_matchedLines = _matchedLines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_version = raw.getVersion();
        this.local_latestVersion = raw.getLatestVersion();
        this.local_sandboxVersion = raw.getSandboxVersion();
        this.local_flags = raw.getFlags();
        this.local_access = raw.getAccess();
        this.local_isLocked = raw.getIsLocked();
        this.local_isCheckedOut = raw.getIsCheckedOut();
        this.local_isSandbox = raw.getIsSandbox();
        this.local_isOrphaned = raw.getIsOrphaned();
        this.local_resultType = raw.getResultType();
        this.local_lockedBy = raw.getLockedBy();
        this.local_modifiedBy = raw.getModifiedBy();
        this.local_modifiedDate = raw.getModifiedDate();
        this.local_description = raw.getDescription();
        this.local_checksum = raw.getChecksum();
        this.local_text = raw.getText();
        if (raw.getMatchedLines() != null)
            this.local_matchedLines = new MatchedLines_type0Wrapper( raw.getMatchedLines());

    }

    @Override
    public String toString()
    {
        return "ECLAttributeWrapper [" + "moduleName = " + local_moduleName + ", " + "name = " + local_name + ", " + "type = " + local_type + ", " + "version = " + local_version + ", " + "latestVersion = " + local_latestVersion + ", " + "sandboxVersion = " + local_sandboxVersion + ", " + "flags = " + local_flags + ", " + "access = " + local_access + ", " + "isLocked = " + local_isLocked + ", " + "isCheckedOut = " + local_isCheckedOut + ", " + "isSandbox = " + local_isSandbox + ", " + "isOrphaned = " + local_isOrphaned + ", " + "resultType = " + local_resultType + ", " + "lockedBy = " + local_lockedBy + ", " + "modifiedBy = " + local_modifiedBy + ", " + "modifiedDate = " + local_modifiedDate + ", " + "description = " + local_description + ", " + "checksum = " + local_checksum + ", " + "text = " + local_text + ", " + "matchedLines = " + local_matchedLines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute();
        raw.setModuleName( local_moduleName);
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setVersion( local_version);
        raw.setLatestVersion( local_latestVersion);
        raw.setSandboxVersion( local_sandboxVersion);
        raw.setFlags( local_flags);
        raw.setAccess( local_access);
        raw.setIsLocked( local_isLocked);
        raw.setIsCheckedOut( local_isCheckedOut);
        raw.setIsSandbox( local_isSandbox);
        raw.setIsOrphaned( local_isOrphaned);
        raw.setResultType( local_resultType);
        raw.setLockedBy( local_lockedBy);
        raw.setModifiedBy( local_modifiedBy);
        raw.setModifiedDate( local_modifiedDate);
        raw.setDescription( local_description);
        raw.setChecksum( local_checksum);
        raw.setText( local_text);
        if (local_matchedLines != null)
            raw.setMatchedLines( local_matchedLines.getRaw());
        return raw;
    }


    public void setModuleName( String _moduleName )
    {
        this.local_moduleName = _moduleName;
    }
    public String getModuleName( )
    {
        return this.local_moduleName;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setVersion( int _version )
    {
        this.local_version = _version;
    }
    public int getVersion( )
    {
        return this.local_version;
    }
    public void setLatestVersion( int _latestVersion )
    {
        this.local_latestVersion = _latestVersion;
    }
    public int getLatestVersion( )
    {
        return this.local_latestVersion;
    }
    public void setSandboxVersion( int _sandboxVersion )
    {
        this.local_sandboxVersion = _sandboxVersion;
    }
    public int getSandboxVersion( )
    {
        return this.local_sandboxVersion;
    }
    public void setFlags( int _flags )
    {
        this.local_flags = _flags;
    }
    public int getFlags( )
    {
        return this.local_flags;
    }
    public void setAccess( int _access )
    {
        this.local_access = _access;
    }
    public int getAccess( )
    {
        return this.local_access;
    }
    public void setIsLocked( boolean _isLocked )
    {
        this.local_isLocked = _isLocked;
    }
    public boolean getIsLocked( )
    {
        return this.local_isLocked;
    }
    public void setIsCheckedOut( boolean _isCheckedOut )
    {
        this.local_isCheckedOut = _isCheckedOut;
    }
    public boolean getIsCheckedOut( )
    {
        return this.local_isCheckedOut;
    }
    public void setIsSandbox( boolean _isSandbox )
    {
        this.local_isSandbox = _isSandbox;
    }
    public boolean getIsSandbox( )
    {
        return this.local_isSandbox;
    }
    public void setIsOrphaned( boolean _isOrphaned )
    {
        this.local_isOrphaned = _isOrphaned;
    }
    public boolean getIsOrphaned( )
    {
        return this.local_isOrphaned;
    }
    public void setResultType( int _resultType )
    {
        this.local_resultType = _resultType;
    }
    public int getResultType( )
    {
        return this.local_resultType;
    }
    public void setLockedBy( String _lockedBy )
    {
        this.local_lockedBy = _lockedBy;
    }
    public String getLockedBy( )
    {
        return this.local_lockedBy;
    }
    public void setModifiedBy( String _modifiedBy )
    {
        this.local_modifiedBy = _modifiedBy;
    }
    public String getModifiedBy( )
    {
        return this.local_modifiedBy;
    }
    public void setModifiedDate( String _modifiedDate )
    {
        this.local_modifiedDate = _modifiedDate;
    }
    public String getModifiedDate( )
    {
        return this.local_modifiedDate;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setChecksum( String _checksum )
    {
        this.local_checksum = _checksum;
    }
    public String getChecksum( )
    {
        return this.local_checksum;
    }
    public void setText( String _text )
    {
        this.local_text = _text;
    }
    public String getText( )
    {
        return this.local_text;
    }
    public void setMatchedLines( MatchedLines_type0Wrapper _matchedLines )
    {
        this.local_matchedLines = _matchedLines;
    }
    public MatchedLines_type0Wrapper getMatchedLines( )
    {
        return this.local_matchedLines;
    }
}