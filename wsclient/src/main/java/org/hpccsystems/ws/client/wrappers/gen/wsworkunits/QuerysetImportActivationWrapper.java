package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: QuerysetImportActivationWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerysetImportActivation
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.852Z
 */
public class QuerysetImportActivationWrapper
{
    protected String local_querysetImportActivation;

    public QuerysetImportActivationWrapper() {}

    public QuerysetImportActivationWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerysetImportActivation querysetimportactivation)
    {
        copy( querysetimportactivation );
    }
    public QuerysetImportActivationWrapper( String _querysetImportActivation )
    {
        this.local_querysetImportActivation = _querysetImportActivation;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerysetImportActivation raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getQuerysetImportActivation();

    }

    @Override
    public String toString()
    {
        return "QuerysetImportActivationWrapper [" + "querysetImportActivation = " + local_querysetImportActivation + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerysetImportActivation getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerysetImportActivation raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setQuerysetImportActivation(querysetImportActivation);
        return raw;
    }


    public void setQuerysetImportActivation( String _querysetImportActivation )
    {
        this.local_querysetImportActivation = _querysetImportActivation;
    }
    public String getQuerysetImportActivation( )
    {
        return this.local_querysetImportActivation;
    }
}