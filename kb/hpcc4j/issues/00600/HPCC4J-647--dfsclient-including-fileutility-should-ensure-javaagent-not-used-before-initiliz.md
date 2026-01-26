---
id: jira-HPCC4J-647
title: HPCC4J-647 – DFSClient including fileutility should ensure javaagent not used before initilizing otelsdk
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-647"
project: HPCC4J
key: HPCC4J-647
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-17
updated: 2024-09-18
resolved: 2024-09-18
components:   - dfsclient
fixVersions:
  - 9.8.22
  - 9.6.48
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
DFSClient including fileutility should ensure javaagent not used before initilizing otelsdk

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
