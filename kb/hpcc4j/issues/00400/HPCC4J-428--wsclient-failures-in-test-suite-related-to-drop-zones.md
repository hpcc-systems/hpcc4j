---
id: jira-HPCC4J-428
title: HPCC4J-428 – WSClient failures in test suite related to drop zones
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-428"
project: HPCC4J
key: HPCC4J-428
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-08-31
updated: 2021-09-14
resolved: 2021-09-14
components:   - WSClient
fixVersions:   - 8.2.x
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
WSClient failures in test suite related to drop zones

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Tests related to the landing zone are failing see below errors:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "ERROR BaseHPCCWsClient ArrayOfEspExceptionWrapper: Could Not FetchDropzones", "marks": [{"type": "strong"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Error: Tests run: 15, Failures: 4, Errors: 0, Skipped: 1, Time elapsed: 6.039 s <<< FAILURE! - in org.hpccsystems.ws.client.FileSprayClientTest"}, {"type": "hardBreak"}, {"type": "text", "text": "Error: testDeleteDropZoneFile(org.hpccsystems.ws.client.FileSprayClientTest) Time elapsed: 0.131 s <<< FAILURE!"}, {"type": "hardBreak"}, {"type": "text", "text": "java.lang.AssertionError: The File could not be uploaded"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.FileSprayClientTest.testUploadFile(FileSprayClientTest.java:194)"}, {"type": "hardBreak"}, {"type":

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
