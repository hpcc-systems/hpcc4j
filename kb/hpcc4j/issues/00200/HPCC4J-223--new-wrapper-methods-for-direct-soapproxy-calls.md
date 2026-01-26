---
id: jira-HPCC4J-223
title: HPCC4J-223 – New Wrapper methods for direct SoapProxy() calls
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-223"
project: HPCC4J
key: HPCC4J-223
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-08-28
updated: 2019-09-16
resolved: 2019-09-16
components:   - WSClient
fixVersions:   - 7.6.0
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
New Wrapper methods for direct SoapProxy() calls

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The following soap proxy calls are used directly and should be replaced by wrappers methods in the services:"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "ReadFileDataResponse  dataResponse=WsFileIOServiceSoapProxy.getSoapProxy().readFileData(\r\n                    new ReadFileDataRequest(dropzoneIP, fileName, offset, bytes));"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Needs the following wrapper method:"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "ReadFileDataResponseWrapper response=HPCCWsFileIOClient.readFileData(ReadFileDataRequestWrapper wrapper)"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "TpTargetClusterQueryResponse targetClustersResponse = WsTopologySoapService\r\n                    .tpTargetClusterQuery

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
