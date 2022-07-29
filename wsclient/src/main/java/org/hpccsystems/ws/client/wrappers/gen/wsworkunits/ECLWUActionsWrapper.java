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
 * Class name: ECLWUActionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUActions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.824Z
 */
public class ECLWUActionsWrapper
{
    protected String local_eCLWUActions;

    public ECLWUActionsWrapper() {}

    public ECLWUActionsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUActions eclwuactions)
    {
        copy( eclwuactions );
    }
    public ECLWUActionsWrapper( String _eCLWUActions )
    {
        this.local_eCLWUActions = _eCLWUActions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUActions raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getECLWUActions();

    }

    @Override
    public String toString()
    {
        return "ECLWUActionsWrapper [" + "eCLWUActions = " + local_eCLWUActions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUActions getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUActions raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setECLWUActions(eCLWUActions);
        return raw;
    }


    public void setECLWUActions( String _eCLWUActions )
    {
        this.local_eCLWUActions = _eCLWUActions;
    }
    public String getECLWUActions( )
    {
        return this.local_eCLWUActions;
    }
}