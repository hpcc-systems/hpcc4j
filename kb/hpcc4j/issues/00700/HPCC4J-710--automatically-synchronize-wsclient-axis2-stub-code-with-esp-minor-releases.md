---
id: jira-HPCC4J-710
title: HPCC4J-710 – Automatically synchronize wsclient axis2 stub code with ESP minor releases
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-710"
project: HPCC4J
key: HPCC4J-710
status: New
statusCategory: To Do
resolution: null
created: 2025-04-22
updated: 2025-09-30
resolved: null
components: []
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Automatically synchronize wsclient axis2 stub code with ESP minor releases

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Ideally a github action would trigger upon the creation of new candidate branches, which would fetch the latest version of all supported WSDLs and would trigger the process to update all wsclient wrappers and axis2 stubs"}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
