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

/**
 * A filter to select records from a file or key.  The filter is conjunction of
 * field filters with each field having a list of one or more value ranges.
 *
 */
public class FileFilter implements Serializable {
  public static final long serialVersionUID = 1L;
  private String filterExpression;
  /**
   * A file filter to select records.
   */
  public FileFilter(FieldFilter[] fieldFilters) {
    this.filterExpression = makeExpression(fieldFilters);
  }
  /**
   * A file filter expression to select records, using a string.
   *
   * Warning: syntax is not checked.  Use with care.
   * @param expression a string version of the expression
   */
  public FileFilter(String expression) {
    this.filterExpression = expression;
  }
  /**
   * An empty filter, selects all records
   */
  public FileFilter() {
    this.filterExpression = "";
  }
  /**
   * A null filter which selects all records
   * @return an empty filter
   */
  static public FileFilter nullFilter() {
    return new FileFilter();
  }
  /**
   * Is this filter empty?
   * @return true when empty
   */
  public boolean isEmpty() { return this.filterExpression.length()==0; }
  /**
   * Make the JSON object for the filter expression
   * @return JSON object as a string (name : expression)
   */
  public String toJsonObject() {
    if (this.isEmpty()) return "";
    StringBuilder sb = new StringBuilder(this.filterExpression.length() + 30);
    sb.append("\"keyFilter\"  :  \"");
    sb.append(this.filterExpression);
    sb.append("\"");
    return sb.toString();
  }
  /**
   * Create an expression from an array of FieldFilter objects
   * @param fieldFilters the field filters
   * @return a string expression
   */
  static private String makeExpression(FieldFilter[] fieldFilters) {
    StringBuilder sb = new StringBuilder(200*fieldFilters.length);
    sb.append(fieldFilters[0].filterExpression());
    for (int i=1; i<fieldFilters.length; i++) {
      sb.append(",");
      sb.append(fieldFilters[i].filterExpression());
    }
    return sb.toString();
  }
}
