---
id: jira-HPCC4J-450
title: HPCC4J-450 – ClassCastException when trying to get HPCC Build details
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-450"
project: HPCC4J
key: HPCC4J-450
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-02-11
updated: 2022-02-22
resolved: 2022-02-22
components:   - WSClient
fixVersions:   - 8.6.4
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
ClassCastException when trying to get HPCC Build details

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "getting below error when trying to get file information using 8.6.0-1"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "ERROR HPCCWsDFUClient HPCCWsDFUClient: Could not determine HPCC build version: class org.apache.http.impl.client.InternalHttpClient cannot be cast to class org.apache.commons.httpclient.HttpClient (org.apache.http.impl.client.InternalHttpClient and org.apache.commons.httpclient.HttpClient are in unnamed module of loader 'app')"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "at org.hpccsystems.ws.client.BaseHPCCWsClient.verifyStub(BaseHPCCWsClient.java:246)at org.hpccsystems.ws.client.BaseHPCCWsClient.verifyStub(BaseHPCCWsClient.java:246) at org.hpccsystems.ws.client.HPCCWsDFUClient.getFiles(HPCCWsDFUClient.java:446) at org.hpccsystems.ws.client.WsDFUClientTest.getFi

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
