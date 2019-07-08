package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WsDFUClientTest
{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testFileTypeWrapper()
    {
        DFUFileTypeWrapper filetype = new DFUFileTypeWrapper("FLAT"); // FLAT isn't recognized as one of the file types
        Assert.assertNotNull(filetype);
        Assert.assertFalse(filetype.equals(DFUFileTypeWrapper._Flat));

        filetype = new DFUFileTypeWrapper("Flat");
        Assert.assertNotNull(filetype);
        Assert.assertTrue(filetype.equals(DFUFileTypeWrapper._Flat));

        DFUFileTypeWrapper filetype2 = new DFUFileTypeWrapper(DFUFileTypeWrapper._Flat);
        Assert.assertNotNull(filetype2);
        Assert.assertTrue(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Flat");
        Assert.assertTrue(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Xml");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString(DFUFileTypeWrapper._Xml);
        Assert.assertTrue(filetype.equals(filetype2));

        filetype = new DFUFileTypeWrapper("XmL"); // not valid, needs to be Xml
        Assert.assertFalse(filetype.equals(filetype2));

        filetype = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString(DFUFileTypeWrapper._Csv);
        Assert.assertFalse(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Csv");
        Assert.assertTrue(filetype.equals(filetype2));

        filetype = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString(DFUFileTypeWrapper._Index);
        Assert.assertFalse(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Index");
        Assert.assertTrue(filetype.equals(filetype2));
    }
}
