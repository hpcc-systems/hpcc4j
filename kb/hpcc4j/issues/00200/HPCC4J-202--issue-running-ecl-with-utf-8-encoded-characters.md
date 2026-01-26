---
id: jira-HPCC4J-202
title: HPCC4J-202 – Issue running ecl with utf-8 encoded characters
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-202"
project: HPCC4J
key: HPCC4J-202
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-06-05
updated: 2019-09-05
resolved: 2019-09-05
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
Issue running ecl with utf-8 encoded characters

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Recently some of our customers have reported issues running ecl that includes utf-8 characters. I traced the problem down to wsclient. If you run the following java:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "WorkunitInfo wu=new WorkunitInfo();"}, {"type": "hardBreak"}, {"type": "text", "text": "wu.setECL(\"OUTPUT('\u00b6');\");"}, {"type": "hardBreak"}, {"type": "text", "text": "wu.setJobname(\"test\");"}, {"type": "hardBreak"}, {"type": "text", "text": "wu.setCluster(\"dev_thor\");"}, {"type": "hardBreak"}, {"type": "text", "text": "HPCCWsWorkUnitsClient conn=Platform.get(\"http\",\"10.173.10.159\",8010,\"user\",\"password\").getWsWorkunitsClient();"}, {"type": "hardBreak"}, {"type": "text", "text": "conn.createAndRunWUFromECL(wu);"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The workunit throws an error \u201cCharacter in string literal is n

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 02. Blocks: HPCC4J-105
