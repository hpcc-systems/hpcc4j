---
id: jira-HPCC4J-96
title: HPCC4J-96 – Add wrapper classes to expose file partition locations and layout information
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-96"
project: HPCC4J
key: HPCC4J-96
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-13
updated: 2017-10-02
resolved: 2017-10-02
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
Add wrapper classes to expose file partition locations and layout information

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Need to expose file layout and file location information (IP and name). \u00a0The information can be currently obtained by:"}]}, {"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Creating a Connection object"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "using the Connection object to create an HPCCWsDFUClient object"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "calling the getFileInfo method to get a DFUInfoResponse object"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "the getFileDetail method on the response object returns a DFUFileDetail object"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type":

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
