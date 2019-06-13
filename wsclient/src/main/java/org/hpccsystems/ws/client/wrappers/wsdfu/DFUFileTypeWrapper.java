/**
 *
 */
package org.hpccsystems.ws.client.wrappers.wsdfu;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileType;

/**
 * DFUFileTypeWrapper
 *
 * Simple wrapper around WSDFU file type enum generated stub
 * Provides layer of indirection between caller and ESP version specific logic
 *
 */
public enum DFUFileTypeWrapper
{
    Flat ("Flat"),
    Index ("Index"),
    Xml ("Xml"),
    Csv ("Csv"),
    Json ("Json");

    protected String theDFUFileType;
    private static final Map<String,DFUFileTypeWrapper> enumtable;

    DFUFileTypeWrapper (String name)
    {
        theDFUFileType = name;
    }

    public String toString()
    {
        return theDFUFileType;
    }

    static
    {
        Map<String,DFUFileTypeWrapper> map = new ConcurrentHashMap<String, DFUFileTypeWrapper>();
        for (DFUFileTypeWrapper instance : DFUFileTypeWrapper.values())
        {
            map.put(instance.toString(),instance);
        }
        enumtable = Collections.unmodifiableMap(map);
    }

    public static DFUFileTypeWrapper get(String name)
    {
        return enumtable.get(name);
    }

    public static DFUFileTypeWrapper fromString(String value)
    {
        if (value != null && !value.isEmpty() && enumtable.containsKey(value))
        {
            return enumtable.get(value);
        }

        throw new IllegalArgumentException("unknown value: " + value);
    }

    public DFUFileType getFUFileType()
    {
        return DFUFileType.Factory.fromValue(theDFUFileType);
    }

    public static DFUFileTypeWrapper fromDfuFileType(DFUFileType filetype)
    {
        return fromString(filetype.getValue());
    }
}
