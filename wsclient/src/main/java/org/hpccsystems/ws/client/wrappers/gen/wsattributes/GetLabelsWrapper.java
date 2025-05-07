package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: GetLabelsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetLabelsWrapper
{
    protected String local_name;

    public GetLabelsWrapper() {}

    public GetLabelsWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels getlabels)
    {
        copy( getlabels );
    }
    public GetLabelsWrapper( String _name )
    {
        this.local_name = _name;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();

    }

    @Override
    public String toString()
    {
        return "GetLabelsWrapper [" + "name = " + local_name + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels();
        raw.setName( local_name);
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
}