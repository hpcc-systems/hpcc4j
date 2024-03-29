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
 * Class name: DFUFileTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileTypeWrapper
{
    protected String local_dFUFileType;

    public DFUFileTypeWrapper() {}

    public DFUFileTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType dfufiletype)
    {
        copy( dfufiletype );
    }
    public DFUFileTypeWrapper( String _dFUFileType )
    {
        this.local_dFUFileType = _dFUFileType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getDFUFileType();

    }

    @Override
    public String toString()
    {
        return "DFUFileTypeWrapper [" + "dFUFileType = " + local_dFUFileType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUFileType(dFUFileType);
        return raw;
    }


    public void setDFUFileType( String _dFUFileType )
    {
        this.local_dFUFileType = _dFUFileType;
    }
    public String getDFUFileType( )
    {
        return this.local_dFUFileType;
    }
}