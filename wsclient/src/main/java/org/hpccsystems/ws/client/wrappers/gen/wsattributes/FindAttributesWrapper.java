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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: FindAttributesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class FindAttributesWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_userName;
    protected String local_label;
    protected String local_pattern;
    protected String local_regexp;
    protected String local_plain;
    protected String local_changedSince;
    protected List<String> local_typeList = null;
    protected boolean local_sandboxed;
    protected boolean local_locked;
    protected boolean local_checkedOut;
    protected boolean local_orphaned;
    protected boolean local_getText;
    protected boolean local_getMatchedLines;
    protected boolean local_includeHistory;

    public FindAttributesWrapper() {}

    public FindAttributesWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes findattributes)
    {
        copy( findattributes );
    }
    public FindAttributesWrapper( String _moduleName, String _attributeName, String _userName, String _label, String _pattern, String _regexp, String _plain, String _changedSince, List<String> _typeList, boolean _sandboxed, boolean _locked, boolean _checkedOut, boolean _orphaned, boolean _getText, boolean _getMatchedLines, boolean _includeHistory )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_userName = _userName;
        this.local_label = _label;
        this.local_pattern = _pattern;
        this.local_regexp = _regexp;
        this.local_plain = _plain;
        this.local_changedSince = _changedSince;
        this.local_typeList = _typeList;
        this.local_sandboxed = _sandboxed;
        this.local_locked = _locked;
        this.local_checkedOut = _checkedOut;
        this.local_orphaned = _orphaned;
        this.local_getText = _getText;
        this.local_getMatchedLines = _getMatchedLines;
        this.local_includeHistory = _includeHistory;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_userName = raw.getUserName();
        this.local_label = raw.getLabel();
        this.local_pattern = raw.getPattern();
        this.local_regexp = raw.getRegexp();
        this.local_plain = raw.getPlain();
        this.local_changedSince = raw.getChangedSince();
        if (raw.getTypeList() != null && raw.getTypeList().getItem() != null)
        {
            this.local_typeList = new ArrayList<String>();
            for ( int i = 0; i < raw.getTypeList().getItem().length; i++)
            {
                this.local_typeList.add(new String(raw.getTypeList().getItem()[i]));
            }
        }        this.local_sandboxed = raw.getSandboxed();
        this.local_locked = raw.getLocked();
        this.local_checkedOut = raw.getCheckedOut();
        this.local_orphaned = raw.getOrphaned();
        this.local_getText = raw.getGetText();
        this.local_getMatchedLines = raw.getGetMatchedLines();
        this.local_includeHistory = raw.getIncludeHistory();

    }

    @Override
    public String toString()
    {
        return "FindAttributesWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "userName = " + local_userName + ", " + "label = " + local_label + ", " + "pattern = " + local_pattern + ", " + "regexp = " + local_regexp + ", " + "plain = " + local_plain + ", " + "changedSince = " + local_changedSince + ", " + "typeList = " + local_typeList + ", " + "sandboxed = " + local_sandboxed + ", " + "locked = " + local_locked + ", " + "checkedOut = " + local_checkedOut + ", " + "orphaned = " + local_orphaned + ", " + "getText = " + local_getText + ", " + "getMatchedLines = " + local_getMatchedLines + ", " + "includeHistory = " + local_includeHistory + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setUserName( local_userName);
        raw.setLabel( local_label);
        raw.setPattern( local_pattern);
        raw.setRegexp( local_regexp);
        raw.setPlain( local_plain);
        raw.setChangedSince( local_changedSince);
        if (this.local_typeList!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_typeList.size(); i++)
            {
                arr.addItem(this.local_typeList.get(i));
            }
            raw.setTypeList(arr);
        }
        raw.setSandboxed( local_sandboxed);
        raw.setLocked( local_locked);
        raw.setCheckedOut( local_checkedOut);
        raw.setOrphaned( local_orphaned);
        raw.setGetText( local_getText);
        raw.setGetMatchedLines( local_getMatchedLines);
        raw.setIncludeHistory( local_includeHistory);
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
    public void setAttributeName( String _attributeName )
    {
        this.local_attributeName = _attributeName;
    }
    public String getAttributeName( )
    {
        return this.local_attributeName;
    }
    public void setUserName( String _userName )
    {
        this.local_userName = _userName;
    }
    public String getUserName( )
    {
        return this.local_userName;
    }
    public void setLabel( String _label )
    {
        this.local_label = _label;
    }
    public String getLabel( )
    {
        return this.local_label;
    }
    public void setPattern( String _pattern )
    {
        this.local_pattern = _pattern;
    }
    public String getPattern( )
    {
        return this.local_pattern;
    }
    public void setRegexp( String _regexp )
    {
        this.local_regexp = _regexp;
    }
    public String getRegexp( )
    {
        return this.local_regexp;
    }
    public void setPlain( String _plain )
    {
        this.local_plain = _plain;
    }
    public String getPlain( )
    {
        return this.local_plain;
    }
    public void setChangedSince( String _changedSince )
    {
        this.local_changedSince = _changedSince;
    }
    public String getChangedSince( )
    {
        return this.local_changedSince;
    }
    public void setTypeList( List<String> _typeList )
    {
        this.local_typeList = _typeList;
    }
    public List<String> getTypeList( )
    {
        return this.local_typeList;
    }
    public void setSandboxed( boolean _sandboxed )
    {
        this.local_sandboxed = _sandboxed;
    }
    public boolean getSandboxed( )
    {
        return this.local_sandboxed;
    }
    public void setLocked( boolean _locked )
    {
        this.local_locked = _locked;
    }
    public boolean getLocked( )
    {
        return this.local_locked;
    }
    public void setCheckedOut( boolean _checkedOut )
    {
        this.local_checkedOut = _checkedOut;
    }
    public boolean getCheckedOut( )
    {
        return this.local_checkedOut;
    }
    public void setOrphaned( boolean _orphaned )
    {
        this.local_orphaned = _orphaned;
    }
    public boolean getOrphaned( )
    {
        return this.local_orphaned;
    }
    public void setGetText( boolean _getText )
    {
        this.local_getText = _getText;
    }
    public boolean getGetText( )
    {
        return this.local_getText;
    }
    public void setGetMatchedLines( boolean _getMatchedLines )
    {
        this.local_getMatchedLines = _getMatchedLines;
    }
    public boolean getGetMatchedLines( )
    {
        return this.local_getMatchedLines;
    }
    public void setIncludeHistory( boolean _includeHistory )
    {
        this.local_includeHistory = _includeHistory;
    }
    public boolean getIncludeHistory( )
    {
        return this.local_includeHistory;
    }
}