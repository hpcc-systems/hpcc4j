package org.hpccsystems.ws.client.wrappers.wsdfu;

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
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUDataColumn;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileDetail;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.wrappers.EclRecordWrapper;

// This class wraps the generated soap DFUFileDetail, providing additional features not yet available from the base esp
// classes.
public class DFUFileDetailWrapper extends DFUFileDetail
{
    private static final long            serialVersionUID = 1L;

    private ArrayList<DFUDataColumnWrapper> columns;
    private String                       firstline        = null;
    private boolean                      hasheader        = false;

    /**
     * @return the hasheader
     */
    public boolean hasHeader()
    {
        return hasheader;
    }

    /**
     * @param hasheader the hasheader to set
     */
    public void setHasheader(boolean hasheader)
    {
        this.hasheader = hasheader;
    }


    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     *
     * @param base
     */
    public DFUFileDetailWrapper(DFUFileDetail base)
    {
        copy(base);
    }

    /**
     * Create an empty Data Column Info object
     *
     * @param base
     */
    public DFUFileDetailWrapper()
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
        //removed in HPCC 5.0.0
        //if (this.getActualSize() != null)
        //    sb.append("ActualSize:").append(this.getActualSize()).append("\n");
        sb.append("BrowseData:").append(this.getBrowseData()).append("\n");
        //removed in HPCC 5.0.0 ref DFUFilePartsOnCluster
        //if (this.getCluster() != null)
        //    sb.append("Cluster:").append(this.getCluster()).append("\n");
        sb.append("CompressedFileSize:").append(this.getCompressedFileSize()).append("\n");
        if (this.getContentType() != null)
            sb.append("ContentType:").append(this.getContentType()).append("\n");
        if (this.getCsvEscape() != null)
            sb.append("CsvEscape:").append(this.getCsvEscape()).append("\n");
        if (this.getCsvQuote() != null)
            sb.append("CsvQuote:").append(this.getCsvQuote()).append("\n");
        if (this.getCsvSeparate() != null)
            sb.append("CsvSeparate:").append(this.getCsvSeparate()).append("\n");
        if (this.getCsvTerminate() != null)
            sb.append("CsvTerminate:").append(this.getCsvTerminate()).append("\n");
        if (this.getDescription() != null)
            sb.append("Description:").append(this.getDescription()).append("\n");
        //removed in HPCC 5.0.0 ref DFUFilePartsOnCluster
        //if (this.getDFUFileParts() != null)
        //    sb.append("DFUFileParts:").append(this.getDFUFileParts()).append("\n");
        sb.append("DFUFilePartsOnClusters:").append(this.getDFUFilePartsOnClusters()).append("\n");
        if (this.getDir() != null)
            sb.append("Dir:").append(this.getDir()).append("\n");
        if (this.getEcl() != null)
            sb.append("Ecl:").append(this.getEcl()).append("\n");
        if (this.getFilename() != null)
            sb.append("Filename:").append(this.getFilename()).append("\n");
        if (this.getFilesize() != null)
            sb.append("Filesize:").append(this.getFilesize()).append("\n");
        if (this.getFirstline() != null)
            sb.append("FirstLine:").append(this.getFirstline()).append("\n");
        if (this.getFormat() != null)
            sb.append("Format:").append(this.getFormat()).append("\n");
            sb.append("FromRoxieCluster:").append(this.getFromRoxieCluster()).append("\n");
        if (this.getGraphs() != null)
            sb.append("Graphs:").append(this.getGraphs()).append("\n");
        if (String.valueOf(this.hasHeader()) != null)
            sb.append("hasHeader:").append(String.valueOf(this.hasHeader())).append("\n");
        if (String.valueOf(this.getIsCompressed()) != null)
            sb.append("IsCompressed:").append(String.valueOf(this.getIsCompressed())).append("\n");
        if (String.valueOf(this.getIsSuperfile()) != null)
            sb.append("IsSuperfile:").append(String.valueOf(this.getIsSuperfile())).append("\n");
        if (this.getJobName() != null)
            sb.append("JobName:").append(this.getJobName()).append("\n");
        if (this.getMaxRecordSize() != null)
            sb.append("MaxRecordSize:").append(this.getMaxRecordSize()).append("\n");
        if (this.getModified() != null)
            sb.append("Modified:").append(this.getModified()).append("\n");
        if (this.getName() != null)
            sb.append("Name:").append(this.getName()).append("\n");
        if (this.getNodeGroup() != null)
            sb.append("NodeGroup:").append(this.getNodeGroup()).append("\n");
        sb.append("NumParts:").append(this.getNumParts()).append("\n");
        if (this.getOwner() != null)
            sb.append("Owner:").append(this.getOwner()).append("\n");
        if (this.getPathMask() != null)
            sb.append("PathMask:").append(this.getPathMask()).append("\n");
        if (this.getPersistent() != null)
            sb.append("Persistent:").append(this.getPersistent()).append("\n");
        if (this.getPrefix() != null)
            sb.append("Prefix:").append(this.getPrefix()).append("\n");
        if (this.getRecordCount() != null)
            sb.append("RecordCount:").append(this.getRecordCount()).append("\n");
        if (this.getRecordSize() != null)
            sb.append("RecordSize:").append(this.getRecordSize()).append("\n");
        sb.append("ShowFileContent:").append(this.getShowFileContent()).append("\n");
        sb.append("Stat:").append(this.getStat()).append("\n");
        if (this.getSubfiles() != null)
            sb.append("Subfiles:").append(this.getSubfiles()).append("\n");
        sb.append("Superfiles:").append(this.getSuperfiles()).append("\n");
        if (this.getUserPermission() != null)
            sb.append("UserPermission:").append(this.getUserPermission()).append("\n");
        if (this.getWuid() != null)
            sb.append("Wuid:").append(this.getWuid()).append("\n");
        //removed in HPCC 4.2.2 ref  IsCompressed, CompressedFileSize;
        //if (this.getZipFile() != null)
        //    sb.append("ZipFile:").append(this.getZipFile()).append("\n");
        if (this.getColumns() != null)
        {
            sb.append("Columns:");
            for (DFUDataColumnWrapper col : this.getColumns())
            {
                sb.append("    ").append(col.toString());
            }
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

        this.setBinInfo(base.getBinInfo());
        this.setBrowseData(base.getBrowseData());
        this.setCompressedFileSize(base.getCompressedFileSize());
        this.setContentType(base.getContentType());
        this.setCsvEscape(base.getCsvEscape());
        this.setCsvQuote(base.getCsvQuote());
        this.setCsvSeparate(base.getCsvSeparate());
        this.setCsvTerminate(base.getCsvTerminate());
        this.setDescription(base.getDescription());
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
        this.setJsonInfo(base.getJsonInfo());
        this.setMaxRecordSize(base.getMaxRecordSize());
        this.setModified(base.getModified());
        this.setName(base.getName());
        this.setNodeGroup(base.getNodeGroup());
        this.setNumParts(base.getNumParts());
        this.setOwner(base.getOwner());
        this.setPathMask(base.getPathMask());
        this.setPercentCompressed(base.getPercentCompressed());
        this.setPersistent(base.getPersistent());
        this.setPrefix(base.getPrefix());
        this.setProtectList(base.getProtectList());
        this.setRecordCount(base.getRecordCount());
        this.setRecordCountInt64(base.getRecordCountInt64());
        this.setRecordSize(base.getRecordSize());
        this.setRecordSizeInt64(base.getRecordSizeInt64());
        this.setShowFileContent(base.getShowFileContent());
        this.setStat(base.getStat());
        this.setSubfiles(base.getSubfiles());
        this.setSuperfiles(base.getSuperfiles());
        this.setUserPermission(base.getUserPermission());
        this.setWuid(base.getWuid());
        this.setIsCompressed(base.getIsCompressed());
    }

    /**
     * @return the columns for this logical file as defined in dfuGetMetadata or dfuGetDataColumns
     */
    public ArrayList<DFUDataColumnWrapper> getColumns()
    {
        if (columns == null)
        {
            return new ArrayList<DFUDataColumnWrapper>();
        }
        return columns;
    }

    /**
     * @param columns
     *            - List of DFUDataColumns
     */
    public void setColumns(List<DFUDataColumnWrapper> columns)
    {
        if (columns == null)
        {
            this.columns = null;
            return;
        }
        this.columns = new ArrayList<DFUDataColumnWrapper>();
        for (int i = 0; i < columns.size(); i++)
        {
            if (columns.get(i) instanceof DFUDataColumnWrapper)
            {
                this.columns.add((DFUDataColumnWrapper) columns.get(i));
            }
            else
            {
                this.columns.add(new DFUDataColumnWrapper(columns.get(i)));
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
        columns = new ArrayList<DFUDataColumnWrapper>();
        for (int i = 0; i < childColumns.length; i++)
        {
            columns.add(new DFUDataColumnWrapper(childColumns[i]));
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
        for (DFUDataColumnWrapper info : this.getColumns())
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
    public EclRecordWrapper deduceFields() throws Exception
    {
        FileFormat fileType = getFileType();
        if (fileType == FileFormat.FLAT || fileType == FileFormat.KEYED)
        {
            // until dfu metadata returns child dataset record structure,
            // need to parse it from the ecl if it's available
            if (getEcl() != null && !getEcl().isEmpty())
            {
                EclRecordWrapper info = DFUFileDetailWrapper.getRecordFromECL(getEcl());
                info = addKeyInfo(info);
                info.setFileType(fileType);
                return info;
            }
            else
            {
                EclRecordWrapper ei = new EclRecordWrapper(new DFURecordDefWrapper(getColumns()));
                ei.setFileType(fileType);
                return ei;
            }
        }
        else if (fileType == FileFormat.XML)
        {
            if (hasEcl())
            {
                EclRecordWrapper ei = getRecordFromECL(getEcl());
                ei.setFileType(fileType);
                return ei;

            }
            EclRecordWrapper ei = new EclRecordWrapper(new DFURecordDefWrapper(getColumns()));
            ei.setFileType(fileType);
            return ei;
        }
        else if (fileType == FileFormat.CSV)
        {
            // for csvs generated by thor, return columns retrieved from getDFUMetadata if they exist
            if (!isSprayedCsv())
            {
                EclRecordWrapper ei = DFUFileDetailWrapper.getRecordFromECL(getEcl());
                ei.setFileType(fileType);
                return ei;
            }
            // for sprayed csvs or csvs with no ecl, try and figure this out from the first line of data
            else if (getFirstline() != null && !getFirstline().isEmpty())
            {
                ArrayList<DFUDataColumnWrapper> fields = new ArrayList<DFUDataColumnWrapper>();
                String sep = this.getCsvSeparate();
                if (sep.startsWith("\\"))
                {
                    sep = sep.substring(1);
                }
                String[] flds = getFirstline().split(sep);

                for (int i = 0; i < flds.length; i++)
                {
                    DFUDataColumnWrapper du = new DFUDataColumnWrapper();
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
                    fields.add(new DFUDataColumnWrapper(du));
                }
                EclRecordWrapper ei = new EclRecordWrapper(new DFURecordDefWrapper(fields));
                ei.setFileType(fileType);
                return ei;
            }
            else
            {
                EclRecordWrapper ei = new EclRecordWrapper(new DFURecordDefWrapper(getColumns()));
                ei.setFileType(fileType);
                return ei;
            }
        }
        EclRecordWrapper ei = new EclRecordWrapper(new DFURecordDefWrapper(getColumns()));
        ei.setFileType(fileType);
        return ei;
    }

    /**
     * @param eclRecordDefinition
     *            - a RECORD definition, either in RECORD\nSTRING1\nEND; format, or in {STRING1 field} inline format,.
     *            handles xpath recordsets and child datasets
     * @return An EclRecordWrapper object holding a collection of the recordsets in the ecl
     * @throws Exception
     */
    public static EclRecordWrapper getRecordFromECL(String eclRecordDefinition) throws Exception
    {
        EclRecordWrapper info = getRecordEcl(eclRecordDefinition);
        return info;
    }

    /**
     * @return true if this file shows the attributes of having been a sprayed csv , false otherwise
     */
    public boolean isSprayedCsv()
    {
        if (getEcl() != null && !getEcl().isEmpty())
        {
            HashMap<String, DFURecordDefWrapper> info = getRecordEcl(getEcl()).getRecordsets();
            if (info.size() == 1)
            {
                DFURecordDefWrapper dfu = info.values().iterator().next();
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

    private EclRecordWrapper addKeyInfo(EclRecordWrapper input)
    {
        if (this.getColumns() == null)
        {
            return input;
        }
        ArrayList<String> keyed = new ArrayList<String>();
        for (DFUDataColumnWrapper d : this.getColumns())
        {
            if (d != null && d.getIsKeyedColumn() != null && d.getIsKeyedColumn())
            {
                keyed.add(d.getColumnLabel());
            }
        }
        ArrayList<String> natural = new ArrayList<String>();
        for (DFUDataColumnWrapper d : this.getColumns())
        {
            if (d != null && d.getIsNaturalColumn() != null && d.getIsNaturalColumn())
            {
                natural.add(d.getColumnLabel());
            }
        }
        for (Entry<String, DFURecordDefWrapper> val : input.getRecordsets().entrySet())
        {
            if (val.getKey().startsWith(EclRecordWrapper.UNNAMED))
            {
                for (DFUDataColumnWrapper d : val.getValue().getChildColumns())
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
        for (DFUDataColumnWrapper d : this.getColumns())
        {
            if (d.getIsKeyedColumn())
            {
                return true;
            }
        }
        return false;

    }

    public void setColumns(ArrayList<DFUDataColumnWrapper> columns2)
    {
        this.columns = columns2;
    }

    public static EclRecordWrapper getRecordEcl(String content)
    {
        if (content == null || content.isEmpty())
        {
            return new EclRecordWrapper();
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
        if (cr.getEclRecordWrapper() != null)
        {
            cr.getEclRecordWrapper().setOriginalEcl(content);
        }
        cr.getEclRecordWrapper().setParseErrors(cr.getErrorHandler().getErrors());
        return cr.getEclRecordWrapper();
    }

    /**
     * Get the by cluster array of file part containers
     *
     * @return an array of file part containers
     *         //removed in HPCC 5.0.0 ref DFUFilePartsOnCluster
     */
    /*public DFUFilePartsOnClusterInfo[] getDFUFilePartsOnClusters()
    {
        DFUFilePartsOnCluster[] clstrs = super.getDFUFilePartsOnClusters();
        DFUFilePartsOnClusterInfo[] w_clstrs = new DFUFilePartsOnClusterInfo[clstrs.length];
        for (int i = 0; i < clstrs.length; i++)
            w_clstrs[i] = new DFUFilePartsOnClusterInfo(clstrs[i]);
        return w_clstrs;
    }*/
}
