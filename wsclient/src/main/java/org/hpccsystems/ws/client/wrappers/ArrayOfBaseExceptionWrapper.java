package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOfBaseExceptionWrapper extends Exception
{
    private static final long serialVersionUID = 1L;
    protected String wsClientMessage;
    protected String source;
    protected List<BaseExceptionWrapper> exceptions = new ArrayList<BaseExceptionWrapper>();

    /**
     * Gets the ws client message.
     *
     * @return the localMessage
     */
    public String getWsClientMessage()
    {
        return wsClientMessage;
    }

    /**
     * Sets the source.
     *
     * @param _source
     *            the new source
     */
    public void setSource( String _source )
    {
        this.source = _source;
    }

    /**
     * Gets the source.
     *
     * @return the source
     */
    public String getSource( )
    {
        return this.source;
    }

    /* (non-Javadoc)
     * @see java.lang.Throwable#getLocalizedMessage()
     */
    @Override
    public String getLocalizedMessage()
    {
        String message = super.getLocalizedMessage();
        if (message == null || message.isEmpty())
            message = wsClientMessage + ":" + exceptions.stream().map(p -> p.getMessage()).collect(Collectors.joining(", "));
        return message;
    }

    /* (non-Javadoc)
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage()
    {
        String message = super.getMessage();
        if (message == null || message.isEmpty())
            message = wsClientMessage + ":" + exceptions.stream().map(p -> p.getMessage()).collect(Collectors.joining(", "));
        return message;
    }

    /**
     * Sets the exceptions.
     *
     * @param _exception
     *            the new exceptions
     */
    public void setExceptions( List<BaseExceptionWrapper> _exception )
    {
        this.exceptions = _exception;
    }

    /**
     * Gets the exceptions.
     *
     * @return the exceptions
     */
    public List<BaseExceptionWrapper> getExceptions( )
    {
        return this.exceptions;
    }
}
