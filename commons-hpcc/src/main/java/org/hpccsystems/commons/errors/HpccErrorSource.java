package org.hpccsystems.commons.errors;

public enum HpccErrorSource implements IErrorSource
{

    COMMONS(100);

    private int numVal;

    HpccErrorSource(int numVal)
    {
        this.numVal = numVal;
    }

    public Integer getNumVal()
    {
        return numVal;
    }

}
