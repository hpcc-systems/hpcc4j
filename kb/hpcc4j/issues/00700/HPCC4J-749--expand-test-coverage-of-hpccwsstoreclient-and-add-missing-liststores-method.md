---
id: jira-HPCC4J-749
title: HPCC4J-749 – Expand test coverage of HPCCWsStoreClient and add missing listStores() method
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-749"
project: HPCC4J
key: HPCC4J-749
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-10-16
updated: 2025-10-23
resolved: null
components: []
fixVersions: []
labels:
  - enhancement
  - testing
  - wsclient
applies_to: hpcc4j: *
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Expand test coverage of HPCCWsStoreClient and add missing listStores() method

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "## GitHub Pull Request\nhttps://github.com/hpcc-systems/hpcc4j/pull/890\n\n## Background\nAnalysis of the existing HPCC4J wsclient test suite revealed gaps in HPCCWsStoreClient test coverage:\n\n1. **Missing client method**: The listStores() API existed in the generated Axis2 interface but had no corresponding wrapper method in HPCCWsStoreClient\n2. **Untested method**: deleteValue() existed in the client but lacked direct tests  \n3. **Minimal coverage**: listNSKeys() was only called indirectly without direct validation\n\n## Changes Implemented\n\n### 1. Added Missing Client Methods (HPCCWsStoreClient.java)\n- Implemented listStores() method with optional filtering by name, type, and owner\n- Returns StoreInfoWrapper[] (wrapper layer types) instead of generated Axis2 stubs\n- Includes proper exception handling and OpenTelemetry distributed tracing annotations\n- Follows existing code

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
