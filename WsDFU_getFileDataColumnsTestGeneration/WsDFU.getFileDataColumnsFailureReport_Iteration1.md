
# Test Failure Report - Iteration 1
# Service: WsDFU, Method: getFileDataColumns

## Summary
- Total tests run: 18
- Tests passed: 7
- Tests failed: 11
- Test results file: WsDFU_getFileDataColumnsTestGeneration/WsDFU.getFileDataColumnsTestResults_Iteration1.json
- Test file: wsclient/src/test/java/org/hpccsystems/ws/client/WsDFUClientTest.java

## Failed Tests Details


### 1. testGetFileDataColumnsBasicInteger

**Test Metadata:**
- Category: basic
- Description: Retrieve column metadata from a simple integer dataset with minimal parameters
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Simplest valid use case validating basic method operation with 2 integer columns

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:08:09 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsBasicInteger
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.126 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsBasicInteger(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.122 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsBasicInteger(WsDFUClientTest.java:551)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsBasicInteger:551 » ClassCast class org.h...
```

**Full Output (last 2000 chars):**
```
ger(WsDFUClientTest.java:551)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsBasicInteger:551 » ClassCast class org.h...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.626 s
[INFO] Finished at: 2025-11-07T12:08:10-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:07:53 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 2. testGetFileDataColumnsMultiType

**Test Metadata:**
- Category: basic
- Description: Retrieve column metadata from a dataset containing multiple data types
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Validates handling of diverse data types including primitives, strings, decimals, and nested structures (21+ columns)

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:08:47 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsMultiType
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.137 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsMultiType(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.132 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsMultiType(WsDFUClientTest.java:588)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsMultiType:588 » ClassCast class org.hpcc...
```

**Full Output (last 2000 chars):**
```
ype(WsDFUClientTest.java:588)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsMultiType:588 » ClassCast class org.hpcc...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.586 s
[INFO] Finished at: 2025-11-07T12:08:47-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:08:31 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 3. testGetFileDataColumnsNoCluster

**Test Metadata:**
- Category: basic
- Description: Retrieve column metadata without specifying cluster, relying on automatic file location
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Tests default behavior when cluster parameter is null - system should locate file automatically

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:09:25 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsNoCluster
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.153 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsNoCluster(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.148 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsNoCluster(WsDFUClientTest.java:642)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsNoCluster:642 » ClassCast class org.hpcc...
```

**Full Output (last 2000 chars):**
```
ter(WsDFUClientTest.java:642)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsNoCluster:642 » ClassCast class org.hpcc...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.930 s
[INFO] Finished at: 2025-11-07T12:09:25-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:09:08 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 4. testGetFileDataColumnsLargeFile

**Test Metadata:**
- Category: basic
- Description: Retrieve column metadata from a large dataset to validate performance and handling
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Validates that metadata retrieval is fast (< 5 seconds) and not dependent on file size (6.25M records)

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:10:02 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsLargeFile
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.113 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsLargeFile(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.11 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsLargeFile(WsDFUClientTest.java:674)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsLargeFile:674 » ClassCast class org.hpcc...
```

**Full Output (last 2000 chars):**
```
ile(WsDFUClientTest.java:674)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsLargeFile:674 » ClassCast class org.hpcc...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.774 s
[INFO] Finished at: 2025-11-07T12:10:03-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:09:46 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 5. testGetFileDataColumnsNestedDataset

**Test Metadata:**
- Category: basic
- Description: Validate retrieval of nested dataset columns (child columns)
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Critical test for nested/complex type handling - childDataset should contain 3 child columns

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:11:34 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsNestedDataset
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.125 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsNestedDataset(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.122 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsNestedDataset(WsDFUClientTest.java:745)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsNestedDataset:745 » ClassCast class org....
```

**Full Output (last 2000 chars):**
```
set(WsDFUClientTest.java:745)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsNestedDataset:745 » ClassCast class org....
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  37.312 s
[INFO] Finished at: 2025-11-07T12:11:35-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:11:18 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 6. testGetFileDataColumnsEmptyCluster

**Test Metadata:**
- Category: edge-case
- Description: Test behavior when cluster parameter is empty string (not null)
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Empty string should be treated same as null cluster parameter

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:12:12 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsEmptyCluster
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.13 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsEmptyCluster(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.126 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsEmptyCluster(WsDFUClientTest.java:786)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsEmptyCluster:786 » ClassCast class org.h...
```

**Full Output (last 2000 chars):**
```
ter(WsDFUClientTest.java:786)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsEmptyCluster:786 » ClassCast class org.h...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.880 s
[INFO] Finished at: 2025-11-07T12:12:13-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:11:56 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 7. testGetFileDataColumnsNoTildePrefix

**Test Metadata:**
- Category: edge-case
- Description: Test retrieval using logical name without '~' prefix
- Expected Outcome: SKIP
- Requires Data: True
- Required Dataset: N/A
- Notes: Tests name normalization - system may or may not require tilde prefix, exception acceptable

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:12:50 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsNoTildePrefix
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.136 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsNoTildePrefix(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.132 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsNoTildePrefix(WsDFUClientTest.java:804)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsNoTildePrefix:804 » ClassCast class org....
```

**Full Output (last 2000 chars):**
```
fix(WsDFUClientTest.java:804)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsNoTildePrefix:804 » ClassCast class org....
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  37.361 s
[INFO] Finished at: 2025-11-07T12:12:51-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:12:33 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 8. testGetFileDataColumnsWithWhitespace

**Test Metadata:**
- Category: edge-case
- Description: Test retrieval with leading/trailing whitespace in logical name
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Server-side code performs trim operation, whitespace should be handled correctly

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:13:27 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsWithWhitespace
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.134 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsWithWhitespace(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.13 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsWithWhitespace(WsDFUClientTest.java:826)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsWithWhitespace:826 » ClassCast class org...
```

**Full Output (last 2000 chars):**
```
ace(WsDFUClientTest.java:826)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsWithWhitespace:826 » ClassCast class org...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.103 s
[INFO] Finished at: 2025-11-07T12:13:28-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:13:11 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 9. testGetFileDataColumnsSuperfile

**Test Metadata:**
- Category: edge-case
- Description: Retrieve columns from a superfile without specifying chooseFile (default to first subfile)
- Expected Outcome: PASS
- Requires Data: True
- Required Dataset: N/A
- Notes: Validates superfile handling - should return columns from first subfile (all_types::200KB)

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:14:04 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsSuperfile
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.131 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsSuperfile(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.128 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsSuperfile(WsDFUClientTest.java:842)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsSuperfile:842 » ClassCast class org.hpcc...
```

**Full Output (last 2000 chars):**
```
ile(WsDFUClientTest.java:842)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsSuperfile:842 » ClassCast class org.hpcc...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  35.760 s
[INFO] Finished at: 2025-11-07T12:14:04-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:13:48 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 10. testGetFileDataColumnsCaseSensitivity

**Test Metadata:**
- Category: edge-case
- Description: Test if logical file names are case-sensitive
- Expected Outcome: SKIP
- Requires Data: True
- Required Dataset: N/A
- Notes: Tests uppercase filename - behavior depends on HPCC configuration (typically case-insensitive)

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:15:33 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsCaseSensitivity
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.14 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsCaseSensitivity(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.136 s  <<< ERROR!
java.lang.ClassCastException: class org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn cannot be cast to class [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; (org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn and [Lorg.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn; are in unnamed module of loader 'app')
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsCaseSensitivity(WsDFUClientTest.java:884)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsCaseSensitivity:884 » ClassCast class or...
```

**Full Output (last 2000 chars):**
```
ity(WsDFUClientTest.java:884)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsCaseSensitivity:884 » ClassCast class or...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.757 s
[INFO] Finished at: 2025-11-07T12:15:34-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:15:17 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---


### 11. testGetFileDataColumnsInvalidCluster

**Test Metadata:**
- Category: error-handling
- Description: Test behavior when cluster name doesn't exist
- Expected Outcome: PASS
- Requires Data: False
- Required Dataset: N/A
- Notes: Should throw ArrayOfEspExceptionWrapper indicating cluster not found or file not found on cluster

**Exit Code:** 1

**Error Message:**
```
25/11/07 12:18:46 Finished: org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsInvalidCluster
---------------------------------------------------------
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.204 s <<< FAILURE! - in org.hpccsystems.ws.client.WsDFUClientTest
[ERROR] testGetFileDataColumnsInvalidCluster(org.hpccsystems.ws.client.WsDFUClientTest)  Time elapsed: 5.199 s  <<< ERROR!
java.lang.Exception: Unexpected exception, expected<org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper> but was<java.lang.ClassCastException>
	at org.hpccsystems.ws.client.WsDFUClientTest.testGetFileDataColumnsInvalidCluster(WsDFUClientTest.java:970)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsInvalidCluster »  Unexpected exception, ...
```

**Full Output (last 2000 chars):**
```
ter(WsDFUClientTest.java:970)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   WsDFUClientTest.testGetFileDataColumnsInvalidCluster »  Unexpected exception, ...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.457 s
[INFO] Finished at: 2025-11-07T12:18:47-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project wsclient: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/james/Documents/Projects/Work/hpcc4j/wsclient/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Nov 07, 2025 12:18:30 PM io.opentelemetry.api.GlobalOpenTelemetry maybeAutoConfigureAndSetGlobal
INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

```

---

