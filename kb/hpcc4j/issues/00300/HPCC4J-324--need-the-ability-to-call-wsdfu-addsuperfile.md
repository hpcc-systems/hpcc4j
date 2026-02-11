---
id: jira-HPCC4J-324
title: HPCC4J-324 – need the ability to call wsdfu.addSuperfile
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-324"
project: HPCC4J
key: HPCC4J-324
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-08-11
updated: 2020-08-28
resolved: 2020-08-28
components:   - WSClient
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
need the ability to call wsdfu.addSuperfile

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We are needing to be able to programatically add a file to a superfile. This'll be a new method in the dfu client service, with the request/response wrappers, etc."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
