package org.hpccsystems.ws.client.wrappers.wsworkunits;

public class ECLTimingDataWrapper
{
    private String name;

    private Integer graphNum;

    private Integer subGraphNum;

    private Integer GID;

    private Integer min;

    private Integer MS;

    public ECLTimingDataWrapper() {

    }
    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLTimingData raw) {
        if (raw==null) {
            return;
        }
        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLTimingData raw) {
        if (raw==null) {
            return;
        }
        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }
    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLTimingData raw) {
        if (raw==null) {
            return;
        }
        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLTimingData raw) {
        if (raw==null) {
            return;
        }
        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLTimingData raw) {
        if (raw==null) {
            return;
        }
        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLTimingData getRaw(){
        return getRawVersion74();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLTimingData getRawVersion74(){
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLTimingData raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLTimingData();
        raw.setGID(this.getGID());
        raw.setGraphNum(this.getGraphNum());
        raw.setMin(this.getMin());
        raw.setMS(this.getMS());
        raw.setName(this.getName());
        raw.setSubGraphNum(this.getSubGraphNum());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLTimingData getRawVersion1_69(){
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLTimingData raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLTimingData();
        raw.setGID(this.getGID());
        raw.setGraphNum(this.getGraphNum());
        raw.setMin(this.getMin());
        raw.setMS(this.getMS());
        raw.setName(this.getName());
        raw.setSubGraphNum(this.getSubGraphNum());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLTimingData getRawVersion1_62(){
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLTimingData raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLTimingData();
        raw.setGID(this.getGID());
        raw.setGraphNum(this.getGraphNum());
        raw.setMin(this.getMin());
        raw.setMS(this.getMS());
        raw.setName(this.getName());
        raw.setSubGraphNum(this.getSubGraphNum());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLTimingData getRawVersion1_58(){
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLTimingData raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLTimingData();
        raw.setGID(this.getGID());
        raw.setGraphNum(this.getGraphNum());
        raw.setMin(this.getMin());
        raw.setMS(this.getMS());
        raw.setName(this.getName());
        raw.setSubGraphNum(this.getSubGraphNum());
        return raw;
    }
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * @return the graphNum
     */
    public Integer getGraphNum()
    {
        return graphNum;
    }
    /**
     * @param graphNum the graphNum to set
     */
    public void setGraphNum(Integer graphNum)
    {
        this.graphNum = graphNum;
    }
    /**
     * @return the subGraphNum
     */
    public Integer getSubGraphNum()
    {
        return subGraphNum;
    }
    /**
     * @param subGraphNum the subGraphNum to set
     */
    public void setSubGraphNum(Integer subGraphNum)
    {
        this.subGraphNum = subGraphNum;
    }
    /**
     * @return the gID
     */
    public Integer getGID()
    {
        return GID;
    }
    /**
     * @param gID the gID to set
     */
    public void setGID(Integer gID)
    {
        GID = gID;
    }
    /**
     * @return the min
     */
    public Integer getMin()
    {
        return min;
    }
    /**
     * @param min the min to set
     */
    public void setMin(Integer min)
    {
        this.min = min;
    }
    /**
     * @return the mS
     */
    public Integer getMS()
    {
        return MS;
    }
    /**
     * @param mS the mS to set
     */
    public void setMS(Integer mS)
    {
        MS = mS;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLTimingDataWrapper [name=" + name + ", graphNum=" + graphNum + ", subGraphNum=" + subGraphNum
                + ", GID=" + GID + ", min=" + min + ", MS=" + MS + "]";
    }

}
