/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2024 HPCC Systems®.

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

package org.hpccsystems.ws.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public class BaseRemoteInitTest
{
    @Test
    public void initTest() throws Exception
    {
        String exceptionMessage = "";
        if (BaseRemoteTest.initializationException != null)
        {
            exceptionMessage = BaseRemoteTest.initializationException.getMessage();
        }

        Assert.assertTrue("Error initializing test suite: " + exceptionMessage, BaseRemoteTest.initializationException == null);
    }
}
