---
id: jira-HPCC4J-304
title: HPCC4J-304 – build time mechanism to conditionally include performance logic
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-304"
project: HPCC4J
key: HPCC4J-304
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-05-04
updated: 2020-07-28
resolved: 2020-07-28
components:   - BuildPackaging
fixVersions:   - 7.8.x
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
build time mechanism to conditionally include performance logic

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Consider using templating-maven-plugin as a mechanism setting preprocessing directives for the compiler to compile out unreachable code. The benchmark profile should generate a new appropriately named output jar file"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
