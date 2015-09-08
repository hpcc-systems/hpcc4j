package org.hpccsystems.ws.client.utils;

import java.util.HashMap;

public enum FileFormat
{
    UNKNOWN,
    FLAT,
    CSV,
    XML,
    JSON,
    KEYED;

    private final static HashMap<FileFormat, String> mapFileFormat2Name = new HashMap<FileFormat, String>();
    static
    {
        mapFileFormat2Name.put(FLAT,       "FLAT");
        mapFileFormat2Name.put(CSV,        "CSV");
        mapFileFormat2Name.put(XML,        "XML");
        mapFileFormat2Name.put(JSON,       "JSON");
        mapFileFormat2Name.put(KEYED,      "KEYED");
    }

    public static String getFileFormatName(FileFormat fileformat)
    {
        if(mapFileFormat2Name.containsKey(fileformat))
            return mapFileFormat2Name.get(fileformat);
        else
            return null;
    }

    private final static HashMap<String, FileFormat> mapFileFormatName = new HashMap<String, FileFormat>();
    static
    {
       mapFileFormatName.put("FLAT",     FLAT);
       mapFileFormatName.put("THOR",     FLAT);
       mapFileFormatName.put("FIXED",    FLAT);
       mapFileFormatName.put("CSV",      CSV);
       mapFileFormatName.put("VARIABLE", CSV);
       mapFileFormatName.put("XML",      XML);
       mapFileFormatName.put("JSON",     JSON);
       mapFileFormatName.put("KEYED",    KEYED);
       mapFileFormatName.put("KEY",      KEYED);
       mapFileFormatName.put("INDEX",    KEYED);
    }

    public static FileFormat getFileFormat(String name)
    {
        if (name != null)
        {
            String upperName = name.toUpperCase();
            if (mapFileFormatName.containsKey(upperName))
                return mapFileFormatName.get(upperName);
        }

        return FileFormat.UNKNOWN;
    }
}