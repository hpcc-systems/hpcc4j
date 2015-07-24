package org.hpccsystems.ws.client.platform;

import java.util.List;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUDataColumn;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFUDataColumnInfo extends DFUDataColumn 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<DFUDataColumnInfo> childColumns=null;

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFUDataColumnInfo(DFUDataColumn base)
    {
        copy(base);
    }

    public DFUDataColumnInfo() {}

       /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ColumnEclType:").append(this.getColumnEclType()).append("\n");
        sb.append("ColumnID:").append(this.getColumnID()).append("\n");
        sb.append("ColumnLabel:").append(this.getColumnLabel()).append("\n");
        sb.append("ColumnRawSize:").append(this.getColumnRawSize()).append("\n");
        sb.append("ColumnSize:").append(this.getColumnSize()).append("\n");
        sb.append("ColumnType:").append(this.getColumnType()).append("\n");
        sb.append("ColumnValue:").append(this.getColumnValue()).append("\n");
        sb.append("IsKeyedColumn:").append(this.getIsKeyedColumn()).append("\n");
        sb.append("IsNaturalColumn:").append(this.getIsNaturalColumn()).append("\n");
        sb.append("MaxSize:").append(this.getMaxSize()).append("\n");
        return sb.toString();
    }

    /**
     * Copy a soap ecl workunit object into the wrapper
     * 
     * @param base
     */
    private void copy(DFUDataColumn base)
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
     }

    public List<DFUDataColumnInfo> getChildColumns()
    {
        return childColumns;
    }

    public void setChildColumns(List<DFUDataColumnInfo> childColumns)
    {
        this.childColumns = childColumns;
    }
    
}
