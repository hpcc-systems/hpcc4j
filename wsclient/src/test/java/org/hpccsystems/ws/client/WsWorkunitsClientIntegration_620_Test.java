package org.hpccsystems.ws.client;

public class WsWorkunitsClientIntegration_620_Test extends BaseWsWorkunitsClientIntegrationTest
{
    String hpccver="6.2";
    @Override
    protected void confirmPlatform() throws Exception
    {
        if (platform.getVersion().toString().startsWith(hpccver))
            throw new Exception("Cannot run 6.2 tests against HPCC cluster on '" + platform.getIP() + "' version: '" + platform.getVersion().toString() + "'");
    }

    @Override
    public String getThorClusterName()
    {
        return "thor";
    }

    @Override
    public String getRoxieClusterName()
    {
        return "roxie";
    }

    @Override
    public String getHthorClusterName()
    {
        return "hthor";
    }
}
