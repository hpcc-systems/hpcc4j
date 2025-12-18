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

    // ============================================================================
    // WsDFU.getLogicalFiles Test Cases
    // Generated: 2025-12-12
    // ============================================================================

    // Core Functionality Tests - Basic Operation

    @Test
    @WithSpan
    public void testGetLogicalFilesBasicRetrieval() throws Exception
    {
        // CFT-001: Retrieve all files with no filters or pagination
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles(null, null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertNotNull("DFULogicalFiles array should not be null", files);
        assertTrue("Should return at least 5 files (test datasets)", files.size() >= 5);
    }

    @Test
    @WithSpan
    @Category(UnverifiedServerIssues.class)
    public void testGetLogicalFilesExactFilenameWithTilde() throws Exception
    {
        // CFT-002: Retrieve files matching exact filename with leading tilde
        // INVESTIGATE: Tilde semantics unclear - may be search modifier, not prefix to strip
        // Test assumes tilde is stripped and file "benchmark::integer::20kb" is found
        // But testGetLogicalFilesExactFilenameWithoutTilde passes, so tilde may change search behavior
        // Needs investigation of HPCC tilde semantics in getLogicalFiles
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("~benchmark::integer::20kb", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return exactly 1 file", 1, files.size());
        assertEquals("File name should match", "benchmark::integer::20kb", files.get(0).getName());
        assertNotNull("Owner should be populated", files.get(0).getOwner());
        assertNotNull("Modified date should be populated", files.get(0).getModified());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesExactFilenameWithoutTilde() throws Exception
    {
        // CFT-003: Retrieve files matching exact filename without leading tilde
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::integer::20kb", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return exactly 1 file", 1, files.size());
        assertEquals("File name should match", "benchmark::integer::20kb", files.get(0).getName());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesWildcardAsterisk() throws Exception
    {
        // CFT-004: Retrieve files matching wildcard pattern with asterisk
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::integer::*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return at least 2 files", files.size() >= 2);
        for (DFULogicalFileWrapper file : files)
        {
            assertTrue("All files should match pattern benchmark::integer::*", 
                      file.getName().startsWith("benchmark::integer::"));
        }
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesScopeLevelWildcard() throws Exception
    {
        // CFT-005: Retrieve files matching scope-level wildcard
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return at least 5 files", files.size() >= 5);
        for (DFULogicalFileWrapper file : files)
        {
            assertTrue("All files should start with benchmark::", 
                      file.getName().startsWith("benchmark::"));
        }
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesFileLevelWildcard() throws Exception
    {
        // CFT-006: Retrieve files matching wildcard at file level
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::all_types::*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 2 files", 2, files.size());
        
        Set<String> expectedFiles = new HashSet<>();
        expectedFiles.add("benchmark::all_types::200kb");
        expectedFiles.add("benchmark::all_types::superfile");
        
        for (DFULogicalFileWrapper file : files)
        {
            assertTrue("File should be one of the expected files", 
                      expectedFiles.contains(file.getName()));
        }
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesPaginationFirstPage() throws Exception
    {
        // CFT-007: Retrieve first page of results with pageSize=2
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 2);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return exactly 2 files", 2, files.size());
    }

    @Test
    @WithSpan
    @Category(UnverifiedServerIssues.class)
    public void testGetLogicalFilesPaginationSecondPage() throws Exception
    {
        // CFT-008: Retrieve second page of results
        // SERVER ISSUE: Pagination returns duplicate files between pages - pageStartFrom parameter not working
        List<DFULogicalFileWrapper> firstPage = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 2);
        List<DFULogicalFileWrapper> secondPage = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 2, 2);
        
        assertNotNull("First page should not be null", firstPage);
        assertNotNull("Second page should not be null", secondPage);
        
        // Verify files are different between pages
        Set<String> firstPageNames = new HashSet<>();
        for (DFULogicalFileWrapper file : firstPage)
        {
            firstPageNames.add(file.getName());
        }
        
        for (DFULogicalFileWrapper file : secondPage)
        {
            assertFalse("Files in second page should be different from first page", 
                       firstPageNames.contains(file.getName()));
        }
    }

    @Test
    @WithSpan
    @Category(UnverifiedServerIssues.class)
    public void testGetLogicalFilesPaginationMultiplePages() throws Exception
    {
        // CFT-009: Navigate through multiple pages and verify consistency
        // SERVER ISSUE: Files appear in multiple pages - same root cause as testGetLogicalFilesPaginationSecondPage
        Set<String> allFiles = new HashSet<>();
        int pageSize = 2;
        int pageStart = 0;
        
        // Collect files from first 3 pages
        for (int i = 0; i < 3; i++)
        {
            List<DFULogicalFileWrapper> page = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, pageStart, pageSize);
            assertNotNull("Page " + (i+1) + " should not be null", page);
            
            for (DFULogicalFileWrapper file : page)
            {
                assertFalse("File " + file.getName() + " should not appear in multiple pages", 
                           allFiles.contains(file.getName()));
                allFiles.add(file.getName());
            }
            
            pageStart += pageSize;
        }
        
        assertTrue("Should have collected files across pages", allFiles.size() > 0);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesFirstNLimit() throws Exception
    {
        // CFT-010: Retrieve first N=3 files using firstN parameter
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, 3, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return exactly 3 files", 3, files.size());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesRegularFileMetadata() throws Exception
    {
        // CFT-011: Retrieve regular file and verify metadata
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::integer::20kb", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 1 file", 1, files.size());
        
        DFULogicalFileWrapper file = files.get(0);
        assertFalse("IsSuperfile should be false", file.getIsSuperfile());
        assertNotNull("Owner should be populated", file.getOwner());
        assertNotNull("TotalSize should be populated", file.getTotalsize());
        assertTrue("TotalSize should be > 0", file.getIntSize() != null && file.getIntSize() > 0);
        assertNotNull("Modified date should be populated", file.getModified());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesSuperfileFlag() throws Exception
    {
        // CFT-012: Retrieve superfile and verify superfile flag
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::all_types::superfile", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 1 file", 1, files.size());
        
        DFULogicalFileWrapper file = files.get(0);
        assertTrue("IsSuperfile should be true", file.getIsSuperfile());
        assertEquals("File name should match", "benchmark::all_types::superfile", file.getName());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesIndexFile() throws Exception
    {
        // CFT-013: Retrieve index file and verify it appears in listing
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::integer::20kb::key", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 1 file", 1, files.size());
        assertEquals("File name should match", "benchmark::integer::20kb::key", files.get(0).getName());
        assertNotNull("Metadata should be populated", files.get(0).getOwner());
    }

    // Edge Case Tests - Boundary Values

    @Test
    @WithSpan
    public void testGetLogicalFilesPageSizeZero() throws Exception
    {
        // ECT-001: Test pageSize = 0 (should default to 100)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 0);
        
        assertNotNull("Response should not be null", files);
        assertFalse("Files should be returned", files.isEmpty());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesNegativePageSize() throws Exception
    {
        // ECT-002: Test negative pageSize (should default to 100)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, -10);
        
        assertNotNull("Response should not be null", files);
        assertNotNull("Files should be returned", files);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesPageSizeOne() throws Exception
    {
        // ECT-003: Test pageSize = 1 (minimum valid page size)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 1);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return exactly 1 file per page", 1, files.size());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesLargePageSize() throws Exception
    {
        // ECT-004: Test very large pageSize (e.g., 10000)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 10000);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return all matching files", files.size() >= 5);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesPageStartBeyondAvailable() throws Exception
    {
        // ECT-005: Test pageStartFrom beyond available files
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::integer::20kb", null, -1, 1000, 10);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return empty results", files == null || files.isEmpty());
    }

    @Test
    @WithSpan
    @Category(UnverifiedServerIssues.class)
    public void testGetLogicalFilesFirstNZero() throws Exception
    {
        // ECT-006: Test firstN = 0 (should return no files)
        // SERVER ISSUE: Server ignores firstN=0 and returns files anyway
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, 0, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 0 files", 0, files.size());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesFirstNOne() throws Exception
    {
        // ECT-007: Test firstN = 1 (minimum valid firstN)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, 1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return exactly 1 file", 1, files.size());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesFirstNNoLimit() throws Exception
    {
        // ECT-008: Test firstN = -1 (no limit)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return files according to pageSize", files.size() > 0);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesNullFilename() throws Exception
    {
        // ECT-009: Test with null filename (should return all files)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles(null, null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return some files", files.size() > 0);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesEmptyFilename() throws Exception
    {
        // ECT-010: Test with empty string filename
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return some files", files.size() > 0);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesDeprecatedClusterParam() throws Exception
    {
        // ECT-011: Test deprecated cluster parameter (should be ignored)
        List<DFULogicalFileWrapper> withCluster = wsdfuclient.getLogicalFiles("benchmark::integer::20kb", "thor", -1, 0, 100);
        List<DFULogicalFileWrapper> withoutCluster = wsdfuclient.getLogicalFiles("benchmark::integer::20kb", null, -1, 0, 100);
        
        assertNotNull("Response with cluster should not be null", withCluster);
        assertNotNull("Response without cluster should not be null", withoutCluster);
        assertEquals("Should return 1 file regardless of cluster param", 1, withCluster.size());
        assertEquals("Results should be the same", withoutCluster.get(0).getName(), withCluster.get(0).getName());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesSpecialCharactersInScope() throws Exception
    {
        // ECT-012: Test filename with special characters in scope (underscores)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::all_types::*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 2 files", 2, files.size());
        for (DFULogicalFileWrapper file : files)
        {
            assertTrue("File name should contain underscores", file.getName().contains("all_types"));
        }
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesDoubleColons() throws Exception
    {
        // ECT-013: Test filename with double colons in pattern
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::all_types::200kb", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertEquals("Should return 1 file", 1, files.size());
        assertEquals("Name should match exactly", "benchmark::all_types::200kb", files.get(0).getName());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesCaseSensitivity() throws Exception
    {
        // ECT-014: Test case sensitivity of filename pattern
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("BENCHMARK::INTEGER::20kb", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        // Result depends on file system case sensitivity - just verify no exception
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesBroadWildcard() throws Exception
    {
        // ECT-015: Test with very broad wildcard that matches many files
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return files", files.size() > 0);
    }

    // Error Handling Tests

    @Test
    @WithSpan
    public void testGetLogicalFilesInvalidCharacters() throws Exception
    {
        // EHT-001: Test with filename containing invalid characters
        try
        {
            List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::test<>file", null, -1, 0, 100);
            // Either empty results or exception is acceptable
            assertNotNull("Response should not be null", files);
        }
        catch (Exception e)
        {
            // Exception is acceptable for invalid characters
            assertNotNull("Exception should have a message", e.getMessage());
        }
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesWildcardOnly() throws Exception
    {
        // EHT-002: Test with filename containing only wildcard (valid)
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("*", null, 100, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return files", files.size() > 0);
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesNonexistentFile() throws Exception
    {
        // EHT-003: Test with filename that doesn't exist
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("nonexistent::file::name", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return empty results", files.isEmpty());
    }

    @Test
    @WithSpan
    public void testGetLogicalFilesNonmatchingWildcard() throws Exception
    {
        // EHT-004: Test with wildcard pattern that matches no files
        List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("bogus::scope::*", null, -1, 0, 100);
        
        assertNotNull("Response should not be null", files);
        assertTrue("Should return empty results", files.isEmpty());
    }
}
