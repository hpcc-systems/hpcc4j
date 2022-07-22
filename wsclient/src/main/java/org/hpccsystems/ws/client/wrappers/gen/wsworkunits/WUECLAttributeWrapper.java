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
 * Class name: WUECLAttributeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.905Z
 */
public class WUECLAttributeWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected boolean local_isLocked;
    protected boolean local_isCheckedOut;
    protected boolean local_isSandbox;
    protected boolean local_isOrphaned;

    public WUECLAttributeWrapper() {}

    public WUECLAttributeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute wueclattribute)
    {
        copy( wueclattribute );
    }
    public WUECLAttributeWrapper( String _moduleName, String _attributeName, boolean _isLocked, boolean _isCheckedOut, boolean _isSandbox, boolean _isOrphaned )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_isLocked = _isLocked;
        this.local_isCheckedOut = _isCheckedOut;
        this.local_isSandbox = _isSandbox;
        this.local_isOrphaned = _isOrphaned;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_isLocked = raw.getIsLocked();
        this.local_isCheckedOut = raw.getIsCheckedOut();
        this.local_isSandbox = raw.getIsSandbox();
        this.local_isOrphaned = raw.getIsOrphaned();

    }

    @Override
    public String toString()
    {
        return "WUECLAttributeWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "isLocked = " + local_isLocked + ", " + "isCheckedOut = " + local_isCheckedOut + ", " + "isSandbox = " + local_isSandbox + ", " + "isOrphaned = " + local_isOrphaned + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setIsLocked( local_isLocked);
        raw.setIsCheckedOut( local_isCheckedOut);
        raw.setIsSandbox( local_isSandbox);
        raw.setIsOrphaned( local_isOrphaned);
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
}