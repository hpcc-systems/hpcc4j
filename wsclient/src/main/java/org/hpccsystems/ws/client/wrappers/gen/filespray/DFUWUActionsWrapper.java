package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: DFUWUActionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUActions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * Service version: 1.23
 */
public class DFUWUActionsWrapper
{
    protected String local_dFUWUActions;

    public DFUWUActionsWrapper() {}

    public DFUWUActionsWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUActions dfuwuactions)
    {
        copy( dfuwuactions );
    }
    public DFUWUActionsWrapper( String _dFUWUActions )
    {
        this.local_dFUWUActions = _dFUWUActions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUActions raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getDFUWUActions();

    }

    @Override
    public String toString()
    {
        return "DFUWUActionsWrapper [" + "dFUWUActions = " + local_dFUWUActions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUActions getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUActions raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUWUActions(dFUWUActions);
        return raw;
    }


    public void setDFUWUActions( String _dFUWUActions )
    {
        this.local_dFUWUActions = _dFUWUActions;
    }
    public String getDFUWUActions( )
    {
        return this.local_dFUWUActions;
    }
}