package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.platform.WUState;
import org.hpccsystems.ws.client.platform.Workunit;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.junit.Test;

import static org.junit.Assert.*;


public class HPCCWsWorkUnitsClientTest {
    @Test
    public void getStateID() throws Exception {
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(new WorkunitInfo()));

        final WorkunitInfo stateOnly = new WorkunitInfo();
        stateOnly.setState(WUState.ARCHIVED.name());
        assertEquals(WUState.ARCHIVED, HPCCWsWorkUnitsClient.getStateID(stateOnly));

        final WorkunitInfo idOnly = new WorkunitInfo();
        idOnly.setStateID(1);
        assertEquals(WUState.COMPILED, HPCCWsWorkUnitsClient.getStateID(idOnly));

        final WorkunitInfo bogusName = new WorkunitInfo();
        bogusName.setState("FOO");
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(bogusName));

        // Backwards compatible, returns UNKNOWN for null.
        final WorkunitInfo asNull = null;
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(asNull));
    }

    @Test
    public void isWorkunitComplete() throws Exception {
        final WorkunitInfo stateOnly = new WorkunitInfo();
        stateOnly.setState(WUState.ARCHIVED.name());
        assertTrue(HPCCWsWorkUnitsClient.isWorkunitComplete(stateOnly));
    }
}