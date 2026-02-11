---
id: jira-HPCC4J-244
title: HPCC4J-244 – HPCCWsClient.getWsAttributesClient() using wrong default port (8010 instead of 8145)
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-244"
project: HPCC4J
key: HPCC4J-244
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-22
updated: 2019-10-25
resolved: 2019-10-25
components:   - WSClient
fixVersions:   - 7.6.6
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
HPCCWsClient.getWsAttributesClient() using wrong default port (8010 instead of 8145)

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In earlier releases, HPCCWsClient.getWsAttributesClient() returned a client using port 8145 if no port was specified."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Now it's returning port 8010 because WSAttributesClient is extending BaseAttributesClient, but not implementing its own override of BaseAttributesClient.getOriginalPort()."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I believe adding WSAttributesClient.getOriginalPort() that returns 8145 by default if no ORIGINALURL is specified is the way to fix the problem. I did this locally and all the client code calling getWsAttributesClient() works again, as it did before."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
