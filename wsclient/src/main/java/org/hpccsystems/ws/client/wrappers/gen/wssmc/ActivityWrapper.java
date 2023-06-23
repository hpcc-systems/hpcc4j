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
 * Class name: ActivityWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class ActivityWrapper
{
    protected String local_chatURL;
    protected String local_bannerContent;
    protected String local_bannerColor;
    protected String local_bannerSize;
    protected String local_bannerScroll;
    protected int local_bannerAction;
    protected boolean local_enableChatURL;
    protected boolean local_fromSubmitBtn;
    protected String local_sortBy;
    protected boolean local_descending;

    public ActivityWrapper() {}

    public ActivityWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity activity)
    {
        copy( activity );
    }
    public ActivityWrapper( String _chatURL, String _bannerContent, String _bannerColor, String _bannerSize, String _bannerScroll, int _bannerAction, boolean _enableChatURL, boolean _fromSubmitBtn, String _sortBy, boolean _descending )
    {
        this.local_chatURL = _chatURL;
        this.local_bannerContent = _bannerContent;
        this.local_bannerColor = _bannerColor;
        this.local_bannerSize = _bannerSize;
        this.local_bannerScroll = _bannerScroll;
        this.local_bannerAction = _bannerAction;
        this.local_enableChatURL = _enableChatURL;
        this.local_fromSubmitBtn = _fromSubmitBtn;
        this.local_sortBy = _sortBy;
        this.local_descending = _descending;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity raw )
    {
        if (raw == null)
            return;

        this.local_chatURL = raw.getChatURL();
        this.local_bannerContent = raw.getBannerContent();
        this.local_bannerColor = raw.getBannerColor();
        this.local_bannerSize = raw.getBannerSize();
        this.local_bannerScroll = raw.getBannerScroll();
        this.local_bannerAction = raw.getBannerAction();
        this.local_enableChatURL = raw.getEnableChatURL();
        this.local_fromSubmitBtn = raw.getFromSubmitBtn();
        this.local_sortBy = raw.getSortBy();
        this.local_descending = raw.getDescending();

    }

    @Override
    public String toString()
    {
        return "ActivityWrapper [" + "chatURL = " + local_chatURL + ", " + "bannerContent = " + local_bannerContent + ", " + "bannerColor = " + local_bannerColor + ", " + "bannerSize = " + local_bannerSize + ", " + "bannerScroll = " + local_bannerScroll + ", " + "bannerAction = " + local_bannerAction + ", " + "enableChatURL = " + local_enableChatURL + ", " + "fromSubmitBtn = " + local_fromSubmitBtn + ", " + "sortBy = " + local_sortBy + ", " + "descending = " + local_descending + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity();
        raw.setChatURL( local_chatURL);
        raw.setBannerContent( local_bannerContent);
        raw.setBannerColor( local_bannerColor);
        raw.setBannerSize( local_bannerSize);
        raw.setBannerScroll( local_bannerScroll);
        raw.setBannerAction( local_bannerAction);
        raw.setEnableChatURL( local_enableChatURL);
        raw.setFromSubmitBtn( local_fromSubmitBtn);
        raw.setSortBy( local_sortBy);
        raw.setDescending( local_descending);
        return raw;
    }


    public void setChatURL( String _chatURL )
    {
        this.local_chatURL = _chatURL;
    }
    public String getChatURL( )
    {
        return this.local_chatURL;
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
    public void setBannerAction( int _bannerAction )
    {
        this.local_bannerAction = _bannerAction;
    }
    public int getBannerAction( )
    {
        return this.local_bannerAction;
    }
    public void setEnableChatURL( boolean _enableChatURL )
    {
        this.local_enableChatURL = _enableChatURL;
    }
    public boolean getEnableChatURL( )
    {
        return this.local_enableChatURL;
    }
    public void setFromSubmitBtn( boolean _fromSubmitBtn )
    {
        this.local_fromSubmitBtn = _fromSubmitBtn;
    }
    public boolean getFromSubmitBtn( )
    {
        return this.local_fromSubmitBtn;
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
}