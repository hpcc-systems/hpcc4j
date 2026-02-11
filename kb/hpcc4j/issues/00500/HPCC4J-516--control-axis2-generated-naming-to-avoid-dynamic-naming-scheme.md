---
id: jira-HPCC4J-516
title: HPCC4J-516 – Control Axis2 generated naming to avoid dynamic naming scheme
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-516"
project: HPCC4J
key: HPCC4J-516
status: New
statusCategory: To Do
resolution: null
created: 2023-06-22
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
Control Axis2 generated naming to avoid dynamic naming scheme

{"type": "doc", "version": 1, "content": [{"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph"}, {"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph"}, {"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "'Incompatible Wrapper Types Java build-time error'"}]}]}]}]}]}]}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Axis2 generated client code can unexpectedly change class name in rare situations"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "It's been noticed that Axis2 generated stub code representing repeating (array) fields might utilize the following naming scheme <fieldName>_type<X>"}]}]}, {"type": "listItem", "content": [{"type":

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
