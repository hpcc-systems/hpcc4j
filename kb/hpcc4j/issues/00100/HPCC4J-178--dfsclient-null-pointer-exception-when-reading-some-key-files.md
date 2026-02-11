---
id: jira-HPCC4J-178
title: "HPCC4J-178 – DFSClient: Null pointer exception when reading some key files"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-178"
project: HPCC4J
key: HPCC4J-178
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-17
updated: 2019-05-23
resolved: 2019-05-23
components:   - dfsclient
fixVersions:   - 7.2.14
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
DFSClient: Null pointer exception when reading some key files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When reading and converting the JSON record definition to a FieldDef hierarchy the flag RFTMispayloadfield (0x10000) is being dropped. This causes dafilesrv to have the wrong meta information and throw an exception when reading fields that should have this flag."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
