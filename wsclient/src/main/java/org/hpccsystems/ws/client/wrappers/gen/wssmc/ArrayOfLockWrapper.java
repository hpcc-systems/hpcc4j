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
 * WrapperMaker version: 1.7
 * Class name: ArrayOfLockWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * Service version: 1.26
 */
public class ArrayOfLockWrapper
{
    protected List<LockWrapper> local_lock = null;

    public ArrayOfLockWrapper() {}

    public ArrayOfLockWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock arrayoflock)
    {
        copy( arrayoflock );
    }
    public ArrayOfLockWrapper( List<LockWrapper> _lock )
    {
        this.local_lock = _lock;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock raw )
    {
        if (raw == null)
            return;

        if (raw.getLock() != null)
        {
            this.local_lock = new ArrayList<LockWrapper>();
            for ( int i = 0; i < raw.getLock().length; i++)
            {
                this.local_lock.add(new LockWrapper(raw.getLock()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfLockWrapper [" + "lock = " + local_lock + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock();
        if (this.local_lock!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Lock[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Lock[this.local_lock.size()];
            for ( int i = 0; i < this.local_lock.size(); i++)
            {
                arr[i] = this.local_lock.get(i) .getRaw();
            }
            raw.setLock(arr);
        }
        return raw;
    }


    public void setLock( List<LockWrapper> _lock )
    {
        this.local_lock = _lock;
    }
    public List<LockWrapper> getLock( )
    {
        return this.local_lock;
    }
}