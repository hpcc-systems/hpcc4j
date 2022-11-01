package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: RelatedIndexSetWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.406Z
 */
public class RelatedIndexSetWrapper
{
    protected String local_fileName;
    protected Indexes_type0Wrapper local_indexes;

    public RelatedIndexSetWrapper() {}

    public RelatedIndexSetWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet relatedindexset)
    {
        copy( relatedindexset );
    }
    public RelatedIndexSetWrapper( String _fileName, Indexes_type0Wrapper _indexes )
    {
        this.local_fileName = _fileName;
        this.local_indexes = _indexes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet raw )
    {
        if (raw == null)
            return;

        this.local_fileName = raw.getFileName();
        if (raw.getIndexes() != null)
            this.local_indexes = new Indexes_type0Wrapper( raw.getIndexes());

    }

    @Override
    public String toString()
    {
        return "RelatedIndexSetWrapper [" + "fileName = " + local_fileName + ", " + "indexes = " + local_indexes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet();
        raw.setFileName( local_fileName);
        if (local_indexes != null)
            raw.setIndexes( local_indexes.getRaw());
        return raw;
    }


    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setIndexes( Indexes_type0Wrapper _indexes )
    {
        this.local_indexes = _indexes;
    }
    public Indexes_type0Wrapper getIndexes( )
    {
        return this.local_indexes;
    }
}