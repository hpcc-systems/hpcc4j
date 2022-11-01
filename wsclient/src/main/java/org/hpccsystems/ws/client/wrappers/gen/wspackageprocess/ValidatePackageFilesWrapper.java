package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ValidatePackageFilesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageFiles
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-10-31T03:36:33.200Z
 */
public class ValidatePackageFilesWrapper
{
    protected List<String> local_unmatched = null;
    protected NotInDFS_type0Wrapper local_notInDFS;

    public ValidatePackageFilesWrapper() {}

    public ValidatePackageFilesWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageFiles validatepackagefiles)
    {
        copy( validatepackagefiles );
    }
    public ValidatePackageFilesWrapper( List<String> _unmatched, NotInDFS_type0Wrapper _notInDFS )
    {
        this.local_unmatched = _unmatched;
        this.local_notInDFS = _notInDFS;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageFiles raw )
    {
        if (raw == null)
            return;

        if (raw.getUnmatched() != null)
        {
            this.local_unmatched = new ArrayList<String>();
            for ( int i = 0; i < raw.getUnmatched().getItem().length; i++)
            {
                this.local_unmatched.add(new String(raw.getUnmatched().getItem()[i]));
            }
        }        if (raw.getNotInDFS() != null)
            this.local_notInDFS = new NotInDFS_type0Wrapper( raw.getNotInDFS());

    }

    @Override
    public String toString()
    {
        return "ValidatePackageFilesWrapper [" + "unmatched = " + local_unmatched + ", " + "notInDFS = " + local_notInDFS + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageFiles getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageFiles raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageFiles();
        if (this.local_unmatched!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_unmatched.size(); i++)
            {
                arr.addItem(this.local_unmatched.get(i));
            }
            raw.setUnmatched(arr);
        }
        if (local_notInDFS != null)
            raw.setNotInDFS( local_notInDFS.getRaw());
        return raw;
    }


    public void setUnmatched( List<String> _unmatched )
    {
        this.local_unmatched = _unmatched;
    }
    public List<String> getUnmatched( )
    {
        return this.local_unmatched;
    }
    public void setNotInDFS( NotInDFS_type0Wrapper _notInDFS )
    {
        this.local_notInDFS = _notInDFS;
    }
    public NotInDFS_type0Wrapper getNotInDFS( )
    {
        return this.local_notInDFS;
    }
}