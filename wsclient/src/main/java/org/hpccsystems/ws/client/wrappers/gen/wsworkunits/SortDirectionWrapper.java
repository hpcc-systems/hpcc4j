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
 * Class name: SortDirectionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class SortDirectionWrapper
{
    protected int local_sortDirection;

    public SortDirectionWrapper() {}

    public SortDirectionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection sortdirection)
    {
        copy( sortdirection );
    }
    public SortDirectionWrapper( int _sortDirection )
    {
        this.local_sortDirection = _sortDirection;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getSortDirection();

    }

    @Override
    public String toString()
    {
        return "SortDirectionWrapper [" + "sortDirection = " + local_sortDirection + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setSortDirection(sortDirection);
        return raw;
    }


    public void setSortDirection( int _sortDirection )
    {
        this.local_sortDirection = _sortDirection;
    }
    public int getSortDirection( )
    {
        return this.local_sortDirection;
    }
}