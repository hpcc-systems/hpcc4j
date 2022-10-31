package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: SMCQueueResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.321Z
 */
public class SMCQueueResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected StatusServerInfoWrapper local_statusServerInfo;

    public SMCQueueResponseWrapper() {}

    public SMCQueueResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse smcqueueresponse)
    {
        copy( smcqueueresponse );
    }
    public SMCQueueResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, StatusServerInfoWrapper _statusServerInfo )
    {
        this.local_exceptions = _exceptions;
        this.local_statusServerInfo = _statusServerInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getStatusServerInfo() != null)
            this.local_statusServerInfo = new StatusServerInfoWrapper( raw.getStatusServerInfo());

    }

    @Override
    public String toString()
    {
        return "SMCQueueResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "statusServerInfo = " + local_statusServerInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_statusServerInfo != null)
            raw.setStatusServerInfo( local_statusServerInfo.getRaw());
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
    public void setStatusServerInfo( StatusServerInfoWrapper _statusServerInfo )
    {
        this.local_statusServerInfo = _statusServerInfo;
    }
    public StatusServerInfoWrapper getStatusServerInfo( )
    {
        return this.local_statusServerInfo;
    }
}