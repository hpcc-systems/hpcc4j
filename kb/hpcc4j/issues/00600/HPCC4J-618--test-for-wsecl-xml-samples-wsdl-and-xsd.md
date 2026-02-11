---
id: jira-HPCC4J-618
title: HPCC4J-618 – Test for WsECL XML samples, wsdl and xsd
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-618"
project: HPCC4J
key: HPCC4J-618
status: Merge Pending
statusCategory: In Progress
resolution: null
created: 2024-06-14
updated: 2024-07-08
resolved: null
components:   - junit
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
Test for WsECL XML samples, wsdl and xsd

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Setup tests to exercise WsECL features that generate sample request/response XML, xsd and wsdl. This will require at least one query to be deployed to a roxie component. The target URL to send the HTTP GET message to will vary based on the name of he roxie component (represented below as <roxie>) and the name of the query (represented below as <query>)"}]}, {"type": "table", "attrs": {"isNumberColumnEnabled": false, "layout": "default", "localId": "a0bf8fbb-a876-42bf-a632-be8f2ebe9fe8"}, "content": [{"type": "tableRow", "content": [{"type": "tableHeader", "attrs": {"colwidth": [184]}, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Feature", "marks": [{"type": "strong"}]}]}]}, {"type": "tableHeader", "attrs": {"colwidth": [548]}, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "URL", "marks": [{"type": "strong"}]}]}]}]}, {"type": "tableRow

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
