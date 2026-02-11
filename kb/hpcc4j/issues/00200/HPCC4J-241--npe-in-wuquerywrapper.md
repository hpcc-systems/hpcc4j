---
id: jira-HPCC4J-241
title: HPCC4J-241 – NPE in WUQueryWrapper
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-241"
project: HPCC4J
key: HPCC4J-241
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-15
updated: 2019-10-21
resolved: 2019-10-21
components:   - WSClient
fixVersions:   - 7.6.6
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
NPE in WUQueryWrapper

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When converting WUQueryWrapper to a raw type, if sort order descending is null, an NPE occurs when converting that Boolean value to the raw type's boolean."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Convert the type of the descending variable from Boolean to boolean, default value false."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
