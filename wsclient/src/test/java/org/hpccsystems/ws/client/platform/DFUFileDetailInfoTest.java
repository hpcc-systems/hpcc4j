package org.hpccsystems.ws.client.platform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DFUFileDetailInfoTest {

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

    public static DFUDataColumnInfo getColumnByName(final DFURecordDefInfo parent, final String name) {
        for (final DFUDataColumnInfo child: parent.getChildColumns()) {
            if (child.getColumnLabel().equals(name)) {
                return child;
            }
        }
        return null;
    }

    // Single line style tests
    @Test
    public void testGetRecordEcl() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1, column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("METATYPE", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("SSN", annotation.getParameters().get(0));
    }

    // Single line style tests
    @Test
    public void testFullRecordEcl() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(FULL_RECORD);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("LARGE", annotation.getName());
         DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
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
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_NO_PARAMS);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1, column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FEW", annotation.getName());
        assertEquals(0, annotation.getParameters().size());
    }
    
    @Test
    public void testGetRecordEclAnnotationAndComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_AND_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(1,column.getAnnotations().size());
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }

    @Test
    public void testGetRecordEclMultiParams() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_MULTI_PARAMS);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
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
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }

    @Test
    public void testGetRecordEclWithAnnotationLikeComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_LIKE_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }
    
    // ML tests
    @Test
    public void testGetRecordMlEcl() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "FOO");

        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("BAR", annotation.getParameters().get(0));
    }
    
    @Test
    public void testGetRecordMlEclAnnotationAndComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION_AND_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0,recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }

    @Test
    public void testGetRecordMlEclMultiParams() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION_MULTI_PARAMS);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");

        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(3, annotation.getParameters().size());
        assertEquals("BAR1", annotation.getParameters().get(0));
        assertEquals("BAR2", annotation.getParameters().get(1));
        assertEquals("BAR3", annotation.getParameters().get(2));
    }

    @Test
    public void testGetRecordMlEclWithComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }

    @Test
    public void testGetRecordMlEclWithAnnotationLikeComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION_LIKE_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");
        assertEquals(0, column.getAnnotations().size());
    }
    
    @Test
    public void testGetRecordMlEclInlineComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_INLINE);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "SSN");

        DFUDataColumnAnnotation annotation = column.getAnnotations().get(0);
        assertEquals("FOO",annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }
    
    
    @Test
    public void testGetRecordMaxlength() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(MAXLENGTH);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
        DFUDataColumnInfo column = getColumnByName(recordDefInfo, "maxlength");
        assertNotNull(column);
    }
}