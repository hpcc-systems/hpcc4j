---
id: jira-HPCC4J-127
title: HPCC4J-127 – Add FileSpray/DownloadFile to JAPI
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-127"
project: HPCC4J
key: HPCC4J-127
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-09-04
updated: 2018-11-06
resolved: 2018-10-24
components:   - WSClient
fixVersions:   - 7.0.0
labels:
  - Developer70
  - Post70RC3
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
Add FileSpray/DownloadFile to JAPI

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "FileSprayServiceSoap.java does not have a call for downloading files from the landing zone. Add functionality to download files from a landing zone."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
