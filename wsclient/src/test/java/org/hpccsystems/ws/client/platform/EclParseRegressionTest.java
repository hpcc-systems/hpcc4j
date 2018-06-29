/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.ManualUnitTest;
import org.hpccsystems.ws.client.platform.DFUFileDetailInfo;
import org.hpccsystems.ws.client.platform.DFULogicalFileInfo;
import org.hpccsystems.ws.client.platform.EclRecordInfo;
import org.hpccsystems.ws.client.platform.Platform;
import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(ManualUnitTest.class)
public class EclParseRegressionTest  {

    Logger logger=Logger.getLogger(this.getClass().getName());

    boolean reset=true;

    Platform p=null;
    

    File failedlist=new File("failedrecs.txt");    
    File testlist=new File("alreadytested.txt");
    List<String> alreadytested=new ArrayList<String>();
    List<String> failedrecs=new ArrayList<String>();
    public String getIP() {
        return "";
    }
    
    public int getPort() {
        return 8010;
    }
    
    public String getHttp() {
        return "http";
    }
    public String getUsername() {
        return "";
    }
    
    public String getPassword() {
        return "";
    }
    
    public Platform getPlatform() throws Exception
    {
        if (p==null) {
            p=Platform.get(getHttp(),getIP(),getPort(),getUsername(),getPassword());
        }
        return p;
    }
    
    public HPCCWsDFUClient getDFUClient() throws Exception {
        return getPlatform().getWsDfuClient();
    }
    
    public HPCCWsWorkUnitsClient getWorkunitsClient() throws Exception {
        return getPlatform().getWsWorkunitsClient();
    }
    public String getThorClusterName()
    {
        return "thor";
    }
    
    public String getRoxieClusterName()
    {
        return "roxie";
    }
    
    
    public String getHthorClusterName()
    {
        return "hthor";
    }

    @Test
    public void testSingle() throws Exception {
  //      String fname=".::lrenn:edit-ma-test";
        String fname="anthem::enc_wpt_edw_provider_thor_superfile";
        DFUFileDetailInfo info=getDFUClient().getFileDetails(fname, null);
        EclRecordInfo rec=DFUFileDetailInfo.getRecordFromECL(info.getEcl());
        if (rec.getParseErrors().size()>0) {
            fail(rec.getParseErrors().toString());
        }
    }
    
  
    @Test
    public void testFailedRecs() throws Exception {
        failedrecs=Files.readAllLines(failedlist.toPath());
        for (String rec:failedrecs) {
            String rececl="";
            try {
                DFUFileDetailInfo info=getDFUClient().getFileDetails(rec, null);
                rececl=info.getEcl();
                if (StringUtils.isEmpty(rececl)) {
                    throw new Exception("No record ecl for " + rec);
                }
            } catch (Exception e) {
                System.out.println( "Can't retrieve " + rec + ":" + e.getMessage());
                continue;
            }
            try {
                EclRecordInfo rece=DFUFileDetailInfo.getRecordFromECL(rececl);
                alreadytested.add(rec);
                if (rece.getParseErrors().size()>0) {
                    throw new Exception("Failed to parse " + rec + ":" + StringUtils.join(rece.getParseErrors(),"\n"));
                }
                System.out.println(rec + " parsed fine");
            } catch (Exception e) {                
                System.out.println( e.getMessage());
            }
         
        }
    }
  @Test
    public void testRegressionRecordStructures() throws Exception {
      if (reset) {
          FileUtils.deleteQuietly(testlist);
          FileUtils.deleteQuietly(failedlist);
      }
      if (testlist.exists() && !reset) {
          alreadytested=Files.readAllLines(testlist.toPath());
          failedrecs=Files.readAllLines(failedlist.toPath());
      }
      try {
          testScope("");
      } finally {
          Files.write(testlist.toPath(), StringUtils.join(alreadytested,"\r\n").getBytes());
          Files.write(failedlist.toPath(), StringUtils.join(failedrecs,"\r\n").getBytes());
      }
    }
    
    private void testScope(String scope) throws Exception {
        List<DFULogicalFileInfo> files=getDFUClient().getFiles(scope);
        for (DFULogicalFileInfo file:files) {
            
            String fullfilename= file.getIsDirectory()==true?file.getDirectory():file.getFileName();
            if (!StringUtils.isEmpty(scope) && !fullfilename.startsWith(scope)) {
                fullfilename=scope + "::" + fullfilename;
            }
            if (alreadytested.contains(fullfilename)) {
                continue;
            }
            if (file.getIsSuperfile()) {
                alreadytested.add(fullfilename);
            //    continue;
            }
            if (file.getFileName().contains("::key::") || file.getFileName().contains("::keys::") || file.getFileName().startsWith("keys::") || file.getFileName().startsWith("key::")) {
                alreadytested.add(fullfilename);
                continue;
            }            
            if (file.getIsDirectory()) {
                alreadytested.add(fullfilename);
                testScope(fullfilename);
                continue;
            }
            String rececl=null;
            try {
                DFUFileDetailInfo info=getDFUClient().getFileDetails(fullfilename, null);
                rececl=info.getEcl();
                if (StringUtils.isEmpty(rececl)) {
                    throw new Exception("No record ecl for " + fullfilename);
                }
            } catch (Exception e) {
                System.out.println( "Can't retrieve " + file.getFileName() + ":" + e.getMessage());
                alreadytested.add(fullfilename);
                continue;
            }
            System.out.println("testing ecl layout for  " + fullfilename );

            try {
                    EclRecordInfo rec=DFUFileDetailInfo.getRecordFromECL(rececl);
                    alreadytested.add(fullfilename);
                    if (rec.getParseErrors().size()>0) {
                        throw new Exception("Failed to parse " + fullfilename + ":" + StringUtils.join(rec.getParseErrors(),"\n"));
                    }
                } catch (Exception e) {
                    failedrecs.add(fullfilename);
                    System.out.println(rececl + "\n" + e.getMessage());
                }
             
        }
    }
}
