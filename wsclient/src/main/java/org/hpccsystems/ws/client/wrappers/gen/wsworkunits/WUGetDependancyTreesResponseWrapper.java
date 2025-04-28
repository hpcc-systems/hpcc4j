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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUGetDependancyTreesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTreesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUGetDependancyTreesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLExceptionWrapper local_errors;
    protected DataHandler local_dependancyTrees;

    public WUGetDependancyTreesResponseWrapper() {}

    public WUGetDependancyTreesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTreesResponse wugetdependancytreesresponse)
    {
        copy( wugetdependancytreesresponse );
    }
    public WUGetDependancyTreesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLExceptionWrapper _errors, DataHandler _dependancyTrees )
    {
        this.local_exceptions = _exceptions;
        this.local_errors = _errors;
        this.local_dependancyTrees = _dependancyTrees;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTreesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getErrors() != null)
            this.local_errors = new ArrayOfECLExceptionWrapper( raw.getErrors());
        this.local_dependancyTrees = raw.getDependancyTrees();

    }

    @Override
    public String toString()
    {
        return "WUGetDependancyTreesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "errors = " + local_errors + ", " + "dependancyTrees = " + local_dependancyTrees + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTreesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTreesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTreesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_errors != null)
            raw.setErrors( local_errors.getRaw());
        raw.setDependancyTrees( local_dependancyTrees);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setErrors( ArrayOfECLExceptionWrapper _errors )
    {
        this.local_errors = _errors;
    }
    public ArrayOfECLExceptionWrapper getErrors( )
    {
        return this.local_errors;
    }
    public void setDependancyTrees( DataHandler _dependancyTrees )
    {
        this.local_dependancyTrees = _dependancyTrees;
    }
    public DataHandler getDependancyTrees( )
    {
        return this.local_dependancyTrees;
    }
}