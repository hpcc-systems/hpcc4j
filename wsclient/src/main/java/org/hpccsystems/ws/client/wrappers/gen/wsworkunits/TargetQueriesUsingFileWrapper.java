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
 * Class name: TargetQueriesUsingFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.872Z
 */
public class TargetQueriesUsingFileWrapper
{
    protected String local_target;
    protected String local_packageMap;
    protected ArrayOfQueryUsingFileWrapper local_queries;

    public TargetQueriesUsingFileWrapper() {}

    public TargetQueriesUsingFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile targetqueriesusingfile)
    {
        copy( targetqueriesusingfile );
    }
    public TargetQueriesUsingFileWrapper( String _target, String _packageMap, ArrayOfQueryUsingFileWrapper _queries )
    {
        this.local_target = _target;
        this.local_packageMap = _packageMap;
        this.local_queries = _queries;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_packageMap = raw.getPackageMap();
        if (raw.getQueries() != null)
            this.local_queries = new ArrayOfQueryUsingFileWrapper( raw.getQueries());

    }

    @Override
    public String toString()
    {
        return "TargetQueriesUsingFileWrapper [" + "target = " + local_target + ", " + "packageMap = " + local_packageMap + ", " + "queries = " + local_queries + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile();
        raw.setTarget( local_target);
        raw.setPackageMap( local_packageMap);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setPackageMap( String _packageMap )
    {
        this.local_packageMap = _packageMap;
    }
    public String getPackageMap( )
    {
        return this.local_packageMap;
    }
    public void setQueries( ArrayOfQueryUsingFileWrapper _queries )
    {
        this.local_queries = _queries;
    }
    public ArrayOfQueryUsingFileWrapper getQueries( )
    {
        return this.local_queries;
    }
}