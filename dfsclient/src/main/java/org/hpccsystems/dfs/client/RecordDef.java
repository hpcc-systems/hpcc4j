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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.TypeDef;
import org.hpccsystems.commons.errors.UnusableDataDefinitionException;
import org.hpccsystems.dfs.filedef.json.DefToken;


/**
 * HPCC record definition.  Includes HPCC record info strings and derived
 * Field Defs.
 *
 */
public class RecordDef implements Serializable {
  private static final long serialVersionUID = 1l;
  private String input_def;
  private FieldDef root;
  private String output_def;
  // flag values from eclhelper.hpp RtlFieldTypeMask enum definition
  final private static short flag_unknownsize = 1024;
  // type codes from rtlconst.hpp type_vals enum definition
  final private static short type_record = 13;
  final private static short type_vrecord = flag_unknownsize + type_record;
  // special constants
  private static final String fieldListName = "fields";
  private static final String fieldTypeName = "fieldType";
  private static final String fieldLengthName = "length";
  private static final String childName = "child";
  private static final String FieldNameName = "name";
  private static final String FieldTypeName = "type";

  /**
   * Empty constructor for serialization
   */
  public RecordDef() //changed from protected to private due to new packaging structure
  {
    this.root = null;
    this.output_def = "";
    this.input_def = "";
  }
  /**
   * Construct a record definition.  Normally used by the static
   * function parseJsonDef.
   * @param defThor the Json string used as the input definition for
   * the data on THOR.
   * @param defContent the Json string used to define the data to be
   * sent to this client.
   * @param root the definition parsed into FieldDef objects.  The input
   * is the root definition for the record.
   */
  public RecordDef(String defThor, String defContent, FieldDef root) {
    this.input_def = defThor;
    this.output_def = defContent;
    this.root = root;
  }
  
  /**
   * Pick up a field definition from the JSON record definiton string.
   * The definitions are objects in the fields JSON array pair.  The
   * objects have name, type name, flags, and xpath pairs.  The flags
   * and xpath pairs are ignored.
   *
   * Start with a START_OBJECT and return on an END_OBJECT.  An exception
   * is thrown if not true or if name or type pairs are missing.
   *
   * @param first the first token in the sequence, must be START_OBJECT.
   * @param toks_iter an itreator of the tokens from a JSON record def string
   * @param type_dict the dictionary of types defined earlier in the string
   * @return the field defintion
   */
  public static FieldDef parseFieldDef(DefToken first, Iterator<DefToken> toks_iter, HashMap<String, TypeDef> type_dict) throws UnusableDataDefinitionException
  {
    if (first.getToken() != JsonToken.START_OBJECT) {
      StringBuilder sb = new StringBuilder();
      sb.append("Expected start of object, found ");
      sb.append(first.getToken().toString());
      throw new UnusableDataDefinitionException(sb.toString());
    }
    if (!toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("Early termination");
    }
    DefToken curr = toks_iter.next();
    String fieldName = "";
    String typeName = "";
    while(toks_iter.hasNext() && curr.getToken() != JsonToken.END_OBJECT) {
      if (FieldNameName.equals(curr.getName())) {
        fieldName = curr.getString();
      }
      if (FieldTypeName.equals(curr.getName())) {
        typeName = curr.getString();
      }
      curr = toks_iter.next();
    }
    if (!toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("Early termination");
    }
    if (fieldName.equals("") || typeName.equals("")) {
      throw new UnusableDataDefinitionException("Missing name or type pairs");
    }
    if (!type_dict.containsKey(typeName)) {
      StringBuilder sb = new StringBuilder();
      sb.append("Type name ");
      sb.append(typeName);
      sb.append(" used but not defined.");
      throw new UnusableDataDefinitionException(sb.toString());
    }
    TypeDef typ = type_dict.get(typeName);
    FieldDef rslt = new FieldDef(fieldName, typ);
    return rslt;
  }
  
  /**
   * Pick up a type definition from parsing a JSON string.  The type
   * definitions are object pairs.  The type definition object has pair
   * members named fieldType, length, child, and fields.  A fields pair
   * is an array of field definitions.
   * @param first the START_OBJECT token that starts the definition
   * @param toks_iter iterator of the tokens making up a JSON string
   * @param type_dict a dictionary of the types previously defined
   * @return the type definition from the tokens
   */
  public static TypeDef parseTypeDef(DefToken first, Iterator<DefToken> toks_iter,
      HashMap<String, TypeDef> type_dict)
    throws UnusableDataDefinitionException {
    if (first.getToken() != JsonToken.START_OBJECT) {
      StringBuilder sb = new StringBuilder();
      sb.append("Expected object start, found ");
      sb.append(first.toString());
      throw new UnusableDataDefinitionException(sb.toString());
    }
    if (!toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("Early termination");
    }
    String typeName = first.getName();
    long fieldType = 0;
    int length = 0;
    FieldDef[] fields = new FieldDef[0];
    DefToken curr = toks_iter.next();
    while (toks_iter.hasNext() && curr.getToken() != JsonToken.END_OBJECT) {
      if (fieldTypeName.equals(curr.getName())) {
        fieldType = curr.getInteger();
      } else if (fieldLengthName.equals(curr.getName())) {
        long rawLength = curr.getInteger();
        if (rawLength > Integer.MAX_VALUE || rawLength < 0) rawLength = 0;
        length = (int) rawLength;
      } else if (childName.equals(curr.getName())) {
        String name = curr.getString();
        if (!type_dict.containsKey(name)) {
          StringBuilder sb = new StringBuilder();
          sb.append("Type name ");
          sb.append(name);
          sb.append(" used but not defined.");
          throw new UnusableDataDefinitionException(sb.toString());
        }
        TypeDef child = type_dict.get(name);
        fields = new FieldDef[1];
        fields[0] = new FieldDef(name,child);

      } else if (fieldListName.equals(curr.getName())) {
        if (curr.getToken() != JsonToken.START_ARRAY) {
          StringBuilder sb = new StringBuilder();
          sb.append("Expected an array for fields, found ");
          sb.append(curr.getToken().toString());
          throw new UnusableDataDefinitionException(sb.toString());
        }
        if (!toks_iter.hasNext()) {
          throw new UnusableDataDefinitionException("Early termination");
        }
        ArrayList<FieldDef> field_list = new ArrayList<FieldDef>();
        curr = toks_iter.next();
        while (curr.getToken() != JsonToken.END_ARRAY
              && toks_iter.hasNext()) {
          FieldDef fieldDef = parseFieldDef(curr, toks_iter, type_dict);
          field_list.add(fieldDef);
          curr = toks_iter.next();
        }
        fields = field_list.toArray(new FieldDef[0]);
        if (!toks_iter.hasNext()) {
          throw new UnusableDataDefinitionException("Early termination");
        }
      }  // ignore unknown pairs
      curr = toks_iter.next();
    }
    if (!toks_iter.hasNext()) {
      new UnusableDataDefinitionException("Early object termination");
    }
    TypeDef rslt = new TypeDef(fieldType, typeName, length, fields);
    return rslt;
  }

  /**
   * Create a record definition object from the JSON definition
   * string.  We have a type definition object composed by one or
   * more type definition object pairs.  The top level type definition
   * has fieldType, length, and fields pairs.
   * @param defThor the JSON record type definition returned from WsDfu
   * @param cp a column pruner for selecting specific columns of datga
   * @return a new record definition
   */
  static public RecordDef fromJsonDef(String defThor, ColumnPruner cp)  throws UnusableDataDefinitionException
  {
    DefToken[] toks = new DefToken[0];
    try {
      toks = DefToken.parseDefString(defThor);
    } catch (JsonParseException e) {
      throw new UnusableDataDefinitionException("Failed to parse def", e);
    }
    toks = cp.pruneDefTokens(toks);
    StringBuilder def_sb = new StringBuilder();
    Iterator<DefToken> toks_iter = Arrays.asList(toks).iterator();
    while (toks_iter.hasNext()) {
      def_sb.append(toks_iter.next().toJson());
    }
    String defContent = def_sb.toString();
    toks_iter = Arrays.asList(toks).iterator();
    HashMap<String, TypeDef> types = new HashMap<String, TypeDef>();
    ArrayList<FieldDef> record_fields = new ArrayList<FieldDef>();
    // have an unnamed type definition object with 1 or more pairs of
    // type definition objects followed by a fieldType pair of Record Type,
    // a length pair, and a fields array pair of fields of the record
    if (!toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("Empty definition");
    }
    long len = 0;
    long type_id = 0;
    DefToken curr = toks_iter.next();
    if (curr.getToken() != JsonToken.START_OBJECT
        || curr.getName() != null) {
      StringBuilder sb = new StringBuilder();
      sb.append("Illegal start of definition. ");
      if (curr.getName() != null) sb.append("Named pair of type ");
      if (curr.getToken() != JsonToken.START_OBJECT) {
        sb.append(curr.getToken().toString());
      }
      sb.append(" found.");
      throw new UnusableDataDefinitionException(sb.toString());
    }
    // pick up the type definitions
    if (!toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("Early termination.");
    }
    curr = toks_iter.next();
    while (curr.getToken()==JsonToken.START_OBJECT && toks_iter.hasNext()) {
      TypeDef typedef = parseTypeDef(curr, toks_iter, types);
      types.put(typedef.getTypeName(), typedef);
      curr = toks_iter.next();
    }
    // pick up the field definitions, type, and length
    if (!toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("Early termination");
    }
    if (curr.getParent() != 0) {
      StringBuilder sb = new StringBuilder();
      sb.append("Unexpected content, not in the root object; found ");
      sb.append(curr.toString());
      throw new UnusableDataDefinitionException(sb.toString());
    }
    while (curr.getToken()!=JsonToken.END_OBJECT && toks_iter.hasNext()) {
      if (fieldListName.equals(curr.getName())
          && curr.getToken()==JsonToken.START_ARRAY) {
        curr = toks_iter.next();
        while (toks_iter.hasNext() && curr.getToken()!=JsonToken.END_ARRAY) {
          FieldDef fieldDef = parseFieldDef(curr, toks_iter, types);
          record_fields.add(fieldDef);
          curr = toks_iter.next();
        }
        if (!toks_iter.hasNext()) {
          throw new UnusableDataDefinitionException("Early termination");
        }
      } else if (fieldTypeName.equals(curr.getName())) {
        type_id = curr.getInteger();
        if (type_id != type_record && type_id != type_vrecord) {
          StringBuilder sb = new StringBuilder();
          sb.append("Bad value for type in root, found ");
          sb.append(curr.toString());
          throw new UnusableDataDefinitionException(sb.toString());
        }
      } else if (fieldLengthName.equals(curr.getName())) {
        len = curr.getInteger();
      }
      curr = toks_iter.next();
    }
    if (curr.getParent() != -1 || curr.getToken() != JsonToken.END_OBJECT) {
      StringBuilder sb = new StringBuilder();
      sb.append("Unexpected end record definition, found ");
      sb.append(curr.toString());
      throw new UnusableDataDefinitionException(sb.toString());
    }
    if (toks_iter.hasNext()) {
      throw new UnusableDataDefinitionException("More tokens but at end");
    }
    // create record def
    FieldDef root = new FieldDef("root", FieldType.RECORD, "none",
        len, type_id==type_record, HpccSrcType.UNKNOWN,
        record_fields.toArray(new FieldDef[0]));
    RecordDef rslt = new RecordDef(defThor, defContent, root);
    return rslt;
  }
  /**
   * The definition of the data for the remote file reader
   * @return the definition
   */
  public String getJsonInputDef() { return input_def; }
  /**
   * Get the JSON string that defines the output structure for the remote
   * reader.
   * @return the output definition
   */
  public String getJsonOutputDef() { return output_def; }
  /**
   * The record definition object
   * @return root definition
   */
  public FieldDef getRootDef() { return root; }
  /**
   * String display of the record definition.
   * @return the definition in display form
   */
  public String toString() {
    return "RECORD: " + root.toString();
  }
}
