package org.hpccsystems.ws.client.wrappers;

/**
 * Enums representing the string values expected by WUFile queries for "filetype".
 * Extracted from wsWorkunitsService.cpp, CWsWorkunitsEx::onWUFile
 * @author LeedDX
 *
 */
public enum WUFileType {
    CPP,
    ThorLog,
    ThorSlaveLog,
    EclAgentLog,
    XML,
    RES,
    DDL,
    WUECL,
    ArchiveQuery
}
