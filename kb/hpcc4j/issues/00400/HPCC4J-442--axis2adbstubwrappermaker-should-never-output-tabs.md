---
id: jira-HPCC4J-442
title: HPCC4J-442 – Axis2ADBStubWrapperMaker should never output tabs
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-442"
project: HPCC4J
key: HPCC4J-442
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-10-27
updated: 2021-11-02
resolved: 2021-11-02
components:   - BuildPackaging
fixVersions:   - 8.4.10
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
Axis2ADBStubWrapperMaker should never output tabs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Axis2ADBStubWrapperMaker, which is used to generate wrappers around the generated stub code (wsclient/org.hpccsystems.ws.client.wrappers.gen.<servicename>) is currently outputting tabs. It should only output spaces."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
