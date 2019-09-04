package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;

public class ArrayOfECLExceptionWrapper extends Throwable
{
    private static final long serialVersionUID = 1L;
    protected List<ECLExceptionWrapper> eclExceptions = new ArrayList<ECLExceptionWrapper>();
    protected String WsClientMessage;

    public ArrayOfECLExceptionWrapper() {}

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException arrayofeclexception)
    {
        copy( arrayofeclexception );
    }

    public ArrayOfECLExceptionWrapper(List<ECLExceptionWrapper> _eCLException)
    {
        this.eclExceptions = _eCLException;
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException[] eclExceptions)
    {
        copy(eclExceptions);
    }

    private void copy(ECLException[] raw)
    {
        if (raw!= null && raw.length > 0)
        {
            this.eclExceptions = new ArrayList<ECLExceptionWrapper>();
            for ( int i = 0; i < raw.length; i++)
            {
                this.eclExceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException raw )
    {
        if (raw.getECLException() != null)
        {
            this.eclExceptions = new ArrayList<ECLExceptionWrapper>();
            for ( int i = 0; i < raw.getECLException().length; i++)
            {
                this.eclExceptions.add(new ECLExceptionWrapper(raw.getECLException()[i]));
            }
        }
    }


    /**
     * @return the wsClientMessage
     */
    public String getWsClientMessage()
    {
        return WsClientMessage;
    }

    /**
     * @param wsClientMessage the wsClientMessage to set
     */
    public ArrayOfECLExceptionWrapper setWsClientMessage(String wsClientMessage)
    {
        WsClientMessage = wsClientMessage;
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder multimessage = new StringBuilder();
        multimessage.append("ArrayOfECLExceptionWrapper: ");
        multimessage.append(WsClientMessage);
        multimessage.append("\n");
        for (ECLExceptionWrapper eclExceptionWrapper : eclExceptions)
        {
            multimessage.append("\n\t");
            multimessage.append(eclExceptionWrapper.getMessage());
        }

        return multimessage.toString();
    }

    public void setECLException( List<ECLExceptionWrapper> _eCLException )
    {
        this.eclExceptions = _eCLException;
    }

    public List<ECLExceptionWrapper> getECLException( )
    {
        return this.eclExceptions;
    }
}
