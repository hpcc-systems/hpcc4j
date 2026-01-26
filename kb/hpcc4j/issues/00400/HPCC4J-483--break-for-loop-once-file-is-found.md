---
id: jira-HPCC4J-483
title: HPCC4J-483 – break for loop once file is found
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-483"
project: HPCC4J
key: HPCC4J-483
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-08-16
updated: 2022-08-18
resolved: 2022-08-18
components: []
fixVersions:   - 8.8.6
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
break for loop once file is found

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HPCCFileSprayClient downloadFile loop continues even after it finds the matching file.\u00a0 Suggest breaking the loop for reduced processing time."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
