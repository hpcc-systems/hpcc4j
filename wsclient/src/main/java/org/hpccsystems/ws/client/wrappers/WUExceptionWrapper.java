package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException;

public class WUExceptionWrapper
{
    private Integer activity=null;
    private Integer code=null;
    private Integer column=null;
    private String fileName=null;
    private Integer lineNo=null;
    private String message=null;
    private String severity=null;
    private String source=null;

    private String audience;
    private String espCode;

    public WUExceptionWrapper() {}

    public WUExceptionWrapper(ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    public WUExceptionWrapper(EspException raw)
    {
        audience=raw.getAudience();
        message=raw.getMessage();
        espCode=raw.getCode();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.EspException raw)
    {
        audience=raw.getAudience();
        message=raw.getMessage();
        espCode=raw.getCode();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.EspException raw)
    {
        audience=raw.getAudience();
        message=raw.getMessage();
        espCode=raw.getCode();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspException raw)
    {
        audience=raw.getAudience();
        message=raw.getMessage();
        espCode=raw.getCode();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspException raw)
    {
        audience=raw.getAudience();
        message=raw.getMessage();
        espCode=raw.getCode();
        source=raw.getSource();
    }

    public WUExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    public Integer getActivity()
    {
        return activity;
    }

    public void setActivity(Integer activity)
    {
        this.activity = activity;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public Integer getColumn()
    {
        return column;
    }

    public void setColumn(Integer column)
    {
        this.column = column;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public Integer getLineNo()
    {
        return lineNo;
    }

    public void setLineNo(Integer lineNo)
    {
        this.lineNo = lineNo;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getSeverity()
    {
        return severity;
    }

    public void setSeverity(String severity)
    {
        this.severity = severity;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException ex=new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException();
        ex.setActivity(activity);
        ex.setCode(code);
        ex.setColumn(column);
        ex.setFileName(fileName);
        ex.setLineNo(lineNo);
        ex.setMessage(message);
        ex.setSeverity(severity);
        ex.setSource(source);
        return ex;
    }

    public String getAudience()
    {
        return audience;
    }

    public String getEspCode()
    {
        return espCode;
    }

    public String getErrorCode()
    {
        if (espCode != null)
        {
            return espCode;
        }
        else if (code != null)
        {
            return String.valueOf(code);
        }
        return null;
    }
}
