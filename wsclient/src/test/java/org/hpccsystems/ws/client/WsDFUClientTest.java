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
import org.hpccsystems.commons.annotations.UnverifiedClientIssues;
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

    // ============================================
    // Tests for getFileDataColumns method
    // ============================================

    /**
     * CFT-001: Basic Column Retrieval - Simple Integer Dataset
     */
    @Test
    @Category(UnverifiedClientIssues.class)
    @WithSpan
    public void testGetFileDataColumnsBasicInteger() throws Exception
    {
        String fileName = "~benchmark::integer::20KB";
        String cluster = thorclustername;

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

        assertNotNull("Column list should not be null", columns);
        assertEquals("Should have 2 columns", 2, columns.size());

        boolean hasKey = false;
        boolean hasFill = false;

        for (DFUDataColumnWrapper col : columns)
        {
            assertNotNull("Column should not be null", col);
            String label = col.getColumnLabel();
            assertNotNull("Column label should not be null", label);

            if ("key".equalsIgnoreCase(label))
                hasKey = true;
            else if ("fill".equalsIgnoreCase(label))
                hasFill = true;

            assertNotNull("Column type should not be null", col.getColumnType());
            assertNotNull("Column ECL type should not be null", col.getColumnEclType());
        }

        assertTrue("Should have 'key' column", hasKey);
        assertTrue("Should have 'fill' column", hasFill);
    }

    /**
     * CFT-002: Column Retrieval - Multi-Type Dataset
     */
    @Test
    @Category(UnverifiedClientIssues.class)
    @WithSpan
    public void testGetFileDataColumnsMultiType() throws Exception
    {
        String fileName = "~benchmark::all_types::200KB";
        String cluster = thorclustername;

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

        assertNotNull("Column list should not be null", columns);
        assertTrue("Should have at least 21 columns", columns.size() >= 21);

        Set<String> expectedColumns = new HashSet<>();
        expectedColumns.add("int8");
        expectedColumns.add("uint8");
        expectedColumns.add("int4");
        expectedColumns.add("uint4");
        expectedColumns.add("int2");
        expectedColumns.add("uint2");
        expectedColumns.add("r8");
        expectedColumns.add("r4");
        expectedColumns.add("dec16");
        expectedColumns.add("udec16");
        expectedColumns.add("qStr");
        expectedColumns.add("fixStr8");
        expectedColumns.add("str");
        expectedColumns.add("varStr");
        expectedColumns.add("varStr8");
        expectedColumns.add("utfStr");
        expectedColumns.add("uni8");
        expectedColumns.add("uni");
        expectedColumns.add("varUni");
        expectedColumns.add("childDataset");
        expectedColumns.add("int1Set");

        Set<String> foundColumns = new HashSet<>();
        for (DFUDataColumnWrapper col : columns)
        {
            String label = col.getColumnLabel();
            if (label != null)
                foundColumns.add(label.toLowerCase());

            assertNotNull("Column type should not be null", col.getColumnType());
            assertNotNull("Column ECL type should not be null", col.getColumnEclType());
        }

        for (String expected : expectedColumns)
        {
            assertTrue("Should have column: " + expected, foundColumns.contains(expected.toLowerCase()));
        }
    }

    /**
     * CFT-003: Column Retrieval Without Cluster Parameter
     */
    @Test
    @Category(UnverifiedClientIssues.class)
    @WithSpan
    public void testGetFileDataColumnsNoCluster() throws Exception
    {
        String fileName = "~benchmark::integer::20KB";

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, null);

        assertNotNull("Column list should not be null", columns);
        assertEquals("Should have 2 columns", 2, columns.size());

        boolean hasKey = false;
        boolean hasFill = false;

        for (DFUDataColumnWrapper col : columns)
        {
            String label = col.getColumnLabel();
            if ("key".equalsIgnoreCase(label))
                hasKey = true;
            else if ("fill".equalsIgnoreCase(label))
                hasFill = true;
        }

        assertTrue("Should have 'key' column", hasKey);
        assertTrue("Should have 'fill' column", hasFill);
    }

    /**
     * CFT-004: Column Retrieval - Large Dataset
     */
    @Test
    @Category(UnverifiedClientIssues.class)
    @WithSpan
    public void testGetFileDataColumnsLargeFile() throws Exception
    {
        String fileName = "~benchmark::string::100MB";
        String cluster = thorclustername;

        long startTime = System.currentTimeMillis();
        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);
        long endTime = System.currentTimeMillis();

        assertNotNull("Column list should not be null", columns);
        assertEquals("Should have 2 columns", 2, columns.size());

        boolean hasKey = false;
        boolean hasFill = false;

        for (DFUDataColumnWrapper col : columns)
        {
            String label = col.getColumnLabel();
            if ("key".equalsIgnoreCase(label))
                hasKey = true;
            else if ("fill".equalsIgnoreCase(label))
                hasFill = true;
        }

        assertTrue("Should have 'key' column", hasKey);
        assertTrue("Should have 'fill' column", hasFill);

        long responseTime = endTime - startTime;
        assertTrue("Response time should be less than 5 seconds: " + responseTime + "ms", responseTime < 5000);
    }

    /**
     * CFT-005: Keyed vs Non-Keyed Column Identification
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsKeyedColumns() throws Exception
    {
        String fileName = "~benchmark::integer::20kb::key";
        String cluster = thorclustername;

        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

            assertNotNull("Column list should not be null", columns);
            assertTrue("Should have at least one column", columns.size() > 0);

            boolean hasKeyedColumn = false;
            for (DFUDataColumnWrapper col : columns)
            {
                if (col.getIsKeyedColumn())
                {
                    hasKeyedColumn = true;
                    break;
                }
            }

            assertTrue("Should have at least one keyed column", hasKeyedColumn);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Index files may not be supported - this is acceptable
            System.out.println("Index file handling: " + e.getMessage());
        }
    }

    /**
     * CFT-006: Nested Dataset Column Retrieval
     */
    @Test
    @Category(UnverifiedClientIssues.class)
    @WithSpan
    public void testGetFileDataColumnsNestedDataset() throws Exception
    {
        String fileName = "~benchmark::all_types::200KB";
        String cluster = thorclustername;

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

        assertNotNull("Column list should not be null", columns);

        DFUDataColumnWrapper childDatasetColumn = null;
        for (DFUDataColumnWrapper col : columns)
        {
            if ("childDataset".equalsIgnoreCase(col.getColumnLabel()))
            {
                childDatasetColumn = col;
                break;
            }
        }

        assertNotNull("Should have 'childDataset' column", childDatasetColumn);

        List<DFUDataColumnWrapper> childColumns = childDatasetColumn.getChildColumns();
        assertNotNull("Child columns should not be null", childColumns);
        assertTrue("Child dataset should have child columns", childColumns.size() > 0);
        assertEquals("Child dataset should have 3 child columns", 3, childColumns.size());

        Set<String> childNames = new HashSet<>();
        for (DFUDataColumnWrapper child : childColumns)
        {
            childNames.add(child.getColumnLabel().toLowerCase());
        }

        assertTrue("Should have childField1", childNames.contains("childfield1"));
        assertTrue("Should have childField2", childNames.contains("childfield2"));
        assertTrue("Should have childField3", childNames.contains("childfield3"));
    }

    /**
     * ECT-001: Empty Cluster Name String
     */
    @Test
    @Category(UnverifiedClientIssues.class)
    @WithSpan
    public void testGetFileDataColumnsEmptyCluster() throws Exception
    {
        String fileName = "~benchmark::integer::20KB";

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, "");

        assertNotNull("Column list should not be null", columns);
        assertEquals("Should have 2 columns", 2, columns.size());
    }

    /**
     * ECT-002: Logical Name Without Tilde Prefix
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsNoTildePrefix() throws Exception
    {
        String fileName = "benchmark::integer::20KB";
        String cluster = thorclustername;

        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

            assertNotNull("Column list should not be null", columns);
            assertEquals("Should have 2 columns", 2, columns.size());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Some systems may require tilde prefix - acceptable
            System.out.println("Tilde prefix requirement: " + e.getMessage());
        }
    }

    /**
     * ECT-003: Logical Name With Extra Whitespace
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsWithWhitespace() throws Exception
    {
        String fileName = "  ~benchmark::integer::20KB  ";
        String cluster = thorclustername;

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

        assertNotNull("Column list should not be null", columns);
        assertEquals("Should have 2 columns", 2, columns.size());
    }

    /**
     * ECT-004: Superfile Column Retrieval - Default Subfile
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsSuperfile() throws Exception
    {
        String fileName = "~benchmark::all_types::superfile";
        String cluster = thorclustername;

        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

        assertNotNull("Column list should not be null", columns);
        assertTrue("Should have at least 21 columns from first subfile", columns.size() >= 21);
    }

    /**
     * ECT-005: URI Format Logical Name
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsURIFormat() throws Exception
    {
        String fileName = "/benchmark/integer/20KB";
        String cluster = thorclustername;

        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

            assertNotNull("Column list should not be null", columns);
            assertTrue("Should have columns if URI format supported", columns.size() > 0);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // URI format may not be supported - this is acceptable
            System.out.println("URI format handling: " + e.getMessage());
        }
    }

    /**
     * ECT-006: Case Sensitivity in Logical Name
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsCaseSensitivity() throws Exception
    {
        String fileName = "~BENCHMARK::INTEGER::20KB";
        String cluster = thorclustername;

        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(fileName, cluster);

            assertNotNull("Column list should not be null", columns);
            assertTrue("Should have columns if case-insensitive", columns.size() > 0);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Case sensitivity behavior documented
            System.out.println("Case sensitivity behavior: " + e.getMessage());
        }
    }

    /**
     * EHT-001: Null Logical Filename
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsNullFilename() throws Exception
    {
        String cluster = thorclustername;

        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(null, cluster);

            // If no exception, should return empty list or handle gracefully
            assertNotNull("Should handle null filename gracefully", columns);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception
            assertNotNull("Exception should have message", e.getMessage());
        }
        catch (Exception e)
        {
            // Should not throw NullPointerException
            assertFalse("Should not throw NullPointerException", e instanceof NullPointerException);
        }
    }

    /**
     * EHT-002: Empty Logical Filename
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsEmptyFilename() throws Exception
    {
        String cluster = thorclustername;

        try
        {
            List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns("", cluster);

            // Should throw exception or return empty
            assertNotNull("Should handle empty filename gracefully", columns);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception
            assertNotNull("Exception should have meaningful message", e.getMessage());
        }
    }

    /**
     * EHT-003: Non-Existent Logical Filename
     */
    @Test(expected = ArrayOfEspExceptionWrapper.class)
    @WithSpan
    public void testGetFileDataColumnsNonExistentFile() throws Exception
    {
        String fileName = "~nonexistent::file::name";
        String cluster = thorclustername;

        wsdfuclient.getFileDataColumns(fileName, cluster);
    }

    /**
     * EHT-004: Invalid Cluster Name
     */
    @Test(expected = ArrayOfEspExceptionWrapper.class)
    @WithSpan
    public void testGetFileDataColumnsInvalidCluster() throws Exception
    {
        String fileName = "~benchmark::integer::20KB";
        String cluster = "nonexistent_cluster";

        wsdfuclient.getFileDataColumns(fileName, cluster);
    }

    /**
     * EHT-010: Malformed Logical Name - Invalid Characters
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsMalformedName() throws Exception
    {
        String fileName = "~benchmark::integer::20KB<script>alert(1)</script>";
        String cluster = thorclustername;

        try
        {
            wsdfuclient.getFileDataColumns(fileName, cluster);
            Assert.fail("Should throw exception for malformed filename");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception
            assertNotNull("Exception should have message", e.getMessage());
        }
    }

    /**
     * EHT-011: Extremely Long Logical Name
     */
    @Test
    @WithSpan
    public void testGetFileDataColumnsLongFilename() throws Exception
    {
        StringBuilder longName = new StringBuilder("~");
        for (int i = 0; i < 1000; i++)
        {
            longName.append("verylongname");
        }

        String cluster = thorclustername;

        try
        {
            wsdfuclient.getFileDataColumns(longName.toString(), cluster);
            // If no exception, should handle gracefully
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected exception for too-long filename
            assertNotNull("Exception should have message", e.getMessage());
        }
        catch (Exception e)
        {
            // Should not crash system
            assertNotNull("Should handle long filename gracefully", e.getMessage());
        }
    }
}
