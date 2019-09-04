package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUInfoResponse;
import org.hpccsystems.ws.client.wrappers.WUExceptionWrapper;

public class WUInfoResponseWrapper
{
    private WorkunitWrapper             workunit;
    private List<WUExceptionWrapper> exceptions = new ArrayList<WUExceptionWrapper>();
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
            EspException[] exceptionsarray = resp.getExceptions().getException();
            for (int i = 0; i < exceptionsarray.length; i++)
            {
                if (resp.getExceptions() != null)
                    exceptions.add(new WUExceptionWrapper(exceptionsarray[i]));
            }
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
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.EspException[] exceptionarray = resp.getExceptions().getException();
            if (exceptionarray != null)
            {
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    exceptions.add(new WUExceptionWrapper(exceptionarray[i]));
                }
            }
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
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.EspException[] exceptionarray = resp.getExceptions().getException();
            if (exceptionarray != null)
            {
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    exceptions.add(new WUExceptionWrapper(exceptionarray[i]));
                }
            }
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
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspException[] exceptionarray = resp.getExceptions().getException();
            if (exceptionarray != null )
            {
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    exceptions.add(new WUExceptionWrapper(exceptionarray[i]));
                }
            }
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
    public List<WUExceptionWrapper> getExceptions()
    {
        return exceptions;
    }

    /**
     * @param exceptions the exceptions to set
     */
    public void setExceptions(List<WUExceptionWrapper> exceptions)
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
        if (this.exceptions.size() == 0)
            return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException result = 
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException();

        for (int i = 0; i < exceptions.size(); i++)
        {
            EspException espexception = new EspException();

            espexception.setAudience(exceptions.get(i).getAudience());
            espexception.setMessage(exceptions.get(i).getMessage());
            espexception.setSource(exceptions.get(i).getSource());
            espexception.setCode(exceptions.get(i).getEspCode());
            
            result.addException(espexception);
        }
        return result;
    }
}
