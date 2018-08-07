package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.platform.Platform;
import org.junit.experimental.categories.Category;
@Category(IntegrationTest.class)
public class WsWorkunitsClientIntegrationTest_620 extends BaseWsWorkunitsClientIntegrationTest {

    String version="6.2";
    @Override
    public Platform getPlatform() throws Exception
    {
        Platform p=Platform.get("http", "server_ip", 8010, "dleed", "");
        if (p.getVersion().toString().startsWith(version))
            throw new Exception(p.getIP() + " is no longer on version " + version + "! It is now on " + p.getVersion().toString());
        return p;
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
