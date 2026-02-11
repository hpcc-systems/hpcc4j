---
id: jira-HPCC4J-289
title: HPCC4J-289 – New getWUInfo method taking a WUInfoRequestWrapper
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-289"
project: HPCC4J
key: HPCC4J-289
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-03-31
updated: 2020-04-10
resolved: 2020-04-10
components:   - WSClient
fixVersions:   - 7.8.6
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
New getWUInfo method taking a WUInfoRequestWrapper

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "create a getWUInfo(wrapper,unarchive) method that lets people pass in any and all wrapper parameters."}, {"type": "hardBreak"}, {"type": "text", "text": "Convert the existing two getWUInfo(long list of parameters) to internally use this method, and deprecate them."}, {"type": "hardBreak"}, {"type": "text", "text": "The other two simple getWUInfo(wuid) and getWUInfo(wuid, unarchive) will also internally use this method but will not be deprecated."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
