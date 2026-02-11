---
id: jira-HPCC4J-144
title: HPCC4J-144 – Utilize Java.util.Arrays.copyOfRange() in place of explicit array copies
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-144"
project: HPCC4J
key: HPCC4J-144
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-01-14
updated: 2019-02-26
resolved: 2019-02-26
components:   - WSClient
fixVersions:   - 7.0.10
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
Utilize Java.util.Arrays.copyOfRange() in place of explicit array copies

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
