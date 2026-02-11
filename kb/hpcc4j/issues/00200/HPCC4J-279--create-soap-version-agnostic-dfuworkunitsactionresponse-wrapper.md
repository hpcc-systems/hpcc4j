---
id: jira-HPCC4J-279
title: HPCC4J-279 – Create soap-version-agnostic DFUWorkunitsActionResponse wrapper
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-279"
project: HPCC4J
key: HPCC4J-279
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-12
updated: 2020-02-19
resolved: 2020-02-19
components:   - WSClient
fixVersions:   - 7.6.28
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
Create soap-version-agnostic DFUWorkunitsActionResponse wrapper

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The new  HPCCFileSprayClient.deleteDropZoneFiles method returns an axis-generated DFUWorkunitsActionResponse  object. We're going to need a wrapper for this to avoid import changes when we upgrade wsclient."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
