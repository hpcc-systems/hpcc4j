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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: RelatedIndexSets_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSets_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class RelatedIndexSets_type0Wrapper
{
    protected List<RelatedIndexSetWrapper> local_relatedIndexSet = null;

    public RelatedIndexSets_type0Wrapper() {}

    public RelatedIndexSets_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSets_type0 relatedindexsets_type0)
    {
        copy( relatedindexsets_type0 );
    }
    public RelatedIndexSets_type0Wrapper( List<RelatedIndexSetWrapper> _relatedIndexSet )
    {
        this.local_relatedIndexSet = _relatedIndexSet;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSets_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getRelatedIndexSet() != null)
        {
            this.local_relatedIndexSet = new ArrayList<RelatedIndexSetWrapper>();
            for ( int i = 0; i < raw.getRelatedIndexSet().length; i++)
            {
                this.local_relatedIndexSet.add(new RelatedIndexSetWrapper(raw.getRelatedIndexSet()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "RelatedIndexSets_type0Wrapper [" + "relatedIndexSet = " + local_relatedIndexSet + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSets_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSets_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSets_type0();
        if (this.local_relatedIndexSet!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.RelatedIndexSet[this.local_relatedIndexSet.size()];
            for ( int i = 0; i < this.local_relatedIndexSet.size(); i++)
            {
                arr[i] = this.local_relatedIndexSet.get(i) .getRaw();
            }
            raw.setRelatedIndexSet(arr);
        }
        return raw;
    }


    public void setRelatedIndexSet( List<RelatedIndexSetWrapper> _relatedIndexSet )
    {
        this.local_relatedIndexSet = _relatedIndexSet;
    }
    public List<RelatedIndexSetWrapper> getRelatedIndexSet( )
    {
        return this.local_relatedIndexSet;
    }
}