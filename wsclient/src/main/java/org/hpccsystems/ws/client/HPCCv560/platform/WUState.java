package org.hpccsystems.ws.client.HPCCv560.platform;

public enum WUState
{
    UNKNOWN,
    UNKNOWN_ONSERVER,

    // Not started ---
    SCHEDULED,
    SUBMITTED,

    // In motion ---
    RUNNING,
    ABORTING,
    BLOCKED,
    WAIT,
    COMPILING,

    // Completed ---
    COMPLETED,
    FAILED,
    ABORTED,
    ARCHIVED,
    COMPILED,

    LAST
}
