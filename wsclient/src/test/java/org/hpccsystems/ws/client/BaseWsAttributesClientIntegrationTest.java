package org.hpccsystems.ws.client;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.platform.Cluster;
import org.hpccsystems.ws.client.platform.ECLAttributeInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public abstract class BaseWsAttributesClientIntegrationTest extends BaseRemoteTest
{

    String wsAttributesConnection = System.getProperty("wsattributesurl");
    HPCCWsAttributesClient wsattclient;

    Cluster thorcluster;
    Cluster roxiecluster;
    Cluster hthorcluster;

    protected abstract String getHPCCVersion(); //should be "major.minor"
    protected abstract String getThorClusterName();
    protected abstract String getRoxieClusterName();
    protected abstract String getHthorClusterName();

    protected String wsattport = System.getProperty("wsattport");

    public void confirmPlatform() throws Exception
    {
        if (platform.getVersion().toString().startsWith(getHPCCVersion()))
            throw new Exception(platform.getIP() + " is no longer on version " + getHPCCVersion() + "! It is now on " + platform.getVersion().toString());
    }

    @Before
    public void setup() throws Exception
    {
        super.setup(); // fetch hpcc connection info and setup platform and wsclient

        if (wsattport == null)
            wsattport = "8145";

        confirmPlatform();
        thorcluster=platform.getCluster(getThorClusterName());
        roxiecluster =platform.getCluster(getRoxieClusterName());
        hthorcluster=platform.getCluster(getHthorClusterName());

        wsattclient = wsclient.getWsAttributesClient(wsattport);
        wsattclient.setVerbose(true);
    }

    @After
    public void shutdown()
    {
        super.shutdown();
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

        List<ECLAttributeInfo> found=wsattclient.findItems(testmodname, null,null,null,null,null);
        if (found.size()>0)
        {
            wsattclient.deleteModule(testmodname);
        }
        long begin=System.currentTimeMillis();
        List<ECLAttributeInfo> result=wsattclient.createOrUpdateAttributes(toadd, true, "testing wsclient add unit test");
        System.out.println("Time to create " + testdir.listFiles().length + " attributes with checkout/checkin:"
        + (System.currentTimeMillis()-begin));

        found=wsattclient.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to add " + toadd.size() + " items, " + found.size() + " items found");
        }

        begin=System.currentTimeMillis();
        result=wsattclient.createOrUpdateAttributes(toadd, true, "testing wsclient add unit test");
        System.out.println("Time to update " + testdir.listFiles().length + " existing attributes with checkout/checkin:"
        + (System.currentTimeMillis()-begin));

        found=wsattclient.findItems(testmodname, null,null,null,null,null);
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

        List<ECLAttributeInfo> found=wsattclient.findItems(testmodname, null,null,null,null,null);
        if (found.size()>0)
        {
            wsattclient.deleteModule(testmodname);
        }
        long begin=System.currentTimeMillis();
        for (ECLAttributeInfo item: toadd)
        {
            wsattclient.createOrUpdateAttribute(item, true, "testing wsclient add unit test");
        }
        System.out.println("Time to individually create " + testdir.listFiles().length + " attributes with checkout/checkin:"
        + (System.currentTimeMillis()-begin));

        found=wsattclient.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to add " + toadd.size() + " items, " + found.size() + " items found");
        }

        begin=System.currentTimeMillis();
        for (ECLAttributeInfo item:toadd)
        {
            wsattclient.createOrUpdateAttribute(item, true, "testing wsclient add unit test");
        }
        System.out.println("Time to individually update " + testdir.listFiles().length + " existing attributes with checkout/checkin:"
        + (System.currentTimeMillis()-begin));

        found=wsattclient.findItems(testmodname, null,null,null,null,null);
        if (found.size()!=toadd.size())
        {
            fail("Tried to update" + toadd.size() + " items, " + found.size() + " items found");
        }
        if (found.size()>0)
        {
            wsattclient.deleteModule(testmodname);
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

