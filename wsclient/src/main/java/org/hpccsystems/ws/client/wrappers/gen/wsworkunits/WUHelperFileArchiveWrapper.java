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
 * Class name: WUHelperFileArchiveWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUHelperFileArchive
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUHelperFileArchiveWrapper
{
    protected String local_wuid;
    protected WUFileDownloadOptionWrapper local_downloadOption;
    protected ArrayOfWUFileOptionWrapper local_wUFileOptions;

    public WUHelperFileArchiveWrapper() {}

    public WUHelperFileArchiveWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUHelperFileArchive wuhelperfilearchive)
    {
        copy( wuhelperfilearchive );
    }
    public WUHelperFileArchiveWrapper( String _wuid, WUFileDownloadOptionWrapper _downloadOption, ArrayOfWUFileOptionWrapper _wUFileOptions )
    {
        this.local_wuid = _wuid;
        this.local_downloadOption = _downloadOption;
        this.local_wUFileOptions = _wUFileOptions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUHelperFileArchive raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        if (raw.getDownloadOption() != null)
            this.local_downloadOption = new WUFileDownloadOptionWrapper( raw.getDownloadOption());
        if (raw.getWUFileOptions() != null)
            this.local_wUFileOptions = new ArrayOfWUFileOptionWrapper( raw.getWUFileOptions());

    }

    @Override
    public String toString()
    {
        return "WUHelperFileArchiveWrapper [" + "wuid = " + local_wuid + ", " + "downloadOption = " + local_downloadOption + ", " + "wUFileOptions = " + local_wUFileOptions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUHelperFileArchive getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUHelperFileArchive raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUHelperFileArchive();
        raw.setWuid( local_wuid);
        if (local_downloadOption != null)
            raw.setDownloadOption( local_downloadOption.getRaw());
        if (local_wUFileOptions != null)
            raw.setWUFileOptions( local_wUFileOptions.getRaw());
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setDownloadOption( WUFileDownloadOptionWrapper _downloadOption )
    {
        this.local_downloadOption = _downloadOption;
    }
    public WUFileDownloadOptionWrapper getDownloadOption( )
    {
        return this.local_downloadOption;
    }
    public void setWUFileOptions( ArrayOfWUFileOptionWrapper _wUFileOptions )
    {
        this.local_wUFileOptions = _wUFileOptions;
    }
    public ArrayOfWUFileOptionWrapper getWUFileOptions( )
    {
        return this.local_wUFileOptions;
    }
}