package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;

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
 * Class name: DFUXRefBuildResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 */
public class DFUXRefBuildResponseWrapper
{
    protected String local_dFUXRefActionResult;

    public DFUXRefBuildResponseWrapper() {}

    public DFUXRefBuildResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse dfuxrefbuildresponse)
    {
        copy( dfuxrefbuildresponse );
    }
    public DFUXRefBuildResponseWrapper( String _dFUXRefActionResult )
    {
        this.local_dFUXRefActionResult = _dFUXRefActionResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse raw )
    {
        if (raw == null)
            return;

        this.local_dFUXRefActionResult = raw.getDFUXRefActionResult();

    }

    @Override
    public String toString()
    {
        return "DFUXRefBuildResponseWrapper [" + "dFUXRefActionResult = " + local_dFUXRefActionResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse();
        raw.setDFUXRefActionResult( local_dFUXRefActionResult);
        return raw;
    }


    public void setDFUXRefActionResult( String _dFUXRefActionResult )
    {
        this.local_dFUXRefActionResult = _dFUXRefActionResult;
    }
    public String getDFUXRefActionResult( )
    {
        return this.local_dFUXRefActionResult;
    }
}