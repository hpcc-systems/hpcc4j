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
 * Class name: UpdateDFUWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.852Z
 */
public class UpdateDFUWorkunitWrapper
{
    protected DFUWorkunitWrapper local_wu;
    protected String local_clusterOrig;
    protected String local_jobNameOrig;
    protected boolean local_isProtectedOrig;
    protected int local_stateOrig;

    public UpdateDFUWorkunitWrapper() {}

    public UpdateDFUWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit updatedfuworkunit)
    {
        copy( updatedfuworkunit );
    }
    public UpdateDFUWorkunitWrapper( DFUWorkunitWrapper _wu, String _clusterOrig, String _jobNameOrig, boolean _isProtectedOrig, int _stateOrig )
    {
        this.local_wu = _wu;
        this.local_clusterOrig = _clusterOrig;
        this.local_jobNameOrig = _jobNameOrig;
        this.local_isProtectedOrig = _isProtectedOrig;
        this.local_stateOrig = _stateOrig;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit raw )
    {
        if (raw == null)
            return;

        if (raw.getWu() != null)
            this.local_wu = new DFUWorkunitWrapper( raw.getWu());
        this.local_clusterOrig = raw.getClusterOrig();
        this.local_jobNameOrig = raw.getJobNameOrig();
        this.local_isProtectedOrig = raw.getIsProtectedOrig();
        this.local_stateOrig = raw.getStateOrig();

    }

    @Override
    public String toString()
    {
        return "UpdateDFUWorkunitWrapper [" + "wu = " + local_wu + ", " + "clusterOrig = " + local_clusterOrig + ", " + "jobNameOrig = " + local_jobNameOrig + ", " + "isProtectedOrig = " + local_isProtectedOrig + ", " + "stateOrig = " + local_stateOrig + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit();
        if (local_wu != null)
            raw.setWu( local_wu.getRaw());
        raw.setClusterOrig( local_clusterOrig);
        raw.setJobNameOrig( local_jobNameOrig);
        raw.setIsProtectedOrig( local_isProtectedOrig);
        raw.setStateOrig( local_stateOrig);
        return raw;
    }


    public void setWu( DFUWorkunitWrapper _wu )
    {
        this.local_wu = _wu;
    }
    public DFUWorkunitWrapper getWu( )
    {
        return this.local_wu;
    }
    public void setClusterOrig( String _clusterOrig )
    {
        this.local_clusterOrig = _clusterOrig;
    }
    public String getClusterOrig( )
    {
        return this.local_clusterOrig;
    }
    public void setJobNameOrig( String _jobNameOrig )
    {
        this.local_jobNameOrig = _jobNameOrig;
    }
    public String getJobNameOrig( )
    {
        return this.local_jobNameOrig;
    }
    public void setIsProtectedOrig( boolean _isProtectedOrig )
    {
        this.local_isProtectedOrig = _isProtectedOrig;
    }
    public boolean getIsProtectedOrig( )
    {
        return this.local_isProtectedOrig;
    }
    public void setStateOrig( int _stateOrig )
    {
        this.local_stateOrig = _stateOrig;
    }
    public int getStateOrig( )
    {
        return this.local_stateOrig;
    }
}