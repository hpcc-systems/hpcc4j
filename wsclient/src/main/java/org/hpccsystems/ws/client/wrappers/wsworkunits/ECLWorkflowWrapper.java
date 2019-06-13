package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow;

public class ECLWorkflowWrapper
{
    private String WFID;

    private String eventName;

    private String eventText;

    private Integer count;

    private Integer countRemaining;

    public ECLWorkflowWrapper() {

    }


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


    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow getRaw()
    {
        return this.getRawVersion1_75();
    }

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
     * @return the wFID
     */
    public String getWFID()
    {
        return WFID;
    }

    /**
     * @param wFID the wFID to set
     */
    public void setWFID(String wFID)
    {
        WFID = wFID;
    }

    /**
     * @return the eventName
     */
    public String getEventName()
    {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

    /**
     * @return the eventText
     */
    public String getEventText()
    {
        return eventText;
    }

    /**
     * @param eventText the eventText to set
     */
    public void setEventText(String eventText)
    {
        this.eventText = eventText;
    }

    /**
     * @return the count
     */
    public Integer getCount()
    {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }

    /**
     * @return the countRemaining
     */
    public Integer getCountRemaining()
    {
        return countRemaining;
    }

    /**
     * @param countRemaining the countRemaining to set
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
