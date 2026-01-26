---
id: jira-HPCC4J-322
title: HPCC4J-322 – JavaDoc failure in JDK 11
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-322"
project: HPCC4J
key: HPCC4J-322
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-07-30
updated: 2020-08-18
resolved: 2020-08-18
components:   - BuildPackaging
fixVersions:   - 7.10.x
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
JavaDoc failure in JDK 11

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[ERROR] Failed to execute goal org.apache.maven.plugins:maven-javadoc-plugin:3.2.0:javadoc (default-cli) on project commons-hpcc: An error has occurred in Javadoc report generation:"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] Exit code: 1 - javadoc: error - The code being documented uses modules but the packages defined in "}, {"type": "text", "text": "https://docs.oracle.com/javase/8/docs/api/", "marks": [{"type": "link", "attrs": {"href": "https://docs.oracle.com/javase/8/docs/api/"}}]}, {"type": "text", "text": " are in the unnamed module."}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR]"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] Command line was: cmd.exe /X /C \"\"C:\\Program Files\\RedHat\\java-11-openjdk-11.0.4-1\\bin\\javadoc.exe\" @options @packages\""}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR]"}, {"type": "hardBreak"}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
