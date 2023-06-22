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
 * Class name: DFUXRefFoundFilesQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 */
public class DFUXRefFoundFilesQueryResponseWrapper
{
    protected String local_dFUXRefFoundFilesQueryResult;

    public DFUXRefFoundFilesQueryResponseWrapper() {}

    public DFUXRefFoundFilesQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse dfuxreffoundfilesqueryresponse)
    {
        copy( dfuxreffoundfilesqueryresponse );
    }
    public DFUXRefFoundFilesQueryResponseWrapper( String _dFUXRefFoundFilesQueryResult )
    {
        this.local_dFUXRefFoundFilesQueryResult = _dFUXRefFoundFilesQueryResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse raw )
    {
        if (raw == null)
            return;

        this.local_dFUXRefFoundFilesQueryResult = raw.getDFUXRefFoundFilesQueryResult();

    }

    @Override
    public String toString()
    {
        return "DFUXRefFoundFilesQueryResponseWrapper [" + "dFUXRefFoundFilesQueryResult = " + local_dFUXRefFoundFilesQueryResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse();
        raw.setDFUXRefFoundFilesQueryResult( local_dFUXRefFoundFilesQueryResult);
        return raw;
    }


    public void setDFUXRefFoundFilesQueryResult( String _dFUXRefFoundFilesQueryResult )
    {
        this.local_dFUXRefFoundFilesQueryResult = _dFUXRefFoundFilesQueryResult;
    }
    public String getDFUXRefFoundFilesQueryResult( )
    {
        return this.local_dFUXRefFoundFilesQueryResult;
    }
}