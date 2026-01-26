---
id: jira-HPCC4J-169
title: HPCC4J-169 – Error During First Spray / Error Reporting
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-169"
project: HPCC4J
key: HPCC4J-169
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-02
updated: 2019-04-03
resolved: 2019-04-03
components:   - WSClient
fixVersions:   - 7.2.0.1
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
Error During First Spray / Error Reporting

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "For some reason, the first time we use the HPCCFileSprayClient in our integration environment, we get the following error:"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "019-04-01 16:09:29 ERROR HPCCFileSprayClient:997 - HTTP Error reported on File upload related to a server redirect, please verify on server."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "There seems to be special handling for this:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "catch (Exception e) {\r\n  if (!fileUploadURL.equals(fileUploadConnection.getURL())) {\r\n     log.error(\"HTTP Error reported on File upload related to a server redirect, please verify on server.\");\r\n  }\r\n\r\n  if (verbose)\r\n     e.printStackTrace();\r

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
