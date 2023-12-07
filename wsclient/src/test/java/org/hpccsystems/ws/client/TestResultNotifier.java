/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2023 HPCC Systems®.

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

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestResultNotifier extends RunListener
{
    PrintWriter failedTestsFile = null;

    public void testFailure(Failure failure) throws Exception
    {
        synchronized (this)
        {
            if (failedTestsFile == null)
            {
                try
                {
                    failedTestsFile = new PrintWriter( new FileWriter("./FailedTests.csv"));
                }
                catch (IOException e)
                {
                    System.out.println("Failed to open FailedTests file with error: " + e.getMessage() + " redirecting output to System.out");
                    failedTestsFile = new PrintWriter(System.out);
                }
            }

            Description description = failure.getDescription();
            failedTestsFile.println(description.getClassName() + "," + description.getMethodName() + "," + failure.getMessage());
            failedTestsFile.flush();
        }
    }

    protected void finalize() throws Throwable
    {
        synchronized (this)
        {
            if (failedTestsFile != null)
            {
                failedTestsFile.close();
            }
        }
    }
}