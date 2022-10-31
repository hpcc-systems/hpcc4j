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
 * Class name: WUCompileECLResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECLResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.513Z
 */
public class WUCompileECLResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_complexity;
    protected ArrayOfECLExceptionWrapper local_errors;
    protected Dependencies_type0Wrapper local_dependencies;

    public WUCompileECLResponseWrapper() {}

    public WUCompileECLResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECLResponse wucompileeclresponse)
    {
        copy( wucompileeclresponse );
    }
    public WUCompileECLResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _complexity, ArrayOfECLExceptionWrapper _errors, Dependencies_type0Wrapper _dependencies )
    {
        this.local_exceptions = _exceptions;
        this.local_complexity = _complexity;
        this.local_errors = _errors;
        this.local_dependencies = _dependencies;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECLResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_complexity = raw.getComplexity();
        if (raw.getErrors() != null)
            this.local_errors = new ArrayOfECLExceptionWrapper( raw.getErrors());
        if (raw.getDependencies() != null)
            this.local_dependencies = new Dependencies_type0Wrapper( raw.getDependencies());

    }

    @Override
    public String toString()
    {
        return "WUCompileECLResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "complexity = " + local_complexity + ", " + "errors = " + local_errors + ", " + "dependencies = " + local_dependencies + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECLResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECLResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCompileECLResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setComplexity( local_complexity);
        if (local_errors != null)
            raw.setErrors( local_errors.getRaw());
        if (local_dependencies != null)
            raw.setDependencies( local_dependencies.getRaw());
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
    public void setComplexity( String _complexity )
    {
        this.local_complexity = _complexity;
    }
    public String getComplexity( )
    {
        return this.local_complexity;
    }
    public void setErrors( ArrayOfECLExceptionWrapper _errors )
    {
        this.local_errors = _errors;
    }
    public ArrayOfECLExceptionWrapper getErrors( )
    {
        return this.local_errors;
    }
    public void setDependencies( Dependencies_type0Wrapper _dependencies )
    {
        this.local_dependencies = _dependencies;
    }
    public Dependencies_type0Wrapper getDependencies( )
    {
        return this.local_dependencies;
    }
}