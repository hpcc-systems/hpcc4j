package org.hpccsystems.commons.errors;

public enum HpccErrorSource implements IErrorSource
{

    COMMONS (
            100
    );

    private int numVal;

    /**
     * Instantiates a new hpcc error source.
     *
     * @param numVal
     *            the num val
     */
    HpccErrorSource(int numVal)
    {
        this.numVal = numVal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.commons.errors.IErrorSource#getNumVal()
     */
    public Integer getNumVal()
    {
        return numVal;
    }

}
