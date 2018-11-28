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

/**
 * The type of the binary source data.
 */
public enum HpccSrcType {
  SINGLE_BYTE_CHAR("Single Byte Charset", false),
  UTF8("Unicode UTF8", false),
  UTF16BE("Unicode UTF16 big endian", true),
  UTF16LE("Unicode UTF16 little endian", true),
  BIG_ENDIAN("big endian", false),
  LITTLE_ENDIAN("little endian", false),
  BINARY_CODED_DECIMAL("Binary coded decimal", false),
  UNKNOWN("Unkown", false);
  //
  private String description;
  private boolean utf16;
  //
  HpccSrcType(String desc, boolean utf16_flag) {
    this.description = desc;
    this.utf16 = utf16_flag;
  }
  /**
   * Description of the enumeration value;
   * @return a description
   */
  public String getDescription() { return description; }
  /**
   * The data is UTF16
   * @return
   */
  public boolean isUTF16() { return utf16; }
}
