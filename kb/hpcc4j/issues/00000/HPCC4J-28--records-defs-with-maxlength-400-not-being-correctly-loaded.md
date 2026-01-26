---
id: jira-HPCC4J-28
title: HPCC4J-28 – Records defs with {maxlength(400)} not being correctly loaded 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-28"
project: HPCC4J
key: HPCC4J-28
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-10-08
updated: 2015-11-03
resolved: 2015-11-03
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
Records defs with {maxlength(400)} not being correctly loaded 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The following record layout for a file is being read by ANTLR, but the max length is not being stored:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "{ unsigned1 rating, string15 firstname, string25 lastname{maxlength(3072)} };"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "you can see this on the "}, {"type": "text", "text": "http://10.173.147.1:8010/", "marks": [{"type": "link", "attrs": {"href": "http://10.173.147.1:8010/"}}]}, {"type": "text", "text": " cluster with file ~birt::persons"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
