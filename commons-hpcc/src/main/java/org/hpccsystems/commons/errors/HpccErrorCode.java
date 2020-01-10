package org.hpccsystems.commons.errors;

/**
 * <p>HpccErrorCode class.</p>
 */
public enum HpccErrorCode implements IErrorCode
{

    UNCAUGHT_EXCEPTION(200), INFO(300);

    private int numVal;

    HpccErrorCode(int numVal)
    {
        this.numVal = numVal;
    }

    /**
     * <p>Getter for the field <code>numVal</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getNumVal()
    {
        return numVal;
    }

}
