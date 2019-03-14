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
    NONE("false"),
    DEFAULT("true"),
    LZ4("LZ4"),
    FLZ("FLZ"),
    LZW("LZW"),
    ZLIB("ZLIB");

    private String name = null;
    CompressionAlgorithm(String compression)
    {
        name = compression;
    }

    public String toString()
    {
        return name;
    }
}
