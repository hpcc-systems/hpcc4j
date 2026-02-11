---
id: jira-HPCC4J-533
title: HPCC4J-533 – WsPackageProcess WSDL is not the correct version
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-533"
project: HPCC4J
key: HPCC4J-533
status: New
statusCategory: To Do
resolution: null
created: 2023-08-14
updated: 2024-04-08
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
WsPackageProcess WSDL is not the correct version

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The WSDL stored for WsPackageProcess version 1.06 is the WSDL for version 1.05. Please see the below link. You can search for \"soap:address\". and see the version is 1.05."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/hpcc4j/blob/master/wsclient/src/main/resources/WSDLs/WsPackageProcess-106.wsdl", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/blob/master/wsclient/src/main/resources/WSDLs/WsPackageProcess-106.wsdl"}}]}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
