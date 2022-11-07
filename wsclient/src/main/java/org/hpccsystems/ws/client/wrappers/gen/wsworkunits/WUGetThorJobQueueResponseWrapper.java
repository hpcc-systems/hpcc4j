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
 * Class name: WUGetThorJobQueueResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueueResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.924Z
 */
public class WUGetThorJobQueueResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_longestQueue;
    protected int local_maxThorConnected;
    protected ArrayOfThorQueueWrapper local_queueList;
    protected String local_warning;

    public WUGetThorJobQueueResponseWrapper() {}

    public WUGetThorJobQueueResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueueResponse wugetthorjobqueueresponse)
    {
        copy( wugetthorjobqueueresponse );
    }
    public WUGetThorJobQueueResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _longestQueue, int _maxThorConnected, ArrayOfThorQueueWrapper _queueList, String _warning )
    {
        this.local_exceptions = _exceptions;
        this.local_longestQueue = _longestQueue;
        this.local_maxThorConnected = _maxThorConnected;
        this.local_queueList = _queueList;
        this.local_warning = _warning;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueueResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_longestQueue = raw.getLongestQueue();
        this.local_maxThorConnected = raw.getMaxThorConnected();
        if (raw.getQueueList() != null)
            this.local_queueList = new ArrayOfThorQueueWrapper( raw.getQueueList());
        this.local_warning = raw.getWarning();

    }

    @Override
    public String toString()
    {
        return "WUGetThorJobQueueResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "longestQueue = " + local_longestQueue + ", " + "maxThorConnected = " + local_maxThorConnected + ", " + "queueList = " + local_queueList + ", " + "warning = " + local_warning + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueueResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueueResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueueResponse();
        raw.setLongestQueue( local_longestQueue);
        raw.setMaxThorConnected( local_maxThorConnected);
        raw.setWarning( local_warning);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setLongestQueue( int _longestQueue )
    {
        this.local_longestQueue = _longestQueue;
    }
    public int getLongestQueue( )
    {
        return this.local_longestQueue;
    }
    public void setMaxThorConnected( int _maxThorConnected )
    {
        this.local_maxThorConnected = _maxThorConnected;
    }
    public int getMaxThorConnected( )
    {
        return this.local_maxThorConnected;
    }
    public void setQueueList( ArrayOfThorQueueWrapper _queueList )
    {
        this.local_queueList = _queueList;
    }
    public ArrayOfThorQueueWrapper getQueueList( )
    {
        return this.local_queueList;
    }
    public void setWarning( String _warning )
    {
        this.local_warning = _warning;
    }
    public String getWarning( )
    {
        return this.local_warning;
    }
}