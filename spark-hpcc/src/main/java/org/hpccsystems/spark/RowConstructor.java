/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.spark;

import org.apache.spark.sql.catalyst.expressions.GenericRowWithSchema;

import net.razorvine.pickle.IObjectConstructor;
import net.razorvine.pickle.PickleException;

public class RowConstructor implements IObjectConstructor
{

    public RowConstructor() {}

    @Override
    public Object construct(Object[] tupleFields) throws PickleException
    {
        // PySpark Rows consist of two properties. An ArrayList of field names and Object[] array of field values.
        if (tupleFields.length != 2)
        {
            throw new PickleException("Unexpected Row data layout.");
        }

        Object[] rowFields = (Object[]) tupleFields[1];
        return new GenericRowWithSchema(rowFields,null);
    }
}
