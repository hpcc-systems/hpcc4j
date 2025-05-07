package org.hpccsystems.ws.client.wrappers.gen.wsresources;

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
 * Class name: HPCCQueueTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class HPCCQueueTypeWrapper
{
    protected String local_hPCCQueueType;

    public HPCCQueueTypeWrapper() {}

    public HPCCQueueTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType hpccqueuetype)
    {
        copy( hpccqueuetype );
    }
    public HPCCQueueTypeWrapper( String _hPCCQueueType )
    {
        this.local_hPCCQueueType = _hPCCQueueType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getHPCCQueueType();

    }

    @Override
    public String toString()
    {
        return "HPCCQueueTypeWrapper [" + "hPCCQueueType = " + local_hPCCQueueType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setHPCCQueueType(hPCCQueueType);
        return raw;
    }


    public void setHPCCQueueType( String _hPCCQueueType )
    {
        this.local_hPCCQueueType = _hPCCQueueType;
    }
    public String getHPCCQueueType( )
    {
        return this.local_hPCCQueueType;
    }
}