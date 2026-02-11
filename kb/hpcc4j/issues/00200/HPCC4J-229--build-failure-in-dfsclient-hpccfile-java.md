---
id: jira-HPCC4J-229
title: HPCC4J-229 – Build failure in dfsclient HPCCFile.java
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-229"
project: HPCC4J
key: HPCC4J-229
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-09-18
updated: 2019-09-18
resolved: 2019-09-18
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
Build failure in dfsclient HPCCFile.java

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[ERROR] COMPILATION ERROR : "}, {"type": "hardBreak"}, {"type": "text", "text": "[INFO] -------------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] /home/michael/HPCC-JAPIs/dfsclient/src/main/java/org/hpccsystems/dfs/client/HPCCFile.java:[269,28] Alternatives in a multi-catch statement cannot be related by subclassing"}, {"type": "hardBreak"}, {"type": "text", "text": "Alternative org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper is a subclass of alternative java.lang.Exception"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
