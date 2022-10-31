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
 * Class name: DFUFileAccessRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.867Z
 */
public class DFUFileAccessRequestWrapper
{
    protected DFUFileAccessRequestBaseWrapper local_requestBase;

    public DFUFileAccessRequestWrapper() {}

    public DFUFileAccessRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest dfufileaccessrequest)
    {
        copy( dfufileaccessrequest );
    }
    public DFUFileAccessRequestWrapper( DFUFileAccessRequestBaseWrapper _requestBase )
    {
        this.local_requestBase = _requestBase;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getRequestBase() != null)
            this.local_requestBase = new DFUFileAccessRequestBaseWrapper( raw.getRequestBase());

    }

    @Override
    public String toString()
    {
        return "DFUFileAccessRequestWrapper [" + "requestBase = " + local_requestBase + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest();
        raw.setRequestBase( local_requestBase.getRaw());
        return raw;
    }


    public void setRequestBase( DFUFileAccessRequestBaseWrapper _requestBase )
    {
        this.local_requestBase = _requestBase;
    }
    public DFUFileAccessRequestBaseWrapper getRequestBase( )
    {
        return this.local_requestBase;
    }
}