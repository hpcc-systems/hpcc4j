package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLException;

public class ArrayOfECLExceptionWrapper extends ArrayOfBaseExceptionWrapper
{
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new array of ECL exception wrapper.
     */
    public ArrayOfECLExceptionWrapper()
    {
        super();
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param arrayofeclexception
     *            the arrayofeclexception
     */
    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v3_05.ArrayOfECLException arrayofeclexception)
    {
        super();
        copy(arrayofeclexception);
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param _eCLException
     *            the e CL exception
     */
    public ArrayOfECLExceptionWrapper(List<BaseExceptionWrapper> _eCLException)
    {
        super();
        this.exceptions = _eCLException;
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param eclExceptions
     *            the ecl exceptions
     */
    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param eclExceptions
     *            the ecl exceptions
     */
    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param eclExceptions
     *            the ecl exceptions
     */
    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param eclExceptions
     *            the ecl exceptions
     */
    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    /**
     * Instantiates a new array of ECL exception wrapper.
     *
     * @param eclExceptions
     *            the ecl exceptions
     */
    public ArrayOfECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException[] eclExceptions)
    {
        super();
        copy(eclExceptions);
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException[] raw)
    {
        if (raw != null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException[] raw)
    {
        if (raw != null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException[] raw)
    {
        if (raw != null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException[] raw)
    {
        if (raw != null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(ECLException[] raw)
    {
        if (raw != null && raw.length > 0)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < raw.length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw[i]));
            }
        }
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wssql.v3_05.ArrayOfECLException raw)
    {
        if (raw.getECLException() != null)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < raw.getECLException().length; i++)
            {
                this.exceptions.add(new ECLExceptionWrapper(raw.getECLException()[i]));
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Throwable#toString()
     */
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

    /**
     * Gets the ECL exception.
     *
     * @return the ECL exception
     */
    public List<ECLExceptionWrapper> getECLException()
    {
        List<ECLExceptionWrapper> ecls = new ArrayList<ECLExceptionWrapper>();
        for (BaseExceptionWrapper ew : exceptions)
        {
            ecls.add((ECLExceptionWrapper) ew);
        }
        return ecls;
    }

    /**
     * Sets the ws client message.
     *
     * @param localMessage
     *            the localMessage to set
     * @return the array of ECL exception wrapper
     */
    public ArrayOfECLExceptionWrapper setWsClientMessage(String localMessage)
    {
        this.wsClientMessage = localMessage;
        return this;
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public ArrayOfECLException getRaw()
    {
        if (exceptions == null || exceptions.size() == 0) return null;

        ArrayOfECLException eclexceptions = new ArrayOfECLException();
        for (BaseExceptionWrapper ew : exceptions)
        {
            eclexceptions.addECLException(((ECLExceptionWrapper) ew).getRawVersion1_81());
        }

        return eclexceptions;
    }

}
