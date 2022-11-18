package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUChangeRestrictionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.248Z
 */
public class DFUChangeRestrictionWrapper
{
    protected int local_dFUChangeRestriction;

    public DFUChangeRestrictionWrapper() {}

    public DFUChangeRestrictionWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction dfuchangerestriction)
    {
        copy( dfuchangerestriction );
    }
    public DFUChangeRestrictionWrapper( int _dFUChangeRestriction )
    {
        this.local_dFUChangeRestriction = _dFUChangeRestriction;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getDFUChangeRestriction();

    }

    @Override
    public String toString()
    {
        return "DFUChangeRestrictionWrapper [" + "dFUChangeRestriction = " + local_dFUChangeRestriction + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUChangeRestriction(dFUChangeRestriction);
        return raw;
    }


    public void setDFUChangeRestriction( int _dFUChangeRestriction )
    {
        this.local_dFUChangeRestriction = _dFUChangeRestriction;
    }
    public int getDFUChangeRestriction( )
    {
        return this.local_dFUChangeRestriction;
    }
}