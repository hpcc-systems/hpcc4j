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
 * Class name: QueryUsingFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.859Z
 */
public class QueryUsingFileWrapper
{
    protected String local_id;
    protected String local_package;

    public QueryUsingFileWrapper() {}

    public QueryUsingFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile queryusingfile)
    {
        copy( queryusingfile );
    }
    public QueryUsingFileWrapper( String _id, String _package )
    {
        this.local_id = _id;
        this.local_package = _package;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile raw )
    {
        if (raw == null)
            return;

        this.local_id = raw.getId();
        this.local_package = raw.getPackage();

    }

    @Override
    public String toString()
    {
        return "QueryUsingFileWrapper [" + "id = " + local_id + ", " + "package = " + local_package + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile();
        raw.setId( local_id);
        raw.setPackage( local_package);
        return raw;
    }


    public void setId( String _id )
    {
        this.local_id = _id;
    }
    public String getId( )
    {
        return this.local_id;
    }
    public void setPackage( String _package )
    {
        this.local_package = _package;
    }
    public String getPackage( )
    {
        return this.local_package;
    }
}