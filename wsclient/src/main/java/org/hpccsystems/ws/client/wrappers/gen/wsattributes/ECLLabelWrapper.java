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
 * Class name: ECLLabelWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ECLLabelWrapper
{
    protected String local_name;
    protected String local_modifiedDate;

    public ECLLabelWrapper() {}

    public ECLLabelWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel ecllabel)
    {
        copy( ecllabel );
    }
    public ECLLabelWrapper( String _name, String _modifiedDate )
    {
        this.local_name = _name;
        this.local_modifiedDate = _modifiedDate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_modifiedDate = raw.getModifiedDate();

    }

    @Override
    public String toString()
    {
        return "ECLLabelWrapper [" + "name = " + local_name + ", " + "modifiedDate = " + local_modifiedDate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel();
        raw.setName( local_name);
        raw.setModifiedDate( local_modifiedDate);
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
    public void setModifiedDate( String _modifiedDate )
    {
        this.local_modifiedDate = _modifiedDate;
    }
    public String getModifiedDate( )
    {
        return this.local_modifiedDate;
    }
}