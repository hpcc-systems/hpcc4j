package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
import org.apache.axis2.databinding.types.NonNegativeInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUQueryConfigWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfig
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.961Z
 */
public class WUQueryConfigWrapper
{
    protected String local_target;
    protected String local_queryId;
    protected int local_wait;
    protected boolean local_noReload;
    protected String local_memoryLimit;
    protected NonNegativeInteger local_timeLimit;
    protected NonNegativeInteger local_warnTimeLimit;
    protected String local_priority;
    protected String local_comment;

    public WUQueryConfigWrapper() {}

    public WUQueryConfigWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfig wuqueryconfig)
    {
        copy( wuqueryconfig );
    }
    public WUQueryConfigWrapper( String _target, String _queryId, int _wait, boolean _noReload, String _memoryLimit, NonNegativeInteger _timeLimit, NonNegativeInteger _warnTimeLimit, String _priority, String _comment )
    {
        this.local_target = _target;
        this.local_queryId = _queryId;
        this.local_wait = _wait;
        this.local_noReload = _noReload;
        this.local_memoryLimit = _memoryLimit;
        this.local_timeLimit = _timeLimit;
        this.local_warnTimeLimit = _warnTimeLimit;
        this.local_priority = _priority;
        this.local_comment = _comment;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfig raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_queryId = raw.getQueryId();
        this.local_wait = raw.getWait();
        this.local_noReload = raw.getNoReload();
        this.local_memoryLimit = raw.getMemoryLimit();
        this.local_timeLimit = raw.getTimeLimit();
        this.local_warnTimeLimit = raw.getWarnTimeLimit();
        this.local_priority = raw.getPriority();
        this.local_comment = raw.getComment();

    }

    @Override
    public String toString()
    {
        return "WUQueryConfigWrapper [" + "target = " + local_target + ", " + "queryId = " + local_queryId + ", " + "wait = " + local_wait + ", " + "noReload = " + local_noReload + ", " + "memoryLimit = " + local_memoryLimit + ", " + "timeLimit = " + local_timeLimit + ", " + "warnTimeLimit = " + local_warnTimeLimit + ", " + "priority = " + local_priority + ", " + "comment = " + local_comment + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfig getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfig raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfig();
        raw.setTarget( local_target);
        raw.setQueryId( local_queryId);
        raw.setWait( local_wait);
        raw.setNoReload( local_noReload);
        raw.setMemoryLimit( local_memoryLimit);
        raw.setTimeLimit( local_timeLimit);
        raw.setWarnTimeLimit( local_warnTimeLimit);
        raw.setPriority( local_priority);
        raw.setComment( local_comment);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
    public void setNoReload( boolean _noReload )
    {
        this.local_noReload = _noReload;
    }
    public boolean getNoReload( )
    {
        return this.local_noReload;
    }
    public void setMemoryLimit( String _memoryLimit )
    {
        this.local_memoryLimit = _memoryLimit;
    }
    public String getMemoryLimit( )
    {
        return this.local_memoryLimit;
    }
    public void setTimeLimit( NonNegativeInteger _timeLimit )
    {
        this.local_timeLimit = _timeLimit;
    }
    public NonNegativeInteger getTimeLimit( )
    {
        return this.local_timeLimit;
    }
    public void setWarnTimeLimit( NonNegativeInteger _warnTimeLimit )
    {
        this.local_warnTimeLimit = _warnTimeLimit;
    }
    public NonNegativeInteger getWarnTimeLimit( )
    {
        return this.local_warnTimeLimit;
    }
    public void setPriority( String _priority )
    {
        this.local_priority = _priority;
    }
    public String getPriority( )
    {
        return this.local_priority;
    }
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
}