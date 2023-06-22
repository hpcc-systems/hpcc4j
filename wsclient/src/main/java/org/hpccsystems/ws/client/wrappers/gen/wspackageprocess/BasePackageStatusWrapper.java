package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;

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
 * Class name: BasePackageStatusWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.BasePackageStatus
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 */
public class BasePackageStatusWrapper
{
    protected int local_code;
    protected String local_description;

    public BasePackageStatusWrapper() {}

    public BasePackageStatusWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.BasePackageStatus basepackagestatus)
    {
        copy( basepackagestatus );
    }
    public BasePackageStatusWrapper( int _code, String _description )
    {
        this.local_code = _code;
        this.local_description = _description;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.BasePackageStatus raw )
    {
        if (raw == null)
            return;

        this.local_code = raw.getCode();
        this.local_description = raw.getDescription();

    }

    @Override
    public String toString()
    {
        return "BasePackageStatusWrapper [" + "code = " + local_code + ", " + "description = " + local_description + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.BasePackageStatus getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.BasePackageStatus raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.BasePackageStatus();
        raw.setCode( local_code);
        raw.setDescription( local_description);
        return raw;
    }


    public void setCode( int _code )
    {
        this.local_code = _code;
    }
    public int getCode( )
    {
        return this.local_code;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
}