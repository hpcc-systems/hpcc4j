---
id: jira-HPCC4J-607
title: "HPCC4J-607 – BaseHPCCWsClient shouldn't assume target connection includes ECLWatch services"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-607"
project: HPCC4J
key: HPCC4J-607
status: New
statusCategory: To Do
resolution: null
created: 2024-05-28
updated: 2025-09-29
resolved: null
components:   - WSClient
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
BaseHPCCWsClient shouldn't assume target connection includes ECLWatch services

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "All HPCCWsClients currently attempt to determine if target HPCC ESP is containerized or not. This works fine for ECLWatch based services, but the feature is not available for stand-alone services causing long connection timeouts and invalid failures:"}]}, {"type": "paragraph"}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] Running org.hpccsystems.ws.client.WsAttributesClientTest"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Fetching isTargetHPCCContainerized..."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "ERROR BaseHPCCWsClient BaseHPCCWsClient: Could not stablish target HPCC bulid version, review all HPCC connection values"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Connection timed out (Connection timed out)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "BaseHPCCWsClient: Could not dete

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
