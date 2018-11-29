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

import org.hpccsystems.commons.ecl.TargetColumn;
import org.hpccsystems.commons.errors.UnusableDataDefinitionException;
import org.hpccsystems.dfs.filedef.json.*;

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
public class ColumnPruner implements Serializable {
  private final static long serialVersionUID = 1L;
  private String fieldListString;
  private transient TargetColumn targetContentRoot;

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
  public ColumnPruner(String commaSepFieldNamelist) {
    this.fieldListString = commaSepFieldNamelist;
  }
  /**
   * Prune the definition tokens to match the field list if
   * present and to remove unsupported types..
   * @param toks the complete set of tokens
   * @return the revised set with the pruned fields and unused
   * type information removed.
   * @exception UnusableDataDefinitionException is thrown when none of the
   * fields in the selection list are defined.
   */
  public DefToken[] pruneDefTokens(DefToken[] toks) throws UnusableDataDefinitionException
  {
    if (targetContentRoot==null) prepPruner();
    DefToken[] rslt = DefEntry.pruneDefTokens(toks, targetContentRoot);
    return rslt;
  }
  /**
   * Get the TargetColumn for the root structure.
   * @return root target column container.
   */
  public TargetColumn getTargetColumn() {
    if (this.targetContentRoot==null) prepPruner();
    return this.targetContentRoot;
  }
  //
  private void prepPruner() {
    String[] compound_names = this.fieldListString.split(",");
    // if fieldListString was empty, then array has 0 entries
    for (int i=0; i<compound_names.length; i++) {
      compound_names[i] = compound_names[i].trim().toLowerCase();
    }
    Arrays.sort(compound_names);
    // now break the compound names down
    String[][] dot_names = new String[compound_names.length][];
    for (int i=0; i<compound_names.length; i++) {
      dot_names[i] = compound_names[i].split("\\.");  // pick off levels
    }
    this.targetContentRoot = new TargetColumn("");
    for (int i=0; i<compound_names.length; i++) {
      TargetColumn cn = this.targetContentRoot.getOrCreateColumnWithName(dot_names[i][0]);
      for (int j=1; j<dot_names[i].length; j++) {
        cn = cn.getOrCreateColumnWithName(dot_names[i][j]);
      }
    }
    // root object ready.  May be an "all fields" selection
  }
}
