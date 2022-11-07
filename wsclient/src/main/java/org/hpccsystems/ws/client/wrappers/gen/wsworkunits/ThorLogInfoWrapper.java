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
 * Class name: ThorLogInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.873Z
 */
public class ThorLogInfoWrapper
{
    protected String local_processName;
    protected String local_clusterGroup;
    protected String local_logDate;
    protected int local_numberSlaves;

    public ThorLogInfoWrapper() {}

    public ThorLogInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo thorloginfo)
    {
        copy( thorloginfo );
    }
    public ThorLogInfoWrapper( String _processName, String _clusterGroup, String _logDate, int _numberSlaves )
    {
        this.local_processName = _processName;
        this.local_clusterGroup = _clusterGroup;
        this.local_logDate = _logDate;
        this.local_numberSlaves = _numberSlaves;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo raw )
    {
        if (raw == null)
            return;

        this.local_processName = raw.getProcessName();
        this.local_clusterGroup = raw.getClusterGroup();
        this.local_logDate = raw.getLogDate();
        this.local_numberSlaves = raw.getNumberSlaves();

    }

    @Override
    public String toString()
    {
        return "ThorLogInfoWrapper [" + "processName = " + local_processName + ", " + "clusterGroup = " + local_clusterGroup + ", " + "logDate = " + local_logDate + ", " + "numberSlaves = " + local_numberSlaves + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo();
        raw.setProcessName( local_processName);
        raw.setClusterGroup( local_clusterGroup);
        raw.setLogDate( local_logDate);
        raw.setNumberSlaves( local_numberSlaves);
        return raw;
    }


    public void setProcessName( String _processName )
    {
        this.local_processName = _processName;
    }
    public String getProcessName( )
    {
        return this.local_processName;
    }
    public void setClusterGroup( String _clusterGroup )
    {
        this.local_clusterGroup = _clusterGroup;
    }
    public String getClusterGroup( )
    {
        return this.local_clusterGroup;
    }
    public void setLogDate( String _logDate )
    {
        this.local_logDate = _logDate;
    }
    public String getLogDate( )
    {
        return this.local_logDate;
    }
    public void setNumberSlaves( int _numberSlaves )
    {
        this.local_numberSlaves = _numberSlaves;
    }
    public int getNumberSlaves( )
    {
        return this.local_numberSlaves;
    }
}