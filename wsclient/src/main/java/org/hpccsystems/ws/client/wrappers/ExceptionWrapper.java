package org.hpccsystems.ws.client.wrappers;

public class ExceptionWrapper
{
    protected String local_source;
    protected String local_message;

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

}
