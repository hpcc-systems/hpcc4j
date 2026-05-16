# Proper Issue Requirements

This document defines the required information for submitting valid issues, bug reports, and questions to this repository.

## General Requirements (All Issue Types)

All issues must include:

1. **Clear Title**: Concise description of the problem or request (under 100 characters)
2. **Issue Type**: Specify whether this is a bug report, feature request, question, or documentation issue
3. **Description**: Clear explanation of the issue or request

## Bug Report Requirements

Bug reports must include:

### Required Fields

- **HPCC Systems Version**: The version of HPCC Systems you are using (e.g., 8.10.2, 9.0.0)
- **Java Version**: Your Java version (e.g., Java 11, Java 17)
- **Operating System**: OS and version (e.g., Ubuntu 22.04, Windows 11, macOS 13)
- **Affected Component**: Which module is affected (e.g., wsclient, dfsclient, spark-hpcc, commons-hpcc)

### Expected Behavior
- Clear description of what you expected to happen

### Actual Behavior
- Clear description of what actually happened
- Include complete error messages or stack traces (use code blocks)

### Reproduction Steps
Provide step-by-step instructions to reproduce the issue:
1. Step one
2. Step two
3. Step three
4. Observed result

### Code Sample (if applicable)
```java
// Minimal code example that demonstrates the issue
```

### Additional Context
- Any additional information, screenshots, or context that might help diagnose the problem

## Feature Request Requirements

Feature requests must include:

- **Use Case**: Describe the problem or scenario this feature would address
- **Proposed Solution**: Your suggested approach to solving the problem
- **Alternatives Considered**: Other solutions you've considered (if any)
- **Benefits**: Who would benefit from this feature and how

## Question Requirements

Questions should include:

- **Context**: What are you trying to accomplish?
- **What You've Tried**: Steps or approaches you've already attempted
- **Specific Question**: Clear, focused question
- **Code Example**: Relevant code snippets (if applicable)
- **Documentation References**: Links to any documentation you've already consulted

## Documentation Issue Requirements

Documentation issues must include:

- **Document Location**: URL or path to the documentation in question
- **Issue Description**: What is incorrect, unclear, or missing
- **Suggested Improvement**: How the documentation should be corrected or improved (if applicable)

## Quality Standards

### Do ✓
- Use proper markdown formatting for code, errors, and logs
- Be specific and provide concrete examples
- Include all relevant version information
- Search existing issues before creating a new one
- Provide minimal reproducible examples
- Use descriptive variable names in code samples

### Don't ✗
- Submit vague descriptions like "it doesn't work"
- Paste large blocks of unformatted code or logs
- Include sensitive information (passwords, API keys, personal data)
- Submit duplicate issues without referencing the original
- Mix multiple unrelated issues in one report
- Use screenshots of text instead of copy-pasting the actual text

## Examples

### Good Bug Report
```
Title: NullPointerException when connecting to HPCC cluster with SSL enabled

**Issue Type**: Bug Report

**HPCC Systems Version**: 9.0.2
**Java Version**: Java 17.0.5
**OS**: Ubuntu 22.04
**Component**: wsclient

**Expected Behavior**: 
Should successfully connect to HPCC cluster with SSL enabled

**Actual Behavior**:
Connection fails with NullPointerException

**Reproduction Steps**:
1. Create HPCCWsClient with SSL enabled
2. Call any WsSQL method
3. Exception is thrown

**Code Sample**:
[minimal code example]

**Error Message**:
[complete stack trace]
```

### Poor Bug Report
```
Title: Connection doesn't work

It's broken when I try to connect. Please fix.
```

## Validation

Issues that do not meet these requirements will be labeled with `needs-more-information` and the reporter will be asked to provide the missing details.
