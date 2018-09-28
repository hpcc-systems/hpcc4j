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

import java.util.Hashtable;

import org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessInfo;
import org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFilePart;
import org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocation;

public class DFUFileAccessInfoWrapper
{
    private DFUFileAccessInfo origDFUFileAccessInfo;
    private DFUFilePartWrapper [] wrappedDFUFileParts;
    private String [] allFilePartCopyHosts;

    public DFUFileAccessInfoWrapper(DFUFileAccessInfo soapdfufileaccessinfo) throws Exception
    {
        origDFUFileAccessInfo = soapdfufileaccessinfo;
        if (soapdfufileaccessinfo != null)
        {
            wrappedDFUFileParts = wrapAndResolveFileParts(soapdfufileaccessinfo.getFileLocations(),soapdfufileaccessinfo.getFileParts());
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }

    static public DFUFilePartWrapper [] wrapAndResolveFileParts(DFUPartLocation[] locations, DFUFilePart [] fileparts) throws Exception
    {
        if(locations == null || locations.length == 0)
            throw new Exception("Encountered empty DFU Part Locations array");
        if(fileparts == null || fileparts.length == 0)
            throw new Exception("Encountered empty DFU Parts array");

        Hashtable<Integer, String> availableLocations = new Hashtable<Integer, String>(locations.length);

        for (int locationindex = 0; locationindex < locations.length; locationindex++)
        {
            availableLocations.put(locations[locationindex].getLocationIndex(), locations[locationindex].getHost());
        }

        DFUFilePartWrapper [] wrappedDFUFileParts = new DFUFilePartWrapper[fileparts.length];
        for (int i = 0; i < fileparts.length; i++)
        {
            wrappedDFUFileParts[fileparts[i].getPartIndex()] = new DFUFilePartWrapper(fileparts[i], availableLocations);
        }
        return wrappedDFUFileParts;
    }

    public String getFileAccessInfoBlob()
    {
        return origDFUFileAccessInfo.getMetaInfoBlob();
    }

    public String getExpiryTime()
    {
        return origDFUFileAccessInfo.getExpiryTime();
    }

    /**
     * Gets the numParts value for this DFUFileAccessInfo.
     *
     * @return numParts
     */
    public int getNumParts()
    {
        return origDFUFileAccessInfo.getNumParts();
    }

    /**
     * Gets the fileParts value for this DFUFileAccessInfo.
     *
     * @return fileParts
     */
    public DFUFilePartWrapper [] getFileParts()
    {
        return wrappedDFUFileParts;
    }

    /**
     * Gets the recordTypeInfoBin value for this DFUFileAccessInfo.
     *
     * @return recordTypeInfoBin
     */
    public byte[] getRecordTypeInfoBin()
    {
        return origDFUFileAccessInfo.getRecordTypeInfoBin();
    }

    /**
     * Gets the recordTypeInfoJson value for this DFUFileAccessInfo.
     *
     * @return recordTypeInfoJson
     */
    public java.lang.String getRecordTypeInfoJson()
    {
        return origDFUFileAccessInfo.getRecordTypeInfoJson();
    }

    public String [] getAllFilePartCopyLocations()
    {
        if (allFilePartCopyHosts == null)
        {
            DFUPartLocation[] locations = origDFUFileAccessInfo.getFileLocations();
            allFilePartCopyHosts = new String [locations.length];
            for (int i = 0; i < locations.length; i++)
            {
                allFilePartCopyHosts[i] = locations[i].getHost();
            }
        }
        return allFilePartCopyHosts;
    }

    public Integer getFileAccessPort()
    {
        return origDFUFileAccessInfo.getFileAccessPort();
    }

    public Boolean getFileAccessSSL()
    {
        return origDFUFileAccessInfo.getFileAccessSSL();
    }
}
