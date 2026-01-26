---
id: jira-HPCC4J-162
title: HPCC4J-162 – DFSReadWriteTest not compiling
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-162"
project: HPCC4J
key: HPCC4J-162
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-03-26
updated: 2019-04-01
resolved: 2019-04-01
components:   - dfsclient
fixVersions:   - 7.2.0
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
DFSReadWriteTest not compiling

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In the DFSReadWriteTest unit test, the following lines are throwing compile errors:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "209 (\u00a0dfuClient.createFile(fileName, clusterName, eclRecordDefn, 300)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "and"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "214 (createResult.getFileAccessInfo() )"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
