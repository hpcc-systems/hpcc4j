package org.hpccsystems.ws.client.wrappers;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Generated Axis2 ADB stub class wrapper
 * Class name: ExceptionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Exceptions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-03T01:15:45.838Z
 */

public class ExceptionsWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;

    /**
     * Instantiates a new exceptions wrapper.
     */
    public ExceptionsWrapper()
    {
    }

    /**
     * Instantiates a new exceptions wrapper.
     *
     * @param exceptions
     *            the exceptions
     */
    public ExceptionsWrapper(ExceptionsWrapper exceptions)
    {
        copy(exceptions);
    }

    /**
     * Instantiates a new exceptions wrapper.
     *
     * @param _exceptions
     *            the exceptions
     */
    public ExceptionsWrapper(ArrayOfEspExceptionWrapper _exceptions)
    {
        this.local_exceptions = _exceptions;

    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(ExceptionsWrapper raw)
    {
        this.local_exceptions = new ArrayOfEspExceptionWrapper(raw.getExceptions());
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ExceptionsWrapper [" + "exceptions = " + local_exceptions + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public ExceptionsWrapper getRaw()
    {
        ExceptionsWrapper raw = new ExceptionsWrapper();
        return raw;
    }

    /**
     * Sets the exceptions.
     *
     * @param _exceptions
     *            the new exceptions
     */
    public void setExceptions(ArrayOfEspExceptionWrapper _exceptions)
    {
        this.local_exceptions = _exceptions;
    }

    /**
     * Gets the exceptions.
     *
     * @return the exceptions
     */
    public ArrayOfEspExceptionWrapper getExceptions()
    {
        return this.local_exceptions;
    }
}
