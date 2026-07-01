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
import org.apache.axiom.om.OMElement;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: EclFieldTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class EclFieldTypeWrapper
{
    protected HPCCFieldTypeWrapper local_type;
    protected String local_locale;
    protected OMElement local_length;
    protected OMElement local_precision;

    public EclFieldTypeWrapper() {}

    public EclFieldTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldType eclfieldtype)
    {
        copy( eclfieldtype );
    }
    public EclFieldTypeWrapper( HPCCFieldTypeWrapper _type, String _locale, OMElement _length, OMElement _precision )
    {
        this.local_type = _type;
        this.local_locale = _locale;
        this.local_length = _length;
        this.local_precision = _precision;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldType raw )
    {
        if (raw == null)
            return;

        if (raw.getType() != null)
            this.local_type = new HPCCFieldTypeWrapper( raw.getType());
        this.local_locale = raw.getLocale();
        this.local_length = raw.getLength();
        this.local_precision = raw.getPrecision();

    }

    @Override
    public String toString()
    {
        return "EclFieldTypeWrapper [" + "type = " + local_type + ", " + "locale = " + local_locale + ", " + "length = " + local_length + ", " + "precision = " + local_precision + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldType raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFieldType();
        if (local_type != null)
            raw.setType( local_type.getRaw());
        raw.setLocale( local_locale);
        raw.setLength( local_length);
        raw.setPrecision( local_precision);
        return raw;
    }


    public void setType( HPCCFieldTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public HPCCFieldTypeWrapper getType( )
    {
        return this.local_type;
    }
    public void setLocale( String _locale )
    {
        this.local_locale = _locale;
    }
    public String getLocale( )
    {
        return this.local_locale;
    }
    public void setLength( OMElement _length )
    {
        this.local_length = _length;
    }
    public OMElement getLength( )
    {
        return this.local_length;
    }
    public void setPrecision( OMElement _precision )
    {
        this.local_precision = _precision;
    }
    public OMElement getPrecision( )
    {
        return this.local_precision;
    }
}