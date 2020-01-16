package org.hpccsystems.ws.client.wrappers;

public class EspSoapFaultWrapper extends java.lang.Exception
{
    private static final long serialVersionUID = 1L;
    private String            wsClientMessage;

    /**
     * Instantiates a new esp soap fault wrapper.
     */
    public EspSoapFaultWrapper()
    {
        super("EspSoapFault");
    }

    /**
     * Instantiates a new esp soap fault wrapper.
     *
     * @param s
     *            the s
     */
    public EspSoapFaultWrapper(java.lang.String s)
    {
        super(s);
    }

    /**
     * Instantiates a new esp soap fault wrapper.
     *
     * @param s
     *            the s
     * @param ex
     *            the ex
     */
    public EspSoapFaultWrapper(java.lang.String s, java.lang.Throwable ex)
    {
        super(s, ex);
    }

    /**
     * Instantiates a new esp soap fault wrapper.
     *
     * @param cause
     *            the cause
     */
    public EspSoapFaultWrapper(java.lang.Throwable cause)
    {
        super(cause);
    }

    /**
     * Sets the ws client message.
     *
     * @param msg
     *            the msg
     * @return the esp soap fault wrapper
     */
    public EspSoapFaultWrapper setWsClientMessage(String msg)
    {
        wsClientMessage = msg;
        return this;
    }

    /**
     * Gets the ws client message.
     *
     * @return the ws client message
     */
    public String getWsClientMessage()
    {
        return wsClientMessage;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString()
    {
        String s = super.toString();
        return (wsClientMessage != null) ? (s + ": " + wsClientMessage) : s;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Throwable#getLocalizedMessage()
     */
    @Override
    public String getLocalizedMessage()
    {
        String message = super.getMessage();
        if (message == null || message.isEmpty()) message = wsClientMessage;
        return message;
    }
}
