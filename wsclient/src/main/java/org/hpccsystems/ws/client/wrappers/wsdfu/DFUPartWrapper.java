package org.hpccsystems.ws.client.wrappers.wsdfu;

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
 * Class name: DFUPartWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2019-08-20T13:59:09.378Z
 */

public class DFUPartWrapper
{
    protected int local_id;
    protected int local_copy;
    protected String local_ip;
    protected String local_partsize;
    protected long local_partSizeInt64;

    public DFUPartWrapper() {}

    public DFUPartWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart dfupart)
    {
        copy( dfupart );
    }

    public DFUPartWrapper( int _id, int _copy, String _ip, String _partsize, long _partSizeInt64 )
    {
        this.local_id = _id;
        this.local_copy = _copy;
        this.local_ip = _ip;
        this.local_partsize = _partsize;
        this.local_partSizeInt64 = _partSizeInt64;
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart raw )
    {
        if (raw == null)
            return;

        this.local_id = raw.getId();
        this.local_copy = raw.getCopy();
        this.local_ip = raw.getIp();
        this.local_partsize = raw.getPartsize();
        this.local_partSizeInt64 = raw.getPartSizeInt64();
    }

    @Override
    public String toString()
    {
        return "DFUPartWrapper [" + "id = " + local_id + ", " + "copy = " + local_copy + ", " + "ip = " + local_ip + ", " + "partsize = " + local_partsize + ", " + "partSizeInt64 = " + local_partSizeInt64 + "]";
    }

    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart();
        raw.setId( local_id);
        raw.setCopy( local_copy);
        raw.setIp( local_ip);
        raw.setPartsize( local_partsize);
        raw.setPartSizeInt64( local_partSizeInt64);
        return raw;
    }

    public void setId( int _id )
    {
        this.local_id = _id;
    }

    public int getId( )
    {
        return this.local_id;
    }

    public void setCopy( int _copy )
    {
        this.local_copy = _copy;
    }

    public int getCopy( )
    {
        return this.local_copy;
    }

    public void setIp( String _ip )
    {
        this.local_ip = _ip;
    }

    public String getIp( )
    {
        return this.local_ip;
    }

    public void setPartsize( String _partsize )
    {
        this.local_partsize = _partsize;
    }

    public String getPartsize( )
    {
        return this.local_partsize;
    }

    public void setPartSizeInt64( long _partSizeInt64 )
    {
        this.local_partSizeInt64 = _partSizeInt64;
    }

    public long getPartSizeInt64( )
    {
        return this.local_partSizeInt64;
    }
}
