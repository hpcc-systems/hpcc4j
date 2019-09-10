package org.hpccsystems.ws.client.wrappers;

public class EspSoapFaultWrapper extends java.lang.Exception
{
    private static final long serialVersionUID = 1L;
    private String wsClientMessage;

    public EspSoapFaultWrapper()
    {
        super("EspSoapFault");
    }

    public EspSoapFaultWrapper(java.lang.String s)
    {
        super(s);
    }

    public EspSoapFaultWrapper(java.lang.String s, java.lang.Throwable ex)
    {
        super(s, ex);
    }

    public EspSoapFaultWrapper(java.lang.Throwable cause)
    {
        super(cause);
    }

    public EspSoapFaultWrapper setWsClientMessage(String msg)
    {
        wsClientMessage = msg;
        return this;
    }

    public String getWsClientMessage()
    {
        return wsClientMessage;
    }
    
    @Override
    public String toString()
    {
        String s = super.toString();
        return (wsClientMessage != null) ? (s + ": " + wsClientMessage) : s;
    }

    @Override
    public String getLocalizedMessage()
    {
        String message = super.getMessage();
        if (message == null || message.isEmpty())
            message = wsClientMessage;
        return message;
    }
}

