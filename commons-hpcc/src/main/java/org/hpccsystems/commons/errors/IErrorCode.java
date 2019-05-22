package org.hpccsystems.commons.errors;

/**
 * Interface defining an error code.
 * <p>
 * An error code is defined as having a name and a numeric (integer) value
 * </p>
 */
public interface IErrorCode
{

    String name();

    Integer getNumVal();
}
