package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow;

public class ECLWorkflowWrapper
{
    private String WFID;

    private String eventName;

    private String eventText;

    private Integer count;

    private Integer countRemaining;

    /**
     * Instantiates a new ECL workflow wrapper.
     */
    public ECLWorkflowWrapper() {

    }


    /**
     * Instantiates a new ECL workflow wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLWorkflowWrapper(ECLWorkflow raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setCountRemaining(raw.getCountRemaining());
        this.setEventName(raw.getEventName());
        this.setEventText(raw.getEventText());
        this.setWFID(raw.getWFID());
    }

    /**
     * Instantiates a new ECL workflow wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLWorkflowWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkflow raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setCountRemaining(raw.getCountRemaining());
        this.setEventName(raw.getEventName());
        this.setEventText(raw.getEventText());
        this.setWFID(raw.getWFID());
    }

    /**
     * Instantiates a new ECL workflow wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLWorkflowWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLWorkflow raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setCountRemaining(raw.getCountRemaining());
        this.setEventName(raw.getEventName());
        this.setEventText(raw.getEventText());
        this.setWFID(raw.getWFID());
    }

    /**
     * Instantiates a new ECL workflow wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLWorkflowWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLWorkflow raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setCountRemaining(raw.getCountRemaining());
        this.setEventName(raw.getEventName());
        this.setEventText(raw.getEventText());
        this.setWFID(raw.getWFID());
    }

    /**
     * Instantiates a new ECL workflow wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLWorkflowWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkflow raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setCount(raw.getCount());
        this.setCountRemaining(raw.getCountRemaining());
        this.setEventName(raw.getEventName());
        this.setEventText(raw.getEventText());
        this.setWFID(raw.getWFID());
    }


    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow getRaw()
    {
        return this.getRawVersion1_75();
    }

    /**
     * Gets the raw version 1 75.
     *
     * @return the raw version 1 75
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow raw =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow();

        raw.setCount(this.getCount());
        raw.setCountRemaining(this.getCountRemaining());
        raw.setEventName(this.getEventName());
        raw.setEventText(this.getEventText());
        raw.setWFID(this.getWFID());
        return raw;
    }

    /**
     * Gets the wfid.
     *
     * @return the wFID
     */
    public String getWFID()
    {
        return WFID;
    }

    /**
     * Sets the wfid.
     *
     * @param wFID
     *            the wFID to set
     */
    public void setWFID(String wFID)
    {
        WFID = wFID;
    }

    /**
     * Gets the event name.
     *
     * @return the eventName
     */
    public String getEventName()
    {
        return eventName;
    }

    /**
     * Sets the event name.
     *
     * @param eventName
     *            the eventName to set
     */
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

    /**
     * Gets the event text.
     *
     * @return the eventText
     */
    public String getEventText()
    {
        return eventText;
    }

    /**
     * Sets the event text.
     *
     * @param eventText
     *            the eventText to set
     */
    public void setEventText(String eventText)
    {
        this.eventText = eventText;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public Integer getCount()
    {
        return count;
    }

    /**
     * Sets the count.
     *
     * @param count
     *            the count to set
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }

    /**
     * Gets the count remaining.
     *
     * @return the countRemaining
     */
    public Integer getCountRemaining()
    {
        return countRemaining;
    }

    /**
     * Sets the count remaining.
     *
     * @param countRemaining
     *            the countRemaining to set
     */
    public void setCountRemaining(Integer countRemaining)
    {
        this.countRemaining = countRemaining;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLWorkflowWrapper [WFID=" + WFID + ", eventName=" + eventName + ", eventText=" + eventText + ", count="
                + count + ", countRemaining=" + countRemaining + "]";
    }

}
