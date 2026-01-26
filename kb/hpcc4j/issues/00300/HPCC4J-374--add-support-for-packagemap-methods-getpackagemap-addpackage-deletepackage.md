---
id: jira-HPCC4J-374
title: HPCC4J-374 – Add support for packagemap methods GetPackagemap, AddPackage, DeletePackage
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-374"
project: HPCC4J
key: HPCC4J-374
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-01-08
updated: 2021-01-15
resolved: 2021-01-15
components:   - WSClient
fixVersions:   - 7.12.x
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
Add support for packagemap methods GetPackagemap, AddPackage, DeletePackage

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Those are the main overall methods for packagemaps and should be in the abstracted client interface.\u00a0 The packagemap parts methods currently supported are good but are lower level than the ones mentioned here."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
