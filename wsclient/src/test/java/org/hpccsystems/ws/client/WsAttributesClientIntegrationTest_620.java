package org.hpccsystems.ws.client;

import org.junit.experimental.categories.Category;
@Category(IntegrationTest.class)
public class WsAttributesClientIntegrationTest_620 extends BaseWsAttributesClientIntegrationTest
{
    @Override
    public String getHPCCVersion()
    {
        return "6.2";
    }

    @Override
    public String getThorClusterName()
    {
        return "dev_thor";
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

    @Override
    public void testWriteAttributes() throws Exception
    {
        super.testWriteAttributes();
    }

    @Override
    public void testWriteSingleAttribute() throws Exception
    {
        super.testWriteSingleAttribute();
    }

    @Override
    public void testInvalidAttributes() throws Exception
    {
        super.testInvalidAttributes();
    }
}
