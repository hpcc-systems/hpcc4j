package org.hpccsystems.ws.client.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ibm.icu.impl.Assert;

public class UtilsTest
{
    @Test
    public void testEnsureTrailingSlashTrailingWhiteSpace()
    {
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(""));
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP)+ "   "));
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP) + "  "));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)+"\t"));
        assertEquals("C:\\some\\Path\\", Utils.ensureTrailingPathSlash("C:\\some\\Path  "));
        assertEquals("C:\\some\\Path\\", Utils.ensureTrailingPathSlash("C:\\some\\Path\\ "));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path "));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/\t\t"));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/\n"));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/" + '\u005Cn'));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/ " + '\u005Ct'));
    }

    @Test
    public void testEnsureTrailingSlashNoSlashSpecified()
    {
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash("")); //no sep in path, default to lin sep
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP)));//no change expected
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP))); //no change expected
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)));//no change expected
        assertEquals("C:\\some\\Path\\", Utils.ensureTrailingPathSlash("C:\\some\\Path"));
        assertEquals("C:\\some\\Path\\", Utils.ensureTrailingPathSlash("C:\\some\\Path\\"));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path"));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/"));
    }

    @Test
    public void testEnsureTrailingSlashSlashSpecified()
    {
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash("", Utils.LINUX_SEP));
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash("", Utils.WIN_SEP));
        assertEquals(Character.toString(Utils.LINUX_SEP)+Utils.WIN_SEP, Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), Utils.WIN_SEP));
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), Utils.LINUX_SEP));
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), Utils.WIN_SEP));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), Utils.LINUX_SEP));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.LINUX_SEP));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)+Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.WIN_SEP));
        assertEquals("C:\\some\\Path\\"+Utils.LINUX_SEP, Utils.ensureTrailingPathSlash("C:\\some\\Path", Utils.LINUX_SEP));
        assertEquals("C:\\some\\Path\\"+Utils.WIN_SEP, Utils.ensureTrailingPathSlash("C:\\some\\Path", Utils.WIN_SEP));
        assertEquals("C:\\some\\Path\\" + Utils.LINUX_SEP, Utils.ensureTrailingPathSlash("C:\\some\\Path\\", Utils.LINUX_SEP));
        assertEquals("C:\\some\\Path\\", Utils.ensureTrailingPathSlash("C:\\some\\Path\\", Utils.WIN_SEP));
        assertEquals("/another/path" + Utils.LINUX_SEP, Utils.ensureTrailingPathSlash("/another/path", Utils.LINUX_SEP));
        assertEquals("/another/path/"+ Utils.WIN_SEP, Utils.ensureTrailingPathSlash("/another/path", Utils.WIN_SEP));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/", Utils.LINUX_SEP));
        assertEquals("/another/path/"+Utils.WIN_SEP, Utils.ensureTrailingPathSlash("/another/path/", Utils.WIN_SEP));
    }

    @Test
    public void testEnsureTrailingSlashUseLinuxBoolTest()
    {
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash("", "true"));
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash("", "false"));
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash("", "xyz"));
        assertEquals(Character.toString(Utils.LINUX_SEP)+Utils.WIN_SEP, Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), "false"));
        assertEquals(Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.LINUX_SEP), "true"));
        assertEquals(Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), "false"));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP), "true"));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), "true"));
        assertEquals(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP)+Character.toString(Utils.WIN_SEP), Utils.ensureTrailingPathSlash(Character.toString(Utils.WIN_SEP)+Character.toString(Utils.LINUX_SEP), "false"));
        assertEquals("C:\\some\\Path\\"+Utils.LINUX_SEP, Utils.ensureTrailingPathSlash("C:\\some\\Path", "true"));
        assertEquals("C:\\some\\Path\\"+Utils.WIN_SEP, Utils.ensureTrailingPathSlash("C:\\some\\Path", "false"));
        assertEquals("C:\\some\\Path\\" + Utils.LINUX_SEP, Utils.ensureTrailingPathSlash("C:\\some\\Path\\", "true"));
        assertEquals("C:\\some\\Path\\", Utils.ensureTrailingPathSlash("C:\\some\\Path\\", "false"));
        assertEquals("/another/path" + Utils.LINUX_SEP, Utils.ensureTrailingPathSlash("/another/path", "TRUE"));
        assertEquals("/another/path/"+ Utils.WIN_SEP, Utils.ensureTrailingPathSlash("/another/path", "FALSE"));
        assertEquals("/another/path/", Utils.ensureTrailingPathSlash("/another/path/", "TrUe"));
        assertEquals("/another/path/"+Utils.WIN_SEP, Utils.ensureTrailingPathSlash("/another/path/", "FalSe"));
    }
}
