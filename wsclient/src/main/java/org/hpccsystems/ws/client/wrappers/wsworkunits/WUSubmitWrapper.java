package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit;

@Deprecated
public class WUSubmitWrapper
{
    private String wuid = null;
    private String cluster = null;
    private Integer maxruntime = null;
    private Integer blocktillfinishtimer = null;
    private Integer maxcost = null;
    private Boolean notifycluster = null;
    private String queue = null;
    private Boolean syntaxcheck = null;

    public String getWuid()
    {
        return wuid;
    }

    public void setWuid(String wuid)
    {
        this.wuid = wuid;
    }

    public boolean isWuIDInit()
    {
        return wuid != null;
    }

    public String getCluster()
    {
        return cluster;
    }

    public void setCluster(String cluster)
    {
        this.cluster = cluster;
    }

    public boolean isClusterInit()
    {
        return cluster != null;
    }

    public int getMaxruntime()
    {
        return maxruntime.intValue();
    }

    public void setMaxruntime(int maxruntime)
    {
        this.maxruntime = maxruntime;
    }

    public boolean isMaxRunTimeInit()
    {
        return maxruntime != null;
    }

    public int getBlocktillfinishtimer()
    {
        return blocktillfinishtimer.intValue();
    }

    public void setBlocktillfinishtimer(int blocktillfinishtimer)
    {
        this.blocktillfinishtimer = blocktillfinishtimer;
    }

    public boolean isBlocktillFinishTimerInit()
    {
        return blocktillfinishtimer != null;
    }

    public int getMaxcost()
    {
        return maxcost.intValue();
    }

    public void setMaxcost(int maxcost)
    {
        this.maxcost = maxcost;
    }

    public boolean isMaxcostinit()
    {
        return maxcost != null;
    }

    public boolean getNotifycluster()
    {
        return notifycluster.booleanValue();
    }

    public void setNotifycluster(boolean notifycluster)
    {
        this.notifycluster = notifycluster;
    }

    public boolean isNotifyClusterInit()
    {
        return notifycluster != null;
    }

    public String getQueue()
    {
        return queue;
    }

    public void setQueue(String queue)
    {
        this.queue = queue;
    }

    public boolean isIsqueueInit()
    {
        return queue != null;
    }

    public boolean getSyntaxcheck()
    {
        return syntaxcheck.booleanValue();
    }

    public void setSyntaxcheck(boolean syntaxcheck)
    {
        this.syntaxcheck = syntaxcheck;
    }

    public boolean isSyntaxCheckInit()
    {
        return syntaxcheck != null;
    }

    /**
     * Gets the latest version.
     *
     * @return the latest version
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit getRaw()
    {
        WUSubmit request = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit();

        if (wuid != null) request.setWuid(wuid);
        if (cluster != null) request.setCluster(cluster);
        if (maxruntime != null) request.setMaxRunTime(maxruntime);
        if (blocktillfinishtimer != null) request.setBlockTillFinishTimer(blocktillfinishtimer);
        if (maxcost != null) request.setMaxCost(maxcost);
        if (notifycluster != null) request.setNotifyCluster(notifycluster);
        if (queue != null) request.setQueue(queue);
        if (syntaxcheck != null) request.setSyntaxCheck(syntaxcheck);
        return request;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "WUSubmitWrapper [wuid=" + wuid + ", cluster=" + cluster + ", maxruntime=" + maxruntime + ", blocktillfinishtimer=" + blocktillfinishtimer + ", maxcost="
                + maxcost + ", notifycluster=" + notifycluster + ", queue=" + queue + ", syntaxcheck=" + syntaxcheck + "]";
    }

}
