---
id: jira-HPCC4J-72
title: HPCC4J-72 – Import against wsclient public api instead of wsdl generated stub code
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-72"
project: HPCC4J
key: HPCC4J-72
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-01-03
updated: 2017-08-31
resolved: 2017-07-21
components:   - RDFIngest
fixVersions:   - 1.0.2
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
Import against wsclient public api instead of wsdl generated stub code

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In the rdf2hpcc tool we import against the wsdl generated stub code.  Using this code directly can have unintended side effects because it's difficult to insure that it's always backwards compatible with calls of the same name.  It seldom happens, but it has happened."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "To make sure this doesn't happen, it's recommended that we only use the ws.client.platform/utils portion of the API, and not the generated stub code."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC4J-86
- 01. Relates: HPCC4J-82
