package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateResponse;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;

@Deprecated 
public class WUUpdateResponseWrapper
{
    private WorkunitWrapper          workunitwrapper;
    private ArrayOfEspExceptionWrapper exceptions = null;

    /**
     * Instantiates a new WU update response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse resp)
    {
        if (resp == null)
            return;

        workunitwrapper = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }
    
    /**
     * Instantiates a new WU update response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUUpdateResponse resp)
    {
        if (resp == null)
            return;

        workunitwrapper = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU update response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUUpdateResponse resp)
    {
        if (resp == null)
            return;

        workunitwrapper = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU update response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUUpdateResponseWrapper(WUUpdateResponse resp)
    {
        if (resp == null)
            return;

        workunitwrapper = new WorkunitWrapper(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions() != null)
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
        return workunitwrapper;
    }

    /**
     * Sets the workunit.
     *
     * @param workunit
     *            the workunit to set
     */
    public void setWorkunit(WorkunitWrapper workunit)
    {
        this.workunitwrapper = workunit;
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
        return "WUUpdateResponseWrapper [workunit=" + workunitwrapper + ", exceptions=" + exceptions + "]";
    }
    
    /**
     * Gets the raw array of esp exceptions.
     *
     * @return the raw array of esp exceptions
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException getRawArrayOfEspExceptions()
    {
        if (this.exceptions == null || exceptions.getEspExceptions() == null || exceptions.getEspExceptions().size() == 0)
            return null;

        List<EspExceptionWrapper> espExceptions = exceptions.getEspExceptions();
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException();
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException[] raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException[espExceptions.size()];
        for (int i = 0; i < raw.length; i++ )
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException esp = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException();

            esp.setAudience(espExceptions.get(i).getAudience());
            esp.setMessage(espExceptions.get(i).getMessage());
            esp.setSource(espExceptions.get(i).getSource());
            esp.setCode(espExceptions.get(i).getCode());
            raw[i] = esp;
        }
        result.setException(raw);
        return result;
    }
}
