---
id: jira-HPCC4J-300
title: HPCC4J-300 – JAPI failed JUNIT EclParseRegressionTest.testSingle
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-300"
project: HPCC4J
key: HPCC4J-300
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-04-30
updated: 2020-05-08
resolved: 2020-05-08
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
JAPI failed JUNIT EclParseRegressionTest.testSingle

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "EclParseRegressionTest/testSingle/ is failing because it's expecting to find \"anthem::enc_wpt_edw_provider_thor_superfile\""}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Does this test require a specific record layout? Can it target one of the generated files? "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Failed"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.platform.EclParseRegressionTest.testSingle"}, {"type": "hardBreak"}, {"type": "text", "text": "Failing for the past 6 builds (Since Unstable#44 )"}, {"type": "hardBreak"}, {"type": "text", "text": "Took 15 ms."}, {"type": "hardBreak"}, {"type": "text", "text": "add description"}, {"type": "hardBreak"}, {"type": "text", "text": "Error Message"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Could Not ListFiles:2020-04-30 23:01:49 GMT:

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
