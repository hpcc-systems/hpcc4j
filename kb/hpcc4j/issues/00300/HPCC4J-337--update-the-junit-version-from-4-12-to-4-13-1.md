---
id: jira-HPCC4J-337
title: HPCC4J-337 – Update the junit version from 4.12 to 4.13.1
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-337"
project: HPCC4J
key: HPCC4J-337
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-10-13
updated: 2020-10-15
resolved: 2020-10-15
components:
  - commons-hpcc
  - dfsclient
  - WSClient
fixVersions:   - 7.12.4
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
Update the junit version from 4.12 to 4.13.1

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Bots found rdfclient and clienttools packages in our git source tree could be updated from 4.11 junits to 4.13.1."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "We've decided to bump up the top level pom for the hpcc4j project from junit version 4.12 to 4.13.1 since it's been recently released."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
