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
 * Class name: WUMultiQuerySetDetailsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerySetDetailsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.944Z
 */
public class WUMultiQuerySetDetailsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_clusterName;
    protected ArrayOfWUQuerySetDetailWrapper local_querysets;

    public WUMultiQuerySetDetailsResponseWrapper() {}

    public WUMultiQuerySetDetailsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerySetDetailsResponse wumultiquerysetdetailsresponse)
    {
        copy( wumultiquerysetdetailsresponse );
    }
    public WUMultiQuerySetDetailsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _clusterName, ArrayOfWUQuerySetDetailWrapper _querysets )
    {
        this.local_exceptions = _exceptions;
        this.local_clusterName = _clusterName;
        this.local_querysets = _querysets;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerySetDetailsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_clusterName = raw.getClusterName();
        if (raw.getQuerysets() != null)
            this.local_querysets = new ArrayOfWUQuerySetDetailWrapper( raw.getQuerysets());

    }

    @Override
    public String toString()
    {
        return "WUMultiQuerySetDetailsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "clusterName = " + local_clusterName + ", " + "querysets = " + local_querysets + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerySetDetailsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerySetDetailsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerySetDetailsResponse();
        raw.setClusterName( local_clusterName);
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
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setQuerysets( ArrayOfWUQuerySetDetailWrapper _querysets )
    {
        this.local_querysets = _querysets;
    }
    public ArrayOfWUQuerySetDetailWrapper getQuerysets( )
    {
        return this.local_querysets;
    }
}