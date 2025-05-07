package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: ECLTextLineWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ECLTextLineWrapper
{
    protected int local_lineNumber;
    protected String local_lineText;

    public ECLTextLineWrapper() {}

    public ECLTextLineWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine ecltextline)
    {
        copy( ecltextline );
    }
    public ECLTextLineWrapper( int _lineNumber, String _lineText )
    {
        this.local_lineNumber = _lineNumber;
        this.local_lineText = _lineText;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine raw )
    {
        if (raw == null)
            return;

        this.local_lineNumber = raw.getLineNumber();
        this.local_lineText = raw.getLineText();

    }

    @Override
    public String toString()
    {
        return "ECLTextLineWrapper [" + "lineNumber = " + local_lineNumber + ", " + "lineText = " + local_lineText + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLTextLine();
        raw.setLineNumber( local_lineNumber);
        raw.setLineText( local_lineText);
        return raw;
    }


    public void setLineNumber( int _lineNumber )
    {
        this.local_lineNumber = _lineNumber;
    }
    public int getLineNumber( )
    {
        return this.local_lineNumber;
    }
    public void setLineText( String _lineText )
    {
        this.local_lineText = _lineText;
    }
    public String getLineText( )
    {
        return this.local_lineText;
    }
}