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
import java.util.Calendar;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TimeRangeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class TimeRangeWrapper
{
    protected Calendar local_startDate;
    protected Calendar local_endDate;

    public TimeRangeWrapper() {}

    public TimeRangeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange timerange)
    {
        copy( timerange );
    }
    public TimeRangeWrapper( Calendar _startDate, Calendar _endDate )
    {
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange raw )
    {
        if (raw == null)
            return;

        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();

    }

    @Override
    public String toString()
    {
        return "TimeRangeWrapper [" + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange();
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        return raw;
    }


    public void setStartDate( Calendar _startDate )
    {
        this.local_startDate = _startDate;
    }
    public Calendar getStartDate( )
    {
        return this.local_startDate;
    }
    public void setEndDate( Calendar _endDate )
    {
        this.local_endDate = _endDate;
    }
    public Calendar getEndDate( )
    {
        return this.local_endDate;
    }
}