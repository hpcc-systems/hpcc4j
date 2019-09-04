package org.hpccsystems.ws.client.platform.test.data;

public class ECLRecords
{
    public static final String WITH_ANNOTATION = "RECORD\nSTRING SSN; // @METATYPE(SSN)\nEND;";
    public static final String MAXLENGTH = "RECORD\nSTRING SSN;\nINTEGER8 maxlength;\nEND;";
    public static final String WITH_ANNOTATION_NO_PARAMS = "RECORD\nSTRING SSN; // @FEW\nEND;";
    public static final String WITH_ANNOTATION_AND_COMMENT = "RECORD\nSTRING SSN; // @FOO(BAR) foo equals kittens, bar equals cats\nEND;";
    public static final String WITH_ANNOTATION_MULTI_PARAMS = "RECORD\nSTRING SSN; // @FOO(BAR1, BAR2,BAR3)\nEND;";
    public static final String WITH_COMMENT = "RECORD\nSTRING SSN; // This is just a regular comment.\nEND;";
    public static final String WITH_ANNOTATION_LIKE_COMMENT = "RECORD\nSTRING SSN; // THIS(ISNT) an annotations.\nEND;";
    public static final String ML_WITH_ANNOTATION = "RECORD\nSTRING FOO; /* @FOO(BAR) */\nEND;";
    public static final String ML_WITH_ANNOTATION_AND_COMMENT = "RECORD\nSTRING SSN; /* @FOO(BAR) and kittens. */\nEND;";
    public static final String ML_WITH_ANNOTATION_MULTI_PARAMS = "RECORD\nSTRING SSN; /* @FOO(BAR1, BAR2,BAR3) */\nEND;";
    public static final String ML_WITH_COMMENT = "RECORD\nSTRING SSN; /* this is just a regular comment. */\nEND;";
    public static final String ML_WITH_ANNOTATION_LIKE_COMMENT = "RECORD\nSTRING SSN; /* THIS(ISNT) an annotation. */\nEND;";
    public static final String ML_INLINE = "RECORD\nSTRING SSN; /* @FOO(BAR) */\nEND;";
    public static final String FULL_RECORD = "child := RECORD\n\t\tSTRING name;\nEND;\nRECORD // @LARGE\nSTRING FNAME;\nSTRING LNAME;\nSTRING MNAME;\nSTRING DOB;\nSTRING SSN; // @METATYPE(SSN)\nSTRING ADDR1;\nSTRING ADDR2;\nSTRING CITY;\nSTRING STATE;\nSTRING ZIP; // @METATYPE(ZIP), @FEW, @MULTIPARAMS(PARAM1,PARAM2)\nSTRING DLNUMBER;\nDATASET(child) KIDS;\nEND;";
    public static final String INLINE_WITH_MAXLENGTH = "{ , MAXLENGTH(84) string4 sic4_code, string80 sic4_description };";
    public static final String INLINE_WITH_DATASET_CHILD = "l_test:=RECORD\nSTRING1 test;\nEND;\n\nRECORD\nSTRING __field1;\n{DATASET(l_test) a} field2;\nEND;";
    public static final String RECORD_LAYOUT_DEF_STARTING_WITH__ = "__errx__ := RECORD,maxlength(2097152)\n  integer8 transaction_time{xpath('_call_latency_ms')};\n END;\n\n{ string fname1, integer8 did, DATASET(__errx__) ds };";
    public static final String RECORD_WITH_BLOB_IN_FIELD_DEF = "RECORD\nSTRING data_content{blob,MAXLENGTH(20000)}; \nEND;";
    //layouts.put("inline record def with maxlength","{,maxLength(84)\r\nstring4 sic4_code, string80 sic4_description };");
}
