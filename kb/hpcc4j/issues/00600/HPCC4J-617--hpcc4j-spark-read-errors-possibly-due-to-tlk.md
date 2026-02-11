---
id: jira-HPCC4J-617
title: HPCC4J-617 – HPCC4J Spark read errors possibly due to TLK
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-617"
project: HPCC4J
key: HPCC4J-617
status: Resolved
statusCategory: Done
resolution: Duplicate
created: 2024-06-12
updated: 2024-08-22
resolved: 2024-08-22
components:
  - dfsclient
  - Spark
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
HPCC4J Spark read errors possibly due to TLK

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Using following code to test HPCC4J. Toggling setUseTLK and running with set to false and true."}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "HPCCFile file = new HPCCFile(\"thor_data400::key::bipv2_best::qa::linkids\", \"https://eclwatch-hpcc.us-prod400thor-prod.azure.lnrsg.io:443\", \"<USER>\", \"<PASS\");\nfile.setFileAccessExpirySecs(7200);\nfile.setUseTLK(false);\n\nDataPartition[] fileParts = file.getFileParts();\nFieldDef originalRD = file.getRecordDefinition();\n\nHPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());\nHpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[0], originalRD, recordBuilder);\n\nfileReader.close();\n"}]}, {"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "Results"}]}, {"type": "paragraph", "conte

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
