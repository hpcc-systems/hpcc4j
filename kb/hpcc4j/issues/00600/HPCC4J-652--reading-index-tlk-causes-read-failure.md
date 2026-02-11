---
id: jira-HPCC4J-652
title: HPCC4J-652 – Reading index TLK causes read failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-652"
project: HPCC4J
key: HPCC4J-652
status: New
statusCategory: To Do
resolution: null
created: 2024-08-20
updated: 2025-10-16
resolved: null
components:   - dfsclient
fixVersions: []
labels: []
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
Reading index TLK causes read failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Index: thor_data400::key::bipv2_best::built::linkids"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Attempting to read the TLK of some indices results in a failure"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Dafilesrv seems to either crash or close the connection"}]}]}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "After the failed TLK read subsequent reads to the same Dafilesrv fail"}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Steps to reproduce:", "marks": [{"type": "strong"}]}]}, {"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Grab daf

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
