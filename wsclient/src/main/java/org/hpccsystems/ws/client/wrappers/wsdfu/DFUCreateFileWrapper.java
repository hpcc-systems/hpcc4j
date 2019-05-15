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

import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateResponse;

public class DFUCreateFileWrapper
{
	public static final java.lang.String Flat = "Flat";
	public static final java.lang.String Index = "Index";
	public static final java.lang.String Xml = "Xml";
	public static final java.lang.String Csv = "Csv";

    private String fileId;
    private DFUFileAccessInfoWrapper wrappedDFUFileAccessInfo;

    public DFUCreateFileWrapper (DFUFileCreateResponse resp) throws Exception
    {
        fileId = resp.getFileId();

        if (resp != null && resp.getAccessInfo() != null)
        {
            wrappedDFUFileAccessInfo = new DFUFileAccessInfoWrapper(resp.getAccessInfo(), null);
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }

    public DFUCreateFileWrapper (org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCreateResponse resp) throws Exception
    {
        fileId = resp.getFileId();
        
        if (resp != null && resp.getAccessInfo() != null)
        {
            wrappedDFUFileAccessInfo = new DFUFileAccessInfoWrapper(resp.getAccessInfo());
        }
        else
            throw new Exception("Could not construct DFUCreateFileWrapper: response or response.getAccessInfo is null");
    }

    /**
     * Gets the ExpiryTime value for this DFUFileAccessInfo.
     *
     * @return ExpiryTime
     */

    public String getFileID()
    {
        return fileId;
    }

    /**
     * Gets the file access blob to be used in subsequent DAFILESRV requests
     * @return The file access blob
     */
    public String getFileAccessInfoBlob()
    {
        return wrappedDFUFileAccessInfo.getFileAccessInfoBlob();
    }

    /**
     * Gets the ExpiryTime value for this DFUFileAccessInfo.
     *
     * @return ExpiryTime
     */
    public String getExpiryTime()
    {
        return wrappedDFUFileAccessInfo.getExpiryTime();
    }

    /**
     * Gets the numParts value for this DFUFileAccessInfo.
     *
     * @return numParts
     */
    public int getNumParts()
    {
        return wrappedDFUFileAccessInfo.getNumParts();
    }

    /**
     * Gets the fileParts value for this DFUFileAccessInfo.
     *
     * @return fileParts
     */
    public DFUFilePartWrapper [] getFileParts()
    {
        return wrappedDFUFileAccessInfo.getFileParts();
    }

    /**
     * Gets the recordTypeInfoBin value for this DFUFileAccessInfo.
     *
     * @return recordTypeInfoBin
     */
    public byte[] getRecordTypeInfoBin()
    {
        return wrappedDFUFileAccessInfo.getRecordTypeInfoBin();
    }

    /**
     * Gets the recordTypeInfoJson value for this DFUFileAccessInfo.
     *
     * @return recordTypeInfoJson
     */
    public String getRecordTypeInfoJson()
    {
        return wrappedDFUFileAccessInfo.getRecordTypeInfoJson();
    }

    /**
     * Gets the created file Access Information
     * @return
     */
    public DFUFileAccessInfoWrapper getFileAccessInfo()
    {
        return wrappedDFUFileAccessInfo;
    }
}
