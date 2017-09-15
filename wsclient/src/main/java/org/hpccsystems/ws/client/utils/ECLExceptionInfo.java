package org.hpccsystems.ws.client.utils;


public class ECLExceptionInfo {
    private Integer activity;
    private Integer code;
    private Integer column;
    private String fileName;
    private Integer lineNo;
    private String message;
    private String severity;
    private String source;

    public ECLExceptionInfo() {}
    
    public ECLExceptionInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLException raw) 
    {
        activity=raw.getActivity();
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
