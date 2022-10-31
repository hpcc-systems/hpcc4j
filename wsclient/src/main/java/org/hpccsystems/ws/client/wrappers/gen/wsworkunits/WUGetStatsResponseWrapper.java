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
 * Class name: WUGetStatsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStatsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.539Z
 */
public class WUGetStatsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wUID;
    protected ArrayOfWUStatisticItemWrapper local_statistics;

    public WUGetStatsResponseWrapper() {}

    public WUGetStatsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStatsResponse wugetstatsresponse)
    {
        copy( wugetstatsresponse );
    }
    public WUGetStatsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wUID, ArrayOfWUStatisticItemWrapper _statistics )
    {
        this.local_exceptions = _exceptions;
        this.local_wUID = _wUID;
        this.local_statistics = _statistics;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStatsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wUID = raw.getWUID();
        if (raw.getStatistics() != null)
            this.local_statistics = new ArrayOfWUStatisticItemWrapper( raw.getStatistics());

    }

    @Override
    public String toString()
    {
        return "WUGetStatsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wUID = " + local_wUID + ", " + "statistics = " + local_statistics + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStatsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStatsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStatsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWUID( local_wUID);
        if (local_statistics != null)
            raw.setStatistics( local_statistics.getRaw());
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
    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setStatistics( ArrayOfWUStatisticItemWrapper _statistics )
    {
        this.local_statistics = _statistics;
    }
    public ArrayOfWUStatisticItemWrapper getStatistics( )
    {
        return this.local_statistics;
    }
}