package org.hpccsystems.ws.client.wrappers.wsdfu;

import java.util.ArrayList;
/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfDFUPartWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPart
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2019-08-20T13:59:09.298Z
 */
public class ArrayOfDFUPartWrapper
{
    protected List<DFUPartWrapper> local_dFUPart = new ArrayList<DFUPartWrapper>();

    /**
     * Instantiates a new array of DFU part wrapper.
     */
    public ArrayOfDFUPartWrapper()
    {
    }

    /**
     * Instantiates a new array of DFU part wrapper.
     *
     * @param arrayofdfupart
     *            the arrayofdfupart
     */
    public ArrayOfDFUPartWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPart arrayofdfupart)
    {
        copy(arrayofdfupart);
    }

    /**
     * Instantiates a new array of DFU part wrapper.
     *
     * @param _dFUPart
     *            the d FU part
     */
    public ArrayOfDFUPartWrapper(List<DFUPartWrapper> _dFUPart)
    {
        this.local_dFUPart = _dFUPart;

    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPart raw)
    {
        if (raw == null) return;

        if (raw.getDFUPart() != null)
        {
            this.local_dFUPart = new ArrayList<DFUPartWrapper>();
            for (int i = 0; i < raw.getDFUPart().length; i++)
            {
                this.local_dFUPart.add(new DFUPartWrapper(raw.getDFUPart()[i]));
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ArrayOfDFUPartWrapper [" + "dFUPart = " + local_dFUPart + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPart getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPart raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUPart();
        if (this.local_dFUPart != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUPart[this.local_dFUPart
                    .size()];
            for (int i = 0; i < this.local_dFUPart.size(); i++)
            {
                arr[i] = this.local_dFUPart.get(i).getRaw();
            }
            raw.setDFUPart(arr);
        }
        return raw;
    }

    /**
     * Sets the DFU part.
     *
     * @param _dFUPart
     *            the new DFU part
     */
    public void setDFUPart(List<DFUPartWrapper> _dFUPart)
    {
        this.local_dFUPart = _dFUPart;
    }

    /**
     * Gets the DFU part.
     *
     * @return the DFU part
     */
    public List<DFUPartWrapper> getDFUPart()
    {
        return this.local_dFUPart;
    }
}
