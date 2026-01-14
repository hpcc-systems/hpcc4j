# HPCC4J Issue Validation Prompt

You are analyzing a GitHub issue for the HPCC4J project, a Java library for interacting with HPCC Systems clusters. Your task is to determine if the issue contains sufficient information for developers to investigate and resolve it.

## Issue Details

**Title:** {ISSUE_TITLE}

**Body:**
{ISSUE_BODY}

## Analysis Task

Perform a comprehensive validation of this issue against the checklist below and output a structured markdown analysis.

## Validation Checklist

### 1. Issue Type Classification
- [ ] Is this a bug report, feature request, question, or documentation issue?
- [ ] Is the issue type clearly indicated or can be inferred?

### 2. Problem Description
- [ ] Is the problem described clearly and specifically?
- [ ] Can you understand what the user is trying to accomplish?
- [ ] Is there a distinction between expected vs actual behavior?

### 3. Reproduction Steps
For bug reports, check if the issue includes:
- [ ] Step-by-step instructions to reproduce the problem
- [ ] Sample code that demonstrates the issue
- [ ] Minimal reproducible example (if applicable)
- [ ] Data or file names involved in the issue

### 4. HPCC4J Module Identification
Determine which module(s) are affected:
- **wsclient** - Web service clients for HPCC ESP services
- **dfsclient** - Direct file system access to HPCC distributed files
- **spark-hpcc** - Spark connector for reading/writing HPCC datasets
- **clienttools** - Java interface to HPCC client tools (eclcc)
- **rdf2hpcc** - RDF data ingestion tool
- **commons-hpcc** - Common utilities

Is the affected module clearly stated or identifiable?

### 5. Version Information

#### HPCC4J Version
- [ ] Is the HPCC4J version specified?
- [ ] Is it a valid version number (e.g., 9.x.x, 10.x.x)?
- [ ] Can be found in `pom.xml` dependency declaration or Maven Central

**How to find:** Check your `pom.xml` dependency:
```xml
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>wsclient</artifactId>
    <version>X.X.X</version>
</dependency>
```
Or run: `mvn dependency:tree | grep hpccsystems`

#### HPCC Systems Platform Version
- [ ] Is the HPCC Systems cluster version specified?
- [ ] Is it a valid HPCC version (e.g., 7.x.x, 8.x.x, 9.x.x)?
- [ ] Valid major versions: 7, 8, 9, 10 (as of 2025)

**How to find:** 
- ESP web interface: Check footer or About page
- Command line: `eclcc --version` on HPCC server
- API call: Query WsTopology service

**Compatibility Note:** HPCC4J versions should generally align with HPCC platform versions (e.g., HPCC4J 9.x works with HPCC 9.x)

#### Java Version
- [ ] Is the Java version specified?
- [ ] Is it Java 8 or higher (minimum requirement)?
- [ ] Is it a supported LTS version (8, 11, 17, 21)?

**How to find:** Run `java -version` or `mvn -version`

#### Additional Version Info (for spark-hpcc module)
- [ ] Apache Spark version (if using spark-hpcc)
- [ ] Scala version (if applicable)

### 6. Connection Information

#### Cluster Details
- [ ] HPCC cluster endpoint/URL (e.g., http://mycluster:8010)
- [ ] Target cluster name (e.g., "mythor", "myroxie")
- [ ] Port information (default: 8010 for HTTP, 18010 for HTTPS)
- [ ] Protocol (HTTP vs HTTPS)

**How to find:**
- ESP URL used in browser
- Connection code: `new Connection("http://...")`

#### Authentication
- [ ] Authentication method mentioned (username/password, none, etc.)
- [ ] Any authentication errors or permission issues noted

**Privacy Note:** Never share actual passwords; just indicate if authentication is being used

### 7. Error Information

#### Error Messages
- [ ] Full error message text included
- [ ] Stack traces provided (if applicable)
- [ ] Log output included

**How to capture:**
- Java exceptions: Full stack trace from console or logs
- Enable debug logging: Add `-Dlog4j.configuration=log4j.properties` with DEBUG level
- Check `log4j.properties` or `log4j2.xml` configuration

#### Error Context
- [ ] When does the error occur (during connection, read, write, etc.)?
- [ ] Is the error consistent or intermittent?
- [ ] Any recent changes that might have triggered the issue?

### 8. Environment Information

- [ ] Operating system (Linux, Windows, macOS)
- [ ] Build tool (Maven, Gradle) and version
- [ ] Container/deployment environment (Docker, Kubernetes, etc.)
- [ ] Network configuration (proxy, firewall, VPN)

### 9. Code Examples

- [ ] Sample code showing the issue
- [ ] Connection initialization code
- [ ] Relevant configuration files (pom.xml snippet, application properties)

**Best practice:** Provide minimal reproducible code:
```java
Connection conn = new Connection("http://mycluster:8010");
conn.setCredentials("username", "password");
HPCCWsClient client = HPCCWsClient.get(conn);
// ... problematic operation
```

### 10. Additional Context

- [ ] Related files or datasets mentioned
- [ ] Workarounds attempted
- [ ] Links to related issues or documentation
- [ ] Timeline (when did this start happening?)

### 11. Pre-submission Checklist Compliance

The issue templates require users to confirm they've checked the Common Issues wiki:
- [ ] Does the issue indicate familiarity with documented solutions?
- [ ] Is this a known issue that's already documented in wiki?
- [ ] Should the user be directed to existing documentation?

**Wiki Link:** [Common Issues and Solutions wiki](https://github.com/hpcc-systems/hpcc4j/wiki/Common-Issues-and-Solutions)

### 12. Issue-Type Specific Requirements

#### For Bug Reports (must have):
- [ ] Steps to Reproduce (numbered list)
- [ ] Expected Behavior (clearly stated)
- [ ] Actual Behavior (with error messages/stack traces)
- [ ] HPCC Systems Version (required field)
- [ ] HPCC4J Module (required dropdown selection)
- [ ] HPCC4J Version (required field)
- [ ] Java Version (required field)
- [ ] Environment/Configuration (ESP endpoint, auth method, OS, build tool)
- [ ] Code Sample (minimal reproducible example)

#### For Feature Requests (must have):
- [ ] Feature Description (clear and concise)
- [ ] Problem Statement (use case and what problem it solves)
- [ ] Affected Module(s) (can be multiple)
- [ ] Priority/Impact level (Critical/High/Medium/Low)
- [ ] Example Usage (pseudo-code showing intended API)

Optional for Features:
- [ ] Proposed Solution (implementation ideas)
- [ ] Alternatives Considered (workarounds or other approaches)
- [ ] Contribution willingness (would submit PR)

#### For Questions (must have):
- [ ] Clear question with context about what they're trying to accomplish
- [ ] What they've already tried
- [ ] Confirmation they checked the Common Issues wiki

Optional for Questions:
- [ ] Related Module
- [ ] Code Sample or environment details

## Output Format

Provide your analysis as a **markdown document** (not JSON) with the following structure:

# Issue Validation Report

## Assessment
**Status:** [SUFFICIENT / NEEDS_MORE_INFO]  
**Confidence:** [HIGH / MEDIUM / LOW]

## Issue Classification
- **Type:** [bug/feature/question/documentation]
- **Affected Module:** [module name or "unclear" or "multiple"]
- **Priority:** [Critical/High/Medium/Low - based on severity and impact]

## Completeness Analysis

### Provided Information
- **HPCC4J Version:** [version or "NOT PROVIDED"]
- **HPCC Platform Version:** [version or "NOT PROVIDED"]
- **Java Version:** [version or "NOT PROVIDED"]
- **Reproduction Steps:** [YES/NO/PARTIAL/N/A]
- **Error Details:** [YES/NO/PARTIAL/N/A]
- **Code Sample:** [YES/NO/PARTIAL/N/A]
- **Environment Info:** [YES/NO/PARTIAL/N/A]

### Template Compliance
**Overall:** [FULL/PARTIAL/NONE]

For Bug Reports:
- Missing required fields: [list or "None"]
- Incomplete fields: [list or "None"]

For Feature Requests:
- Missing required fields: [list or "None"]
- Priority assessment provided: [YES/NO]

For Questions:
- Wiki check confirmed: [YES/NO/UNCLEAR]
- Sufficient context: [YES/NO]

## Critical Missing Information

[Bulleted list of the most important missing information that blocks resolution. Be specific.]

Example:
- HPCC4J version number (check pom.xml)
- Full error stack trace from console
- Java version (run `java -version`)

## Validation Issues

[List any version numbers or configurations that appear invalid or incompatible]

Example:
- HPCC4J 9.x with HPCC Platform 7.x may have compatibility issues
- Java 7 is below minimum requirement of Java 8

## Implicit Information

[Information that can be inferred from code snippets, error messages, or context but should be explicitly confirmed]

---

## Guidance Notes for Response Generation

### Suggested Labels
[Comma-separated list: bug, enhancement, question, needs-more-info, module-name, etc.]

### Should Check Documentation
[YES/NO - Does this appear to be something that might be documented?]

### Possible User Error
[YES/NO - Could this be a configuration or usage error?]

### Check for Duplicates
[YES/NO - Is this a common issue type that likely has duplicates?]

---

## Important Validation Notes

1. **Be constructive and helpful** - The goal is to help users provide the information needed
2. **Validate version numbers** - Check if provided versions are realistic and compatible
3. **Consider security** - Note if sensitive information was shared
4. **Module context matters** - Different modules have different common issues
5. **Look for implicit information** - Version info can sometimes be inferred
6. **Template adherence** - Issues should follow template requirements
7. **Wiki awareness** - Some issues may be documented
8. **Issue type specificity** - Apply different criteria based on type
9. **Priority alignment** - For feature requests, validate priority aligns with impact
