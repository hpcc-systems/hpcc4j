---
id: jira-HPCC4J-211
title: HPCC4J-211 – Improve dafilesrv error reporting
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-211"
project: HPCC4J
key: HPCC4J-211
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-07-02
updated: 2019-07-16
resolved: 2019-07-16
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
Improve dafilesrv error reporting

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Provide helpful error messages when encountering dafilesrv errors such as:"}, {"type": "hardBreak"}, {"type": "text", "text": "java.io.IOException: Row service returned error code: -11. Aborting"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.dfs.client.RowServiceOutputStream.readResponse(RowServiceOutputStream.java:163)"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.dfs.client.RowServiceOutputStream.makeInitialWriteRequest(RowServiceOutputStream.java:144)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "in this case -11 means unauthorized due to keys configuration issue on the server side"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
