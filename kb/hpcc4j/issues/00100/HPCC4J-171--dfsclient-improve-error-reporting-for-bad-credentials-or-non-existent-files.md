---
id: jira-HPCC4J-171
title: "HPCC4J-171 – DFSClient: Improve error reporting for bad credentials or non-existent files"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-171"
project: HPCC4J
key: HPCC4J-171
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-11
updated: 2019-04-23
resolved: 2019-04-23
components:   - dfsclient
fixVersions:   - 7.2.8
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
DFSClient: Improve error reporting for bad credentials or non-existent files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently, if a file does not exist or the provided credentials are incorrect an exception is thrown about a \"Bad Definition\". The error thrown should be more explanatory and differentiate between a bad file definition, invalid credentials, and invalid file name."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
