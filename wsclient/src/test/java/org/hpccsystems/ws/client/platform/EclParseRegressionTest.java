/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
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
package org.hpccsystems.ws.client.platform;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.hpccsystems.ws.client.BaseRemoteTest;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EclRecordWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class EclParseRegressionTest extends BaseRemoteTest
{
    protected static String targetThorName = System.getProperty("thorname");
    protected static String targetRoxieName = System.getProperty("roxiename");
    protected static String targetHthorName = System.getProperty("hthorname");

    @BeforeClass
    static public void setup() throws Exception
    {
        if (targetThorName == null)
        {
            System.out.println("EclParseRegressionTest: No 'thorname' system prop provided, defaulting to 'thor' cluster name");
            targetThorName = "thor";
        }

        if (targetRoxieName == null)
        {
            System.out.println("EclParseRegressionTest: No 'roxiename' system prop provided, defaulting to 'roxie' cluster name");
            targetRoxieName = "roxie";
        }

        if (targetHthorName == null)
        {
            System.out.println("EclParseRegressionTest: No 'hthorname' system prop provided, defaulting to 'hthor' cluster name");
            targetHthorName = "roxie";
        }
    }

    File failedlist=new File("failedrecs.txt");
    File testlist=new File("alreadytested.txt");
    List<String> alreadytested=new ArrayList<String>();
    List<String> failedrecs=new ArrayList<String>();

    public HPCCWsDFUClient getDFUClient() throws Exception
    {
        HPCCWsDFUClient dfuclient = wsclient.getWsDFUClient();
        dfuclient.setVerbose(true);
        return dfuclient;
    }

    public HPCCWsWorkUnitsClient getWorkunitsClient() throws Exception
    {
        return wsclient.getWsWorkunitsClient();
    }

    public String getThorClusterName()
    {
        return targetThorName;
    }

    public String getRoxieClusterName()
    {
        return targetRoxieName;
    }

    public String getHthorClusterName()
    {
        return targetHthorName;
    }

    @Ignore("Single file used for testing -- run as needed")
    @Test
    public void testSingle() throws Exception, ArrayOfEspExceptionWrapper
    {
        String fname="anthem::enc_wpt_edw_provider_thor_superfile";
        DFUFileDetailWrapper info=getDFUClient().getFileDetails(fname, null);
        EclRecordWrapper rec=DFUFileDetailWrapper.getRecordFromECL(info.getEcl());
        if (rec.getParseErrors().size()!=0)
        {
            fail(rec.getParseErrors().toString());
        }
    }

    @Test
    public void testFailedRecs() throws Exception, ArrayOfEspExceptionWrapper
    {
        failedrecs=new ArrayList<String>();
        if (failedlist.exists())
        {
            failedrecs=Files.readAllLines(failedlist.toPath());
        }

        for (String rec : failedrecs)
        {
            String rececl="";
            try
            {
                DFUFileDetailWrapper info = getDFUClient().getFileDetails(rec, null);
                rececl=info.getEcl();
                if (rececl == null || rececl.isEmpty())
                {
                    throw new Exception("No record ecl for " + rec);
                }
            }
            catch (Exception e)
            {
                System.out.println( "Can't retrieve " + rec + ":" + e.getMessage());
                continue;
            }

            try
            {
                EclRecordWrapper rece = DFUFileDetailWrapper.getRecordFromECL(rececl);
                alreadytested.add(rec);
                if (rece.getParseErrors().size()!=0)
                {
                    throw new Exception("Failed to parse " + rec + ":" + String.join("\n",rece.getParseErrors()));
                }
                System.out.println(rec + " parsed fine");
            }
            catch (Exception e)
            {
                System.out.println( e.getMessage());
            }

        }
    }

    protected void testRegressionRecordStructures(boolean reset) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (reset)
        {
            FileUtils.deleteQuietly(testlist);
            FileUtils.deleteQuietly(failedlist);
        }
        if (testlist.exists() && !reset)
        {
            alreadytested=Files.readAllLines(testlist.toPath());
            failedrecs=Files.readAllLines(failedlist.toPath());
        }
        try
        {
            testScope("");
        }
        finally
        {
            Files.write(testlist.toPath(), String.join("\r\n",alreadytested).getBytes());
            Files.write(failedlist.toPath(), String.join("\r\n",failedrecs).getBytes());
        }
    }

    private int countMatches(String str, String pattern)
    {
        int index = 0;
        int matches = 0;
        do 
        {
            index = str.indexOf(pattern,index);
            if (index >= 0)
            {
                matches++;
                index += pattern.length();
            }
        } while(index >= 0);

        return matches;
    }

    private void testScope(String scope) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DFULogicalFileWrapper> files = getDFUClient().getFiles(scope);
        for (DFULogicalFileWrapper file:files)
        {
            String fullfilename= file.getIsDirectory()==true?file.getDirectory():file.getFileName();
            if (scope != null && !scope.isEmpty() && !fullfilename.startsWith(scope))
            {
                fullfilename=scope + "::" + fullfilename;
            }
            if (alreadytested.contains(fullfilename))
            {
                continue;
            }
            if (file.getIsSuperfile())
            {
                alreadytested.add(fullfilename);
            }
            if (file.getFileName().contains("::key::") || file.getFileName().contains("::keys::") || file.getFileName().startsWith("keys::") || file.getFileName().startsWith("key::"))
            {
                alreadytested.add(fullfilename);
                continue;
            }

            if (file.getIsDirectory())
            {
                alreadytested.add(fullfilename);
                testScope(fullfilename);
                continue;
            }

            String rececl=null;
            try {
                DFUFileDetailWrapper info=getDFUClient().getFileDetails(fullfilename, null);
                if (info.getIsSuperfile())
                {
                    System.out.print(fullfilename + " is superfile");
                }
                rececl=info.getEcl();
                if (rececl != null || rececl.isEmpty())
                {
                    throw new Exception("No record ecl for " + fullfilename);
                }
            }
            catch (Exception e)
            {
                System.out.println( "Can't retrieve " + file.getFileName() + ":" + e.getMessage());
                alreadytested.add(fullfilename);
                continue;
            }
            System.out.println("testing ecl layout for  " + fullfilename );

            try
            {
                if (countMatches(rececl, "RECORD")>1 || countMatches(rececl,"{")>1)
                {
                    System.out.println(fullfilename + " has child datasets");
                }

                EclRecordWrapper rec=DFUFileDetailWrapper.getRecordFromECL(rececl);
                alreadytested.add(fullfilename);
                if (rec.getParseErrors().size()!=0)
                {
                    throw new Exception("Failed to parse " + fullfilename + ":" + String.join("\n",rec.getParseErrors()));
                }
            }
            catch (Exception e)
            {
                    failedrecs.add(fullfilename);
                    System.out.println(rececl + "\n" + e.getMessage());
            }
        }
    }
}
