/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2022 HPCC Systems®.
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
package org.hpccsystems.ws.client.utils;

/**
 * Unsupported operation on containerized HPCC environment.
 */
public class HpccContainerizedUnsupportedException extends Exception
{
    static public final long serialVersionUID = 1L;

    /**
     * A marker object for an exception during unsupported operation on containerized HPCC.
     */
    public HpccContainerizedUnsupportedException()
    {
    }

    /**
     * Instantiates a new HPCCContainerizedUnsupportedException.
     *
     * @param message
     *            the message
     */
    public HpccContainerizedUnsupportedException(String message)
    {
        super(message);
    }

    /**
     * Instantiates a new HPCCContainerizedUnsupportedException.
     *
     * @param cause
     *            the cause
     */
    public HpccContainerizedUnsupportedException(Throwable cause)
    {
        super(cause);
    }

    /**
     * Instantiates a new HPCCContainerizedUnsupportedException.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public HpccContainerizedUnsupportedException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * Instantiates a new HPCCContainerizedUnsupportedException.
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
    public HpccContainerizedUnsupportedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
