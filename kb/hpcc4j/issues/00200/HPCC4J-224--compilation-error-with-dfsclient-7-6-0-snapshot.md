---
id: jira-HPCC4J-224
title: HPCC4J-224 – Compilation error with dfsclient 7.6.0-SNAPSHOT
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-224"
project: HPCC4J
key: HPCC4J-224
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-09-04
updated: 2019-09-05
resolved: 2019-09-05
components:   - dfsclient
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
Compilation error with dfsclient 7.6.0-SNAPSHOT

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[ERROR] COMPILATION ERROR :"}, {"type": "hardBreak"}, {"type": "text", "text": "[INFO] -------------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] /home/michael/HPCC-JAPIs/dfsclient/src/main/java/org/hpccsystems/dfs/client/HPCCFile.java:[352,40] unreported exception org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper; must be caught or declared to be thrown"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] /home/michael/HPCC-JAPIs/dfsclient/src/main/java/org/hpccsystems/dfs/client/HPCCFile.java:[368,38] unreported exception org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper; must be caught or declared to be thrown"}, {"type": "hardBreak"}, {"type": "text", "text": "[INFO] 2 errors"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "branch is candidate-7.6.0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
