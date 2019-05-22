package org.hpccsystems.commons.errors;

/**
 * Interface defining an error code.
 * <p>
 * An error code is defined as having a name and a numeric (integer) value
 * </p>
 */
public interface IErrorSource
{
    String name();

    Integer getNumVal();
}
