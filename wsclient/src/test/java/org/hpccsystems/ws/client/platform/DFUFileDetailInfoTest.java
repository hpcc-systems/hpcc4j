package org.hpccsystems.ws.client.platform;

import org.junit.Test;

import static org.junit.Assert.*;

public class DFUFileDetailInfoTest {

    private final String WITH_ANNOTATION = "RECORD\nSTRING SSN; // @METATYPE(SSN)\nEND;";
    private final String WITH_ANNOTATION_MULTI_PARAMS = "RECORD\nSTRING SSN; // @FOO(BAR1, BAR2,BAR3)\nEND;";
    private final String WITH_COMMENT = "RECORD\nSTRING SSN; // This is just a regular comment. \nEND;";
    private final String WITH_ANNOTATION_LIKE_COMMENT = "RECORD\nSTRING SSN; // THIS(ISNT) an annotations.\nEND;";


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
        System.out.println(info);
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
}