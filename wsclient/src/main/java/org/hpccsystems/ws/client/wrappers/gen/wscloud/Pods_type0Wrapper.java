package org.hpccsystems.ws.client.wrappers.gen.wscloud;

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
 * Class name: Pods_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Pods_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscloud
 */
public class Pods_type0Wrapper
{
    protected List<PodItemWrapper> local_pod = null;

    public Pods_type0Wrapper() {}

    public Pods_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Pods_type0 pods_type0)
    {
        copy( pods_type0 );
    }
    public Pods_type0Wrapper( List<PodItemWrapper> _pod )
    {
        this.local_pod = _pod;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Pods_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getPod() != null)
        {
            this.local_pod = new ArrayList<PodItemWrapper>();
            for ( int i = 0; i < raw.getPod().length; i++)
            {
                this.local_pod.add(new PodItemWrapper(raw.getPod()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Pods_type0Wrapper [" + "pod = " + local_pod + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Pods_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Pods_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Pods_type0();
        if (this.local_pod!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem[] arr = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem[this.local_pod.size()];
            for ( int i = 0; i < this.local_pod.size(); i++)
            {
                arr[i] = this.local_pod.get(i) .getRaw();
            }
            raw.setPod(arr);
        }
        return raw;
    }


    public void setPod( List<PodItemWrapper> _pod )
    {
        this.local_pod = _pod;
    }
    public List<PodItemWrapper> getPod( )
    {
        return this.local_pod;
    }
}