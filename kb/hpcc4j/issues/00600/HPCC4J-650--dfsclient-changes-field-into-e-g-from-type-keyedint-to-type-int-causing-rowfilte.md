---
id: jira-HPCC4J-650
title: HPCC4J-650 – dfsclient changes field into (e.g. from type_keyedint to type_int) causing rowfiltering to fail
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-650"
project: HPCC4J
key: HPCC4J-650
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-19
updated: 2024-10-03
resolved: 2024-10-03
components:   - dfsclient
fixVersions:
  - 9.2.128
  - 9.4.102
  - 9.6.54
  - 9.8.28
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
dfsclient changes field into (e.g. from type_keyedint to type_int) causing rowfiltering to fail

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Reading a index via the rowservice with a keyFilter on a scalar key field fails to match. (NB: but does if the value\u2019s endianness is reversed)."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Sample ECL to create test query attached (bi.ecl)."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Using hpcc4j test:"}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "java -cp dfsclient-9.8.21-0-SNAPSHOT-jar-with-dependencies.jar org.hpccsystems.dfs.client.FileUtility -read_test somescope::somefile -ur\nl http://localhost:8010 -filter \"id=1\" -ignore_tlk"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "fails to return any records."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This however does return the id=1 match:"}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "java -cp dfsclient-9.8.21-0-

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
