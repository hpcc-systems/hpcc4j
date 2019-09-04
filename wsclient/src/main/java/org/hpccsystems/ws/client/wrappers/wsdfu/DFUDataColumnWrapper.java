package org.hpccsystems.ws.client.wrappers.wsdfu;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUDataColumn;
import org.hpccsystems.ws.client.platform.DFUDataColumnAnnotation;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.

public class DFUDataColumnWrapper// extends DFUDataColumnImpl
{
    private static final long       serialVersionUID = 1L;
    private List<DFUDataColumnWrapper> childColumns     = null;
    private String                  originalEcl      = null;
    private String                  xpath            = null;
    private String                  xmlDefaultVal    = null;
    private String                  maxcount         = null;
    private String                  maxlength        = null;
    private boolean                 isblob             = false;
    private List<DFUDataColumnAnnotation> annotations = new ArrayList<DFUDataColumnAnnotation>();

	private Integer columnID;
    private String columnLabel;
    private String columnType;
    private String columnValue;
    private Integer columnSize;
    private Integer maxSize;
    private String columnEclType;
    private Integer columnRawSize;
    private Boolean isNaturalColumn;
    private Boolean isKeyedColumn;
    private DFUDataColumn[] dataColumns;

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFUDataColumnWrapper(DFUDataColumn base)
    {
        copy(base);
    }

    public DFUDataColumnWrapper()
    {
    }

    public DFUDataColumnWrapper(DFUDataColumnWrapper dfuDataColumnWrapper)
    {
		copy(dfuDataColumnWrapper);
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
        for (DFUDataColumnWrapper col : this.getChildColumns())
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
    protected void copy(DFUDataColumnWrapper dfuDataColumnWrapper)
    {
        if (dfuDataColumnWrapper == null)
            return;

		setAnnotations(dfuDataColumnWrapper.getAnnotations());
		setChildColumns(dfuDataColumnWrapper.getChildColumns());
		setColumnEclType(dfuDataColumnWrapper.getColumnEclType());
		setColumnID(dfuDataColumnWrapper.getColumnID());
		setColumnLabel(dfuDataColumnWrapper.getColumnLabel());
		setColumnRawSize(dfuDataColumnWrapper.getColumnRawSize());
		setColumnSize(dfuDataColumnWrapper.getColumnSize());
		setColumnType(dfuDataColumnWrapper.getColumnType());
		setColumnValue(dfuDataColumnWrapper.getColumnValue());
		setColumnSize(dfuDataColumnWrapper.getColumnSize());
		setIsKeyedColumn(dfuDataColumnWrapper.getIsKeyedColumn());
		setIsNaturalColumn(dfuDataColumnWrapper.getIsNaturalColumn());
		setMaxcount(dfuDataColumnWrapper.getMaxcount());
		setMaxlength(dfuDataColumnWrapper.getMaxlength());
		setMaxSize(dfuDataColumnWrapper.getMaxSize());
		setOriginalEcl(dfuDataColumnWrapper.getOriginalEcl());
		setXmlDefaultVal(dfuDataColumnWrapper.getXmlDefaultVal());
		setXpath(dfuDataColumnWrapper.getXpath());
		setIsblob(dfuDataColumnWrapper.isBlob());
    }

    /**
     * Copy a soap DFU Data Column object into the wrapper
     * 
     * @param base
     */
    protected void copy(DFUDataColumn base)
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
        if (base.getDataColumns() != null)
        {
            this.childColumns = new ArrayList<DFUDataColumnWrapper>();
            DFUDataColumn[] dfuDataColumns = base.getDataColumns().getDFUDataColumn();
            for (int i=0; i < dfuDataColumns.length; i++)
            {
                this.getChildColumns().add(new DFUDataColumnWrapper(dfuDataColumns[i]));
            }
        }
    }

    /**
     * @return list of child columns if this column is a dataset type column
     */
    public List<DFUDataColumnWrapper> getChildColumns()
    {
        if (childColumns == null)
        {
            childColumns = new ArrayList<DFUDataColumnWrapper>();
        }
        return childColumns;
    }

    /**
     * @param childColumns
     *            - List of DFUDataColumnInfo objects
     */
    public void setChildColumns(List<DFUDataColumnWrapper> childColumns)
    {
        this.childColumns = childColumns;
    }

    /**
     * @param childColumns
     *            - Array of DFUDataColumn objects
     */
    public void setColumns(DFUDataColumn[] childColumns)
    {
        if (childColumns == null)
        {
            this.childColumns = null;
            return;
        }
        this.childColumns = new ArrayList<DFUDataColumnWrapper>();
        for (int i = 0; i < childColumns.length; i++)
        {
            this.childColumns.add(new DFUDataColumnWrapper(childColumns[i]));
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

    public List<DFUDataColumnAnnotation> getAnnotations()
    {
        return annotations;
    }

    public void setAnnotations(final List<DFUDataColumnAnnotation> annotations)
    {
        this.annotations = annotations;
    }
    
    public boolean isBlob()
    {
        return isblob;
    }

    public void setBlob(boolean blob)
    {
        this.isblob = blob;
    }

    /**
	 * @return the isblob
	 */
	public boolean isIsblob()
	{
		return isblob;
	}

	/**
	 * @param isblob the isblob to set
	 */
	public void setIsblob(boolean isblob)
	{
		this.isblob = isblob;
	}

	/**
	 * @return the columnID
	 */
	public Integer getColumnID()
	{
		return columnID;
	}

	/**
	 * @param columnID the columnID to set
	 */
	public void setColumnID(Integer columnID)
	{
		this.columnID = columnID;
	}

	/**
	 * @return the columnLabel
	 */
	public String getColumnLabel()
	{
		return columnLabel;
	}

	/**
	 * @param columnLabel the columnLabel to set
	 */
	public void setColumnLabel(String columnLabel)
	{
		this.columnLabel = columnLabel;
	}

	/**
	 * @return the columnType
	 */
	public String getColumnType()
	{
		return columnType;
	}

	/**
	 * @param columnType the columnType to set
	 */
	public void setColumnType(String columnType)
	{
		this.columnType = columnType;
	}

	/**
	 * @return the columnValue
	 */
	public String getColumnValue()
	{
		return columnValue;
	}

	/**
	 * @param columnValue the columnValue to set
	 */
	public void setColumnValue(String columnValue)
	{
		this.columnValue = columnValue;
	}

	/**
	 * @return the columnSize
	 */
	public Integer getColumnSize()
	{
		return columnSize;
	}

	/**
	 * @param columnSize the columnSize to set
	 */
	public void setColumnSize(Integer columnSize)
	{
		this.columnSize = columnSize;
	}

	/**
	 * @return the maxSize
	 */
	public Integer getMaxSize()
	{
		return maxSize;
	}

	/**
	 * @param maxSize the maxSize to set
	 */
	public void setMaxSize(Integer maxSize)
	{
		this.maxSize = maxSize;
	}

	/**
	 * @return the columnEclType
	 */
	public String getColumnEclType()
	{
		return columnEclType;
	}

	/**
	 * @param columnEclType the columnEclType to set
	 */
	public void setColumnEclType(String columnEclType)
	{
		this.columnEclType = columnEclType;
	}

	/**
	 * @return the columnRawSize
	 */
	public Integer getColumnRawSize()
	{
		return columnRawSize;
	}

	/**
	 * @param columnRawSize the columnRawSize to set
	 */
	public void setColumnRawSize(Integer columnRawSize)
	{
		this.columnRawSize = columnRawSize;
	}

	/**
	 * @return the isNaturalColumn
	 */
	public Boolean getIsNaturalColumn()
	{
		return isNaturalColumn;
	}

	/**
	 * @param isNaturalColumn the isNaturalColumn to set
	 */
	public void setIsNaturalColumn(Boolean isNaturalColumn)
	{
		this.isNaturalColumn = isNaturalColumn;
	}

	/**
	 * @return the isKeyedColumn
	 */
	public Boolean getIsKeyedColumn()
	{
		return isKeyedColumn;
	}

	/**
	 * @param isKeyedColumn the isKeyedColumn to set
	 */
	public void setIsKeyedColumn(Boolean isKeyedColumn)
	{
		this.isKeyedColumn = isKeyedColumn;
	}

	/**
	 * @return the dataColumns
	 */
	public DFUDataColumn[] getDataColumns()
	{
		return dataColumns;
	}

	/**
	 * @param dataColumns the dataColumns to set
	 */
	public void setDataColumns(DFUDataColumn[] dataColumns)
	{
		this.dataColumns = dataColumns;
	}
}
