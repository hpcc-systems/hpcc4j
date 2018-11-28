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
/**
 *
 */
package org.hpccsystems.commons.ecl;

import java.io.Serializable;

/**
 * The data types for data fields on an HPCC record.
 *
 */
public enum FieldType implements Serializable {
  INTEGER(true, "Integer", false),
  REAL(true, "Real", false),
  DECIMAL(true,"Decimal",false),
  VAR_STRING(true,"VarString",false),
  STRING(true, "String", false),
  BOOLEAN(true, "Boolean", false),
  BINARY(true, "Binary data", false),
  RECORD(false, "Record", true),
  SET(false, "Set", false),             // Set & Dataset are separate because set has a preceding unused byte 
  DATASET(false, "Set", false),
  UNKNOWN(true, "Unknown", false);

  static final long serialVersionUID = 1L;
  private boolean scalar;
  private String name;
  private boolean composite;
  /**
   * A FieldType enumeration value.  Sets of primitives are not
   * atomic and not composites.  Records and Record Sets are not
   * atomic but are composites.  Primitives are atomic and not
   * composites.  The primitive types are Boolean, Integer, String,
   * and Real.
   *
   * The UNKNOWN type is used when the type information
   * handled in the TypeDef class is not understood.  Possible
   * underlying types that are not understood include the Foreign
   * data types, QSTRING, bit fields, ECL ENUM.
   * @param atomicType is an atomic value, a primitive value
   * @param name the descriptive name of the this value
   * @param composite is this a structure
   */
  FieldType(boolean atomicType, String name, boolean composite) {
    this.scalar = atomicType;
    this.name = name;
    this.composite = composite;
  }
  /**
   * default constructor for serialization support.
   */
  FieldType() {
    this.scalar = true;
    this.name = "";
    this.composite = false;
  }
  /**
   * Is this a primitive scalar type
   */
  public boolean isScalar() { return this.scalar; }
  /**
   * Is this a set of scalars?
   */
  public boolean isVector() { return !this.scalar && !this.composite; }
  /**
   * Is this a record or a set of records
   */
  public boolean isComposite() { return this.composite; }
  /**
   * Description of the type.
   * @return a descriptive string
   */
  public String description() {
    return name;
  }
}
