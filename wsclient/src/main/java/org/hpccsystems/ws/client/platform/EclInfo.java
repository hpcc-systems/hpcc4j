package org.hpccsystems.ws.client.platform;

import java.util.HashMap;

public class EclInfo
{
    private String originalEcl;

    public EclInfo()
    {
    }

    public EclInfo(DFURecordDefInfo recs)
    {
        this.setRecordsets(new HashMap<String, DFURecordDefInfo>());
        this.getRecordsets().put(EclInfo.UNNAMED, recs);
    }

    public HashMap<String, DFURecordDefInfo> recordsets = new HashMap<String, DFURecordDefInfo>();
    int                                      unnamed    = 0;
    public static String                     UNNAMED    = "unnamed";

    public HashMap<String, DFURecordDefInfo> getRecordsets()
    {
        return recordsets;
    }

    public void setRecordsets(HashMap<String, DFURecordDefInfo> recordsets)
    {
        this.recordsets = recordsets;
    }

    public void addRecordset(DFURecordDefInfo rec)
    {
        String name = rec.getRecordName();
        if (name == null)
        {
            name = UNNAMED + String.valueOf(unnamed);
            unnamed++;
        }
        this.recordsets.put(name, rec);
    }

    public String getOriginalEcl()
    {
        return originalEcl;
    }

    public void setOriginalEcl(String originalEcl)
    {
        this.originalEcl = originalEcl;
    }

}
