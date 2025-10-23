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

public class ArrayOfEspExceptionWrapper extends ArrayOfBaseExceptionWrapper
{
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new array of esp exception wrapper.
     */
    public ArrayOfEspExceptionWrapper()
    {
        super();
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(ArrayOfEspExceptionWrapper arrayofespexception)
    {
        super();
        copy(arrayofespexception);
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param _source
     *            the source
     * @param _exception
     *            the exception
     */
    public ArrayOfEspExceptionWrapper(String _source, List<BaseExceptionWrapper> _exception)
    {
        super();
        this.source = _source;
        this.exceptions = _exception;
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        copy(arrayofespexception);
    }



    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        copy(arrayofespexception);
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException arrayofespexception)
    {
        super();
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException arrayofespexception)
    {
        copy(arrayofespexception);
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Instantiates a new array of esp exception wrapper.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Copy.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Copy.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Copy.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */


    /**
     * Copy.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Copy.
     *
     * @param arrayofespexception
     *            the arrayofespexception
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<BaseExceptionWrapper>();
                for (int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(ArrayOfEspExceptionWrapper raw)
    {
        this.source = raw.getSource();
        List<BaseExceptionWrapper> excepts = raw.getExceptions();
        if (excepts != null)
        {
            this.exceptions = new ArrayList<BaseExceptionWrapper>();
            for (int i = 0; i < excepts.size(); i++)
            {
                this.exceptions.add(new EspExceptionWrapper((EspExceptionWrapper) excepts.get(i)));
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder multimessage = new StringBuilder();
        multimessage.append("ArrayOfEspExceptionWrapper: ");
        multimessage.append(wsClientMessage);
        multimessage.append("\n");
        for (BaseExceptionWrapper espExceptionWrapper : exceptions)
        {
            multimessage.append("\n\t");
            multimessage.append(espExceptionWrapper.toString());
        }

        return multimessage.toString();
    }

    /**
     * Gets the esp exceptions.
     *
     * @return the esp exceptions
     */
    public List<EspExceptionWrapper> getEspExceptions()
    {
        List<EspExceptionWrapper> ecls = new ArrayList<EspExceptionWrapper>();
        for (BaseExceptionWrapper ew : exceptions)
        {
            ecls.add((EspExceptionWrapper) ew);
        }
        return ecls;
    }

    /**
     * Sets the ws client message.
     *
     * @param localMessage
     *            the localMessage to set
     * @return the array of esp exception wrapper
     */
    public ArrayOfEspExceptionWrapper setWsClientMessage(String localMessage)
    {
        this.wsClientMessage = localMessage;
        return this;
    }
}
