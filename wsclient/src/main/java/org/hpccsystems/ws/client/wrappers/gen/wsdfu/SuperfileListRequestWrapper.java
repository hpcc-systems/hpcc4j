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
 * WrapperMaker version: 1.7
 * Class name: SuperfileListRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class SuperfileListRequestWrapper
{
    protected String local_superfile;

    public SuperfileListRequestWrapper() {}

    public SuperfileListRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest superfilelistrequest)
    {
        copy( superfilelistrequest );
    }
    public SuperfileListRequestWrapper( String _superfile )
    {
        this.local_superfile = _superfile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest raw )
    {
        if (raw == null)
            return;

        this.local_superfile = raw.getSuperfile();

    }

    @Override
    public String toString()
    {
        return "SuperfileListRequestWrapper [" + "superfile = " + local_superfile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest();
        raw.setSuperfile( local_superfile);
        return raw;
    }


    public void setSuperfile( String _superfile )
    {
        this.local_superfile = _superfile;
    }
    public String getSuperfile( )
    {
        return this.local_superfile;
    }
}