---
id: jira-HPCC4J-565
title: HPCC4J-565 – Bump hadoop-client lib to avoid cve
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-565"
project: HPCC4J
key: HPCC4J-565
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-01-09
updated: 2024-05-13
resolved: 2024-05-13
components:   - dfsclient
fixVersions:
  - 9.0.106
  - 9.2.84
  - 9.4.58
  - 9.6.10
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
Bump hadoop-client lib to avoid cve

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "orghpccsystems-2302"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "pkg:maven/org.hpccsystems/dfsclient@9.2.48-1"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "pkg:maven/org.apache.hadoop/hadoop-client@2.10.1"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "pkg:maven/org.apache.hadoop/hadoop-common@2.10.1"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "pkg:maven/com.fasterxml.woodstox/woodstox-core@5.0.3"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[[CVE-2022-40152] CWE-787: Out-of-bounds Write|"}, {"type": "text", "text": "https://ossindex.sonatyp

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
