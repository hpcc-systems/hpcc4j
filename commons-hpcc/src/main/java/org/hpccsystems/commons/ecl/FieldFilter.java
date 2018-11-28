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
 * A field filter.  Consists of a field name and a list of one or
 * more alternative value ranges.
 */
public class FieldFilter implements Serializable {
  public static final long serialVersionUID = 1L;
  private String name;
  private FieldFilterRange[] ranges;
  private short prefix;
  /**
   * A field filter.
   * @param fieldName
   * @param filterRanges
   */
  public FieldFilter(String fieldName, FieldFilterRange[] filterRanges) {
    this(fieldName, filterRanges, (short)0);
  }
  /**
   * A field filter that checks only a prefix of of the field.
   * @param fieldName the name of a field, can be a compound name.
   * @param filterRanges the list of alternative values
   * @param prefixMatchLength length for the test, zero means entire field
   */
  public FieldFilter(String fieldName, FieldFilterRange[] filterRanges,
      short prefixMatchLength) {
    this.name = fieldName;
    this.ranges = new FieldFilterRange[filterRanges.length];
    for (int i=0; i<this.ranges.length; i++) {
      this.ranges[i] = filterRanges[i];
    }
    this.prefix = prefixMatchLength;
  }
  /**
   * A wild card field filter.
   * @param fieldName the field name
   */
  public FieldFilter(String fieldName) {
    this.name = fieldName;
    this.ranges = new FieldFilterRange[0];
    this.prefix = 0;
  }
  /**
   * A string suitable for inclusion into a JSON request
   * @return the filter expression in string form
   */
  public String filterExpression() {
    StringBuilder sb = new StringBuilder(20+this.name.length()+50*ranges.length);
    sb.append(this.name);
    if (this.ranges.length==0) {
      sb.append("*");
    } else if (this.prefix>0) {
      sb.append(":");
      sb.append(Short.toString(this.prefix));
    }
    if (this.ranges.length>0) {
      sb.append("=");
      sb.append(this.ranges[0].filterExpression());
      for (int i=1; i<this.ranges.length; i++) {
        sb.append(",");
        sb.append(this.ranges[i].filterExpression());
      }
    }
    return sb.toString();
  }
  /**
   * the field name
   */
  public String getFieldName() { return this.name; }
  /**
   * The sumber of ranges used in this filter.
   */
  public int getRangeCount() { return this.ranges.length; }
  /*
   * (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() { return this.filterExpression(); }
}
