---
id: jira-HPCC4J-91
title: HPCC4J-91 – WuStateNameMap is incorrect for COMPILING.  Cause exception in createAndRunECL
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-91"
project: HPCC4J
key: HPCC4J-91
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-08-31
updated: 2017-09-19
resolved: 2017-09-19
components:   - WSClient
fixVersions:   - 1.2.2
labels:   - Bug
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
WuStateNameMap is incorrect for COMPILING.  Cause exception in createAndRunECL

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The fix for #83 made it so that if an WU has no stateID, it falls back to looking at the state string to determine the WUState. \u00a0This exposed a bug in the state map:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "WuStateNameMap.put(\"COMPILING\", WUState.COMPILED);"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "That should say \"COMPILING\". \u00a0This results in the following exception:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "org.hpcc.HIPIE.utils.ECLPackage@6c17c0f8\r\nMonitoring WU W20170831-154135(hipie-junit-run-ecl) to completion.\r\n2017-08-3

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
