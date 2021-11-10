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
 * Class name: ArrayOfDFUDataColumnWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.225Z
 */
public class ArrayOfDFUDataColumnWrapper
{
    protected List<DFUDataColumnWrapper> local_dFUDataColumn = null;

    public ArrayOfDFUDataColumnWrapper() {}

    public ArrayOfDFUDataColumnWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn arrayofdfudatacolumn)
    {
        copy( arrayofdfudatacolumn );
    }
    public ArrayOfDFUDataColumnWrapper( List<DFUDataColumnWrapper> _dFUDataColumn )
    {
        this.local_dFUDataColumn = _dFUDataColumn;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUDataColumn() != null)
        {
            this.local_dFUDataColumn = new ArrayList<DFUDataColumnWrapper>();
            for ( int i = 0; i < raw.getDFUDataColumn().length; i++)
            {
                this.local_dFUDataColumn.add(new DFUDataColumnWrapper(raw.getDFUDataColumn()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUDataColumnWrapper [" + "dFUDataColumn = " + local_dFUDataColumn + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn();
        if (this.local_dFUDataColumn!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn[this.local_dFUDataColumn.size()];
            for ( int i = 0; i < this.local_dFUDataColumn.size(); i++)
            {
                arr[i] = this.local_dFUDataColumn.get(i) .getRaw();
            }
            raw.setDFUDataColumn(arr);
        }
        return raw;
    }


    public void setDFUDataColumn( List<DFUDataColumnWrapper> _dFUDataColumn )
    {
        this.local_dFUDataColumn = _dFUDataColumn;
    }
    public List<DFUDataColumnWrapper> getDFUDataColumn( )
    {
        return this.local_dFUDataColumn;
    }
}