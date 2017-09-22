package org.hpccsystems.ws.client;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FilenameUtils;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.platform.ApplicationValueInfo;
import org.hpccsystems.ws.client.platform.Cluster;
import org.hpccsystems.ws.client.platform.ECLAttributeInfo;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.QueryResult;
import org.hpccsystems.ws.client.platform.QuerySetFilterType;
import org.hpccsystems.ws.client.platform.WUQueryInfo;
import org.hpccsystems.ws.client.platform.WUState;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.platform.WUQueryInfo.SortBy;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Ignore
public abstract class BaseWsAttributesClientIntegrationTest {

    
    Platform platform;
    HPCCWsClient client1;
    HPCCWsAttributesClient client;
    Cluster thorcluster;
    Cluster roxiecluster;
    Cluster hthorcluster;
    
    protected abstract String getVersion(); //should be "major.minor"
    protected abstract Platform getBasePlatform() throws Exception;
    protected abstract String getThorClusterName();
    protected abstract String getRoxieClusterName();
    protected abstract String getHthorClusterName();
    
    public Platform getPlatform() throws Exception
    {
        Platform p =getBasePlatform();
        if (p.getVersion().toString().startsWith(getVersion()))
            throw new Exception(p.getIP() + " is no longer on version " + getVersion() + "! It is now on " + p.getVersion().toString()); 
        return p;
        
    }
    @Before
    public void setup() throws Exception
    {
        platform= getPlatform();
        thorcluster=platform.getCluster(getThorClusterName());
        roxiecluster =platform.getCluster(getRoxieClusterName());
        hthorcluster=platform.getCluster(getHthorClusterName());
        
        try 
        {
            client1 = platform.checkOutHPCCWsClient();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        client=client1.getWsAttributesClient();
        client.setVerbose(true);
    }
 

    @After
    public void shutdown() 
    {
        if (platform != null && client != null)
        {
            try 
            {
                platform.checkInHPCCWsClient(client1);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
    }

    @Test
    public void testWriteAttributes() throws Exception
    {
        String testmodname="zz_wsclientattributetest";
        List<ECLAttributeInfo> toadd=new ArrayList<ECLAttributeInfo>();
        File testdir=new File("src/test/resources/attributetest");
        for (int i=0; i < testdir.listFiles().length;i++)
        {
            toadd.add(new ECLAttributeInfo(testmodname,FilenameUtils.getBaseName(testdir.listFiles()[i].getName()),"ecl",
                    new String(Files.readAllBytes(testdir.listFiles()[i].toPath()))));
        }

        List<ECLAttributeInfo> found=client.findItems(testmodname, null,null,null,null,null);
        if (found.size()>0)
        {
            client.deleteModule(testmodname);
        }
        long begin=System.currentTimeMillis();
        List<ECLAttributeInfo> result=client.createOrUpdateAttributes(toadd, true, "testing wsclient add unit test");
        System.out.println("Time to create " + testdir.listFiles().length + " attributes with checkout/checkin:" 
        + (System.currentTimeMillis()-begin));
        
        found=client.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to add " + toadd.size() + " items, " + found.size() + " items found");
        }

        begin=System.currentTimeMillis();
        result=client.createOrUpdateAttributes(toadd, true, "testing wsclient add unit test");
        System.out.println("Time to update " + testdir.listFiles().length + " existing attributes with checkout/checkin:" 
        + (System.currentTimeMillis()-begin));
        
        found=client.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to update" + toadd.size() + " items, " + found.size() + " items found");
        }
    }

    @Test
    public void testWriteSingleAttribute() throws Exception
    {
        String testmodname="zz_wsclientattributetest";
        List<ECLAttributeInfo> toadd=new ArrayList<ECLAttributeInfo>();
        File testdir=new File("src/test/resources/attributetest");
        for (int i=0; i < testdir.listFiles().length;i++)
        {
            toadd.add(new ECLAttributeInfo(testmodname,FilenameUtils.getBaseName(testdir.listFiles()[i].getName()),"ecl",
                    new String(Files.readAllBytes(testdir.listFiles()[i].toPath()))));
        }

        List<ECLAttributeInfo> found=client.findItems(testmodname, null,null,null,null,null);
        if (found.size()>0)
        {
            client.deleteModule(testmodname);
        }
        long begin=System.currentTimeMillis();
        for (ECLAttributeInfo item: toadd)
        {
            client.createOrUpdateAttribute(item, true, "testing wsclient add unit test");
        }
        System.out.println("Time to individually create " + testdir.listFiles().length + " attributes with checkout/checkin:" 
        + (System.currentTimeMillis()-begin));
        
        found=client.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to add " + toadd.size() + " items, " + found.size() + " items found");
        }

        begin=System.currentTimeMillis();
        for (ECLAttributeInfo item:toadd)
        {
            client.createOrUpdateAttribute(item, true, "testing wsclient add unit test");
        }
        System.out.println("Time to individually update " + testdir.listFiles().length + " existing attributes with checkout/checkin:" 
        + (System.currentTimeMillis()-begin));
        
        found=client.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to update" + toadd.size() + " items, " + found.size() + " items found");
        }
        if (found.size()>0)
        {
            client.deleteModule(testmodname);
        }
    }

    @Test
    public void testInvalidAttributes() throws Exception
    {
       boolean wasinvalid=false;
       try {
           new ECLAttributeInfo("test!modulename", "test attribute name", "badtype",null).validate();
       } catch (Exception e) {
           wasinvalid=true;
           System.out.println(e.getMessage());
       }
       if (!wasinvalid)
       {
           fail("Should have failed to validate");
       }
    }
}

