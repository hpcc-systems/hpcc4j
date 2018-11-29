/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.dfs.client;

/**
 * Tracks HPCC DAFILESERV transaction codes HPCC-Platform/common/remote/remoteerr.hpp 
 *
 */
public final class RFCCodes
{
    public static final char RFCStreamReadCmd                     = '\u002B'; //43 in decimal, value associated w/ stream read in dafilesrv
    public static final int  RFCStreamNoError                     = '\u0000';

    public static final int  DAFSERR_connection_failed            = -1;
    public static final int  DAFSERR_authenticate_failed          = -2;
    public static final int  DAFSERR_protocol_failure             = -3;
    public static final int  DAFSERR_serveraccept_failed          = -4;
    public static final int  DAFSERR_serverinit_failed            = -5;
    public static final int  DAFSERR_cmdstream_invalidexpiry      = -6;
    public static final int  DAFSERR_cmdstream_authexpired        = -7;
    public static final int  DAFSERR_cmdstream_unsupported_recfmt = -8;
    public static final int  DAFSERR_cmdstream_openfailure        = -9;
    public static final int  DAFSERR_cmdstream_protocol_failure   = -10;
    public static final int  DAFSERR_cmdstream_unauthorized       = -11;

    public static final int  RFSERR_InvalidCommand                = 8000;
    public static final int  RFSERR_NullFileIOHandle              = 8001;
    public static final int  RFSERR_InvalidFileIOHandle           = 8002;
    public static final int  RFSERR_TimeoutFileIOHandle           = 8003;
    public static final int  RFSERR_OpenFailed                    = 8004;
    public static final int  RFSERR_ReadFailed                    = 8005;
    public static final int  RFSERR_WriteFailed                   = 8006;
    public static final int  RFSERR_RenameFailed                  = 8007;
    public static final int  RFSERR_ExistsFailed                  = 8009;
    public static final int  RFSERR_RemoveFailed                  = 8010;
    public static final int  RFSERR_CloseFailed                   = 8011;
    public static final int  RFSERR_IsFileFailed                  = 8012;
    public static final int  RFSERR_IsDirectoryFailed             = 8013;
    public static final int  RFSERR_IsReadOnlyFailed              = 8014;
    public static final int  RFSERR_SetReadOnlyFailed             = 8015;
    public static final int  RFSERR_GetTimeFailed                 = 8016;
    public static final int  RFSERR_SetTimeFailed                 = 8017;
    public static final int  RFSERR_CreateDirFailed               = 8018;
    public static final int  RFSERR_GetDirFailed                  = 8019;
    public static final int  RFSERR_GetCrcFailed                  = 8020;
    public static final int  RFSERR_MoveFailed                    = 8021;
    public static final int  RFSERR_ExtractBlobElementsFailed     = 8022;
    public static final int  RFSERR_CopyFailed                    = 8023;
    public static final int  RFSERR_AppendFailed                  = 8024;
    public static final int  RFSERR_AuthenticateFailed            = 8025;
    public static final int  RFSERR_CopySectionFailed             = 8026;
    public static final int  RFSERR_TreeCopyFailed                = 8027;
    public static final int  RFSERR_StreamReadFailed              = 8028;
    public static final int  RFSERR_InternalError                 = 8029;

    public static final int  RAERR_InvalidUsernamePassword        = 8040;
    public static final int  RFSERR_MasterSeemsToHaveDied         = 8041;
    public static final int  RFSERR_TimeoutWaitSlave              = 8042;
    public static final int  RFSERR_TimeoutWaitConnect            = 8043;
    public static final int  RFSERR_TimeoutWaitMaster             = 8044;
    public static final int  RFSERR_NoConnectSlave                = 8045;
    public static final int  RFSERR_NoConnectSlaveXY              = 8046;
    public static final int  RFSERR_VersionMismatch               = 8047;
    public static final int  RFSERR_SetThrottleFailed             = 8048;
    public static final int  RFSERR_MaxQueueRequests              = 8049;
    public static final int  RFSERR_KeyIndexFailed                = 8050;
}
