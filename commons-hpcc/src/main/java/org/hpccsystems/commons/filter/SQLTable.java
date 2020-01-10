package org.hpccsystems.commons.filter;

/**
 *****************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************
  */
public class SQLTable
{
    private String name;
    private String alias;

    /**
     * <p>Constructor for SQLTable.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @param a a {@link java.lang.String} object.
     */
    public SQLTable(String name, String a)
    {
        this.name = name;
        this.alias = name;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName()
    {
        return name;
    }

    /**
     * <p>Getter for the field <code>alias</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAlias()
    {
        return alias;
    }

    /**
     * <p>Setter for the field <code>alias</code>.</p>
     *
     * @param alias a {@link java.lang.String} object.
     */
    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    /**
     * <p>translateIfAlias.</p>
     *
     * @param possibleAlias a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String translateIfAlias(String possibleAlias)
    {
        if (possibleAlias.equals(alias) || possibleAlias.equals(name))
            return name;
        else
            return null;
    }
}
