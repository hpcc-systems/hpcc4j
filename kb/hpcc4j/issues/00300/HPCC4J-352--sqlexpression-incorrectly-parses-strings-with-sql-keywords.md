---
id: jira-HPCC4J-352
title: HPCC4J-352 – SQLExpression incorrectly parses strings with SQL keywords
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-352"
project: HPCC4J
key: HPCC4J-352
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-06
updated: 2020-11-17
resolved: 2020-11-17
components:   - WSClient
fixVersions:   - 7.12.8
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
SQLExpression incorrectly parses strings with SQL keywords

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "SQLExpression incorrectly parses strings with SQL keywords. IE: the following fails to be parsed correctly."}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "key = \"OR\""}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
