package org.hpccsystems.commons;

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
}
