---
id: jira-HPCC4J-220
title: HPCC4J-220 – Create new Exception class to handle ESP/ECL exceptions
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-220"
project: HPCC4J
key: HPCC4J-220
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-08-28
updated: 2019-09-05
resolved: 2019-09-05
components:   - WSClient
fixVersions:   - 7.6.0
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
Create new Exception class to handle ESP/ECL exceptions

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Now that ArrayOfEspException no longer implements Throwable, we still need to distinguish between straight-up java exceptions thrown by wsclient, and exceptions passed on from esp services."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Create a new Exception class (WsclientEspException?)  which will contain anything returned by an ArrayOfEspException.  It's a container for multiple exceptions, one exception per item in the ArrayOfEspException.EspException[] array."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
