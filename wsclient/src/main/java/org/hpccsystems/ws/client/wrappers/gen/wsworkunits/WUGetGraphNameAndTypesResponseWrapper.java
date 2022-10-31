package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: WUGetGraphNameAndTypesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.536Z
 */
public class WUGetGraphNameAndTypesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected GraphNameAndTypes_type0Wrapper local_graphNameAndTypes;

    public WUGetGraphNameAndTypesResponseWrapper() {}

    public WUGetGraphNameAndTypesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypesResponse wugetgraphnameandtypesresponse)
    {
        copy( wugetgraphnameandtypesresponse );
    }
    public WUGetGraphNameAndTypesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, GraphNameAndTypes_type0Wrapper _graphNameAndTypes )
    {
        this.local_exceptions = _exceptions;
        this.local_graphNameAndTypes = _graphNameAndTypes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getGraphNameAndTypes() != null)
            this.local_graphNameAndTypes = new GraphNameAndTypes_type0Wrapper( raw.getGraphNameAndTypes());

    }

    @Override
    public String toString()
    {
        return "WUGetGraphNameAndTypesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "graphNameAndTypes = " + local_graphNameAndTypes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_graphNameAndTypes != null)
            raw.setGraphNameAndTypes( local_graphNameAndTypes.getRaw());
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
    public void setGraphNameAndTypes( GraphNameAndTypes_type0Wrapper _graphNameAndTypes )
    {
        this.local_graphNameAndTypes = _graphNameAndTypes;
    }
    public GraphNameAndTypes_type0Wrapper getGraphNameAndTypes( )
    {
        return this.local_graphNameAndTypes;
    }
}