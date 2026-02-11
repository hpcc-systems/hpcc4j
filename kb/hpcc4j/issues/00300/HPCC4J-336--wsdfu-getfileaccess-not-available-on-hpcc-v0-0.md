---
id: jira-HPCC4J-336
title: HPCC4J-336 – WSDFU getFileAccess not available on HPCC v0.0
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-336"
project: HPCC4J
key: HPCC4J-336
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-10-06
updated: 2020-10-16
resolved: 2020-10-16
components:   - WSClient
fixVersions:   - 7.12.4
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
WSDFU getFileAccess not available on HPCC v0.0

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Trying to get HPCC-Spark connector working."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Getting this error when trying to read an HPCC file from Spark:"}]}, {"type": "blockquote", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "ERROR client.HPCCFile: Unable to retrieve file or record information: WSDFU getFileAccess not available on HPCC v0.0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "ERROR datasource.HpccRelation:\u00a0 Unable to translate HPCC record defintion [sic] to Spark schema:Unable to retrieve file or record information: WSDFU getFileAccess not available on HPCC v0.0"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "We started working with a new Enterprise Edition build built by LNSSI."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In this build, the version string starts with

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
