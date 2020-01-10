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
/**
 *
 */
package org.hpccsystems.commons.errors;

import java.io.Serializable;

/**
 * Exception class for problems accessing files on an HPCC Cluster.
 *
 */
public class HpccFileException extends Exception implements Serializable
{
    static private final long serialVersionUID = 1L;

    /**
     * Empty constructor.
     */
    public HpccFileException()
    {
    }

    /**
     * <p>Constructor for HpccFileException.</p>
     *
     * @param message
     *            text explaining exception
     */
    public HpccFileException(String message)
    {
        super(message);
    }

    /**
     * <p>Constructor for HpccFileException.</p>
     *
     * @param cause
     *            An exception that has been remapped into an HPCC Exception
     */
    public HpccFileException(Throwable cause)
    {
        super(cause);
    }

    /**
     * <p>Constructor for HpccFileException.</p>
     *
     * @param message
     *            explanation of exception
     * @param cause
     *            generating exception
     */
    public HpccFileException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * <p>Constructor for HpccFileException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     * @param enableSuppression a boolean.
     * @param writableStackTrace a boolean.
     */
    public HpccFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}
