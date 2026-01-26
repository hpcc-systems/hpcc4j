---
id: jira-HPCC4J-523
title: HPCC4J-523 – Incorrect Java version linking based on JDK
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-523"
project: HPCC4J
key: HPCC4J-523
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-07-12
updated: 2024-08-01
resolved: 2023-07-19
components: []
fixVersions:
  - 9.2.x
  - 9.4.82
  - 9.6.34
  - 9.8.8
  - 9.10.0
  - 9.4.84
  - 9.6.36
  - 9.8.10
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
Incorrect Java version linking based on JDK

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We currently specify the Java source and target version"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Which correctly compiles to the desired Java version regardless of the JDK version"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We do not specify the bootstrap class path, so the compiled code is linked to the JDK runtime signatures"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "JDK 9 introduced a simpler cross-compile with release targeting"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Solution: move our Java projects to the new release targeting to correct the linking issue."}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
