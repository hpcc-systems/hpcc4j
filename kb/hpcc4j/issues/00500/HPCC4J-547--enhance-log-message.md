---
id: jira-HPCC4J-547
title: HPCC4J-547 – enhance log message
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-547"
project: HPCC4J
key: HPCC4J-547
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-10-17
updated: 2025-10-03
resolved: 2025-10-03
components: []
fixVersions:
  - 9.8.124
  - 9.10.70
  - 9.12.44
  - 9.14.26
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
enhance log message

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "in BaseHpccWsClient enhance the log message to include the hostname.\u00a0 Right now the function initBaseWsClient, both the catch errors make it hard to identify the connection being passed in that is resulting in the errors."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Suggestion"}, {"type": "hardBreak"}, {"type": "text", "text": "this.initErrMessage = \"BaseHPCCWsClient: Could not stablish target HPCC bulid version, review all HPCC connection values\";"}, {"type": "hardBreak"}, {"type": "text", "text": "if(connection.getHost() != null){"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0 this.initErrMessage += \" host: \" + connection.getHost();"}, {"type": "hardBreak"}, {"type": "text", "text": "}"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "and\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "this.initErrMessage

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
