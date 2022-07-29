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
 * Class name: DFUActionInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.092Z
 */
public class DFUActionInfoWrapper
{
    protected String local_fileName;
    protected String local_nodeGroup;
    protected String local_actionResult;
    protected boolean local_failed;

    public DFUActionInfoWrapper() {}

    public DFUActionInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo dfuactioninfo)
    {
        copy( dfuactioninfo );
    }
    public DFUActionInfoWrapper( String _fileName, String _nodeGroup, String _actionResult, boolean _failed )
    {
        this.local_fileName = _fileName;
        this.local_nodeGroup = _nodeGroup;
        this.local_actionResult = _actionResult;
        this.local_failed = _failed;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo raw )
    {
        if (raw == null)
            return;

        this.local_fileName = raw.getFileName();
        this.local_nodeGroup = raw.getNodeGroup();
        this.local_actionResult = raw.getActionResult();
        this.local_failed = raw.getFailed();

    }

    @Override
    public String toString()
    {
        return "DFUActionInfoWrapper [" + "fileName = " + local_fileName + ", " + "nodeGroup = " + local_nodeGroup + ", " + "actionResult = " + local_actionResult + ", " + "failed = " + local_failed + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo();
        raw.setFileName( local_fileName);
        raw.setNodeGroup( local_nodeGroup);
        raw.setActionResult( local_actionResult);
        raw.setFailed( local_failed);
        return raw;
    }


    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setNodeGroup( String _nodeGroup )
    {
        this.local_nodeGroup = _nodeGroup;
    }
    public String getNodeGroup( )
    {
        return this.local_nodeGroup;
    }
    public void setActionResult( String _actionResult )
    {
        this.local_actionResult = _actionResult;
    }
    public String getActionResult( )
    {
        return this.local_actionResult;
    }
    public void setFailed( boolean _failed )
    {
        this.local_failed = _failed;
    }
    public boolean getFailed( )
    {
        return this.local_failed;
    }
}