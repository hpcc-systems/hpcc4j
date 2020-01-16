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
 */
public class HpccAccessException extends Exception
{
    static public final long serialVersionUID = 1L;

    /**
     * A marker object for an exception during the access of an HPCC based file.
     */
    public HpccAccessException()
    {
    }

    /**
     * Instantiates a new hpcc access exception.
     *
     * @param message
     *            the message
     */
    public HpccAccessException(String message)
    {
        super(message);
    }

    /**
     * Instantiates a new hpcc access exception.
     *
     * @param cause
     *            the cause
     */
    public HpccAccessException(Throwable cause)
    {
        super(cause);
    }

    /**
     * Instantiates a new hpcc access exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public HpccAccessException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * Instantiates a new hpcc access exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     * @param enableSuppression
     *            the enable suppression
     * @param writableStackTrace
     *            the writable stack trace
     */
    public HpccAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
