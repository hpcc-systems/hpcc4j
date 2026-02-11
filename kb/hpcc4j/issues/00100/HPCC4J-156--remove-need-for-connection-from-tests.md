---
id: jira-HPCC4J-156
title: HPCC4J-156 – Remove need for connection from tests
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-156"
project: HPCC4J
key: HPCC4J-156
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-02-12
updated: 2019-02-22
resolved: 2019-02-22
components:   - dfsclient
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
Remove need for connection from tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There are a set of tests in dfsclient's newest version (will be 7.0.8) that requires us to have a connection in order to test against workunits.  Please make this optional so we can test it when required, but not under all build conditions."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
