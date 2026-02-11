---
id: jira-HPCC4J-133
title: HPCC4J-133 – Integrationtests failures
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-133"
project: HPCC4J
key: HPCC4J-133
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-10-24
updated: 2019-02-26
resolved: 2019-02-26
components:   - WSClient
fixVersions:   - 7.2.0
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
Integrationtests failures

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Integrationtests profiles failing:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "-------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "T E S T S"}, {"type": "hardBreak"}, {"type": "text", "text": "-------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "Running org.hpccsystems.ws.client.WUQueryTest"}, {"type": "hardBreak"}, {"type": "text", "text": "Oct 24, 2018 10:47:01 AM org.apache.axis.client.Call invoke"}, {"type": "hardBreak"}, {"type": "text", "text": "SEVERE: Exception:"}, {"type": "hardBreak"}, {"type": "text", "text": "org.xml.sax.SAXException: Invalid element in org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLWorkunit - HaveSubGraphTimings"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.apache.axis.encoding.ser.BeanDeserializer.onStart

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
