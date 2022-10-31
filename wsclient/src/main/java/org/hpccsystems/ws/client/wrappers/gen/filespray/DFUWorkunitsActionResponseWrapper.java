package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
 * Class name: DFUWorkunitsActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.813Z
 */
public class DFUWorkunitsActionResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_firstColumn;
    protected ArrayOfDFUActionResultWrapper local_dFUActionResults;

    public DFUWorkunitsActionResponseWrapper() {}

    public DFUWorkunitsActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse dfuworkunitsactionresponse)
    {
        copy( dfuworkunitsactionresponse );
    }
    public DFUWorkunitsActionResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _firstColumn, ArrayOfDFUActionResultWrapper _dFUActionResults )
    {
        this.local_exceptions = _exceptions;
        this.local_firstColumn = _firstColumn;
        this.local_dFUActionResults = _dFUActionResults;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_firstColumn = raw.getFirstColumn();
        if (raw.getDFUActionResults() != null)
            this.local_dFUActionResults = new ArrayOfDFUActionResultWrapper( raw.getDFUActionResults());

    }

    @Override
    public String toString()
    {
        return "DFUWorkunitsActionResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "firstColumn = " + local_firstColumn + ", " + "dFUActionResults = " + local_dFUActionResults + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setFirstColumn( local_firstColumn);
        if (local_dFUActionResults != null)
            raw.setDFUActionResults( local_dFUActionResults.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setFirstColumn( String _firstColumn )
    {
        this.local_firstColumn = _firstColumn;
    }
    public String getFirstColumn( )
    {
        return this.local_firstColumn;
    }
    public void setDFUActionResults( ArrayOfDFUActionResultWrapper _dFUActionResults )
    {
        this.local_dFUActionResults = _dFUActionResults;
    }
    public ArrayOfDFUActionResultWrapper getDFUActionResults( )
    {
        return this.local_dFUActionResults;
    }
}