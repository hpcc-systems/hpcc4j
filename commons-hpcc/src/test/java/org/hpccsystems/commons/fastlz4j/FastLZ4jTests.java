/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems®.
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

package org.hpccsystems.commons.fastlz4j;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.hpccsystems.commons.fastlz4j.FastLZ4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class FastLZ4jTests 
{
    @Test
    public void testShortCompressionDecompression() throws Exception
    {
        byte[] compressed = new byte[shortInput.length];
        int compressedLen = FastLZ4j.compress(shortInput, compressed);

        byte[] decompressed = new byte[shortInput.length];
        FastLZ4j.decompress(compressed, compressedLen, decompressed);

        float compressionRatio = compressedLen / (float) shortInput.length;
        System.out.println("FLZ1 Compression ratio: " + compressionRatio);

        Assert.assertTrue(Arrays.equals(shortInput, decompressed));
    }

    @Test
    public void testLongCompressionDecompression() throws Exception
    {
        // Generate a long input from the short data to avoid having a huge block of text
        int numShortLens = (65536 / shortInput.length) + 1;
        byte[] longInput = new byte[numShortLens * shortInput.length];
        for (int i = 0; i < numShortLens; i++)
        {
            System.arraycopy(shortInput, 0, longInput, i*shortInput.length, shortInput.length);
        }

        byte[] compressed = new byte[longInput.length];
        int compressedLen = FastLZ4j.compress(longInput, compressed);

        byte[] decompressed = new byte[longInput.length];
        FastLZ4j.decompress(compressed, compressedLen, decompressed);

        float compressionRatio = compressedLen / (float) longInput.length;
        System.out.println("FLZ2 Compression ratio: " + compressionRatio);

        Assert.assertTrue(Arrays.equals(longInput, decompressed));
    }

    @Test
    public void testStreamingDecompression() throws Exception
    {
        // Generate a long input from the short data to avoid having a huge block of text
        int numShortLens = (65536 / shortInput.length) + 1;
        byte[] longInput = new byte[numShortLens * shortInput.length];
        for (int i = 0; i < numShortLens; i++)
        {
            System.arraycopy(shortInput, 0, longInput, i*shortInput.length, shortInput.length);
        }

        byte[] compressed = new byte[longInput.length];
        int compressedLen = FastLZ4j.compress(longInput, compressed);

        byte[] decompressed = new byte[longInput.length];

        FastLZ4j.DecompressionState state = new FastLZ4j.DecompressionState(compressedLen,longInput.length, -1);

        boolean finished = false;
        int availLen = 100;
        while (!finished)
        {
            finished = FastLZ4j.decompress_streaming(state, compressed, availLen, decompressed);

            if (availLen == longInput.length)
            {
                break;
            }

            availLen += 100;
            if (availLen > longInput.length)
            {
                availLen = longInput.length;
            }
        }

        Assert.assertTrue(Arrays.equals(longInput, decompressed));
    }

    static byte[] shortInput = null;
    static
    {
        Path testFilePath = Paths.get("src","test","resources","LoremIpsum.txt");
        File testFile = testFilePath.toFile();

        FileInputStream stream = null;
        try
        {
            stream = new FileInputStream(testFile);
        }
        catch (Exception e)
        {
            System.out.println("Unable to open test file for FastLZ4jTests: " + testFilePath);
        }

        shortInput = new byte[(int) testFile.length()];
        try
        {
            stream.read(shortInput);
            stream.close();
        }
        catch (Exception e)
        {
            System.out.println("Unable to read test file for FastLZ4jTest: " + e.getMessage());
        }
    }
}

