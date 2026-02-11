---
id: jira-HPCC4J-184
title: HPCC4J-184 – issue when setting projected field list on HPCCFile
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-184"
project: HPCC4J
key: HPCC4J-184
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-22
updated: 2019-04-25
resolved: 2019-04-25
components:   - dfsclient
fixVersions:   - 7.2.8
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
issue when setting projected field list on HPCCFile

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "found a bug in the way the file handles a project list being set.  The projectedRecordDefinition is being set only in HPCCFile.createDataParts(). This is called the first time either getRecordDefinition() or getProjectedRecordDefinition() is called, but never afterwards. "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "So if you call getRecordDefinition(), get a subset of those fields and call setProjectList(), the projectedRecordDefinition isn't updated. "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This can be easily fixed by adding "}, {"type": "hardBreak"}, {"type": "text", "text": "this.projectedRecordDefinition=columnPruner.pruneRecordDefinition(this.recordDefinition);         "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "to HPCCFile.setProjectList()."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
