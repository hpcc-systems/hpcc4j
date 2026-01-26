---
id: jira-HPCC4J-323
title: HPCC4J-323 – BigDecimals not writing to hpcc
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-323"
project: HPCC4J
key: HPCC4J-323
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-08-11
updated: 2020-08-28
resolved: 2020-08-28
components:   - dfsclient
fixVersions:   - 7.10.x
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
BigDecimals not writing to hpcc

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When writing BigDecimals to hpcc, an error is thrown:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.lang.ArrayIndexOutOfBoundsException", "marks": [{"type": "underline"}]}, {"type": "text", "text": ": 16"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0 at org.hpccsystems.dfs.client.BinaryRecordWriter.writeDecimal("}, {"type": "text", "text": "BinaryRecordWriter.java:820", "marks": [{"type": "underline"}]}, {"type": "text", "text": ")"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0 at org.hpccsystems.dfs.client.BinaryRecordWriter.writeField("}, {"type": "text", "text": "BinaryRecordWriter.java:342", "marks": [{"type": "underline"}]}, {"type": "text", "text": ")"}]}, {"type": "paragraph",

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
