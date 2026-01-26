---
id: jira-HPCC4J-309
title: "HPCC4J-309 – Junit failure:  org.hpccsystems.dfs.client.DFSBenchmarkTest"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-309"
project: HPCC4J
key: HPCC4J-309
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-05-12
updated: 2020-07-08
resolved: 2020-07-08
components:   - dfsclient
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
Junit failure:  org.hpccsystems.dfs.client.DFSBenchmarkTest

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[INFO] -------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "[INFO]  T E S T S"}, {"type": "hardBreak"}, {"type": "text", "text": "[INFO] -------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "RemoteTest executing on: hpcc-platform-dev-bionic64-mvnbulid01(hpcc-platform-dev-bionic64-mvnbulid01/1.0.0.80)"}, {"type": "hardBreak"}, {"type": "text", "text": "RemoteTest: 'hpccconn' set to: '"}, {"type": "text", "text": "http://localhost:9010", "marks": [{"type": "link", "attrs": {"href": "http://localhost:9010/"}}]}, {"type": "text", "text": "'"}, {"type": "hardBreak"}, {"type": "text", "text": "RemoteTest: No 'hpccuser' provided, defaulting to 'JunitUser'"}, {"type": "hardBreak"}, {"type": "text", "text": "RemoteTest: No 'hpccpass' provided."}, {"type": "hardBreak"}, {"type": "text

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
