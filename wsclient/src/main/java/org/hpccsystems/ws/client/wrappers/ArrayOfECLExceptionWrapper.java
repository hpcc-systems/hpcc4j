package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;

public class ArrayOfECLExceptionWrapper extends ArrayOfBaseExceptionWrapper
{
    private static final long serialVersionUID = 1L;

    public ArrayOfECLExceptionWrapper() {super();}

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException arrayofeclexception)
    {
        super();
        copy( arrayofeclexception );
    }

    public ArrayOfECLExceptionWrapper(List<BaseExceptionWrapper> _eCLException)
    {
        super();
        this.exceptions = _eCLException;
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException[] raw)
    {
        if (raw!= null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for ( int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException[] raw)
    {
        if (raw!= null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for ( int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException[] raw)
    {
        if (raw!= null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for ( int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException[] raw)
    {
        if (raw!= null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for ( int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    private void copy(ECLException[] raw)
    {
        if (raw!= null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for ( int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException raw )
    {
        if (raw.getECLException() != null)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for ( int i = 0; i < raw.getECLException().length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw.getECLException()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder multimessage = new StringBuilder();
        multimessage.append("ArrayOfECLExceptionWrapper: ");
        multimessage.append(wsClientMessage);
        multimessage.append("\n");
        for (BaseExceptionWrapper eclExceptionWrapper : exceptions)
        {
            multimessage.append("\n\t").append(eclExceptionWrapper.toString());
        }

        return multimessage.toString();
    }
    
    public List<ECLExceptionWrapper> getECLException()
    {
        List<ECLExceptionWrapper> ecls=new ArrayList<ECLExceptionWrapper>();
        for (BaseExceptionWrapper ew:exceptions)
        {
            ecls.add((ECLExceptionWrapper) ew);
        }
        return ecls;
    }
  
    /**
     * @param localMessage the localMessage to set
     */
    public ArrayOfECLExceptionWrapper setWsClientMessage(String localMessage)
    {
        this.wsClientMessage = localMessage;
        return this;
    }

    public ArrayOfECLException getRaw()
    {
        if ( exceptions == null || exceptions.size() == 0 )
            return null;

        ArrayOfECLException eclexceptions = new ArrayOfECLException();
        for (BaseExceptionWrapper ew : exceptions)
        {
            eclexceptions.addECLException(((ECLExceptionWrapper) ew).getRawVersion1_75());
        }

        return eclexceptions;
    }

}
