---
id: jira-HPCC4J-631
title: HPCC4J-631 – WsClient reports misleading error message when buildversion and or iscontainerized calls fail due to auth challenge
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-631"
project: HPCC4J
key: HPCC4J-631
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-18
updated: 2024-08-27
resolved: 2024-08-27
components:   - WSClient
fixVersions:
  - 9.6.44
  - 9.8.18
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
WsClient reports misleading error message when buildversion and or iscontainerized calls fail due to auth challenge

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "It seems ESP returns HTML when soapcalls fail due to authentication issues, which cause wsclient to attempt XML parsing of HTML document. The resulting error is not helpful and misleading."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
