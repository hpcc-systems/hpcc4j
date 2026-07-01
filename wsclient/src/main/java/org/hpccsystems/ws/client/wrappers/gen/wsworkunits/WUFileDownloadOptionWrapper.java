package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;

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
 * Class name: WUFileDownloadOptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileDownloadOption
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUFileDownloadOptionWrapper
{
    protected int local_wUFileDownloadOption;

    public WUFileDownloadOptionWrapper() {}

    public WUFileDownloadOptionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileDownloadOption wufiledownloadoption)
    {
        copy( wufiledownloadoption );
    }
    public WUFileDownloadOptionWrapper( int _wUFileDownloadOption )
    {
        this.local_wUFileDownloadOption = _wUFileDownloadOption;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileDownloadOption raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUFileDownloadOption();

    }

    @Override
    public String toString()
    {
        return "WUFileDownloadOptionWrapper [" + "wUFileDownloadOption = " + local_wUFileDownloadOption + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileDownloadOption getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFileDownloadOption raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUFileDownloadOption(wUFileDownloadOption);
        return raw;
    }


    public void setWUFileDownloadOption( int _wUFileDownloadOption )
    {
        this.local_wUFileDownloadOption = _wUFileDownloadOption;
    }
    public int getWUFileDownloadOption( )
    {
        return this.local_wUFileDownloadOption;
    }
}