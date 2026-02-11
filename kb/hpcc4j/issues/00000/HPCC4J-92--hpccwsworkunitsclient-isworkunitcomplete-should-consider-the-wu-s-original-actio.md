---
id: jira-HPCC4J-92
title: "HPCC4J-92 – HPCCWsWorkUnitsClient isWorkunitComplete() should consider the WU's original action"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-92"
project: HPCC4J
key: HPCC4J-92
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-01
updated: 2019-01-15
resolved: 2019-01-15
components:   - WSClient
fixVersions:   - 7.2.0
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
HPCCWsWorkUnitsClient isWorkunitComplete() should consider the WU's original action

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HPCCWsWorkUnitsClient\u00a0isWorkunitComplete currently ignores the WU's original action, and can therefore report false positives/negatives."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "A WU set to 'RUN' is not complete when it is in the 'Compiled' state, however a WU set to compile should be deemed complete if it is in the compiled state"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
