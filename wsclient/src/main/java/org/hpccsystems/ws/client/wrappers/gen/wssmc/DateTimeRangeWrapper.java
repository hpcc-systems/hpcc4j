package org.hpccsystems.ws.client.wrappers.gen.wssmc;

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
import java.util.Calendar;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DateTimeRangeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DateTimeRange
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class DateTimeRangeWrapper
{
    protected Calendar local_start;
    protected Calendar local_end;

    public DateTimeRangeWrapper() {}

    public DateTimeRangeWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DateTimeRange datetimerange)
    {
        copy( datetimerange );
    }
    public DateTimeRangeWrapper( Calendar _start, Calendar _end )
    {
        this.local_start = _start;
        this.local_end = _end;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DateTimeRange raw )
    {
        if (raw == null)
            return;

        this.local_start = raw.getStart();
        this.local_end = raw.getEnd();

    }

    @Override
    public String toString()
    {
        return "DateTimeRangeWrapper [" + "start = " + local_start + ", " + "end = " + local_end + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DateTimeRange getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DateTimeRange raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DateTimeRange();
        raw.setStart( local_start);
        raw.setEnd( local_end);
        return raw;
    }


    public void setStart( Calendar _start )
    {
        this.local_start = _start;
    }
    public Calendar getStart( )
    {
        return this.local_start;
    }
    public void setEnd( Calendar _end )
    {
        this.local_end = _end;
    }
    public Calendar getEnd( )
    {
        return this.local_end;
    }
}