package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * WrapperMaker version: 1.7
 * Class name: TpDropZoneQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class TpDropZoneQueryRequestWrapper
{
    protected String local_name;
    protected boolean local_eCLWatchVisibleOnly;

    public TpDropZoneQueryRequestWrapper() {}

    public TpDropZoneQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest tpdropzonequeryrequest)
    {
        copy( tpdropzonequeryrequest );
    }
    public TpDropZoneQueryRequestWrapper( String _name, boolean _eCLWatchVisibleOnly )
    {
        this.local_name = _name;
        this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_eCLWatchVisibleOnly = raw.getECLWatchVisibleOnly();

    }

    @Override
    public String toString()
    {
        return "TpDropZoneQueryRequestWrapper [" + "name = " + local_name + ", " + "eCLWatchVisibleOnly = " + local_eCLWatchVisibleOnly + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest();
        raw.setName( local_name);
        raw.setECLWatchVisibleOnly( local_eCLWatchVisibleOnly);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setECLWatchVisibleOnly( boolean _eCLWatchVisibleOnly )
    {
        this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
    }
    public boolean getECLWatchVisibleOnly( )
    {
        return this.local_eCLWatchVisibleOnly;
    }
}