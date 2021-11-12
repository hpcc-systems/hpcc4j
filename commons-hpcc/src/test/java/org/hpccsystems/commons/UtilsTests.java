package org.hpccsystems.commons;

import static org.junit.Assert.fail;

import java.math.BigInteger;

import org.hpccsystems.commons.utils.Utils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class UtilsTests
{

    @Test
    public void testU8Extraction()
    {
        Assert.assertTrue(Utils.extractUnsigned8Val(-1L).compareTo(BigInteger.ZERO) > 0);
        Assert.assertEquals(BigInteger.ZERO, Utils.extractUnsigned8Val(0L));
        Assert.assertEquals(BigInteger.ONE, Utils.extractUnsigned8Val(1L));
        Assert.assertEquals(BigInteger.TEN, Utils.extractUnsigned8Val(10L));
        Assert.assertEquals(BigInteger.valueOf(9223372036854775807L), Utils.extractUnsigned8Val(Long.MAX_VALUE));
        Assert.assertTrue(Utils.extractUnsigned8Val(Long.MAX_VALUE+1).compareTo(BigInteger.ZERO) > 0);
        Assert.assertTrue(Utils.extractUnsigned8Val(Long.MIN_VALUE).compareTo(BigInteger.ZERO) > 0);
    }

    @Test
    public void testIsNumeric()
    {
        Assert.assertFalse(Utils.isNumeric("1234!"));
        Assert.assertFalse(Utils.isNumeric("ABCD"));
        Assert.assertTrue(Utils.isNumeric("1"));
        Assert.assertTrue(Utils.isNumeric("-1"));
        Assert.assertTrue(Utils.isNumeric("0"));
        Assert.assertTrue(Utils.isNumeric(String.valueOf(Integer.MAX_VALUE)));
        Assert.assertTrue(Utils.isNumeric(String.valueOf(Integer.MIN_VALUE)));
        Assert.assertTrue(Utils.isNumeric("1.0"));
        Assert.assertTrue(Utils.isNumeric("1e10"));
        Assert.assertFalse(Utils.isNumeric("one"));
        Assert.assertTrue(Utils.isNumeric(String.valueOf(Double.MAX_VALUE)));
        Assert.assertTrue(Utils.isNumeric(String.valueOf(Double.MIN_VALUE)));
        Assert.assertTrue(Utils.isNumeric(String.valueOf(Float.MIN_VALUE)));
        Assert.assertTrue(Utils.isNumeric(String.valueOf(Float.MAX_VALUE)));
    }

    @Test
    public void testRequiresQuotes()
    {
        Assert.assertFalse(Utils.doesNotRequireQuotes("1234!"));
        Assert.assertFalse(Utils.doesNotRequireQuotes("ABCD"));
        Assert.assertTrue(Utils.doesNotRequireQuotes("1"));
        Assert.assertTrue(Utils.doesNotRequireQuotes("-1"));
        Assert.assertTrue(Utils.doesNotRequireQuotes("0"));
        Assert.assertTrue(Utils.doesNotRequireQuotes(String.valueOf(Integer.MAX_VALUE)));
        Assert.assertTrue(Utils.doesNotRequireQuotes(String.valueOf(Integer.MIN_VALUE)));
        Assert.assertTrue(Utils.doesNotRequireQuotes("1.0"));
        Assert.assertTrue(Utils.doesNotRequireQuotes("1e10"));
        Assert.assertFalse(Utils.doesNotRequireQuotes("one"));
        Assert.assertTrue(Utils.doesNotRequireQuotes(String.valueOf(Double.MAX_VALUE)));
        Assert.assertTrue(Utils.doesNotRequireQuotes(String.valueOf(Double.MIN_VALUE)));
        Assert.assertTrue(Utils.doesNotRequireQuotes(String.valueOf(Float.MIN_VALUE)));
        Assert.assertTrue(Utils.doesNotRequireQuotes(String.valueOf(Float.MAX_VALUE)));
        Assert.assertTrue(Utils.doesNotRequireQuotes("'1'"));
    }
}
