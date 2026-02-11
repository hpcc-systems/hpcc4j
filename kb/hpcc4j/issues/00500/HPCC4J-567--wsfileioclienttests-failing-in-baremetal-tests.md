---
id: jira-HPCC4J-567
title: HPCC4J-567 – WSFileIOClientTests failing in baremetal tests
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-567"
project: HPCC4J
key: HPCC4J-567
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-01-10
updated: 2024-05-21
resolved: 2024-05-21
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
WSFileIOClientTests failing in baremetal tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "The following tests are failing in the GH baremetal env as of 9.4.24."}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WSFileIOClientTest.BwriteHPCCFile"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WSFileIOClientTest.AcreateHPCCFile"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WSFileIOClientTest.CreadHPCCFile"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WSFileIOClientTest.copyFile"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
