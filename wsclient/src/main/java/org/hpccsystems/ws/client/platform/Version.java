package org.hpccsystems.ws.client.platform;

public class Version implements Comparable<Version>
{
    public String versionString = "";
    public String prefix        = "";
    public int    major         = 0;
    public int    minor         = 0;
    public int    point         = 0;
    public String postfix       = "";
    public String postfixStr    = "";
    public int    postfixInt    = 0;

    /**
     * Instantiates a new version.
     *
     * @param versionString
     *            the version string
     */
    public Version(String versionString)
    {
        // 3.6.1
        // community_3.10.0-7rc
        // community_3.10.8-rc14
        this.versionString = versionString;
        String[] parts = versionString.split("(_|-|\\[|\\])");
        if (parts.length == 1)
        {
            calcVersion(parts[0]);
        }
        else if (parts.length >= 3)
        {
            prefix = parts[0];
            calcVersion(parts[1]);
            calcPostfix(parts[2]);
        }
    }

    /**
     * Calc version.
     *
     * @param version
     *            the version
     */
    void calcVersion(String version)
    {
        major = 0;
        minor = 0;
        point = 0;
        try
        {
            String[] parts = version.split("\\.");
            if (parts.length >= 1)
            {
                major = new Integer(parts[0]);
            }
            if (parts.length >= 2)
            {
                minor = new Integer(parts[1]);
            }
            if (parts.length >= 3)
            {
                point = new Integer(parts[2]);
            }
        }
        catch (NumberFormatException e)
        {}
    }

    /**
     * Calc postfix.
     *
     * @param postfix
     *            the postfix
     */
    void calcPostfix(String postfix)
    {
        this.postfix = postfix;
        if (postfix.isEmpty())
        {
            return;
        }
        String postfixIntStr = "";
        for (char c : postfix.toCharArray())
        {
            if (Character.isDigit(c))
            {
                postfixIntStr += c;
            }
            else
            {
                postfixStr += c;
            }
        }
        try
        {
            postfixInt = new Integer(postfixIntStr);
        }
        catch (NumberFormatException e)
        {}
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return versionString;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Version other)
    {
        if (other.major < major)
            return -1;
        else if (other.major > major) return 1;

        if (other.minor < minor)
            return -1;
        else if (other.minor > minor) return 1;

        if (other.point < point)
            return -1;
        else if (other.point > point) return 1;

        if (!other.postfixStr.isEmpty() && postfixStr.isEmpty()) // rc
            return -1;
        else if (other.postfixStr.isEmpty() && !postfixStr.isEmpty()) // rc
            return 1;

        if (other.postfixInt < postfixInt)
            return -1;
        else if (other.postfixInt > postfixInt) return 1;

        return other.prefix.compareTo(prefix);
    }

    public final static int DISTANCE_SUFFIXINT = 100;
    public final static int DISTANCE_SUFFIXSTR = 1000;
    public final static int DISTANCE_POINT     = 100000;
    public final static int DISTANCE_MINOR     = 100000000;

    /**
     * Distance.
     *
     * @param l
     *            the l
     * @param r
     *            the r
     * @return the long
     */
    public static long distance(Version l, Version r)
    {
        long retVal = 0;
        retVal += Math.abs(r.postfixInt - l.postfixInt);
        retVal += Math.abs(r.postfix.compareTo(l.postfix)) * DISTANCE_SUFFIXINT;
        retVal += Math.abs(r.point - l.point) * DISTANCE_SUFFIXSTR;
        retVal += Math.abs(r.minor - l.minor) * DISTANCE_POINT;
        retVal += Math.abs(r.major - l.major) * DISTANCE_MINOR;
        return retVal;
    }
}
