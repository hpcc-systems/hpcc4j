package org.hpccsystems.commons.errors;

import static org.junit.Assert.assertEquals;

import org.hpccsystems.commons.errors.HpccError;
import org.hpccsystems.commons.errors.HpccErrorBlock;
import org.hpccsystems.commons.errors.HpccErrorCode;
import org.hpccsystems.commons.errors.HpccErrorLevel;
import org.hpccsystems.commons.errors.HpccErrorType;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class HpccErrorTest
{

    @Test
    public void testHpccError() throws Exception
    {
        // create a standard error message
        HpccError err = new HpccError(HpccErrorLevel.ERROR, HpccErrorType.SYSTEM, HpccErrorCode.UNCAUGHT_EXCEPTION,
                "Error retrieving x");

        // create a standard warning message
        err = new HpccError(HpccErrorLevel.WARNING, HpccErrorType.SYSTEM, HpccErrorCode.UNCAUGHT_EXCEPTION,
                "warning retrieving x");

        // create a standard info message
        err = new HpccError(HpccErrorLevel.INFO, HpccErrorType.SYSTEM, HpccErrorCode.INFO, "info about retrieving x");

        // create an error for a caught exception
        try
        {
            throw new Exception("test exception");
        }
        catch (Exception e)
        {
            err = new HpccError(HpccErrorLevel.FATAL, HpccErrorType.SYSTEM, HpccErrorCode.UNCAUGHT_EXCEPTION,
                    e.getMessage(), e);
        }

        // create an error for an ecl compile exception (with linenum/colnum, etc)
        err = new HpccError(HpccErrorLevel.ERROR, HpccErrorType.UNKNOWN, HpccErrorCode.UNCAUGHT_EXCEPTION,
                "error message", "additional info", 31, // line number
                342, // column number
                "c:/test/compmod.ecl" // filename
        );

        // output error
        System.out.println(err.toEclIdeString());
        System.out.println(err.toString());

    }

    @Test
    public void testHpccErrorBlock() throws Exception
    {
        HpccErrorBlock eb = new HpccErrorBlock();
        eb.add(new HpccError(HpccErrorLevel.ERROR, HpccErrorType.SYSTEM, HpccErrorCode.UNCAUGHT_EXCEPTION,
                "Error retrieving x"));
        eb.add(new HpccError(HpccErrorLevel.WARNING, HpccErrorType.SYSTEM, HpccErrorCode.UNCAUGHT_EXCEPTION,
                "warning retrieving x"));
        eb.add(new HpccError(HpccErrorLevel.INFO, HpccErrorType.SYSTEM, HpccErrorCode.INFO, "info about retrieving x"));

        try
        {
            throw new Exception("test exception");
        }
        catch (Exception e)
        {
            eb.add(new HpccError(HpccErrorLevel.FATAL, HpccErrorType.SYSTEM, HpccErrorCode.UNCAUGHT_EXCEPTION,
                    e.getMessage(), e));
        }

        eb.add(new HpccError(HpccErrorLevel.ERROR, HpccErrorType.UNKNOWN, HpccErrorCode.UNCAUGHT_EXCEPTION,
                "error message", "additional info", 31, // line number
                342, // column number
                "c:/test/compmod.ecl" // filename
        ));

        System.out.println(eb.toEclIdeString());
        System.out.println(eb.toString());

        assertEquals(eb.getErrors().size(), 3);
        assertEquals(eb.getWarnings().size(), 1);
        assertEquals(eb.getInfos().size(), 1);
        assertEquals(eb.getErrors(HpccErrorCode.UNCAUGHT_EXCEPTION).size(), 3);
        assertEquals(eb.getItems(HpccErrorLevel.WARNING, HpccErrorCode.UNCAUGHT_EXCEPTION).size(), 1);
    }

}
