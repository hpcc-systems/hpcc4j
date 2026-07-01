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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: Stats_type1Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stats_type1
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class Stats_type1Wrapper
{
    protected List<StatWrapper> local_stat = null;

    public Stats_type1Wrapper() {}

    public Stats_type1Wrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stats_type1 stats_type1)
    {
        copy( stats_type1 );
    }
    public Stats_type1Wrapper( List<StatWrapper> _stat )
    {
        this.local_stat = _stat;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stats_type1 raw )
    {
        if (raw == null)
            return;

        if (raw.getStat() != null)
        {
            this.local_stat = new ArrayList<StatWrapper>();
            for ( int i = 0; i < raw.getStat().length; i++)
            {
                this.local_stat.add(new StatWrapper(raw.getStat()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Stats_type1Wrapper [" + "stat = " + local_stat + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stats_type1 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stats_type1 raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stats_type1();
        if (this.local_stat!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stat[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Stat[this.local_stat.size()];
            for ( int i = 0; i < this.local_stat.size(); i++)
            {
                arr[i] = this.local_stat.get(i) .getRaw();
            }
            raw.setStat(arr);
        }
        return raw;
    }


    public void setStat( List<StatWrapper> _stat )
    {
        this.local_stat = _stat;
    }
    public List<StatWrapper> getStat( )
    {
        return this.local_stat;
    }
}