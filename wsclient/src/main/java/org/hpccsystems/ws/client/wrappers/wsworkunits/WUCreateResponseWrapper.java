package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.List;

import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;

public class WUCreateResponseWrapper
{
    private WorkunitWrapper workunit;
    private ArrayOfEspExceptionWrapper exceptions = null;

    /**
     * Instantiates a new WU create response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUCreateResponse resp)
    {
        if (resp == null)
            return;

        workunit = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }
    
    /**
     * Instantiates a new WU create response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUCreateResponse resp)
    {
        if (resp == null)
            return;

        workunit = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU create response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse resp)
    {
        if (resp == null)
            return;

        workunit = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU create response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUCreateResponse resp)
    {
        if (resp == null)
            return;

        workunit = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Gets the workunit wrapper.
     *
     * @return the workunit
     */
    public WorkunitWrapper getWorkunitWrapper()
    {
        return workunit;
    } 
    
    /**
     * Sets the workunit.
     *
     * @param workunit
     *            the workunit to set
     */
    public void setWorkunit(WorkunitWrapper workunit)
    {
        this.workunit = workunit;
    }
    
    /**
     * Gets the exceptions.
     *
     * @return the exceptions
     */
    public ArrayOfEspExceptionWrapper getExceptions()
    {
        return exceptions;
    }
    
    /**
     * Sets the exceptions.
     *
     * @param exceptions
     *            the exceptions to set
     */
    public void setExceptions(ArrayOfEspExceptionWrapper exceptions)
    {
        this.exceptions = exceptions;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "WUCreateResponseWrapper [workunit=" + workunit + ", exceptions=" + exceptions + "]";
    }

    /**
     * Gets the raw array of esp exceptions.
     *
     * @return the raw array of esp exceptions
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException getRawArrayOfEspExceptions()
    {
        if (this.exceptions == null || this.exceptions.getEspExceptions() == null || this.exceptions.getEspExceptions().size() == 0)
            return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException result=
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException();
        List<EspExceptionWrapper> espExceptions = this.exceptions.getEspExceptions();
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException[] raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException[espExceptions.size()];

        for (int i=0; i < espExceptions.size();i++)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException esp = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException();
            esp.setAudience(espExceptions.get(i).getAudience());
            esp.setMessage(espExceptions.get(i).getMessage());
            esp.setSource(espExceptions.get(i).getSource());
            esp.setCode(espExceptions.get(i).getCode());
            raw[i]=esp;
        }
        result.setException(raw);
        return result;
    }
}
