package org.hpccsystems.ws.client.wrappers.wsdfu;

import java.util.ArrayList;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.DFUDataColumn;
import org.hpccsystems.ws.client.utils.FileFormat;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFURecordDefWrapper extends DFUDataColumnWrapper
{
    private static final long serialVersionUID = 1L;
    private boolean           inline           = false;
    private String            recordLayoutName = null;
    private boolean           singlerow        = false;
    private String            maxreclength     = null;
    private FileFormat        fileType         = FileFormat.UNKNOWN;

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn.
     *
     * @param base
     *            the base
     */
    public DFURecordDefWrapper(DFUDataColumn base)
    {
        super.copy(base);
    }

    /**
     * Instantiates a new DFU record def wrapper.
     */
    public DFURecordDefWrapper()
    {
    }

    /**
     * Instantiates a new DFU record def wrapper.
     *
     * @param columns
     *            the columns
     */
    public DFURecordDefWrapper(ArrayList<DFUDataColumnWrapper> columns)
    {
        this.getChildColumns().addAll(columns);
    }

    /**
     * Gets the record name.
     *
     * @return the record name
     */
    public String getRecordName()
    {
        return this.getColumnLabel();
    }

    /**
     * Sets the record name.
     *
     * @param recordName
     *            the new record name
     */
    public void setRecordName(String recordName)
    {
        this.setColumnLabel(recordName);
    }

    /**
     * Checks if is inline.
     *
     * @return true, if is inline
     */
    public boolean isInline()
    {
        return inline;
    }

    /**
     * Sets the inline.
     *
     * @param inline
     *            the new inline
     */
    public void setInline(boolean inline)
    {
        this.inline = inline;
    }

    /**
     * Gets the record layout name.
     *
     * @return the record layout name
     */
    public String getRecordLayoutName()
    {
        return recordLayoutName;
    }

    /**
     * Sets the record layout name.
     *
     * @param recordLayoutName
     *            the new record layout name
     */
    public void setRecordLayoutName(String recordLayoutName)
    {
        this.recordLayoutName = recordLayoutName;
    }

    /**
     * Checks if is single row.
     *
     * @return true, if is single row
     */
    public boolean isSingleRow()
    {
        return singlerow;
    }

    /**
     * Sets the single row.
     *
     * @param singlerow
     *            the new single row
     */
    public void setSingleRow(boolean singlerow)
    {
        this.singlerow = singlerow;
    }

    /**
     * Gets the file type.
     *
     * @return the file type
     */
    public FileFormat getFileType()
    {
        return fileType;
    }

    /**
     * Sets the file type.
     *
     * @param f
     *            the new file type
     */
    public void setFileType(FileFormat f)
    {
        this.fileType = f;
    }

    /**
     * Gets the max rec length.
     *
     * @return the max rec length
     */
    public String getMaxRecLength()
    {
        return maxreclength;
    }

    /**
     * Sets the max rec length.
     *
     * @param maxreclength
     *            the new max rec length
     */
    public void setMaxRecLength(String maxreclength)
    {
        this.maxreclength = maxreclength;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "DFURecordDefInfo [inline=" + inline + ", recordLayoutName=" + recordLayoutName + ", singlerow=" + singlerow + ", maxreclength="
                + maxreclength + ", fileType=" + fileType + "]";
    }

}
