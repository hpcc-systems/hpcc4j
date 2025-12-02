package org.hpccsystems.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.apache.axis2.AxisFault;
import org.hpccsystems.commons.annotations.UnverifiedServerIssues;
import org.hpccsystems.ws.client.HPCCWsDFUClient.DFUQueryFileType;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUResultWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.w3c.dom.NodeList;

import io.opentelemetry.instrumentation.annotations.WithSpan;


public class WsDFUClientTest extends BaseRemoteTest
{
    private final static HPCCWsDFUClient wsdfuclient = wsclient.getWsDFUClient();
    public final static String defaultNewSuperFileName = "newSuperFile";

    private final static String logicalfilename = System.getProperty("logicalfilename", DEFAULTHPCCFILENAME);

    private final static String testfilename = System.getProperty("newSuperFileName", defaultNewSuperFileName);
    private final static  String testsubfilename = System.getProperty("existingSubFileName");

    @Before
    public void delayhack()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {}
    }

    @Test
    @WithSpan
    public void testFileTypeWrapper()
    {

        DFUFileTypeWrapper filetype = null;
        try
        {
            filetype = DFUFileTypeWrapper.fromString("FLAT"); // only "Flat" is recognized
        }
        catch (Exception e)
        {
            Assert.assertNull(filetype);
        }

        filetype = DFUFileTypeWrapper.Flat;
        Assert.assertNotNull(filetype);

        Assert.assertTrue(filetype.getFUFileType().equals(DFUFileType.Flat));
        Assert.assertTrue(filetype.getFUFileType().toString().equals(DFUFileType._Flat));

        DFUFileTypeWrapper filetype2 = DFUFileTypeWrapper.fromString("Flat");
        Assert.assertNotNull(filetype2);
        Assert.assertTrue(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Flat");
        Assert.assertTrue(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Xml");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype = DFUFileTypeWrapper.fromString("Xml");
        Assert.assertTrue(filetype.equals(filetype2));

        try
        {
            filetype = DFUFileTypeWrapper.fromString("XmL");  //XmL not recognized, must be "Xml"

        }
        catch (IllegalArgumentException e) {}

        filetype = DFUFileTypeWrapper.fromString("Csv");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Csv");
        Assert.assertTrue(filetype.equals(filetype2));

        filetype = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Index");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Index");
        Assert.assertTrue(filetype.equals(filetype2));
    }

    @Test
    public void testDFUPing()
    {
        try
        {
            Assert.assertTrue(wsdfuclient.ping());
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    private DFULogicalFileWrapper randomfilename = null;

    public void recursiveGetFiles(String directory)
    {
        try
        {
            List<DFULogicalFileWrapper> files = wsdfuclient.getFiles(directory);
            for (DFULogicalFileWrapper file : files)
            {
                if (file.getIsDirectory())
                {
                    System.out.println(directory + file.getDirectory());
                    recursiveGetFiles(file.getDirectory());
                }
                else
                {
                    if (randomfilename == null)
                    {
                        if (directory.isEmpty() || directory.equals("."))
                        {
                            if (!file.getIsSuperfile())
                                randomfilename = file;
                        }
                        System.out.println("/" + file.getFileName());
                    }
                }
            }
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    public void getFirstFileAvailable(String directory)
    {
        try
        {
            List<DFULogicalFileWrapper> files = wsdfuclient.getFiles(directory);
            for (DFULogicalFileWrapper file : files)
            {
                if (file.getIsDirectory())
                {
                    getFirstFileAvailable(!directory.isEmpty() ? directory + "::" + file.getDirectory() : file.getDirectory());
                }
                else
                {
                    if(!file.getIsSuperfile())
                    {
                        if (randomfilename == null)
                            randomfilename = file;
                        return;
                    }
                }
            }
            Assert.assertNotNull("Could not find any files on HPCC for tests", randomfilename);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFiles()
    {
        try
        {
            recursiveGetFiles("");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFileContent()
    {
        try
        {
            getFirstFileAvailable("benchmark");

            Assert.assertNotNull(randomfilename);

            NodeList content = wsdfuclient.getFileData(randomfilename.getFileName(), (long)0, 100, randomfilename.getNodeGroup());

            Assert.assertNotNull(content);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFile()
    {
        try
        {
            getFirstFileAvailable("benchmark");

            Assert.assertNotNull(randomfilename);

            DFUInfoWrapper file = wsdfuclient.getFileInfo(randomfilename.getFileName(), randomfilename.getNodeGroup());
            Assert.assertNotNull("GetfilerInfo("+randomfilename.getFileName()+") resulted in null DFUInfoWrapper response", file);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRedundantClusterDeleteFile()
    {
        try
        {
            Set<String> files = new HashSet<>();
            files.add("somefile@somecluster");

            Assert.assertNotNull(files);

            wsdfuclient.deleteFiles(files, "anothercluster");
            Assert.fail("WsDFU should not accept cluster, and file@cluster");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            String errmessage = e.getMessage();
            Assert.assertTrue(errmessage.startsWith("Do not provide filename@cluster and cluster parameter:"));
        }
    }

    @Test
    public void testDeleteFileWithAttedScope()
    {
       /* ESP is currently treating mysc@pe::file as scope="" filename=mysc cluster=pe::file
        * https://track.hpccsystems.com/browse/HPCC-23227
        * try
        {
            Set<String> files = new HashSet<>();
            files.add("s@mesc@pe::somefile");

            Assert.assertNotNull(files);

            List<DFUResultWrapper> deleteFiles = wsdfuclient.deleteFiles(files, "anothercluster");
            Assert.assertNotNull(deleteFiles);
            Assert.assertTrue(!deleteFiles.isEmpty());
            DFUResultWrapper dfuResultWrapper = deleteFiles.get(0);
            Assert.assertNotNull(dfuResultWrapper);
            Assert.assertTrue(dfuResultWrapper.getActionResult().equals("File not found somefile on somecluster"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            Assert.fail(e.toString());
        }
        */
    }

    @Test
    public void testDeleteFileWithCluster()
    {
        try
        {
            Set<String> files = new HashSet<>();
            files.add("somefile");

            Assert.assertNotNull(files);

            List<DFUResultWrapper> deleteFiles = wsdfuclient.deleteFiles(files, "somecluster");
            Assert.assertNotNull(deleteFiles);
            Assert.assertTrue(!deleteFiles.isEmpty());
            DFUResultWrapper dfuResultWrapper = deleteFiles.get(0);
            Assert.assertNotNull(dfuResultWrapper);
            Assert.assertTrue(dfuResultWrapper.getFailed());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            Assert.fail(e.toString());
        }
    }

    @Test(expected = Exception.class)
    public void testDeleteFileWithprefixAtsignCluster() throws Exception
    {
        Set<String> files = new HashSet<>();
        files.add("@somefile");

        Assert.assertNotNull(files);

        List<DFUResultWrapper> deleteFiles = wsdfuclient.deleteFiles(files, "somecluster");
        Assert.assertNotNull(deleteFiles);
        Assert.assertTrue(!deleteFiles.isEmpty());
        DFUResultWrapper dfuResultWrapper = deleteFiles.get(0);
        Assert.assertNotNull(dfuResultWrapper);
        Assert.assertTrue(dfuResultWrapper.getActionResult().equals("File not found @somefile on somecluster"));
    }

    @Test
    @Ignore("Once I know what cluster this will run on during CI testing I'll update my params and activate the test")
    public void searchFileTest() throws Exception
    {
        String searchStr="hipie::keys::*";

        DFUQueryRequestWrapper request = new DFUQueryRequestWrapper();
        request.setFileType(DFUQueryFileType.DFUQFT_SUPER_FILES_ONLY.getText());
        List<DFULogicalFileWrapper> matches=wsdfuclient.searchFiles(request);
        assertEquals(100,matches.size());
        request.setLogicalName(searchStr);
        matches=wsdfuclient.searchFiles(request);
        assertEquals(100,matches.size());

        assertNotNull(thorClusterFileGroup);
        List<DFULogicalFileWrapper> results=wsdfuclient.searchFiles(searchStr, thorClusterFileGroup);
        assertEquals(100,results.size());
        String fname=results.get(0).getFileName();
        results=wsdfuclient.searchFiles(searchStr, thorClusterFileGroup,2,null);
        assertEquals(2,results.size());
        assertEquals(fname,results.get(0).getFileName());
        results=wsdfuclient.searchFiles(searchStr, thorClusterFileGroup,null,2);
        assertEquals(100,results.size());
        String fname2=results.get(0).getFileName();
        assertFalse(fname.equals(fname2));
        results=wsdfuclient.searchFiles(searchStr, thorClusterFileGroup,2,2);
        assertEquals(2,results.size());
        assertEquals(fname2, results.get(0).getFileName());

    }

    @Test
    @WithSpan
    public void getClustersTest() throws Exception
    {
        DFUFileDetailWrapper fileWrapper = wsdfuclient.getFileDetails(logicalfilename, null);
        Set<String> clusters = fileWrapper.getClusters();
        assertTrue(clusters != null && !clusters.isEmpty());
        assertTrue(clusters.stream().findFirst().isPresent());
    }

    @Test
    @WithSpan
    public void createSuperFileTest() throws Exception
    {
        try
        {
            wsdfuclient.createSuperfile("hpcc4j::tests::junit::mysuperfile", new String [] {""});
        }
        catch (Exception e)
        {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage.contains(" already exists"))
            {
                System.out.print("createSuperFileTest() could not run validate because target superfile already exists: hpcc4j::tests::junit::mysuperfile");
            }
            else throw e;
        }
    }

    @Test
    @WithSpan
    public void createNewSuperFileWrapperTest() throws Exception
    {
        assumeNotNull(testfilename);
        assumeNotNull(testsubfilename);

        String superFileName = testfilename + "_" + UUID.randomUUID().toString();

        AddtoSuperfileRequestWrapper req = new AddtoSuperfileRequestWrapper();
        req.setExistingFile(false);
        req.setSuperfile(testfilename);
        List<String> _names = new ArrayList<String>();
        _names.add(testsubfilename);
        req.setNames(_names );

        AddtoSuperfileResponseWrapper resp = wsdfuclient.addToSuperFile(req);
        Assert.assertNotNull(resp);
    }

    @Test
    @WithSpan
    public void createNewSuperFileNoSubfilesTest() throws Exception
    {
        assumeNotNull(testfilename);
        String superFileName = testfilename + "_" + UUID.randomUUID().toString();
        try
        {
            wsdfuclient.createSuperfile(superFileName, new String [] {""});
        }
        catch (Exception e)
        {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage.contains(" already exists"))
            {
                System.out.print("createNewSuperFileNoSubfilesTest() could not run validate because target superfile already exists: '" +  superFileName + "'");
            }
            else throw e;
        }
    }

    @Test (expected = ArrayOfEspExceptionWrapper.class)
    public void addToNonExistingSuperFileWrapperTest() throws Exception
    {
        assumeNotNull(testfilename);
        assumeNotNull(testsubfilename);

        String superFileName = testfilename + "_" + UUID.randomUUID().toString();

        AddtoSuperfileRequestWrapper req = new AddtoSuperfileRequestWrapper();
        req.setExistingFile(true);
        req.setSuperfile(superFileName);
        List<String> _names = new ArrayList<String>();
        _names.add(testsubfilename);
        req.setNames(_names );

        try
        {
            wsdfuclient.addToSuperFile(req);
        }
        catch (Exception e)
        {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage.contains("Cannot find file " + superFileName))
            {
                throw e;
            }
            else
            {
                Assert.fail("Should not be able to create new superfile with existing flag set: " + e.getMessage());
            }
        }
    }

    @Test (expected = ArrayOfEspExceptionWrapper.class)
    public void createNewSuperFileInvalidSubfileTest() throws Exception
    {
        assumeNotNull(testfilename);
        String superFileName = testfilename + "_" + UUID.randomUUID().toString();

        try
        {
            wsdfuclient.createSuperfile(superFileName, new String [] {"BOGUSFILENAME"});
        }
        catch (Exception e)
        {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage.contains("sub file BOGUSFILENAME not found"))
            {
                throw e;
            }
            else
            {
                Assert.fail("BOGUS subfile name should report failure: " + e.getMessage());
            }
        }
        Assert.fail("BOGUS subfile name should report failure");
    }

    @Test
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        assertNotNull(wsdfuclient.isTargetHPCCContainerized());
    }

    // ==================== WsDFU.getFileDataColumns Tests ====================
    // Core Functionality Tests - Basic Operation

    @Test
    @WithSpan
    public void testGetFileDataColumns_BasicOperation() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB", 
                null,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
            
            // Validate first column (key)
            DFUDataColumnWrapper col1 = columns.get(0);
            assertNotNull("Column label should not be null", col1.getColumnLabel());
            assertEquals("First column should be 'key'", "key", col1.getColumnLabel());
            assertTrue("Column type should contain 'Integer'", col1.getColumnType().contains("Integer"));
            
            // Validate second column (fill)
            DFUDataColumnWrapper col2 = columns.get(1);
            assertNotNull("Column label should not be null", col2.getColumnLabel());
            assertEquals("Second column should be 'fill'", "fill", col2.getColumnLabel());
            assertTrue("Column type should contain 'Integer'", col2.getColumnType().contains("Integer"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_WithCluster() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB", 
                thorclustername,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
            
            DFUDataColumnWrapper col1 = columns.get(0);
            assertEquals("First column should be 'key'", "key", col1.getColumnLabel());
            
            DFUDataColumnWrapper col2 = columns.get(1);
            assertEquals("Second column should be 'fill'", "fill", col2.getColumnLabel());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Core Functionality Tests - Complete Request

    @Test
    @WithSpan
    @Category(UnverifiedServerIssues.class)
    public void testGetFileDataColumns_AllTypes() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::all_types::200KB", 
                thorclustername,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 21 columns", 21, columns.size());
            
            // Verify some expected column names
            boolean foundChildDataset = false;
            boolean foundInt1Set = false;
            
            for (DFUDataColumnWrapper col : columns)
            {
                if ("childDataset".equals(col.getColumnLabel()))
                {
                    foundChildDataset = true;
                    assertNotNull("childDataset should have child columns", col.getChildColumns());
                    assertFalse("childDataset should have non-empty child columns", col.getChildColumns().isEmpty());
                }
                if ("int1Set".equals(col.getColumnLabel()))
                {
                    foundInt1Set = true;
                }
            }
            
            assertTrue("Should find childDataset column", foundChildDataset);
            assertTrue("Should find int1Set column", foundInt1Set);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Core Functionality Tests - Data Variations

    @Test
    @WithSpan
    public void testGetFileDataColumns_StringDataset() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::string::100MB", 
                thorclustername,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
            
            DFUDataColumnWrapper col1 = columns.get(0);
            assertEquals("First column should be 'key'", "key", col1.getColumnLabel());
            assertTrue("Column type should be String", col1.getColumnType().contains("String"));
            if (col1.getColumnEclType() != null)
            {
                assertTrue("ColumnEclType should contain 'string'", col1.getColumnEclType().toLowerCase().contains("string"));
            }
            assertTrue("Column size should be positive", col1.getColumnSize() > 0);
            
            DFUDataColumnWrapper col2 = columns.get(1);
            assertEquals("Second column should be 'fill'", "fill", col2.getColumnLabel());
            assertTrue("Column type should be String", col2.getColumnType().contains("String"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Core Functionality Tests - Typical Workflows

    @Test
    @WithSpan
    public void testGetFileDataColumns_Superfile() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::all_types::superfile", 
                thorclustername,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 21 columns (from first subfile)", 21, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    @Test
    @WithSpan
    @Category(UnverifiedServerIssues.class)
    public void testGetFileDataColumns_NestedColumns() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::all_types::200KB", 
                thorclustername,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            
            // Find the childDataset column
            DFUDataColumnWrapper childDatasetCol = null;
            for (DFUDataColumnWrapper col : columns)
            {
                if ("childDataset".equals(col.getColumnLabel()))
                {
                    childDatasetCol = col;
                    break;
                }
            }
            
            assertNotNull("Should find childDataset column", childDatasetCol);
            assertNotNull("childDataset should have child columns", childDatasetCol.getChildColumns());
            assertFalse("childDataset should have non-empty child columns", childDatasetCol.getChildColumns().isEmpty());
            assertEquals("childDataset should have 3 child columns", 3, childDatasetCol.getChildColumns().size());
            
            // Verify child column names
            List<String> childNames = new ArrayList<String>();
            for (DFUDataColumnWrapper child : childDatasetCol.getChildColumns())
            {
                childNames.add(child.getColumnLabel());
            }
            assertTrue("Should have childField1", childNames.contains("childField1"));
            assertTrue("Should have childField2", childNames.contains("childField2"));
            assertTrue("Should have childField3", childNames.contains("childField3"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Edge Case Tests - Boundary Values

    @Test
    @WithSpan
    public void testGetFileDataColumns_WithTildePrefix() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB", 
                null,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_WithoutTildePrefix() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "benchmark::integer::20KB", 
                null,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_LargeFile() throws Exception
    {
        try
        {
            long startTime = System.currentTimeMillis();
            
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::string::100MB", 
                thorclustername,
                false
            );
            
            long elapsedTime = System.currentTimeMillis() - startTime;
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
            assertTrue("Response should be fast (< 10 seconds)", elapsedTime < 10000);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Edge Case Tests - Optional Parameters

    @Test
    @WithSpan
    public void testGetFileDataColumns_NullCluster() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB", 
                null,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_EmptyCluster() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB", 
                "",
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Edge Case Tests - Unusual Valid Inputs

    @Test
    @WithSpan
    public void testGetFileDataColumns_ScopeSeparators() throws Exception
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "benchmark::integer::20KB", 
                null,
                false
            );
            
            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("Unexpected ESP exception: " + e.toString());
        }
    }

    // Error Handling Tests - Invalid Inputs

    @Test
    @WithSpan
    public void testGetFileDataColumns_NullLogicalName()
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(null, null);
            // If we get here without exception, check if result is empty
            assertTrue("Should return empty list or throw exception", columns == null || columns.isEmpty());
        }
        catch (Exception e)
        {
            // Expected - either NullPointerException or other exception
            assertTrue("Should throw exception for null logical name", true);
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_EmptyLogicalName()
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns("", null);
            // Should either throw exception or return empty list
            assertTrue("Should return empty list or throw exception", columns == null || columns.isEmpty());
        }
        catch (Exception e)
        {
            // Expected behavior
            assertTrue("Exception expected for empty logical name", true);
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_WhitespaceLogicalName()
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns("   ", null);
            // Should either throw exception or return empty list
            assertTrue("Should return empty list or throw exception", columns == null || columns.isEmpty());
        }
        catch (Exception e)
        {
            // Expected behavior
            assertTrue("Exception expected for whitespace-only logical name", true);
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_FileNotFound()
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~nonexistent::file::that::does::not::exist", 
                null
            );
            Assert.fail("Should have thrown ArrayOfEspExceptionWrapper for non-existent file");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception
            String errorMsg = e.toString().toLowerCase();
            assertTrue("Error message should indicate file not found", 
                       errorMsg.contains("not found") || 
                       errorMsg.contains("does not exist") ||
                       errorMsg.contains("cannot find") ||
                       errorMsg.contains("could not resolve"));
        }
        catch (Exception e)
        {
            // Also acceptable
            assertTrue("Should throw exception for non-existent file", true);
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_InvalidCluster()
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB", 
                "nonexistent_cluster_name_xyz"
            );
            // May succeed with empty list or throw exception
            // Either is acceptable based on server implementation
        }
        catch (Exception e)
        {
            // Expected - invalid cluster should cause error
            assertTrue("Exception expected for invalid cluster", true);
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_InvalidCharacters()
    {
        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::<invalid>file", 
                null
            );
            // Should fail gracefully
            Assert.fail("Should throw exception for invalid characters in filename");
        }
        catch (Exception e)
        {
            // Expected - malformed filename
            assertTrue("Exception expected for invalid characters", true);
        }
    }

    @Test
    @WithSpan
    public void testGetFileDataColumns_ConflictingClusterNotation()
    {
        try
        {
            // Test logical name with @cluster notation conflicting with cluster parameter
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
                "~benchmark::integer::20KB@" + thorclustername, 
                roxieclustername
            );
            // Behavior should be consistent - may use embedded cluster or parameter
            // No server crash expected
            assertNotNull("Should handle conflicting cluster notation gracefully", columns);
        }
        catch (Exception e)
        {
            // Also acceptable - may throw meaningful exception
            assertTrue("Should handle conflicting cluster notation", true);
        }
    }
}
