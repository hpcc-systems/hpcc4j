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
package org.hpccsystems.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.hpccsystems.ws.client.platform.DFUDataColumnAnnotation;
import org.hpccsystems.ws.client.wrappers.EclRecordWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFURecordDefWrapper;
import org.junit.Test;

public class DFUFileDetailWrapperTest
{
    private final String WITH_ANNOTATION = "RECORD\nSTRING SSN; // @METATYPE(SSN)\nEND;";
    private final String MAXLENGTH = "RECORD\nSTRING SSN;\nINTEGER8 maxlength;\nEND;";
    private final String WITH_ANNOTATION_NO_PARAMS = "RECORD\nSTRING SSN; // @FEW\nEND;";
    private final String WITH_ANNOTATION_AND_COMMENT = "RECORD\nSTRING SSN; // @FOO(BAR) foo equals kittens, bar equals cats\nEND;";
    private final String WITH_ANNOTATION_MULTI_PARAMS = "RECORD\nSTRING SSN; // @FOO(BAR1, BAR2,BAR3)\nEND;";
    private final String WITH_COMMENT = "RECORD\nSTRING SSN; // This is just a regular comment.\nEND;";
    private final String WITH_ANNOTATION_LIKE_COMMENT = "RECORD\nSTRING SSN; // THIS(ISNT) an annotations.\nEND;";
    private final String ML_WITH_ANNOTATION = "RECORD\nSTRING FOO; /* @FOO(BAR) */\nEND;";
    private final String ML_WITH_ANNOTATION_AND_COMMENT = "RECORD\nSTRING SSN; /* @FOO(BAR) and kittens. */\nEND;";
    private final String ML_WITH_ANNOTATION_MULTI_PARAMS = "RECORD\nSTRING SSN; /* @FOO(BAR1, BAR2,BAR3) */\nEND;";
    private final String ML_WITH_COMMENT = "RECORD\nSTRING SSN; /* this is just a regular comment. */\nEND;";
    private final String ML_WITH_ANNOTATION_LIKE_COMMENT = "RECORD\nSTRING SSN; /* THIS(ISNT) an annotation. */\nEND;";
    private final String ML_INLINE = "RECORD\nSTRING SSN; /* @FOO(BAR) */\nEND;";
    private final String FULL_RECORD = "child := RECORD\n\t\tSTRING name;\nEND;\nRECORD // @LARGE\nSTRING FNAME;\nSTRING LNAME;\nSTRING MNAME;\nSTRING DOB;\nSTRING SSN; // @METATYPE(SSN)\nSTRING ADDR1;\nSTRING ADDR2;\nSTRING CITY;\nSTRING STATE;\nSTRING ZIP; // @METATYPE(ZIP), @FEW, @MULTIPARAMS(PARAM1,PARAM2)\nSTRING DLNUMBER;\nDATASET(child) KIDS;\nEND;";
    private final String INLINE_WITH_MAXLENGTH = "{ , MAXLENGTH(84) string4 sic4_code, string80 sic4_description };";

    public static DFUDataColumnWrapper getColumnByName(final DFUDataColumnWrapper parent, final String name)
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
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(WITH_ANNOTATION);
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
    public void testFullRecordEcl() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(FULL_RECORD);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordEclNoParams() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(WITH_ANNOTATION_NO_PARAMS);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordEclAnnotationAndComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(WITH_ANNOTATION_AND_COMMENT);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordEclMultiParams() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(WITH_ANNOTATION_MULTI_PARAMS);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordEclWithComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(WITH_COMMENT);
        if (info.getParseErrors().size()!=0) {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }


    @Test
    public void testInlineWithMaxlength() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(INLINE_WITH_MAXLENGTH);
        if (info.getParseErrors().size()!=0) {
            fail("Failed:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "sic4_code");
        assertNotNull(column);
    }

    @Test
    public void testGetRecordEclWithAnnotationLikeComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(WITH_ANNOTATION_LIKE_COMMENT);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordMlEcl() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ML_WITH_ANNOTATION);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordMlEclAnnotationAndComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ML_WITH_ANNOTATION_AND_COMMENT);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordMlEclMultiParams() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ML_WITH_ANNOTATION_MULTI_PARAMS);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordMlEclWithComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ML_WITH_COMMENT);
        if (info.getParseErrors().size()!=0) {
            fail("Failed get ml with comment test:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }

    @Test
    public void testGetRecordMlEclWithAnnotationLikeComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ML_WITH_ANNOTATION_LIKE_COMMENT);
        if (info.getParseErrors().size()!=0) {
            fail("Failed get record with annotation comment:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }

    @Test
    public void testGetRecordMlEclInlineComment() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(ML_INLINE);
        if (info.getParseErrors().size()!=0) {
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
    public void testGetRecordMaxlength() throws Exception {
        EclRecordWrapper info = DFUFileDetailWrapper.getRecordEcl(MAXLENGTH);
        if (info.getParseErrors().size()!=0) {
            fail("Failed get maxlength test:" + StringUtils.join(info.getParseErrors(),"\n"));
        }
        DFURecordDefWrapper recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnWrapper column = getColumnByName(recordDefInfo, "maxlength");
        assertNotNull(column);
    }

    @Test
    public void testEclParsing() throws Exception {
        Map<String,String> layouts=new LinkedHashMap<String,String>();
        layouts.put("inline record with dataset child", "l_test:=RECORD\nSTRING1 test;\nEND;\n\nRECORD\nSTRING __field1;\n{DATASET(l_test) a} field2;\nEND;");
        layouts.put("record layout def starting with __", "__errx__ := RECORD,maxlength(2097152)\n  integer8 transaction_time{xpath('_call_latency_ms')};\n END;\n\n{ string fname1, integer8 did, DATASET(__errx__) ds };");
        layouts.put("record with {blob} in field definition","RECORD\nSTRING data_content{blob,MAXLENGTH(20000)}; \nEND;");
        layouts.put("inline record def with maxlength","{,maxLength(84)\r\nstring4 sic4_code, string80 sic4_description };");
        boolean passed=true;
        for (Entry<String,String> item:layouts.entrySet()) {
            EclRecordWrapper rec=DFUFileDetailWrapper.getRecordFromECL(item.getValue());
            if (rec.getParseErrors().size()!=0) {
                System.out.println(item.getKey() + " FAILED:" + StringUtils.join(rec.getParseErrors(),"\n"));
                passed=false;
            } else {
                System.out.println(item.getKey() + " parsed correctly");
            }
        }
        if (!passed) {
            fail("not all record structures passed");
        }
    }
}