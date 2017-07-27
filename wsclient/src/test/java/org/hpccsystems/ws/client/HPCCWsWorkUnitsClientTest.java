package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.platform.WUState;
import org.hpccsystems.ws.client.platform.Workunit;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.junit.Test;

import static org.junit.Assert.*;


public class HPCCWsWorkUnitsClientTest {
    @Test
    public void getStateID() throws Exception {

        // Check we get UNKNOWN if neither the id or name are set.
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(new WorkunitInfo()));

        // Check that we can determine the WUState when we just set the state name.
        final WorkunitInfo stateOnly = new WorkunitInfo();
        stateOnly.setState(WUState.ARCHIVED.name());
        assertEquals(WUState.ARCHIVED, HPCCWsWorkUnitsClient.getStateID(stateOnly));

        // Check that we can determine the WUState when only the state id is set.
        final WorkunitInfo idOnly = new WorkunitInfo();
        idOnly.setStateID(1);
        assertEquals(WUState.COMPILED, HPCCWsWorkUnitsClient.getStateID(idOnly));

        // Check that we return "UNKNOWN" for state that don't exist.
        final WorkunitInfo bogusName = new WorkunitInfo();
        bogusName.setState("FOO");
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(bogusName));

        // Check for backwards compatibility, returns UNKNOWN for null.
        final WorkunitInfo asNull = null;
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(asNull));
    }

    @Test
    public void isWorkunitComplete() throws Exception {
        // JAPI-83, if state ID isn't set, we should still be able to determine
        // isWorkunitComplete without throwing an NPE if we have a NAME.
        final WorkunitInfo stateOnly = new WorkunitInfo();
        stateOnly.setState(WUState.ARCHIVED.name());
        assertTrue(HPCCWsWorkUnitsClient.isWorkunitComplete(stateOnly));
    }
}