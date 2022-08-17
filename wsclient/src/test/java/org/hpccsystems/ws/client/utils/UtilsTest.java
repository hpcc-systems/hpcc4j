package org.hpccsystems.ws.client.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ibm.icu.impl.Assert;

public class UtilsTest
{
    @Test
    public void testEnsureTrailingSlashNoSlashSpecified()
    {
        assertEquals(Utils.ensureTrailingPathSlash(""), Character.toString(Utils.LINUX_SEP)); //no sep in path, default to lin sep
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP)), Character.toString(Utils.LINUX_SEP));//no change expected
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)), Character.toString(Utils.WIN_SEP)); //no change expected
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP));//no change expected
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path"), "C:\\some\\Path\\");
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path\\"), "C:\\some\\Path\\");
        assertEquals(Utils.ensureTrailingPathSlash("/another/path"), "/another/path/");
        assertEquals(Utils.ensureTrailingPathSlash("/another/path/"), "/another/path/");
    }

    @Test
    public void testEnsureTrailingSlashSlashSpecified()
    {
        assertEquals(Utils.ensureTrailingPathSlash("", Utils.LINUX_SEP), Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash("", Utils.WIN_SEP), Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), Utils.WIN_SEP), Character.toString(Utils.LINUX_SEP)+Utils.WIN_SEP);
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), Utils.LINUX_SEP), Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), Utils.WIN_SEP), Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), Utils.LINUX_SEP), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.LINUX_SEP), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.WIN_SEP), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)+Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path", Utils.LINUX_SEP), "C:\\some\\Path\\"+Utils.LINUX_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path", Utils.WIN_SEP), "C:\\some\\Path\\"+Utils.WIN_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path\\", Utils.LINUX_SEP), "C:\\some\\Path\\" + Utils.LINUX_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path\\", Utils.WIN_SEP), "C:\\some\\Path\\");
        assertEquals(Utils.ensureTrailingPathSlash("/another/path", Utils.LINUX_SEP), "/another/path" + Utils.LINUX_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("/another/path", Utils.WIN_SEP), "/another/path/"+ Utils.WIN_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("/another/path/", Utils.LINUX_SEP), "/another/path/");
        assertEquals(Utils.ensureTrailingPathSlash("/another/path/", Utils.WIN_SEP), "/another/path/"+Utils.WIN_SEP);
    }

    @Test
    public void testEnsureTrailingSlashUseLinuxBoolTest()
    {
        assertEquals(Utils.ensureTrailingPathSlash("", "true"), Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash("", "false"), Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash("", "xyz"), Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), "false"), Character.toString(Utils.LINUX_SEP)+Utils.WIN_SEP);
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), "true"), Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), "false"), Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), "true"), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), "true"), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP));
        assertEquals(Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), "false"), Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)+Character.toString(Utils.WIN_SEP));
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path", "true"), "C:\\some\\Path\\"+Utils.LINUX_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path", "false"), "C:\\some\\Path\\"+Utils.WIN_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path\\", "true"), "C:\\some\\Path\\" + Utils.LINUX_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("C:\\some\\Path\\", "false"), "C:\\some\\Path\\");
        assertEquals(Utils.ensureTrailingPathSlash("/another/path", "TRUE"), "/another/path" + Utils.LINUX_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("/another/path", "FALSE"), "/another/path/"+ Utils.WIN_SEP);
        assertEquals(Utils.ensureTrailingPathSlash("/another/path/", "TrUe"), "/another/path/");
        assertEquals(Utils.ensureTrailingPathSlash("/another/path/", "FalSe"), "/another/path/"+Utils.WIN_SEP);
    }
}
