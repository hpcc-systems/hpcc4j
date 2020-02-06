package org.hpccsystems.commons.errors;

public enum HpccErrorCode implements IErrorCode
{

    UNCAUGHT_EXCEPTION (
            200
    ), INFO (
            300
    );

    private int numVal;

    /**
     * Instantiates a new hpcc error code.
     *
     * @param numVal
     *            the num val
     */
    HpccErrorCode(int numVal)
    {
        this.numVal = numVal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.commons.errors.IErrorCode#getNumVal()
     */
    public Integer getNumVal()
    {
        return numVal;
    }

}
