package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: MatchedLines_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class MatchedLines_type0Wrapper
{
    protected List<ECLTextLineWrapper> local_line = null;

    public MatchedLines_type0Wrapper() {}

    public MatchedLines_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0 matchedlines_type0)
    {
        copy( matchedlines_type0 );
    }
    public MatchedLines_type0Wrapper( List<ECLTextLineWrapper> _line )
    {
        this.local_line = _line;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getLine() != null)
        {
            this.local_line = new ArrayList<ECLTextLineWrapper>();
            for ( int i = 0; i < raw.getLine().length; i++)
            {
                this.local_line.add(new ECLTextLineWrapper(raw.getLine()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "MatchedLines_type0Wrapper [" + "line = " + local_line + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0();
        if (this.local_line!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine[this.local_line.size()];
            for ( int i = 0; i < this.local_line.size(); i++)
            {
                arr[i] = this.local_line.get(i) .getRaw();
            }
            raw.setLine(arr);
        }
        return raw;
    }


    public void setLine( List<ECLTextLineWrapper> _line )
    {
        this.local_line = _line;
    }
    public List<ECLTextLineWrapper> getLine( )
    {
        return this.local_line;
    }
}