package org.hpccsystems.commons.ecl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.json.JSONObject;

import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.UnparsableContentException;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecordDefinitionTests
{

    private static final String testClusterIp        = "192.168.56.101";
    // private static final String testIntegerKVDataset = "~benchmark::integer::20kb";
    private static final String testIntegerKVDataset = "~demo::example_dataset";

    private Connection          espConn              = null;

    @Before
    public void setup()
    {
        try
        {
            this.espConn = new Connection("http://" + testClusterIp + ":8010?test");
            espConn.setUserName("");
            espConn.setPassword("");
        }
        catch (Exception e)
        {}
    }

    @Test
    public void testJsonRecordParsing() throws Exception
    {
        HPCCWsDFUClient dfuClient = HPCCWsDFUClient.get(this.espConn);
        String jsonRecDefStr = null;
        try
        {
            String uniqueID = "HPCC-FILE: " + "Test";
            DFUFileAccessInfoWrapper fileinfoforread = dfuClient.getFileAccess(SecAccessType.Read,
                    this.testIntegerKVDataset, "", 300, uniqueID, true, false, true);
            jsonRecDefStr = fileinfoforread.getRecordTypeInfoJson();
            JSONObject jsonRecDef = new JSONObject(jsonRecDefStr);
            FieldDef recDef = RecordDefinitionTranslator.parseJsonRecordDefinition(jsonRecDef);

            JSONObject tJsonRecDef = RecordDefinitionTranslator.toJson(recDef);

            if (tJsonRecDef.equals(jsonRecDef))
            {
                System.out.println(jsonRecDef + "\n");
                System.out.println(tJsonRecDef + "\n");
                Assert.fail("Translated JSON record definition differs from original");
            }
        }
        catch (UnparsableContentException e)
        {
            Assert.fail("Encountered invalid record definition: '" + jsonRecDefStr + "'");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            Assert.fail("Exception occurred: '" + e.getMessage() + "'");
        }

    }

    @After
    public void shutdown()
    {

    }
}
