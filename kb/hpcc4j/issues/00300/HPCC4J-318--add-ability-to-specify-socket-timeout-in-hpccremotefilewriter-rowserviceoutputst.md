---
id: jira-HPCC4J-318
title: HPCC4J-318 – Add ability to specify socket timeout in HPCCRemoteFileWriter/RowServiceOutputStream
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-318"
project: HPCC4J
key: HPCC4J-318
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-07-21
updated: 2020-08-17
resolved: 2020-08-17
components:   - dfsclient
fixVersions:   - 7.x.10
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
Add ability to specify socket timeout in HPCCRemoteFileWriter/RowServiceOutputStream

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When writing files to large clusters, sometimes the RowServiceOutputStream is failing on construction because the default connect ms is 1000 on the socket and can't be bumped up."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "If we add an overloaded constructor that takes a connect timeout ms, and also add this constructor to HPCCRemoteFileWriter that passes the connect timeout ms on to the RowServiceOutputStream during initialization, this will solve the problem."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
