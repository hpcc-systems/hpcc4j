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
 * Class name: TpConfigResponseFormatWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResponseFormat
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpConfigResponseFormatWrapper
{
    protected String local_tpConfigResponseFormat;

    public TpConfigResponseFormatWrapper() {}

    public TpConfigResponseFormatWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResponseFormat tpconfigresponseformat)
    {
        copy( tpconfigresponseformat );
    }
    public TpConfigResponseFormatWrapper( String _tpConfigResponseFormat )
    {
        this.local_tpConfigResponseFormat = _tpConfigResponseFormat;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResponseFormat raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getTpConfigResponseFormat();

    }

    @Override
    public String toString()
    {
        return "TpConfigResponseFormatWrapper [" + "tpConfigResponseFormat = " + local_tpConfigResponseFormat + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResponseFormat getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResponseFormat raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setTpConfigResponseFormat(tpConfigResponseFormat);
        return raw;
    }


    public void setTpConfigResponseFormat( String _tpConfigResponseFormat )
    {
        this.local_tpConfigResponseFormat = _tpConfigResponseFormat;
    }
    public String getTpConfigResponseFormat( )
    {
        return this.local_tpConfigResponseFormat;
    }
}