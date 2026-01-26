---
id: jira-HPCC4J-53
title: "HPCC4J-53 – pom :: Maven repository build order"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-53"
project: HPCC4J
key: HPCC4J-53
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-09-16
updated: 2017-01-04
resolved: 2017-01-04
components:   - BuildPackaging
fixVersions:   - 1.0.0
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
pom :: Maven repository build order

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Current Maven build approach forces external users to access internal mvnrisk repo."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Let's look into forcing mvn to seek prereqs locally first before looking for prereqs remotely "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
