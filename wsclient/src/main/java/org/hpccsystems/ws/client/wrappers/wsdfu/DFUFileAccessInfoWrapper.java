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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;

import javax.activation.DataHandler;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPartLocation;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessInfo;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePart;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileType;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPartLocation;

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
    private DFUFileTypeWrapper fileType = null; //from 1_51 on

    public DFUFileAccessInfoWrapper(DFUFileAccessInfo accessInfo, DFUFileType filetype) throws Exception
    {
        if (accessInfo != null)
        {
            metaInfoBlob = accessInfo.getMetaInfoBlob();
            expiryTime = accessInfo.getExpiryTime();
            numParts = accessInfo.getNumParts();
            recordTypeInfoJson = accessInfo.getRecordTypeInfoJson();
            fileAccessPort = accessInfo.getFileAccessPort();
            fileAccessSSL = accessInfo.getFileAccessSSL();
            fileType = DFUFileTypeWrapper.fromDfuFileType(filetype);

            ArrayOfDFUPartLocation fileLocations = accessInfo.getFileLocations();
            if (fileLocations != null)
            {
                DFUPartLocation[] dfufileLocations = fileLocations.getDFUPartLocation();
                wrappedDFUFileParts = wrapAndResolveFileParts(dfufileLocations, accessInfo.getFileParts().getDFUFilePart());
    
                allFilePartCopyHosts = new String [dfufileLocations.length];
                for (int i = 0; i < dfufileLocations.length; i++)
                {
                    allFilePartCopyHosts[i] = dfufileLocations[i].getHost();
                }
            }
            else
                throw new Exception("Could not construct DFUCreateFileWrapper: empty file locations");
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");

    }

    public DFUFileAccessInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessInfo accessInfo) throws Exception
    {
        if (accessInfo != null)
        {
            metaInfoBlob = accessInfo.getMetaInfoBlob();
            expiryTime = accessInfo.getExpiryTime();
            numParts = accessInfo.getNumParts();
            recordTypeInfoJson = accessInfo.getRecordTypeInfoJson();
            fileAccessPort = accessInfo.getFileAccessPort();
            fileAccessSSL = accessInfo.getFileAccessSSL();

            try
            {
                DataHandler handler = accessInfo.getRecordTypeInfoBin();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                handler.writeTo(output);
                recordTypeInfoBin = output.toByteArray();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUPartLocation fileLocations = accessInfo.getFileLocations();
            if (fileLocations != null)
            {
                org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUPartLocation[] dfufileLocations = fileLocations.getDFUPartLocation();
                wrappedDFUFileParts = wrapAndResolveFileParts(dfufileLocations, accessInfo.getFileParts().getDFUFilePart());
    
                allFilePartCopyHosts = new String [dfufileLocations.length];
                for (int i = 0; i < dfufileLocations.length; i++)
                {
                    allFilePartCopyHosts[i] = dfufileLocations[i].getHost();
                }
            }
            else
                throw new Exception("Could not construct DFUCreateFileWrapper: empty file locations");
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }
    
    private DFUFilePartWrapper[] wrapAndResolveFileParts(DFUPartLocation[] fileLocations, DFUFilePart[] fileParts) throws Exception
    {
        if(fileLocations == null || fileLocations.length == 0)
            throw new Exception("Encountered empty DFU Part Locations array");
        if(fileParts == null || fileParts.length == 0)
            throw new Exception("Encountered empty DFU Parts array");

        Hashtable<Integer, String> availableLocations = new Hashtable<Integer, String>(fileLocations.length);

        for (int locationindex = 0; locationindex < fileLocations.length; locationindex++)
        {
            availableLocations.put(fileLocations[locationindex].getLocationIndex(), fileLocations[locationindex].getHost());
        }

        DFUFilePartWrapper [] wrappedDFUFileParts = new DFUFilePartWrapper[fileParts.length];
        for (int i = 0; i < fileParts.length; i++)
        {
            Integer filepartindex = fileParts[i].getPartIndex();
            if (filepartindex  < 1 || filepartindex > fileParts.length)
                throw new IndexOutOfBoundsException("Encountered invalid Filepart index: '" + filepartindex + "'");

            if ( wrappedDFUFileParts[filepartindex-1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + filepartindex + "'");

            wrappedDFUFileParts[filepartindex-1] = new DFUFilePartWrapper(fileParts[i], availableLocations);
        }
        return wrappedDFUFileParts;
    }
/*
    @Deprecated
    public DFUFileAccessInfoWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo soapdfufileaccessinfo, DFUFileTypeWrapper filetype) throws Exception
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

    @Deprecated
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

    @Deprecated
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
*/
	public DFUFileAccessInfoWrapper(DFUFileAccessInfo accessInfo) throws Exception
	{
		if (accessInfo != null)
        {
            metaInfoBlob = accessInfo.getMetaInfoBlob();
            expiryTime = accessInfo.getExpiryTime();
            numParts = accessInfo.getNumParts();
            recordTypeInfoJson = accessInfo.getRecordTypeInfoJson();
            fileAccessPort = accessInfo.getFileAccessPort();
            fileAccessSSL = accessInfo.getFileAccessSSL();
            //recordTypeInfoBin = accessInfo.getRecordTypeInfoBin(); //depr_ver("1.50")
            
            DFUPartLocation[] fileLocations = accessInfo.getFileLocations().getDFUPartLocation();
            wrappedDFUFileParts = wrapAndResolveFileParts(fileLocations, accessInfo.getFileParts().getDFUFilePart());

            allFilePartCopyHosts = new String [fileLocations.length];
            for (int i = 0; i < fileLocations.length; i++)
            {
                allFilePartCopyHosts[i] = fileLocations[i].getHost();
            }
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
	}

	public DFUFileAccessInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessInfo accessInfo, Object filetype) throws Exception
	{
		if (accessInfo != null)
        {
            metaInfoBlob = accessInfo.getMetaInfoBlob();
            expiryTime = accessInfo.getExpiryTime();
            numParts = accessInfo.getNumParts();
            recordTypeInfoJson = accessInfo.getRecordTypeInfoJson();
            fileAccessPort = accessInfo.getFileAccessPort();
            fileAccessSSL = accessInfo.getFileAccessSSL();

            try
            {
                DataHandler handler = accessInfo.getRecordTypeInfoBin();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                handler.writeTo(output);
                recordTypeInfoBin = output.toByteArray();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUPartLocation[] fileLocations = accessInfo.getFileLocations().getDFUPartLocation();
            wrappedDFUFileParts = wrapAndResolveFileParts(fileLocations, accessInfo.getFileParts().getDFUFilePart());

            allFilePartCopyHosts = new String [fileLocations.length];
            for (int i = 0; i < fileLocations.length; i++)
            {
                allFilePartCopyHosts[i] = fileLocations[i].getHost();
            }
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");

	}


	private DFUFilePartWrapper[] wrapAndResolveFileParts(
			org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUPartLocation[] fileLocations,
			org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePart[] fileParts) throws Exception
	{

    	if(fileLocations == null || fileLocations.length == 0)
            throw new Exception("Encountered empty DFU Part Locations array");
        if(fileParts == null || fileParts.length == 0)
            throw new Exception("Encountered empty DFU Parts array");

        Hashtable<Integer, String> availableLocations = new Hashtable<Integer, String>(fileLocations.length);

        for (int locationindex = 0; locationindex < fileLocations.length; locationindex++)
        {
            availableLocations.put(fileLocations[locationindex].getLocationIndex(), fileLocations[locationindex].getHost());
        }

        DFUFilePartWrapper [] wrappedDFUFileParts = new DFUFilePartWrapper[fileParts.length];
        for (int i = 0; i < fileParts.length; i++)
        {
            Integer filepartindex = fileParts[i].getPartIndex();
            if (filepartindex  < 1 || filepartindex > fileParts.length)
                throw new IndexOutOfBoundsException("Encountered invalid Filepart index: '" + filepartindex + "'");

            if ( wrappedDFUFileParts[filepartindex-1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + filepartindex + "'");

            wrappedDFUFileParts[filepartindex-1] = new DFUFilePartWrapper(fileParts[i], availableLocations);
        }
        return wrappedDFUFileParts;
	}

    public DFUFileTypeWrapper getFileType()
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
