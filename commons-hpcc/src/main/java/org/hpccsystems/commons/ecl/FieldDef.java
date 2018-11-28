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
import java.util.Iterator;

/**
 * The name and field type for an item from the HPCC environment.  The
 * types may be single scalar types or may be arrays or structures.
 *
 */

public class FieldDef implements Serializable
{
  static final long serialVersionUID = 1L;
  private String fieldName = "";
  private FieldType fieldType = FieldType.UNKNOWN;
  private String typeName = FieldType.UNKNOWN.description();
  private FieldDef[] defs = new FieldDef[0];
  private HpccSrcType srcType = HpccSrcType.UNKNOWN;
  private int fields = 0;
  private int len = 0;
  private boolean fixedLength = false;
  private boolean isUnsigned = false;

  //
  protected FieldDef() {
  }
  /**
   * @param fieldName the name for the field or set or structure
   * @param fieldDef the type definition
   */
  public FieldDef(String fieldName, TypeDef typeDef) {
      this.fieldName = fieldName;
      this.fieldType = typeDef.getType();
      this.typeName = typeDef.description();
      this.defs = typeDef.getStructDef();
      this.srcType = typeDef.getSourceType();
      this.fields = this.defs.length;
      this.len = typeDef.getLength();
      this.fixedLength = typeDef.isFixedLength();
      this.isUnsigned = typeDef.isUnsigned();
  }
  /**
   * @param fieldName the name of the field
   * @param fieldType the FieldType value
   * @param typeName the name of this composite type
   * @param len the field length
   * @param isFixedLength len may be non-zero and variable
   * @param defs the array of fields composing this def
   */
  public FieldDef(String fieldName, FieldType fieldType, String typeName, long len,
      boolean isFixedLength, HpccSrcType styp, FieldDef[] defs) {
    if (len>Integer.MAX_VALUE) {
      StringBuilder sb = new StringBuilder();
      sb.append("Field length values too large for ");
      sb.append(fieldName);
      throw new IllegalArgumentException(sb.toString());
    }
    this.fieldName = fieldName;
    this.fieldType = fieldType;
    this.typeName = typeName;
    this.defs = defs;
    this.srcType = styp;
    this.fields = defs.length;
    this.fixedLength = isFixedLength;
    this.len = (int) len;
  }
  /**
   * the name of the field
   * @return the name
   */
  public String getFieldName() {
    return fieldName;
  }
  /**
   * the type of the field using the FieldType ENUM type.
   * @return the type as an enumeration value
   */
  public FieldType getFieldType() {
    return fieldType;
  }
  /**
   * Data type on the HPCC cluster.
   * @return type enumeration
   */
  public HpccSrcType getSourceType() { return this.srcType; }
  /**
   * Length of the data or minimum length if variable
   * @return length
   */
  public int getDataLen() { return this.len; }
  /**
   * Fixed or variable length
   * @return true when fixed length
   */
  public boolean isFixed() { return this.fixedLength; }
  /**
   * Is the underlying value type unsigned?
   * @return true when unsigned
   */
  public boolean isUnsigned() { return this.isUnsigned; }

  /**
   * A descriptive string showing the name and type.  When the
   * type is a composite, the composite definitions are included.
   * @return the string value
   */
  public String toString() {
    StringBuffer sb = new StringBuffer(this.fields*20 + 10);
    sb.append("FieldDef [fieldName=");
    sb.append(this.fieldName);
    sb.append(", ");
    sb.append((this.fixedLength) ? "F len="  : "V len=");
    sb.append(len);
    sb.append(" ");
    sb.append(this.srcType.toString());
    sb.append(", fieldType=");
    if (this.fieldType.isComposite()) {
      sb.append("{");
      sb.append(this.fields);
      sb.append("}{");
      for (int i=0; i<this.defs.length; i++) {
        if (i>0) sb.append("; ");
        sb.append(this.defs[i].toString());
      }
      sb.append("}");
    } else sb.append(this.typeName);
    sb.append("]");
    return sb.toString();
  }
  /**
   * The type name based upon the type enum with decorations for
   * composites.
   *@return the name of the type
   */
  public String typeName() {
    return (this.fieldType.isScalar() || this.fieldType.isVector())
        ? this.typeName
        : "RECORD(" + this.typeName + ")";
  }
  /**
   * Record name if this is a composite field
   * @return a blank name.
   */
  public String recordName() {
    return (this.fieldType.isComposite()) ? this.typeName : "";
  }
  /**
   * The number of fields, 1 or more if a record
   * @return number of fields.
   */
  public int getNumFields() { return this.fields; }
  /**
   * Number of field definitions.  Zero if this is not a record
   * @return number
   */
  public int getNumDefs() { return this.defs.length; }
  /**
   * Get the FieldDef at position.  Will throw an array out of bounds
   * exception.
   * @param ndx index position
   * @return the FieldDef object
   */
  public FieldDef getDef(int ndx) { return this.defs[ndx]; }
  /**
   * An iterator to walk though the type definitions that compose
   * this type.
   * @return an iterator returning FieldDef objects
   */
  public Iterator<FieldDef> getDefinitions() {
    final FieldDef[] defRef = this.defs;
    Iterator<FieldDef> rslt = new Iterator<FieldDef>() {
      int pos = 0;
      FieldDef[] copy = defRef;
      public boolean hasNext() {
        return (pos<copy.length)  ? true  : false;
      }
      public FieldDef next() {
        return copy[pos++];
      }
    };
    return rslt;
  }
}
