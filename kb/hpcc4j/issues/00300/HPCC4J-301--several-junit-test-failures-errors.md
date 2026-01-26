---
id: jira-HPCC4J-301
title: HPCC4J-301 – several junit test failures/errors
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-301"
project: HPCC4J
key: HPCC4J-301
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-04-30
updated: 2020-05-01
resolved: 2020-05-01
components:   - WSClient
fixVersions:   - 7.8.12
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
several junit test failures/errors

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.WSPackageProcessTest.initializationError\t3 ms\t2"}, {"type": "hardBreak"}, {"type": "text", "text": "org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitSort\t77 ms\t4"}, {"type": "hardBreak"}, {"type": "text", "text": "org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitByAppName\t10 sec\t4"}, {"type": "hardBreak"}, {"type": "text", "text": "org.hpccsystems.ws.client.platform.EclParseRegressionTest.testSingle"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
