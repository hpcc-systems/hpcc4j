package org.hpccsystems.ws.client.platform;

import org.junit.Test;

import static org.junit.Assert.*;

public class DFUFileDetailInfoTest {

    private final String WITH_ANNOTATION = "RECORD\nSTRING SSN; // @METATYPE(SSN)\nEND;";
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

    // Single line style tests
    @Test
    public void testGetRecordEcl() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("METATYPE", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("SSN", annotation.getParameters().get(0));
    }
    
    @Test
    public void testGetRecordEclAnnotationAndComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_AND_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1,recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }

    @Test
    public void testGetRecordEclMultiParams() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_MULTI_PARAMS);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
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
    }

    @Test
    public void testGetRecordEclWithAnnotationLikeComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(WITH_ANNOTATION_LIKE_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
    }
    
    // ML tests
    @Test
    public void testGetRecordMlEcl() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1, annotation.getParameters().size());
        assertEquals("BAR", annotation.getParameters().get(0));
    }
    
    @Test
    public void testGetRecordMlEclAnnotationAndComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION_AND_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1,recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("FOO", annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }

    @Test
    public void testGetRecordMlEclMultiParams() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION_MULTI_PARAMS);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
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
    }

    @Test
    public void testGetRecordMlEclWithAnnotationLikeComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_WITH_ANNOTATION_LIKE_COMMENT);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(0, recordDefInfo.getAnnotations().size());
    }
    
    @Test
    public void testGetRecordMlEclInlineComment() throws Exception {
        EclRecordInfo info = DFUFileDetailInfo.getRecordEcl(ML_INLINE);
        DFURecordDefInfo recordDefInfo = info.getRecordsets().get("unnamed0");
        assertNotNull(recordDefInfo);
        assertEquals(1, recordDefInfo.getAnnotations().size());
        DFUDataColumnAnnotation annotation = recordDefInfo.getAnnotations().get(0);
        assertEquals("FOO",annotation.getName());
        assertEquals(1,annotation.getParameters().size());
        assertEquals("BAR",annotation.getParameters().get(0));
    }
}