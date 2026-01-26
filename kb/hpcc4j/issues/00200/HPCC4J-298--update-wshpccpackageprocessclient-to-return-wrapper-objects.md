---
id: jira-HPCC4J-298
title: HPCC4J-298 – Update wsHpccPackageProcessClient to return Wrapper objects
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-298"
project: HPCC4J
key: HPCC4J-298
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-04-29
updated: 2020-04-30
resolved: 2020-04-30
components:   - WSClient
fixVersions:   - 7.8.10
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
Update wsHpccPackageProcessClient to return Wrapper objects

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Update the WSPackageProcess client to take/return wrapper objects instead of soap-generated objects"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
