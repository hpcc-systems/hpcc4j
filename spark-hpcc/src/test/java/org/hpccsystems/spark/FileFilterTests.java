/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
package org.hpccsystems.spark;

import org.junit.Assert;
import org.apache.spark.sql.sources.EqualTo;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.GreaterThan;
import org.apache.spark.sql.sources.GreaterThanOrEqual;
import org.apache.spark.sql.sources.In;
import org.apache.spark.sql.sources.LessThan;
import org.apache.spark.sql.sources.Not;
import org.apache.spark.sql.sources.Or;
import org.apache.spark.sql.sources.StringStartsWith;
import org.hpccsystems.commons.ecl.FileFilter;
import org.junit.Before;
import org.junit.Test;

import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class FileFilterTests
{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testNotSparkFilterstoHPCCFilters()
    {
        System.out.println("\n----------Spark 'Not' filter to HPCC Tests----------");

        try
        {
            Filter child = new LessThan("field1", 8);
            Not notlessthan = new Not(child);
            FileFilter hpccnotlessthan = FileFilterConverter.ConvertToHPCCFileFilterString(notlessthan);
            Assert.assertNotNull(hpccnotlessthan);

            GreaterThanOrEqual gte = new GreaterThanOrEqual("field1", 8);
            FileFilter hpccgte = FileFilterConverter.ConvertToHPCCFileFilterString(gte);
            Assert.assertNotNull(hpccgte);

            Assert.assertEquals(hpccnotlessthan.toJson(), hpccgte.toJson());
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    public void testSparkFilterstoHPCCFilters()
    {

        System.out.println("\n----------Spark to HPCC filter Tests----------");

        org.apache.spark.sql.sources.Filter [] sparkfilters = new org.apache.spark.sql.sources.Filter[8];
        StringStartsWith ssw = new StringStartsWith("Fname", "Rod");
        LessThan lt = new LessThan("field1", 12);
        GreaterThan gt = new GreaterThan("field1", 8);
        Or or = new Or(lt, gt);
        sparkfilters[0] = ssw;
        sparkfilters[1] = or;

        In in = new In("field1", new Object [] { "str", "values", "etc"});
        sparkfilters[2] = in;

        In innumber = new In("field1", new Object [] { 1, 2, 3, 4, 5.6});
        sparkfilters[3] = innumber;

        LessThan lta = new LessThan("alphafield", "XYZ");
        sparkfilters[4] = lta;

        Filter child = new EqualTo("field1", "true");
        org.apache.spark.sql.sources.Not n = new org.apache.spark.sql.sources.Not(child );
        sparkfilters[5] = n;

        Filter eq5 = new EqualTo("field1", 5);
        sparkfilters[6] = eq5;

        child = new LessThan("field1", -3.2);
        n = new Not(child);
        sparkfilters[7] = n;

        try
        {
            FileFilter hpccfilters = FileFilterConverter.CovertToHPCCFileFilter(sparkfilters);
            System.out.println("\n----------Converting Spark to HPCC filter output----------");
            System.out.println(hpccfilters.toJson());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
