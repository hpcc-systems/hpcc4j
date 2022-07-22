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
 * Class name: ECLQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.807Z
 */
public class ECLQueryWrapper
{
    protected String local_text;
    protected String local_cpp;
    protected String local_resTxt;
    protected String local_dll;
    protected String local_thorLog;
    protected String local_queryMainDefinition;

    public ECLQueryWrapper() {}

    public ECLQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery eclquery)
    {
        copy( eclquery );
    }
    public ECLQueryWrapper( String _text, String _cpp, String _resTxt, String _dll, String _thorLog, String _queryMainDefinition )
    {
        this.local_text = _text;
        this.local_cpp = _cpp;
        this.local_resTxt = _resTxt;
        this.local_dll = _dll;
        this.local_thorLog = _thorLog;
        this.local_queryMainDefinition = _queryMainDefinition;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery raw )
    {
        if (raw == null)
            return;

        this.local_text = raw.getText();
        this.local_cpp = raw.getCpp();
        this.local_resTxt = raw.getResTxt();
        this.local_dll = raw.getDll();
        this.local_thorLog = raw.getThorLog();
        this.local_queryMainDefinition = raw.getQueryMainDefinition();

    }

    @Override
    public String toString()
    {
        return "ECLQueryWrapper [" + "text = " + local_text + ", " + "cpp = " + local_cpp + ", " + "resTxt = " + local_resTxt + ", " + "dll = " + local_dll + ", " + "thorLog = " + local_thorLog + ", " + "queryMainDefinition = " + local_queryMainDefinition + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery();
        raw.setText( local_text);
        raw.setCpp( local_cpp);
        raw.setResTxt( local_resTxt);
        raw.setDll( local_dll);
        raw.setThorLog( local_thorLog);
        raw.setQueryMainDefinition( local_queryMainDefinition);
        return raw;
    }


    public void setText( String _text )
    {
        this.local_text = _text;
    }
    public String getText( )
    {
        return this.local_text;
    }
    public void setCpp( String _cpp )
    {
        this.local_cpp = _cpp;
    }
    public String getCpp( )
    {
        return this.local_cpp;
    }
    public void setResTxt( String _resTxt )
    {
        this.local_resTxt = _resTxt;
    }
    public String getResTxt( )
    {
        return this.local_resTxt;
    }
    public void setDll( String _dll )
    {
        this.local_dll = _dll;
    }
    public String getDll( )
    {
        return this.local_dll;
    }
    public void setThorLog( String _thorLog )
    {
        this.local_thorLog = _thorLog;
    }
    public String getThorLog( )
    {
        return this.local_thorLog;
    }
    public void setQueryMainDefinition( String _queryMainDefinition )
    {
        this.local_queryMainDefinition = _queryMainDefinition;
    }
    public String getQueryMainDefinition( )
    {
        return this.local_queryMainDefinition;
    }
}