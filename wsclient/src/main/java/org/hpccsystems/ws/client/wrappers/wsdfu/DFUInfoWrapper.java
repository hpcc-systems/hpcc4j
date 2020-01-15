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
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;

public class DFUInfoWrapper
{
    private DFUFileDetailWrapper     detailInfo;
    private ArrayOfEspExceptionWrapper exceptions = null;

    /**
     * Instantiates a new DFU info wrapper.
     *
     * @param resp
     *            the resp
     */
    public DFUInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUInfoResponse resp)
    {
        this.detailInfo = new DFUFileDetailWrapper(resp.getFileDetail());
        if (resp.getExceptions() != null && resp.getExceptions().getException() != null)
        {
            exceptions = new ArrayOfEspExceptionWrapper(resp.getExceptions());
        }
    }

    /**
     * Gets the file detail.
     *
     * @return the detailInfo
     */
    public DFUFileDetailWrapper getFileDetail()
    {
        return detailInfo;
    }

    /**
     * Sets the file detail.
     *
     * @param detailInfo
     *            the detailInfo to set
     */
    public void setFileDetail(DFUFileDetailWrapper detailInfo)
    {
        this.detailInfo = detailInfo;
    }

    /**
     * Gets the exceptions.
     *
     * @return the exceptions
     */
    public ArrayOfEspExceptionWrapper getExceptions()
    {
        return exceptions;
    }

    /**
     * Sets the exceptions.
     *
     * @param exceptions
     *            the exceptions to set
     */
    public void setExceptions(ArrayOfEspExceptionWrapper exceptions)
    {
        this.exceptions = exceptions;
    }
}
