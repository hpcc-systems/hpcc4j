/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2024 HPCC Systems®.
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.hpccsystems.dfs.client.FileUtility;
import org.hpccsystems.ws.client.BaseRemoteTest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CircularByteBufferTest extends BaseRemoteTest
{
    @Test
    public void spaceTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(10, cbb.getSpace());
        assertEquals(10, cbb.getContiguousSpace());
    }

    @Test
    public void addTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(10, cbb.getSpace());
        assertEquals(10, cbb.getContiguousSpace());

        byte[] data = new byte[5];
        try
        {
            cbb.add(data, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(5, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(5, cbb.getSpace());
        assertEquals(5, cbb.getContiguousSpace());
    }

    @Test
    public void readTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(10, cbb.getSpace());
        assertEquals(10, cbb.getContiguousSpace());

        byte[] data = new byte[5];
        try
        {
            cbb.add(data, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(5, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(5, cbb.getSpace());
        assertEquals(5, cbb.getContiguousSpace());

        byte[] readData = new byte[5];
        try
        {
            cbb.read(readData, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(0, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(10, cbb.getSpace());
        assertEquals(5, cbb.getContiguousSpace());
    }

    @Test
    public void markResetTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getCurrentNumberOfBytes());
        assertEquals(true, cbb.hasSpace());
        assertEquals(10, cbb.getSpace());
        assertEquals(10, cbb.getContiguousSpace());

        byte[] data = new byte[10];
        try
        {
            cbb.add(data, 0, data.length);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(10, cbb.getCurrentNumberOfBytes());
        assertEquals(false, cbb.hasSpace());
        assertEquals(0, cbb.getSpace());
        assertEquals(0, cbb.getContiguousSpace());

        cbb.mark(10);

        byte[] readData = new byte[5];
        try
        {
            cbb.read(readData, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }

        assertEquals(5, cbb.getCurrentNumberOfBytes());
        assertEquals(false, cbb.hasSpace());
        assertEquals(0, cbb.getSpace());
        assertEquals(0, cbb.getContiguousSpace());

        cbb.reset();
        assertEquals(10, cbb.getCurrentNumberOfBytes());
        assertEquals(false, cbb.hasSpace());
        assertEquals(0, cbb.getSpace());
        assertEquals(0, cbb.getContiguousSpace());
    }
}
 