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

public class DFUFileCopyWrapper
{
    private Integer copyIndex;
    private Integer locationIndex;
    private String path;
    private String resolvedHost;

    public DFUFileCopyWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCopy soapdfufilecopy, String resolvedhost)
    {
        resolvedHost = resolvedhost;
        copyIndex = soapdfufilecopy.getCopyIndex();
        locationIndex = soapdfufilecopy.getLocationIndex();
        path = soapdfufilecopy.getPath();
    }

    public DFUFileCopyWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCopy soapdfufilecopy, String resolvedhost)
    {
        resolvedHost = resolvedhost;
        copyIndex = soapdfufilecopy.getCopyIndex();
        locationIndex = soapdfufilecopy.getLocationIndex();
        path = soapdfufilecopy.getPath();
    }

    public DFUFileCopyWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCopy soapdfufilecopy, String resolvedhost)
    {
        resolvedHost = resolvedhost;
        copyIndex = soapdfufilecopy.getCopyIndex();
        locationIndex = soapdfufilecopy.getLocationIndex();
        path = soapdfufilecopy.getPath();
    }

    public String getCopyHost()
    {
        return resolvedHost;
    }

    public String getCopyPath()
    {
        return path;
    }

    public Integer getCopyIndex()
    {
        return copyIndex;
    }
    
    public Integer getLocationIndex()
    {
        return locationIndex;
    }

    public void setLocationIndex(Integer locationIndex)
    {
        this.locationIndex = locationIndex;
    }
}
