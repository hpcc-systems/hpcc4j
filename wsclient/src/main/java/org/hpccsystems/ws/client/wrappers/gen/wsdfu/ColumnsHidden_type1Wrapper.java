package org.hpccsystems.ws.client.wrappers.gen.wsdfu;

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
 * Class name: ColumnsHidden_type1Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type1
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class ColumnsHidden_type1Wrapper
{
    protected List<DFUDataColumnWrapper> local_columnHidden = null;

    public ColumnsHidden_type1Wrapper() {}

    public ColumnsHidden_type1Wrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type1 columnshidden_type1)
    {
        copy( columnshidden_type1 );
    }
    public ColumnsHidden_type1Wrapper( List<DFUDataColumnWrapper> _columnHidden )
    {
        this.local_columnHidden = _columnHidden;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type1 raw )
    {
        if (raw == null)
            return;

        if (raw.getColumnHidden() != null)
        {
            this.local_columnHidden = new ArrayList<DFUDataColumnWrapper>();
            for ( int i = 0; i < raw.getColumnHidden().length; i++)
            {
                this.local_columnHidden.add(new DFUDataColumnWrapper(raw.getColumnHidden()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ColumnsHidden_type1Wrapper [" + "columnHidden = " + local_columnHidden + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type1 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type1 raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type1();
        if (this.local_columnHidden!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn[this.local_columnHidden.size()];
            for ( int i = 0; i < this.local_columnHidden.size(); i++)
            {
                arr[i] = this.local_columnHidden.get(i) .getRaw();
            }
            raw.setColumnHidden(arr);
        }
        return raw;
    }


    public void setColumnHidden( List<DFUDataColumnWrapper> _columnHidden )
    {
        this.local_columnHidden = _columnHidden;
    }
    public List<DFUDataColumnWrapper> getColumnHidden( )
    {
        return this.local_columnHidden;
    }
}