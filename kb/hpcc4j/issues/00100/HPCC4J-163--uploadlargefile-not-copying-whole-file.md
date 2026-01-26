---
id: jira-HPCC4J-163
title: HPCC4J-163 – uploadLargeFile Not Copying Whole File
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-163"
project: HPCC4J
key: HPCC4J-163
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-03-26
updated: 2019-03-28
resolved: 2019-03-28
components:   - ClientTools
fixVersions:   - 7.2.x
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
uploadLargeFile Not Copying Whole File

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Uploading a large file using this method only copies one buffers worth of data."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCFileSprayClient.java#L863-L873", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCFileSprayClient.java#L863-L873"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I believe there needs to be a `buffer.clear()` calls before the while loop resets and read is called again."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
