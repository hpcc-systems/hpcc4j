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

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

import org.apache.parquet.io.InputFile;
import org.apache.parquet.io.SeekableInputStream;
import org.apache.parquet.io.DelegatingSeekableInputStream;

public class ParquetInputFile implements InputFile
{
    public static class ParquetInputStream extends DelegatingSeekableInputStream
    {
        private FileInputStream inputStream = null;

        public ParquetInputStream(FileInputStream stream)
        {
            super(stream);
            this.inputStream = stream;
        }

        @Override
        public long getPos() throws IOException
        {
            return this.inputStream.getChannel().position();
        }

        @Override
        public void seek(long newPos) throws IOException
        {
            this.inputStream.getChannel().position(newPos);
        }
    }

    private File file = null;

    ParquetInputFile(File file)
    {
        this.file = file;
    }

    @Override
    public long getLength() throws IOException
    {
        return this.file.length();
    }

    @Override
    public SeekableInputStream newStream() throws IOException
    {
        return new ParquetInputFile.ParquetInputStream(new FileInputStream(this.file));
    }

}