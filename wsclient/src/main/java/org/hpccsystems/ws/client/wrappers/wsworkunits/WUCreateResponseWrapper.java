package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.wrappers.WUExceptionWrapper;

public class WUCreateResponseWrapper
{
    private WorkunitInfo workunit;
    private List<WUExceptionWrapper> exceptions = new ArrayList<WUExceptionWrapper>();

    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }

    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }

    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUCreateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new WUExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }

    public WUCreateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUCreateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
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
        return "WUCreateResponseWrapper [workunit=" + workunit + ", exceptions=" + exceptions + "]";
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
