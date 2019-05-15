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

import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType;

public class DFUFileAccessInfoWrapper
{
    private String metaInfoBlob = null;
    private String expiryTime = null;
    private Integer numParts = null;
    private String recordTypeInfoJson = null;
    private Integer fileAccessPort = null;
    private Boolean fileAccessSSL = null;
    private byte[] recordTypeInfoBin = null; //1_39 specific

    private DFUFilePartWrapper [] wrappedDFUFileParts;
    private String [] allFilePartCopyHosts;
    private DFUFileType fileType = null; //from 1_51 on

    public DFUFileAccessInfoWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo soapdfufileaccessinfo, DFUFileType filetype) throws Exception
    {
        if (soapdfufileaccessinfo != null)
        {
            metaInfoBlob = soapdfufileaccessinfo.getMetaInfoBlob();
            expiryTime = soapdfufileaccessinfo.getExpiryTime();
            numParts = soapdfufileaccessinfo.getNumParts();
            recordTypeInfoJson = soapdfufileaccessinfo.getRecordTypeInfoJson();
            fileAccessPort = soapdfufileaccessinfo.getFileAccessPort();
            fileAccessSSL = soapdfufileaccessinfo.getFileAccessSSL();
            fileType = filetype;

            wrappedDFUFileParts = wrapAndResolveFileParts(soapdfufileaccessinfo.getFileLocations(), soapdfufileaccessinfo.getFileParts());

            org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPartLocation[] locations = soapdfufileaccessinfo.getFileLocations();
            allFilePartCopyHosts = new String [locations.length];
            for (int i = 0; i < locations.length; i++)
            {
                allFilePartCopyHosts[i] = locations[i].getHost();
            }
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }

    public DFUFileAccessInfoWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessInfo soapdfufileaccessinfo) throws Exception
    {
        if (soapdfufileaccessinfo != null)
        {
            metaInfoBlob = soapdfufileaccessinfo.getMetaInfoBlob();
            expiryTime = soapdfufileaccessinfo.getExpiryTime();
            numParts = soapdfufileaccessinfo.getNumParts();
            recordTypeInfoJson = soapdfufileaccessinfo.getRecordTypeInfoJson();
            fileAccessPort = soapdfufileaccessinfo.getFileAccessPort();
            fileAccessSSL = soapdfufileaccessinfo.getFileAccessSSL();

            wrappedDFUFileParts = wrapAndResolveFileParts(soapdfufileaccessinfo.getFileLocations(), soapdfufileaccessinfo.getFileParts());

            org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUPartLocation[] locations = soapdfufileaccessinfo.getFileLocations();
            allFilePartCopyHosts = new String [locations.length];
            for (int i = 0; i < locations.length; i++)
            {
                allFilePartCopyHosts[i] = locations[i].getHost();
            }
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }

    public DFUFileAccessInfoWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessInfo soapdfufileaccessinfo) throws Exception
    {
        if (soapdfufileaccessinfo != null)
        {
            metaInfoBlob = soapdfufileaccessinfo.getMetaInfoBlob();
            expiryTime = soapdfufileaccessinfo.getExpiryTime();
            numParts = soapdfufileaccessinfo.getNumParts();
            recordTypeInfoJson = soapdfufileaccessinfo.getRecordTypeInfoJson();
            fileAccessPort = soapdfufileaccessinfo.getFileAccessPort();
            fileAccessSSL = soapdfufileaccessinfo.getFileAccessSSL();
            recordTypeInfoBin = soapdfufileaccessinfo.getRecordTypeInfoBin();

            wrappedDFUFileParts = wrapAndResolveFileParts(soapdfufileaccessinfo.getFileLocations(), soapdfufileaccessinfo.getFileParts());

            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocation[] locations = soapdfufileaccessinfo.getFileLocations();
            allFilePartCopyHosts = new String [locations.length];
            for (int i = 0; i < locations.length; i++)
            {
                allFilePartCopyHosts[i] = locations[i].getHost();
            }
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }

    static public DFUFilePartWrapper [] wrapAndResolveFileParts(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPartLocation[] locations, org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePart[] fileparts) throws Exception
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
            Integer filepartindex = fileparts[i].getPartIndex();
            if (filepartindex  < 1 || filepartindex > fileparts.length)
                throw new IndexOutOfBoundsException("Encountered invalid Filepart index: '" + filepartindex + "'");

            if ( wrappedDFUFileParts[filepartindex-1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + filepartindex + "'");

            wrappedDFUFileParts[filepartindex-1] = new DFUFilePartWrapper(fileparts[i], availableLocations);
        }
        return wrappedDFUFileParts;
    }

    static public DFUFilePartWrapper [] wrapAndResolveFileParts(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUPartLocation[] locations, org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePart[] fileparts) throws Exception
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
            Integer filepartindex = fileparts[i].getPartIndex();
            if (filepartindex  < 1 || filepartindex > fileparts.length)
                throw new IndexOutOfBoundsException("Encountered invalid Filepart index: '" + filepartindex + "'");

            if ( wrappedDFUFileParts[filepartindex-1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + filepartindex + "'");

            wrappedDFUFileParts[filepartindex-1] = new DFUFilePartWrapper(fileparts[i], availableLocations);
        }
        return wrappedDFUFileParts;
    }

    static public DFUFilePartWrapper [] wrapAndResolveFileParts(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocation[] locations, org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFilePart[] fileparts) throws Exception
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
            Integer filepartindex = fileparts[i].getPartIndex();
            if (filepartindex  < 1 || filepartindex > fileparts.length)
                throw new IndexOutOfBoundsException("Encountered invalid Filepart index: '" + filepartindex + "'");

            if ( wrappedDFUFileParts[filepartindex-1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + filepartindex + "'");

            wrappedDFUFileParts[filepartindex-1] = new DFUFilePartWrapper(fileparts[i], availableLocations);
        }
        return wrappedDFUFileParts;
    }

    public DFUFileType getFileType()
    {
        return fileType;
    }

    public String getFileAccessInfoBlob()
    {
        return metaInfoBlob;
    }

    public String getExpiryTime()
    {
        return expiryTime;
    }

    /**
     * Gets the numParts value for this DFUFileAccessInfo.
     *
     * @return numParts
     */
    public int getNumParts()
    {
        return numParts;
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
     * Only available on HPCC 7.0.x versions
     * @return recordTypeInfoBin
     */
    public byte[] getRecordTypeInfoBin()
    {
        return recordTypeInfoBin;
    }

    /**
     * Gets the recordTypeInfoJson value for this DFUFileAccessInfo.
     *
     * @return recordTypeInfoJson
     */
    public java.lang.String getRecordTypeInfoJson()
    {
        return recordTypeInfoJson;
    }

    public String [] getAllFilePartCopyLocations()
    {
        return allFilePartCopyHosts;
    }

    public Integer getFileAccessPort()
    {
        return fileAccessPort;
    }

    public Boolean getFileAccessSSL()
    {
        return fileAccessSSL;
    }
}
