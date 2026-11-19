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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfDFUFileRenameResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class ArrayOfDFUFileRenameResultWrapper
{
    protected List<DFUFileRenameResultWrapper> local_dFUFileRenameResult = null;

    public ArrayOfDFUFileRenameResultWrapper() {}

    public ArrayOfDFUFileRenameResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameResult arrayofdfufilerenameresult)
    {
        copy( arrayofdfufilerenameresult );
    }
    public ArrayOfDFUFileRenameResultWrapper( List<DFUFileRenameResultWrapper> _dFUFileRenameResult )
    {
        this.local_dFUFileRenameResult = _dFUFileRenameResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameResult raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFileRenameResult() != null)
        {
            this.local_dFUFileRenameResult = new ArrayList<DFUFileRenameResultWrapper>();
            for ( int i = 0; i < raw.getDFUFileRenameResult().length; i++)
            {
                this.local_dFUFileRenameResult.add(new DFUFileRenameResultWrapper(raw.getDFUFileRenameResult()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFileRenameResultWrapper [" + "dFUFileRenameResult = " + local_dFUFileRenameResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameResult raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileRenameResult();
        if (this.local_dFUFileRenameResult!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameResult[this.local_dFUFileRenameResult.size()];
            for ( int i = 0; i < this.local_dFUFileRenameResult.size(); i++)
            {
                arr[i] = this.local_dFUFileRenameResult.get(i) .getRaw();
            }
            raw.setDFUFileRenameResult(arr);
        }
        return raw;
    }


    public void setDFUFileRenameResult( List<DFUFileRenameResultWrapper> _dFUFileRenameResult )
    {
        this.local_dFUFileRenameResult = _dFUFileRenameResult;
    }
    public List<DFUFileRenameResultWrapper> getDFUFileRenameResult( )
    {
        return this.local_dFUFileRenameResult;
    }
}