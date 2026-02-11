---
id: jira-HPCC4J-545
title: HPCC4J-545 – Resume read unit test causes Java OOM error
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-545"
project: HPCC4J
key: HPCC4J-545
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-10-13
updated: 2023-11-07
resolved: 2023-11-07
components:   - dfsclient
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
Resume read unit test causes Java OOM error

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Resume read unit test quickly create thousands of HPCCRemoteFileReaders and closes them. As a result the read buffers, 4MB each, allocated by the file readers consume available free memory before the JVM garbage collector can run."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
