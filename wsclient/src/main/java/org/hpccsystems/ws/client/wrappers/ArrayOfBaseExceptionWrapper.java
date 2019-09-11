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
     * @return the localMessage
     */
    public String getWsClientMessage()
    {
        return wsClientMessage;
    }

    public void setSource( String _source )
    {
        this.source = _source;
    }

    public String getSource( )
    {
        return this.source;
    }

    @Override
    public String getLocalizedMessage()
    {
        String message = super.getLocalizedMessage();
        if (message == null || message.isEmpty())
            message = wsClientMessage + ":" + exceptions.stream().map(p -> p.getMessage()).collect(Collectors.joining(", "));
        return message;
    }

    @Override
    public String getMessage()
    {
        String message = super.getMessage();
        if (message == null || message.isEmpty())
            message = wsClientMessage + ":" + exceptions.stream().map(p -> p.getMessage()).collect(Collectors.joining(", "));
        return message;
    }

    public void setExceptions( List<BaseExceptionWrapper> _exception )
    {
        this.exceptions = _exception;
    }

    public List<BaseExceptionWrapper> getExceptions( )
    {
        return this.exceptions;
    }
}
