/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
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

import java.util.HashMap;
import java.util.Set;

/**
 * Message collection and summarization class.
 *
 * Used to collect messages (errors/warning/informative) generated as part of a stream operation.
 * Messages can be summarized and reported post-stream, thereby avoiding potentially expensive
 * and repetitive I/O operations.
 */
public class StreamOperationMessages
{
    private HashMap<String, MessageCounter> map = new HashMap<>();
    private int totalMessageCount = 0;


    /**
     * Simple integer wrapper class
     * Used primarily as in-place counter within higher level containers
     *
     */
    class MessageCounter
    {
        private int m_count = 1;
        public void increment()
        {
            m_count++;
        }

        public int  getCount ()
        {
            return m_count;
        }
    }

    /**
     * @return Total messages reported
     */
    public int getTotalMessageCount()
    {
        return totalMessageCount;
    }

    /**
     * @return Total unique messages tracked
     */
    public int getEffectiveMessageCount()
    {
        return map.size();
    }

    /**
     * Adds message to stream operation message report
     *
     * @param message - Message to be reported to stream operation called
     *                  Message should be as detailed as possible. However
     *                  in extreme cases, unnecessarily unique messages can impact
     *                  resource consumption
     */
    public void addMessage(String message)
    {
        addMessage(message, null);
    }

    /**
     * Adds field specific message to stream operation message report.
     * Field name is appended to message in summary report
     *
     * @param message - Message to be reported to stream operation called
     *                  Message should be as detailed as possible. However
     *                  in extreme cases, unnecessarily unique messages can impact
     *                  resource consumption
     * @param fieldName Field name for message
     */
    public void addMessage(String message, String fieldName)
    {
        totalMessageCount++;
        if (fieldName != null && !fieldName.isEmpty())
            message += " Field: " + fieldName;

        MessageCounter count = map.get(message);
        if (count == null)
        {
            map.put(message, new MessageCounter());
        }
        else
        {
            count.increment(); //updates obj in map
        }
    }

    /**
     * Provides summary of all messages currently reported
     *
     * @return messages summary
     */
    public String getMessagesSummary()
    {
        StringBuffer summary = new StringBuffer();
        Set<String> messages = map.keySet();

        for (String message : messages)
        {
            summary.append("Occurrences: (").append(map.get(message).getCount()).append(")  ").append(message).append("\n");
        }

        return summary.toString();
    }
}
