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
 * Class name: GetBannerResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBannerResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class GetBannerResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_bannerContent;
    protected String local_bannerColor;
    protected String local_bannerSize;
    protected String local_bannerScroll;
    protected String local_chatURL;
    protected int local_showBanner;
    protected int local_showChatURL;

    public GetBannerResponseWrapper() {}

    public GetBannerResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBannerResponse getbannerresponse)
    {
        copy( getbannerresponse );
    }
    public GetBannerResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _bannerContent, String _bannerColor, String _bannerSize, String _bannerScroll, String _chatURL, int _showBanner, int _showChatURL )
    {
        this.local_exceptions = _exceptions;
        this.local_bannerContent = _bannerContent;
        this.local_bannerColor = _bannerColor;
        this.local_bannerSize = _bannerSize;
        this.local_bannerScroll = _bannerScroll;
        this.local_chatURL = _chatURL;
        this.local_showBanner = _showBanner;
        this.local_showChatURL = _showChatURL;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBannerResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_bannerContent = raw.getBannerContent();
        this.local_bannerColor = raw.getBannerColor();
        this.local_bannerSize = raw.getBannerSize();
        this.local_bannerScroll = raw.getBannerScroll();
        this.local_chatURL = raw.getChatURL();
        this.local_showBanner = raw.getShowBanner();
        this.local_showChatURL = raw.getShowChatURL();

    }

    @Override
    public String toString()
    {
        return "GetBannerResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "bannerContent = " + local_bannerContent + ", " + "bannerColor = " + local_bannerColor + ", " + "bannerSize = " + local_bannerSize + ", " + "bannerScroll = " + local_bannerScroll + ", " + "chatURL = " + local_chatURL + ", " + "showBanner = " + local_showBanner + ", " + "showChatURL = " + local_showChatURL + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBannerResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBannerResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBannerResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setBannerContent( local_bannerContent);
        raw.setBannerColor( local_bannerColor);
        raw.setBannerSize( local_bannerSize);
        raw.setBannerScroll( local_bannerScroll);
        raw.setChatURL( local_chatURL);
        raw.setShowBanner( local_showBanner);
        raw.setShowChatURL( local_showChatURL);
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
}