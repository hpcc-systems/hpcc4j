package org.hpccsystems.ws.client.wrappers.wsworkunits;

public class ECLQueryWrapper
{
    private String text;

    private String cpp;

    private String resTxt;

    private String dll;

    private String thorLog;

    private String queryMainDefinition;

    public ECLQueryWrapper() {}

    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLQuery raw)
    {
        if (raw==null)
        {
            return;
        }

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLQuery raw)
    {
        if (raw==null)
        {
            return;
        }

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLQuery raw)
    {
        if (raw==null)
        {
            return;
        }

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }
    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLQuery raw)
    {
        if (raw==null)
        {
            return;
        }

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLQuery raw)
    {
        if (raw==null)
        {
            return;
        }

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLQuery getRaw()
    {
        return getRawVersion74();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLQuery getRawVersion74()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLQuery raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLQuery();
        raw.setCpp(this.getCpp());
        raw.setDll(this.getDll());
        raw.setQueryMainDefinition(this.getQueryMainDefinition());
        raw.setResTxt(this.getResTxt());
        raw.setText(this.getText());
        raw.setThorLog(this.getThorLog());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLQuery getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLQuery raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLQuery();
        raw.setCpp(this.getCpp());
        raw.setDll(this.getDll());
        raw.setQueryMainDefinition(this.getQueryMainDefinition());
        raw.setResTxt(this.getResTxt());
        raw.setText(this.getText());
        raw.setThorLog(this.getThorLog());
        return raw;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLQuery getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLQuery raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLQuery();
        raw.setCpp(this.getCpp());
        raw.setDll(this.getDll());
        raw.setQueryMainDefinition(this.getQueryMainDefinition());
        raw.setResTxt(this.getResTxt());
        raw.setText(this.getText());
        raw.setThorLog(this.getThorLog());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLQuery getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLQuery raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLQuery();
        raw.setCpp(this.getCpp());
        raw.setDll(this.getDll());
        raw.setQueryMainDefinition(this.getQueryMainDefinition());
        raw.setResTxt(this.getResTxt());
        raw.setText(this.getText());
        raw.setThorLog(this.getThorLog());
        return raw;
    }

    /**
     * @return the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * @return the cpp
     */
    public String getCpp()
    {
        return cpp;
    }

    /**
     * @param cpp the cpp to set
     */
    public void setCpp(String cpp)
    {
        this.cpp = cpp;
    }

    /**
     * @return the resTxt
     */
    public String getResTxt()
    {
        return resTxt;
    }

    /**
     * @param resTxt the resTxt to set
     */
    public void setResTxt(String resTxt)
    {
        this.resTxt = resTxt;
    }

    /**
     * @return the dll
     */
    public String getDll()
    {
        return dll;
    }

    /**
     * @param dll the dll to set
     */
    public void setDll(String dll)
    {
        this.dll = dll;
    }

    /**
     * @return the thorLog
     */
    public String getThorLog()
    {
        return thorLog;
    }

    /**
     * @param thorLog the thorLog to set
     */
    public void setThorLog(String thorLog)
    {
        this.thorLog = thorLog;
    }

    /**
     * @return the queryMainDefinition
     */
    public String getQueryMainDefinition()
    {
        return queryMainDefinition;
    }

    /**
     * @param queryMainDefinition the queryMainDefinition to set
     */
    public void setQueryMainDefinition(String queryMainDefinition)
    {
        this.queryMainDefinition = queryMainDefinition;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLQueryWrapper [text=" + text + ", cpp=" + cpp + ", resTxt=" + resTxt + ", dll=" + dll + ", thorLog="
                + thorLog + ", queryMainDefinition=" + queryMainDefinition + "]";
    }

}
