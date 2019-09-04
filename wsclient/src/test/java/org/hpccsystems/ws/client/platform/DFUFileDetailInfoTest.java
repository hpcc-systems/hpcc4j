/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.ws.client.platform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.hpccsystems.ws.client.platform.test.data.ECLRecords;
import org.hpccsystems.ws.client.wrappers.EclRecordWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFURecordDefWrapper;
import org.junit.Test;

public class DFUFileDetailInfoTest
{
    public static DFUDataColumnWrapper getColumnByName(final DFURecordDefWrapper parent, final String name)
    {
        for (final DFUDataColumnWrapper child: parent.getChildColumns())
        {
            if (child.getColumnLabel().equals(name))
            {
                return child;
            }
        }
        return null;
    }

    // Single line style tests
    @Test
    public void testGetRecordEcl() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.WITH_ANNOTATION);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1, column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("METATYPE", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("SSN", annotation.getParameters().get(0));
    }

    // Single line style tests
    @Test
    public void testFullRecordEcl() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.FULL_RECORD);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("LARGE", annotation.getName());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1, column.getAnnotations().size());
        annotation = column.getAnnotations().get(0);
        assertEquals("METATYPE", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("SSN", annotation.getParameters().get(0));
        
        column = getColumnByName(recordDefInfo, "ZIP");
        assertEquals(3, column.getAnnotations().size());
        annotation = column.getAnnotations().get(0);
        assertEquals("METATYPE", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("ZIP", annotation.getParameters().get(0));
        annotation = column.getAnnotations().get(1);
        assertEquals("FEW", annotation.getName());
        assertEquals(0, annotation.getParameters().size());
        annotation = column.getAnnotations().get(2);
        assertEquals("MULTIPARAMS", annotation.getName());
        assertEquals(2, annotation.getParameters().size());
        assertEquals("PARAM1", annotation.getParameters().get(0));
        assertEquals("PARAM2", annotation.getParameters().get(1));
    }

    // Single line style tests
    @Test
    public void testGetRecordEclNoParams() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.WITH_ANNOTATION_NO_PARAMS);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1, column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FEW", annotation.getName());
        assertEquals(0, annotation.getParameters().size());
    }
    
    @Test
    public void testGetRecordEclAnnotationAndComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.WITH_ANNOTATION_AND_COMMENT);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1,column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }

    @Test
    public void testGetRecordEclMultiParams() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.WITH_ANNOTATION_MULTI_PARAMS);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1, column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(3, annotation.getParameters().size());
        assertEquals("BAR1", annotation.getParameters().get(0));
        assertEquals("BAR2", annotation.getParameters().get(1));
        assertEquals("BAR3", annotation.getParameters().get(2));
    }

    @Test
    public void testGetRecordEclWithComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.WITH_COMMENT);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }


    @Test
    public void testInlineWithMaxlength() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.INLINE_WITH_MAXLENGTH);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "sic4_code");
        assertNotNull(column);
    }

    @Test
    public void testGetRecordEclWithAnnotationLikeComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.WITH_ANNOTATION_LIKE_COMMENT);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }
    
    // ML tests
    @Test
    public void testGetRecordMlEcl() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.ML_WITH_ANNOTATION);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "FOO");

        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("BAR", annotation.getParameters().get(0));
    }
    
    @Test
    public void testGetRecordMlEclAnnotationAndComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.ML_WITH_ANNOTATION_AND_COMMENT);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0,recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }

    @Test
    public void testGetRecordMlEclMultiParams() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.ML_WITH_ANNOTATION_MULTI_PARAMS);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed get multi-annotated recordset:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");

        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(3, annotation.getParameters().size());
        assertEquals("BAR1", annotation.getParameters().get(0));
        assertEquals("BAR2", annotation.getParameters().get(1));
        assertEquals("BAR3", annotation.getParameters().get(2));
    }

    @Test
    public void testGetRecordMlEclWithComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.ML_WITH_COMMENT);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed get ml with comment test:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }

    @Test
    public void testGetRecordMlEclWithAnnotationLikeComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.ML_WITH_ANNOTATION_LIKE_COMMENT);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed get record with annotation comment:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }
    
    @Test
    public void testGetRecordMlEclInlineComment() throws Exception
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.ML_INLINE);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed get ml inline test:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");

        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO",annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }
    
    
    @Test
    public void testGetRecordMaxlength() throws Exception 
    {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ECLRecords.MAXLENGTH);
        if (info.getParseErrors().size()!=0)
        {
            fail("Failed get maxlength test:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "maxlength");
        assertNotNull(column);
    }
    
    @Test
    public void testEclParsing() throws Exception
    {
        Map<String,String> layouts=new LinkedHashMap<String,String>();
        layouts.put("inline record with dataset child", ECLRecords.INLINE_WITH_DATASET_CHILD);
        layouts.put("record layout def starting with __", ECLRecords.RECORD_LAYOUT_DEF_STARTING_WITH__);
        layouts.put("record with {blob} in field definition", ECLRecords.RECORD_WITH_BLOB_IN_FIELD_DEF);
        layouts.put("inline record def with maxlength", ECLRecords.INLINE_WITH_MAXLENGTH);
        boolean passed=true;
        for (Entry<String,String> item:layouts.entrySet())
        {
            EclRecordWrapper rec=DFUFileDetailWrapper.getRecordFromECL(item.getValue());
            if (rec.getParseErrors().size()!=0)
            {                
                System.out.println(item.getKey() + " FAILED:" + StringUtils.join(rec.getParseErrors(),"\n"));
                passed=false;
            }
            else
            {
                System.out.println(item.getKey() + " parsed correctly");
            }
        }
        if (!passed)
        {
            fail("not all record structures passed");
        }
    }
}