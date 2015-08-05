package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;

import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUDataColumn;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFURecordDefInfo extends DFUDataColumnInfo
{
    /**
     * 
     */
    private static final long       serialVersionUID = 1L;
    private String maxcount=null;
    private String maxlength=null;
    private boolean inline=false;
    private String recordLayoutName=null;

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFURecordDefInfo(DFUDataColumn base)
    {
        super.copy(base);
    }

    public DFURecordDefInfo()
    {
    }

    public DFURecordDefInfo(ArrayList<DFUDataColumnInfo> columns)
    {
        this.getChildColumns().addAll(columns);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\tmaxlength:").append(getMaxlength()).append("\n");
        sb.append("\tmaxcount:").append(getMaxcount()).append("\n");            
        return sb.toString();
    }
    public String getMaxcount()
    {
        return maxcount;
    }

    public void setMaxcount(String maxcount)
    {
        this.maxcount = maxcount;
    }

    public String getMaxlength()
    {
        return maxlength;
    }

    public void setMaxlength(String maxlength)
    {
        this.maxlength = maxlength;
    }

    public String getRecordName()
    {
        return this.getColumnLabel();
    }

    public void setRecordName(String recordName)
    {
        this.setColumnLabel(recordName);
    }

    public boolean isInline()
    {
        return inline;
    }

    public void setInline(boolean inline)
    {
        this.inline = inline;
    }

    public String getRecordLayoutName()
    {
        return recordLayoutName;
    }

    public void setRecordLayoutName(String recordLayoutName)
    {
        this.recordLayoutName = recordLayoutName;
    }

}
