---
id: jira-HPCC4J-559
title: HPCC4J-559 – Create HPCC Test Github Action
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-559"
project: HPCC4J
key: HPCC4J-559
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-12-07
updated: 2024-01-26
resolved: 2024-01-26
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
Create HPCC Test Github Action

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Create a base GitHub action that can be used to run tests against the HPCC platform."}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Installs K8s"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Builds a docker image of HPCC"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Installs a HPCC cluster using Helm & built docker image"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
