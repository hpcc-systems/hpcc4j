package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;

import org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDataColumn;
import org.hpccsystems.ws.client.utils.FileFormat;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFURecordDefInfo extends DFUDataColumnInfo
{
    /**
     * 
     */
    private static final long       serialVersionUID = 1L;
    private boolean inline=false;
    private String recordLayoutName=null;
    private boolean singlerow=false;
    private String maxreclength=null;
    private FileFormat fileType = FileFormat.UNKNOWN;
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

    public boolean isSingleRow()
    {
        return singlerow;
    }

    public void setSingleRow(boolean singlerow)
    {
        this.singlerow = singlerow;
    }

    public FileFormat getFileType()
    {
        return fileType;
    }
    
    public void setFileType(FileFormat f) {
        this.fileType=f;
    }

    public String getMaxRecLength()
    {
        return maxreclength;
    }

    public void setMaxRecLength(String maxreclength)
    {
        this.maxreclength = maxreclength;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DFURecordDefInfo [inline=" + inline + ", recordLayoutName=" + recordLayoutName + ", singlerow="
                + singlerow + ", maxreclength=" + maxreclength + ", fileType=" + fileType + "]";
    }

}
