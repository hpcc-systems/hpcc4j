---
id: jira-HPCC4J-50
title: HPCC4J-50 – DFUFileDetailInfo Null ptr Exception
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-50"
project: HPCC4J
key: HPCC4J-50
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-08-04
updated: 2017-01-04
resolved: 2017-01-04
components:   - WSClient
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
DFUFileDetailInfo Null ptr Exception

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There are several calls to getters from the DFUFileDetail class within DFUFileDetailInfo.  The values these getters access can be null, and we don't safeguard against calling methods on null pointers."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
