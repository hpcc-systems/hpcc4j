package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUPartLocationWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.136Z
 */
public class DFUPartLocationWrapper
{
    protected int local_locationIndex;
    protected String local_host;

    public DFUPartLocationWrapper() {}

    public DFUPartLocationWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation dfupartlocation)
    {
        copy( dfupartlocation );
    }
    public DFUPartLocationWrapper( int _locationIndex, String _host )
    {
        this.local_locationIndex = _locationIndex;
        this.local_host = _host;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation raw )
    {
        if (raw == null)
            return;

        this.local_locationIndex = raw.getLocationIndex();
        this.local_host = raw.getHost();

    }

    @Override
    public String toString()
    {
        return "DFUPartLocationWrapper [" + "locationIndex = " + local_locationIndex + ", " + "host = " + local_host + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation();
        raw.setLocationIndex( local_locationIndex);
        raw.setHost( local_host);
        return raw;
    }


    public void setLocationIndex( int _locationIndex )
    {
        this.local_locationIndex = _locationIndex;
    }
    public int getLocationIndex( )
    {
        return this.local_locationIndex;
    }
    public void setHost( String _host )
    {
        this.local_host = _host;
    }
    public String getHost( )
    {
        return this.local_host;
    }
}