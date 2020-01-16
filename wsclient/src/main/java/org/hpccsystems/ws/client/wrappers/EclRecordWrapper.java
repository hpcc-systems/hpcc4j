package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFURecordDefWrapper;

public class EclRecordWrapper implements java.io.Serializable
{
    private static final long serialVersionUID = 7430756413782258252L;
    private String            originalEcl;
    private List<String>      parseErrors      = new ArrayList<String>();

    /**
     * Instantiates a new ecl record wrapper.
     */
    public EclRecordWrapper()
    {
    }

    /**
     * Instantiates a new ecl record wrapper.
     *
     * @param recs
     *            the recs
     */
    public EclRecordWrapper(DFURecordDefWrapper recs)
    {
        this.setRecordsets(new HashMap<String, DFURecordDefWrapper>());
        this.getRecordsets().put(EclRecordWrapper.UNNAMED, recs);
    }

    public HashMap<String, DFURecordDefWrapper> recordsets = new HashMap<String, DFURecordDefWrapper>();
    int                                         unnamed    = 0;
    public static String                        UNNAMED    = "unnamed";
    private FileFormat                          fileType   = FileFormat.UNKNOWN;

    /**
     * Gets the recordsets.
     *
     * @return the recordsets
     */
    public HashMap<String, DFURecordDefWrapper> getRecordsets()
    {
        return recordsets;
    }

    /**
     * Sets the recordsets.
     *
     * @param recordsets
     *            the recordsets
     */
    public void setRecordsets(HashMap<String, DFURecordDefWrapper> recordsets)
    {
        this.recordsets = recordsets;
    }

    /**
     * Adds the recordset.
     *
     * @param rec
     *            the rec
     */
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

    /**
     * Gets the original ecl.
     *
     * @return the original ecl
     */
    public String getOriginalEcl()
    {
        return originalEcl;
    }

    /**
     * Sets the original ecl.
     *
     * @param originalEcl
     *            the new original ecl
     */
    public void setOriginalEcl(String originalEcl)
    {
        this.originalEcl = originalEcl;
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
     * @param ft
     *            the new file type
     */
    public void setFileType(FileFormat ft)
    {
        this.fileType = ft;
        if (this.getRecordsets() != null)
        {
            for (DFURecordDefWrapper d : this.getRecordsets().values())
            {
                d.setFileType(ft);
            }
        }
    }

    /**
     * Gets the parses the errors.
     *
     * @return the parseErrors
     */
    public List<String> getParseErrors()
    {
        return parseErrors;
    }

    /**
     * Sets the parses the errors.
     *
     * @param parseErrors
     *            the parseErrors to set
     */
    public void setParseErrors(List<String> parseErrors)
    {
        this.parseErrors = parseErrors;
    }

}
