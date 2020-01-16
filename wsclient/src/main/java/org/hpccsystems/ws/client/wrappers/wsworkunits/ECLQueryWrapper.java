package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLQuery;

public class ECLQueryWrapper
{
    private String text;

    private String cpp;

    private String resTxt;

    private String dll;

    private String thorLog;

    private String queryMainDefinition;

    /**
     * Instantiates a new ECL query wrapper.
     */
    public ECLQueryWrapper() {}

    /**
     * Instantiates a new ECL query wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLQueryWrapper(ECLQuery raw)
    {
        if (raw==null)
            return;

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    /**
     * Instantiates a new ECL query wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLQuery raw)
    {
        if (raw==null)
            return;

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    /**
     * Instantiates a new ECL query wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery raw)
    {
        if (raw==null)
            return;

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    /**
     * Instantiates a new ECL query wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLQuery raw)
    {
        if (raw==null)
            return;

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    /**
     * Instantiates a new ECL query wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLQuery raw)
    {
        if (raw==null)
            return;

        this.text=raw.getText();
        this.cpp=raw.getCpp();
        this.dll=raw.getDll();
        this.queryMainDefinition=raw.getQueryMainDefinition();
        this.thorLog=raw.getThorLog();
        this.resTxt=raw.getResTxt();
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLQuery getRaw()
    {
        return getRawVersion1_75();
    }

    /**
     * Gets the raw version 1 75.
     *
     * @return the raw version 1 75
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLQuery getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLQuery raw =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLQuery();

        raw.setCpp(this.getCpp());
        raw.setDll(this.getDll());
        raw.setQueryMainDefinition(this.getQueryMainDefinition());
        raw.setResTxt(this.getResTxt());
        raw.setText(this.getText());
        raw.setThorLog(this.getThorLog());
        return raw;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * Sets the text.
     *
     * @param text
     *            the text to set
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * Gets the cpp.
     *
     * @return the cpp
     */
    public String getCpp()
    {
        return cpp;
    }

    /**
     * Sets the cpp.
     *
     * @param cpp
     *            the cpp to set
     */
    public void setCpp(String cpp)
    {
        this.cpp = cpp;
    }

    /**
     * Gets the res txt.
     *
     * @return the resTxt
     */
    public String getResTxt()
    {
        return resTxt;
    }

    /**
     * Sets the res txt.
     *
     * @param resTxt
     *            the resTxt to set
     */
    public void setResTxt(String resTxt)
    {
        this.resTxt = resTxt;
    }

    /**
     * Gets the dll.
     *
     * @return the dll
     */
    public String getDll()
    {
        return dll;
    }

    /**
     * Sets the dll.
     *
     * @param dll
     *            the dll to set
     */
    public void setDll(String dll)
    {
        this.dll = dll;
    }

    /**
     * Gets the thor log.
     *
     * @return the thorLog
     */
    public String getThorLog()
    {
        return thorLog;
    }

    /**
     * Sets the thor log.
     *
     * @param thorLog
     *            the thorLog to set
     */
    public void setThorLog(String thorLog)
    {
        this.thorLog = thorLog;
    }

    /**
     * Gets the query main definition.
     *
     * @return the queryMainDefinition
     */
    public String getQueryMainDefinition()
    {
        return queryMainDefinition;
    }

    /**
     * Sets the query main definition.
     *
     * @param queryMainDefinition
     *            the queryMainDefinition to set
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
