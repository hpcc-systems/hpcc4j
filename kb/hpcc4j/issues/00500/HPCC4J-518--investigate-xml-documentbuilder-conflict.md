---
id: jira-HPCC4J-518
title: HPCC4J-518 – Investigate XML DocumentBuilder Conflict
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-518"
project: HPCC4J
key: HPCC4J-518
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-06-28
updated: 2023-07-20
resolved: 2023-07-20
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
Investigate XML DocumentBuilder Conflict

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We rely on the javax.xml.DocumentBuilder supporting a number of security features"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Depending on the users classpath there could be libraries that override the javax.xml.DocumentBuilder which may not support our required security features"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "An example of this came from the Spark-HPCC connector project where the Spark dependencies included xerces which overrides this DocumentBuilder but doesn't support our required security features"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We need to investigate specifying the javax.xml.DocumentBuilder implementation explicitly to avoid

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
