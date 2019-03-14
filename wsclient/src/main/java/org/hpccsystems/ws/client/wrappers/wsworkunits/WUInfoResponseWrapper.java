package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.wrappers.WUExceptionWrapper;

public class WUInfoResponseWrapper
{
    private WorkunitInfo workunit;
    private List<WUExceptionWrapper> exceptions = new ArrayList<WUExceptionWrapper>();
    private Integer autoRefresh;
    private Boolean canCompile;
    private String thorSlaveIP;
    private String[] resultViews;
    private String secMethod;

    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUInfoResponse resp) {
        if (resp==null) {
            return;
        }
        this.autoRefresh=resp.getAutoRefresh();
        this.canCompile=resp.getCanCompile();
        this.thorSlaveIP=resp.getThorSlaveIP();
        this.resultViews=resp.getResultViews();
        this.secMethod=resp.getSecMethod();
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }

    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUInfoResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        this.autoRefresh=resp.getAutoRefresh();
        this.canCompile=resp.getCanCompile();
        this.thorSlaveIP=resp.getThorSlaveIP();
        this.resultViews=resp.getResultViews();
        this.secMethod=resp.getSecMethod();
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }

    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUInfoResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        this.autoRefresh=resp.getAutoRefresh();
        this.canCompile=resp.getCanCompile();
        this.thorSlaveIP=resp.getThorSlaveIP();
        this.resultViews=resp.getResultViews();
        this.secMethod=resp.getSecMethod();
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }
    public WUInfoResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUInfoResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        this.autoRefresh=resp.getAutoRefresh();
        this.canCompile=resp.getCanCompile();
        this.thorSlaveIP=resp.getThorSlaveIP();
        this.resultViews=resp.getResultViews();
        this.secMethod=resp.getSecMethod();
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }
    /**
     * @return the workunit
     */
    public WorkunitInfo getWorkunit()
    {
        return workunit;
    }
    /**
     * @param workunit the workunit to set
     */
    public void setWorkunit(WorkunitInfo workunit)
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

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getRawArrayOfEspExceptions()
    {
        if (this.exceptions.size()==0) {
            return null;
        }
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException result=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException();
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EspException[] raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EspException[this.exceptions.size()];
        for (int i=0; i < exceptions.size();i++)
        {
            org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EspException esp=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EspException();
            esp.setAudience(exceptions.get(i).getAudience());
            esp.setMessage(exceptions.get(i).getMessage());
            esp.setSource(exceptions.get(i).getSource());
            esp.setCode(exceptions.get(i).getEspCode());
            raw[i]=esp;
        }
        result.setException(raw);
        return result;
    }
}
