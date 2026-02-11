---
id: jira-HPCC4J-256
title: HPCC4J-256 – Not Thread Safe - Strange getWUInfo Results
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-256"
project: HPCC4J
key: HPCC4J-256
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-11-22
updated: 2020-01-21
resolved: 2020-01-21
components:   - WSClient
fixVersions:   - 7.6.20
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
Not Thread Safe - Strange getWUInfo Results

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We have a system that spans a bunch of threads and reads certain work units into a database.\u00a0 Before the Axis2 changes, this worked fine.\u00a0 After, we see strange random errors while reading in the workunits.\u00a0 Here is an example:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "Caused by: com.ctc.wstx.exc.WstxParsingException: Unexpected close tag </ECLchemaItem>; expected </ECLSchemas>.\r\n at [row,col {unknown-source}]: [36,9589]\r\n\tat com.ctc.wstx.sr.StreamScanner.constructWfcException(StreamScanner.java:621) ~[woodstox-core-5.0.3.jar:5.0.3]\r\n\tat com.ctc.wstx.sr.StreamScanner.throwParseError(StreamScanner.java:491) ~[woodstox-core-5.0.3.jar:5.0.3]\r\n\tat com.ctc.wstx.sr.StreamScanner.throwParseError(StreamScanner.java:475) ~[woodstox-core-5.0.3.ja

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
