---
id: jira-HPCC4J-54
title: HPCC4J-54 – enhance annotation extraction from ecl recordsets
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-54"
project: HPCC4J
key: HPCC4J-54
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-10-27
updated: 2017-01-10
resolved: 2017-01-10
components:   - WSClient
fixVersions: []
labels:   - Feature
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
enhance annotation extraction from ecl recordsets

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Need to enhance the current EclRecord.g4 and ECLRecordReader to handle:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Extracting annotations with no params ( // @FEW)"}, {"type": "hardBreak"}, {"type": "text", "text": "Extracting multiple annotations per field (//@METATYPE(SSN), @MANY)"}, {"type": "hardBreak"}, {"type": "text", "text": "Extracting annotations on RECORDs   (RECORD // @RECCOUNT(10000000) )"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
