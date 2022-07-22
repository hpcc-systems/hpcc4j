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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GraphNameAndTypes_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GraphNameAndTypes_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.834Z
 */
public class GraphNameAndTypes_type0Wrapper
{
    protected List<NameAndTypeWrapper> local_graphNameAndType = null;

    public GraphNameAndTypes_type0Wrapper() {}

    public GraphNameAndTypes_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GraphNameAndTypes_type0 graphnameandtypes_type0)
    {
        copy( graphnameandtypes_type0 );
    }
    public GraphNameAndTypes_type0Wrapper( List<NameAndTypeWrapper> _graphNameAndType )
    {
        this.local_graphNameAndType = _graphNameAndType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GraphNameAndTypes_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getGraphNameAndType() != null)
        {
            this.local_graphNameAndType = new ArrayList<NameAndTypeWrapper>();
            for ( int i = 0; i < raw.getGraphNameAndType().length; i++)
            {
                this.local_graphNameAndType.add(new NameAndTypeWrapper(raw.getGraphNameAndType()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "GraphNameAndTypes_type0Wrapper [" + "graphNameAndType = " + local_graphNameAndType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GraphNameAndTypes_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GraphNameAndTypes_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GraphNameAndTypes_type0();
        if (this.local_graphNameAndType!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType[this.local_graphNameAndType.size()];
            for ( int i = 0; i < this.local_graphNameAndType.size(); i++)
            {
                arr[i] = this.local_graphNameAndType.get(i) .getRaw();
            }
            raw.setGraphNameAndType(arr);
        }
        return raw;
    }


    public void setGraphNameAndType( List<NameAndTypeWrapper> _graphNameAndType )
    {
        this.local_graphNameAndType = _graphNameAndType;
    }
    public List<NameAndTypeWrapper> getGraphNameAndType( )
    {
        return this.local_graphNameAndType;
    }
}