---
id: jira-HPCC4J-549
title: HPCC4J-549 – Javadoc junit failure dfclient
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-549"
project: HPCC4J
key: HPCC4J-549
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-10-24
updated: 2023-11-07
resolved: 2023-11-07
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
Javadoc junit failure dfclient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Warning:  Javadoc Warnings "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Warning:  /home/runner/work/hpcc4j/hpcc4j/dfsclient/src/main/java/org/hpccsystems/dfs/client/DataPartition.java:300: warning: no @throws for java.lang.Exception "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Warning:  public void add(int index, String copyIP, String copyPath) throws Exception "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Warning:  ^"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
