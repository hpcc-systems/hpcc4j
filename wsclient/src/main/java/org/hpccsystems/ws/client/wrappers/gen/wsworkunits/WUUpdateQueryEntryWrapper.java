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
 * Class name: WUUpdateQueryEntryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateQueryEntry
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:17Z
 */
public class WUUpdateQueryEntryWrapper
{
    protected String local_querySet;
    protected String local_queryId;
    protected String local_comment;

    public WUUpdateQueryEntryWrapper() {}

    public WUUpdateQueryEntryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateQueryEntry wuupdatequeryentry)
    {
        copy( wuupdatequeryentry );
    }
    public WUUpdateQueryEntryWrapper( String _querySet, String _queryId, String _comment )
    {
        this.local_querySet = _querySet;
        this.local_queryId = _queryId;
        this.local_comment = _comment;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateQueryEntry raw )
    {
        if (raw == null)
            return;

        this.local_querySet = raw.getQuerySet();
        this.local_queryId = raw.getQueryId();
        this.local_comment = raw.getComment();

    }

    @Override
    public String toString()
    {
        return "WUUpdateQueryEntryWrapper [" + "querySet = " + local_querySet + ", " + "queryId = " + local_queryId + ", " + "comment = " + local_comment + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateQueryEntry getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateQueryEntry raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdateQueryEntry();
        raw.setQuerySet( local_querySet);
        raw.setQueryId( local_queryId);
        raw.setComment( local_comment);
        return raw;
    }


    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
}