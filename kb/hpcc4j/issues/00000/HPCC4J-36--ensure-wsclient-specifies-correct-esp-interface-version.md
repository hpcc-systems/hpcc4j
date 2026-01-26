---
id: jira-HPCC4J-36
title: HPCC4J-36 – Ensure wsclient specifies correct ESP interface version
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-36"
project: HPCC4J
key: HPCC4J-36
status: Resolved
statusCategory: Done
resolution: Done
created: 2015-12-28
updated: 2015-12-29
resolved: 2015-12-29
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
Ensure wsclient specifies correct ESP interface version

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Extract version from WSDL Soap address, append version to all requests."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
