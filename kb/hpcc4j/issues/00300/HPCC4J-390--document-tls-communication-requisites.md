---
id: jira-HPCC4J-390
title: HPCC4J-390 – Document TLS communication requisites
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-390"
project: HPCC4J
key: HPCC4J-390
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-03-09
updated: 2021-04-07
resolved: 2021-04-07
components:   - Documentation
fixVersions:   - 8.0.4
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
Document TLS communication requisites

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClient, DfsClient, and the Spark connector should disclose the need to add appropriate certs to java keystore in order to communicate with HPCC web services over TLS"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "FYI "}, {"type": "mention", "attrs": {"id": "712020:b9496940-9271-44cd-8e49-bec66ea3bbec", "text": "@Jim DeFabia", "accessLevel": ""}}, {"type": "text", "text": " "}, {"type": "mention", "attrs": {"id": "712020:53a36fd5-41dc-4f77-8493-82b0dac697ad", "text": "@James McMullan", "accessLevel": ""}}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
