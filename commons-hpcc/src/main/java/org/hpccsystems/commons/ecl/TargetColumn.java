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
package org.hpccsystems.commons.ecl;

import java.io.Serializable;
import java.util.HashMap;


/**
 * A named column, which can have zero or more columns
 *
 */
public class TargetColumn implements Serializable {
  private final static long serialVersionUID = 1L;
  private String name;
  private boolean allColumns;
  private HashMap<String,TargetColumn> columns;
  /**
   * Null constructor for serialization.
   */
  protected TargetColumn() {
    this.name = "";
    this.allColumns = true;
    this.columns = null;
  }
  /**
   * Constructor for build process.  A simple column by default.
   * @param n
   */
  public TargetColumn(String n) {
    this.name = n;
    this.allColumns = true;
    this.columns = null;
  }
  /**
   * The column name of this column.
   * @return the column name
   */
  public String getName() { return this.name; }
  /**
   * Column has a column with name or is all columns
   * @param name
   * @return true when name is known or is all columns
   */
  public boolean hasColumnWithName(String name) {
    return this.allColumns || columns.containsKey(name);
  }
  /**
   * The columns (if any) that make up this column.  Most of the time a
   * column holds scalar values or arrays of scalar values.  A column can
   * hold child datasets or a single record.  In this case, there will be
   * columns that make up this complex column.
   * @return An array of columns or an empty array if this column is simple.
   */
  public TargetColumn[] getColumns() {
    return (this.allColumns) ? new TargetColumn[0]
                             : columns.values().toArray(new TargetColumn[0]);
  }
  /**
   * Get the column with this name or create one if this column does not have
   * a column with the supplied name.
   * @param name the column name of interest
   * @return the TargetName object for the named column
   */
  public TargetColumn getOrCreateColumnWithName(String name) {
    if (this.columns==null) {
      this.allColumns = false;
      this.columns = new HashMap<String,TargetColumn>();
    }
    if (this.columns.containsKey(name)) return this.columns.get(name);
    TargetColumn cn = new TargetColumn(name);
    columns.put(name,cn);
    return cn;
  }
  /**
   * Does this name have selected columns of interest
   * @return true if this is a simple column or if all columns are targets
   */
  public boolean allFields() { return this.allColumns; }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.name);
    if (!this.allColumns) {
      sb.append("[");
      for (TargetColumn col : this.columns.values()) {
        sb.append(col.toString());
        sb.append(";");
      }
      sb.append("]");
    }
    return sb.toString();
  }
}