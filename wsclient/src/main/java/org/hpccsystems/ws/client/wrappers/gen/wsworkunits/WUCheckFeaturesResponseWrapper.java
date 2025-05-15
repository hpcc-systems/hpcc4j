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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUCheckFeaturesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeaturesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUCheckFeaturesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_buildVersionMajor;
    protected int local_buildVersionMinor;
    protected int local_buildVersionPoint;
    protected UnsignedInt local_maxRequestEntityLength;
    protected DeploymentFeaturesWrapper local_deployment;
    protected String local_buildVersion;
    protected String local_buildMaturity;
    protected String local_buildTagTimestamp;

    public WUCheckFeaturesResponseWrapper() {}

    public WUCheckFeaturesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeaturesResponse wucheckfeaturesresponse)
    {
        copy( wucheckfeaturesresponse );
    }
    public WUCheckFeaturesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _buildVersionMajor, int _buildVersionMinor, int _buildVersionPoint, UnsignedInt _maxRequestEntityLength, DeploymentFeaturesWrapper _deployment, String _buildVersion, String _buildMaturity, String _buildTagTimestamp )
    {
        this.local_exceptions = _exceptions;
        this.local_buildVersionMajor = _buildVersionMajor;
        this.local_buildVersionMinor = _buildVersionMinor;
        this.local_buildVersionPoint = _buildVersionPoint;
        this.local_maxRequestEntityLength = _maxRequestEntityLength;
        this.local_deployment = _deployment;
        this.local_buildVersion = _buildVersion;
        this.local_buildMaturity = _buildMaturity;
        this.local_buildTagTimestamp = _buildTagTimestamp;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeaturesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_buildVersionMajor = raw.getBuildVersionMajor();
        this.local_buildVersionMinor = raw.getBuildVersionMinor();
        this.local_buildVersionPoint = raw.getBuildVersionPoint();
        this.local_maxRequestEntityLength = raw.getMaxRequestEntityLength();
        if (raw.getDeployment() != null)
            this.local_deployment = new DeploymentFeaturesWrapper( raw.getDeployment());
        this.local_buildVersion = raw.getBuildVersion();
        this.local_buildMaturity = raw.getBuildMaturity();
        this.local_buildTagTimestamp = raw.getBuildTagTimestamp();

    }

    @Override
    public String toString()
    {
        return "WUCheckFeaturesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "buildVersionMajor = " + local_buildVersionMajor + ", " + "buildVersionMinor = " + local_buildVersionMinor + ", " + "buildVersionPoint = " + local_buildVersionPoint + ", " + "maxRequestEntityLength = " + local_maxRequestEntityLength + ", " + "deployment = " + local_deployment + ", " + "buildVersion = " + local_buildVersion + ", " + "buildMaturity = " + local_buildMaturity + ", " + "buildTagTimestamp = " + local_buildTagTimestamp + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeaturesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeaturesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeaturesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setBuildVersionMajor( local_buildVersionMajor);
        raw.setBuildVersionMinor( local_buildVersionMinor);
        raw.setBuildVersionPoint( local_buildVersionPoint);
        raw.setMaxRequestEntityLength( local_maxRequestEntityLength);
        if (local_deployment != null)
            raw.setDeployment( local_deployment.getRaw());
        raw.setBuildVersion( local_buildVersion);
        raw.setBuildMaturity( local_buildMaturity);
        raw.setBuildTagTimestamp( local_buildTagTimestamp);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setBuildVersionMajor( int _buildVersionMajor )
    {
        this.local_buildVersionMajor = _buildVersionMajor;
    }
    public int getBuildVersionMajor( )
    {
        return this.local_buildVersionMajor;
    }
    public void setBuildVersionMinor( int _buildVersionMinor )
    {
        this.local_buildVersionMinor = _buildVersionMinor;
    }
    public int getBuildVersionMinor( )
    {
        return this.local_buildVersionMinor;
    }
    public void setBuildVersionPoint( int _buildVersionPoint )
    {
        this.local_buildVersionPoint = _buildVersionPoint;
    }
    public int getBuildVersionPoint( )
    {
        return this.local_buildVersionPoint;
    }
    public void setMaxRequestEntityLength( UnsignedInt _maxRequestEntityLength )
    {
        this.local_maxRequestEntityLength = _maxRequestEntityLength;
    }
    public UnsignedInt getMaxRequestEntityLength( )
    {
        return this.local_maxRequestEntityLength;
    }
    public void setDeployment( DeploymentFeaturesWrapper _deployment )
    {
        this.local_deployment = _deployment;
    }
    public DeploymentFeaturesWrapper getDeployment( )
    {
        return this.local_deployment;
    }
    public void setBuildVersion( String _buildVersion )
    {
        this.local_buildVersion = _buildVersion;
    }
    public String getBuildVersion( )
    {
        return this.local_buildVersion;
    }
    public void setBuildMaturity( String _buildMaturity )
    {
        this.local_buildMaturity = _buildMaturity;
    }
    public String getBuildMaturity( )
    {
        return this.local_buildMaturity;
    }
    public void setBuildTagTimestamp( String _buildTagTimestamp )
    {
        this.local_buildTagTimestamp = _buildTagTimestamp;
    }
    public String getBuildTagTimestamp( )
    {
        return this.local_buildTagTimestamp;
    }
}