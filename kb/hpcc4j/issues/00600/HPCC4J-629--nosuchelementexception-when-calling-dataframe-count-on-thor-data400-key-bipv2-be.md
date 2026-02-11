---
id: jira-HPCC4J-629
title: "HPCC4J-629 – NoSuchElementException  when calling `DataFrame.count` on `thor_data400::key::bipv2_best::built::linkids` with filter"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-629"
project: HPCC4J
key: HPCC4J-629
status: Resolved
statusCategory: Done
resolution: Duplicate
created: 2024-08-16
updated: 2024-08-22
resolved: 2024-08-22
components:   - Spark
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
NoSuchElementException  when calling `DataFrame.count` on `thor_data400::key::bipv2_best::built::linkids` with filter

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Using following ECL filter to create Spark DataFrame: "}, {"type": "text", "text": "\"isactive = true\"", "marks": [{"type": "code"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": " Results in the following stack trace:"}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "Job aborted due to stage failure: Task 315 in stage 6.0 failed 4 times, most recent failure: Lost task 315.3 in stage 6.0 (TID 1920) (10.107.13.11 executor 3): java.util.NoSuchElementException: Fatal read error: java.io.IOException: \nReceived ERROR from Thor node (rowservice-hpcc.us-dataland-prod.azure.lnrsg.io): Code: '8029' Message: 'ERROR: cmd=RFCStreamRead, error=Internal Error (3000, assert(numFilterFields() == keySegCount) failed - file: jhtree.cpp, line 2427)'\n\tat org.hpccsystems.dfs.client.HpccRemoteFileReader.hasNext(HpccRemoteFileReader.java:438)\n\tat org.hpccsystems.dfs.clie

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
