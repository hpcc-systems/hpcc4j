/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
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
package org.hpccsystems.dfs.client;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.FieldDef;

/**
 * Prune columns from the output request format.  Columns are pruned
 * that employ unsupported data types or that are not named by a column
 * selection parameter that has a list of columns.  The column
 * selection parameter string is a comma separated list of
 * field names.  Nested fields are selected with the usual
 * dot notation (e.g., foo.bar for the bar field in a foo field).
 * All columns are selected for a structure field when no columns are
 * specified (e.g., foo where foo is a record type).  Selection column
 * names that do not exist are ignored.  If the selection string does not
 * select any column, then all columns are returned unless dropped because
 * of unsupported data types.
 *
 * The output types for certain data types is adjusted in the screening
 * process.  For instance, the QSTRING compressed string is returned as a
 * string.
 */
public class ColumnPruner implements Serializable
{
    private final static long serialVersionUID = 1L;

    private class SelectedFieldInfo
    {
        String  name               = null;
        boolean shouldCullChildren = false;
    }

    private String                             fieldListString;
    private HashMap<String, SelectedFieldInfo> selectedFieldMap = null;

    /**
     * @return Project list in string format
    */
    public String getFieldListString()
    {
        return fieldListString;
    }

    /**
     * Contruct a pruner to remove fields from the output definition of a remote
     * read definition string.
     * @param commaSepFieldNamelist a comma separated list of field names.  Nested
     * fields are expressed using the normal compound name style with a dot (".")
     * separator.  For example, item1,foo.bar1,foo.bar2,item3, selects the item1,
     * item3 fields (which may be child datasets) and the bar1 and bar2 fields from
     * the foo child dataset field.
     */
    public ColumnPruner(String commaSepFieldNamelist)
    {
        this.fieldListString = commaSepFieldNamelist;

        // Create a map of selected fields by their path
        selectedFieldMap = new HashMap<String, SelectedFieldInfo>();
        String[] selectedFields = this.fieldListString.split(",");
        for (int i = 0; i < selectedFields.length; i++)
        {
            String fieldPath = selectedFields[i].trim();
            if (fieldPath.isEmpty())
            {
                continue;
            }

            String curPath = "";
            String[] pathComponents = fieldPath.split("\\.");
            for (int j = 0; j < pathComponents.length; j++)
            {
                String component = pathComponents[j].toLowerCase();
                if (j != 0)
                {
                    curPath += ".";
                }

                curPath += component.trim();

                SelectedFieldInfo fieldInfo = selectedFieldMap.get(curPath);
                if (fieldInfo == null)
                {
                    fieldInfo = new SelectedFieldInfo();
                    fieldInfo.name = component;
                    selectedFieldMap.put(curPath, fieldInfo);
                }

                boolean shouldCullChildren = (j < pathComponents.length - 1);
                fieldInfo.shouldCullChildren = fieldInfo.shouldCullChildren || shouldCullChildren;
            }
        }
    }

    /**
     * Prune the definition tokens to match the field list if
     * present and to remove unsupported types..
     * @param recordDef record definition to prune
     * @return the revised record definition
     * @exception Exception is thrown when none of the
     * fields in the selection list are defined.
     */
    public FieldDef pruneRecordDefinition(FieldDef originalRD) throws Exception
    {
        if (selectedFieldMap.size() == 0)
        {
            return originalRD;
        }

        ArrayList<FieldDef> selectedFields = new ArrayList<FieldDef>();
        for (int i = 0; i < originalRD.getNumDefs(); i++)
        {
            FieldDef childDef = originalRD.getDef(i);
            String fieldPath = childDef.getFieldName().trim().toLowerCase();

            FieldDef prunedFieldDef = pruneFieldDefinition(childDef, fieldPath);
            if (prunedFieldDef != null)
            {
                selectedFields.add(prunedFieldDef);
            }
        }

        FieldDef ret = new FieldDef(originalRD);
        ret.setDefs(selectedFields.toArray(new FieldDef[0]));
        if (ret.getNumDefs() == 0)
        {
            throw new Exception("Error pruning record defintion. No fields were selected for field list: " + this.fieldListString);
        }
        return ret;
    }

    private FieldDef pruneFieldDefinition(FieldDef originalRecordDef, String path)
    {
        SelectedFieldInfo fieldInfo = selectedFieldMap.get(path);
        if (fieldInfo == null)
        {
            return null;
        }

        if (fieldInfo.shouldCullChildren == false)
        {
            return originalRecordDef;
        }

        // Datasets are a special case. They will not have a component
        // in the field path to represent the dataset FieldDef. So we skip to its record
        if (originalRecordDef.getFieldType() == FieldType.DATASET)
        {
            FieldDef[] datasetRD = new FieldDef[1];
            datasetRD[0] = pruneFieldDefinition(originalRecordDef.getDef(0), path);

            FieldDef ret = new FieldDef(originalRecordDef);
            ret.setDefs(datasetRD);
            return ret;
        }

        ArrayList<FieldDef> selectedFields = new ArrayList<FieldDef>();
        for (int i = 0; i < originalRecordDef.getNumDefs(); i++)
        {
            FieldDef childDef = originalRecordDef.getDef(i);
            String fieldPath = path + "." + childDef.getFieldName().trim().toLowerCase();

            FieldDef prunedFieldDef = pruneFieldDefinition(childDef, fieldPath);
            if (prunedFieldDef != null)
            {
                selectedFields.add(prunedFieldDef);
            }
        }

        FieldDef ret = new FieldDef(originalRecordDef);
        ret.setDefs(selectedFields.toArray(new FieldDef[0]));
        return ret;
    }
}
