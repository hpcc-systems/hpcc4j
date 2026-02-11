---
id: jira-HPCC4J-328
title: HPCC4J-328 – Change RowServiceInputStream to default to handle usage
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-328"
project: HPCC4J
key: HPCC4J-328
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-09-10
updated: 2020-09-15
resolved: 2020-09-15
components:   - dfsclient
fixVersions:   - 7.10.x
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
Change RowServiceInputStream to default to handle usage

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Rename to cursor to token to clarify difference between cursor/token and the handle. Change default behavior to use handle to allow for pre-warming connections."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
