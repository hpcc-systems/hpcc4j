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

/*
    class opaqueDFUFileCopy
    {
        private java.lang.Integer copyIndex;
        private java.lang.Integer locationIndex;
        private java.lang.String path;

        public java.lang.Integer getCopyIndex()
        {
            return copyIndex;
        }

        public void setCopyIndex(java.lang.Integer copyIndex)
        {
            this.copyIndex = copyIndex;
        }

        public java.lang.Integer getLocationIndex()
        {
            return locationIndex;
        }

        public void setLocationIndex(java.lang.Integer locationIndex)
        {
            this.locationIndex = locationIndex;
        }

        public java.lang.String getPath()
        {
            return path;
        }

        public void setPath(java.lang.String path)
        {
            this.path = path;
        }
    }

    class ArrayofopaqueDFUFileCopy
    {
        private opaqueDFUFileCopy copies[];

        public ArrayofopaqueDFUFileCopy(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCopy[] copies)
        {
            this.copies = new opaqueDFUFileCopy[copies.length];
            for (int i = 0; i < copies.length; i++)
            {
                this.copies[i].setCopyIndex(copies[i].getCopyIndex());
                this.copies[i].setLocationIndex(copies[i].getLocationIndex());
                this.copies[i].setPath(copies[i].getPath());
            }
        }

        public ArrayofopaqueDFUFileCopy(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCopy[] copies)
        {
            this.copies = new opaqueDFUFileCopy[copies.length];
            for (int i = 0; i < copies.length; i++)
            {
                this.copies[i].setCopyIndex(copies[i].getCopyIndex());
                this.copies[i].setLocationIndex(copies[i].getLocationIndex());
                this.copies[i].setPath(copies[i].getPath());
            }
        }

        public opaqueDFUFileCopy[] getCopies()
        {
            return copies;
        }

        public void setCopies(opaqueDFUFileCopy[] copies)
        {
            this.copies = copies;
        }
    }

    class opaqueDFUFilePart
    {
        private java.lang.Integer partIndex;
        private opaqueDFUFileCopy[] copies;
        public opaqueDFUFilePart() {}

        public opaqueDFUFilePart(Integer partIndex, org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCopy[] copies)
        {
            this.copies = new opaqueDFUFileCopy[copies.length];
            this.partIndex = partIndex;
            for (int i = 0; i < copies.length; i++)
            {
               this.copies[i].setCopyIndex(copies[i].getCopyIndex());
               this.copies[i].setLocationIndex(copies[i].getLocationIndex());
               this.copies[i].setPath(copies[i].getPath());
            }
        }

        public opaqueDFUFilePart(Integer partIndex, org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCopy[] copies)
        {
            this.copies = new opaqueDFUFileCopy[copies.length];
            this.partIndex = partIndex;
            for (int i = 0; i < copies.length; i++)
            {
               this.copies[i].setCopyIndex(copies[i].getCopyIndex());
               this.copies[i].setLocationIndex(copies[i].getLocationIndex());
               this.copies[i].setPath(copies[i].getPath());
            }
        }

        public java.lang.Integer getPartIndex()
        {
            return partIndex;
        }

        public void setPartIndex(java.lang.Integer partIndex)
        {
            this.partIndex = partIndex;
        }

        public opaqueDFUFileCopy[] getOpaqueCopies()
        {
            return copies;
        }

        public void setCopies(opaqueDFUFileCopy[] copies)
        {
            this.copies = copies;
        }
    }

    class ArrayofopaqueDFUFilePart
    {
        private opaqueDFUFilePart fileparts[] = null;

        public ArrayofopaqueDFUFilePart(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePart[] fileparts)
        {
            this.fileparts = new opaqueDFUFilePart[fileparts.length];
            for (int i = 0; i < fileparts.length; i++)
            {
                this.fileparts[i].setPartIndex(fileparts[i].getPartIndex());
                this.fileparts[i].setCopies(new ArrayofopaqueDFUFileCopy(fileparts[i].getCopies()).getCopies());
            }
        }

        public ArrayofopaqueDFUFilePart(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFilePart[] fileparts)
        {
            this.fileparts = new opaqueDFUFilePart[fileparts.length];
            for (int i = 0; i < fileparts.length; i++)
            {
                this.fileparts[i].setPartIndex(fileparts[i].getPartIndex());
                this.fileparts[i].setCopies(new ArrayofopaqueDFUFileCopy(fileparts[i].getCopies()).getCopies());
            }
        }

        public int length()
        {
            if (fileparts != null)
                return fileparts.length;

            return 0;
        }

        public opaqueDFUFilePart item(int index)
        {
            if (fileparts != null && index >= 0 && index < fileparts.length)
                return fileparts[index];
            return null;
        }
    }

    class opaqueDFUPartLocation
    {
        private java.lang.Integer locationIndex;
        private java.lang.String host;

        public opaqueDFUPartLocation(Integer locationIndex, String host)
        {
               this.locationIndex = locationIndex;
               this.host = host;
        }

        public java.lang.Integer getLocationIndex()
        {
            return locationIndex;
        }

        public void setLocationIndex(java.lang.Integer locationIndex)
        {
            this.locationIndex = locationIndex;
        }

        public java.lang.String getHost()
        {
            return host;
        }

        public void setHost(java.lang.String host)
        {
            this.host = host;
        }
    }

    class ArrayofopaqueDFUPartLocation
    {
        private opaqueDFUPartLocation locations[] = null;

        public ArrayofopaqueDFUPartLocation(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUPartLocation[] locations)
        {
            this.locations = new opaqueDFUPartLocation [locations.length];
            for (int i = 0; i < locations.length; i++)
            {
                this.locations[i].setHost(locations[i].getHost());
                this.locations[i].setLocationIndex(locations[i].getLocationIndex());
            }
        }

        public ArrayofopaqueDFUPartLocation(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocation[] locations)
        {
            this.locations = new opaqueDFUPartLocation [locations.length];
            for (int i = 0; i < locations.length; i++)
            {
                this.locations[i].setHost(locations[i].getHost());
                this.locations[i].setLocationIndex(locations[i].getLocationIndex());
            }
        }

        public int length()
        {
            if (locations != null)
                return locations.length;

            return 0;
        }

        public opaqueDFUPartLocation item(int index)
        {
            if (locations != null && index >= 0 && index < locations.length)
                return locations[index];
            return null;
        }
    }*/

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

    /*static public DFUFilePartWrapper [] wrapAndResolveFileParts(ArrayofopaqueDFUPartLocation locations, ArrayofopaqueDFUFilePart fileparts) throws Exception
    {
        if(locations == null || locations.length() == 0)
            throw new Exception("Encountered empty DFU Part Locations array");
        if(fileparts == null || fileparts.length() == 0)
            throw new Exception("Encountered empty DFU Parts array");

        Hashtable<Integer, String> availableLocations = new Hashtable<Integer, String>(locations.length());

        for (int locationindex = 0; locationindex < locations.length(); locationindex++)
        {
            availableLocations.put(locations.item(locationindex).getLocationIndex(), locations.item(locationindex).getHost());
        }

        DFUFilePartWrapper [] wrappedDFUFileParts = new DFUFilePartWrapper[fileparts.length()];
        for (int i = 0; i < fileparts.length(); i++)
        {
            Integer filepartindex = fileparts.item(i).getPartIndex();
            if (filepartindex  < 1 || filepartindex > fileparts.length())
                throw new IndexOutOfBoundsException("Encountered invalid Filepart index: '" + filepartindex + "'");

            if ( wrappedDFUFileParts[filepartindex-1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + filepartindex + "'");

            wrappedDFUFileParts[filepartindex-1] = new DFUFilePartWrapper(fileparts.item(i), availableLocations);
        }
        return wrappedDFUFileParts;
    }*/

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
