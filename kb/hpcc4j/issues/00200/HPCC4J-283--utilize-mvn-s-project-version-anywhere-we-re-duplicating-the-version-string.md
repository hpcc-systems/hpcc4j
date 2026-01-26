---
id: jira-HPCC4J-283
title: "HPCC4J-283 – Utilize mvn's project.version anywhere we're duplicating the version string"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-283"
project: HPCC4J
key: HPCC4J-283
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-21
updated: 2020-03-03
resolved: 2020-03-03
components:   - BuildPackaging
fixVersions:   - 7.6.32
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
Utilize mvn's project.version anywhere we're duplicating the version string

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
