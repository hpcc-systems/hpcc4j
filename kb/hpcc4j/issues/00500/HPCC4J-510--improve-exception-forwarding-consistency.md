---
id: jira-HPCC4J-510
title: HPCC4J-510 – Improve Exception forwarding consistency
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-510"
project: HPCC4J
key: HPCC4J-510
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-05-09
updated: 2024-08-22
resolved: 2024-08-22
components: []
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
Improve Exception forwarding consistency

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Check for inconsistencies in how exceptions are being forwarded within HPCC4j."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Discussion:"}, {"type": "hardBreak"}, {"type": "text", "text": "All forwarded exceptions should either be passed into the new exceptions constructor as a cause or all forwarded exceptions getMessage() output should be included in the forwarded exceptions message."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "It is likely that forwarding previous exceptions via the cause param in the new Exception's constructor is preferable because this will maintain a full stacktrace. However, if any subsequent Exception do not do this the original Exception information will be lost, as the original 'cause' Exception's message is not included in the wrapping Exceptions getMessage() output."}]}, {"type": "paragraph", "content": [{"type": "tex

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
