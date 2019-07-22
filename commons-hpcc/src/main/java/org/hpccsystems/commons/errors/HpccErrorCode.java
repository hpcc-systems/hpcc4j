package org.hpccsystems.commons.errors;

public enum HpccErrorCode implements IErrorCode
{

    UNCAUGHT_EXCEPTION(200), INFO(300);

    private int numVal;

    HpccErrorCode(int numVal)
    {
        this.numVal = numVal;
    }

    public Integer getNumVal()
    {
        return numVal;
    }

}
