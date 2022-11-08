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
 * WrapperMaker version: 1.7
 * Class name: DFUArrayActionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class DFUArrayActionsWrapper
{
    protected String local_dFUArrayActions;

    public DFUArrayActionsWrapper() {}

    public DFUArrayActionsWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions dfuarrayactions)
    {
        copy( dfuarrayactions );
    }
    public DFUArrayActionsWrapper( String _dFUArrayActions )
    {
        this.local_dFUArrayActions = _dFUArrayActions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getDFUArrayActions();

    }

    @Override
    public String toString()
    {
        return "DFUArrayActionsWrapper [" + "dFUArrayActions = " + local_dFUArrayActions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUArrayActions(dFUArrayActions);
        return raw;
    }


    public void setDFUArrayActions( String _dFUArrayActions )
    {
        this.local_dFUArrayActions = _dFUArrayActions;
    }
    public String getDFUArrayActions( )
    {
        return this.local_dFUArrayActions;
    }
}