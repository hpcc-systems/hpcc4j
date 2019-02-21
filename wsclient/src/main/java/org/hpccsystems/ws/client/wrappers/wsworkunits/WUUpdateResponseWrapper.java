package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.wrappers.ECLExceptionWrapper;

public class WUUpdateResponseWrapper
{
    private WorkunitInfo workunit;
    private List<ECLExceptionWrapper> exceptions = new ArrayList<ECLExceptionWrapper>();
    
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new ECLExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }
    
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new ECLExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }
    
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUUpdateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new ECLExceptionWrapper(resp.getExceptions().getException(i)));
            }
        }
    }
    
    public WUUpdateResponseWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUUpdateResponse resp) {
        if (resp==null) {
            return;
        }
        this.workunit=new WorkunitInfo(resp.getWorkunit());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null) {
            for (int i=0; i < resp.getExceptions().getException().length;i++) {
                exceptions.add(new ECLExceptionWrapper(resp.getExceptions().getException(i)));
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
    public List<ECLExceptionWrapper> getExceptions()
    {
        return exceptions;
    }
    /**
     * @param exceptions the exceptions to set
     */
    public void setExceptions(List<ECLExceptionWrapper> exceptions)
    {
        this.exceptions = exceptions;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "WUUpdateResponseWrapper [workunit=" + workunit + ", exceptions=" + exceptions + "]";
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException getRawArrayOfEspExceptions()
    {
        if (this.exceptions.size()==0) {
            return null;
        }
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException result=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException();
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.EspException[] raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.EspException[this.exceptions.size()];
        for (int i=0; i < exceptions.size();i++)
        {
            org.hpccsystems.ws.client.gen.wsworkunits.v1_73.EspException esp=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.EspException();
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
