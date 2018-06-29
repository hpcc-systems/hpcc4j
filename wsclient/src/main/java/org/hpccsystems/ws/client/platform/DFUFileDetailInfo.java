package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.hpccsystems.ws.client.antlr.CaseControlStringStream;
import org.hpccsystems.ws.client.antlr.EclRecordLexer;
import org.hpccsystems.ws.client.antlr.EclRecordParser;
import org.hpccsystems.ws.client.antlr.EclRecordParser.ProgramContext;
import org.hpccsystems.ws.client.antlr.EclRecordReader;
import org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDataColumn;
import org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUFileDetail;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.platform.DFUFilePartsOnClusterInfo;

// This class wraps the generated soap DFUFileDetail, providing additional features not yet available from the base esp
// classes.
/**
 * @author LeedDX
 *
 */
public class DFUFileDetailInfo extends DFUFileDetail
{
    private static final long            serialVersionUID = 1L;

    private ArrayList<DFUDataColumnInfo> columns;
    private String                       firstline        = null;
    private boolean                      hasheader        = false;

    public boolean hasHeader()
    {
        return hasheader;
    }

    public void setHasHeader(boolean hasheader)
    {
        this.hasheader = hasheader;
    }

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFUFileDetailInfo(DFUFileDetail base)
    {
        copy(base);
    }

    /**
     * Create an empty Data Column Info object
     * 
     * @param base
     */
    public DFUFileDetailInfo()
    {
    }

    /**
     * @return the first line of data associated with this file
     */
    public String getFirstline()
    {
        return firstline;
    }

    /**
     * @param firstline
     *            - set the first line of data associated with this file
     */
    public void setFirstline(String firstline)
    {
        this.firstline = firstline;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ActualSize:").append(this.getActualSize()).append("\n");
        sb.append("BrowseData:").append(this.getBrowseData()).append("\n");
        sb.append("Cluster:").append(this.getCluster()).append("\n");
        sb.append("CompressedFileSize:").append(this.getCompressedFileSize()).append("\n");
        sb.append("ContentType:").append(this.getContentType()).append("\n");
        sb.append("CsvEscape:").append(this.getCsvEscape()).append("\n");
        sb.append("CsvQuote:").append(this.getCsvQuote()).append("\n");
        sb.append("CsvSeparate:").append(this.getCsvSeparate()).append("\n");
        sb.append("CsvTerminate:").append(this.getCsvTerminate()).append("\n");
        sb.append("Description:").append(this.getDescription()).append("\n");
        sb.append("DFUFileParts:").append(this.getDFUFileParts()).append("\n");
        sb.append("DFUFilePartsOnClusters:").append(this.getDFUFilePartsOnClusters()).append("\n");
        sb.append("Dir:").append(this.getDir()).append("\n");
        sb.append("Ecl:").append(this.getEcl()).append("\n");
        sb.append("Filename:").append(this.getFilename()).append("\n");
        sb.append("Filesize:").append(this.getFilesize()).append("\n");
        sb.append("FirstLine:").append(this.getFirstline()).append("\n");
        sb.append("Format:").append(this.getFormat()).append("\n");
        sb.append("FromRoxieCluster:").append(this.getFromRoxieCluster()).append("\n");
        sb.append("Graphs:").append(this.getGraphs()).append("\n");
        sb.append("hasHeader:").append(String.valueOf(this.hasHeader())).append("\n");
        sb.append("IsCompressed:").append(String.valueOf(this.getIsCompressed())).append("\n");
        sb.append("IsSuperfile:").append(String.valueOf(this.getIsSuperfile())).append("\n");
        sb.append("JobName:").append(this.getJobName()).append("\n");
        sb.append("MaxRecordSize:").append(this.getMaxRecordSize()).append("\n");
        sb.append("Modified:").append(this.getModified()).append("\n");
        sb.append("Name:").append(this.getName()).append("\n");
        sb.append("NodeGroup:").append(this.getNodeGroup()).append("\n");
        sb.append("NumParts:").append(this.getNumParts()).append("\n");
        sb.append("Owner:").append(this.getOwner()).append("\n");
        sb.append("PathMask:").append(this.getPathMask()).append("\n");
        sb.append("Persistent:").append(this.getPersistent()).append("\n");
        sb.append("Prefix:").append(this.getPrefix()).append("\n");
        sb.append("RecordCount:").append(this.getRecordCount()).append("\n");
        sb.append("RecordSize:").append(this.getRecordSize()).append("\n");
        sb.append("ShowFileContent:").append(this.getShowFileContent()).append("\n");
        sb.append("Stat:").append(this.getStat()).append("\n");
        sb.append("Subfiles:").append(this.getSubfiles()).append("\n");
        sb.append("Superfiles:").append(this.getSuperfiles()).append("\n");
        sb.append("UserPermission:").append(this.getUserPermission()).append("\n");
        sb.append("Wuid:").append(this.getWuid()).append("\n");
        sb.append("ZipFile:").append(this.getZipFile()).append("\n");
        sb.append("Columns:");
        for (DFUDataColumnInfo col : this.getColumns())
        {
            sb.append("    ").append(col.getColumnLabel()).append(":").append(col.toString());
        }
        return sb.toString();
    }

    /**
     * Copy a soap DFUFileDetail object into the wrapper
     * 
     * @param base
     */
    private void copy(DFUFileDetail base)
    {
        if (base == null)
        {
            return;
        }
        this.setActualSize(base.getActualSize());
        this.setBrowseData(base.getBrowseData());
        this.setCluster(base.getCluster());
        this.setCompressedFileSize(base.getCompressedFileSize());
        this.setContentType(base.getContentType());
        this.setCsvEscape(base.getCsvEscape());
        this.setCsvQuote(base.getCsvQuote());
        this.setCsvSeparate(base.getCsvSeparate());
        this.setCsvTerminate(base.getCsvTerminate());
        this.setDescription(base.getDescription());
        this.setDFUFileParts(base.getDFUFileParts());
        this.setDFUFilePartsOnClusters(base.getDFUFilePartsOnClusters());
        this.setDir(base.getDir());
        this.setEcl(base.getEcl());
        this.setFilename(base.getFilename());
        this.setFilesize(base.getFilesize());
        this.setFormat(base.getFormat());
        this.setFromRoxieCluster(base.getFromRoxieCluster());
        this.setGraphs(base.getGraphs());
        this.setIsCompressed(base.getIsCompressed());
        this.setIsSuperfile(base.getIsSuperfile());
        this.setJobName(base.getJobName());
        this.setMaxRecordSize(base.getMaxRecordSize());
        this.setModified(base.getModified());
        this.setName(base.getName());
        this.setNodeGroup(base.getNodeGroup());
        this.setNumParts(base.getNumParts());
        this.setOwner(base.getOwner());
        this.setPathMask(base.getPathMask());
        this.setPersistent(base.getPersistent());
        this.setPrefix(base.getPrefix());
        this.setRecordCount(base.getRecordCount());
        this.setRecordSize(base.getRecordSize());
        this.setShowFileContent(base.getShowFileContent());
        this.setStat(base.getStat());
        this.setSubfiles(base.getSubfiles());
        this.setSuperfiles(base.getSuperfiles());
        this.setUserPermission(base.getUserPermission());
        this.setWuid(base.getWuid());
        this.setZipFile(base.getZipFile());
    }

    /**
     * @return the columns for this logical file as defined in dfuGetMetadata or dfuGetDataColumns
     */
    public ArrayList<DFUDataColumnInfo> getColumns()
    {
        if (columns == null)
        {
            return new ArrayList<DFUDataColumnInfo>();
        }
        return columns;
    }

    /**
     * @param columns
     *            - List of DFUDataColumns
     */
    public void setColumns(List<DFUDataColumn> columns)
    {
        if (columns == null)
        {
            this.columns = null;
            return;
        }
        this.columns = new ArrayList<DFUDataColumnInfo>();
        for (int i = 0; i < columns.size(); i++)
        {
            if (columns.get(i) instanceof DFUDataColumnInfo)
            {
                this.columns.add((DFUDataColumnInfo) columns.get(i));
            }
            else
            {
                this.columns.add(new DFUDataColumnInfo(columns.get(i)));
            }
        }

    }

    /**
     * @param childColumns
     *            - Array of DFUDataColumn objects
     */
    public void setColumns(DFUDataColumn[] childColumns)
    {
        if (childColumns == null)
        {
            columns = null;
            return;
        }
        columns = new ArrayList<DFUDataColumnInfo>();
        for (int i = 0; i < childColumns.length; i++)
        {
            columns.add(new DFUDataColumnInfo(childColumns[i]));
        }
    }

    /**
     * @return the true FileType for this file, based on complex logic.
     */
    public FileFormat getFileType()
    {
        if (this.getName() == null)
        {
            return FileFormat.UNKNOWN;
        }
        // thor files store filetype in content type
        boolean hasxpath = hasEcl() && getEcl().toLowerCase().contains("xpath");

        FileFormat fileFormatFromContent = FileFormat.getFileFormat(getContentType());

        if (fileFormatFromContent == FileFormat.FLAT)
        {

            // CSVs created by HPCC have file data; sprayed csvs return only
            // "line" from this call, and have their fields defined
            // in the record definition in the ecl attribute of dfu file info.
            if (!hasEcl() && this.isSprayedCsv())
            {
                return FileFormat.CSV;
            }

            return FileFormat.FLAT;
        }
        else if (fileFormatFromContent == FileFormat.CSV)
        {
            return FileFormat.CSV;
        }
        else if (fileFormatFromContent == FileFormat.XML)
        {
            return FileFormat.XML;
        }
        else if (fileFormatFromContent == FileFormat.KEYED || isIndex())
        {
            return FileFormat.KEYED;
        }
        else if (fileFormatFromContent == FileFormat.UNKNOWN
                && (getContentType() == null || getContentType().equals("")))
        {
            FileFormat fileFormat = FileFormat.getFileFormat(getFormat());

            if (this.getIsSuperfile() && fileFormat != FileFormat.KEYED && !isIndex())
            {
                return FileFormat.FLAT;
            }

            if (FileFormat.CSV == fileFormat)
            {
                return FileFormat.CSV;
            }
            else if (FileFormat.XML == fileFormat)
            {
                return FileFormat.XML;
            }
            // csvs loaded as ascii get a format of "csv", csvs loaded as
            // utf-8 get a format of "utf8"
            if (getFormat() != null && getFormat().toLowerCase().startsWith("utf"))
            {
                if (hasxpath)
                {
                    return FileFormat.XML;
                }
                else
                {
                    return FileFormat.CSV;
                }
            }
            else if (fileFormat == FileFormat.UNKNOWN && (getFormat() == null || getFormat().equals("")) && hasxpath)
            {
                // some HPCC-generated xml files use neither, check ecl
                // record for xpath
                return FileFormat.XML;
            }
            else if (hasEcl())
            {
                return FileFormat.FLAT;
            }
            else if (!this.isSprayedCsv())
            {
                return FileFormat.FLAT;
            }
            else
            {
                return FileFormat.UNKNOWN;
            }
        }
        else
        {
            return FileFormat.UNKNOWN;
        }
    }

    /**
     * @return true if the DFUDataColumns for this file contain items of type Dataset, false otherwise
     */
    public boolean hasChildDatasets()
    {
        if (this.getColumns().size() == 0)
        {
            return false;
        }
        for (DFUDataColumnInfo info : this.getColumns())
        {
            if ("table".equalsIgnoreCase(info.getColumnEclType()))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the calculated DFUDataColumns based on the columns, deduced file type and ecl
     * @throws Exception
     */
    public EclRecordInfo deduceFields() throws Exception
    {
        FileFormat fileType = getFileType();
        if (fileType == FileFormat.FLAT || fileType == FileFormat.KEYED)
        {
            // until dfu metadata returns child dataset record structure,
            // need to parse it from the ecl if it's available
            if (getEcl() != null && !getEcl().isEmpty())
            {
                EclRecordInfo info = DFUFileDetailInfo.getRecordFromECL(getEcl());
                info = addKeyInfo(info);
                info.setFileType(fileType);
                return info;
            }
            else
            {
                EclRecordInfo ei = new EclRecordInfo(new DFURecordDefInfo(getColumns()));
                ei.setFileType(fileType);
                return ei;
            }
        }
        else if (fileType == FileFormat.XML)
        {
            if (hasEcl())
            {
                EclRecordInfo ei = getRecordFromECL(getEcl());
                ei.setFileType(fileType);
                return ei;

            }
            EclRecordInfo ei = new EclRecordInfo(new DFURecordDefInfo(getColumns()));
            ei.setFileType(fileType);
            return ei;
        }
        else if (fileType == FileFormat.CSV)
        {
            // for csvs generated by thor, return columns retrieved from getDFUMetadata if they exist
            if (!isSprayedCsv())
            {
                EclRecordInfo ei = DFUFileDetailInfo.getRecordFromECL(getEcl());
                ei.setFileType(fileType);
                return ei;
            }
            // for sprayed csvs or csvs with no ecl, try and figure this out from the first line of data
            else if (getFirstline() != null && !getFirstline().isEmpty())
            {
                ArrayList<DFUDataColumnInfo> fields = new ArrayList<DFUDataColumnInfo>();
                String sep = this.getCsvSeparate();
                if (sep.startsWith("\\"))
                {
                    sep = sep.substring(1);
                }
                String[] flds = getFirstline().split(sep);

                for (int i = 0; i < flds.length; i++)
                {
                    DFUDataColumn du = new DFUDataColumn();
                    if (hasHeader() && isFirstRowValidFieldNames())
                    {
                        String fldval = flds[i].trim();
                        if (this.getCsvQuote() != null && !this.getCsvQuote().isEmpty()
                                && fldval.startsWith(this.getCsvQuote()) && fldval.endsWith(this.getCsvQuote()))
                        {
                            fldval = fldval.substring(1, fldval.length() - 1);
                        }
                        du.setColumnLabel(fldval);
                    }
                    else
                    {
                        du.setColumnLabel("Field" + String.valueOf(i + 1));
                    }
                    du.setColumnType("STRING");
                    du.setColumnEclType("STRING");
                    fields.add(new DFUDataColumnInfo(du));
                }
                EclRecordInfo ei = new EclRecordInfo(new DFURecordDefInfo(fields));
                ei.setFileType(fileType);
                return ei;
            }
            else
            {
                EclRecordInfo ei = new EclRecordInfo(new DFURecordDefInfo(getColumns()));
                ei.setFileType(fileType);
                return ei;
            }
        }
        EclRecordInfo ei = new EclRecordInfo(new DFURecordDefInfo(getColumns()));
        ei.setFileType(fileType);
        return ei;
    }

    /**
     * @param eclRecordDefinition
     *            - a RECORD definition, either in RECORD\nSTRING1\nEND; format, or in {STRING1 field} inline format,.
     *            handles xpath recordsets and child datasets
     * @return An EclRecordInfo object holding a collection of the recordsets in the ecl
     * @throws Exception
     */
    public static EclRecordInfo getRecordFromECL(String eclRecordDefinition) throws Exception
    {
        EclRecordInfo info = getRecordEcl(eclRecordDefinition);
        return info;
    }

    /**
     * @return true if this file shows the attributes of having been a sprayed csv , false otherwise
     */
    public boolean isSprayedCsv()
    {
        if (getEcl() != null && !getEcl().isEmpty())
        {
            HashMap<String, DFURecordDefInfo> info = getRecordEcl(getEcl()).getRecordsets();
            if (info.size() == 1)
            {
                DFURecordDefInfo dfu = info.values().iterator().next();
                if (dfu.getChildColumns().size() <= 2 && dfu.getChildColumns().get(0).getColumnLabel().equals("line"))
                {
                    return true;
                }
            }
        }
        else if (this.getColumns() != null && this.getColumns().size() <= 2
                && this.getColumns().get(0).getColumnLabel().equals("line"))
        {
            return true;
        }
        return false;
    }

    /**
     * @return true if getEcl is populated, false otherwise
     */
    public boolean hasEcl()
    {
        return (getEcl() != null && !getEcl().isEmpty());
    }

    /**
     * @return true if the data file is a csv, if the first row of data is populated and if the values in that line,
     *         when split on the defined field separator, are valid ecl field names. Return false otherwise.
     */
    public boolean isFirstRowValidFieldNames()
    {
        if (FileFormat.CSV != getFileType())
        {
            return false;
        }
        if (this.getFirstline() == null || this.getFirstline().isEmpty())
        {
            return false;
        }
        String[] flds = getFirstline().split(this.getCsvSeparate());
        if (!this.isSprayedCsv() && flds.length != getColumns().size())
        {
            return false;
        }
        for (int i = 0; i < flds.length; i++)
        {
            String fldval = flds[i].trim();
            if (this.getCsvQuote() != null && !this.getCsvQuote().isEmpty() && fldval.startsWith(this.getCsvQuote())
                    && fldval.endsWith(this.getCsvQuote()))
            {
                fldval = fldval.substring(1, fldval.length() - 1);
            }
            String fld = fldval.replaceAll("[^A-Za-z0-9_]", "");
            if (!fld.equals(fldval))
            {
                return false;
            }
        }
        return true;
    }

    private EclRecordInfo addKeyInfo(EclRecordInfo input)
    {
        if (this.getColumns() == null)
        {
            return input;
        }
        ArrayList<String> keyed = new ArrayList<String>();
        for (DFUDataColumnInfo d : this.getColumns())
        {
            if (d != null && d.getIsKeyedColumn() != null && d.getIsKeyedColumn())
            {
                keyed.add(d.getColumnLabel());
            }
        }
        ArrayList<String> natural = new ArrayList<String>();
        for (DFUDataColumnInfo d : this.getColumns())
        {
            if (d != null && d.getIsNaturalColumn() != null && d.getIsNaturalColumn())
            {
                natural.add(d.getColumnLabel());
            }
        }
        for (Entry<String, DFURecordDefInfo> val : input.getRecordsets().entrySet())
        {
            if (val.getKey().startsWith(EclRecordInfo.UNNAMED))
            {
                for (DFUDataColumnInfo d : val.getValue().getChildColumns())
                {
                    if (keyed.contains(d.getColumnLabel()))
                    {
                        d.setIsKeyedColumn(true);
                    }
                    if (natural.contains(d.getColumnLabel()))
                    {
                        d.setIsNaturalColumn(true);
                    }
                }
            }
        }
        return input;
    }

    public boolean isIndex()
    {
        if (this.getColumns() == null)
        {
            return false;
        }
        for (DFUDataColumnInfo d : this.getColumns())
        {
            if (d.getIsKeyedColumn())
            {
                return true;
            }
        }
        return false;

    }

    public void setColumns(ArrayList<DFUDataColumnInfo> columns2)
    {
        this.columns = columns2;
    }

    public static EclRecordInfo getRecordEcl(String content)
    {
        if (content == null || content.isEmpty())
        {
            return new EclRecordInfo();
        }
        EclRecordReader cr = new EclRecordReader();
        try
        {
            ANTLRInputStream is = new CaseControlStringStream(content);
            ((CaseControlStringStream) is).toUpperCase = true; // ANTLR TOKENS should be upper cased
            EclRecordLexer dl = new EclRecordLexer(is);
            EclRecordParser dp = new EclRecordParser(new BufferedTokenStream(dl));
            cr.getErrorHandler().attach(dl);
            cr.getErrorHandler().attach(dp);
            cr.setParser(dp);
            ProgramContext pc = dp.program();
            ParseTreeWalker pw = new ParseTreeWalker();
            pw.walk(cr, pc);
        }
        catch (Exception e)
        {
            cr.getErrorHandler().getErrors().add("Error parsing Record:" + e.getMessage());
        }
        if (cr.getEclRecordInfo() != null)
        {
            cr.getEclRecordInfo().setOriginalEcl(content);
        }
        cr.getEclRecordInfo().setParseErrors(cr.getErrorHandler().getErrors());
        return cr.getEclRecordInfo();

    }

    /**
     * Get the by cluster array of file part containers
     *
     * @return an array of file part containers
     */
    public DFUFilePartsOnClusterInfo[] getDFUFilePartsOnClusters()
    {
        org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUFilePartsOnCluster[] clstrs = super.getDFUFilePartsOnClusters();
        DFUFilePartsOnClusterInfo[] w_clstrs = new DFUFilePartsOnClusterInfo[clstrs.length];
        for (int i = 0; i < clstrs.length; i++)
            w_clstrs[i] = new DFUFilePartsOnClusterInfo(clstrs[i]);
        return w_clstrs;
    }
}
