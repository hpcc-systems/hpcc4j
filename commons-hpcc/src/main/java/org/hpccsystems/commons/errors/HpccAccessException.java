/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.hpccsystems.commons.errors;

/**
 * Non-specific exception accessing the HPCC cluster.
 *
 */
public class HpccAccessException extends Exception
{
    /** Constant <code>serialVersionUID=1L</code> */
    static public final long serialVersionUID = 1L;

    /**
     * A marker object for an exception during the access of an HPCC based file.
     */
    public HpccAccessException()
    {
    }

    /**
     * <p>Constructor for HpccAccessException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public HpccAccessException(String message)
    {
        super(message);
    }

    /**
     * <p>Constructor for HpccAccessException.</p>
     *
     * @param cause a {@link java.lang.Throwable} object.
     */
    public HpccAccessException(Throwable cause)
    {
        super(cause);
    }

    /**
     * <p>Constructor for HpccAccessException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     */
    public HpccAccessException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * <p>Constructor for HpccAccessException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     * @param enableSuppression a boolean.
     * @param writableStackTrace a boolean.
     */
    public HpccAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
