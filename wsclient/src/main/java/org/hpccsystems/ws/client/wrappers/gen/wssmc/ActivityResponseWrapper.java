package org.hpccsystems.ws.client.wrappers.gen.wssmc;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ActivityResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.280Z
 */
public class ActivityResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_build;
    protected ArrayOfTargetClusterWrapper local_thorClusterList;
    protected ArrayOfTargetClusterWrapper local_roxieClusterList;
    protected ArrayOfTargetClusterWrapper local_hThorClusterList;
    protected ArrayOfDFUJobWrapper local_dFUJobs;
    protected ArrayOfActiveWorkunitWrapper local_running;
    protected String local_bannerContent;
    protected String local_bannerColor;
    protected String local_bannerSize;
    protected String local_bannerScroll;
    protected String local_chatURL;
    protected int local_showBanner;
    protected int local_showChatURL;
    protected String local_sortBy;
    protected boolean local_descending;
    protected boolean local_superUser;
    protected String local_accessRight;
    protected ArrayOfServerJobQueueWrapper local_serverJobQueues;
    protected String local_activityTime;
    protected boolean local_daliDetached;

    public ActivityResponseWrapper() {}

    public ActivityResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse activityresponse)
    {
        copy( activityresponse );
    }
    public ActivityResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _build, ArrayOfTargetClusterWrapper _thorClusterList, ArrayOfTargetClusterWrapper _roxieClusterList, ArrayOfTargetClusterWrapper _hThorClusterList, ArrayOfDFUJobWrapper _dFUJobs, ArrayOfActiveWorkunitWrapper _running, String _bannerContent, String _bannerColor, String _bannerSize, String _bannerScroll, String _chatURL, int _showBanner, int _showChatURL, String _sortBy, boolean _descending, boolean _superUser, String _accessRight, ArrayOfServerJobQueueWrapper _serverJobQueues, String _activityTime, boolean _daliDetached )
    {
        this.local_exceptions = _exceptions;
        this.local_build = _build;
        this.local_thorClusterList = _thorClusterList;
        this.local_roxieClusterList = _roxieClusterList;
        this.local_hThorClusterList = _hThorClusterList;
        this.local_dFUJobs = _dFUJobs;
        this.local_running = _running;
        this.local_bannerContent = _bannerContent;
        this.local_bannerColor = _bannerColor;
        this.local_bannerSize = _bannerSize;
        this.local_bannerScroll = _bannerScroll;
        this.local_chatURL = _chatURL;
        this.local_showBanner = _showBanner;
        this.local_showChatURL = _showChatURL;
        this.local_sortBy = _sortBy;
        this.local_descending = _descending;
        this.local_superUser = _superUser;
        this.local_accessRight = _accessRight;
        this.local_serverJobQueues = _serverJobQueues;
        this.local_activityTime = _activityTime;
        this.local_daliDetached = _daliDetached;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_build = raw.getBuild();
        if (raw.getThorClusterList() != null)
            this.local_thorClusterList = new ArrayOfTargetClusterWrapper( raw.getThorClusterList());
        if (raw.getRoxieClusterList() != null)
            this.local_roxieClusterList = new ArrayOfTargetClusterWrapper( raw.getRoxieClusterList());
        if (raw.getHThorClusterList() != null)
            this.local_hThorClusterList = new ArrayOfTargetClusterWrapper( raw.getHThorClusterList());
        if (raw.getDFUJobs() != null)
            this.local_dFUJobs = new ArrayOfDFUJobWrapper( raw.getDFUJobs());
        if (raw.getRunning() != null)
            this.local_running = new ArrayOfActiveWorkunitWrapper( raw.getRunning());
        this.local_bannerContent = raw.getBannerContent();
        this.local_bannerColor = raw.getBannerColor();
        this.local_bannerSize = raw.getBannerSize();
        this.local_bannerScroll = raw.getBannerScroll();
        this.local_chatURL = raw.getChatURL();
        this.local_showBanner = raw.getShowBanner();
        this.local_showChatURL = raw.getShowChatURL();
        this.local_sortBy = raw.getSortBy();
        this.local_descending = raw.getDescending();
        this.local_superUser = raw.getSuperUser();
        this.local_accessRight = raw.getAccessRight();
        if (raw.getServerJobQueues() != null)
            this.local_serverJobQueues = new ArrayOfServerJobQueueWrapper( raw.getServerJobQueues());
        this.local_activityTime = raw.getActivityTime();
        this.local_daliDetached = raw.getDaliDetached();

    }

    @Override
    public String toString()
    {
        return "ActivityResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "build = " + local_build + ", " + "thorClusterList = " + local_thorClusterList + ", " + "roxieClusterList = " + local_roxieClusterList + ", " + "hThorClusterList = " + local_hThorClusterList + ", " + "dFUJobs = " + local_dFUJobs + ", " + "running = " + local_running + ", " + "bannerContent = " + local_bannerContent + ", " + "bannerColor = " + local_bannerColor + ", " + "bannerSize = " + local_bannerSize + ", " + "bannerScroll = " + local_bannerScroll + ", " + "chatURL = " + local_chatURL + ", " + "showBanner = " + local_showBanner + ", " + "showChatURL = " + local_showChatURL + ", " + "sortBy = " + local_sortBy + ", " + "descending = " + local_descending + ", " + "superUser = " + local_superUser + ", " + "accessRight = " + local_accessRight + ", " + "serverJobQueues = " + local_serverJobQueues + ", " + "activityTime = " + local_activityTime + ", " + "daliDetached = " + local_daliDetached + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setBuild( local_build);
        if (local_thorClusterList != null)
            raw.setThorClusterList( local_thorClusterList.getRaw());
        if (local_roxieClusterList != null)
            raw.setRoxieClusterList( local_roxieClusterList.getRaw());
        if (local_hThorClusterList != null)
            raw.setHThorClusterList( local_hThorClusterList.getRaw());
        if (local_dFUJobs != null)
            raw.setDFUJobs( local_dFUJobs.getRaw());
        if (local_running != null)
            raw.setRunning( local_running.getRaw());
        raw.setBannerContent( local_bannerContent);
        raw.setBannerColor( local_bannerColor);
        raw.setBannerSize( local_bannerSize);
        raw.setBannerScroll( local_bannerScroll);
        raw.setChatURL( local_chatURL);
        raw.setShowBanner( local_showBanner);
        raw.setShowChatURL( local_showChatURL);
        raw.setSortBy( local_sortBy);
        raw.setDescending( local_descending);
        raw.setSuperUser( local_superUser);
        raw.setAccessRight( local_accessRight);
        if (local_serverJobQueues != null)
            raw.setServerJobQueues( local_serverJobQueues.getRaw());
        raw.setActivityTime( local_activityTime);
        raw.setDaliDetached( local_daliDetached);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setBuild( String _build )
    {
        this.local_build = _build;
    }
    public String getBuild( )
    {
        return this.local_build;
    }
    public void setThorClusterList( ArrayOfTargetClusterWrapper _thorClusterList )
    {
        this.local_thorClusterList = _thorClusterList;
    }
    public ArrayOfTargetClusterWrapper getThorClusterList( )
    {
        return this.local_thorClusterList;
    }
    public void setRoxieClusterList( ArrayOfTargetClusterWrapper _roxieClusterList )
    {
        this.local_roxieClusterList = _roxieClusterList;
    }
    public ArrayOfTargetClusterWrapper getRoxieClusterList( )
    {
        return this.local_roxieClusterList;
    }
    public void setHThorClusterList( ArrayOfTargetClusterWrapper _hThorClusterList )
    {
        this.local_hThorClusterList = _hThorClusterList;
    }
    public ArrayOfTargetClusterWrapper getHThorClusterList( )
    {
        return this.local_hThorClusterList;
    }
    public void setDFUJobs( ArrayOfDFUJobWrapper _dFUJobs )
    {
        this.local_dFUJobs = _dFUJobs;
    }
    public ArrayOfDFUJobWrapper getDFUJobs( )
    {
        return this.local_dFUJobs;
    }
    public void setRunning( ArrayOfActiveWorkunitWrapper _running )
    {
        this.local_running = _running;
    }
    public ArrayOfActiveWorkunitWrapper getRunning( )
    {
        return this.local_running;
    }
    public void setBannerContent( String _bannerContent )
    {
        this.local_bannerContent = _bannerContent;
    }
    public String getBannerContent( )
    {
        return this.local_bannerContent;
    }
    public void setBannerColor( String _bannerColor )
    {
        this.local_bannerColor = _bannerColor;
    }
    public String getBannerColor( )
    {
        return this.local_bannerColor;
    }
    public void setBannerSize( String _bannerSize )
    {
        this.local_bannerSize = _bannerSize;
    }
    public String getBannerSize( )
    {
        return this.local_bannerSize;
    }
    public void setBannerScroll( String _bannerScroll )
    {
        this.local_bannerScroll = _bannerScroll;
    }
    public String getBannerScroll( )
    {
        return this.local_bannerScroll;
    }
    public void setChatURL( String _chatURL )
    {
        this.local_chatURL = _chatURL;
    }
    public String getChatURL( )
    {
        return this.local_chatURL;
    }
    public void setShowBanner( int _showBanner )
    {
        this.local_showBanner = _showBanner;
    }
    public int getShowBanner( )
    {
        return this.local_showBanner;
    }
    public void setShowChatURL( int _showChatURL )
    {
        this.local_showChatURL = _showChatURL;
    }
    public int getShowChatURL( )
    {
        return this.local_showChatURL;
    }
    public void setSortBy( String _sortBy )
    {
        this.local_sortBy = _sortBy;
    }
    public String getSortBy( )
    {
        return this.local_sortBy;
    }
    public void setDescending( boolean _descending )
    {
        this.local_descending = _descending;
    }
    public boolean getDescending( )
    {
        return this.local_descending;
    }
    public void setSuperUser( boolean _superUser )
    {
        this.local_superUser = _superUser;
    }
    public boolean getSuperUser( )
    {
        return this.local_superUser;
    }
    public void setAccessRight( String _accessRight )
    {
        this.local_accessRight = _accessRight;
    }
    public String getAccessRight( )
    {
        return this.local_accessRight;
    }
    public void setServerJobQueues( ArrayOfServerJobQueueWrapper _serverJobQueues )
    {
        this.local_serverJobQueues = _serverJobQueues;
    }
    public ArrayOfServerJobQueueWrapper getServerJobQueues( )
    {
        return this.local_serverJobQueues;
    }
    public void setActivityTime( String _activityTime )
    {
        this.local_activityTime = _activityTime;
    }
    public String getActivityTime( )
    {
        return this.local_activityTime;
    }
    public void setDaliDetached( boolean _daliDetached )
    {
        this.local_daliDetached = _daliDetached;
    }
    public boolean getDaliDetached( )
    {
        return this.local_daliDetached;
    }
}