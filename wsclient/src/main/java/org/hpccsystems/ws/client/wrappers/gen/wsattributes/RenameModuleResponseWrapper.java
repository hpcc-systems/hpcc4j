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
 * Class name: RenameModuleResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class RenameModuleResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ECLModuleWrapper local_moduleInfo;

    public RenameModuleResponseWrapper() {}

    public RenameModuleResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse renamemoduleresponse)
    {
        copy( renamemoduleresponse );
    }
    public RenameModuleResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLModuleWrapper _moduleInfo )
    {
        this.local_exceptions = _exceptions;
        this.local_moduleInfo = _moduleInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getModuleInfo() != null)
            this.local_moduleInfo = new ECLModuleWrapper( raw.getModuleInfo());

    }

    @Override
    public String toString()
    {
        return "RenameModuleResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "moduleInfo = " + local_moduleInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_moduleInfo != null)
            raw.setModuleInfo( local_moduleInfo.getRaw());
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
    public void setModuleInfo( ECLModuleWrapper _moduleInfo )
    {
        this.local_moduleInfo = _moduleInfo;
    }
    public ECLModuleWrapper getModuleInfo( )
    {
        return this.local_moduleInfo;
    }
}