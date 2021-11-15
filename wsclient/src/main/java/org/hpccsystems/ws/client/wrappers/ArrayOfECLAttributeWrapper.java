package org.hpccsystems.ws.client.wrappers;

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
 * Class name: ArrayOfECLAttributeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ArrayOfECLAttribute
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 * TimeStamp: 2019-09-06T14:30:23.480Z
 */
public class ArrayOfECLAttributeWrapper
{
    protected List<ECLAttributeWrapper> local_eCLAttribute = new ArrayList<ECLAttributeWrapper>();

    /**
     * Instantiates a new array of ECL attribute wrapper.
     */
    public ArrayOfECLAttributeWrapper()
    {
    }

    /**
     * Instantiates a new array of ECL attribute wrapper.
     *
     * @param arrayofeclattribute
     *            the arrayofeclattribute
     */
    public ArrayOfECLAttributeWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttribute arrayofeclattribute)
    {
        copy(arrayofeclattribute);
    }

    /**
     * Instantiates a new array of ECL attribute wrapper.
     *
     * @param _eCLAttribute
     *            the e CL attribute
     */
    public ArrayOfECLAttributeWrapper(List<ECLAttributeWrapper> _eCLAttribute)
    {
        this.local_eCLAttribute = _eCLAttribute;

    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttribute raw)
    {
        if (raw == null) return;

        if (raw.getECLAttribute() != null)
        {
            this.local_eCLAttribute = new ArrayList<ECLAttributeWrapper>();
            for (int i = 0; i < raw.getECLAttribute().length; i++)
            {
                this.local_eCLAttribute.add(new ECLAttributeWrapper(raw.getECLAttribute()[i]));
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
        return "ArrayOfECLAttributeWrapper [" + "eCLAttribute = " + local_eCLAttribute + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttribute getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttribute raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttribute();
        if (this.local_eCLAttribute != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute[this.local_eCLAttribute
                    .size()];
            for (int i = 0; i < this.local_eCLAttribute.size(); i++)
            {
                arr[i] = this.local_eCLAttribute.get(i).getRaw();
            }
            raw.setECLAttribute(arr);
        }
        return raw;
    }

    /**
     * Sets the ECL attribute.
     *
     * @param _eCLAttribute
     *            the new ECL attribute
     */
    public void setECLAttribute(List<ECLAttributeWrapper> _eCLAttribute)
    {
        this.local_eCLAttribute = _eCLAttribute;
    }

    /**
     * Gets the ECL attribute.
     *
     * @return the ECL attribute
     */
    public List<ECLAttributeWrapper> getECLAttribute()
    {
        return this.local_eCLAttribute;
    }
}
