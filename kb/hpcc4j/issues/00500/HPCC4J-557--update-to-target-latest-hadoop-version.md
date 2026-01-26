---
id: jira-HPCC4J-557
title: HPCC4J-557 – Update to target latest hadoop version
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-557"
project: HPCC4J
key: HPCC4J-557
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-11-20
updated: 2023-11-27
resolved: 2023-11-27
components:
  - BuildPackaging
  - dfsclient
fixVersions: []
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
Update to target latest hadoop version

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "current dependency version of Hadoop causes security scanners to report potential security vulnerabilities (even is dep is scoped out in release)."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
