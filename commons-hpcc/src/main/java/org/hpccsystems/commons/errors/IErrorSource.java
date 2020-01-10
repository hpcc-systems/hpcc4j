package org.hpccsystems.commons.errors;

/**
 * Interface defining an error code.
 * <p>
 * An error code is defined as having a name and a numeric (integer) value
 * </p>
 */
public interface IErrorSource
{
    /**
     * <p>name.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    String name();

    /**
     * <p>getNumVal.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    Integer getNumVal();
}
