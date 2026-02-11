---
id: jira-HPCC4J-260
title: "HPCC4J-260 – spark read function can't take filter option"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-260"
project: HPCC4J
key: HPCC4J-260
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-12-11
updated: 2019-12-13
resolved: 2019-12-13
components:   - hpcc-commons
fixVersions:   - 7.6.18
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
spark read function can't take filter option

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The filter option in the below code doesn't take effect. The output result is not in expectation. Thanks for taking care of it."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "%spark"}, {"type": "hardBreak"}, {"type": "text", "text": "{"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "// Credential Injection"}, {"type": "hardBreak"}, {"type": "text", "text": "val username = \"{user.hpcc}\";"}, {"type": "hardBreak"}, {"type": "text", "text": "val password = \"{password.hpcc}\";"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "// 160 Cluster"}, {"type": "hardBreak"}, {"type": "text", "text": "val clusterURL = \""}, {"type": "text", "text": "http://10.173.160.101:8010", "marks": [{"type": "link", "attrs": {"href": "http://10.173.160.101:8010/"}}]}, {"type": "text", "tex

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
