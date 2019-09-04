package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFURecordDefWrapper;

public class EclRecordWrapper implements java.io.Serializable
{
	private static final long serialVersionUID = 7430756413782258252L;
	private String originalEcl;
	private List<String> parseErrors=new ArrayList<String>();
	
    public EclRecordWrapper()
    {
    }

    public EclRecordWrapper(DFURecordDefWrapper recs)
    {
        this.setRecordsets(new HashMap<String, DFURecordDefWrapper>());
        this.getRecordsets().put(EclRecordWrapper.UNNAMED, recs);
    }

    public HashMap<String, DFURecordDefWrapper> recordsets = new HashMap<String, DFURecordDefWrapper>();
    int                                      unnamed    = 0;
    public static String                     UNNAMED    = "unnamed";
    private FileFormat                       fileType   = FileFormat.UNKNOWN;
    public HashMap<String, DFURecordDefWrapper> getRecordsets()
    {
        return recordsets;
    }

    public void setRecordsets(HashMap<String, DFURecordDefWrapper> recordsets)
    {
        this.recordsets = recordsets;
    }

    public void addRecordset(DFURecordDefWrapper rec)
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
            for (DFURecordDefWrapper d:this.getRecordsets().values())
            {
                d.setFileType(ft);
            }
        }
    }

    /**
     * @return the parseErrors
     */
    public List<String> getParseErrors()
    {
        return parseErrors;
    }

    /**
     * @param parseErrors the parseErrors to set
     */
    public void setParseErrors(List<String> parseErrors)
    {
        this.parseErrors = parseErrors;
    }

}
