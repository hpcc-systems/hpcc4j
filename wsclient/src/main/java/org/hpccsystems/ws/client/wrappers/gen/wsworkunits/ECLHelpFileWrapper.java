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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ECLHelpFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.805Z
 */
public class ECLHelpFileWrapper
{
    protected String local_name;
    protected String local_type;
    protected String local_iPAddress;
    protected String local_description;
    protected long local_fileSize;
    protected UnsignedInt local_pID;
    protected UnsignedInt local_minActivityId;
    protected UnsignedInt local_maxActivityId;

    public ECLHelpFileWrapper() {}

    public ECLHelpFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile eclhelpfile)
    {
        copy( eclhelpfile );
    }
    public ECLHelpFileWrapper( String _name, String _type, String _iPAddress, String _description, long _fileSize, UnsignedInt _pID, UnsignedInt _minActivityId, UnsignedInt _maxActivityId )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_iPAddress = _iPAddress;
        this.local_description = _description;
        this.local_fileSize = _fileSize;
        this.local_pID = _pID;
        this.local_minActivityId = _minActivityId;
        this.local_maxActivityId = _maxActivityId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_iPAddress = raw.getIPAddress();
        this.local_description = raw.getDescription();
        this.local_fileSize = raw.getFileSize();
        this.local_pID = raw.getPID();
        this.local_minActivityId = raw.getMinActivityId();
        this.local_maxActivityId = raw.getMaxActivityId();

    }

    @Override
    public String toString()
    {
        return "ECLHelpFileWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "iPAddress = " + local_iPAddress + ", " + "description = " + local_description + ", " + "fileSize = " + local_fileSize + ", " + "pID = " + local_pID + ", " + "minActivityId = " + local_minActivityId + ", " + "maxActivityId = " + local_maxActivityId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setIPAddress( local_iPAddress);
        raw.setDescription( local_description);
        raw.setFileSize( local_fileSize);
        raw.setPID( local_pID);
        raw.setMinActivityId( local_minActivityId);
        raw.setMaxActivityId( local_maxActivityId);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setIPAddress( String _iPAddress )
    {
        this.local_iPAddress = _iPAddress;
    }
    public String getIPAddress( )
    {
        return this.local_iPAddress;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setFileSize( long _fileSize )
    {
        this.local_fileSize = _fileSize;
    }
    public long getFileSize( )
    {
        return this.local_fileSize;
    }
    public void setPID( UnsignedInt _pID )
    {
        this.local_pID = _pID;
    }
    public UnsignedInt getPID( )
    {
        return this.local_pID;
    }
    public void setMinActivityId( UnsignedInt _minActivityId )
    {
        this.local_minActivityId = _minActivityId;
    }
    public UnsignedInt getMinActivityId( )
    {
        return this.local_minActivityId;
    }
    public void setMaxActivityId( UnsignedInt _maxActivityId )
    {
        this.local_maxActivityId = _maxActivityId;
    }
    public UnsignedInt getMaxActivityId( )
    {
        return this.local_maxActivityId;
    }
}