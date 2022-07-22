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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfLogicalFileUploadWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfLogicalFileUpload
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.785Z
 */
public class ArrayOfLogicalFileUploadWrapper
{
    protected List<LogicalFileUploadWrapper> local_logicalFileUpload = null;

    public ArrayOfLogicalFileUploadWrapper() {}

    public ArrayOfLogicalFileUploadWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfLogicalFileUpload arrayoflogicalfileupload)
    {
        copy( arrayoflogicalfileupload );
    }
    public ArrayOfLogicalFileUploadWrapper( List<LogicalFileUploadWrapper> _logicalFileUpload )
    {
        this.local_logicalFileUpload = _logicalFileUpload;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfLogicalFileUpload raw )
    {
        if (raw == null)
            return;

        if (raw.getLogicalFileUpload() != null)
        {
            this.local_logicalFileUpload = new ArrayList<LogicalFileUploadWrapper>();
            for ( int i = 0; i < raw.getLogicalFileUpload().length; i++)
            {
                this.local_logicalFileUpload.add(new LogicalFileUploadWrapper(raw.getLogicalFileUpload()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfLogicalFileUploadWrapper [" + "logicalFileUpload = " + local_logicalFileUpload + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfLogicalFileUpload getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfLogicalFileUpload raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfLogicalFileUpload();
        if (this.local_logicalFileUpload!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileUpload[this.local_logicalFileUpload.size()];
            for ( int i = 0; i < this.local_logicalFileUpload.size(); i++)
            {
                arr[i] = this.local_logicalFileUpload.get(i) .getRaw();
            }
            raw.setLogicalFileUpload(arr);
        }
        return raw;
    }


    public void setLogicalFileUpload( List<LogicalFileUploadWrapper> _logicalFileUpload )
    {
        this.local_logicalFileUpload = _logicalFileUpload;
    }
    public List<LogicalFileUploadWrapper> getLogicalFileUpload( )
    {
        return this.local_logicalFileUpload;
    }
}