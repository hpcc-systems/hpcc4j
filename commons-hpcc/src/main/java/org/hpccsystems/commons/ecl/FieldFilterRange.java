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
 * A filter value range.  Used to construct a range (open or closed on either end)
 * of values for filtering records.  The value range can be a single value for
 * an equality filter.
 */
public class FieldFilterRange implements Serializable {
  /**
   * The Lower, Upper, Both, Unbounded are the possibilities for
   * bounding the range.
   */
  public enum Bound implements Serializable {
    LOWER, UPPER, BOTH, NONE;
  }
  public static final long serialVersionUID = 1L;
  private String[] values;
  private boolean leftOpen;
  private boolean rightOpen;
  private boolean number;
  private boolean set;
  private Bound bound;
  /**
   * Use for single value ranges.
   * @param v the value
   * @param leftOpen true when the left is an open interval value
   * @param rightOpen true when the right is an open interval value
   * @param numeric_target the field under compare is numeric
   */
  public FieldFilterRange(String v, Bound rangeBound,
      boolean leftRangeOpen, boolean rightRangeOpen, boolean numeric_target) {
    this.values = new String[1];
    this.values[0] = v;
    this.bound = rangeBound;
    this.leftOpen = leftRangeOpen;
    this.rightOpen = rightRangeOpen;
    this.number = numeric_target;
    this.set = false;
  }
  /**
   * Use for bounded range.
   * @param low
   * @param high
   * @param leftRangeOpen
   * @param rightRangeOpen
   * @param numeric_target
   */
  public FieldFilterRange(String low, String high,
      boolean leftRangeOpen, boolean rightRangeOpen, boolean numeric_target) {
    this.bound = Bound.BOTH;
    this.values = new String[2];
    this.values[0] = low;
    this.values[1] = high;
    this.leftOpen = leftRangeOpen;
    this.rightOpen = rightRangeOpen;
    this.set = false;
    this.number = numeric_target;
  }
  /**
   * Use for a set of discrete values
   * @param valueList
   * @param numeric_target
   */
  public FieldFilterRange(String[] valueList, boolean numeric_target) {
    this.leftOpen = false;
    this.rightOpen = false;
    this.number = numeric_target;
    this.values = new String[valueList.length];
    for (int i=0; i<this.values.length; i++) {
      this.values[i] = valueList[i];
    }
    this.bound = Bound.BOTH;
    this.set = true;
    this.number = numeric_target;
  }
  /**
   * Numeric equality.
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeEq(double v) {
    return new FieldFilterRange(Double.toString(v), Bound.BOTH, false, false, true);
  }
  /**
   * String value equality
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeEq(String v) {
    return new FieldFilterRange(v, Bound.BOTH, false, false, false);
  }
  /**
   * Numeric value inequality.
   * @param v the test value
   * @return the test ranges
   */
  static public FieldFilterRange makeNE(double v) {
    return new FieldFilterRange(Double.toString(v), Bound.NONE, true, true, true);
  }
  /**
   * String value inequality
   * @param v the test value
   * @return the test ranges
   */
  static public FieldFilterRange makeNE(String v) {
    return new FieldFilterRange(v, Bound.NONE, true, true, false);
  }
  /**
   * Numeric value less than
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeLT(double v) {
    return new FieldFilterRange(Double.toString(v), Bound.UPPER, true, true, true);
  }
  /**
   * String value less than
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeLT(String v) {
    return new FieldFilterRange(v, Bound.UPPER, true, true, false);
  }
  /**
   * Numeric value less or equal
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeLE(double v) {
    return new FieldFilterRange(Double.toString(v), Bound.UPPER, true, false, true);
  }
  /**
   * String value less or equal
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeLE(String v) {
    return new FieldFilterRange(v, Bound.UPPER, true, false, false);
  }
  /**
   * Numeric value greater than
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeGT(double v) {
    String sv = Double.toString(v);
    return new FieldFilterRange(sv, Bound.LOWER, true, true, true);
  }
  /**
   * String value greater than
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeGT(String v) {
    return new FieldFilterRange(v, Bound.LOWER, true, true, false);
  }
  /**
   * Numeric value greater or equal
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeGE(double v) {
    String sv = Double.toString(v);
    return new FieldFilterRange(sv, Bound.LOWER, false, true, true);
  }
  /**
   * String value greater or equal
   * @param v the test value
   * @return the test range
   */
  static public FieldFilterRange makeGE(String v) {
    return new FieldFilterRange(v, Bound.LOWER, false, true, false);
  }
  /**
   * The filter test range in appropriate syntax for the remote read engine.
   * @return the filter string
   */
  public String filterExpression() {
    StringBuilder sb = new StringBuilder(this.values.length*20);
    if (this.set) { // multiple range entries
      sb.append((this.number) ? "["  : "['");
      sb.append(this.values[0]);
      sb.append((this.number)  ? "]"  : "']");
      for (int i=1; i<this.values.length; i++) {
        sb.append((this.number)  ? ",["  : ",['");
        sb.append(this.values[i]);
        sb.append((this.number)  ? "]"  : "']");
      }
    } else {                                  // single range entry
      sb.append((this.leftOpen) ? "("  : "[");
      switch (this.bound) {
        case BOTH:
          sb.append((this.number) ? ""  : "'");
          sb.append(this.values[0]);
          sb.append((this.number) ? ""  : "'");
          break;
        case LOWER:
          sb.append((this.number) ? ""  : "'");
          sb.append(this.values[0]);
          sb.append((this.number) ? ","  : "',");
          break;
        case UPPER:
          sb.append((this.number) ? ","  : ",'");
          sb.append(this.values[0]);
          sb.append((this.number) ? ""  : "'");
          break;
        default:
          sb.append((this.number) ? ","  : ",'");
          sb.append(this.values[0]);
          sb.append((this.number) ? "),("  : "'),('");
          sb.append(this.values[0]);
          sb.append((this.number) ? ","  : "',");
      }
      sb.append((this.rightOpen) ? ")"  : "]");
    }
    return sb.toString();
  }
  /*
   * (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() { return this.filterExpression(); }
}
