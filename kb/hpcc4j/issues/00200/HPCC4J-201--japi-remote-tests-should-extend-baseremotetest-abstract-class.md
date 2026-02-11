---
id: jira-HPCC4J-201
title: HPCC4J-201 – JAPI remote tests should extend baseremotetest abstract class
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-201"
project: HPCC4J
key: HPCC4J-201
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-29
updated: 2019-06-13
resolved: 2019-06-13
components:   - BuildPackaging
fixVersions:   - 7.4.0
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
JAPI remote tests should extend baseremotetest abstract class

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Invalid connection parameters cause invalid failed jnuit results due to nullpointer exception in test case code:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "public Platform getPlatform() throws Exception"}, {"type": "hardBreak"}, {"type": "text", "text": "{"}, {"type": "hardBreak"}, {"type": "text", "text": "if (p==null) {"}, {"type": "hardBreak"}, {"type": "text", "text": "p=Platform.get(getHttp(),getIP(),getPort(),getUsername(),getPassword());"}, {"type": "hardBreak"}, {"type": "text", "text": "}"}, {"type": "hardBreak"}, {"type": "text", "text": "return p; <-- assert p != null"}, {"type": "hardBreak"}, {"type": "text", "text": "}"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC4J-200
