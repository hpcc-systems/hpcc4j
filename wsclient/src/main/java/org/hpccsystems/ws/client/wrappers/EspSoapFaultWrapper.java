package org.hpccsystems.ws.client.wrappers;

public class EspSoapFaultWrapper extends java.lang.Exception
{
    private static final long serialVersionUID = 1L;
    private ExceptionsWrapper faultMessage;

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

    public void setFaultMessage(ExceptionsWrapper msg)
    {
        faultMessage = msg;
    }

    public ExceptionsWrapper getFaultMessage()
    {
        return faultMessage;
    }
}

