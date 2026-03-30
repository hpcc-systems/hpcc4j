/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
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
 ******************************************************************************/

package org.hpccsystems.dfs.client;

public enum CompressionAlgorithm
{
    NONE ("false"),
    DEFAULT ("true"),
    LZ4 ("LZ4"),
    FLZ ("FLZ"), 
    LZW ("LZW"),
    ZLIB ("ZLIB"),
    INDEX_DEFAULT("DEFAULT", true),
    INDEX_LZW("LZW", true),
    INDEX_ROW("ROW", true),
    INDEX_INPLACE("INPLACE", true),
    INDEX_INPLACE_LZ4HC("INPLACE:lz4hc", true),
    INDEX_INPLACE_LZ4S("INPLACE:lz4s", true),
    INDEX_INPLACE_LZ4SHC("INPLACE:lz4shc", true),
    INDEX_INPLACE_ZSTDS("INPLACE:zstds", true);

    private String name = null;
    private boolean isIndexCompression = false;

    /**
     * Instantiates a new compression algorithm.
     *
     * @param compression
     *            the compression
     */
    CompressionAlgorithm(String compression)
    {
        name = compression;
    }

    CompressionAlgorithm(String compression, boolean isIndex)
    {
        name = compression;
        isIndexCompression = isIndex;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Enum#toString()
     */
    public String toString()
    {
        return name;
    }

    /**
     * Checks if is index compression.
     *
     * @return true, if is index compression
     */
    public boolean isIndexCompression()
    {
        return isIndexCompression;
    }
}
