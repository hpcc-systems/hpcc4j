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
 * Class name: RoxieQueueFilterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.RoxieQueueFilter
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class RoxieQueueFilterWrapper
{
    protected String local_roxieQueueFilter;

    public RoxieQueueFilterWrapper() {}

    public RoxieQueueFilterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.RoxieQueueFilter roxiequeuefilter)
    {
        copy( roxiequeuefilter );
    }
    public RoxieQueueFilterWrapper( String _roxieQueueFilter )
    {
        this.local_roxieQueueFilter = _roxieQueueFilter;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.RoxieQueueFilter raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getRoxieQueueFilter();

    }

    @Override
    public String toString()
    {
        return "RoxieQueueFilterWrapper [" + "roxieQueueFilter = " + local_roxieQueueFilter + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.RoxieQueueFilter getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.RoxieQueueFilter raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setRoxieQueueFilter(roxieQueueFilter);
        return raw;
    }


    public void setRoxieQueueFilter( String _roxieQueueFilter )
    {
        this.local_roxieQueueFilter = _roxieQueueFilter;
    }
    public String getRoxieQueueFilter( )
    {
        return this.local_roxieQueueFilter;
    }
}