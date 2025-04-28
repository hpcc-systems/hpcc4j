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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GetRemoteTargetsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class GetRemoteTargetsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected List<String> local_targetNames = null;
    protected boolean local_allowForeign;

    public GetRemoteTargetsResponseWrapper() {}

    public GetRemoteTargetsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse getremotetargetsresponse)
    {
        copy( getremotetargetsresponse );
    }
    public GetRemoteTargetsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, List<String> _targetNames, boolean _allowForeign )
    {
        this.local_exceptions = _exceptions;
        this.local_targetNames = _targetNames;
        this.local_allowForeign = _allowForeign;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getTargetNames() != null && raw.getTargetNames().getItem() != null)
        {
            this.local_targetNames = new ArrayList<String>();
            for ( int i = 0; i < raw.getTargetNames().getItem().length; i++)
            {
                this.local_targetNames.add(new String(raw.getTargetNames().getItem()[i]));
            }
        }        this.local_allowForeign = raw.getAllowForeign();

    }

    @Override
    public String toString()
    {
        return "GetRemoteTargetsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "targetNames = " + local_targetNames + ", " + "allowForeign = " + local_allowForeign + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (this.local_targetNames!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_targetNames.size(); i++)
            {
                arr.addItem(this.local_targetNames.get(i));
            }
            raw.setTargetNames(arr);
        }
        raw.setAllowForeign( local_allowForeign);
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
    public void setTargetNames( List<String> _targetNames )
    {
        this.local_targetNames = _targetNames;
    }
    public List<String> getTargetNames( )
    {
        return this.local_targetNames;
    }
    public void setAllowForeign( boolean _allowForeign )
    {
        this.local_allowForeign = _allowForeign;
    }
    public boolean getAllowForeign( )
    {
        return this.local_allowForeign;
    }
}