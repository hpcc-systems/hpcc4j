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
 * Class name: DFUFilePartWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.882Z
 */
public class DFUFilePartWrapper
{
    protected int local_partIndex;
    protected ArrayOfDFUFileCopyWrapper local_copies;
    protected boolean local_topLevelKey;

    public DFUFilePartWrapper() {}

    public DFUFilePartWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart dfufilepart)
    {
        copy( dfufilepart );
    }
    public DFUFilePartWrapper( int _partIndex, ArrayOfDFUFileCopyWrapper _copies, boolean _topLevelKey )
    {
        this.local_partIndex = _partIndex;
        this.local_copies = _copies;
        this.local_topLevelKey = _topLevelKey;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart raw )
    {
        if (raw == null)
            return;

        this.local_partIndex = raw.getPartIndex();
        if (raw.getCopies() != null)
            this.local_copies = new ArrayOfDFUFileCopyWrapper( raw.getCopies());
        this.local_topLevelKey = raw.getTopLevelKey();

    }

    @Override
    public String toString()
    {
        return "DFUFilePartWrapper [" + "partIndex = " + local_partIndex + ", " + "copies = " + local_copies + ", " + "topLevelKey = " + local_topLevelKey + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart();
        raw.setPartIndex( local_partIndex);
        raw.setCopies( local_copies.getRaw());
        raw.setTopLevelKey( local_topLevelKey);
        return raw;
    }


    public void setPartIndex( int _partIndex )
    {
        this.local_partIndex = _partIndex;
    }
    public int getPartIndex( )
    {
        return this.local_partIndex;
    }
    public void setCopies( ArrayOfDFUFileCopyWrapper _copies )
    {
        this.local_copies = _copies;
    }
    public ArrayOfDFUFileCopyWrapper getCopies( )
    {
        return this.local_copies;
    }
    public void setTopLevelKey( boolean _topLevelKey )
    {
        this.local_topLevelKey = _topLevelKey;
    }
    public boolean getTopLevelKey( )
    {
        return this.local_topLevelKey;
    }
}