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
 * Class name: DeploymentFeaturesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DeploymentFeatures
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.801Z
 */
public class DeploymentFeaturesWrapper
{
    protected boolean local_useCompression;

    public DeploymentFeaturesWrapper() {}

    public DeploymentFeaturesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DeploymentFeatures deploymentfeatures)
    {
        copy( deploymentfeatures );
    }
    public DeploymentFeaturesWrapper( boolean _useCompression )
    {
        this.local_useCompression = _useCompression;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DeploymentFeatures raw )
    {
        if (raw == null)
            return;

        this.local_useCompression = raw.getUseCompression();

    }

    @Override
    public String toString()
    {
        return "DeploymentFeaturesWrapper [" + "useCompression = " + local_useCompression + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DeploymentFeatures getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DeploymentFeatures raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DeploymentFeatures();
        raw.setUseCompression( local_useCompression);
        return raw;
    }


    public void setUseCompression( boolean _useCompression )
    {
        this.local_useCompression = _useCompression;
    }
    public boolean getUseCompression( )
    {
        return this.local_useCompression;
    }
}