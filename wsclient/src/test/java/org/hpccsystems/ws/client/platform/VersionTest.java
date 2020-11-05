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

import org.junit.Assert;
import org.junit.Test;

public class VersionTest
{
    @Test
    public void majorMinorPointTest()
    {
        String ver = "3.6.1";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.getMajor()==3);
        Assert.assertTrue(hpccver.getMinor()==6);
        Assert.assertTrue(hpccver.getPoint()==1);
        Assert.assertNull(hpccver.getProject());
        Assert.assertNull(hpccver.getMaturity());
    }

    @Test
    public void preSequenceTest()
    {
        String ver = "community_3.10.0-7rc";
        Version hpccver = new Version(ver);
        Assert.assertFalse(hpccver.toString().equals(ver));
        Assert.assertTrue(hpccver.getMajor()==3);
        Assert.assertTrue(hpccver.getMinor()==10);
        Assert.assertTrue(hpccver.getPoint()==0);
        Assert.assertTrue(hpccver.getProject().equals("community"));
        Assert.assertTrue(hpccver.getMaturity().equals("rc"));
        Assert.assertTrue(hpccver.getSequence()==7);
    }

    @Test
    public void postSequenceTest()
    {
        String ver = "community_3.10.8-rc14";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.toString().equals(ver));
        Assert.assertTrue(hpccver.getMajor()==3);
        Assert.assertTrue(hpccver.getMinor()==10);
        Assert.assertTrue(hpccver.getPoint()==8);
        Assert.assertTrue(hpccver.getProject().equals("community"));
        Assert.assertTrue(hpccver.getMaturity().equals("rc"));
        Assert.assertTrue(hpccver.getSequence()==14);
    }

    @Test
    public void closedownMaturityTest()
    {
        String ver = "community_7.12.0-closedown1";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.toString().equals(ver.toLowerCase()));
        Assert.assertTrue(hpccver.getMajor()==7);
        Assert.assertTrue(hpccver.getMinor()==12);
        Assert.assertTrue(hpccver.getPoint()==0);
        Assert.assertTrue(hpccver.getProject().equals("community"));
        Assert.assertTrue(hpccver.getMaturity().equals("closedown"));
        Assert.assertTrue(hpccver.getSequence()==1);
    }

    @Test
    public void upperCaseTrunkMaturityTest()
    {
        String ver = "community_3.10.8-TRUNK14";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.toString().equals(ver.toLowerCase()));
        Assert.assertTrue(hpccver.getMajor()==3);
        Assert.assertTrue(hpccver.getMinor()==10);
        Assert.assertTrue(hpccver.getPoint()==8);
        Assert.assertTrue(hpccver.getProject().equals("community"));
        Assert.assertTrue(hpccver.getMaturity().equals("trunk"));
        Assert.assertTrue(hpccver.getSequence()==14);
    }

    @Test
    public void upperCaseMaturityTest()
    {
        String ver = "community_3.10.8-RC14";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.toString().equals(ver.toLowerCase()));
        Assert.assertTrue(hpccver.getMajor()==3);
        Assert.assertTrue(hpccver.getMinor()==10);
        Assert.assertTrue(hpccver.getPoint()==8);
        Assert.assertTrue(hpccver.getProject().equals("community"));
        Assert.assertTrue(hpccver.getMaturity().equals("rc"));
        Assert.assertTrue(hpccver.getSequence()==14);
    }

    @Test
    public void customProjectTest()
    {
        String ver = "lnssi-enterprise_7.10.18-1";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.toString().equals(ver));
        Assert.assertTrue(hpccver.getMajor()==7);
        Assert.assertTrue(hpccver.getMinor()==10);
        Assert.assertTrue(hpccver.getPoint()==18);
        Assert.assertTrue(hpccver.getProject().equals("lnssi-enterprise"));
        Assert.assertNull(hpccver.getMaturity());
        Assert.assertTrue(hpccver.getSequence()==1);
    }

    @Test
    public void privateInternalTest()
    {
        String ver = "internal_7.13.0-trunk10232020052732[remotes/origin/master-0-g04158c-dirty]";
        Version hpccver = new Version(ver);
        Assert.assertTrue(hpccver.toString().equals(ver));
        Assert.assertTrue(hpccver.getMajor()==7);
        Assert.assertTrue(hpccver.getMinor()==13);
        Assert.assertTrue(hpccver.getPoint()==0);
        Assert.assertTrue(hpccver.getProject().equals("internal"));
        Assert.assertTrue(hpccver.getMaturity().equals("trunk"));
        Assert.assertTrue(hpccver.getSequence()==10232020052732L);
        Assert.assertTrue(hpccver.getTag().equals("[remotes/origin/master-0-g04158c-dirty]"));
    }

    @Test
    public void compareTest()
    {
        String ver = "internal_7.13.0-trunk10232020052732[remotes/origin/master-0-g04158c-dirty]";
        Version hpccver = new Version(ver);

        Assert.assertEquals(true , hpccver.isEquivalentTo(7,13,0));
        Assert.assertEquals(true , hpccver.isOlderThan(7,14,0));
        Assert.assertEquals(true , hpccver.isOlderThan(8,0,0));
        Assert.assertEquals(true , hpccver.isOlderThan(7,13,1));

        Assert.assertEquals(true , hpccver.isNewerThan(7,12,0));
        Assert.assertEquals(true , hpccver.isNewerThan(6,12,0));
        Assert.assertEquals(true , hpccver.isNewerThan(6,0,1));

        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(7,12,0));
        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(7,13,0));
        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(6,0,1));

        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(7,13,1));
        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(7,13,0));
        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(8,0,1));

        Assert.assertEquals(true , hpccver.isEquivalentTo(new Version(7,13,0)));
        Assert.assertEquals(true , hpccver.isOlderThan(new Version(7,14,0)));
        Assert.assertEquals(true , hpccver.isOlderThan(new Version(8,0,0)));
        Assert.assertEquals(true , hpccver.isOlderThan(new Version(7,13,1)));

        Assert.assertEquals(true , hpccver.isNewerThan(new Version(7,12,0)));
        Assert.assertEquals(true , hpccver.isNewerThan(new Version(6,12,0)));
        Assert.assertEquals(true , hpccver.isNewerThan(new Version(6,0,1)));

        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(new Version(7,12,0)));
        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(new Version(7,13,0)));
        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(new Version(6,0,1)));

        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(new Version(7,13,1)));
        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(new Version(7,13,0)));
        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(new Version(8,0,1)));

        Assert.assertEquals(true , hpccver.isEquivalentTo(new Version("7.13.0")));
        Assert.assertEquals(true , hpccver.isOlderThan(new Version("7.14.0")));
        Assert.assertEquals(true , hpccver.isOlderThan(new Version("8.0.0")));
        Assert.assertEquals(true , hpccver.isOlderThan(new Version("7.13.1")));

        Assert.assertEquals(true , hpccver.isNewerThan(new Version("7.12.0")));
        Assert.assertEquals(true , hpccver.isNewerThan(new Version("6.12.0")));
        Assert.assertEquals(true , hpccver.isNewerThan(new Version("6.0.1")));

        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(new Version("7.12.0")));
        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(new Version("7.13.,0")));
        Assert.assertEquals(true , hpccver.isEqualOrNewerThan(new Version("6.0.1")));

        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(new Version("7.13.1")));
        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(new Version("7.13.0")));
        Assert.assertEquals(true , hpccver.isEqualOrOlderThan(new Version("8.0.1")));

        Assert.assertEquals(Version.OTHER_VERSION_IS_OLDER , hpccver.compareTo(new Version("7.12.1")));
        Assert.assertEquals(Version.OTHER_VERSION_IS_NEWER , hpccver.compareTo(new Version("7.13.0-rc1")));
        Assert.assertEquals(Version.EQUIVALENT_VERSIONS , hpccver.compareTo(new Version("7.13.0-trunk10232020052732")));
        Assert.assertEquals(Version.EQUIVALENT_VERSIONS , hpccver.compareTo(new Version("community_7.13.0-trunk10232020052732")));
        Assert.assertEquals(Version.OTHER_VERSION_IS_NEWER , hpccver.compareTo(new Version("7.13.0-1")));
        Assert.assertEquals(Version.OTHER_VERSION_IS_NEWER , hpccver.compareTo(new Version("7.13.0-closedown")));
        Assert.assertEquals(Version.OTHER_VERSION_IS_NEWER , hpccver.compareTo(new Version("7.13.0-closedown1")));
        Assert.assertEquals(Version.OTHER_VERSION_IS_OLDER , hpccver.compareTo(new Version("7.13.0-trunk10232020052731")));
        Assert.assertEquals(Version.OTHER_VERSION_IS_NEWER , hpccver.compareTo(new Version("7.13.0")));
    }
}
