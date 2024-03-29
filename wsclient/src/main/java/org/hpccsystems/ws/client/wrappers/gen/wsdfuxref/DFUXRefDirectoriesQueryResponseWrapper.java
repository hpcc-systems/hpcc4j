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
 * Class name: DFUXRefDirectoriesQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 */
public class DFUXRefDirectoriesQueryResponseWrapper
{
    protected String local_dFUXRefDirectoriesQueryResult;

    public DFUXRefDirectoriesQueryResponseWrapper() {}

    public DFUXRefDirectoriesQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse dfuxrefdirectoriesqueryresponse)
    {
        copy( dfuxrefdirectoriesqueryresponse );
    }
    public DFUXRefDirectoriesQueryResponseWrapper( String _dFUXRefDirectoriesQueryResult )
    {
        this.local_dFUXRefDirectoriesQueryResult = _dFUXRefDirectoriesQueryResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse raw )
    {
        if (raw == null)
            return;

        this.local_dFUXRefDirectoriesQueryResult = raw.getDFUXRefDirectoriesQueryResult();

    }

    @Override
    public String toString()
    {
        return "DFUXRefDirectoriesQueryResponseWrapper [" + "dFUXRefDirectoriesQueryResult = " + local_dFUXRefDirectoriesQueryResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse();
        raw.setDFUXRefDirectoriesQueryResult( local_dFUXRefDirectoriesQueryResult);
        return raw;
    }


    public void setDFUXRefDirectoriesQueryResult( String _dFUXRefDirectoriesQueryResult )
    {
        this.local_dFUXRefDirectoriesQueryResult = _dFUXRefDirectoriesQueryResult;
    }
    public String getDFUXRefDirectoriesQueryResult( )
    {
        return this.local_dFUXRefDirectoriesQueryResult;
    }
}