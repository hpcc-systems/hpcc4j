package org.hpccsystems.dfs.client;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.dfs.cluster.RemapInfo;
import org.hpccsystems.ws.client.BaseRemoteTest;
import org.hpccsystems.ws.client.utils.Connection;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSHPCCFile extends BaseRemoteTest
{
    private static HPCCFile mockHPCCFile = null;

    private static final String mockValidFileName = "some::file::name";
    private static final String mockValidURL = "http://someesp:8010/somepath";
    private static final String mockProjectList = "uint8,r8,varStr,";
    private static final String mockFilter = "uint8 > 2";
    private static final String mockIP = "10.1.1.1";
    private static Connection mockConnectionObj = null;
    private static String mockTargetFileCluster = thorClusterFileGroup;
    private static RemapInfo mockRemapInfo = new RemapInfo(100, mockIP);
    private static final int mockFilePartsMax = 2;

    @Before
    public void setup() throws HpccFileException
    {
        mockHPCCFile = new HPCCFile(DEFAULTHPCCFILENAME, connection, mockProjectList, mockFilter, mockRemapInfo, mockFilePartsMax, mockTargetFileCluster);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Test
    public final void testHPCCFileStringConnection()
    {
        HPCCFile testfile = null;
        try
        {
            testfile = new HPCCFile(mockValidFileName, mockConnectionObj);
            Assert.assertNotNull(testfile);
        }
        catch (HpccFileException e)
        {
            fail(e.getMessage());
        }
    }

    @Test
    public final void testHPCCFileStringStringStringString() throws MalformedURLException, HpccFileException
    {
        HPCCFile testfile = new HPCCFile(mockValidFileName, mockValidURL, "user", "pass");
        Assert.assertNotNull(testfile);
    }

    @Test
    public final void testHPCCFileStringConnectionStringStringRemapInfoIntString() throws HpccFileException
    {
        HPCCFile testfile = new HPCCFile(mockValidFileName, mockConnectionObj, mockProjectList, mockFilter, mockRemapInfo, 400, mockTargetFileCluster);
        Assert.assertNotNull(testfile);
    }

    @Test(expected = org.hpccsystems.commons.errors.HpccFileException.class)
    public final void testHPCCFileStringConnectionStringStringRemapInfoIntStringBadFilter() throws HpccFileException
    {
        new HPCCFile(mockValidFileName, mockConnectionObj, mockProjectList, "invalidFilter", mockRemapInfo, 400, mockTargetFileCluster);
    }

    @Test
    public final void testHPCCFileStringConnectionStringStringRemapInfoIntStringEmptyFilter() throws HpccFileException
    {
        new HPCCFile(mockValidFileName, mockConnectionObj, mockProjectList, "", mockRemapInfo, 400, mockTargetFileCluster);
    }

    @Test
    public final void testGetProjectList()
    {
        String projectList = mockHPCCFile.getProjectList();
        Assert.assertEquals(mockProjectList, projectList);
    }

    @Test(expected = Exception.class)
    public final void testSetProjectListInvalidColumns() throws Exception
    {
        mockHPCCFile.setProjectList("colX, colY, colZ");
        mockHPCCFile.getRecordDefinition();
    }

    @Test
    public final void testGetTargetfilecluster()
    {
        Assert.assertEquals(mockTargetFileCluster, mockHPCCFile.getTargetfilecluster());
    }

    @Test(expected = HpccFileException.class)
    public final void testSetTargetfilecluster() throws HpccFileException
    {
        mockHPCCFile.getRecordDefinition();//ensures fileparts created
        mockHPCCFile.setTargetfilecluster("randomname");
        mockHPCCFile.getRecordDefinition(); //makes sure the new cluster took affect
    }

    @Test
    public final void testGetClusterRemapInfo()
    {
        Assert.assertEquals(mockRemapInfo, mockHPCCFile.getClusterRemapInfo());
    }

    @Test
    public final void testSetClusterRemapInfo() throws HpccFileException
    {
        mockHPCCFile.getRecordDefinition(); //force filepart creation

        RemapInfo newremapInfo = new RemapInfo(100, "1"+mockIP);
        mockHPCCFile.setClusterRemapInfo(newremapInfo);
        DataPartition[] fileParts = mockHPCCFile.getFileParts();
        Assert.assertNotNull(fileParts);
        Assert.assertTrue(fileParts.length > 0);
        String[] copyLocations = fileParts[0].getCopyLocations();
        Assert.assertNotNull(copyLocations);
        Assert.assertTrue(copyLocations.length > 0);
        Assert.assertEquals("1"+mockIP, copyLocations[0]);
    }

    @Test
    public final void testGetFilter() throws Exception
    {
        mockHPCCFile.setFilter(mockFilter);
        FileFilter firstfilter = mockHPCCFile.getFilter();
        Assert.assertNotNull(firstfilter);
        mockHPCCFile.setFilter(mockFilter+" OR uint8 > 2");
        FileFilter secondfilter = mockHPCCFile.getFilter();
        Assert.assertNotNull(secondfilter);
        Assert.assertFalse(firstfilter.toString().equals(secondfilter.toString()));
    }

    @Test
    public final void testSetFiltermethods() throws Exception
    {
        DataPartition[] fileparts = mockHPCCFile.getFileParts();
        mockHPCCFile.setFilter(new FileFilter("somefield = 100"));
        FileFilter filepartfilter = fileparts[0].getFilter();
        System.out.println(filepartfilter.toJson());
        Assert.assertTrue(filepartfilter.toJson().equals("\"keyFilter\": [\"somefield=[100]\"]"));

        mockHPCCFile.setFilter("anotherfield != 'xyz'");
        filepartfilter = fileparts[0].getFilter();
        System.out.println(filepartfilter.toJson());
        Assert.assertTrue(filepartfilter.toJson().equals("\"keyFilter\": [\"anotherfield=(,'xyz'),('xyz',)\"]"));
    }

    @Test(expected = Exception.class)
    public final void testSetFilterInvalid() throws Exception
    {
        mockHPCCFile.setFilter("Invalidfilter=*1");
    }

    @Test
    public final void testGetFileName()
    {
        Assert.assertEquals(DEFAULTHPCCFILENAME, mockHPCCFile.getFileName());
    }

    @Test
    public final void testGetFileParts() throws HpccFileException
    {
        DataPartition[] fileParts = mockHPCCFile.getFileParts();
        Assert.assertNotNull(fileParts);
        Assert.assertTrue(fileParts.length > 0);
    }

    @Test
    public final void testGetRecordDefinition() throws HpccFileException
    {
        FieldDef recordDefinition = mockHPCCFile.getRecordDefinition();
        Assert.assertNotNull(recordDefinition);
        Assert.assertEquals(21, recordDefinition.getNumDefs());
    }

    @Test
    public final void testGetProjectedRecordDefinition() throws HpccFileException
    {
        FieldDef projectedRecordDefinition = mockHPCCFile.getProjectedRecordDefinition();
        Assert.assertNotNull(projectedRecordDefinition);
        Assert.assertEquals(3, projectedRecordDefinition.getNumDefs());
    }

    private boolean fieldDefinitionsAreSeparate(FieldDef fieldDef1, FieldDef fieldDef2)
    {
        for (int i = 0; i < fieldDef1.getNumDefs(); i++)
        {
            if (fieldDef1.getDef(i) == fieldDef2.getDef(i))
            {
                return false;
            }

            if (!fieldDefinitionsAreSeparate(fieldDef1.getDef(i), fieldDef2.getDef(i)))
            {
                return false;
            }
        }

        return true;
    }

    @Test
    public final void testProjectedRecordDefCloning() throws Exception 
    {
        FieldDef recordDef = mockHPCCFile.getRecordDefinition();

        String[] fieldNames = new String[recordDef.getNumDefs()];
        for (int i = 0; i < recordDef.getNumDefs(); i++)
        {
            fieldNames[i] = recordDef.getDef(i).getFieldName();
        }

        String projectList = String.join(",", fieldNames);
        mockHPCCFile.setProjectList(projectList);
        FieldDef projectedRecordDefinition = mockHPCCFile.getProjectedRecordDefinition();

        // Ensure the projected record definition is a clone and not modifying the original record definition
        assert(fieldDefinitionsAreSeparate(recordDef, projectedRecordDefinition));
    }

    @Test
    public final void testIsIndex()
    {
        Assert.assertFalse(mockHPCCFile.isIndex());
    }

}
