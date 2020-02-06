package org.hpccsystems.commons.errors;

/**
 * The severity of an error.
 */
public enum HpccErrorLevel
{
    FATAL, ERROR, WARNING, INFO;

    /**
     * Gets the error level.
     *
     * @param eclenum
     *            the eclenum
     * @return the error level
     */
    public static HpccErrorLevel getErrorLevel(int eclenum)
    {
        if (eclenum == 0)
        {
            return null;
        }
        switch (eclenum)
        {
            case 1:
            case 2:
                return HpccErrorLevel.WARNING;
            case 3:
            case 4:
                return HpccErrorLevel.ERROR;
            case 5:
                return HpccErrorLevel.FATAL;
            case 6:
                return HpccErrorLevel.INFO;
            default:
                return HpccErrorLevel.ERROR;
        }
    }
}
