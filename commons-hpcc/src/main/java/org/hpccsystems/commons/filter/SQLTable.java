package org.hpccsystems.commons.filter;

/*******************************************************************************
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
 *******************************************************************************/

public class SQLTable
{
    private String name;
    private String alias;

    /**
     * Instantiates a new SQL table.
     *
     * @param name
     *            the name
     * @param a
     *            the a
     */
    public SQLTable(String name, String a)
    {
        this.name = name;
        this.alias = name;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the alias.
     *
     * @return the alias
     */
    public String getAlias()
    {
        return alias;
    }

    /**
     * Sets the alias.
     *
     * @param alias
     *            the new alias
     */
    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    /**
     * Translate if alias.
     *
     * @param possibleAlias
     *            the possible alias
     * @return the string
     */
    public String translateIfAlias(String possibleAlias)
    {
        if (possibleAlias.equals(alias) || possibleAlias.equals(name))
            return name;
        else
            return null;
    }
}
