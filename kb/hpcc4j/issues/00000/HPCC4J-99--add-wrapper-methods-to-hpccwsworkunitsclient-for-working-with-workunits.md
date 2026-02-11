---
id: jira-HPCC4J-99
title: HPCC4J-99 – Add wrapper methods to HPCCWsWorkunitsClient for working with workunits
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-99"
project: HPCC4J
key: HPCC4J-99
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-13
updated: 2017-09-19
resolved: 2017-09-19
components:   - WSClient
fixVersions:   - 1.2.2
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
Add wrapper methods to HPCCWsWorkunitsClient for working with workunits

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "To prevent external users from calling the soapproxy directly, add the following to HPCCWsWorkunitsClient for working with workunits:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "public WorkunitInfo createWorkunit()"}]}]}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "public WorkunitInfo protectWorkunit(String wuid)"}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "*\u00a0public WULogFileInfo getWorkunitFile(String wuid, String filename, String filetype, String description, String ipaddr, boolean entirefile)\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "*\u00a0public WorkunitInfo runWorkunit(String wuid

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
