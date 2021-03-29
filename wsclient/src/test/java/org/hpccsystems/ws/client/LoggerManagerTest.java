package org.hpccsystems.ws.client;

import static org.junit.Assume.assumeNotNull;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class LoggerManagerTest
{
	private static final Logger log  = LogManager.getLogger(LoggerManagerTest.class);

    @Test
    public void loggerTest()
    {
        URL log4j2config = ClassLoader.getSystemResource("log4j2.xml");
        assumeNotNull(log4j2config);
        System.out.println("Detected log4j2 config: " + String.valueOf(log4j2config));

        log.trace("Testing {} level logging", "Trace");
        log.debug("Testing {} level logging", "Debug");
        log.info("Testing {} level logging", "Info");
        log.error("Testing {} level logging", "Error");
    }

}
