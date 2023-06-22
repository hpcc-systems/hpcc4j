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
 * Class name: DFUFileCopyWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileCopyWrapper
{
    protected int local_copyIndex;
    protected int local_locationIndex;
    protected String local_path;

    public DFUFileCopyWrapper() {}

    public DFUFileCopyWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy dfufilecopy)
    {
        copy( dfufilecopy );
    }
    public DFUFileCopyWrapper( int _copyIndex, int _locationIndex, String _path )
    {
        this.local_copyIndex = _copyIndex;
        this.local_locationIndex = _locationIndex;
        this.local_path = _path;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy raw )
    {
        if (raw == null)
            return;

        this.local_copyIndex = raw.getCopyIndex();
        this.local_locationIndex = raw.getLocationIndex();
        this.local_path = raw.getPath();

    }

    @Override
    public String toString()
    {
        return "DFUFileCopyWrapper [" + "copyIndex = " + local_copyIndex + ", " + "locationIndex = " + local_locationIndex + ", " + "path = " + local_path + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy();
        raw.setCopyIndex( local_copyIndex);
        raw.setLocationIndex( local_locationIndex);
        raw.setPath( local_path);
        return raw;
    }


    public void setCopyIndex( int _copyIndex )
    {
        this.local_copyIndex = _copyIndex;
    }
    public int getCopyIndex( )
    {
        return this.local_copyIndex;
    }
    public void setLocationIndex( int _locationIndex )
    {
        this.local_locationIndex = _locationIndex;
    }
    public int getLocationIndex( )
    {
        return this.local_locationIndex;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
}