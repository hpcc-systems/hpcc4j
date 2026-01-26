---
id: jira-HPCC4J-350
title: HPCC4J-350 – handle => in EclRecordParser
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-350"
project: HPCC4J
key: HPCC4J-350
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-05
updated: 2020-11-06
resolved: 2020-11-06
components:   - WSClient
fixVersions:   - 7.12.8
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
handle => in EclRecordParser

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Handle the => symbol in ecl record definitions. Update EclRecord.g4 and add a test."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
