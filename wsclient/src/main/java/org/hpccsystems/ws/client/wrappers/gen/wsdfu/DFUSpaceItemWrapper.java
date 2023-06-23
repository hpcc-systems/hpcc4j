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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUSpaceItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUSpaceItemWrapper
{
    protected String local_name;
    protected String local_numOfFiles;
    protected String local_numOfFilesUnknown;
    protected String local_totalSize;
    protected String local_largestFile;
    protected String local_largestSize;
    protected String local_smallestFile;
    protected String local_smallestSize;
    protected long local_numOfFilesInt64;
    protected long local_numOfFilesUnknownInt64;
    protected long local_totalSizeInt64;
    protected long local_largestSizeInt64;
    protected long local_smallestSizeInt64;

    public DFUSpaceItemWrapper() {}

    public DFUSpaceItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceItem dfuspaceitem)
    {
        copy( dfuspaceitem );
    }
    public DFUSpaceItemWrapper( String _name, String _numOfFiles, String _numOfFilesUnknown, String _totalSize, String _largestFile, String _largestSize, String _smallestFile, String _smallestSize, long _numOfFilesInt64, long _numOfFilesUnknownInt64, long _totalSizeInt64, long _largestSizeInt64, long _smallestSizeInt64 )
    {
        this.local_name = _name;
        this.local_numOfFiles = _numOfFiles;
        this.local_numOfFilesUnknown = _numOfFilesUnknown;
        this.local_totalSize = _totalSize;
        this.local_largestFile = _largestFile;
        this.local_largestSize = _largestSize;
        this.local_smallestFile = _smallestFile;
        this.local_smallestSize = _smallestSize;
        this.local_numOfFilesInt64 = _numOfFilesInt64;
        this.local_numOfFilesUnknownInt64 = _numOfFilesUnknownInt64;
        this.local_totalSizeInt64 = _totalSizeInt64;
        this.local_largestSizeInt64 = _largestSizeInt64;
        this.local_smallestSizeInt64 = _smallestSizeInt64;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceItem raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_numOfFiles = raw.getNumOfFiles();
        this.local_numOfFilesUnknown = raw.getNumOfFilesUnknown();
        this.local_totalSize = raw.getTotalSize();
        this.local_largestFile = raw.getLargestFile();
        this.local_largestSize = raw.getLargestSize();
        this.local_smallestFile = raw.getSmallestFile();
        this.local_smallestSize = raw.getSmallestSize();
        this.local_numOfFilesInt64 = raw.getNumOfFilesInt64();
        this.local_numOfFilesUnknownInt64 = raw.getNumOfFilesUnknownInt64();
        this.local_totalSizeInt64 = raw.getTotalSizeInt64();
        this.local_largestSizeInt64 = raw.getLargestSizeInt64();
        this.local_smallestSizeInt64 = raw.getSmallestSizeInt64();

    }

    @Override
    public String toString()
    {
        return "DFUSpaceItemWrapper [" + "name = " + local_name + ", " + "numOfFiles = " + local_numOfFiles + ", " + "numOfFilesUnknown = " + local_numOfFilesUnknown + ", " + "totalSize = " + local_totalSize + ", " + "largestFile = " + local_largestFile + ", " + "largestSize = " + local_largestSize + ", " + "smallestFile = " + local_smallestFile + ", " + "smallestSize = " + local_smallestSize + ", " + "numOfFilesInt64 = " + local_numOfFilesInt64 + ", " + "numOfFilesUnknownInt64 = " + local_numOfFilesUnknownInt64 + ", " + "totalSizeInt64 = " + local_totalSizeInt64 + ", " + "largestSizeInt64 = " + local_largestSizeInt64 + ", " + "smallestSizeInt64 = " + local_smallestSizeInt64 + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceItem raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceItem();
        raw.setName( local_name);
        raw.setNumOfFiles( local_numOfFiles);
        raw.setNumOfFilesUnknown( local_numOfFilesUnknown);
        raw.setTotalSize( local_totalSize);
        raw.setLargestFile( local_largestFile);
        raw.setLargestSize( local_largestSize);
        raw.setSmallestFile( local_smallestFile);
        raw.setSmallestSize( local_smallestSize);
        raw.setNumOfFilesInt64( local_numOfFilesInt64);
        raw.setNumOfFilesUnknownInt64( local_numOfFilesUnknownInt64);
        raw.setTotalSizeInt64( local_totalSizeInt64);
        raw.setLargestSizeInt64( local_largestSizeInt64);
        raw.setSmallestSizeInt64( local_smallestSizeInt64);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setNumOfFiles( String _numOfFiles )
    {
        this.local_numOfFiles = _numOfFiles;
    }
    public String getNumOfFiles( )
    {
        return this.local_numOfFiles;
    }
    public void setNumOfFilesUnknown( String _numOfFilesUnknown )
    {
        this.local_numOfFilesUnknown = _numOfFilesUnknown;
    }
    public String getNumOfFilesUnknown( )
    {
        return this.local_numOfFilesUnknown;
    }
    public void setTotalSize( String _totalSize )
    {
        this.local_totalSize = _totalSize;
    }
    public String getTotalSize( )
    {
        return this.local_totalSize;
    }
    public void setLargestFile( String _largestFile )
    {
        this.local_largestFile = _largestFile;
    }
    public String getLargestFile( )
    {
        return this.local_largestFile;
    }
    public void setLargestSize( String _largestSize )
    {
        this.local_largestSize = _largestSize;
    }
    public String getLargestSize( )
    {
        return this.local_largestSize;
    }
    public void setSmallestFile( String _smallestFile )
    {
        this.local_smallestFile = _smallestFile;
    }
    public String getSmallestFile( )
    {
        return this.local_smallestFile;
    }
    public void setSmallestSize( String _smallestSize )
    {
        this.local_smallestSize = _smallestSize;
    }
    public String getSmallestSize( )
    {
        return this.local_smallestSize;
    }
    public void setNumOfFilesInt64( long _numOfFilesInt64 )
    {
        this.local_numOfFilesInt64 = _numOfFilesInt64;
    }
    public long getNumOfFilesInt64( )
    {
        return this.local_numOfFilesInt64;
    }
    public void setNumOfFilesUnknownInt64( long _numOfFilesUnknownInt64 )
    {
        this.local_numOfFilesUnknownInt64 = _numOfFilesUnknownInt64;
    }
    public long getNumOfFilesUnknownInt64( )
    {
        return this.local_numOfFilesUnknownInt64;
    }
    public void setTotalSizeInt64( long _totalSizeInt64 )
    {
        this.local_totalSizeInt64 = _totalSizeInt64;
    }
    public long getTotalSizeInt64( )
    {
        return this.local_totalSizeInt64;
    }
    public void setLargestSizeInt64( long _largestSizeInt64 )
    {
        this.local_largestSizeInt64 = _largestSizeInt64;
    }
    public long getLargestSizeInt64( )
    {
        return this.local_largestSizeInt64;
    }
    public void setSmallestSizeInt64( long _smallestSizeInt64 )
    {
        this.local_smallestSizeInt64 = _smallestSizeInt64;
    }
    public long getSmallestSizeInt64( )
    {
        return this.local_smallestSizeInt64;
    }
}