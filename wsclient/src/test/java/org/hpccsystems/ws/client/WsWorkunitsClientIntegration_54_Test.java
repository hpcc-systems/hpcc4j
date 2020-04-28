package org.hpccsystems.ws.client;

public class WsWorkunitsClientIntegration_54_Test extends BaseWsWorkunitsClientIntegrationTest
{
    String hpccver="5.4";

    @Override
    public void confirmPlatform() throws Exception
    {
        if (super.platform.getVersion().toString().startsWith(hpccver))
            throw new Exception("Cannot run 5.4 tests against HPCC cluster on '" + super.platform.getIP() + "' version: '" + super.platform.getVersion().toString() + "'");
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
