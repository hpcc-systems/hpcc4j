---
id: jira-HPCC4J-497
title: HPCC4J-497 – Investigate Index Changes
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-497"
project: HPCC4J
key: HPCC4J-497
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-11-29
updated: 2023-10-12
resolved: 2023-10-12
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
Investigate Index Changes

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently index TLKs include non-keyed fields. This appears to be changing and will require changes to the TLK code in DFSClient / Tardis?"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "See:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://hpccsystems.atlassian.net/projects/HPCC/issues/HPCC-28632?filter=allissues", "marks": [{"type": "link", "attrs": {"href": "https://hpccsystems.atlassian.net/projects/HPCC/issues/HPCC-28632?filter=allissues"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HPCC-Platform/pull/16729/files", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HPCC-Platform/pull/16729/files"}}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
