---
id: jira-HPCC4J-426
title: HPCC4J-426 – HPCCWsWorkUnitsClient createAndRunWUFromECL looses WUID if error occurs
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-426"
project: HPCC4J
key: HPCC4J-426
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-08-06
updated: 2021-08-24
resolved: 2021-08-24
components:   - WSClient
fixVersions:   - 8.2.16
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
HPCCWsWorkUnitsClient createAndRunWUFromECL looses WUID if error occurs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In HPCCWsWorkUnitsClient the function createAndRunWUFromECL"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "If the wURun throws an error the wuid is lost."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Would it be possible modify that function so that the WorkunitWrapper that is passed in is updated with the wuid before entering the try?"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/hpcc4j/blob/master/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsWorkUnitsClient.java#L1474", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/blob/master/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsWorkUnitsClient.java#L1474"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Looks like it would wu.setWuid(compiledWU.getWuid()); just as you go into th

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
