---
id: jira-HPCC4J-196
title: HPCC4J-196 – Create soap-version-agnostic DFUInfoWrapper
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-196"
project: HPCC4J
key: HPCC4J-196
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-21
updated: 2019-09-16
resolved: 2019-09-16
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
Create soap-version-agnostic DFUInfoWrapper

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HIPIE, HPCC and SALT projects are using the DFUInfoResponse object a lot, which means a lot of updating of import versions whenever the soap version's updated in a version of wsclient."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "If we can create a DFUInfoWrapper class that takes a DFUInfoResponse object, and update getFilelnfo to return the wrapper class, that will cut down on the number of changes needed in dependent projects."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
