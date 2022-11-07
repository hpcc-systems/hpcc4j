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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUQuerysetsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.980Z
 */
public class WUQuerysetsWrapper
{
    protected boolean local_test;

    public WUQuerysetsWrapper() {}

    public WUQuerysetsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets wuquerysets)
    {
        copy( wuquerysets );
    }
    public WUQuerysetsWrapper( boolean _test )
    {
        this.local_test = _test;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets raw )
    {
        if (raw == null)
            return;

        this.local_test = raw.getTest();

    }

    @Override
    public String toString()
    {
        return "WUQuerysetsWrapper [" + "test = " + local_test + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets();
        raw.setTest( local_test);
        return raw;
    }


    public void setTest( boolean _test )
    {
        this.local_test = _test;
    }
    public boolean getTest( )
    {
        return this.local_test;
    }
}