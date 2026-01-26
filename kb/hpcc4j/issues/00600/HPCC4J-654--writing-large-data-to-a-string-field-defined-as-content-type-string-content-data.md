---
id: jira-HPCC4J-654
title: HPCC4J-654 – writing large data to a string field defined as content_type  STRING content_data {BLOB, MAXLENGTH(2000000)} fails
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-654"
project: HPCC4J
key: HPCC4J-654
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-24
updated: 2025-05-13
resolved: 2025-05-13
components:   - dfsclient
fixVersions: []
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
writing large data to a string field defined as content_type  STRING content_data {BLOB, MAXLENGTH(2000000)} fails

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "when attempting to write a string that is 197k in size to an hpcc file using hpcc4j, an error occurs:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "FileWriterFactory: HPCC Was unhappy writing record - node (10.194.167.17) -Error while writing field: content_data of type: STRING: (Connection reset by peer)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Records with shorter values in content_data successfully write to hpcc.  You can see the ecl layout and other file info for the successfully written data in file "}, {"type": "text", "text": "drea::intermediate_log_20240923", "marks": [{"type": "strong"}]}, {"type": "text", "text": " on "}, {"type": "text", "text": "https://alpha-dev-thor-esp.risk.regn.net:18010/", "marks": [{"type": "link", "attrs": {"href": "https://alpha-dev-thor-esp.risk.regn.net:18010/"}}]}, {"type": "text", "text": "."}]}, {"type

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
