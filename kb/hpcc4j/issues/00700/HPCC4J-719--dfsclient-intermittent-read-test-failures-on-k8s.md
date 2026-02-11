---
id: jira-HPCC4J-719
title: "HPCC4J-719 – DFSClient: Intermittent read test failures on K8s"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-719"
project: HPCC4J
key: HPCC4J-719
status: New
statusCategory: To Do
resolution: null
created: 2025-05-16
updated: 2025-09-30
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
---
## Outcome (from JIRA)
DFSClient: Intermittent read test failures on K8s

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This appears to be caused by a crash on the dafilesrv side, see: "}, {"type": "inlineCard", "attrs": {"url": "https://hpccsystems.atlassian.net/browse/HPCC-34198"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Will keep this ticket open in case changes are needed on DFSClient side, but reducing priority."}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
