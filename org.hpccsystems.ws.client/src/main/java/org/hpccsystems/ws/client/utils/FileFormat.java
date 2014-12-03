package org.hpccsystems.ws.client.utils;

import java.util.HashMap;

public enum FileFormat
{
    DFUff_fixed(0),
    DFUff_csv(1),
    DFUff_utf8(2),
    DFUff_utf8n(3),
    DFUff_utf16(4),
    DFUff_utf16le(5),
    DFUff_utf16be(6),
    DFUff_utf32(7),
    DFUff_utf32le(8),
    DFUff_utf32be(9),
    DFUff_variable(10),
    DFUff_recfmvb(11),
    DFUff_recfmv(12),
    DFUff_variablebigendian(13);

    private final int id;
    FileFormat(int id) { this.id = id; }
    public int getValue() { return id; }

    private final static HashMap<String, FileFormat> mapDFUFileFormatNameCode = new HashMap<String, FileFormat>();
    static
    {
        mapDFUFileFormatNameCode.put("csv",                FileFormat.DFUff_csv);
        mapDFUFileFormatNameCode.put("ascii",              FileFormat.DFUff_csv);
        mapDFUFileFormatNameCode.put("utf8",               FileFormat.DFUff_utf8);
        mapDFUFileFormatNameCode.put("utf16",              FileFormat.DFUff_utf16);
        mapDFUFileFormatNameCode.put("utf16le",            FileFormat.DFUff_utf16le);
        mapDFUFileFormatNameCode.put("utf16be",            FileFormat.DFUff_utf16be);
        mapDFUFileFormatNameCode.put("utf32",              FileFormat.DFUff_utf32);
        mapDFUFileFormatNameCode.put("utf32le",            FileFormat.DFUff_utf32le);
        mapDFUFileFormatNameCode.put("utf32be",            FileFormat.DFUff_utf32be);
        mapDFUFileFormatNameCode.put("variable",           FileFormat.DFUff_variable);
        mapDFUFileFormatNameCode.put("recfmvb",            FileFormat.DFUff_recfmvb);
        mapDFUFileFormatNameCode.put("recfmv",             FileFormat.DFUff_recfmv);
        mapDFUFileFormatNameCode.put("variablebigendian",  FileFormat.DFUff_variablebigendian);
        mapDFUFileFormatNameCode.put("fixed",              FileFormat.DFUff_fixed);
    }

    public static FileFormat convertDFUFileFormatName2Code(String fileformat)
    {
        String lower = fileformat.toLowerCase();
        if(mapDFUFileFormatNameCode.containsKey(lower))
            return mapDFUFileFormatNameCode.get(lower);
        else
            return FileFormat.DFUff_fixed;
    }
}