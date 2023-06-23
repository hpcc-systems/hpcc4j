package org.hpccsystems.ws.client.wrappers.gen.wsdfu;

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
 * Class name: DFUDefFileFormatWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileFormat
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUDefFileFormatWrapper
{
    protected String local_dFUDefFileFormat;

    public DFUDefFileFormatWrapper() {}

    public DFUDefFileFormatWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileFormat dfudeffileformat)
    {
        copy( dfudeffileformat );
    }
    public DFUDefFileFormatWrapper( String _dFUDefFileFormat )
    {
        this.local_dFUDefFileFormat = _dFUDefFileFormat;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileFormat raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getDFUDefFileFormat();

    }

    @Override
    public String toString()
    {
        return "DFUDefFileFormatWrapper [" + "dFUDefFileFormat = " + local_dFUDefFileFormat + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileFormat getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileFormat raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUDefFileFormat(dFUDefFileFormat);
        return raw;
    }


    public void setDFUDefFileFormat( String _dFUDefFileFormat )
    {
        this.local_dFUDefFileFormat = _dFUDefFileFormat;
    }
    public String getDFUDefFileFormat( )
    {
        return this.local_dFUDefFileFormat;
    }
}