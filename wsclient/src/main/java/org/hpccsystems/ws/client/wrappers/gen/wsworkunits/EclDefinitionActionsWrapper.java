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
 * Class name: EclDefinitionActionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EclDefinitionActions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.802Z
 */
public class EclDefinitionActionsWrapper
{
    protected String local_eclDefinitionActions;

    public EclDefinitionActionsWrapper() {}

    public EclDefinitionActionsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EclDefinitionActions ecldefinitionactions)
    {
        copy( ecldefinitionactions );
    }
    public EclDefinitionActionsWrapper( String _eclDefinitionActions )
    {
        this.local_eclDefinitionActions = _eclDefinitionActions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EclDefinitionActions raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getEclDefinitionActions();

    }

    @Override
    public String toString()
    {
        return "EclDefinitionActionsWrapper [" + "eclDefinitionActions = " + local_eclDefinitionActions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EclDefinitionActions getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EclDefinitionActions raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setEclDefinitionActions(eclDefinitionActions);
        return raw;
    }


    public void setEclDefinitionActions( String _eclDefinitionActions )
    {
        this.local_eclDefinitionActions = _eclDefinitionActions;
    }
    public String getEclDefinitionActions( )
    {
        return this.local_eclDefinitionActions;
    }
}