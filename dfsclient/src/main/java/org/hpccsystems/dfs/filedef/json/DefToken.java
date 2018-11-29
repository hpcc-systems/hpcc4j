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
package org.hpccsystems.dfs.filedef.json;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class DefToken {
  private final JsonToken tok;
  private final String whenString;
  private final double whenReal;
  private final long whenInteger;
  private final boolean whenBoolean;
  private final Integer parent;
  private final String name;
  private final int level;
  private final int position;
  /**
   * Make a revised copy, revising parent, level, and position.
   * @param base the original to be revised
   * @param newParent the new parent ordinal
   * @param newLvl the new level ordinal
   * @param newPos the new position ordinal
   */
  public DefToken(DefToken base, Integer newParent, int newLvl, int newPos) {
    this.tok = base.tok;
    this.parent = newParent;
    this.name = base.name;
    this.whenString = base.whenString;
    this.whenReal = base.whenReal;
    this.whenInteger = base.whenInteger;
    this.whenBoolean = base.whenBoolean;
    this.level = newLvl;
    this.position = newPos;
  }
  public DefToken(DefToken base, long newTypeOrLength) {
    if (base.tok!=JsonToken.VALUE_NUMBER_INT) {
      throw new IllegalArgumentException("Not an integer token");
    }
    this.tok = base.tok;
    this.parent = base.parent;
    this.name = base.name;
    this.whenString = base.whenString;
    this.whenReal = base.whenReal;
    this.whenInteger = newTypeOrLength;
    this.whenBoolean = base.whenBoolean;
    this.level = base.level;
    this.position = base.position;
  }
  // private constructors
  private DefToken(JsonToken tok, Integer parent, String name, int lvl, int pos) {
    this.tok = tok;
    this.parent = parent;
    this.name = name;
    this.whenString = "";
    this.whenReal = 0;
    this.whenInteger = 0;
    this.whenBoolean = false;
    this.level = lvl;
    this.position = pos;
  }
  private DefToken(JsonToken tok, Integer parent, String name, String s, int lvl,
                   int pos) {
    this.tok = tok;
    this.parent = parent;
    this.name = name;
    this.whenString = s;
    this.whenReal = 0;
    this.whenInteger = 0;
    this.whenBoolean = false;
    this.level = lvl;
    this.position = pos;
  }
  private DefToken(JsonToken tok, Integer parent, String name, double d, int lvl,
                    int pos) {
    this.tok = tok;
    this.parent = parent;
    this.name = name;
    this.whenString = "";
    this.whenReal = d;
    this.whenInteger = 0;
    this.whenBoolean = false;
    this.level = lvl;
    this.position = pos;
  }
  private DefToken(JsonToken tok, Integer parent, String name, long l, int lvl,
                   int pos) {
    this.tok = tok;
    this.parent = parent;
    this.name = name;
    this.whenString = "";
    this.whenReal = 0;
    this.whenInteger = l;
    this.whenBoolean = false;
    this.level = lvl;
    this.position = pos;
  }
  private DefToken(JsonToken tok, Integer parent, String name, boolean b, int lvl,
                  int pos) {
    this.tok = tok;
    this.parent = parent;
    this.name = name;
    this.whenString = "";
    this.whenReal = 0;
    this.whenInteger = 0;
    this.whenBoolean = b;
    this.level = lvl;
    this.position = pos;
  }
  // access methods
  /**
   * @return the JsonToken enumeration value
   */
  public JsonToken getToken() { return tok; }
  /**
   * Is this the object start:
   * @return this is an OBJECT_START token
   */
  public boolean isObjectStart() { return this.tok==JsonToken.START_OBJECT; }
  /**
   * Is this the end of an array
   * @return this is an END_ARRAY token
   */
  public boolean isArrayEnd() { return this.tok==JsonToken.END_ARRAY; }
  /**
   * Is this an array start?
   * @return this is an START_ARRAY token
   */
  public boolean isArrayStart() { return this.tok==JsonToken.START_ARRAY; }
  /**
   * @return the position in the array of the parent
   */
  public Integer getParent() { return parent; }
  /**
   * @return the name of this token
   */
  public String getName() { return name; }
  /**
   * @return the string value if token was a string
   */
  public String getString() { return whenString; }
  /**
   * The value in hex when the object is a string.
   * @return a hex string
   */
  public String getHexString() {
    return getHexString(this.whenString);
  }
  /**
   * The string value as hex.
   * @param s the string
   * @return the hex representation
   */
  public static String getHexString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<s.length(); i++) {
      sb.append(String.format("%04X ", s.codePointAt(i)));
    }
    return sb.toString();
  }
  /**
   * Does the value have any control caharacters?
   * @return
   */
  public boolean hasControlChar() {
    return hasControlChar(whenString);
  }
  /**
   * Dord the string s have any control characters?
   * @param s the string to check
   * @return true if control characters are found, false otherwise
   */
  static public boolean hasControlChar(String s) {
    for (int i=0; i<s.length(); i++) {
      if (Character.isISOControl(s.charAt(i))) return true;
    }
    return false;
  }
  /**
   * Copy the srting and replace control characters with escapes like
   * a "\u0001" string for a 0x00001 control character.
   * @param str the string to copy and escape
   * @return the escaped string
   */
  static public String escapeControls(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isISOControl(c)) {
        sb.append("\\u");
        sb.append(String.format("%04X", str.codePointAt(i)));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
  /**
   * @return the floating point value if the type was REAL
   */
  public double getReal() { return whenReal; }
  /**
   * @return the integer value if the value was an integer
   */
  public long getInteger() { return whenInteger; }
  /**
   * @return the boolean value if the token was a true or false
   */
  public boolean getBoolean() { return whenBoolean; }
  /**
   * @return the ordinal position of this token in the stream
   */
  public int getPosition() { return position; }
  /**
   * @return the depth level of this token in the tree
   */
  public int getLevel() { return level; }
  /**
   * Is this the first element of the object or array?
   * @return true when this is the first element of the object or array
   */
  public boolean isFirstElement() {
    return this.position == 0
        || this.position == this.parent+1;
  }
  /**
   * @return the token in human readable form.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(position);
    sb.append(": ");
    sb.append(level);
    sb.append(" ");
    sb.append(parent);
    sb.append(" ");
    sb.append(name);
    sb.append("=");
    sb.append(tok.toString());
    switch(tok) {
      case VALUE_NUMBER_INT:
        sb.append(" ");
        sb.append(Long.toString(whenInteger));
        break;
      case VALUE_NUMBER_FLOAT:
        sb.append(" ");
        sb.append(Double.toString(whenReal));
        break;
      case VALUE_STRING:
        sb.append(":");
        sb.append(whenString);
        if (this.hasControlChar()) {
          sb.append(" {");
          sb.append(this.getHexString());
          sb.append("}");
        }
        break;
      case VALUE_TRUE:
      case VALUE_FALSE:
        sb.append(" ");
        sb.append(Boolean.toString(whenBoolean));
        break;
      default:
        break;
    }
    return sb.toString();
  }
  public String toJson() {
    StringBuilder sb = new StringBuilder();
    if (this.tok==JsonToken.END_OBJECT) {
      sb.append("\n");
      for (int i=0; i<this.level; i++) sb.append("  ");
      sb.append("}");
    } else if (this.tok==JsonToken.END_ARRAY) {
      sb.append("\n");
      for (int i=0; i<this.level; i++) sb.append("  ");
      sb.append("]");
    } else if (this.tok==JsonToken.START_OBJECT) {
      sb.append( (this.isFirstElement())  ? "\n"  : ",\n");
      for (int i=0; i<this.level; i++) sb.append("  ");
      if (this.name!=null) {
        sb.append("\"");
        sb.append(this.name);
        sb.append("\"  : {");
      } else {
        sb.append("{");
      }
    } else if (this.tok==JsonToken.START_ARRAY) {
      sb.append( (this.isFirstElement())  ? "\n"  : ",\n");
      for (int i=0; i<this.level; i++) sb.append("  ");
      sb.append("\"");
      sb.append(this.name);
      sb.append("\" : [");
    } else {
      sb.append( (this.isFirstElement())  ? "\n"  : ",\n");
      for (int i=0; i<this.level; i++) sb.append("  ");
      sb.append("\"");
      sb.append(this.name);
      sb.append("\"  : \"");
      switch(tok) {
        case VALUE_NUMBER_INT:
          sb.append(Long.toString(this.whenInteger));
          break;
        case VALUE_NUMBER_FLOAT:
          sb.append(Double.toString(this.whenReal));
          break;
        case VALUE_STRING:
          sb.append(this.whenString);
          break;
        case VALUE_TRUE:
        case VALUE_FALSE:
          sb.append(Boolean.toString(this.whenBoolean));
          break;
        default:
          break;
      }
      sb.append("\"");
    }
    return sb.toString();
  }
  public static boolean pairedTypes(JsonToken open, JsonToken close) {
    return (open==JsonToken.START_OBJECT && close==JsonToken.END_OBJECT)
        || (open==JsonToken.START_ARRAY  && close==JsonToken.END_ARRAY);
  }
  /**
   * Parse the JSON encoded definition string into an array of
   * tokens.  The def string should never cause an IOException,
   * so if an IOException occurrs and Illegal Argument Exception
   * is thrown because nothing can be done.
   * @param def a string from an HPCC cluster with the record
   * layout information
   * @return an array of tokens
   * @throws JsonParseException
   */
  public static DefToken[] parseDefString(String def)
            throws JsonParseException {
    ArrayList<DefToken> tokens = new ArrayList<DefToken>();
    Integer parent = new Integer(-1);
    Deque<Integer> parent_stack = new ArrayDeque<Integer>();
    JsonFactory factory = new JsonFactory();
    JsonParser jp = null;
    JsonToken tok = null;
    try {
      jp = factory.createParser(def);
      tok = jp.nextValue();
      if (tok!=JsonToken.START_OBJECT) {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected Start Object, found ");
        sb.append(tok.toString());
        JsonLocation loc = jp.getTokenLocation();
        throw new JsonParseException(sb.toString(), loc);
      }
      DefToken curr = null;
      while (tok!=null) {
        if (tok==JsonToken.END_OBJECT || tok==JsonToken.END_ARRAY) {
          parent = parent_stack.pop();
        }
        String name = jp.getCurrentName();
        int lvl = parent_stack.size();
        int pos = tokens.size();
        switch (tok) {
          case VALUE_NUMBER_INT:
            curr = new DefToken(tok, parent, name, jp.getLongValue(), lvl, pos);
            break;
          case VALUE_NUMBER_FLOAT:
            curr = new DefToken(tok, parent, name, jp.getDoubleValue(), lvl, pos);
            break;
          case VALUE_TRUE:
          case VALUE_FALSE:
            curr = new DefToken(tok, parent, name, jp.getBooleanValue(), lvl, pos);
            break;
          case VALUE_STRING:
            String str = (DefToken.hasControlChar(jp.getText()))
                      ? DefToken.escapeControls(jp.getText())
                      : jp.getText();
            curr = new DefToken(tok, parent, name, str, lvl, pos);
            break;
          default:
            curr = new DefToken(tok, parent, name, lvl, pos);
        }
        tokens.add(curr);
        if (tok==JsonToken.START_OBJECT || tok==JsonToken.START_ARRAY) {
          parent_stack.push(parent);
          parent = new Integer(tokens.size()-1);
        }
        tok = jp.nextValue();
      }
    } catch (IOException e) {
      String msg = "JSON Parse triggered IO exception";
      throw new IllegalArgumentException(msg, e);
    }
    return tokens.toArray(new DefToken[0]);
  }
  /**
   * Renumber the token array after pruning.
   * @param toks the token array to be updated in place
   */
  public static void renumber(DefToken[] toks) {
    Integer parent = new Integer(-1);
    Deque<Integer> parent_stack = new ArrayDeque<Integer>();
    for (int i=0; i<toks.length; i++) {
      if (toks[i].tok==JsonToken.END_OBJECT || toks[i].tok==JsonToken.END_ARRAY) {
        parent = parent_stack.pop();
      }
      int lvl = parent_stack.size();
      toks[i] = new DefToken(toks[i], parent.intValue(), lvl, i);
      if (toks[i].tok==JsonToken.START_OBJECT || toks[i].tok==JsonToken.START_ARRAY) {
        parent_stack.push(parent);
        parent = new Integer(i);
      }
    }
  }
}
