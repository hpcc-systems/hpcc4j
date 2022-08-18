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
 * Class name: WUListQueriesUsingFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.941Z
 */
public class WUListQueriesUsingFileWrapper
{
    protected String local_target;
    protected String local_process;
    protected String local_fileName;

    public WUListQueriesUsingFileWrapper() {}

    public WUListQueriesUsingFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFile wulistqueriesusingfile)
    {
        copy( wulistqueriesusingfile );
    }
    public WUListQueriesUsingFileWrapper( String _target, String _process, String _fileName )
    {
        this.local_target = _target;
        this.local_process = _process;
        this.local_fileName = _fileName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFile raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_process = raw.getProcess();
        this.local_fileName = raw.getFileName();

    }

    @Override
    public String toString()
    {
        return "WUListQueriesUsingFileWrapper [" + "target = " + local_target + ", " + "process = " + local_process + ", " + "fileName = " + local_fileName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFile();
        raw.setTarget( local_target);
        raw.setProcess( local_process);
        raw.setFileName( local_fileName);
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
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
}