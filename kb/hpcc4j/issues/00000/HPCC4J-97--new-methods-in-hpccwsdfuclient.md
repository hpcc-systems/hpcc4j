---
id: jira-HPCC4J-97
title: HPCC4J-97 – New Methods in HPCCWsDFUClient
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-97"
project: HPCC4J
key: HPCC4J-97
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
New Methods in HPCCWsDFUClient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "To avoid external users needing to reference getSoapProxy() in HPCCWsDFUService, the following method should be added:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "public List<DFULogicalFileInfo> searchFiles(String logicalFilename, String cluster) that returns a soap-version-agnostic\u00a0DFULogicalFileInfo class (populated by a DFULogicalFile class)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "public List<DFUResult> deleteFiles(Set<String> files, String cluster) that returns a soap-version-agnostic DFUResult class populated by the DFUActionResult class"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
