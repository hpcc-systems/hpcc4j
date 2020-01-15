package org.hpccsystems.ws.client.wrappers;

public class BaseExceptionWrapper
{
    protected String source;
    protected String message;

    /**
     * Sets the source.
     *
     * @param _source
     *            the new source
     */
    public void setSource(String _source)
    {
        source = _source;
    }

    /**
     * Gets the source.
     *
     * @return the source
     */
    public String getSource()
    {
        return source;
    }

    /**
     * Sets the message.
     *
     * @param _message
     *            the new message
     */
    public void setMessage(String _message)
    {
        message = _message;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }
}
