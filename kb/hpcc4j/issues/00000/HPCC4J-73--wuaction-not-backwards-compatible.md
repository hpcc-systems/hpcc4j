---
id: jira-HPCC4J-73
title: HPCC4J-73 – WUAction not backwards compatible 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-73"
project: HPCC4J
key: HPCC4J-73
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-01-09
updated: 2017-03-20
resolved: 2017-03-20
components:   - WSClient
fixVersions:   - 1.0.0
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
WUAction not backwards compatible 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "1.0.0 of wsclient trying to interact with older ESP's with a wsworkunits < 1.57 will fail to recognize WUActionType in the soap request.  The WUActionType is an enumerated value only available in version > 1.57.  The appropriate tag for < 1.57 is ActionType.  I have utilized th fallback soap client which uses the 1.56 interface to make the call if the WUAction call fails with the current interface."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Also we will be making the exception message more clear."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
