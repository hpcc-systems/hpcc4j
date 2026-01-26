---
id: jira-HPCC4J-499
title: HPCC4J-499 – Add flag to BinaryRecordReader to use when loading Unsigned8s
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-499"
project: HPCC4J
key: HPCC4J-499
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-01-09
updated: 2023-02-09
resolved: 2023-02-09
components:   - dfsclient
fixVersions:   - 8.12.2
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
Add flag to BinaryRecordReader to use when loading Unsigned8s

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Can you add a useDecimalForUnsigned8 flag to BinaryRecordReader, defining whether to load unsigned8s as bigIntegers rather than longs? Exactly the same thing that exists in ThorFileReader.\u00a0 The vault in the cloud project is running into that exact overflow issue, using the tardis lenticmanager and we need a way to set that flag for particular files. This is blocking their testing process."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
