---
id: jira-HPCC4J-649
title: "HPCC4J-649 – DFSClient Index Read: Non-keyed filter warning"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-649"
project: HPCC4J
key: HPCC4J-649
status: New
statusCategory: To Do
resolution: null
created: 2024-09-19
updated: 2025-09-30
resolved: null
components:   - dfsclient
fixVersions: []
labels:   - CopilotCandidate
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
DFSClient Index Read: Non-keyed filter warning

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "If a user is filtering on an index and they apply a filter on payload fields this will result in reduced filtering performance."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In this case we should warn the user of the reduced filtering performance due to filtering on payload fields"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Will require the ability to reliably detect payload fields on the HPCC4j side."}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This information may not be present in the Field meta data we have currently"}]}]}]}]}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
