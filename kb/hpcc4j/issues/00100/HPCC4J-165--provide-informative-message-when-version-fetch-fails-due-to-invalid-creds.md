---
id: jira-HPCC4J-165
title: HPCC4J-165 – Provide informative message when version fetch fails due to invalid creds
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-165"
project: HPCC4J
key: HPCC4J-165
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-03-27
updated: 2019-04-01
resolved: 2019-04-01
components:   - WSClient
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
Provide informative message when version fetch fails due to invalid creds

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Encountered this when invalid creds provided"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.lang.NullPointerException at org.hpccsystems.ws.client.platform.Version.<init>(Version.java:20) at org.hpccsystems.ws.client.HPCCWsDFUClient.<init>(HPCCWsDFUClient.java:615) at org.hpccsystems.ws.client.HPCCWsDFUClient.<init>(HPCCWsDFUClient.java:594) at org.hpccsystems.ws.client.HPCCWsDFUClient.get(HPCCWsDFUClient.java:88) at org.hpccsystems.dfs.client.HPCCFile.createDataParts(HPCCFile.java:231) at org.hpccsystems.dfs.client.HPCCFile.getFileParts(HPCCFile.java:281) at org.hpccsystems.spark.HpccFile.getRDD(HpccFile.java:111) ... 47 elided"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
