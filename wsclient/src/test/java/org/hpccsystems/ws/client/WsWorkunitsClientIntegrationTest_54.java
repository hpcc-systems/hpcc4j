package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.platform.Platform;
import org.junit.experimental.categories.Category;
@Category(IntegrationTest.class)
public class WsWorkunitsClientIntegrationTest_54 extends BaseWsWorkunitsClientIntegrationTest {

    String version="5.4";
    @Override
    public Platform getPlatform() throws Exception
    {
        Platform p=Platform.get("http", "10.240.32.21", 8010, "dleed", "zaq1ZAQ!");
        if (p.getVersion().toString().startsWith(version))
            throw new Exception(p.getIP() + " is no longer on version " + version + "! It is now on " + p.getVersion().toString());
        return p;
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
