---
id: jira-HPCC4J-259
title: HPCC4J-259 – Support RemovePartFromPackageMap in WsPackageProcessClient
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-259"
project: HPCC4J
key: HPCC4J-259
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-12-10
updated: 2019-12-16
resolved: 2019-12-16
components:   - WSClient
fixVersions:   - 7.6.18
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
Support RemovePartFromPackageMap in WsPackageProcessClient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We have the need for RemovePartFromPackageMap support."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Add the following helper method:"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "public BasePackageStatus removePartFromPackageMap(final boolean globalScope, final String partName, final String target, final String packageMap) throws Exception"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
