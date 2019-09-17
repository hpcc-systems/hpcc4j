package org.hpccsystems.ws.client.wrappers;

public class BaseExceptionWrapper
{
    protected String source;
    protected String message;

    public void setSource( String _source )
    {
        source = _source;
    }
    public String getSource( )
    {
        return source;
    }
    public void setMessage( String _message )
    {
        message = _message;
    }
    public String getMessage( )
    {
        return message;
    }
}
