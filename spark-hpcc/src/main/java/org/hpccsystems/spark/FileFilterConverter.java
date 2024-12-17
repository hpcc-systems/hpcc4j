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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.spark.sql.sources.And;
import org.apache.spark.sql.sources.EqualNullSafe;
import org.apache.spark.sql.sources.EqualTo;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.GreaterThan;
import org.apache.spark.sql.sources.GreaterThanOrEqual;
import org.apache.spark.sql.sources.In;
import org.apache.spark.sql.sources.IsNotNull;
import org.apache.spark.sql.sources.IsNull;
import org.apache.spark.sql.sources.LessThan;
import org.apache.spark.sql.sources.LessThanOrEqual;
import org.apache.spark.sql.sources.Not;
import org.apache.spark.sql.sources.Or;
import org.apache.spark.sql.sources.StringContains;
import org.apache.spark.sql.sources.StringEndsWith;
import org.apache.spark.sql.sources.StringStartsWith;
import org.hpccsystems.commons.ecl.FieldFilter;
import org.hpccsystems.commons.ecl.FieldFilterRange;
import org.hpccsystems.commons.ecl.FileFilter;

/**
 * A helper class that translates Spark Filters into an HPCC Systems FileFilter.
 * 
 * HPCC Systems FileFilter does not support all possible Spark Filters. In these cases an exception will be thrown.
 */
public class FileFilterConverter
{
    private static final Logger  log                 = LogManager.getLogger(FileFilterConverter.class);
    private static final long serialVersionUID = 1L;

    public static FileFilter CovertToHPCCFileFilter(Filter [] sparkfilters) throws Exception
    {
        FileFilter hpccFilters = new FileFilter();

        for (Filter sparkfilter : sparkfilters)
        {
            hpccFilters.andFilter(ConvertToHPCCFileFilterString(sparkfilter));
        }

        return hpccFilters;
    }

    public static FileFilter ConvertToHPCCFileFilterString(Filter sparkfilter) throws Exception
    {
        FileFilter hpccfilter = new FileFilter();

        //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql
        //And, EqualNullSafe, EqualTo, GreaterThan, GreaterThanOrEqual, In, IsNotNull, IsNull, LessThan, LessThanOrEqual, Not, Or, StringContains, StringEndsWith, StringStartsWith
        if (sparkfilter instanceof EqualTo)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/EqualTo.html
            //A filter that evaluates to true iff the attribute evaluates to a value equal to value.

            final EqualTo eqtofilter = (EqualTo) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(eqtofilter.attribute(),FieldFilterRange.makeEq(eqtofilter.value())));
        }
        else if (sparkfilter instanceof EqualNullSafe)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/EqualNullSafe.html
            //Performs equality comparison, similar to EqualTo.
            //However, this differs from EqualTo in that it returns true (rather than NULL) if both inputs are NULL,
            //and false (rather than NULL) if one of the input is NULL and the other is not NULL.
            //
            //No concept of NULL in HPCC/ECL
            final EqualNullSafe eqnullsafefilter = (EqualNullSafe) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(eqnullsafefilter.attribute(),FieldFilterRange.makeEq(eqnullsafefilter.value())));
        }
        else if (sparkfilter instanceof And)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/And.html
            //A filter that evaluates to true iff both left or right evaluate to true.

            final And andfilter = (And) sparkfilter;
            hpccfilter = new FileFilter(ConvertToHPCCFileFilterString(andfilter.left()));
            hpccfilter.andFilter(ConvertToHPCCFileFilterString(andfilter.right()));
        }
        else if (sparkfilter instanceof GreaterThan)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/GreaterThan.html
            //A filter that evaluates to true iff the attribute evaluates to a value greater than value.

            final GreaterThan gtfilter = (GreaterThan) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(gtfilter.attribute(),FieldFilterRange.makeGT(gtfilter.value())));
        }
        else if (sparkfilter instanceof GreaterThanOrEqual)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/GreaterThanOrEqual.html
            //A filter that evaluates to true iff the attribute evaluates to a value greater than or equal to value.
            final GreaterThanOrEqual gtefilter = (GreaterThanOrEqual) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(gtefilter.attribute(),FieldFilterRange.makeGE(gtefilter.value())));
        }
        else if (sparkfilter instanceof In)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/In.html
            //A filter that evaluates to true iff the attribute evaluates to one of the values in the array.
            //
            //A in B,C       A=[B],[C]
            final In infilter = (In) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(infilter.attribute(), FieldFilterRange.makeIn(infilter.values())));
        }
        else if (sparkfilter instanceof IsNotNull)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/IsNotNull.html
            //A filter that evaluates to true iff the attribute evaluates to a non-null value.
            //
            //No concept of NULL in hpcc/ecl, this filter should always resolve to false/emptystring/0?

            final IsNotNull wildfilter = (IsNotNull) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(wildfilter.attribute()));//RODRIGO not sure about this one
            log.info("Filter 'IsNotNull' ignored -- No concept of NULL in HPCC/ECL");
        }
        else if (sparkfilter instanceof IsNull)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/IsNull.html
            //A filter that evaluates to true iff the attribute evaluates to null.
            //
            //No concept of NULL in hpcc/ecl, this filter should always resolve to false/emptystring/0?
            throw new UnsupportedOperationException("Filter 'IsNull' not supported");
        }
        else if (sparkfilter instanceof LessThan)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/LessThan.html
            //A filter that evaluates to true iff the attribute evaluates to a value less than value.
            final LessThan ltfilter = (LessThan) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(ltfilter.attribute(),FieldFilterRange.makeLT(ltfilter.value())));
        }
        else if (sparkfilter instanceof LessThanOrEqual)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/LessThanOrEqual.html
            //A filter that evaluates to true iff the attribute evaluates to a value less than or equal to value.
            final LessThan ltefilter = (LessThan) sparkfilter;
            hpccfilter = new FileFilter(new FieldFilter(ltefilter.attribute(),FieldFilterRange.makeLE(ltefilter.value())));
        }
        else if (sparkfilter instanceof Not)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/Not.html
            //A filter that evaluates to true iff child is evaluated to false.
            final Not notfilter = (Not) sparkfilter;
            Filter child = notfilter.child();
            if (child instanceof EqualTo)
            {
                final EqualTo eqfilter = (EqualTo) child;
                hpccfilter = new FileFilter(new FieldFilter(eqfilter.attribute(),FieldFilterRange.makeNE(eqfilter.value())));
            }
            else if (child instanceof EqualNullSafe)
            {
                final EqualNullSafe filter = (EqualNullSafe) child;
                hpccfilter = new FileFilter(new FieldFilter(filter.attribute(),FieldFilterRange.makeNE(filter.value())));
            }
            else if (child instanceof GreaterThan)
            {
                final GreaterThan filter = (GreaterThan) child;
                hpccfilter = new FileFilter(new FieldFilter(filter.attribute(),FieldFilterRange.makeLE(filter.value())));
            }
            else if (child instanceof GreaterThanOrEqual)
            {
                final GreaterThanOrEqual filter = (GreaterThanOrEqual) child;
                hpccfilter = new FileFilter(new FieldFilter(filter.attribute(),FieldFilterRange.makeLT(filter.value())));
            }
            else if (child instanceof LessThan)
            {
                final LessThan filter = (LessThan) child;
                hpccfilter = new FileFilter(new FieldFilter(filter.attribute(),FieldFilterRange.makeGE(filter.value())));
            }
            else if (child instanceof LessThanOrEqual)
            {
                final LessThanOrEqual filter = (LessThanOrEqual) child;
                hpccfilter = new FileFilter(new FieldFilter(filter.attribute(),FieldFilterRange.makeGT(filter.value())));
            }
            else
                throw new UnsupportedOperationException("Filter 'Not' not supported");
        }
        else if (sparkfilter instanceof Or)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/Or.html
            //A filter that evaluates to true iff at least one of left or right evaluates to true.
            //
            //A < B or A in [C..D] or A >= E           A=(,B),[C,D],[E,)

            final Or orfilter = (Or) sparkfilter;
            hpccfilter = new FileFilter(ConvertToHPCCFileFilterString(orfilter.left()));
            hpccfilter.orFilter(ConvertToHPCCFileFilterString(orfilter.right()));
        }
        else if (sparkfilter instanceof StringContains)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/StringContains.html
            //A filter that evaluates to true iff the attribute evaluates to a string that contains the string value.
            throw new UnsupportedOperationException("Filter 'StringContains' not supported");
        }
        else if (sparkfilter instanceof StringEndsWith)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/StringEndsWith.html
            //A filter that evaluates to true iff the attribute evaluates to a string that starts with value.
            throw new UnsupportedOperationException("Filter 'StringEndsWith' not supported");
        }
        else if (sparkfilter instanceof StringStartsWith)
        {
            //https://spark.apache.org/docs/2.3.0/api/java/org/apache/spark/sql/sources/StringStartsWith.html
            //A filter that evaluates to true iff the attribute evaluates to a string that starts with value.
            //
            //<field>:<length>=<set>   - substring match
            //The format of the set is an optional comma-separated sequence of ranges
            final StringStartsWith strstartswithfilter = (StringStartsWith) sparkfilter;
            final String value = strstartswithfilter.value();
            final FieldFilterRange substring = FieldFilterRange.makeStartsWith(value, (short)value.length());

            hpccfilter = new FileFilter(new FieldFilter(strstartswithfilter.attribute(), new FieldFilterRange[] {substring}));
        }

        log.debug("Converted SPARK filter: '" + sparkfilter.toString() + "' to HPCC filter: '" + hpccfilter);
        return hpccfilter;
    }
}

