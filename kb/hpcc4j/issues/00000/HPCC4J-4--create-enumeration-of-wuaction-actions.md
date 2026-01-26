---
id: jira-HPCC4J-4
title: HPCC4J-4 – Create enumeration of WUAction actions
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-4"
project: HPCC4J
key: HPCC4J-4
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-06-11
updated: 2015-08-10
resolved: 2015-06-23
components:   - WSClient
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
Create enumeration of WUAction actions

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "wuActionTable.setValue(\"delete\", ActionDelete);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"abort\", ActionAbort);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"pausenow\", ActionPauseNow);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"pause\", ActionPause);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"resume\", ActionResume);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"protect\", ActionProtect);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"unprotect\", ActionProtect);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"restore\", ActionRestore);"}, {"type": "hardBreak"}, {"type": "text", "text": "wuActionTable.setValue(\"reschedule\", ActionEventSchedule);"}, {"type": "

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
