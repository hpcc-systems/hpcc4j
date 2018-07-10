package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.List;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFUDataColumnInfo
{
    private String                  columnEclType;
    private Integer                 columnID;
    private String                  columnLabel;
    private Integer                 columnRawSize;
    private Integer                 columnSize;
    private String                  columnType;
    private String                  columnValue;
    private Boolean                 isKeyedColumn;
    private Boolean                 isNaturalColumn;
    private Integer                 maxSize;
    private List<DFUDataColumnInfo> childColumns     = null;
    private String                  originalEcl      = null;
    private String                  xpath            = null;
    private String                  xmlDefaultVal    = null;
    private String                  maxcount         = null;
    private String                  maxlength        = null;
    private boolean                 isblob             = false;
    private List<DFUDataColumnAnnotation> annotations = new ArrayList<DFUDataColumnAnnotation>();

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFUDataColumnInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDataColumn base)
    {
        copy(base);
    }

    /**
     * Create a Data Column Info object from another data columninfo object
     * 
     * @param base the DFUDataColumnInfo to copy
     */
    public DFUDataColumnInfo(DFUDataColumnInfo base)
    {
        copy(base);
    }

        
    public DFUDataColumnInfo()
    {
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\tColumnLabel:").append(this.getColumnLabel()).append("\n");
        sb.append("\tColumnEclType:").append(this.getColumnEclType()).append("\n");
        sb.append("\tColumnID:").append(this.getColumnID()).append("\n");
        sb.append("\tColumnRawSize:").append(this.getColumnRawSize()).append("\n");
        sb.append("\tColumnSize:").append(this.getColumnSize()).append("\n");
        sb.append("\tColumnType:").append(this.getColumnType()).append("\n");
        sb.append("\tColumnValue:").append(this.getColumnValue()).append("\n");
        sb.append("\tIsBlob:").append(this.isBlob()).append("\n");
        sb.append("\tIsKeyedColumn:").append(this.getIsKeyedColumn()).append("\n");
        sb.append("\tIsNaturalColumn:").append(this.getIsNaturalColumn()).append("\n");
        sb.append("\tMaxSize:").append(this.getMaxSize()).append("\n");
        sb.append("\tMaxLength:").append(this.getMaxlength()).append("\n");
        sb.append("\tMaxcount:").append(this.getMaxcount()).append("\n");
        sb.append("\txpath:").append(this.getXpath()).append("\n");
        sb.append("\txmldefault:").append(this.getXmlDefaultVal()).append("\n");
        if (this.getAnnotations() != null && this.getAnnotations().size()>0) {
        	sb.append("annotations:");
        	for (DFUDataColumnAnnotation a:this.getAnnotations()) {
        		sb.append(a.toString());
        	}
        }
        for (DFUDataColumnInfo col : this.getChildColumns())
        {
            sb.append("\n\t").append(col.getColumnLabel()).append(":").append(col.toString());
        }
        return sb.toString();
    }

    /**
     * Copy a soap DFU Data Column object into the wrapper
     * 
     * @param base
     */
    protected void copy(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDataColumn base)
    {
        if (base == null)
        {
            return;
        }
        this.setColumnEclType(base.getColumnEclType());
        this.setColumnID(base.getColumnID());
        this.setColumnLabel(base.getColumnLabel());
        this.setColumnRawSize(base.getColumnRawSize());
        this.setColumnSize(base.getColumnSize());
        this.setColumnType(base.getColumnType());
        this.setColumnValue(base.getColumnValue());
        this.setIsKeyedColumn(base.getIsKeyedColumn());
        this.setIsNaturalColumn(base.getIsNaturalColumn());
        this.setMaxSize(base.getMaxSize());
        if (base.getDataColumns() != null) {
            this.childColumns=new ArrayList<DFUDataColumnInfo>();
            for (int i=0; i < base.getDataColumns().length;i++) {
                this.getChildColumns().add(new DFUDataColumnInfo(base.getDataColumns()[i]));
            }
        }
    }

    /**
     * Copy a soap DFU Data Column object into the wrapper
     * 
     * @param base
     */
    protected void copy(DFUDataColumnInfo base)
    {
        if (base == null)
        {
            return;
        }
        this.setColumnEclType(base.getColumnEclType());
        this.setColumnID(base.getColumnID());
        this.setColumnLabel(base.getColumnLabel());
        this.setColumnRawSize(base.getColumnRawSize());
        this.setColumnSize(base.getColumnSize());
        this.setColumnType(base.getColumnType());
        this.setColumnValue(base.getColumnValue());
        this.setIsKeyedColumn(base.getIsKeyedColumn());
        this.setIsNaturalColumn(base.getIsNaturalColumn());
        this.setMaxSize(base.getMaxSize());
        this.setAnnotations(base.getAnnotations());
        this.setBlob(base.isBlob());
        this.setMaxcount(base.getMaxcount());
        this.setMaxlength(base.getMaxlength());
        this.setMaxSize(base.getMaxSize());
        this.setXmlDefaultVal(base.getXmlDefaultVal());
        this.setXpath(base.getXpath());
        if (base.getChildColumns() != null) {
            this.childColumns=new ArrayList<DFUDataColumnInfo>(base.getChildColumns());
        }
    }
    /**
     * @return list of child columns if this column is a dataset type column
     */
    public List<DFUDataColumnInfo> getChildColumns()
    {
        if (childColumns == null)
        {
            childColumns = new ArrayList<DFUDataColumnInfo>();
        }
        return childColumns;
    }

    /**
     * @param childColumns
     *            - List of DFUDataColumnInfo objects
     */
    public void setChildColumns(List<DFUDataColumnInfo> childColumns)
    {
        this.childColumns = childColumns;
    }

    /**
     * @param childColumns
     *            - Array of DFUDataColumn objects
     */
    public void setColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDataColumn[] childColumns)
    {
        if (childColumns == null)
        {
            this.childColumns = null;
            return;
        }
        this.childColumns = new ArrayList<DFUDataColumnInfo>();
        for (int i = 0; i < childColumns.length; i++)
        {
            this.childColumns.add(new DFUDataColumnInfo(childColumns[i]));
        }
    }

    public String getOriginalEcl()
    {
        return originalEcl;
    }

    public void setOriginalEcl(String originalEcl)
    {
        this.originalEcl = originalEcl;
    }

    public String getXpath()
    {
        return xpath;
    }

    public void setXpath(String xpath)
    {
        this.xpath = xpath;
    }

    public String getXmlDefaultVal()
    {
        return xmlDefaultVal;
    }

    public void setXmlDefaultVal(String xmlDefaultVal)
    {
        this.xmlDefaultVal = xmlDefaultVal;
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

    public List<DFUDataColumnAnnotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(final List<DFUDataColumnAnnotation> annotations) {
        this.annotations = annotations;
    }
    
    public boolean isBlob() {
        return isblob;
    }

    public void setBlob(boolean blob) {
        this.isblob = blob;
    }

    /**
     * @return the columnEclType
     */
    public String getColumnEclType() {
        return columnEclType;
    }

    /**
     * @param columnEclType the columnEclType to set
     */
    public void setColumnEclType(String columnEclType) {
        this.columnEclType = columnEclType;
    }

    /**
     * @return the columnID
     */
    public Integer getColumnID() {
        return columnID;
    }

    /**
     * @param columnID the columnID to set
     */
    public void setColumnID(Integer columnID) {
        this.columnID = columnID;
    }

    /**
     * @return the columnLabel
     */
    public String getColumnLabel() {
        return columnLabel;
    }

    /**
     * @param columnLabel the columnLabel to set
     */
    public void setColumnLabel(String columnLabel) {
        this.columnLabel = columnLabel;
    }

    /**
     * @return the columnRawSize
     */
    public Integer getColumnRawSize() {
        return columnRawSize;
    }

    /**
     * @param columnRawSize the columnRawSize to set
     */
    public void setColumnRawSize(Integer columnRawSize) {
        this.columnRawSize = columnRawSize;
    }

    /**
     * @return the columnSize
     */
    public Integer getColumnSize() {
        return columnSize;
    }

    /**
     * @param columnSize the columnSize to set
     */
    public void setColumnSize(Integer columnSize) {
        this.columnSize = columnSize;
    }

    /**
     * @return the columnType
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * @param columnType the columnType to set
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * @return the columnValue
     */
    public String getColumnValue() {
        return columnValue;
    }

    /**
     * @param columnValue the columnValue to set
     */
    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    /**
     * @return the isKeyedColumn
     */
    public Boolean getIsKeyedColumn() {
        return isKeyedColumn;
    }

    /**
     * @param isKeyedColumn the isKeyedColumn to set
     */
    public void setIsKeyedColumn(Boolean isKeyedColumn) {
        this.isKeyedColumn = isKeyedColumn;
    }

    /**
     * @return the isNaturalColumn
     */
    public Boolean getIsNaturalColumn() {
        return isNaturalColumn;
    }

    /**
     * @param isNaturalColumn the isNaturalColumn to set
     */
    public void setIsNaturalColumn(Boolean isNaturalColumn) {
        this.isNaturalColumn = isNaturalColumn;
    }

    /**
     * @return the maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * @param maxSize the maxSize to set
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
}
