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
 * Class name: ECLWUFileSummaryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class ECLWUFileSummaryWrapper
{
    protected String local_name;
    protected String local_type;
    protected boolean local_isOpt;
    protected boolean local_isSigned;

    public ECLWUFileSummaryWrapper() {}

    public ECLWUFileSummaryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary eclwufilesummary)
    {
        copy( eclwufilesummary );
    }
    public ECLWUFileSummaryWrapper( String _name, String _type, boolean _isOpt, boolean _isSigned )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_isOpt = _isOpt;
        this.local_isSigned = _isSigned;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_isOpt = raw.getIsOpt();
        this.local_isSigned = raw.getIsSigned();

    }

    @Override
    public String toString()
    {
        return "ECLWUFileSummaryWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "isOpt = " + local_isOpt + ", " + "isSigned = " + local_isSigned + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setIsOpt( local_isOpt);
        raw.setIsSigned( local_isSigned);
        return raw;
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
    public void setIsOpt( boolean _isOpt )
    {
        this.local_isOpt = _isOpt;
    }
    public boolean getIsOpt( )
    {
        return this.local_isOpt;
    }
    public void setIsSigned( boolean _isSigned )
    {
        this.local_isSigned = _isSigned;
    }
    public boolean getIsSigned( )
    {
        return this.local_isSigned;
    }
}