package org.hpccsystems.commons.errors;

/**
 * Interface defining an error code.
 * <p>
 * An error code is defined as having a name and a numeric (integer) value
 * </p>
 */
public interface IErrorCode
{

    /**
     * Name.
     *
     * @return the string
     */
    String name();

    /**
     * Gets the num val.
     *
     * @return the num val
     */
    Integer getNumVal();
}
