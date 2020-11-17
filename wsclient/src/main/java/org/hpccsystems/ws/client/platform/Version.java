/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.hpccsystems.ws.client.platform;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Version implements Comparable<Version>
{
    private String versionString = "";
    private String project        = "";
    private int    major         = -1;
    private int    minor         = -1;
    private int    point         = -1;
    private long   sequence      = -1;
    private String maturity      = "";
    private String tag           = "";

    // 3.6.1
    // community_3.10.8-rc14
    // community_3.10.0-7rc
    // random-projname_1.2.3
    // community_7.12.0-closedown1
    // internal_7.13.0-trunk10232020052732[remotes/origin/master-0-g04158c-dirty]
    // <optional project name consisting of upper/lower alpha and dash, post-fixed by underscore><Major>.<Minor><Point>
    // <optional maturity and sequence version, prefixed by dash><optional "tag" encapsulated in square brackets>

    final String regex = "(?:(?<project>[a-zA-Z-]*)_)?(?<major>\\d+)\\.(?<minor>\\d+)\\.(?<point>\\d+)(?:\\-(?<presequence>\\d+)?(?:(?<maturity>(?i)rc|trunk|closedown)?(?<postsequence>\\d+)?))?(?<tag>\\[.+\\])?";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

    public Version(int major, int minor, int point)
    {
        this.major = major;
        this.minor = minor;
        this.point = point;
    }

    /**
     * Instantiates a new version.
     *
     * @param versionString
     *            the version string
     */
    public Version(String versionString)
    {
        this.versionString = versionString;

        final Matcher matcher = pattern.matcher(versionString);
        if (matcher.find())
        {
            project = matcher.group(1);
            if (matcher.group(2) != null)
                major = Integer.parseInt(matcher.group(2));
            if (matcher.group(3) != null)
                minor = Integer.parseInt(matcher.group(3));
            if (matcher.group(4) != null)
                point = Integer.parseInt(matcher.group(4));

            maturity = matcher.group("maturity");
            if (maturity != null)
                maturity = maturity.toLowerCase();

            if (matcher.group("presequence") != null)
                sequence = Long.parseLong(matcher.group("presequence"));

            if (matcher.group("postsequence") != null)
            {
                if (sequence != -1)
                    System.err.println("Version: Invalid sequence detected in version string: " + versionString);

                sequence = Long.parseLong(matcher.group("postsequence"));
            }

            if (matcher.group("tag") != null)
                tag = matcher.group("tag");
        }
    }

    public String getOriginalVersionString()
    {
        return versionString;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        String reconstructedVerString = "";
        if (project != null && !project.isEmpty())
            reconstructedVerString += project + "_";

        reconstructedVerString += major + "." + minor + "." + point;

        if (sequence > 0 || (maturity != null && !maturity.isEmpty()))
        {
            reconstructedVerString += "-";

            if (maturity != null)
                reconstructedVerString += maturity;
            reconstructedVerString += sequence;
        }

        if (tag != null)
            reconstructedVerString += tag;

        return reconstructedVerString;
    }

    public final static int OTHER_VERSION_IS_OLDER = -1;
    public final static int EQUIVALENT_VERSIONS = 0;
    public final static int OTHER_VERSION_IS_NEWER = 1;

    public boolean isEquivalentTo(int othermajor, int otherminor, int otherpoint)
    {
        return compareTo(othermajor, otherminor, otherpoint) == EQUIVALENT_VERSIONS;
    }

    public boolean isOlderThan(int othermajor, int otherminor, int otherpoint)
    {
        return compareTo(othermajor, otherminor, otherpoint) == OTHER_VERSION_IS_NEWER;
    }

    public boolean isNewerThan(int othermajor, int otherminor, int otherpoint)
    {
        return compareTo(othermajor, otherminor, otherpoint) == OTHER_VERSION_IS_OLDER;
    }

    public boolean isEqualOrNewerThan(int othermajor, int otherminor, int otherpoint)
    {
        return compareTo(othermajor, otherminor, otherpoint) <= EQUIVALENT_VERSIONS;
    }

    public boolean isEqualOrOlderThan(int othermajor, int otherminor, int otherpoint)
    {
        return compareTo(othermajor, otherminor, otherpoint) >= EQUIVALENT_VERSIONS;
    }

    public int compareTo(int othermajor, int otherminor, int otherpoint)
    {
         if (othermajor < major)
             return OTHER_VERSION_IS_OLDER;
         else if (othermajor > major)
             return OTHER_VERSION_IS_NEWER;

        if (otherminor < minor)
            return OTHER_VERSION_IS_OLDER;
        else if (otherminor > minor)
            return OTHER_VERSION_IS_NEWER;

        if (otherpoint < point)
            return OTHER_VERSION_IS_OLDER;
        else if (otherpoint > point)
            return OTHER_VERSION_IS_NEWER;

        return EQUIVALENT_VERSIONS;
     }

    public boolean isEquivalentTo(Version other)
    {
        return compareTo(other.major, other.minor, other.point) == EQUIVALENT_VERSIONS;
    }

    public boolean isOlderThan(Version other)
    {
        return compareTo(other.major, other.minor, other.point) == OTHER_VERSION_IS_NEWER;
    }

    public boolean isNewerThan(Version other)
    {
        return compareTo(other.major, other.minor, other.point) == OTHER_VERSION_IS_OLDER;
    }

    public boolean isEqualOrNewerThan(Version other)
    {
        return compareTo(other.major, other.minor, other.point) <= EQUIVALENT_VERSIONS;
    }

    public boolean isEqualOrOlderThan(Version other)
    {
        return compareTo(other.major, other.minor, other.point) >= EQUIVALENT_VERSIONS;
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Version other)
    {
        if (other.major < major)
            return OTHER_VERSION_IS_OLDER;
        else if (other.major > major)
            return OTHER_VERSION_IS_NEWER;

        if (other.minor < minor)
            return OTHER_VERSION_IS_OLDER;
        else if (other.minor > minor)
            return OTHER_VERSION_IS_NEWER;

        if (other.point < point)
            return OTHER_VERSION_IS_OLDER;
        else if (other.point > point)
            return OTHER_VERSION_IS_NEWER;

        if (!other.isGold() && isGold())   // GOLD entails a greater than -1 seq and no maturity
            return OTHER_VERSION_IS_OLDER;
        else if (other.isGold() && !isGold())
            return OTHER_VERSION_IS_NEWER;
        else
        {
            if (other.maturity != maturity && !other.maturity.equals(maturity))
            {
                if (other.maturity.equalsIgnoreCase("trunk"))
                    return OTHER_VERSION_IS_OLDER;
                else if (maturity.equalsIgnoreCase("trunk"))
                    return OTHER_VERSION_IS_NEWER;
                else if (other.maturity.equalsIgnoreCase("rc"))
                    return OTHER_VERSION_IS_OLDER;
                else if (maturity.equalsIgnoreCase("rc"))
                    return OTHER_VERSION_IS_NEWER;
                else if (other.maturity.equalsIgnoreCase("closedown"))
                    return OTHER_VERSION_IS_OLDER;
                else if (maturity.equalsIgnoreCase("closedown"))
                    return OTHER_VERSION_IS_NEWER;
            }
        }

        if (other.sequence < sequence)
            return OTHER_VERSION_IS_OLDER;
        else if (other.sequence > sequence)
            return OTHER_VERSION_IS_NEWER;

        //cannot make assertions regarding project name, nor tag
        return EQUIVALENT_VERSIONS;
    }

    public boolean isGold()
    {
        return maturity == null || maturity.isEmpty();
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
        retVal += Math.abs(r.sequence - l.sequence);
        retVal += Math.abs(r.maturity.compareTo(l.maturity)) * DISTANCE_SUFFIXINT;
        retVal += Math.abs(r.point - l.point) * DISTANCE_SUFFIXSTR;
        retVal += Math.abs(r.minor - l.minor) * DISTANCE_POINT;
        retVal += Math.abs(r.major - l.major) * DISTANCE_MINOR;
        return retVal;
    }

    public String getPrefix()
    {
        return project;
    }

    public int getMajor()
    {
        return major;
    }

    public int getMinor()
    {
        return minor;
    }

    public int getPoint()
    {
        return point;
    }

    public String getMaturity()
    {
        return maturity;
    }

    public long getSequence()
    {
        return sequence;
    }

    public String getProject()
    {
        return project;
    }

    public String getTag()
    {
        return tag;
    }
}
