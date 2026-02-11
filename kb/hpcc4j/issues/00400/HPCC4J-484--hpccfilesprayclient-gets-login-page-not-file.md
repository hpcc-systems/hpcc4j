---
id: jira-HPCC4J-484
title: HPCC4J-484 – HPCCFileSprayClient gets login page not file
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-484"
project: HPCC4J
key: HPCC4J-484
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
HPCCFileSprayClient gets login page not file

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "on clusters that require authentication the following call results in downloading the login page not the file."}, {"type": "hardBreak"}, {"type": "text", "text": "Tested with internal 7.12.102-1"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HPCCFileSprayClient fsclient=conn.getPlatform().getWsClient().getFileSprayClient()"}, {"type": "text", "text": ";", "marks": [{"type": "textColor", "attrs": {"color": "#cc7832"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "fsclient.downloadFile(outputFile"}, {"type": "text", "text": ", ", "marks": [{"type": "textColor", "attrs": {"color": "#cc7832"}}]}, {"type": "text", "text": "dropzone"}, {"type": "text", "text": ", ", "marks": [{"type": "textColor", "attrs": {"color": "#cc7832"}}]}, {"type": "text", "text": "fileName)"}, {"type": "text", "text": ";", "marks": [{"type": "textColor", "attrs": {"color": "#cc78

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
