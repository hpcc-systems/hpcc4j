package org.hpccsystems.commons.errors;

/**
 * <p>HpccErrorSource class.</p>
 */
public enum HpccErrorSource implements IErrorSource
{

    COMMONS(100);

    private int numVal;

    HpccErrorSource(int numVal)
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
