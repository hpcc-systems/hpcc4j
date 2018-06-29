package org.hpccsystems.ws.client.platform;

public class RampsDevRegressionTest extends EclParseRegressionTest {

    @Override
    public int getPort() {
        return 8010;
    }

    @Override
    public String getHttp() {
        return "http";
    }
    
    @Override
    public String getUsername() {
        return "dleed";
    }

    @Override
    public String getPassword() {
        return System.getenv("hpccpassword");
    }
    
    @Override
    public String getIP() {
        return "10.241.100.159";
    }
    
    @Override
    public void testRegressionRecordStructures() throws Exception {
        super.testRegressionRecordStructures();
    }
}
