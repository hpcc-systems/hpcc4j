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
 * Class name: ClusterEndpointWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterEndpoint
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.797Z
 */
public class ClusterEndpointWrapper
{
    protected String local_uRL;
    protected String local_status;
    protected int local_numQueryFileToCopy;

    public ClusterEndpointWrapper() {}

    public ClusterEndpointWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterEndpoint clusterendpoint)
    {
        copy( clusterendpoint );
    }
    public ClusterEndpointWrapper( String _uRL, String _status, int _numQueryFileToCopy )
    {
        this.local_uRL = _uRL;
        this.local_status = _status;
        this.local_numQueryFileToCopy = _numQueryFileToCopy;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterEndpoint raw )
    {
        if (raw == null)
            return;

        this.local_uRL = raw.getURL();
        this.local_status = raw.getStatus();
        this.local_numQueryFileToCopy = raw.getNumQueryFileToCopy();

    }

    @Override
    public String toString()
    {
        return "ClusterEndpointWrapper [" + "uRL = " + local_uRL + ", " + "status = " + local_status + ", " + "numQueryFileToCopy = " + local_numQueryFileToCopy + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterEndpoint getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterEndpoint raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterEndpoint();
        raw.setURL( local_uRL);
        raw.setStatus( local_status);
        raw.setNumQueryFileToCopy( local_numQueryFileToCopy);
        return raw;
    }


    public void setURL( String _uRL )
    {
        this.local_uRL = _uRL;
    }
    public String getURL( )
    {
        return this.local_uRL;
    }
    public void setStatus( String _status )
    {
        this.local_status = _status;
    }
    public String getStatus( )
    {
        return this.local_status;
    }
    public void setNumQueryFileToCopy( int _numQueryFileToCopy )
    {
        this.local_numQueryFileToCopy = _numQueryFileToCopy;
    }
    public int getNumQueryFileToCopy( )
    {
        return this.local_numQueryFileToCopy;
    }
}