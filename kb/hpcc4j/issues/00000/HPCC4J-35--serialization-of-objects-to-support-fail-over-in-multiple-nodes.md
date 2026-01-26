---
id: jira-HPCC4J-35
title: HPCC4J-35 – Serialization of objects to support fail-over in multiple nodes
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-35"
project: HPCC4J
key: HPCC4J-35
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-12-01
updated: 2016-01-04
resolved: 2016-01-04
components:   - WSClient
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
Serialization of objects to support fail-over in multiple nodes

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The following Japi objects need to be fully serializable for fail over support on production environment.  "}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DelimitedDataOptions  "}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "for "}, {"type": "text", "text": "https://github.com/hpcc-systems/DSP/issues/820", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/DSP/issues/820"}}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
