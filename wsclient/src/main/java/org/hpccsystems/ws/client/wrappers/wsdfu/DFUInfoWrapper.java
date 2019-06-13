/*
 * ##############################################################################
 * 
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * ##############################################################################
 */

package org.hpccsystems.ws.client.wrappers.wsdfu;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspException;
import org.hpccsystems.ws.client.wrappers.WUExceptionWrapper;

public class DFUInfoWrapper
{
    private DFUFileDetailWrapper     detailInfo;
    private List<WUExceptionWrapper> exceptions = new ArrayList<WUExceptionWrapper>();

    public DFUInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUInfoResponse resp)
    {
        this.detailInfo = new DFUFileDetailWrapper(resp.getFileDetail());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null)
        {
            EspException[] espExceptions = resp.getExceptions().getException();
            for (int i = 0; i < espExceptions.length; i++)
            {
                this.exceptions.add(new WUExceptionWrapper(espExceptions[i]));
            }
        }
    }

    /**
     * @return the detailInfo
     */
    public DFUFileDetailWrapper getFileDetail()
    {
        return detailInfo;
    }

    /**
     * @param detailInfo
     *            the detailInfo to set
     */
    public void setFileDetail(DFUFileDetailWrapper detailInfo)
    {
        this.detailInfo = detailInfo;
    }

    /**
     * @return the exceptions
     */
    public List<WUExceptionWrapper> getExceptions()
    {
        return exceptions;
    }

    /**
     * @param exceptions
     *            the exceptions to set
     */
    public void setExceptions(List<WUExceptionWrapper> exceptions)
    {
        this.exceptions = exceptions;
    }
}
