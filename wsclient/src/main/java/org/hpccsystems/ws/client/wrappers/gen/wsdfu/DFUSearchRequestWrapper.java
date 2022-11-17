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
 * Class name: DFUSearchRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.313Z
 */
public class DFUSearchRequestWrapper
{
    protected String local_showExample;

    public DFUSearchRequestWrapper() {}

    public DFUSearchRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest dfusearchrequest)
    {
        copy( dfusearchrequest );
    }
    public DFUSearchRequestWrapper( String _showExample )
    {
        this.local_showExample = _showExample;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest raw )
    {
        if (raw == null)
            return;

        this.local_showExample = raw.getShowExample();

    }

    @Override
    public String toString()
    {
        return "DFUSearchRequestWrapper [" + "showExample = " + local_showExample + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest();
        raw.setShowExample( local_showExample);
        return raw;
    }


    public void setShowExample( String _showExample )
    {
        this.local_showExample = _showExample;
    }
    public String getShowExample( )
    {
        return this.local_showExample;
    }
}