package org.hpccsystems.commons.errors;

/**
 * A default (largely useless) implementation of IErrorCode
 *
 * <p>If you don't need errorcodes to any extent this default implementation gives you 'something' you can pass into an HError.
 * In general you would use a far fuller one</p>
 * @see SaltErrorCode
 */
public enum HpccErrorCode implements IHpccErrorCode {
    
    UNCAUGHT_EXCEPTION(200),
    INFO(300);
    
    private int numVal;

    HpccErrorCode(int numVal) {
        this.numVal = numVal;
    }

    public Integer getNumVal() {
        return numVal;
    }

}
