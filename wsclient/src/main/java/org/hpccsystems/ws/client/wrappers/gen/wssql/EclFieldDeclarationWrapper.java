package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: EclFieldDeclarationWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldDeclaration
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.355Z
 */
public class EclFieldDeclarationWrapper
{
    protected String local_fieldName;
    protected EclFieldTypeWrapper local_eclFieldType;

    public EclFieldDeclarationWrapper() {}

    public EclFieldDeclarationWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldDeclaration eclfielddeclaration)
    {
        copy( eclfielddeclaration );
    }
    public EclFieldDeclarationWrapper( String _fieldName, EclFieldTypeWrapper _eclFieldType )
    {
        this.local_fieldName = _fieldName;
        this.local_eclFieldType = _eclFieldType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldDeclaration raw )
    {
        if (raw == null)
            return;

        this.local_fieldName = raw.getFieldName();
        if (raw.getEclFieldType() != null)
            this.local_eclFieldType = new EclFieldTypeWrapper( raw.getEclFieldType());

    }

    @Override
    public String toString()
    {
        return "EclFieldDeclarationWrapper [" + "fieldName = " + local_fieldName + ", " + "eclFieldType = " + local_eclFieldType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldDeclaration getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldDeclaration raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldDeclaration();
        raw.setFieldName( local_fieldName);
        if (local_eclFieldType != null)
            raw.setEclFieldType( local_eclFieldType.getRaw());
        return raw;
    }


    public void setFieldName( String _fieldName )
    {
        this.local_fieldName = _fieldName;
    }
    public String getFieldName( )
    {
        return this.local_fieldName;
    }
    public void setEclFieldType( EclFieldTypeWrapper _eclFieldType )
    {
        this.local_eclFieldType = _eclFieldType;
    }
    public EclFieldTypeWrapper getEclFieldType( )
    {
        return this.local_eclFieldType;
    }
}