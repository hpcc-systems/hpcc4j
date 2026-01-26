---
id: jira-HPCC4J-488
title: HPCC4J-488 – Illegal capacity error reading child dataset field in index
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-488"
project: HPCC4J
key: HPCC4J-488
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-09-13
updated: 2022-09-27
resolved: 2022-09-27
components:   - dfsclient
fixVersions:   - 8.8.16
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
Illegal capacity error reading child dataset field in index

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Error reading the index thor_data400::key::avm_v2::20220627::medians_voctest on "}, {"type": "text", "text": "https://alpha-vault-thor-esp.risk.regn.net:18010/.", "marks": [{"type": "link", "attrs": {"href": "https://alpha-vault-thor-esp.risk.regn.net:18010/"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In BinaryRecordReader, when deducing the array size for the child dataset \"history\", the calculated array size is less than 0 and throws an illegal capacity error. (See attached screenshot.)\u00a0 This is happening when parsing the first record."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In debug mode the field def len for history seems to be 4, even though the field def in the ecl watch view shows 1

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
