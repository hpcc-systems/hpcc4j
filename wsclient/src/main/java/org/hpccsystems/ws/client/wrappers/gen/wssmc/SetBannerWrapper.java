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
 * Class name: SetBannerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-07-25T18:14:46.556Z
 */
public class SetBannerWrapper
{
    protected String local_chatURL;
    protected String local_bannerContent;
    protected String local_bannerColor;
    protected String local_bannerSize;
    protected String local_bannerScroll;
    protected int local_bannerAction;
    protected boolean local_enableChatURL;
    protected boolean local_fromSubmitBtn;

    public SetBannerWrapper() {}

    public SetBannerWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner setbanner)
    {
        copy( setbanner );
    }
    public SetBannerWrapper( String _chatURL, String _bannerContent, String _bannerColor, String _bannerSize, String _bannerScroll, int _bannerAction, boolean _enableChatURL, boolean _fromSubmitBtn )
    {
        this.local_chatURL = _chatURL;
        this.local_bannerContent = _bannerContent;
        this.local_bannerColor = _bannerColor;
        this.local_bannerSize = _bannerSize;
        this.local_bannerScroll = _bannerScroll;
        this.local_bannerAction = _bannerAction;
        this.local_enableChatURL = _enableChatURL;
        this.local_fromSubmitBtn = _fromSubmitBtn;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner raw )
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

    }

    @Override
    public String toString()
    {
        return "SetBannerWrapper [" + "chatURL = " + local_chatURL + ", " + "bannerContent = " + local_bannerContent + ", " + "bannerColor = " + local_bannerColor + ", " + "bannerSize = " + local_bannerSize + ", " + "bannerScroll = " + local_bannerScroll + ", " + "bannerAction = " + local_bannerAction + ", " + "enableChatURL = " + local_enableChatURL + ", " + "fromSubmitBtn = " + local_fromSubmitBtn + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner();
        raw.setChatURL( local_chatURL);
        raw.setBannerContent( local_bannerContent);
        raw.setBannerColor( local_bannerColor);
        raw.setBannerSize( local_bannerSize);
        raw.setBannerScroll( local_bannerScroll);
        raw.setBannerAction( local_bannerAction);
        raw.setEnableChatURL( local_enableChatURL);
        raw.setFromSubmitBtn( local_fromSubmitBtn);
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
}