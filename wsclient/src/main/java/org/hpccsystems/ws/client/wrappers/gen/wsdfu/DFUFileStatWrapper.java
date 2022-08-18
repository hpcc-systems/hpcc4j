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
 * Class name: DFUFileStatWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.123Z
 */
public class DFUFileStatWrapper
{
    protected String local_minSkew;
    protected String local_maxSkew;
    protected long local_minSkewInt64;
    protected long local_maxSkewInt64;
    protected long local_minSkewPart;
    protected long local_maxSkewPart;

    public DFUFileStatWrapper() {}

    public DFUFileStatWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat dfufilestat)
    {
        copy( dfufilestat );
    }
    public DFUFileStatWrapper( String _minSkew, String _maxSkew, long _minSkewInt64, long _maxSkewInt64, long _minSkewPart, long _maxSkewPart )
    {
        this.local_minSkew = _minSkew;
        this.local_maxSkew = _maxSkew;
        this.local_minSkewInt64 = _minSkewInt64;
        this.local_maxSkewInt64 = _maxSkewInt64;
        this.local_minSkewPart = _minSkewPart;
        this.local_maxSkewPart = _maxSkewPart;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat raw )
    {
        if (raw == null)
            return;

        this.local_minSkew = raw.getMinSkew();
        this.local_maxSkew = raw.getMaxSkew();
        this.local_minSkewInt64 = raw.getMinSkewInt64();
        this.local_maxSkewInt64 = raw.getMaxSkewInt64();
        this.local_minSkewPart = raw.getMinSkewPart();
        this.local_maxSkewPart = raw.getMaxSkewPart();

    }

    @Override
    public String toString()
    {
        return "DFUFileStatWrapper [" + "minSkew = " + local_minSkew + ", " + "maxSkew = " + local_maxSkew + ", " + "minSkewInt64 = " + local_minSkewInt64 + ", " + "maxSkewInt64 = " + local_maxSkewInt64 + ", " + "minSkewPart = " + local_minSkewPart + ", " + "maxSkewPart = " + local_maxSkewPart + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat();
        raw.setMinSkew( local_minSkew);
        raw.setMaxSkew( local_maxSkew);
        raw.setMinSkewInt64( local_minSkewInt64);
        raw.setMaxSkewInt64( local_maxSkewInt64);
        raw.setMinSkewPart( local_minSkewPart);
        raw.setMaxSkewPart( local_maxSkewPart);
        return raw;
    }


    public void setMinSkew( String _minSkew )
    {
        this.local_minSkew = _minSkew;
    }
    public String getMinSkew( )
    {
        return this.local_minSkew;
    }
    public void setMaxSkew( String _maxSkew )
    {
        this.local_maxSkew = _maxSkew;
    }
    public String getMaxSkew( )
    {
        return this.local_maxSkew;
    }
    public void setMinSkewInt64( long _minSkewInt64 )
    {
        this.local_minSkewInt64 = _minSkewInt64;
    }
    public long getMinSkewInt64( )
    {
        return this.local_minSkewInt64;
    }
    public void setMaxSkewInt64( long _maxSkewInt64 )
    {
        this.local_maxSkewInt64 = _maxSkewInt64;
    }
    public long getMaxSkewInt64( )
    {
        return this.local_maxSkewInt64;
    }
    public void setMinSkewPart( long _minSkewPart )
    {
        this.local_minSkewPart = _minSkewPart;
    }
    public long getMinSkewPart( )
    {
        return this.local_minSkewPart;
    }
    public void setMaxSkewPart( long _maxSkewPart )
    {
        this.local_maxSkewPart = _maxSkewPart;
    }
    public long getMaxSkewPart( )
    {
        return this.local_maxSkewPart;
    }
}