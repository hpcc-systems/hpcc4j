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
 * Class name: DFUSearchDataResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.916Z
 */
public class DFUSearchDataResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_openLogicalName;
    protected String local_logicalName;
    protected String local_parentName;
    protected long local_startIndex;
    protected long local_endIndex;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns1;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns2;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns3;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns4;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns5;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns6;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns7;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns8;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns9;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns10;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns11;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns12;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns13;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns14;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns15;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns16;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns17;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns18;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns19;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataKeyedColumns20;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns1;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns2;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns3;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns4;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns5;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns6;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns7;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns8;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns9;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns10;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns11;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns12;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns13;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns14;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns15;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns16;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns17;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns18;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns19;
    protected ArrayOfDFUDataColumnWrapper local_dFUDataNonKeyedColumns20;
    protected long local_rowCount;
    protected String local_showColumns;
    protected int local_chooseFile;
    protected String local_name;
    protected String local_filterBy;
    protected String local_filterForGoBack;
    protected ColumnsHidden_type1Wrapper local_columnsHidden;
    protected int local_columnCount;
    protected long local_startForGoback;
    protected int local_countForGoback;
    protected long local_start;
    protected long local_count;
    protected long local_pageSize;
    protected long local_total;
    protected String local_result;
    protected String local_msgToDisplay;
    protected String local_cluster;
    protected String local_clusterType;
    protected String local_file;
    protected String local_key;
    protected boolean local_schemaOnly;
    protected boolean local_roxieSelections;
    protected boolean local_disableUppercaseTranslation;
    protected boolean local_autoUppercaseTranslation;
    protected String local_selectedKey;

    public DFUSearchDataResponseWrapper() {}

    public DFUSearchDataResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse dfusearchdataresponse)
    {
        copy( dfusearchdataresponse );
    }
    public DFUSearchDataResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _openLogicalName, String _logicalName, String _parentName, long _startIndex, long _endIndex, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns1, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns2, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns3, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns4, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns5, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns6, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns7, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns8, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns9, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns10, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns11, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns12, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns13, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns14, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns15, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns16, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns17, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns18, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns19, ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns20, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns1, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns2, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns3, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns4, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns5, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns6, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns7, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns8, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns9, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns10, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns11, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns12, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns13, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns14, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns15, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns16, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns17, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns18, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns19, ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns20, long _rowCount, String _showColumns, int _chooseFile, String _name, String _filterBy, String _filterForGoBack, ColumnsHidden_type1Wrapper _columnsHidden, int _columnCount, long _startForGoback, int _countForGoback, long _start, long _count, long _pageSize, long _total, String _result, String _msgToDisplay, String _cluster, String _clusterType, String _file, String _key, boolean _schemaOnly, boolean _roxieSelections, boolean _disableUppercaseTranslation, boolean _autoUppercaseTranslation, String _selectedKey )
    {
        this.local_exceptions = _exceptions;
        this.local_openLogicalName = _openLogicalName;
        this.local_logicalName = _logicalName;
        this.local_parentName = _parentName;
        this.local_startIndex = _startIndex;
        this.local_endIndex = _endIndex;
        this.local_dFUDataKeyedColumns1 = _dFUDataKeyedColumns1;
        this.local_dFUDataKeyedColumns2 = _dFUDataKeyedColumns2;
        this.local_dFUDataKeyedColumns3 = _dFUDataKeyedColumns3;
        this.local_dFUDataKeyedColumns4 = _dFUDataKeyedColumns4;
        this.local_dFUDataKeyedColumns5 = _dFUDataKeyedColumns5;
        this.local_dFUDataKeyedColumns6 = _dFUDataKeyedColumns6;
        this.local_dFUDataKeyedColumns7 = _dFUDataKeyedColumns7;
        this.local_dFUDataKeyedColumns8 = _dFUDataKeyedColumns8;
        this.local_dFUDataKeyedColumns9 = _dFUDataKeyedColumns9;
        this.local_dFUDataKeyedColumns10 = _dFUDataKeyedColumns10;
        this.local_dFUDataKeyedColumns11 = _dFUDataKeyedColumns11;
        this.local_dFUDataKeyedColumns12 = _dFUDataKeyedColumns12;
        this.local_dFUDataKeyedColumns13 = _dFUDataKeyedColumns13;
        this.local_dFUDataKeyedColumns14 = _dFUDataKeyedColumns14;
        this.local_dFUDataKeyedColumns15 = _dFUDataKeyedColumns15;
        this.local_dFUDataKeyedColumns16 = _dFUDataKeyedColumns16;
        this.local_dFUDataKeyedColumns17 = _dFUDataKeyedColumns17;
        this.local_dFUDataKeyedColumns18 = _dFUDataKeyedColumns18;
        this.local_dFUDataKeyedColumns19 = _dFUDataKeyedColumns19;
        this.local_dFUDataKeyedColumns20 = _dFUDataKeyedColumns20;
        this.local_dFUDataNonKeyedColumns1 = _dFUDataNonKeyedColumns1;
        this.local_dFUDataNonKeyedColumns2 = _dFUDataNonKeyedColumns2;
        this.local_dFUDataNonKeyedColumns3 = _dFUDataNonKeyedColumns3;
        this.local_dFUDataNonKeyedColumns4 = _dFUDataNonKeyedColumns4;
        this.local_dFUDataNonKeyedColumns5 = _dFUDataNonKeyedColumns5;
        this.local_dFUDataNonKeyedColumns6 = _dFUDataNonKeyedColumns6;
        this.local_dFUDataNonKeyedColumns7 = _dFUDataNonKeyedColumns7;
        this.local_dFUDataNonKeyedColumns8 = _dFUDataNonKeyedColumns8;
        this.local_dFUDataNonKeyedColumns9 = _dFUDataNonKeyedColumns9;
        this.local_dFUDataNonKeyedColumns10 = _dFUDataNonKeyedColumns10;
        this.local_dFUDataNonKeyedColumns11 = _dFUDataNonKeyedColumns11;
        this.local_dFUDataNonKeyedColumns12 = _dFUDataNonKeyedColumns12;
        this.local_dFUDataNonKeyedColumns13 = _dFUDataNonKeyedColumns13;
        this.local_dFUDataNonKeyedColumns14 = _dFUDataNonKeyedColumns14;
        this.local_dFUDataNonKeyedColumns15 = _dFUDataNonKeyedColumns15;
        this.local_dFUDataNonKeyedColumns16 = _dFUDataNonKeyedColumns16;
        this.local_dFUDataNonKeyedColumns17 = _dFUDataNonKeyedColumns17;
        this.local_dFUDataNonKeyedColumns18 = _dFUDataNonKeyedColumns18;
        this.local_dFUDataNonKeyedColumns19 = _dFUDataNonKeyedColumns19;
        this.local_dFUDataNonKeyedColumns20 = _dFUDataNonKeyedColumns20;
        this.local_rowCount = _rowCount;
        this.local_showColumns = _showColumns;
        this.local_chooseFile = _chooseFile;
        this.local_name = _name;
        this.local_filterBy = _filterBy;
        this.local_filterForGoBack = _filterForGoBack;
        this.local_columnsHidden = _columnsHidden;
        this.local_columnCount = _columnCount;
        this.local_startForGoback = _startForGoback;
        this.local_countForGoback = _countForGoback;
        this.local_start = _start;
        this.local_count = _count;
        this.local_pageSize = _pageSize;
        this.local_total = _total;
        this.local_result = _result;
        this.local_msgToDisplay = _msgToDisplay;
        this.local_cluster = _cluster;
        this.local_clusterType = _clusterType;
        this.local_file = _file;
        this.local_key = _key;
        this.local_schemaOnly = _schemaOnly;
        this.local_roxieSelections = _roxieSelections;
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;
        this.local_autoUppercaseTranslation = _autoUppercaseTranslation;
        this.local_selectedKey = _selectedKey;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_openLogicalName = raw.getOpenLogicalName();
        this.local_logicalName = raw.getLogicalName();
        this.local_parentName = raw.getParentName();
        this.local_startIndex = raw.getStartIndex();
        this.local_endIndex = raw.getEndIndex();
        if (raw.getDFUDataKeyedColumns1() != null)
            this.local_dFUDataKeyedColumns1 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns1());
        if (raw.getDFUDataKeyedColumns2() != null)
            this.local_dFUDataKeyedColumns2 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns2());
        if (raw.getDFUDataKeyedColumns3() != null)
            this.local_dFUDataKeyedColumns3 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns3());
        if (raw.getDFUDataKeyedColumns4() != null)
            this.local_dFUDataKeyedColumns4 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns4());
        if (raw.getDFUDataKeyedColumns5() != null)
            this.local_dFUDataKeyedColumns5 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns5());
        if (raw.getDFUDataKeyedColumns6() != null)
            this.local_dFUDataKeyedColumns6 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns6());
        if (raw.getDFUDataKeyedColumns7() != null)
            this.local_dFUDataKeyedColumns7 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns7());
        if (raw.getDFUDataKeyedColumns8() != null)
            this.local_dFUDataKeyedColumns8 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns8());
        if (raw.getDFUDataKeyedColumns9() != null)
            this.local_dFUDataKeyedColumns9 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns9());
        if (raw.getDFUDataKeyedColumns10() != null)
            this.local_dFUDataKeyedColumns10 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns10());
        if (raw.getDFUDataKeyedColumns11() != null)
            this.local_dFUDataKeyedColumns11 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns11());
        if (raw.getDFUDataKeyedColumns12() != null)
            this.local_dFUDataKeyedColumns12 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns12());
        if (raw.getDFUDataKeyedColumns13() != null)
            this.local_dFUDataKeyedColumns13 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns13());
        if (raw.getDFUDataKeyedColumns14() != null)
            this.local_dFUDataKeyedColumns14 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns14());
        if (raw.getDFUDataKeyedColumns15() != null)
            this.local_dFUDataKeyedColumns15 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns15());
        if (raw.getDFUDataKeyedColumns16() != null)
            this.local_dFUDataKeyedColumns16 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns16());
        if (raw.getDFUDataKeyedColumns17() != null)
            this.local_dFUDataKeyedColumns17 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns17());
        if (raw.getDFUDataKeyedColumns18() != null)
            this.local_dFUDataKeyedColumns18 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns18());
        if (raw.getDFUDataKeyedColumns19() != null)
            this.local_dFUDataKeyedColumns19 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns19());
        if (raw.getDFUDataKeyedColumns20() != null)
            this.local_dFUDataKeyedColumns20 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataKeyedColumns20());
        if (raw.getDFUDataNonKeyedColumns1() != null)
            this.local_dFUDataNonKeyedColumns1 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns1());
        if (raw.getDFUDataNonKeyedColumns2() != null)
            this.local_dFUDataNonKeyedColumns2 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns2());
        if (raw.getDFUDataNonKeyedColumns3() != null)
            this.local_dFUDataNonKeyedColumns3 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns3());
        if (raw.getDFUDataNonKeyedColumns4() != null)
            this.local_dFUDataNonKeyedColumns4 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns4());
        if (raw.getDFUDataNonKeyedColumns5() != null)
            this.local_dFUDataNonKeyedColumns5 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns5());
        if (raw.getDFUDataNonKeyedColumns6() != null)
            this.local_dFUDataNonKeyedColumns6 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns6());
        if (raw.getDFUDataNonKeyedColumns7() != null)
            this.local_dFUDataNonKeyedColumns7 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns7());
        if (raw.getDFUDataNonKeyedColumns8() != null)
            this.local_dFUDataNonKeyedColumns8 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns8());
        if (raw.getDFUDataNonKeyedColumns9() != null)
            this.local_dFUDataNonKeyedColumns9 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns9());
        if (raw.getDFUDataNonKeyedColumns10() != null)
            this.local_dFUDataNonKeyedColumns10 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns10());
        if (raw.getDFUDataNonKeyedColumns11() != null)
            this.local_dFUDataNonKeyedColumns11 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns11());
        if (raw.getDFUDataNonKeyedColumns12() != null)
            this.local_dFUDataNonKeyedColumns12 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns12());
        if (raw.getDFUDataNonKeyedColumns13() != null)
            this.local_dFUDataNonKeyedColumns13 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns13());
        if (raw.getDFUDataNonKeyedColumns14() != null)
            this.local_dFUDataNonKeyedColumns14 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns14());
        if (raw.getDFUDataNonKeyedColumns15() != null)
            this.local_dFUDataNonKeyedColumns15 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns15());
        if (raw.getDFUDataNonKeyedColumns16() != null)
            this.local_dFUDataNonKeyedColumns16 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns16());
        if (raw.getDFUDataNonKeyedColumns17() != null)
            this.local_dFUDataNonKeyedColumns17 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns17());
        if (raw.getDFUDataNonKeyedColumns18() != null)
            this.local_dFUDataNonKeyedColumns18 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns18());
        if (raw.getDFUDataNonKeyedColumns19() != null)
            this.local_dFUDataNonKeyedColumns19 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns19());
        if (raw.getDFUDataNonKeyedColumns20() != null)
            this.local_dFUDataNonKeyedColumns20 = new ArrayOfDFUDataColumnWrapper( raw.getDFUDataNonKeyedColumns20());
        this.local_rowCount = raw.getRowCount();
        this.local_showColumns = raw.getShowColumns();
        this.local_chooseFile = raw.getChooseFile();
        this.local_name = raw.getName();
        this.local_filterBy = raw.getFilterBy();
        this.local_filterForGoBack = raw.getFilterForGoBack();
        if (raw.getColumnsHidden() != null)
            this.local_columnsHidden = new ColumnsHidden_type1Wrapper( raw.getColumnsHidden());
        this.local_columnCount = raw.getColumnCount();
        this.local_startForGoback = raw.getStartForGoback();
        this.local_countForGoback = raw.getCountForGoback();
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();
        this.local_pageSize = raw.getPageSize();
        this.local_total = raw.getTotal();
        this.local_result = raw.getResult();
        this.local_msgToDisplay = raw.getMsgToDisplay();
        this.local_cluster = raw.getCluster();
        this.local_clusterType = raw.getClusterType();
        this.local_file = raw.getFile();
        this.local_key = raw.getKey();
        this.local_schemaOnly = raw.getSchemaOnly();
        this.local_roxieSelections = raw.getRoxieSelections();
        this.local_disableUppercaseTranslation = raw.getDisableUppercaseTranslation();
        this.local_autoUppercaseTranslation = raw.getAutoUppercaseTranslation();
        this.local_selectedKey = raw.getSelectedKey();

    }

    @Override
    public String toString()
    {
        return "DFUSearchDataResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "openLogicalName = " + local_openLogicalName + ", " + "logicalName = " + local_logicalName + ", " + "parentName = " + local_parentName + ", " + "startIndex = " + local_startIndex + ", " + "endIndex = " + local_endIndex + ", " + "dFUDataKeyedColumns1 = " + local_dFUDataKeyedColumns1 + ", " + "dFUDataKeyedColumns2 = " + local_dFUDataKeyedColumns2 + ", " + "dFUDataKeyedColumns3 = " + local_dFUDataKeyedColumns3 + ", " + "dFUDataKeyedColumns4 = " + local_dFUDataKeyedColumns4 + ", " + "dFUDataKeyedColumns5 = " + local_dFUDataKeyedColumns5 + ", " + "dFUDataKeyedColumns6 = " + local_dFUDataKeyedColumns6 + ", " + "dFUDataKeyedColumns7 = " + local_dFUDataKeyedColumns7 + ", " + "dFUDataKeyedColumns8 = " + local_dFUDataKeyedColumns8 + ", " + "dFUDataKeyedColumns9 = " + local_dFUDataKeyedColumns9 + ", " + "dFUDataKeyedColumns10 = " + local_dFUDataKeyedColumns10 + ", " + "dFUDataKeyedColumns11 = " + local_dFUDataKeyedColumns11 + ", " + "dFUDataKeyedColumns12 = " + local_dFUDataKeyedColumns12 + ", " + "dFUDataKeyedColumns13 = " + local_dFUDataKeyedColumns13 + ", " + "dFUDataKeyedColumns14 = " + local_dFUDataKeyedColumns14 + ", " + "dFUDataKeyedColumns15 = " + local_dFUDataKeyedColumns15 + ", " + "dFUDataKeyedColumns16 = " + local_dFUDataKeyedColumns16 + ", " + "dFUDataKeyedColumns17 = " + local_dFUDataKeyedColumns17 + ", " + "dFUDataKeyedColumns18 = " + local_dFUDataKeyedColumns18 + ", " + "dFUDataKeyedColumns19 = " + local_dFUDataKeyedColumns19 + ", " + "dFUDataKeyedColumns20 = " + local_dFUDataKeyedColumns20 + ", " + "dFUDataNonKeyedColumns1 = " + local_dFUDataNonKeyedColumns1 + ", " + "dFUDataNonKeyedColumns2 = " + local_dFUDataNonKeyedColumns2 + ", " + "dFUDataNonKeyedColumns3 = " + local_dFUDataNonKeyedColumns3 + ", " + "dFUDataNonKeyedColumns4 = " + local_dFUDataNonKeyedColumns4 + ", " + "dFUDataNonKeyedColumns5 = " + local_dFUDataNonKeyedColumns5 + ", " + "dFUDataNonKeyedColumns6 = " + local_dFUDataNonKeyedColumns6 + ", " + "dFUDataNonKeyedColumns7 = " + local_dFUDataNonKeyedColumns7 + ", " + "dFUDataNonKeyedColumns8 = " + local_dFUDataNonKeyedColumns8 + ", " + "dFUDataNonKeyedColumns9 = " + local_dFUDataNonKeyedColumns9 + ", " + "dFUDataNonKeyedColumns10 = " + local_dFUDataNonKeyedColumns10 + ", " + "dFUDataNonKeyedColumns11 = " + local_dFUDataNonKeyedColumns11 + ", " + "dFUDataNonKeyedColumns12 = " + local_dFUDataNonKeyedColumns12 + ", " + "dFUDataNonKeyedColumns13 = " + local_dFUDataNonKeyedColumns13 + ", " + "dFUDataNonKeyedColumns14 = " + local_dFUDataNonKeyedColumns14 + ", " + "dFUDataNonKeyedColumns15 = " + local_dFUDataNonKeyedColumns15 + ", " + "dFUDataNonKeyedColumns16 = " + local_dFUDataNonKeyedColumns16 + ", " + "dFUDataNonKeyedColumns17 = " + local_dFUDataNonKeyedColumns17 + ", " + "dFUDataNonKeyedColumns18 = " + local_dFUDataNonKeyedColumns18 + ", " + "dFUDataNonKeyedColumns19 = " + local_dFUDataNonKeyedColumns19 + ", " + "dFUDataNonKeyedColumns20 = " + local_dFUDataNonKeyedColumns20 + ", " + "rowCount = " + local_rowCount + ", " + "showColumns = " + local_showColumns + ", " + "chooseFile = " + local_chooseFile + ", " + "name = " + local_name + ", " + "filterBy = " + local_filterBy + ", " + "filterForGoBack = " + local_filterForGoBack + ", " + "columnsHidden = " + local_columnsHidden + ", " + "columnCount = " + local_columnCount + ", " + "startForGoback = " + local_startForGoback + ", " + "countForGoback = " + local_countForGoback + ", " + "start = " + local_start + ", " + "count = " + local_count + ", " + "pageSize = " + local_pageSize + ", " + "total = " + local_total + ", " + "result = " + local_result + ", " + "msgToDisplay = " + local_msgToDisplay + ", " + "cluster = " + local_cluster + ", " + "clusterType = " + local_clusterType + ", " + "file = " + local_file + ", " + "key = " + local_key + ", " + "schemaOnly = " + local_schemaOnly + ", " + "roxieSelections = " + local_roxieSelections + ", " + "disableUppercaseTranslation = " + local_disableUppercaseTranslation + ", " + "autoUppercaseTranslation = " + local_autoUppercaseTranslation + ", " + "selectedKey = " + local_selectedKey + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setOpenLogicalName( local_openLogicalName);
        raw.setLogicalName( local_logicalName);
        raw.setParentName( local_parentName);
        raw.setStartIndex( local_startIndex);
        raw.setEndIndex( local_endIndex);
        raw.setDFUDataKeyedColumns1( local_dFUDataKeyedColumns1.getRaw());
        raw.setDFUDataKeyedColumns2( local_dFUDataKeyedColumns2.getRaw());
        raw.setDFUDataKeyedColumns3( local_dFUDataKeyedColumns3.getRaw());
        raw.setDFUDataKeyedColumns4( local_dFUDataKeyedColumns4.getRaw());
        raw.setDFUDataKeyedColumns5( local_dFUDataKeyedColumns5.getRaw());
        raw.setDFUDataKeyedColumns6( local_dFUDataKeyedColumns6.getRaw());
        raw.setDFUDataKeyedColumns7( local_dFUDataKeyedColumns7.getRaw());
        raw.setDFUDataKeyedColumns8( local_dFUDataKeyedColumns8.getRaw());
        raw.setDFUDataKeyedColumns9( local_dFUDataKeyedColumns9.getRaw());
        raw.setDFUDataKeyedColumns10( local_dFUDataKeyedColumns10.getRaw());
        raw.setDFUDataKeyedColumns11( local_dFUDataKeyedColumns11.getRaw());
        raw.setDFUDataKeyedColumns12( local_dFUDataKeyedColumns12.getRaw());
        raw.setDFUDataKeyedColumns13( local_dFUDataKeyedColumns13.getRaw());
        raw.setDFUDataKeyedColumns14( local_dFUDataKeyedColumns14.getRaw());
        raw.setDFUDataKeyedColumns15( local_dFUDataKeyedColumns15.getRaw());
        raw.setDFUDataKeyedColumns16( local_dFUDataKeyedColumns16.getRaw());
        raw.setDFUDataKeyedColumns17( local_dFUDataKeyedColumns17.getRaw());
        raw.setDFUDataKeyedColumns18( local_dFUDataKeyedColumns18.getRaw());
        raw.setDFUDataKeyedColumns19( local_dFUDataKeyedColumns19.getRaw());
        raw.setDFUDataKeyedColumns20( local_dFUDataKeyedColumns20.getRaw());
        raw.setDFUDataNonKeyedColumns1( local_dFUDataNonKeyedColumns1.getRaw());
        raw.setDFUDataNonKeyedColumns2( local_dFUDataNonKeyedColumns2.getRaw());
        raw.setDFUDataNonKeyedColumns3( local_dFUDataNonKeyedColumns3.getRaw());
        raw.setDFUDataNonKeyedColumns4( local_dFUDataNonKeyedColumns4.getRaw());
        raw.setDFUDataNonKeyedColumns5( local_dFUDataNonKeyedColumns5.getRaw());
        raw.setDFUDataNonKeyedColumns6( local_dFUDataNonKeyedColumns6.getRaw());
        raw.setDFUDataNonKeyedColumns7( local_dFUDataNonKeyedColumns7.getRaw());
        raw.setDFUDataNonKeyedColumns8( local_dFUDataNonKeyedColumns8.getRaw());
        raw.setDFUDataNonKeyedColumns9( local_dFUDataNonKeyedColumns9.getRaw());
        raw.setDFUDataNonKeyedColumns10( local_dFUDataNonKeyedColumns10.getRaw());
        raw.setDFUDataNonKeyedColumns11( local_dFUDataNonKeyedColumns11.getRaw());
        raw.setDFUDataNonKeyedColumns12( local_dFUDataNonKeyedColumns12.getRaw());
        raw.setDFUDataNonKeyedColumns13( local_dFUDataNonKeyedColumns13.getRaw());
        raw.setDFUDataNonKeyedColumns14( local_dFUDataNonKeyedColumns14.getRaw());
        raw.setDFUDataNonKeyedColumns15( local_dFUDataNonKeyedColumns15.getRaw());
        raw.setDFUDataNonKeyedColumns16( local_dFUDataNonKeyedColumns16.getRaw());
        raw.setDFUDataNonKeyedColumns17( local_dFUDataNonKeyedColumns17.getRaw());
        raw.setDFUDataNonKeyedColumns18( local_dFUDataNonKeyedColumns18.getRaw());
        raw.setDFUDataNonKeyedColumns19( local_dFUDataNonKeyedColumns19.getRaw());
        raw.setDFUDataNonKeyedColumns20( local_dFUDataNonKeyedColumns20.getRaw());
        raw.setRowCount( local_rowCount);
        raw.setShowColumns( local_showColumns);
        raw.setChooseFile( local_chooseFile);
        raw.setName( local_name);
        raw.setFilterBy( local_filterBy);
        raw.setFilterForGoBack( local_filterForGoBack);
        raw.setColumnsHidden( local_columnsHidden.getRaw());
        raw.setColumnCount( local_columnCount);
        raw.setStartForGoback( local_startForGoback);
        raw.setCountForGoback( local_countForGoback);
        raw.setStart( local_start);
        raw.setCount( local_count);
        raw.setPageSize( local_pageSize);
        raw.setTotal( local_total);
        raw.setResult( local_result);
        raw.setMsgToDisplay( local_msgToDisplay);
        raw.setCluster( local_cluster);
        raw.setClusterType( local_clusterType);
        raw.setFile( local_file);
        raw.setKey( local_key);
        raw.setSchemaOnly( local_schemaOnly);
        raw.setRoxieSelections( local_roxieSelections);
        raw.setDisableUppercaseTranslation( local_disableUppercaseTranslation);
        raw.setAutoUppercaseTranslation( local_autoUppercaseTranslation);
        raw.setSelectedKey( local_selectedKey);
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
    public void setOpenLogicalName( String _openLogicalName )
    {
        this.local_openLogicalName = _openLogicalName;
    }
    public String getOpenLogicalName( )
    {
        return this.local_openLogicalName;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setParentName( String _parentName )
    {
        this.local_parentName = _parentName;
    }
    public String getParentName( )
    {
        return this.local_parentName;
    }
    public void setStartIndex( long _startIndex )
    {
        this.local_startIndex = _startIndex;
    }
    public long getStartIndex( )
    {
        return this.local_startIndex;
    }
    public void setEndIndex( long _endIndex )
    {
        this.local_endIndex = _endIndex;
    }
    public long getEndIndex( )
    {
        return this.local_endIndex;
    }
    public void setDFUDataKeyedColumns1( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns1 )
    {
        this.local_dFUDataKeyedColumns1 = _dFUDataKeyedColumns1;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns1( )
    {
        return this.local_dFUDataKeyedColumns1;
    }
    public void setDFUDataKeyedColumns2( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns2 )
    {
        this.local_dFUDataKeyedColumns2 = _dFUDataKeyedColumns2;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns2( )
    {
        return this.local_dFUDataKeyedColumns2;
    }
    public void setDFUDataKeyedColumns3( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns3 )
    {
        this.local_dFUDataKeyedColumns3 = _dFUDataKeyedColumns3;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns3( )
    {
        return this.local_dFUDataKeyedColumns3;
    }
    public void setDFUDataKeyedColumns4( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns4 )
    {
        this.local_dFUDataKeyedColumns4 = _dFUDataKeyedColumns4;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns4( )
    {
        return this.local_dFUDataKeyedColumns4;
    }
    public void setDFUDataKeyedColumns5( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns5 )
    {
        this.local_dFUDataKeyedColumns5 = _dFUDataKeyedColumns5;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns5( )
    {
        return this.local_dFUDataKeyedColumns5;
    }
    public void setDFUDataKeyedColumns6( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns6 )
    {
        this.local_dFUDataKeyedColumns6 = _dFUDataKeyedColumns6;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns6( )
    {
        return this.local_dFUDataKeyedColumns6;
    }
    public void setDFUDataKeyedColumns7( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns7 )
    {
        this.local_dFUDataKeyedColumns7 = _dFUDataKeyedColumns7;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns7( )
    {
        return this.local_dFUDataKeyedColumns7;
    }
    public void setDFUDataKeyedColumns8( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns8 )
    {
        this.local_dFUDataKeyedColumns8 = _dFUDataKeyedColumns8;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns8( )
    {
        return this.local_dFUDataKeyedColumns8;
    }
    public void setDFUDataKeyedColumns9( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns9 )
    {
        this.local_dFUDataKeyedColumns9 = _dFUDataKeyedColumns9;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns9( )
    {
        return this.local_dFUDataKeyedColumns9;
    }
    public void setDFUDataKeyedColumns10( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns10 )
    {
        this.local_dFUDataKeyedColumns10 = _dFUDataKeyedColumns10;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns10( )
    {
        return this.local_dFUDataKeyedColumns10;
    }
    public void setDFUDataKeyedColumns11( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns11 )
    {
        this.local_dFUDataKeyedColumns11 = _dFUDataKeyedColumns11;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns11( )
    {
        return this.local_dFUDataKeyedColumns11;
    }
    public void setDFUDataKeyedColumns12( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns12 )
    {
        this.local_dFUDataKeyedColumns12 = _dFUDataKeyedColumns12;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns12( )
    {
        return this.local_dFUDataKeyedColumns12;
    }
    public void setDFUDataKeyedColumns13( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns13 )
    {
        this.local_dFUDataKeyedColumns13 = _dFUDataKeyedColumns13;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns13( )
    {
        return this.local_dFUDataKeyedColumns13;
    }
    public void setDFUDataKeyedColumns14( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns14 )
    {
        this.local_dFUDataKeyedColumns14 = _dFUDataKeyedColumns14;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns14( )
    {
        return this.local_dFUDataKeyedColumns14;
    }
    public void setDFUDataKeyedColumns15( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns15 )
    {
        this.local_dFUDataKeyedColumns15 = _dFUDataKeyedColumns15;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns15( )
    {
        return this.local_dFUDataKeyedColumns15;
    }
    public void setDFUDataKeyedColumns16( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns16 )
    {
        this.local_dFUDataKeyedColumns16 = _dFUDataKeyedColumns16;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns16( )
    {
        return this.local_dFUDataKeyedColumns16;
    }
    public void setDFUDataKeyedColumns17( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns17 )
    {
        this.local_dFUDataKeyedColumns17 = _dFUDataKeyedColumns17;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns17( )
    {
        return this.local_dFUDataKeyedColumns17;
    }
    public void setDFUDataKeyedColumns18( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns18 )
    {
        this.local_dFUDataKeyedColumns18 = _dFUDataKeyedColumns18;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns18( )
    {
        return this.local_dFUDataKeyedColumns18;
    }
    public void setDFUDataKeyedColumns19( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns19 )
    {
        this.local_dFUDataKeyedColumns19 = _dFUDataKeyedColumns19;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns19( )
    {
        return this.local_dFUDataKeyedColumns19;
    }
    public void setDFUDataKeyedColumns20( ArrayOfDFUDataColumnWrapper _dFUDataKeyedColumns20 )
    {
        this.local_dFUDataKeyedColumns20 = _dFUDataKeyedColumns20;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataKeyedColumns20( )
    {
        return this.local_dFUDataKeyedColumns20;
    }
    public void setDFUDataNonKeyedColumns1( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns1 )
    {
        this.local_dFUDataNonKeyedColumns1 = _dFUDataNonKeyedColumns1;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns1( )
    {
        return this.local_dFUDataNonKeyedColumns1;
    }
    public void setDFUDataNonKeyedColumns2( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns2 )
    {
        this.local_dFUDataNonKeyedColumns2 = _dFUDataNonKeyedColumns2;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns2( )
    {
        return this.local_dFUDataNonKeyedColumns2;
    }
    public void setDFUDataNonKeyedColumns3( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns3 )
    {
        this.local_dFUDataNonKeyedColumns3 = _dFUDataNonKeyedColumns3;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns3( )
    {
        return this.local_dFUDataNonKeyedColumns3;
    }
    public void setDFUDataNonKeyedColumns4( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns4 )
    {
        this.local_dFUDataNonKeyedColumns4 = _dFUDataNonKeyedColumns4;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns4( )
    {
        return this.local_dFUDataNonKeyedColumns4;
    }
    public void setDFUDataNonKeyedColumns5( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns5 )
    {
        this.local_dFUDataNonKeyedColumns5 = _dFUDataNonKeyedColumns5;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns5( )
    {
        return this.local_dFUDataNonKeyedColumns5;
    }
    public void setDFUDataNonKeyedColumns6( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns6 )
    {
        this.local_dFUDataNonKeyedColumns6 = _dFUDataNonKeyedColumns6;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns6( )
    {
        return this.local_dFUDataNonKeyedColumns6;
    }
    public void setDFUDataNonKeyedColumns7( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns7 )
    {
        this.local_dFUDataNonKeyedColumns7 = _dFUDataNonKeyedColumns7;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns7( )
    {
        return this.local_dFUDataNonKeyedColumns7;
    }
    public void setDFUDataNonKeyedColumns8( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns8 )
    {
        this.local_dFUDataNonKeyedColumns8 = _dFUDataNonKeyedColumns8;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns8( )
    {
        return this.local_dFUDataNonKeyedColumns8;
    }
    public void setDFUDataNonKeyedColumns9( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns9 )
    {
        this.local_dFUDataNonKeyedColumns9 = _dFUDataNonKeyedColumns9;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns9( )
    {
        return this.local_dFUDataNonKeyedColumns9;
    }
    public void setDFUDataNonKeyedColumns10( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns10 )
    {
        this.local_dFUDataNonKeyedColumns10 = _dFUDataNonKeyedColumns10;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns10( )
    {
        return this.local_dFUDataNonKeyedColumns10;
    }
    public void setDFUDataNonKeyedColumns11( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns11 )
    {
        this.local_dFUDataNonKeyedColumns11 = _dFUDataNonKeyedColumns11;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns11( )
    {
        return this.local_dFUDataNonKeyedColumns11;
    }
    public void setDFUDataNonKeyedColumns12( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns12 )
    {
        this.local_dFUDataNonKeyedColumns12 = _dFUDataNonKeyedColumns12;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns12( )
    {
        return this.local_dFUDataNonKeyedColumns12;
    }
    public void setDFUDataNonKeyedColumns13( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns13 )
    {
        this.local_dFUDataNonKeyedColumns13 = _dFUDataNonKeyedColumns13;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns13( )
    {
        return this.local_dFUDataNonKeyedColumns13;
    }
    public void setDFUDataNonKeyedColumns14( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns14 )
    {
        this.local_dFUDataNonKeyedColumns14 = _dFUDataNonKeyedColumns14;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns14( )
    {
        return this.local_dFUDataNonKeyedColumns14;
    }
    public void setDFUDataNonKeyedColumns15( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns15 )
    {
        this.local_dFUDataNonKeyedColumns15 = _dFUDataNonKeyedColumns15;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns15( )
    {
        return this.local_dFUDataNonKeyedColumns15;
    }
    public void setDFUDataNonKeyedColumns16( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns16 )
    {
        this.local_dFUDataNonKeyedColumns16 = _dFUDataNonKeyedColumns16;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns16( )
    {
        return this.local_dFUDataNonKeyedColumns16;
    }
    public void setDFUDataNonKeyedColumns17( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns17 )
    {
        this.local_dFUDataNonKeyedColumns17 = _dFUDataNonKeyedColumns17;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns17( )
    {
        return this.local_dFUDataNonKeyedColumns17;
    }
    public void setDFUDataNonKeyedColumns18( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns18 )
    {
        this.local_dFUDataNonKeyedColumns18 = _dFUDataNonKeyedColumns18;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns18( )
    {
        return this.local_dFUDataNonKeyedColumns18;
    }
    public void setDFUDataNonKeyedColumns19( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns19 )
    {
        this.local_dFUDataNonKeyedColumns19 = _dFUDataNonKeyedColumns19;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns19( )
    {
        return this.local_dFUDataNonKeyedColumns19;
    }
    public void setDFUDataNonKeyedColumns20( ArrayOfDFUDataColumnWrapper _dFUDataNonKeyedColumns20 )
    {
        this.local_dFUDataNonKeyedColumns20 = _dFUDataNonKeyedColumns20;
    }
    public ArrayOfDFUDataColumnWrapper getDFUDataNonKeyedColumns20( )
    {
        return this.local_dFUDataNonKeyedColumns20;
    }
    public void setRowCount( long _rowCount )
    {
        this.local_rowCount = _rowCount;
    }
    public long getRowCount( )
    {
        return this.local_rowCount;
    }
    public void setShowColumns( String _showColumns )
    {
        this.local_showColumns = _showColumns;
    }
    public String getShowColumns( )
    {
        return this.local_showColumns;
    }
    public void setChooseFile( int _chooseFile )
    {
        this.local_chooseFile = _chooseFile;
    }
    public int getChooseFile( )
    {
        return this.local_chooseFile;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setFilterBy( String _filterBy )
    {
        this.local_filterBy = _filterBy;
    }
    public String getFilterBy( )
    {
        return this.local_filterBy;
    }
    public void setFilterForGoBack( String _filterForGoBack )
    {
        this.local_filterForGoBack = _filterForGoBack;
    }
    public String getFilterForGoBack( )
    {
        return this.local_filterForGoBack;
    }
    public void setColumnsHidden( ColumnsHidden_type1Wrapper _columnsHidden )
    {
        this.local_columnsHidden = _columnsHidden;
    }
    public ColumnsHidden_type1Wrapper getColumnsHidden( )
    {
        return this.local_columnsHidden;
    }
    public void setColumnCount( int _columnCount )
    {
        this.local_columnCount = _columnCount;
    }
    public int getColumnCount( )
    {
        return this.local_columnCount;
    }
    public void setStartForGoback( long _startForGoback )
    {
        this.local_startForGoback = _startForGoback;
    }
    public long getStartForGoback( )
    {
        return this.local_startForGoback;
    }
    public void setCountForGoback( int _countForGoback )
    {
        this.local_countForGoback = _countForGoback;
    }
    public int getCountForGoback( )
    {
        return this.local_countForGoback;
    }
    public void setStart( long _start )
    {
        this.local_start = _start;
    }
    public long getStart( )
    {
        return this.local_start;
    }
    public void setCount( long _count )
    {
        this.local_count = _count;
    }
    public long getCount( )
    {
        return this.local_count;
    }
    public void setPageSize( long _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public long getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setTotal( long _total )
    {
        this.local_total = _total;
    }
    public long getTotal( )
    {
        return this.local_total;
    }
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
    public void setMsgToDisplay( String _msgToDisplay )
    {
        this.local_msgToDisplay = _msgToDisplay;
    }
    public String getMsgToDisplay( )
    {
        return this.local_msgToDisplay;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setClusterType( String _clusterType )
    {
        this.local_clusterType = _clusterType;
    }
    public String getClusterType( )
    {
        return this.local_clusterType;
    }
    public void setFile( String _file )
    {
        this.local_file = _file;
    }
    public String getFile( )
    {
        return this.local_file;
    }
    public void setKey( String _key )
    {
        this.local_key = _key;
    }
    public String getKey( )
    {
        return this.local_key;
    }
    public void setSchemaOnly( boolean _schemaOnly )
    {
        this.local_schemaOnly = _schemaOnly;
    }
    public boolean getSchemaOnly( )
    {
        return this.local_schemaOnly;
    }
    public void setRoxieSelections( boolean _roxieSelections )
    {
        this.local_roxieSelections = _roxieSelections;
    }
    public boolean getRoxieSelections( )
    {
        return this.local_roxieSelections;
    }
    public void setDisableUppercaseTranslation( boolean _disableUppercaseTranslation )
    {
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;
    }
    public boolean getDisableUppercaseTranslation( )
    {
        return this.local_disableUppercaseTranslation;
    }
    public void setAutoUppercaseTranslation( boolean _autoUppercaseTranslation )
    {
        this.local_autoUppercaseTranslation = _autoUppercaseTranslation;
    }
    public boolean getAutoUppercaseTranslation( )
    {
        return this.local_autoUppercaseTranslation;
    }
    public void setSelectedKey( String _selectedKey )
    {
        this.local_selectedKey = _selectedKey;
    }
    public String getSelectedKey( )
    {
        return this.local_selectedKey;
    }
}