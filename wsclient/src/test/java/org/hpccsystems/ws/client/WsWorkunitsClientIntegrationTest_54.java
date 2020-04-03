package org.hpccsystems.ws.client;

import org.junit.experimental.categories.Category;
@Category(IntegrationTest.class)
public class WsWorkunitsClientIntegrationTest_54 extends BaseWsWorkunitsClientIntegrationTest
{
    String hpccver="5.4";

    @Override
    public void confirmPlatform() throws Exception
    {
        if (platform.getVersion().toString().startsWith(hpccver))
            throw new Exception("Cannot run 5.4 tests against HPCC cluster on '" + platform.getIP() + "' version: '" + platform.getVersion().toString() + "'");
    }

    @Override
    public String getThorClusterName()
    {
        return "hthor_qa";
    }

    @Override
    public String getRoxieClusterName()
    {
        return "roxie_bair_qa_01";
    }

    @Override
    public String getHthorClusterName()
    {
        return "hthor_qa";
    }
}
