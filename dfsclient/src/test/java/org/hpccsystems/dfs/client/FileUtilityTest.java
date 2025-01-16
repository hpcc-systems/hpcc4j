/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2023 HPCC Systems®.
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
public class FileUtilityTest extends BaseRemoteTest
{
    @Test
    public void parquetFileTests()
    {

    }

    @Test
    public void thorFileTests()
    {
        {
            String readArgs[] = {"-read", "benchmark::integer::20kb", "-url", this.connString,
                                "-format", "thor", "-user", this.hpccUser, "-pass", this.hpccPass, "-non_interactive" };

            JSONArray results = FileUtility.run(readArgs);
            JSONObject result = results.optJSONObject(0);
            Assert.assertNotNull("FileUtility result should not be null.", result);

            boolean success = result.optBoolean("successful",false);
            Assert.assertTrue("FileUtility operation didn't complete successfully", success);
        }

        {
            String readArgs[] = {"-read_test", "benchmark::integer::20kb", "-url", this.connString,
                                 "-user", this.hpccUser, "-pass", this.hpccPass, "-file_parts", "1", "-non_interactive" };

            JSONArray results = FileUtility.run(readArgs);
            JSONObject result = results.optJSONObject(0);
            Assert.assertNotNull("FileUtility result should not be null.", result);

            boolean success = result.optBoolean("successful",false);
            Assert.assertTrue("FileUtility operation didn't complete successfully", success);
        }

        {
            String copyArgs[] = {"-copy", "benchmark::integer::20kb benchmark::integer::20kb-copy",
                                "-url", this.connString, "-dest_url", this.connString,
                                "-dest_cluster", this.thorClusterFileGroup,
                                "-user", this.hpccUser, "-pass", this.hpccPass, "-non_interactive" };

            JSONArray results = FileUtility.run(copyArgs);
            JSONObject result = results.optJSONObject(0);
            Assert.assertNotNull("FileUtility result should not be null.", result);

            boolean success = result.optBoolean("successful",false);
            Assert.assertTrue("FileUtility operation didn't complete successfully", success);
        }

        {
            String localDir = "." + File.separator;
            String writeArgs[] = {"-write", localDir + "benchmark__integer__20kb* benchmark::integer::20kb_write",
                                "-url", this.connString, "-dest_url", this.connString,
                                "-dest_cluster", this.thorClusterFileGroup,
                                "-user", this.hpccUser, "-pass", this.hpccPass, "-non_interactive" };

            JSONArray results = FileUtility.run(writeArgs);
            JSONObject result = results.optJSONObject(0);
            Assert.assertNotNull("FileUtility result should not be null.", result);

            boolean success = result.optBoolean("successful",false);
            Assert.assertTrue("FileUtility operation didn't complete successfully", success);
        }
    }
}
