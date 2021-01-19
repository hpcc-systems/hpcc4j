/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.client;

import org.apache.parquet.io.OutputFile;
import org.apache.parquet.io.PositionOutputStream;
import org.apache.parquet.io.DelegatingPositionOutputStream;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class ParquetOutputFile implements OutputFile
{
    public static class ParquetOutputStream extends DelegatingPositionOutputStream
    {
        private FileOutputStream outputStream = null;

        ParquetOutputStream(FileOutputStream stream)
        {
            super(stream);
            this.outputStream = stream;
        }

        @Override
        public long getPos() throws IOException
        {
            return this.outputStream.getChannel().position();
        }
    }

    private File file = null;

    ParquetOutputFile(File file)
    {
        this.file = file;
    }

    public PositionOutputStream create(long blockSizeHint) throws IOException
    {
        return new ParquetOutputFile.ParquetOutputStream(new FileOutputStream(file));
    }

    public PositionOutputStream createOrOverwrite(long blockSizeHint) throws IOException
    {
        return new ParquetOutputFile.ParquetOutputStream(new FileOutputStream(file,false));
    }

    public boolean supportsBlockSize()
    {
        return false;
    }

    public long defaultBlockSize()
    {
        return 0;
    }

    public String getPath()
    {
        return this.file.getAbsolutePath();
    }
}
