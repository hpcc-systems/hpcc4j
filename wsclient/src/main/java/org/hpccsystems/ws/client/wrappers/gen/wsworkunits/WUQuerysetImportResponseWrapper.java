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
 * Class name: WUQuerysetImportResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetImportResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.978Z
 */
public class WUQuerysetImportResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_target;
    protected boolean local_clearedExisting;
    protected boolean local_success;
    protected ImportedQueries_type0Wrapper local_importedQueries;
    protected ExistingQueries_type0Wrapper local_existingQueries;
    protected MissingWuids_type0Wrapper local_missingWuids;
    protected FileErrors_type2Wrapper local_fileErrors;
    protected String local_dfuPublisherWuid;
    protected String local_dfuPublisherState;

    public WUQuerysetImportResponseWrapper() {}

    public WUQuerysetImportResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetImportResponse wuquerysetimportresponse)
    {
        copy( wuquerysetimportresponse );
    }
    public WUQuerysetImportResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _target, boolean _clearedExisting, boolean _success, ImportedQueries_type0Wrapper _importedQueries, ExistingQueries_type0Wrapper _existingQueries, MissingWuids_type0Wrapper _missingWuids, FileErrors_type2Wrapper _fileErrors, String _dfuPublisherWuid, String _dfuPublisherState )
    {
        this.local_exceptions = _exceptions;
        this.local_target = _target;
        this.local_clearedExisting = _clearedExisting;
        this.local_success = _success;
        this.local_importedQueries = _importedQueries;
        this.local_existingQueries = _existingQueries;
        this.local_missingWuids = _missingWuids;
        this.local_fileErrors = _fileErrors;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_dfuPublisherState = _dfuPublisherState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetImportResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_target = raw.getTarget();
        this.local_clearedExisting = raw.getClearedExisting();
        this.local_success = raw.getSuccess();
        if (raw.getImportedQueries() != null)
            this.local_importedQueries = new ImportedQueries_type0Wrapper( raw.getImportedQueries());
        if (raw.getExistingQueries() != null)
            this.local_existingQueries = new ExistingQueries_type0Wrapper( raw.getExistingQueries());
        if (raw.getMissingWuids() != null)
            this.local_missingWuids = new MissingWuids_type0Wrapper( raw.getMissingWuids());
        if (raw.getFileErrors() != null)
            this.local_fileErrors = new FileErrors_type2Wrapper( raw.getFileErrors());
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_dfuPublisherState = raw.getDfuPublisherState();

    }

    @Override
    public String toString()
    {
        return "WUQuerysetImportResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "target = " + local_target + ", " + "clearedExisting = " + local_clearedExisting + ", " + "success = " + local_success + ", " + "importedQueries = " + local_importedQueries + ", " + "existingQueries = " + local_existingQueries + ", " + "missingWuids = " + local_missingWuids + ", " + "fileErrors = " + local_fileErrors + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "dfuPublisherState = " + local_dfuPublisherState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetImportResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetImportResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetImportResponse();
        raw.setTarget( local_target);
        raw.setClearedExisting( local_clearedExisting);
        raw.setSuccess( local_success);
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setDfuPublisherState( local_dfuPublisherState);
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
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setClearedExisting( boolean _clearedExisting )
    {
        this.local_clearedExisting = _clearedExisting;
    }
    public boolean getClearedExisting( )
    {
        return this.local_clearedExisting;
    }
    public void setSuccess( boolean _success )
    {
        this.local_success = _success;
    }
    public boolean getSuccess( )
    {
        return this.local_success;
    }
    public void setImportedQueries( ImportedQueries_type0Wrapper _importedQueries )
    {
        this.local_importedQueries = _importedQueries;
    }
    public ImportedQueries_type0Wrapper getImportedQueries( )
    {
        return this.local_importedQueries;
    }
    public void setExistingQueries( ExistingQueries_type0Wrapper _existingQueries )
    {
        this.local_existingQueries = _existingQueries;
    }
    public ExistingQueries_type0Wrapper getExistingQueries( )
    {
        return this.local_existingQueries;
    }
    public void setMissingWuids( MissingWuids_type0Wrapper _missingWuids )
    {
        this.local_missingWuids = _missingWuids;
    }
    public MissingWuids_type0Wrapper getMissingWuids( )
    {
        return this.local_missingWuids;
    }
    public void setFileErrors( FileErrors_type2Wrapper _fileErrors )
    {
        this.local_fileErrors = _fileErrors;
    }
    public FileErrors_type2Wrapper getFileErrors( )
    {
        return this.local_fileErrors;
    }
    public void setDfuPublisherWuid( String _dfuPublisherWuid )
    {
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
    }
    public String getDfuPublisherWuid( )
    {
        return this.local_dfuPublisherWuid;
    }
    public void setDfuPublisherState( String _dfuPublisherState )
    {
        this.local_dfuPublisherState = _dfuPublisherState;
    }
    public String getDfuPublisherState( )
    {
        return this.local_dfuPublisherState;
    }
}