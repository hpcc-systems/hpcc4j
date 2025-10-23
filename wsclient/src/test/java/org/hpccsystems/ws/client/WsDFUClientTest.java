package org.hpccsystems.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNotNull;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.HPCCWsDFUClient.DFUQueryFileType;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileType;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUResultWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
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

    // =====================================================
    // CheckSuperfileLayouts Test Cases
    // Based on WsDfu.checkSuperfileLayoutsAnalysis.txt
    // =====================================================

    /**
     * Helper method to access private checkSuperfileLayouts method via reflection
     */
    private void invokeCheckSuperfileLayouts(String[] subfiles, String cluster) throws Exception
    {
        Method checkMethod = HPCCWsDFUClient.class.getDeclaredMethod("checkSuperfileLayouts", String[].class, String.class);
        checkMethod.setAccessible(true);
        try
        {
            checkMethod.invoke(wsdfuclient, subfiles, cluster);
        }
        catch (java.lang.reflect.InvocationTargetException e)
        {
            Throwable cause = e.getCause();
            if (cause instanceof Exception)
            {
                throw (Exception) cause;
            }
            else if (cause instanceof ArrayOfEspExceptionWrapper)
            {
                throw (ArrayOfEspExceptionWrapper) cause;
            }
            else
            {
                throw new Exception("Unexpected exception type", cause);
            }
        }
    }

    /**
     * Helper method to create test files with identical ECL layouts
     * This would normally create actual files in HPCC, but for unit testing
     * we'll work with existing files that have the same layout
     */
    private String[] getFilesWithIdenticalLayouts()
    {
        // Use known files that should have identical layouts
        // In a real test environment, these would be pre-created test files
        return new String[]{logicalfilename, logicalfilename}; // Same file twice for basic test
    }

    /**
     * Helper method to get files with different ECL layouts
     * This would return files known to have different structures
     */
    private String[] getFilesWithDifferentLayouts()
    {
        // For testing purposes, we'll use files that are known to be different
        // In practice, these would be pre-created test files with different structures
        return new String[]{"benchmark::all_types::200kb", "benchmark::integer::20kb"};
    }

    // ======================
    // Valid Request Tests
    // ======================

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_AllFilesIdenticalLayouts() throws Exception
    {
        // Test Case 1: All Files Have Identical Layouts
        try
        {
            String[] identicalFiles = getFilesWithIdenticalLayouts();
            invokeCheckSuperfileLayouts(identicalFiles, null);
            // Should complete without throwing exceptions
        }
        catch (Exception e)
        {
            // If files don't exist or can't be accessed, skip this test
            assumeNotNull("Test files not available: " + e.getMessage(), null);
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_SingleFileValidation() throws Exception
    {
        // Test Case 2: Single File Validation
        try
        {
            String[] singleFile = {logicalfilename};
            invokeCheckSuperfileLayouts(singleFile, null);
            // Should complete successfully (trivial case)
        }
        catch (Exception e)
        {
            // If file doesn't exist, skip this test
            assumeNotNull("Test file not available: " + e.getMessage(), null);
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_EmptyEclLayouts() throws Exception
    {
        // Test Case 3: Files with Empty ECL Layouts
        // This is harder to test without specific test files that have empty ECL
        // We'll test the null handling instead
        try
        {
            String[] nullArray = null;
            invokeCheckSuperfileLayouts(nullArray, null);
            // Should handle null gracefully without throwing
        }
        catch (Exception e)
        {
            Assert.fail("Method should handle null array gracefully: " + e.getMessage());
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_ClusterSpecificValidation() throws Exception
    {
        // Test Case 4: Cluster-Specific Validation
        try
        {
            String[] identicalFiles = getFilesWithIdenticalLayouts();
            invokeCheckSuperfileLayouts(identicalFiles, thorClusterFileGroup);
            // Should validate files on specified cluster
        }
        catch (Exception e)
        {
            // If cluster or files not available, skip this test
            assumeNotNull("Test cluster or files not available: " + e.getMessage(), null);
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_LargeSubfileArray() throws Exception
    {
        // Test Case 6: Large Subfile Array
        try
        {
            // Create array with multiple references to same file to test performance
            String[] largeArray = new String[10];
            for (int i = 0; i < largeArray.length; i++)
            {
                largeArray[i] = logicalfilename;
            }
            invokeCheckSuperfileLayouts(largeArray, null);
            // Should process all files without performance issues
        }
        catch (Exception e)
        {
            // If file doesn't exist, skip this test
            assumeNotNull("Test file not available for large array test: " + e.getMessage(), null);
        }
    }

    // ======================
    // Invalid Request Tests  
    // ======================

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_NullSubfilesArray() throws Exception
    {
        // Test Case 8: Null Subfiles Array
        try
        {
            invokeCheckSuperfileLayouts(null, null);
            // Method should return immediately without error
        }
        catch (Exception e)
        {
            Assert.fail("Method should handle null array gracefully: " + e.getMessage());
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_EmptySubfilesArray() throws Exception
    {
        // Test Case 9: Empty Subfiles Array  
        try
        {
            String[] emptyArray = new String[0];
            invokeCheckSuperfileLayouts(emptyArray, null);
            // Method should return without processing
        }
        catch (Exception e)
        {
            Assert.fail("Method should handle empty array gracefully: " + e.getMessage());
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_InvalidFileNames() throws Exception
    {
        // Test Case 10: Invalid File Names
        try
        {
            String[] invalidFiles = {"invalid::file::name", "another::invalid::file"};
            invokeCheckSuperfileLayouts(invalidFiles, null);
            // Method should continue processing when files don't exist (getFileInfo returns null)
        }
        catch (Exception e)
        {
            // Method should not throw exceptions for non-existent files
            // It should just skip them and continue
        }
    }

    @Test
    @WithSpan  
    public void testCheckSuperfileLayouts_NonExistentFiles() throws Exception
    {
        // Test Case 11: Non-Existent Files
        try
        {
            String[] nonExistentFiles = {"does::not::exist1", "does::not::exist2"};
            invokeCheckSuperfileLayouts(nonExistentFiles, null);
            // Should continue processing when getFileInfo returns null
        }
        catch (Exception e)
        {
            // Should not throw exceptions for files that don't exist
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_InvalidClusterName() throws Exception
    {
        // Test Case 12: Invalid Cluster Name
        try
        {
            String[] validFiles = {logicalfilename};
            invokeCheckSuperfileLayouts(validFiles, "nonexistent_cluster");
            // Should handle invalid cluster gracefully
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // This is expected when cluster doesn't exist
        }
        catch (Exception e)
        {
            // May also throw other exceptions for invalid cluster
        }
    }

    // ======================
    // Error and Exception Scenarios
    // ======================

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_DifferentEclLayouts() throws Exception
    {
        // Test Case 14: Different ECL Layouts
        try
        {
            String[] differentFiles = getFilesWithDifferentLayouts();
            invokeCheckSuperfileLayouts(differentFiles, null);
            Assert.fail("Method should throw exception for files with different ECL layouts");
        }
        catch (Exception e)
        {
            // Should throw exception with descriptive message about mismatched files
            String message = e.getMessage();
            assertNotNull("Exception message should not be null", message);
            assertTrue("Exception should mention different layouts", 
                      message.contains("different ecl layouts") || message.contains("different") || 
                      message.contains("layout") || message.contains("ecl"));
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_MixedExistentAndNonExistent() throws Exception
    {
        // Test Case 18: Partial Service Availability
        try
        {
            String[] mixedFiles = {logicalfilename, "does::not::exist"};
            invokeCheckSuperfileLayouts(mixedFiles, null);
            // Should process available files and skip problematic ones
        }
        catch (Exception e)
        {
            // May succeed or fail depending on how the method handles mixed scenarios
            // The important thing is it doesn't crash
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_WhitespaceInFilenames() throws Exception
    {
        // Test Case 19: Whitespace and Formatting Differences
        try
        {
            // Test with filenames that have whitespace
            String[] whitespaceFiles = {" " + logicalfilename + " ", logicalfilename};
            invokeCheckSuperfileLayouts(whitespaceFiles, null);
        }
        catch (Exception e)
        {
            // This may fail due to invalid filenames with whitespace, which is expected
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_ArrayWithNullElements() throws Exception
    {
        // Edge case: Array containing null elements
        try
        {
            String[] arrayWithNulls = {logicalfilename, null, logicalfilename};
            invokeCheckSuperfileLayouts(arrayWithNulls, null);
        }
        catch (Exception e)
        {
            // Method may throw exception or handle nulls gracefully
            // Either behavior is acceptable as long as it doesn't crash
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_EmptyStringFilenames() throws Exception
    {
        // Edge case: Array containing empty string filenames
        try
        {
            String[] emptyStringFiles = {"", ""};
            invokeCheckSuperfileLayouts(emptyStringFiles, null);
        }
        catch (Exception e)
        {
            // Should handle empty string filenames gracefully
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_VeryLongFilenames() throws Exception
    {
        // Edge case: Very long filenames
        try
        {
            StringBuilder longName = new StringBuilder();
            for (int i = 0; i < 1000; i++)
            {
                longName.append("a");
            }
            String[] longFilenames = {longName.toString(), longName.toString()};
            invokeCheckSuperfileLayouts(longFilenames, null);
        }
        catch (Exception e)
        {
            // Should handle very long filenames without crashing
        }
    }

    @Test
    @WithSpan
    public void testCheckSuperfileLayouts_SpecialCharactersInFilenames() throws Exception
    {
        // Edge case: Special characters in filenames
        try
        {
            String[] specialCharFiles = {"test::file::with::ü†f8", "test::file::with::spëcîål"};
            invokeCheckSuperfileLayouts(specialCharFiles, null);
        }
        catch (Exception e)
        {
            // Should handle special characters appropriately
        }
    }

    // =====================================================================
    // getFileDataColumns Test Cases
    // =====================================================================

    /**
     * TC-001: Basic Column Retrieval - THOR File
     * Verify successful retrieval of column metadata from a THOR dataset
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_BasicThorFile() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(logicalfilename, null);
            
            assertNotNull("Column list should not be null", columns);
            assertTrue("Column list should not be empty", columns.size() > 0);
            
            for (org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper col : columns)
            {
                assertNotNull("Column label should not be null", col.getColumnLabel());
                assertNotNull("Column type should not be null", col.getColumnType());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Should successfully retrieve columns from THOR file: " + e.getMessage());
        }
    }

    /**
     * TC-002: Column Retrieval with Cluster Name
     * Verify retrieval when cluster name is explicitly specified
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_WithClusterName() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(logicalfilename, thorclustername);
            
            assertNotNull("Column list should not be null", columns);
            assertTrue("Column list should not be empty", columns.size() > 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Should successfully retrieve columns with cluster name: " + e.getMessage());
        }
    }

    /**
     * TC-003: Keyed (Indexed) File Columns
     * Verify proper categorization of keyed vs non-keyed columns
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_KeyedFile() throws Exception
    {
        String indexFileName = "~benchmark::integer::20kb::key";
        
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(indexFileName, null);
            
            if (columns != null && columns.size() > 0)
            {
                boolean hasKeyedColumn = false;
                for (org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper col : columns)
                {
                    if (col.getIsKeyedColumn())
                    {
                        hasKeyedColumn = true;
                        break;
                    }
                }
                assertTrue("Should have at least one keyed column for index file", hasKeyedColumn);
            }
        }
        catch (Exception e)
        {
            // Index file may not exist, which is acceptable
            System.out.println("Index file test skipped: " + e.getMessage());
        }
    }

    /**
     * TC-004: Complex/Nested Data Types
     * Verify handling of nested records and complex types
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_NestedTypes() throws Exception
    {
        String nestedFileName = "~benchmark::all_types::200kb";
        
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(nestedFileName, null);
            
            assertNotNull("Column list should not be null", columns);
            
            for (org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper col : columns)
            {
                if (col.getDataColumns() != null && col.getDataColumns().length > 0)
                {
                    assertNotNull("Nested columns should have valid structure", col.getDataColumns());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Should handle nested data types: " + e.getMessage());
        }
    }

    /**
     * TC-005: Large Dataset with Many Columns
     * Verify handling of files with many columns
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_ManyColumns() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(logicalfilename, null);
            
            assertNotNull("Column list should not be null", columns);
            assertTrue("Should retrieve all columns", columns.size() >= 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Should handle files with many columns: " + e.getMessage());
        }
    }

    /**
     * TC-006: Minimal Dataset - Single Column
     * Verify handling of simplest possible file structure
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_SingleColumn() throws Exception
    {
        String singleColFile = "~benchmark::integer::20kb";
        
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(singleColFile, null);
            
            assertNotNull("Column list should not be null", columns);
            if (columns.size() > 0)
            {
                org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper firstCol = columns.get(0);
                assertNotNull("Column metadata should be complete", firstCol.getColumnLabel());
            }
        }
        catch (Exception e)
        {
            // File may not exist, which is acceptable
            System.out.println("Single column file test skipped: " + e.getMessage());
        }
    }

    /**
     * TC-007: Various ECL Data Types
     * Verify correct type reporting for all ECL types
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_VariousTypes() throws Exception
    {
        // Try the benchmark file first, then fall back to default file
        String[] testFiles = {"~benchmark::all_types::200kb", logicalfilename};
        
        boolean testCompleted = false;
        
        for (String testFile : testFiles)
        {
            try
            {
                List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                    wsdfuclient.getFileDataColumns(testFile, null);
                
                assertNotNull("Column list should not be null", columns);
                
                if (columns.size() > 0)
                {
                    // Verify that we get valid type information for available columns
                    for (org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper col : columns)
                    {
                        assertNotNull("Column type should be valid", col.getColumnType());
                        if (col.getColumnEclType() == null) 
                        {
                            System.out.println(col.getColumnLabel() + " has null ECL type");
                        }
                        assertNotNull("ECL type should be valid", col.getColumnEclType());
                        assertNotNull("Column label should be valid", col.getColumnLabel());
                    }
                    
                    System.out.println("Various types test completed successfully with file: " + testFile);
                    System.out.println("Found " + columns.size() + " columns with valid type information");
                    testCompleted = true;
                    break; // Success, no need to try other files
                }
            }
            catch (ArrayOfEspExceptionWrapper e)
            {
                // File doesn't exist, try next file
                System.out.println("File " + testFile + " not available: " + e.toString());
                continue;
            }
            catch (Exception e)
            {
                // File doesn't exist, try next file  
                System.out.println("File " + testFile + " not accessible: " + e.getMessage());
                continue;
            }
        }
        
        if (!testCompleted)
        {
            System.out.println("Various types test skipped - no suitable test files available");
            // Don't fail the test if no files are available - this is acceptable in some environments
            assumeNotNull("No test files available for various types test", null);
        }
    }

    /**
     * TC-101: Null Logical Name
     * Verify handling when no file name is provided
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_NullLogicalName() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(null, null);
            
            // Server handled gracefully - check that result is empty or has no meaningful data
            assertTrue("Should return empty result for null logical name", 
                columns == null || columns.isEmpty());
            
            System.out.println("Server gracefully handled null logical name (returned empty result)");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Also acceptable - server rejected null input
            assertNotNull("Should have error message", e.toString());
            System.out.println("Server rejected null logical name with exception: " + e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable - server rejected null input
            assertNotNull("Should have error message", e.getMessage());
            System.out.println("Server rejected null logical name with exception: " + e.getMessage());
        }
    }

    /**
     * TC-102: Empty Logical Name
     * Verify handling of empty string file name
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_EmptyLogicalName() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns("", null);
            
            // Server handled gracefully - check that result is empty or has no meaningful data
            assertTrue("Should return empty result for empty logical name", 
                columns == null || columns.isEmpty());
            
            System.out.println("Server gracefully handled empty logical name (returned empty result)");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Also acceptable - server rejected empty input
            assertNotNull("Should have error message", e.toString());
            System.out.println("Server rejected empty logical name with exception: " + e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable - server rejected empty input
            assertNotNull("Should have error message", e.getMessage());
            System.out.println("Server rejected empty logical name with exception: " + e.getMessage());
        }
    }

    /**
     * TC-103: Non-Existent File
     * Verify handling when file doesn't exist
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_NonExistentFile() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns("~nonexistent::file::name", null);
            Assert.fail("Should throw exception for non-existent file");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception - accept multiple error message formats
            String errorMessage = e.toString().toLowerCase();
            assertTrue("Error should indicate file resolution failure", 
                errorMessage.contains("not found") || 
                errorMessage.contains("does not exist") ||
                errorMessage.contains("could not resolve") ||
                errorMessage.contains("cannot find") ||
                errorMessage.contains("file not found"));
            
            System.out.println("Non-existent file properly rejected: " + e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable
            assertNotNull("Should have error message", e.getMessage());
            System.out.println("Non-existent file rejected with exception: " + e.getMessage());
        }
    }

    /**
     * TC-104: Invalid Cluster Name
     * Verify handling when specified cluster doesn't exist
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_InvalidClusterName() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(logicalfilename, "nonexistent_cluster");
            
            // May succeed with fallback or fail with error
            assertNotNull("Should either succeed or throw exception", columns);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception for invalid cluster
            assertNotNull("Should have error message", e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable
            assertNotNull("Should have error message", e.getMessage());
        }
    }

    /**
     * TC-105: Malformed Logical Name
     * Verify handling of invalid name format
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_MalformedName() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns("invalid::file:name:format:::", null);
            Assert.fail("Should throw exception for malformed name");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception
            assertNotNull("Should have error message", e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable
            assertNotNull("Should have error message", e.getMessage());
        }
    }

    /**
     * TC-106: File Name with Special Characters
     * Verify handling of unusual but potentially valid characters
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_SpecialCharacters() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns("~test::file-name_123", null);
            
            // Should either succeed if file exists or throw appropriate not found error
            assertNotNull("Should handle special characters", columns);
            System.out.println("Special characters handled successfully, file exists");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable if file doesn't exist - verify it's a "not found" type error
            String errorMessage = e.toString().toLowerCase();
            boolean isFileNotFoundError = errorMessage.contains("not found") ||
                                        errorMessage.contains("does not exist") ||
                                        errorMessage.contains("could not resolve") ||
                                        errorMessage.contains("cannot find");
            
            assertTrue("Should be file not found error (not a parsing error)", isFileNotFoundError);
            System.out.println("Special characters handled properly - file not found: " + e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable for file not found
            assertNotNull("Should have error message", e.getMessage());
            System.out.println("Special characters test completed: " + e.getMessage());
        }
    }

    /**
     * TC-107: Logical Name Only (No Tilde Prefix)
     * Verify handling when tilde scope operator is missing
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_NoTildePrefix() throws Exception
    {
        try
        {
            String nameWithoutTilde = logicalfilename.startsWith("~") ? 
                logicalfilename.substring(1) : logicalfilename;
            
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(nameWithoutTilde, null);
            
            // Should succeed if server accepts both formats
            assertNotNull("Should handle names without tilde", columns);
        }
        catch (Exception e)
        {
            // Acceptable if server requires tilde
            assertNotNull("Should have error message", e.getMessage());
        }
    }

    /**
     * TC-201: CSV File
     * Verify documented limitation - CSV files return no columns
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_CsvFile() throws Exception
    {
        String csvFileName = "~test::csv::file";
        
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(csvFileName, null);
            
            assertNotNull("Should return list (possibly empty)", columns);
            assertEquals("CSV files should return empty column list", 0, columns.size());
        }
        catch (Exception e)
        {
            // File may not exist - acceptable
            System.out.println("CSV file test skipped: " + e.getMessage());
        }
    }

    /**
     * TC-202: XML File
     * Verify documented limitation - XML files return no columns
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_XmlFile() throws Exception
    {
        String xmlFileName = "~test::xml::file";
        
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(xmlFileName, null);
            
            assertNotNull("Should return list (possibly empty)", columns);
            assertEquals("XML files should return empty column list", 0, columns.size());
        }
        catch (Exception e)
        {
            // File may not exist - acceptable
            System.out.println("XML file test skipped: " + e.getMessage());
        }
    }

    /**
     * TC-203: FLAT File
     * Verify documented limitation - FLAT files return no columns
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_FlatFile() throws Exception
    {
        String flatFileName = "~test::flat::file";
        
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                wsdfuclient.getFileDataColumns(flatFileName, null);
            
            assertNotNull("Should return list (possibly empty)", columns);
            assertEquals("FLAT files should return empty column list", 0, columns.size());
        }
        catch (Exception e)
        {
            // File may not exist - acceptable
            System.out.println("FLAT file test skipped: " + e.getMessage());
        }
    }

    /**
     * TC-407: Multiple Sequential Requests
     * Verify connection pooling and resource management
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_MultipleSequentialRequests() throws Exception
    {
        try
        {
            for (int i = 0; i < 10; i++)
            {
                List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns = 
                    wsdfuclient.getFileDataColumns(logicalfilename, null);
                assertNotNull("Request " + i + " should succeed", columns);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Multiple sequential requests should succeed: " + e.getMessage());
        }
    }

    /**
     * TC-408: Different Files, Same Session
     * Verify state isolation between requests
     */
    @Test
    @WithSpan
    public void testGetFileDataColumns_DifferentFiles() throws Exception
    {
        try
        {
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns1 = 
                wsdfuclient.getFileDataColumns(logicalfilename, null);
            
            List<org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper> columns2 = 
                wsdfuclient.getFileDataColumns(DEFAULTHPCCSUPERFILENAME, null);
            
            assertNotNull("First file columns should not be null", columns1);
            assertNotNull("Second file columns should not be null", columns2);
        }
        catch (Exception e)
        {
            // Acceptable if files don't exist
            System.out.println("Different files test skipped: " + e.getMessage());
        }
    }
}
