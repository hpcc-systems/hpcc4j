---
id: jira-HPCC4J-500
title: HPCC4J-500 – String trim flag when reading hpcc files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-500"
project: HPCC4J
key: HPCC4J-500
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-01-31
updated: 2023-02-09
resolved: 2023-02-09
components:   - dfsclient
fixVersions:   - 8.12.2
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
String trim flag when reading hpcc files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Instead of doing a post-read string trim on HPCC STRINGXX fields, it would be faster to have the record reader do it."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "can it have a couple of additional flags along the lines of the unsigned8 change recently made:"}]}, {"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "A flag saying that if a field is a STRINGXX field (as opposed to variable STRING), trim the value when returning it"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "A flag saying that if a STRING-ish field is an empty string, convert the value to null"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
