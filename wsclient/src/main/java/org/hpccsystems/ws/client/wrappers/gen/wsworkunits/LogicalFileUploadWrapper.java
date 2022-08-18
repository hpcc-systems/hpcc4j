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
 * Class name: LogicalFileUploadWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.839Z
 */
public class LogicalFileUploadWrapper
{
    protected int local_type;
    protected String local_source;
    protected String local_destination;
    protected String local_eventTag;

    public LogicalFileUploadWrapper() {}

    public LogicalFileUploadWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload logicalfileupload)
    {
        copy( logicalfileupload );
    }
    public LogicalFileUploadWrapper( int _type, String _source, String _destination, String _eventTag )
    {
        this.local_type = _type;
        this.local_source = _source;
        this.local_destination = _destination;
        this.local_eventTag = _eventTag;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();
        this.local_source = raw.getSource();
        this.local_destination = raw.getDestination();
        this.local_eventTag = raw.getEventTag();

    }

    @Override
    public String toString()
    {
        return "LogicalFileUploadWrapper [" + "type = " + local_type + ", " + "source = " + local_source + ", " + "destination = " + local_destination + ", " + "eventTag = " + local_eventTag + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload();
        raw.setType( local_type);
        raw.setSource( local_source);
        raw.setDestination( local_destination);
        raw.setEventTag( local_eventTag);
        return raw;
    }


    public void setType( int _type )
    {
        this.local_type = _type;
    }
    public int getType( )
    {
        return this.local_type;
    }
    public void setSource( String _source )
    {
        this.local_source = _source;
    }
    public String getSource( )
    {
        return this.local_source;
    }
    public void setDestination( String _destination )
    {
        this.local_destination = _destination;
    }
    public String getDestination( )
    {
        return this.local_destination;
    }
    public void setEventTag( String _eventTag )
    {
        this.local_eventTag = _eventTag;
    }
    public String getEventTag( )
    {
        return this.local_eventTag;
    }
}