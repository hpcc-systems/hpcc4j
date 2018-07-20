package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hpccsystems.ws.client.utils.FileFormat;

public class EclRecordInfo implements java.io.Serializable
{
	private static final long serialVersionUID = 7430756413782258252L;
	private String originalEcl;
	private List<String> parseErrors=new ArrayList<String>();
	
    public EclRecordInfo()
    {
    }

    public EclRecordInfo(DFURecordDefInfo recs)
    {
        this.setRecordsets(new HashMap<String, DFURecordDefInfo>());
        this.getRecordsets().put(EclRecordInfo.UNNAMED, recs);
    }

    public HashMap<String, DFURecordDefInfo> recordsets = new HashMap<String, DFURecordDefInfo>();
    int                                      unnamed    = 0;
    public static String                     UNNAMED    = "unnamed";
    private FileFormat                       fileType   = FileFormat.UNKNOWN;
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

    public FileFormat getFileType()
    {
        return fileType;
    }

    public void setFileType(FileFormat ft) 
    {
        this.fileType=ft;
        if (this.getRecordsets() != null) {
            for (DFURecordDefInfo d:this.getRecordsets().values()) {
                d.setFileType(ft);
            }
        }
    }

    /**
     * @return the parseErrors
     */
    public List<String> getParseErrors() {
        return parseErrors;
    }

    /**
     * @param parseErrors the parseErrors to set
     */
    public void setParseErrors(List<String> parseErrors) {
        this.parseErrors = parseErrors;
    }

}
