package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerySetFilterType;
import org.hpccsystems.ws.client.platform.QuerySetFilterType;

public class QuerySetFilterTypeWrapper
{
    
    /**
     * From string.
     *
     * @param filtertype
     *            the filtertype
     * @return the WU query set filter type
     */
    public static WUQuerySetFilterType fromString(String filtertype)
    {
        return get1_75FilterType(filtertype);
    }

    /**
     * Gets the 1 75 filter type.
     *
     * @param filtertype
     *            the filtertype
     * @return the 1 75 filter type
     */
    public static WUQuerySetFilterType get1_75FilterType(QuerySetFilterType filtertype)
    {
        switch (filtertype)
        {
            case All:
                return WUQuerySetFilterType.All;
            case Alias:
                return WUQuerySetFilterType.Alias;
            case Id:
                return WUQuerySetFilterType.Id;
            case Name:
                return WUQuerySetFilterType.Name;
            case Status:
                return WUQuerySetFilterType.Status;
            default:
                return null;
        }
    }
    
    /**
     * Gets the 1 75 filter type.
     *
     * @param filtertype
     *            the filtertype
     * @return the 1 75 filter type
     */
    public static WUQuerySetFilterType get1_75FilterType(String filtertype)
    {
        if (filtertype == null || filtertype.isEmpty())
            return null;

        if (filtertype.equalsIgnoreCase("all"))
            return WUQuerySetFilterType.All;
        else if (filtertype.equalsIgnoreCase("alias"))
            return WUQuerySetFilterType.Alias;
        else if (filtertype.equalsIgnoreCase("id"))
            return WUQuerySetFilterType.Id;
        else if (filtertype.equalsIgnoreCase("name"))
            return WUQuerySetFilterType.Name;
        else if (filtertype.equalsIgnoreCase("status"))
            return WUQuerySetFilterType.Status;
        else
            return null;
    }
}
