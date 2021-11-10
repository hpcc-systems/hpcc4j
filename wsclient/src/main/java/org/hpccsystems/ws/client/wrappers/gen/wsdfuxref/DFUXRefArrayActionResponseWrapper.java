package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: DFUXRefArrayActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-03-24T23:14:30.158Z
 */
public class DFUXRefArrayActionResponseWrapper
{
    protected String local_dFUXRefArrayActionResult;

    public DFUXRefArrayActionResponseWrapper() {}

    public DFUXRefArrayActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse dfuxrefarrayactionresponse)
    {
        copy( dfuxrefarrayactionresponse );
    }
    public DFUXRefArrayActionResponseWrapper( String _dFUXRefArrayActionResult )
    {
        this.local_dFUXRefArrayActionResult = _dFUXRefArrayActionResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse raw )
    {
        if (raw == null)
            return;

        this.local_dFUXRefArrayActionResult = raw.getDFUXRefArrayActionResult();

    }

    @Override
    public String toString()
    {
        return "DFUXRefArrayActionResponseWrapper [" + "dFUXRefArrayActionResult = " + local_dFUXRefArrayActionResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse();
        raw.setDFUXRefArrayActionResult( local_dFUXRefArrayActionResult);
        return raw;
    }


    public void setDFUXRefArrayActionResult( String _dFUXRefArrayActionResult )
    {
        this.local_dFUXRefArrayActionResult = _dFUXRefArrayActionResult;
    }
    public String getDFUXRefArrayActionResult( )
    {
        return this.local_dFUXRefArrayActionResult;
    }
}