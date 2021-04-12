package org.hpccsystems.ws.client.wrappers.wsdfu;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUPart;

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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUPart
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

    /**
     * Instantiates a new DFU part wrapper.
     */
    public DFUPartWrapper() {}

    /**
     * Instantiates a new DFU part wrapper.
     *
     * @param dfupart
     *            the dfupart
     */
    public DFUPartWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUPart dfupart)
    {
        copy( dfupart );
    }

    /**
     * Instantiates a new DFU part wrapper.
     *
     * @param _id
     *            the id
     * @param _copy
     *            the copy
     * @param _ip
     *            the ip
     * @param _partsize
     *            the partsize
     * @param _partSizeInt64
     *            the part size int 64
     */
    public DFUPartWrapper( int _id, int _copy, String _ip, String _partsize, long _partSizeInt64 )
    {
        this.local_id = _id;
        this.local_copy = _copy;
        this.local_ip = _ip;
        this.local_partsize = _partsize;
        this.local_partSizeInt64 = _partSizeInt64;
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(DFUPart raw )
    {
        if (raw == null)
            return;

        this.local_id = raw.getId();
        this.local_copy = raw.getCopy();
        this.local_ip = raw.getIp();
        this.local_partsize = raw.getPartsize();
        this.local_partSizeInt64 = raw.getPartSizeInt64();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "DFUPartWrapper [" + "id = " + local_id + ", " + "copy = " + local_copy + ", " + "ip = " + local_ip + ", " + "partsize = " + local_partsize + ", " + "partSizeInt64 = " + local_partSizeInt64 + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public DFUPart getRaw()
    {
        DFUPart raw = new DFUPart();
        raw.setId( local_id);
        raw.setCopy( local_copy);
        raw.setIp( local_ip);
        raw.setPartsize( local_partsize);
        raw.setPartSizeInt64( local_partSizeInt64);
        return raw;
    }

    /**
     * Sets the id.
     *
     * @param _id
     *            the new id
     */
    public void setId( int _id )
    {
        this.local_id = _id;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId( )
    {
        return this.local_id;
    }

    /**
     * Sets the copy.
     *
     * @param _copy
     *            the new copy
     */
    public void setCopy( int _copy )
    {
        this.local_copy = _copy;
    }

    /**
     * Gets the copy.
     *
     * @return the copy
     */
    public int getCopy( )
    {
        return this.local_copy;
    }

    /**
     * Sets the ip.
     *
     * @param _ip
     *            the new ip
     */
    public void setIp( String _ip )
    {
        this.local_ip = _ip;
    }

    /**
     * Gets the ip.
     *
     * @return the ip
     */
    public String getIp( )
    {
        return this.local_ip;
    }

    /**
     * Sets the partsize.
     *
     * @param _partsize
     *            the new partsize
     */
    public void setPartsize( String _partsize )
    {
        this.local_partsize = _partsize;
    }

    /**
     * Gets the partsize.
     *
     * @return the partsize
     */
    public String getPartsize( )
    {
        return this.local_partsize;
    }

    /**
     * Sets the part size int 64.
     *
     * @param _partSizeInt64
     *            the new part size int 64
     */
    public void setPartSizeInt64( long _partSizeInt64 )
    {
        this.local_partSizeInt64 = _partSizeInt64;
    }

    /**
     * Gets the part size int 64.
     *
     * @return the part size int 64
     */
    public long getPartSizeInt64( )
    {
        return this.local_partSizeInt64;
    }
}
