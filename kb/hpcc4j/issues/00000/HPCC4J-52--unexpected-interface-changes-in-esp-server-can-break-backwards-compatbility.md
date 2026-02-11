---
id: jira-HPCC4J-52
title: HPCC4J-52 – Unexpected interface changes in ESP server can break backwards compatbility
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-52"
project: HPCC4J
key: HPCC4J-52
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-09-16
updated: 2024-04-08
resolved: 2018-06-22
components:   - WSClient
fixVersions:   - 7.0.0
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
Unexpected interface changes in ESP server can break backwards compatbility

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Let's look into implementing a handler which will allow us to filter out unexpected elements in response from server."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Possible solution: "}, {"type": "text", "text": "http://stackoverflow.com/questions/26907856/any-workaround-for-ignoring-unexpected-elements-in-apache-axis-1-4", "marks": [{"type": "link", "attrs": {"href": "http://stackoverflow.com/questions/26907856/any-workaround-for-ignoring-unexpected-elements-in-apache-axis-1-4"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Example encountered by Drea/Luke:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I\u2019m trying to use wsclient 0.6.5 against a cluster that\u2019s version HPCC 5.6.4. I\u2019m getting some axis errors. Before I chase them down, can you confirm that wsclient 0.6.5 is supposed to work with HPCC version 5.6.4?

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
