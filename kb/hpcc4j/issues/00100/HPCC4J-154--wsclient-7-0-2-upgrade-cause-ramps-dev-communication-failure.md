---
id: jira-HPCC4J-154
title: HPCC4J-154 – wsclient 7.0.2 upgrade cause ramps_dev communication failure 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-154"
project: HPCC4J
key: HPCC4J-154
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-02-07
updated: 2019-03-05
resolved: 2019-02-22
components: []
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
wsclient 7.0.2 upgrade cause ramps_dev communication failure 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "when using wsclient 7.0.2 missing HaveSubGraphTimings flag causing below error when testing against ramps-dev"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.xml.sax.SAXException: Invalid element in org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLWorkunit - HaveSubGraphTimings"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
