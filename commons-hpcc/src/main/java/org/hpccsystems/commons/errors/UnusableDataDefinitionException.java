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
package org.hpccsystems.commons.errors;

/**
 * This exception is thrown with the data definition cannot be
 * used to retrieve or describe the data.  The caller will need
 * to use a different file.
 */
public class UnusableDataDefinitionException extends Exception {
  /**
   * @param message a message explaining the condition
   */
  public UnusableDataDefinitionException(String message) {
    super(message);
  }
  /**
   * @param cause
   */
  /**
   * @param message a message explaining the condition
   * @param cause an exception that motivated this exception
   */
  public UnusableDataDefinitionException(String message, Throwable cause) {
    super(message, cause);
  }

}
