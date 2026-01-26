---
id: jira-HPCC4J-750
title: HPCC4J-750 – Expand test coverage of HPCCWsStoreClient and add missing listStores() method
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-750"
project: HPCC4J
key: HPCC4J-750
status: New
statusCategory: To Do
resolution: null
created: 2025-10-17
updated: 2025-10-17
resolved: null
components: []
fixVersions: []
labels:
  - coverage-improvement
  - enhancement
  - testing
  - wsclient
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Expand test coverage of HPCCWsStoreClient and add missing listStores() method

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Background: Analysis of the existing HPCC4J wsclient test suite revealed gaps in HPCCWsStoreClient test coverage including missing listStores() client method, untested deleteValue() method, and minimal listNSKeys() coverage. Changes: 1) Added missing listStores() method with proper wrapper types following project architecture, 2) Added comprehensive tests (a5deleteValueTest, listStoresTest, listStoresWithFilterTest, a6listNSKeysTest). Results: All 13/13 public methods now have test coverage, increased from 20 to 24 test methods. GitHub PR: https://github.com/hpcc-systems/hpcc4j/pull/890 Files: +73 lines in HPCCWsStoreClient.java, +149 lines in WSStoreClientTest.java"}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
