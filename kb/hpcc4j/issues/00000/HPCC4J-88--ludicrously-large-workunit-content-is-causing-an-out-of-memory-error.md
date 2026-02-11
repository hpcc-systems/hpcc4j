---
id: jira-HPCC4J-88
title: HPCC4J-88 – Ludicrously large workunit content is causing an out of memory error
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-88"
project: HPCC4J
key: HPCC4J-88
status: Resolved
statusCategory: Done
resolution: Cannot Reproduce
created: 2017-08-25
updated: 2018-09-06
resolved: 2018-09-06
components:   - WSClient
fixVersions:   - 7.0.0
labels:   - Post70RC1
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
Ludicrously large workunit content is causing an out of memory error

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When attempting to call getWorkunitResults() for this wuid, an out of memory error occurred:\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "http://10.194.169.2:8010/", "marks": [{"type": "link", "attrs": {"href": "http://10.194.169.2:8010/?Wuid=W20170801-150214&Widget=WUDetailsWidget#/stub/Files-DL/Grid"}}]}, {"type": "text", "text": " "}, {"type": "text", "text": "?Wuid=W20170801-150214&Widget=WUDetailsWidget#/stub/Files-DL/Grid", "marks": [{"type": "link", "attrs": {"href": "http://10.194.169.2:8010/?Wuid=W20170801-150214&Widget=WUDetailsWidget#/stub/Files-DL/Grid"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Stacktrace:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "`````"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.lang.Out

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
