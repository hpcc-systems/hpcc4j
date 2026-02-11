---
id: jira-HPCC4J-700
title: HPCC4J-700 – 9.2.x github build reports failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-700"
project: HPCC4J
key: HPCC4J-700
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-03-31
updated: 2025-04-25
resolved: 2025-04-25
components:   - BuildPackaging
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
9.2.x github build reports failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/actions/runs/14092847956/job/39473556716#step:4:161"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] ------------------------------------------------------------------------"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] Reactor Summary for HPCC Systems Java Projects 9.2.168-1:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO]"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] HPCC Systems Java Projects ......................... FAILURE [ 1.442 s]"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] HPCC Systems Commons Project ....................... SKIPPED"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] HPCC Web Services Client API ....................... SKIPPED"}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
