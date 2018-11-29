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

import java.io.Serializable;
import java.util.ArrayList;

import org.hpccsystems.commons.ecl.TargetColumn;
import org.hpccsystems.commons.errors.UnusableDataDefinitionException;


/**
 * Abstract class to map a DefToken sequence.
 */
public abstract class DefEntry implements Serializable {
  static final long serialVersionUID = 1L;
  public static final String FIELDS = "fields";     // root and type objects
  public static final String CHILD = "child";       // type objects
  public static final String NAME = "name";         // field entry
  public static final String TYPE = "type";         // field entry
  public static final String LENGTH = "length";     // type object
  public static final String FIELDTYPE = "fieldType";//type object
  public static final String FLAGS = "flags";       // field entry
  private String name;
  private int beginPosition;
  private int endPosition;
  private int parentPosition;
  /**
   * Normal constructor.  Positions are provided by setter methods.
   * @param n the name of the object or the empty string if unnamed.
   * @param begin the first token position
   * @param end the last token position
   * @param the parent token position
   */
  protected DefEntry(String n, int begin, int end, int parent) {
    this.name = n;
    this.beginPosition = begin;
    this.endPosition = end;
    this.parentPosition = parent;
  }
  /**
   * Append these possibly revised tokens to the ArrayList.
   * @param toksNew the ArrayList to be updated
   * @param toksInput the original tokens
   */
  public abstract void toTokens(ArrayList<DefToken> toksNew, DefToken[] toksInput);
  /**
   * A readable version of the object
   * @return the readable information.
   */
  public abstract String toString();
  /**
   * Is this entry suppressed?  Some data types found on the HPCCSystems
   * platform are not supported.  For example, an Alien Datatype is not
   * supported because the data access definitions are not transportable code.
   * @return true if this entry is suppressed.
   */
  public abstract boolean isSuppressed();
  /**
   * Mark the entry as suppressed.
   */
  public abstract void suppressEntry();
 /**
   * the object name or the empty string if unnamed
   * @return the name
   */
  public String getName() { return this.name; }
  /**
   * Get the ordinal position of the DefToken that begins this object
   * @return the position
   */
  public int getBeginPosition() { return beginPosition; }
  /**
   * The ordinal position of the last DefToken for this object.
   * @return ordinal position of end
   */
  public int getEndPosition() { return endPosition; }
  /**
   * The parent identifier, an ordinal position of the parent
   * @return the parent identifier
   */
  public int getParent() { return this.parentPosition; }
  /**
   * The number of DefToken entries for this DefEntry.
   * @return the underlying token count
   */
  public int getTokenCount() { return this.endPosition-this.beginPosition+1; }
  /**
   * Prune the DefToken sequence with the TargetColumn information.
   * @param toks the source data definition
   * @param tc the root column definition
   * @return the pruned sequence of tokens.
   * @throws UnusableDataDefinitionException when the token sequence is unexpected
   * or when all of the target columns are not present.
   */
  public static DefToken[] pruneDefTokens(DefToken[] toks, TargetColumn tc) throws UnusableDataDefinitionException {
    DefEntryRoot root = new DefEntryRoot(toks);
    root.countUse(tc);
    ArrayList<DefToken> work_list = new ArrayList<DefToken>();
    root.toTokens(work_list, toks);
    DefToken[] pruned_toks = work_list.toArray(new DefToken[0]);
    DefToken.renumber(pruned_toks);
    return pruned_toks;
  }
  //
  protected static int getTokenCount(DefToken[] toks, int startPos)
      throws UnusableDataDefinitionException {
    int curr_level = toks[startPos].getLevel();
    int tokenCount = 1;
    while (startPos+tokenCount < toks.length
         && curr_level<toks[startPos+tokenCount].getLevel()) {
      tokenCount++;
    }
    tokenCount++; // count the close
    if (startPos+tokenCount >= toks.length
        || !DefToken.pairedTypes(toks[startPos].getToken(),
                                toks[startPos+tokenCount-1].getToken())) {
      StringBuilder sb = new StringBuilder();
      sb.append("No close for ");
      sb.append(toks[startPos].toString());
      throw new UnusableDataDefinitionException(sb.toString());
    }
    return tokenCount;
  }
  protected static boolean hasFields(DefToken[] toks, int startPos, int tokCount) {
    for (int i=startPos; i<startPos+tokCount; i++) {
      if (toks[i].getName().equals(FIELDS)) return true;
    }
    return false;
  }
}
