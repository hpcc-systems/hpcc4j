---
id: jira-HPCC4J-125
title: HPCC4J-125 – Add support for DFU file access token/Signature
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-125"
project: HPCC4J
key: HPCC4J-125
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-07-30
updated: 2018-09-09
resolved: 2018-09-09
components:   - WSClient
fixVersions:   - 7.0.0
labels:   - Post70RC1
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
Add support for DFU file access token/Signature

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DFUInfo gathering (via wsdfu) will optionally provide security token/signature which will be required for file data access. wsclient should provide mechanism for a) providing required information to wsdfu b) fetching security artifact"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
