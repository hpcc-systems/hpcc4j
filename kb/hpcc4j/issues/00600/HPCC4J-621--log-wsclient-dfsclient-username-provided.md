---
id: jira-HPCC4J-621
title: HPCC4J-621 – Log wsclient/dfsclient username provided
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-621"
project: HPCC4J
key: HPCC4J-621
status: New
statusCategory: To Do
resolution: null
created: 2024-07-15
updated: 2025-09-30
resolved: null
components: []
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
Log wsclient/dfsclient username provided

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Due to recent user errors regarding invalid credentials, it appears helpful to log (at high log level) user names provided for HPCC connectivity."}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
