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
import org.apache.axis2.databinding.types.NonNegativeInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUResponseNoteWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUResponseNoteWrapper
{
    protected String local_source;
    protected String local_message;
    protected NonNegativeInteger local_errorCode;
    protected String local_severity;
    protected NonNegativeInteger local_cost;
    protected String local_id;

    public WUResponseNoteWrapper() {}

    public WUResponseNoteWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote wuresponsenote)
    {
        copy( wuresponsenote );
    }
    public WUResponseNoteWrapper( String _source, String _message, NonNegativeInteger _errorCode, String _severity, NonNegativeInteger _cost, String _id )
    {
        this.local_source = _source;
        this.local_message = _message;
        this.local_errorCode = _errorCode;
        this.local_severity = _severity;
        this.local_cost = _cost;
        this.local_id = _id;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote raw )
    {
        if (raw == null)
            return;

        this.local_source = raw.getSource();
        this.local_message = raw.getMessage();
        this.local_errorCode = raw.getErrorCode();
        this.local_severity = raw.getSeverity();
        this.local_cost = raw.getCost();
        this.local_id = raw.getId();

    }

    @Override
    public String toString()
    {
        return "WUResponseNoteWrapper [" + "source = " + local_source + ", " + "message = " + local_message + ", " + "errorCode = " + local_errorCode + ", " + "severity = " + local_severity + ", " + "cost = " + local_cost + ", " + "id = " + local_id + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote();
        raw.setSource( local_source);
        raw.setMessage( local_message);
        raw.setErrorCode( local_errorCode);
        raw.setSeverity( local_severity);
        raw.setCost( local_cost);
        raw.setId( local_id);
        return raw;
    }


    public void setSource( String _source )
    {
        this.local_source = _source;
    }
    public String getSource( )
    {
        return this.local_source;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
    public void setErrorCode( NonNegativeInteger _errorCode )
    {
        this.local_errorCode = _errorCode;
    }
    public NonNegativeInteger getErrorCode( )
    {
        return this.local_errorCode;
    }
    public void setSeverity( String _severity )
    {
        this.local_severity = _severity;
    }
    public String getSeverity( )
    {
        return this.local_severity;
    }
    public void setCost( NonNegativeInteger _cost )
    {
        this.local_cost = _cost;
    }
    public NonNegativeInteger getCost( )
    {
        return this.local_cost;
    }
    public void setId( String _id )
    {
        this.local_id = _id;
    }
    public String getId( )
    {
        return this.local_id;
    }
}