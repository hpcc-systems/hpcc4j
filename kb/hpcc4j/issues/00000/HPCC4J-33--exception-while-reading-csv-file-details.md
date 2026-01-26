---
id: jira-HPCC4J-33
title: HPCC4J-33 – Exception while reading CSV file details
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-33"
project: HPCC4J
key: HPCC4J-33
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2015-11-12
updated: 2024-04-08
resolved: 2016-01-06
components:   - WSClient
fixVersions: []
labels:   - Bug
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
Exception while reading CSV file details

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There seems to be a JAPI issue, where in calling DFUFileDetailInfo.getFileType() on DFUFileDetailInfo returned by org.hpccsystems.ws.client.HPCCWsDFUClient.getFileDetails() for sprayed CSV files results in null pointer stated above."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Issue occurs with file ~thor_ramps::dt_yourname::originalpersonfullnamecsv in cluster "}, {"type": "text", "text": "http://10.241.100.159:8010/", "marks": [{"type": "link", "attrs": {"href": "http://10.241.100.159:8010/"}}]}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
