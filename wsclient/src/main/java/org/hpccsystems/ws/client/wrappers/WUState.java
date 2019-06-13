package org.hpccsystems.ws.client.wrappers;

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
    PAUSED,

    // Completed ---
    COMPLETED,
    FAILED,
    ABORTED,
    ARCHIVED,
    COMPILED,

    LAST
}
