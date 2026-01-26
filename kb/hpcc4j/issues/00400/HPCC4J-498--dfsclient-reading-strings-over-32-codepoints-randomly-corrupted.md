---
id: jira-HPCC4J-498
title: "HPCC4J-498 – DFSClient: Reading strings over 32 codepoints randomly corrupted"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-498"
project: HPCC4J
key: HPCC4J-498
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-01-09
updated: 2023-02-09
resolved: 2023-02-09
components:   - dfsclient
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
DFSClient: Reading strings over 32 codepoints randomly corrupted

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Reading some string fields over 32 char points are being corrupted. Generally the first 4 characters are correct, but the remainder of the string is mangled. Seems to be happening along near the end of the scratch buffer capacity."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
