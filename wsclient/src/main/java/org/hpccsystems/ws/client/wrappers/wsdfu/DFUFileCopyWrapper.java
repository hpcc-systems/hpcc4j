/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.ws.client.wrappers.wsdfu;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy;

public class DFUFileCopyWrapper
{
    private Integer copyIndex;
    private Integer locationIndex;
    private String path;
    private String resolvedHost;

    /**
     * Instantiates a new DFU file copy wrapper.
     *
     * @param dfuFileCopy
     *            the dfu file copy
     * @param resolvedhost
     *            the resolvedhost
     */
    public DFUFileCopyWrapper(DFUFileCopy dfuFileCopy, String resolvedhost)
    {
        resolvedHost = resolvedhost;
        copyIndex = dfuFileCopy.getCopyIndex();
        locationIndex = dfuFileCopy.getLocationIndex();
        path = dfuFileCopy.getPath();
    }



    /**
     * Gets the copy host.
     *
     * @return the copy host
     */
    public String getCopyHost()
    {
        return resolvedHost;
    }

    /**
     * Gets the copy path.
     *
     * @return the copy path
     */
    public String getCopyPath()
    {
        return path;
    }

    /**
     * Gets the copy index.
     *
     * @return the copy index
     */
    public Integer getCopyIndex()
    {
        return copyIndex;
    }

    /**
     * Gets the location index.
     *
     * @return the location index
     */
    public Integer getLocationIndex()
    {
        return locationIndex;
    }

    /**
     * Sets the location index.
     *
     * @param locationIndex
     *            the new location index
     */
    public void setLocationIndex(Integer locationIndex)
    {
        this.locationIndex = locationIndex;
    }
}
