---
id: jira-HPCC4J-249
title: HPCC4J-249 – Remove superluous dependancies
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-249"
project: HPCC4J
key: HPCC4J-249
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-29
updated: 2024-04-08
resolved: 2019-10-29
components:   - BuildPackaging
fixVersions:   - 7.6.8
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
Remove superluous dependancies

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "At some point, the Axis1 and related dependencies snuck back into the pom, all superfluous deps should be removed "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
