package org.hpccsystems.commons.errors;

/**
 * Contains an error message together with (potentially) quite a lot of meta data about it.
 * <p>
 * The HpccError is part generic (errorCode, errorType) and part entwined with default parsing of errors as they are
 * presented by ECL
 * </p>
 * <p>
 * At error creation time it can (and should) be treated as a bag of data. At use time there are various formatting
 * options embedded within the class.
 * </p>
 */
public class HpccError
{
    private final IErrorCode     errorCode;
    private IErrorType           errorType;
    private final HpccErrorLevel errorLevel;
    private final String         errorString;
    private String               additionalInfo;
    private Integer              linenum     = 0;
    private Integer              colnum      = 0;
    private String               filename;
    private String               sourceID;
    private IErrorSource         errorSource = null;
    private Exception            exception;

    /**
     * <p>Constructor for HpccError.</p>
     *
     * @param errlevel
     *            - the Error Level of the error
     * @param errType
     *            - the error type of the error
     * @param constraintViolated
     *            - the error code
     * @param errorString
     *            - error message
     */
    public HpccError(HpccErrorLevel errlevel, IErrorType errType, IErrorCode constraintViolated, String errorString)
    {
        this.errorLevel = errlevel;
        this.errorType = errType;
        this.errorCode = constraintViolated;
        this.errorString = errorString;
    }

    /**
     * <p>Constructor for HpccError.</p>
     *
     * @param errlevel
     *            - error level of the error (fatal, error, warning, info)
     * @param errType
     *            - error type
     * @param constraintViolated
     *            - error code
     * @param errorString
     *            - error message
     * @param ex
     *            - original exception thrown
     */
    public HpccError(HpccErrorLevel errlevel, IErrorType errType, IErrorCode constraintViolated, String errorString,
            Exception ex)
    {
        this.errorLevel = errlevel;
        this.errorType = errType;
        this.errorCode = constraintViolated;
        this.errorString = errorString;
        this.exception = ex;
    }

    /**
     * <p>Constructor for HpccError.</p>
     *
     * @param errlevel
     *            The Error Level of the error (FATAL,ERROR,WARNING,INFO)
     * @param errType
     *            The Type of error (SYSTEM,VALIDATE,etc)
     * @param errCode
     *            The ErrorCode of the Error
     * @param errorString
     *            The Error Message
     * @param additional
     *            any additional info
     * @param lineNum
     *            the line the error occurred on
     * @param colNum
     *            the column the error occurred at
     * @param filename
     *            the filename the error occurred in
     */
    public HpccError(HpccErrorLevel errlevel, IErrorType errType, IErrorCode errCode, String errorString,
            String additional, Integer lineNum, Integer colNum, String filename)
    {
        this.errorLevel = errlevel;
        this.errorType = errType;
        this.errorCode = errCode;
        this.errorString = errorString;
        this.additionalInfo = additional;
        colnum = colNum;
        linenum = lineNum;
        this.filename = filename;
    }

    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[HpccError errorType=").append(String.valueOf(errorType)).append(",\n");
        sb.append("errorLevel=").append(String.valueOf(errorLevel)).append(",\n");
        sb.append("errorCode=").append(String.valueOf(errorCode)).append("(")
                .append(String.valueOf(errorCode.getNumVal())).append("),\n");
        sb.append("errorSource=").append(String.valueOf(errorSource)).append(",\n");
        sb.append("sourceID=").append(String.valueOf(sourceID)).append(",\n");
        sb.append("fileName=").append(String.valueOf(filename)).append(",\n");
        sb.append("lineNum=").append(String.valueOf(linenum)).append(",\n");
        sb.append("colNum=").append(String.valueOf(colnum)).append(",\n");
        sb.append("message=\"").append(String.valueOf(errorString)).append("\",\n");
        sb.append("additional=\"").append(String.valueOf(additionalInfo)).append("\"]\n");
        return sb.toString();
    }

    /**
     * <p>toEclIdeString.</p>
     *
     * @return the Error in ECL IDE Error String format expected by ECL IDE filename(linenum,colnum):ErrorLevel
     *         ErrorCode.getNumVal():Error String
     */
    public String toEclIdeString()
    {
        StringBuilder sb = new StringBuilder();
        String fname = getFilename();
        if (fname == null)
        {
            fname = "unknown file";
        }
        sb.append(fname).append("(").append(String.valueOf(getLineNum())).append(",")
                .append(String.valueOf(getColNum())).append("):").append(this.getErrorLevel().toString().toLowerCase())
                .append(" ").append(this.getErrCodePrefix()).append(String.valueOf(errorCode.getNumVal()) + ":")
                .append(getErrorString()).append("\n");

        return sb.toString();
    }

    /**
     * <p>Getter for the field <code>sourceID</code>.</p>
     *
     * @return the Unique Identifier of the object that caused this error
     */
    public String getSourceID()
    {
        return sourceID;
    }

    /**
     * <p>Setter for the field <code>sourceID</code>.</p>
     *
     * @param sourceID
     *            the unique Identifier of the object that caused this error
     */
    public void setSourceID(String sourceID)
    {
        this.sourceID = sourceID;
    }

    /**
     * <p>Getter for the field <code>errorCode</code>.</p>
     *
     * @return the Error Code of this Error
     */
    public IErrorCode getErrorCode()
    {
        return errorCode;
    }

    /**
     * <p>Getter for the field <code>errorString</code>.</p>
     *
     * @return the Error message of this error
     */
    public String getErrorString()
    {
        return errorString;
    }

    /**
     * <p>getLineNum.</p>
     *
     * @return The Line Number this error occurred at
     */
    public Integer getLineNum()
    {
        return linenum;
    }

    /**
     * <p>setLineNum.</p>
     *
     * @param l
     *            Set the line number this error occurred at
     */
    public void setLineNum(int l)
    {
        linenum = l;
    }

    /**
     * <p>getColNum.</p>
     *
     * @return the Column Number this error occurred at
     */
    public Integer getColNum()
    {
        return colnum;
    }

    /**
     * <p>setColNum.</p>
     *
     * @param c
     *            the Column Number this error occurred at
     */
    public void setColNum(int c)
    {
        colnum = c;
    }

    /**
     * <p>Getter for the field <code>filename</code>.</p>
     *
     * @return The Filename of the file this error occurred in
     */
    public String getFilename()
    {
        return filename;
    }

    /**
     * <p>Setter for the field <code>filename</code>.</p>
     *
     * @param filename
     *            the Filename of the file this error occurred in
     */
    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    /**
     * <p>Setter for the field <code>errorSource</code>.</p>
     *
     * @param val
     *            the Source of this object (Composition, Contract, Kel file, etc)
     */
    public void setErrorSource(IErrorSource val)
    {
        this.errorSource = val;
    }

    /**
     * <p>Getter for the field <code>errorSource</code>.</p>
     *
     * @return the Source of this error (Composition, Contract, Kel , etc)
     */
    public IErrorSource getErrorSource()
    {
        return errorSource;
    }

    /**
     * <p>Getter for the field <code>errorType</code>.</p>
     *
     * @return the Type of error: VALIDATE, SYSTEM, HPCC, etc. Class must extend IErrorType
     */
    public IErrorType getErrorType()
    {
        return errorType;
    }

    /**
     * <p>Setter for the field <code>errorType</code>.</p>
     *
     * @param val
     *            the Type of error: VALIDATE, SYSTEM, HPCC, etc. Class must extend IErrorType
     */
    public void setErrorType(IErrorType val)
    {
        this.errorType = val;
    }

    /**
     * <p>Getter for the field <code>additionalInfo</code>.</p>
     *
     * @return any additional info for this exception
     */
    public String getAdditionalInfo()
    {
        return additionalInfo;
    }

    /**
     * <p>Setter for the field <code>additionalInfo</code>.</p>
     *
     * @param info
     *            any additional info for this exception
     */
    public void setAdditionalInfo(String info)
    {
        this.additionalInfo = info;
    }

    /**
     * <p>Getter for the field <code>errorLevel</code>.</p>
     *
     * @return Error Level (FATAL, ERROR, WARNING, INFO)
     */
    public HpccErrorLevel getErrorLevel()
    {
        return errorLevel;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    /**
     * <p>hashCode.</p>
     *
     * @return a int.
     */
    public int hashCode()
    {
        return this.toEclIdeString().hashCode();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    /** {@inheritDoc} */
    public boolean equals(Object o)
    {
        if (o == null)
        {
            return false;
        }
        return (o.hashCode() == hashCode());
    }

    /**
     * @return the Error Code prefix to use when generating ECL-formatted errors
     */
    private String getErrCodePrefix()
    {
        return "H";
    }

    /**
     * <p>Getter for the field <code>exception</code>.</p>
     *
     * @return a {@link java.lang.Exception} object.
     */
    public Exception getException()
    {
        return exception;
    }

    /**
     * <p>Setter for the field <code>exception</code>.</p>
     *
     * @param ex a {@link java.lang.Exception} object.
     */
    public void setException(Exception ex)
    {
        this.exception = ex;
    }
}
