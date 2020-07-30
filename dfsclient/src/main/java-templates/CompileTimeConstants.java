package org.hpccsystems.dfs.client;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CompileTimeConstants
{
    private static final Logger log = LogManager.getLogger(CompileTimeConstants.class);

    public static final boolean PROFILE_CODE = ${project.benchmarking};

    static
    {
        if (CompileTimeConstants.PROFILE_CODE)
        {
            log.info("Code profiling is turned on.");
        }
    }

}
