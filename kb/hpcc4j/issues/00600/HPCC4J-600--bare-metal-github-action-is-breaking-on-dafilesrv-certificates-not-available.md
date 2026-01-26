---
id: jira-HPCC4J-600
title: HPCC4J-600 – Bare metal github action is breaking on dafilesrv certificates not available
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-600"
project: HPCC4J
key: HPCC4J-600
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-05-03
updated: 2024-05-13
resolved: 2024-05-13
components:   - BuildPackaging
fixVersions:
  - 9.2.84
  - 9.4.58
  - 9.6.10
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
Bare metal github action is breaking on dafilesrv certificates not available

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "setuppki not automatically executed, this is a change in behavior and it is causing DAFILESRV tests to fail."}]}, {"type": "paragraph"}, {"type": "paragraph", "content": [{"type": "text", "text": "work-arount is to executed this script:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "sudo /opt/HPCCSystems/etc/init.d/setupPKI"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
