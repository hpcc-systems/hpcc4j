package org.hpccsystems.commons.errors;

/**
 * A default (largely useless) implementation of IErrorCode
 *
 * <p>If you don't need errorcodes to any extent this default implementation gives you 'something' you can pass into an HError.
 * In general you would use a far fuller one</p>
 * @see SaltErrorCode
 */
public enum HpccErrorSource implements IHpccErrorSource {
    
     COMMONS(100);

    private int numVal;

    HpccErrorSource(int numVal) {
        this.numVal = numVal;
    }

    public Integer getNumVal() {
        return numVal;
    }

}
