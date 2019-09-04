package org.hpccsystems.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.hpccsystems.ws.client.platform.WUActionCode;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.junit.Test;


public class HPCCWsWorkUnitsClientTest {
    @Test
    public void getStateID() throws Exception
    {
        // Check we get UNKNOWN if neither the id or name are set.
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(new WorkunitWrapper()));

        // Check that we can determine the WUState when we just set the state name.
        final WorkunitWrapper stateOnly = new WorkunitWrapper();
        stateOnly.setState(WUState.ARCHIVED.name());
        assertEquals(WUState.ARCHIVED, HPCCWsWorkUnitsClient.getStateID(stateOnly));

        // Check that we can determine the WUState when only the state id is set.
        final WorkunitWrapper idOnly = new WorkunitWrapper();
        idOnly.setStateID(1);
        assertEquals(WUState.COMPILED, HPCCWsWorkUnitsClient.getStateID(idOnly));

        // Check that we return "UNKNOWN" for state that don't exist.
        final WorkunitWrapper bogusName = new WorkunitWrapper();
        bogusName.setState("FOO");
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(bogusName));

        // Check for backwards compatibility, returns UNKNOWN for null.
        final WorkunitWrapper asNull = null;
        assertEquals(WUState.UNKNOWN, HPCCWsWorkUnitsClient.getStateID(asNull));
    }

    @Test
    public void isWorkunitComplete() throws Exception {
        // JAPI-83, if state ID isn't set, we should still be able to determine
        // isWorkunitComplete without throwing an NPE if we have a NAME.
        final WorkunitWrapper archived = new WorkunitWrapper();
        archived.setState(WUState.ARCHIVED.name());
        assertTrue(HPCCWsWorkUnitsClient.isWorkunitComplete(archived));

        final WorkunitWrapper compiling = new WorkunitWrapper();
        compiling.setState(WUState.COMPILING.name());
        assertFalse(HPCCWsWorkUnitsClient.isWorkunitComplete(compiling));

        final WorkunitWrapper run = new WorkunitWrapper();
        run.setState(WUState.COMPILED.name());
        run.setAction(WUActionCode.WUActionRun.ordinal());
        assertFalse(HPCCWsWorkUnitsClient.isWorkunitComplete(run));

        final WorkunitWrapper unknown = new WorkunitWrapper();
        unknown.setState("FOOBAR");
        assertFalse(HPCCWsWorkUnitsClient.isWorkunitComplete(unknown));
    }
}
