package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;

public class ArrayOfECLExceptionWrapper extends Throwable
{
    private static final long serialVersionUID = 1L;
    protected List<ECLExceptionWrapper> eclExceptions = new ArrayList<ECLExceptionWrapper>();
    protected String wsClientMessage;

    public ArrayOfECLExceptionWrapper() { super();}

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException arrayofeclexception)
    {
        super();
        copy( arrayofeclexception );
    }

    public ArrayOfECLExceptionWrapper(List<ECLExceptionWrapper> _eCLException)
    {
        super();
        this.eclExceptions = _eCLException;
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException[] eclExceptions)
    {
        super();
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
        return wsClientMessage;
    }

    /**
     * @param wsClientMessage the wsClientMessage to set
     */
    public ArrayOfECLExceptionWrapper setWsClientMessage(String wsClientMessage)
    {
        this.wsClientMessage = wsClientMessage;
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder multimessage = new StringBuilder();
        multimessage.append("ArrayOfECLExceptionWrapper: ");
        multimessage.append(wsClientMessage);
        multimessage.append("\n");
        for (ECLExceptionWrapper eclExceptionWrapper : eclExceptions)
        {
            multimessage.append("\n\t");
            multimessage.append("code: " + eclExceptionWrapper.getCode() + "\t");
            multimessage.append("scope: " + eclExceptionWrapper.getScope() + "\t");
            multimessage.append("severity: " + eclExceptionWrapper.getSeverity() + "\t");
            multimessage.append("activity: " + eclExceptionWrapper.getActivity() + "\n\t");
            multimessage.append("file: " + eclExceptionWrapper.getFileName() + "\t");
            multimessage.append("line: " + eclExceptionWrapper.getLineNo() + "\t");
            multimessage.append("col: " + eclExceptionWrapper.getColumn() + "\t");
            multimessage.append("Message: " + eclExceptionWrapper.getMessage());
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

    @Override
    public String getLocalizedMessage()
    {
        String message = super.getMessage();
        if (message == null || message.isEmpty())
            message = wsClientMessage;
        return message;
    }
}
