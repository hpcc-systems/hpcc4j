---
id: jira-HPCC4J-524
title: HPCC4J-524 – Test failures in FileSpray & WSFileIO
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-524"
project: HPCC4J
key: HPCC4J-524
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2023-07-17
updated: 2023-12-19
resolved: 2023-12-19
components:   - WSClient
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
Test failures in FileSpray & WSFileIO

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Tests in FileSpray / WSFileIO have started failing. The failing tests seem to be related to drop zones."}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "FileSprayClientTest.testDeleteDropZoneFile:237->testUploadFile:188 The File could not be uploaded"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "FileSprayClientTest.testUploadFile:188 The File could not be uploaded"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WSFileIOClientTest.BwriteHPCCFile:148"}]}]}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
