---
id: jira-HPCC4J-115
title: HPCC4J-115 – Null pointer exception in DFUFileDetailInfo toString() method for SuperFile
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-115"
project: HPCC4J
key: HPCC4J-115
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-05-03
updated: 2018-07-13
resolved: 2018-07-13
components: []
fixVersions:   - 1.4.0
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
Null pointer exception in DFUFileDetailInfo toString() method for SuperFile

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "A null pointer exception occurs in toString when the file name references a Super File. \u00a0The cluster info array is null. \u00a0The toString() method should check if file is a Super File."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
