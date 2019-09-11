package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUInfoResponse;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;

public class WUInfoResponseWrapper
{
    private WorkunitWrapper             workunit;
    private ArrayOfEspExceptionWrapper exceptions = null;
    private Integer                  autoRefresh;
    private Boolean                  canCompile;
    private String                   thorSlaveIP;
    private String[]                 resultViews;
    private String                   secMethod;

    public WUInfoResponseWrapper(WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse resp)
    {
        if (resp == null)
            return;

        this.workunit = new WorkunitWrapper(resp.getWorkunit());
        this.autoRefresh = resp.getAutoRefresh();
        this.canCompile = resp.getCanCompile();
        this.thorSlaveIP = resp.getThorSlaveIP();
        this.resultViews = resp.getResultViews().getView();
        this.secMethod = resp.getSecMethod();

        if (resp.getExceptions() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * @return the workunit
     */
    public WorkunitWrapper getWorkunit()
    {
        return workunit;
    }

    /**
     * @param workunit the workunit to set
     */
    public void setWorkunit(WorkunitWrapper workunit)
    {
        this.workunit = workunit;
    }

    /**
     * @return the exceptions
     */
    public ArrayOfEspExceptionWrapper getExceptions()
    {
        return exceptions;
    }

    /**
     * @param exceptions the exceptions to set
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
     * @return the autoRefresh
     */
    public Integer getAutoRefresh()
    {
        return autoRefresh;
    }

    /**
     * @param autoRefresh the autoRefresh to set
     */
    public void setAutoRefresh(Integer autoRefresh)
    {
        this.autoRefresh = autoRefresh;
    }

    /**
     * @return the canCompile
     */
    public Boolean getCanCompile()
    {
        return canCompile;
    }

    /**
     * @param canCompile the canCompile to set
     */
    public void setCanCompile(Boolean canCompile)
    {
        this.canCompile = canCompile;
    }

    /**
     * @return the thorSlaveIP
     */
    public String getThorSlaveIP()
    {
        return thorSlaveIP;
    }

    /**
     * @param thorSlaveIP the thorSlaveIP to set
     */
    public void setThorSlaveIP(String thorSlaveIP)
    {
        this.thorSlaveIP = thorSlaveIP;
    }

    /**
     * @return the resultViews
     */
    public String[] getResultViews()
    {
        return resultViews;
    }

    /**
     * @param resultViews the resultViews to set
     */
    public void setResultViews(String[] resultViews)
    {
        this.resultViews = resultViews;
    }

    /**
     * @return the secMethod
     */
    public String getSecMethod()
    {
        return secMethod;
    }

    /**
     * @param secMethod the secMethod to set
     */
    public void setSecMethod(String secMethod)
    {
        this.secMethod = secMethod;
    }
    
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException getRawArrayOfEspExceptions1_75()
    {
        if (this.exceptions == null || exceptions.getEspExceptions() == null || exceptions.getEspExceptions().size() == 0)
            return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException result = 
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException();

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
