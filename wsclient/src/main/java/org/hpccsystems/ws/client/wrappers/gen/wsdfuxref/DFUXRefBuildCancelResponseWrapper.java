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
 * Class name: DFUXRefBuildCancelResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-03-24T23:14:30.165Z
 */
public class DFUXRefBuildCancelResponseWrapper
{
    protected String local_dFUXRefBuildCancelResult;

    public DFUXRefBuildCancelResponseWrapper() {}

    public DFUXRefBuildCancelResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse dfuxrefbuildcancelresponse)
    {
        copy( dfuxrefbuildcancelresponse );
    }
    public DFUXRefBuildCancelResponseWrapper( String _dFUXRefBuildCancelResult )
    {
        this.local_dFUXRefBuildCancelResult = _dFUXRefBuildCancelResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse raw )
    {
        if (raw == null)
            return;

        this.local_dFUXRefBuildCancelResult = raw.getDFUXRefBuildCancelResult();

    }

    @Override
    public String toString()
    {
        return "DFUXRefBuildCancelResponseWrapper [" + "dFUXRefBuildCancelResult = " + local_dFUXRefBuildCancelResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse();
        raw.setDFUXRefBuildCancelResult( local_dFUXRefBuildCancelResult);
        return raw;
    }


    public void setDFUXRefBuildCancelResult( String _dFUXRefBuildCancelResult )
    {
        this.local_dFUXRefBuildCancelResult = _dFUXRefBuildCancelResult;
    }
    public String getDFUXRefBuildCancelResult( )
    {
        return this.local_dFUXRefBuildCancelResult;
    }
}