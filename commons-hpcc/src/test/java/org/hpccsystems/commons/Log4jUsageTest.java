/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2026 HPCC Systems®.

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

package org.hpccsystems.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Test suite for verifying log4j API usage patterns in HPCC4J.
 *
 * <p>This suite covers the specific log4j APIs used across the project so that
 * upgrading the log4j version can be validated without regressions:</p>
 * <ul>
 *   <li>Logger creation via {@code LogManager.getLogger(Class)}</li>
 *   <li>Logging at all levels used: trace, debug, info, warn, error</li>
 *   <li>Parameterized messages using {@code {}} placeholders</li>
 *   <li>String-concatenation messages</li>
 *   <li>Logging a {@link Throwable} as the sole argument</li>
 *   <li>Logging a message together with a {@link Throwable}</li>
 *   <li>Log-level filtering (messages below the configured threshold are suppressed)</li>
 *   <li>PatternLayout output format contains expected fields</li>
 * </ul>
 */
@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class Log4jUsageTest
{
    // -------------------------------------------------------------------------------
    // Inner CaptureAppender – stores LogEvents for assertion without extra deps
    // -------------------------------------------------------------------------------

    /**
     * A minimal in-memory appender that collects {@link LogEvent} instances so tests
     * can assert on what was actually logged without parsing formatted strings.
     *
     * <p>All mutation methods are synchronized because {@link #append} may be called
     * from multiple threads concurrently.</p>
     */
    static final class CaptureAppender extends AbstractAppender
    {
        private final List<LogEvent> capturedEvents =
                Collections.synchronizedList(new ArrayList<>());

        CaptureAppender(String name)
        {
            super(name, (Filter) null, (Layout<? extends Serializable>) null, true, Property.EMPTY_ARRAY);
        }

        @Override
        public synchronized void append(LogEvent event)
        {
            capturedEvents.add(event.toImmutable());
        }

        synchronized List<LogEvent> getEvents()
        {
            return Collections.unmodifiableList(new ArrayList<>(capturedEvents));
        }

        synchronized void clear()
        {
            capturedEvents.clear();
        }
    }

    // -------------------------------------------------------------------------------
    // Fields
    // -------------------------------------------------------------------------------

    private static final Logger log = LogManager.getLogger(Log4jUsageTest.class);

    private CaptureAppender captureAppender;
    private Level            previousRootLevel;

    // -------------------------------------------------------------------------------
    // Setup / teardown
    // -------------------------------------------------------------------------------

    /**
     * Adds a {@link CaptureAppender} to the root logger so each test can inspect
     * the events that were emitted.  The previous root level is saved and the level
     * is temporarily set to TRACE so that all levels are reachable.
     */
    @Before
    public void attachCaptureAppender()
    {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);

        // Save the effective root level so it can be restored after the test.
        previousRootLevel = ctx.getRootLogger().getLevel();

        Configuration config = ctx.getConfiguration();

        captureAppender = new CaptureAppender("CaptureAppender");
        captureAppender.start();

        config.addAppender(captureAppender);
        config.getRootLogger().addAppender(captureAppender, Level.TRACE, null);
        ctx.updateLoggers();

        // Ensure root level is TRACE so all levels are captured by default.
        Configurator.setRootLevel(Level.TRACE);
    }

    /**
     * Removes the {@link CaptureAppender} from the root logger after each test
     * and restores the root level to the value it had before the test ran.
     */
    @After
    public void detachCaptureAppender()
    {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        ctx.getConfiguration().getRootLogger().removeAppender("CaptureAppender");

        if (captureAppender != null)
        {
            captureAppender.stop();
            captureAppender = null;
        }

        ctx.updateLoggers();

        // Restore the root level that was in effect before this test ran.
        Configurator.setRootLevel(previousRootLevel != null ? previousRootLevel : Level.WARN);
    }

    // -------------------------------------------------------------------------------
    // Helper
    // -------------------------------------------------------------------------------

    /**
     * Returns the first {@link LogEvent} emitted by this test class's logger that
     * matches {@code level} and whose formatted message contains
     * {@code messageFragment}, or {@code null} if no such event exists.
     *
     * <p>Filtering by logger name avoids relying on {@code events.get(size-1)}, which
     * can pick up events from unrelated loggers or background threads.</p>
     */
    private LogEvent findEvent(Level level, String messageFragment)
    {
        String loggerName = Log4jUsageTest.class.getName();
        for (LogEvent e : captureAppender.getEvents())
        {
            if (!loggerName.equals(e.getLoggerName())) continue;
            if (!level.equals(e.getLevel())) continue;
            if (messageFragment != null
                    && !e.getMessage().getFormattedMessage().contains(messageFragment)) continue;
            return e;
        }
        return null;
    }

    // -------------------------------------------------------------------------------
    // Tests
    // -------------------------------------------------------------------------------

    /**
     * Verifies the standard logger-creation idiom used throughout the code base:
     * {@code LogManager.getLogger(ClassName.class)}.
     *
     * <p>The returned logger must be non-null and its name must match the fully
     * qualified class name.</p>
     */
    @Test
    public void testLoggerCreatedByClass()
    {
        Logger logger = LogManager.getLogger(Log4jUsageTest.class);

        assertNotNull("Logger must not be null", logger);
        assertEquals("Logger name must be the fully-qualified class name",
                Log4jUsageTest.class.getName(), logger.getName());
    }

    /**
     * Verifies that calling each log level used in HPCC4J – trace, debug, info,
     * warn, and error – with a plain string message completes without throwing an
     * exception and results in a captured event at the expected level.
     */
    @Test
    public void testAllLogLevels_noExceptions()
    {
        log.trace("trace message");
        log.debug("debug message");
        log.info("info message");
        log.warn("warn message");
        log.error("error message");

        List<LogEvent> events = captureAppender.getEvents();
        // Each call must have produced one event, so at least 5 events total
        assertTrue("Expected at least 5 captured events", events.size() >= 5);

        boolean hasTrace = false, hasDebug = false, hasInfo = false,
                hasWarn  = false, hasError = false;

        for (LogEvent e : events)
        {
            if (Log4jUsageTest.class.getName().equals(e.getLoggerName()))
            {
                Level lvl = e.getLevel();
                if (lvl.equals(Level.TRACE)) hasTrace = true;
                else if (lvl.equals(Level.DEBUG)) hasDebug = true;
                else if (lvl.equals(Level.INFO))  hasInfo  = true;
                else if (lvl.equals(Level.WARN))  hasWarn  = true;
                else if (lvl.equals(Level.ERROR)) hasError = true;
            }
        }

        assertTrue("Expected a TRACE event", hasTrace);
        assertTrue("Expected a DEBUG event", hasDebug);
        assertTrue("Expected an INFO event",  hasInfo);
        assertTrue("Expected a WARN event",   hasWarn);
        assertTrue("Expected an ERROR event", hasError);
    }

    /**
     * Verifies single-parameter {@code {}} placeholder substitution as used
     * in the test logger: {@code log.info("Testing {} level logging", "Info")}.
     */
    @Test
    public void testParameterizedMessage_singleParam()
    {
        log.info("Connected to host {}", "myhost:8010");

        LogEvent event = findEvent(Level.INFO, "Connected to host myhost:8010");
        assertNotNull("Expected an INFO event with the parameterized message", event);

        assertEquals("Parameterized message should substitute {} with the argument",
                "Connected to host myhost:8010", event.getMessage().getFormattedMessage());
    }

    /**
     * Verifies multi-parameter {@code {}} placeholder substitution – multiple
     * placeholders each receive their corresponding argument.
     */
    @Test
    public void testParameterizedMessage_multipleParams()
    {
        log.debug("File part {} copied from {}", 3, "192.168.1.100");

        LogEvent event = findEvent(Level.DEBUG, "File part 3 copied from 192.168.1.100");
        assertNotNull("Expected a DEBUG event with the multi-param message", event);

        assertEquals("All {} placeholders should be substituted",
                "File part 3 copied from 192.168.1.100", event.getMessage().getFormattedMessage());
    }

    /**
     * Verifies that pre-concatenated strings (the dominant pattern in the code
     * base) are logged as-is without modification.
     */
    @Test
    public void testStringConcatenationMessage()
    {
        String fileName = "spark::test::dataset";
        log.debug("Reading file: " + fileName);

        LogEvent event = findEvent(Level.DEBUG, "Reading file: spark::test::dataset");
        assertNotNull("Expected a DEBUG event with the concatenated message", event);

        assertEquals("String-concatenated message should be logged unchanged",
                "Reading file: spark::test::dataset", event.getMessage().getFormattedMessage());
    }

    /**
     * Verifies the pattern {@code log.error(throwable)} – logging a {@link Throwable}
     * as the sole argument.  This emits the exception message/class as the formatted
     * log message and stores the throwable in the event.
     */
    @Test
    public void testThrowableAsOnlyArgument()
    {
        RuntimeException ex = new RuntimeException("connection refused");
        log.error(ex);

        // Filter by level and a fragment that log4j includes when logging a bare Throwable.
        LogEvent event = findEvent(Level.ERROR, "RuntimeException");
        if (event == null)
        {
            event = findEvent(Level.ERROR, "connection refused");
        }
        assertNotNull("Expected an ERROR event referencing the RuntimeException", event);

        String formatted = event.getMessage().getFormattedMessage();
        assertTrue("Formatted message must reference the exception",
                formatted.contains("RuntimeException") || formatted.contains("connection refused"));
    }

    /**
     * Verifies the pattern {@code log.error("message", throwable)} – logging a
     * human-readable message alongside a {@link Throwable}.  The event must carry
     * both the message string and the throwable.
     */
    @Test
    public void testMessageWithThrowable()
    {
        IOException cause = new IOException("timeout after 30s");
        log.error("Failed to read remote file part: " + cause.getMessage(), cause);

        LogEvent event = findEvent(Level.ERROR, "Failed to read remote file part:");
        assertNotNull("Expected an ERROR event with the exception message", event);

        assertTrue("Message must contain the text passed to the logger",
                event.getMessage().getFormattedMessage().contains("Failed to read remote file part:"));
        assertNotNull("LogEvent must carry the Throwable", event.getThrown());
        assertEquals("LogEvent must carry the correct Throwable", cause, event.getThrown());
    }

    /**
     * Verifies that log-level filtering works correctly: when the root logger is
     * configured at INFO, DEBUG and TRACE messages must not reach appenders, while
     * INFO, WARN, and ERROR messages must still be captured.
     */
    @Test
    public void testLogLevelFiltering_belowThresholdSuppressed()
    {
        Configurator.setRootLevel(Level.INFO);
        captureAppender.clear();

        log.trace("should be suppressed");
        log.debug("should be suppressed");
        log.info("should be captured");
        log.warn("should be captured");
        log.error("should be captured");

        List<LogEvent> events = captureAppender.getEvents();

        for (LogEvent e : events)
        {
            if (Log4jUsageTest.class.getName().equals(e.getLoggerName()))
            {
                assertFalse("TRACE must be suppressed at INFO threshold",
                        Level.TRACE.equals(e.getLevel()));
                assertFalse("DEBUG must be suppressed at INFO threshold",
                        Level.DEBUG.equals(e.getLevel()));
            }
        }

        boolean hasInfo = false, hasWarn = false, hasError = false;
        for (LogEvent e : events)
        {
            if (Log4jUsageTest.class.getName().equals(e.getLoggerName()))
            {
                if (Level.INFO.equals(e.getLevel()))  hasInfo  = true;
                if (Level.WARN.equals(e.getLevel()))  hasWarn  = true;
                if (Level.ERROR.equals(e.getLevel())) hasError = true;
            }
        }

        assertTrue("INFO must pass through at INFO threshold",  hasInfo);
        assertTrue("WARN must pass through at INFO threshold",  hasWarn);
        assertTrue("ERROR must pass through at INFO threshold", hasError);
    }

    /**
     * Verifies that configuring a higher threshold (ERROR) suppresses all lower
     * levels, and that only ERROR events pass through.
     */
    @Test
    public void testLogLevelFiltering_onlyErrorPasses()
    {
        Configurator.setRootLevel(Level.ERROR);
        captureAppender.clear();

        log.trace("suppressed");
        log.debug("suppressed");
        log.info("suppressed");
        log.warn("suppressed");
        log.error("this must appear");

        List<LogEvent> events = captureAppender.getEvents();

        for (LogEvent e : events)
        {
            if (Log4jUsageTest.class.getName().equals(e.getLoggerName()))
            {
                assertEquals("Only ERROR events should appear when root level is ERROR",
                        Level.ERROR, e.getLevel());
            }
        }

        boolean hasError = false;
        for (LogEvent e : events)
        {
            if (Log4jUsageTest.class.getName().equals(e.getLoggerName())
                    && Level.ERROR.equals(e.getLevel()))
            {
                hasError = true;
            }
        }
        assertTrue("ERROR event must be captured", hasError);
    }

    /**
     * Verifies that the {@link org.apache.logging.log4j.core.layout.PatternLayout}
     * configured in {@code log4j2-test.xml} for the Console appender produces output
     * that includes the log level, logger name, and message text.
     *
     * <p>This is verified indirectly: the {@link LogEvent} API exposes the same data
     * that the layout formats, so we confirm the event properties are set correctly.</p>
     */
    @Test
    public void testPatternLayoutOutputFields()
    {
        String expectedMessage = "Pattern layout field verification";
        log.warn(expectedMessage);

        List<LogEvent> events = captureAppender.getEvents();
        assertFalse("No events were captured", events.isEmpty());

        LogEvent last = null;
        for (LogEvent e : events)
        {
            if (Log4jUsageTest.class.getName().equals(e.getLoggerName())
                    && Level.WARN.equals(e.getLevel()))
            {
                last = e;
            }
        }

        assertNotNull("Expected a WARN event from this logger", last);
        assertEquals("Level field must be WARN",    Level.WARN, last.getLevel());
        assertEquals("Logger name field must match", Log4jUsageTest.class.getName(), last.getLoggerName());
        assertEquals("Message field must match",     expectedMessage,
                last.getMessage().getFormattedMessage());
        assertNotNull("Thread name field must be set", last.getThreadName());
        assertTrue("Timestamp must be positive", last.getTimeMillis() > 0);
    }

}
