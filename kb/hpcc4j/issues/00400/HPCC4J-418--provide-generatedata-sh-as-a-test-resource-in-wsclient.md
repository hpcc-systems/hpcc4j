---
id: jira-HPCC4J-418
title: "HPCC4J-418 – Provide \"generatedata.sh\" as a test resource in wsclient"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-418"
project: HPCC4J
key: HPCC4J-418
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-05-14
updated: 2021-06-18
resolved: 2021-06-18
components:   - BuildPackaging
fixVersions:   - 8.0.24
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
Provide "generatedata.sh" as a test resource in wsclient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Push "}, {"type": "text", "text": "https://raw.githubusercontent.com/Michael-Gardner/hpccsystems-java-project-testbed/main/generatedata.sh", "marks": [{"type": "link", "attrs": {"href": "https://raw.githubusercontent.com/Michael-Gardner/hpccsystems-java-project-testbed/main/generatedata.sh"}}]}, {"type": "text", "text": " to "}, {"type": "text", "text": "https://github.com/hpcc-systems/hpcc4j/tree/master/wsclient/src/test/resources", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/tree/master/wsclient/src/test/resources"}}]}, {"type": "text", "text": " and update remotetest workflow."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
