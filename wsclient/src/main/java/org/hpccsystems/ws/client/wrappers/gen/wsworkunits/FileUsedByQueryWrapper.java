package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: FileUsedByQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.834Z
 */
public class FileUsedByQueryWrapper
{
    protected String local_fileName;
    protected long local_fileSize;
    protected UnsignedInt local_numberOfParts;

    public FileUsedByQueryWrapper() {}

    public FileUsedByQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery fileusedbyquery)
    {
        copy( fileusedbyquery );
    }
    public FileUsedByQueryWrapper( String _fileName, long _fileSize, UnsignedInt _numberOfParts )
    {
        this.local_fileName = _fileName;
        this.local_fileSize = _fileSize;
        this.local_numberOfParts = _numberOfParts;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery raw )
    {
        if (raw == null)
            return;

        this.local_fileName = raw.getFileName();
        this.local_fileSize = raw.getFileSize();
        this.local_numberOfParts = raw.getNumberOfParts();

    }

    @Override
    public String toString()
    {
        return "FileUsedByQueryWrapper [" + "fileName = " + local_fileName + ", " + "fileSize = " + local_fileSize + ", " + "numberOfParts = " + local_numberOfParts + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery();
        raw.setFileName( local_fileName);
        raw.setFileSize( local_fileSize);
        raw.setNumberOfParts( local_numberOfParts);
        return raw;
    }


    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setFileSize( long _fileSize )
    {
        this.local_fileSize = _fileSize;
    }
    public long getFileSize( )
    {
        return this.local_fileSize;
    }
    public void setNumberOfParts( UnsignedInt _numberOfParts )
    {
        this.local_numberOfParts = _numberOfParts;
    }
    public UnsignedInt getNumberOfParts( )
    {
        return this.local_numberOfParts;
    }
}