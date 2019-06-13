package org.hpccsystems.ws.client.platform;

import static org.junit.Assert.fail;

import java.util.List;

import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.junit.Test;

public class RampsDevRegressionTest extends EclParseRegressionTest
{
    @Test
    public void testFileMetadata() throws Exception
    {
        //superfile
        List<DFUDataColumnWrapper> info = getDFUClient().getFileMetaData("test::wsclient::superfile",null);
        if (!info.get(0).getColumnLabel().equals("match_confidence"))
        {
            fail("Did not retrieve column data for superfile");
        }
        //file with no ecl definition
        info = getDFUClient().getFileMetaData("test::wsclient::noecl",null);
        if (!info.get(0).getColumnLabel().equals("contents"))
        {
             fail("Did not retrieve column data for file with no ecl rec structure");
        }

        //file with child datasets
        info = getDFUClient().getFileMetaData("test::wsclient::childdatasets",null);
        if (!info.get(21).getColumnLabel().equals("links") || !info.get(21).getColumnType().equals("Dataset")
                 || !info.get(21).getChildColumns().get(0).getColumnLabel().equals("associationfromcontextuid"))
        {
            fail("child dataset not returned correctly");
        }

        //superfile with no subfiles
        try
        {
             info = getDFUClient().getFileMetaData("test::wsclient::emptysuperfile", null);
             fail("Should have thrown error");
        }
        catch (Exception e)
        {
            if (!e.getMessage().contains("is a superfile with no subfiles"))
            {
                fail("Should have returned appropriate error message");
            }
        }
    }

    @Test
    public void testRegressionRecordStructures() throws Exception
    {
        super.testRegressionRecordStructures(false);
    }
}
