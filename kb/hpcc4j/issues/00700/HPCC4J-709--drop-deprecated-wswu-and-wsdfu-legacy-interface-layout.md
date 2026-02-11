---
id: jira-HPCC4J-709
title: HPCC4J-709 – Drop deprecated WsWU and WsDFU legacy interface layout
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-709"
project: HPCC4J
key: HPCC4J-709
status: New
statusCategory: To Do
resolution: null
created: 2025-04-22
updated: 2025-04-22
resolved: null
components:
  - BuildPackaging
  - dfsclient
  - WSClient
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
Drop deprecated WsWU and WsDFU legacy interface layout

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClient will drop support for legacy wsworkunits and wsdfu interface. The affected packages/classes have been deprecated since 8.4.x:"}]}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/pull/504"}}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The following packages will be affected:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39 (to be removed and replaced by org.hpccsystems.ws.client.gen.axis2.wsdfu.latest)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56 (to be removed and replaced by org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest)"}]}, {"type": "paragraph", "content": [{"type": "text",

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
