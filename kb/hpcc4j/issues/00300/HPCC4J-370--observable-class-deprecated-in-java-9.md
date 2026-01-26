---
id: jira-HPCC4J-370
title: HPCC4J-370 – Observable class deprecated in java 9
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-370"
project: HPCC4J
key: HPCC4J-370
status: New
statusCategory: To Do
resolution: null
created: 2021-01-04
updated: 2025-09-30
resolved: null
components:   - WSClient
fixVersions: []
labels:   - CopilotCandidate
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
Observable class deprecated in java 9

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "/wsclient/src/main/java/org/hpccsystems/ws/client/platform/FileSprayWorkunit.java"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.util.Observable"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "@Deprecated(since=\"9\")"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Deprecated. This class and the Observer interface have been deprecated.The event model supported by Observer and Observableis quite limited, the order of notifications delivered by Observable is unspecified, and state changes are not inone-for-one correspondence with notifications.For a richer event model, consider using the java.beans package. For reliable and orderedmessaging among threads, consider using one of the concurrent datastructures in the java.util.concurrent package.For reactive streams style programming, see the java.util.concurrent.Flow API."}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
