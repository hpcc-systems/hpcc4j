package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;

@Deprecated
public class WUInfoResponseWrapper
{
    private WorkunitWrapper             workunit;
    private ArrayOfEspExceptionWrapper exceptions = null;
    private Integer                  autoRefresh;
    private Boolean                  canCompile;
    private String                   thorSlaveIP;
    private String[]                 resultViews;
    private String                   secMethod;

    /**
     * Instantiates a new WU info response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUInfoResponseWrapper(WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews() == null ? new String[0] : resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU info response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews() == null ? new String[0] : resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU info response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews() == null ? new String[0] : resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Instantiates a new WU info response wrapper.
     *
     * @param resp
     *            the resp
     */
    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews() == null ? new String[0] : resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Gets the workunit.
     *
     * @return the workunit
     */
    public WorkunitWrapper getWorkunit()
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
        return "WUInfoResponseWrapper [workunit=" + workunit + ", exceptions=" + exceptions + "]";
    }

    /**
     * Gets the auto refresh.
     *
     * @return the autoRefresh
     */
    public Integer getAutoRefresh()
    {
        return autoRefresh;
    }

    /**
     * Sets the auto refresh.
     *
     * @param autoRefresh
     *            the autoRefresh to set
     */
    public void setAutoRefresh(Integer autoRefresh)
    {
        this.autoRefresh = autoRefresh;
    }

    /**
     * Gets the can compile.
     *
     * @return the canCompile
     */
    public Boolean getCanCompile()
    {
        return canCompile;
    }

    /**
     * Sets the can compile.
     *
     * @param canCompile
     *            the canCompile to set
     */
    public void setCanCompile(Boolean canCompile)
    {
        this.canCompile = canCompile;
    }

    /**
     * Gets the thor slave IP.
     *
     * @return the thorSlaveIP
     */
    public String getThorSlaveIP()
    {
        return thorSlaveIP;
    }

    /**
     * Sets the thor slave IP.
     *
     * @param thorSlaveIP
     *            the thorSlaveIP to set
     */
    public void setThorSlaveIP(String thorSlaveIP)
    {
        this.thorSlaveIP = thorSlaveIP;
    }

    /**
     * Gets the result views.
     *
     * @return the resultViews
     */
    public String[] getResultViews()
    {
        return resultViews;
    }

    /**
     * Sets the result views.
     *
     * @param resultViews
     *            the resultViews to set
     */
    public void setResultViews(String[] resultViews)
    {
        this.resultViews = resultViews;
    }

    /**
     * Gets the sec method.
     *
     * @return the secMethod
     */
    public String getSecMethod()
    {
        return secMethod;
    }

    /**
     * Sets the sec method.
     *
     * @param secMethod
     *            the secMethod to set
     */
    public void setSecMethod(String secMethod)
    {
        this.secMethod = secMethod;
    }
    
    /**
     * Gets the raw array of esp exceptions latest version.
     *
     * @return the raw array of esp exceptions latest version
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException getRaw()
    {
        if (this.exceptions == null || exceptions.getEspExceptions() == null || exceptions.getEspExceptions().size() == 0)
            return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException result = 
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException();

        List<EspExceptionWrapper> espExceptions = exceptions.getEspExceptions();
        for (EspExceptionWrapper espExceptionWrapper : espExceptions)
        {
            EspException espexception = new EspException();

            espexception.setAudience(espExceptionWrapper.getAudience());
            espexception.setMessage(espExceptionWrapper.getMessage());
            espexception.setSource(espExceptionWrapper.getSource());
            espexception.setCode(espExceptionWrapper.getCode());
            
            result.addException(espexception);
        }
        return result;
    }
}
