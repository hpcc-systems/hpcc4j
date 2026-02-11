---
id: jira-HPCC4J-513
title: "HPCC4J-513 – wsclient BaseHPCCWsClient \"Can't stablish\" caused by thread safe"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-513"
project: HPCC4J
key: HPCC4J-513
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-05-30
updated: 2023-06-27
resolved: 2023-06-15
components:   - WSClient
fixVersions:   - 8.12.x
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
wsclient BaseHPCCWsClient "Can't stablish" caused by thread safe

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When making calls to BaseHpccWsCLient::initBaseWsClient you will at random see this stack trace.\u00a0 It appears to be caused by javax.xml.parsers.DocumentBuilder m_XMLParser not being thread safe.\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Here is the stack trace our logging is capturing.\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "2023-05-09 16:17:55 ERROR new[ramps_cert_fraudgov]: Failed to query work units."}, {"type": "hardBreak"}, {"type": "text", "text": "java.lang.Exception: WS Client Stub not available."}, {"type": "hardBreak"}, {"type": "text", "text": "BaseHPCCWsClient: Could not stablish target HPCC bulid version, review all HPCC connection values"}, {"type": "hardBreak"}, {"type": "text", "text": "FWK005 parse may not be called while parsing."}, {"type": "hardBreak"}, {"type": "text", "text": "Cannot initialize HPCCWs

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
