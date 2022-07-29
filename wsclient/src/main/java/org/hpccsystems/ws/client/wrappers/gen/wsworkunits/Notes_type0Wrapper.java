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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: Notes_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Notes_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.843Z
 */
public class Notes_type0Wrapper
{
    protected List<WUResponseNoteWrapper> local_note = null;

    public Notes_type0Wrapper() {}

    public Notes_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Notes_type0 notes_type0)
    {
        copy( notes_type0 );
    }
    public Notes_type0Wrapper( List<WUResponseNoteWrapper> _note )
    {
        this.local_note = _note;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Notes_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getNote() != null)
        {
            this.local_note = new ArrayList<WUResponseNoteWrapper>();
            for ( int i = 0; i < raw.getNote().length; i++)
            {
                this.local_note.add(new WUResponseNoteWrapper(raw.getNote()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Notes_type0Wrapper [" + "note = " + local_note + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Notes_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Notes_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Notes_type0();
        if (this.local_note!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseNote[this.local_note.size()];
            for ( int i = 0; i < this.local_note.size(); i++)
            {
                arr[i] = this.local_note.get(i) .getRaw();
            }
            raw.setNote(arr);
        }
        return raw;
    }


    public void setNote( List<WUResponseNoteWrapper> _note )
    {
        this.local_note = _note;
    }
    public List<WUResponseNoteWrapper> getNote( )
    {
        return this.local_note;
    }
}