---
id: jira-HPCC4J-104
title: HPCC4J-104 – Move ECLPackage class to common wsclient location
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-104"
project: HPCC4J
key: HPCC4J-104
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-25
updated: 2024-04-08
resolved: 2018-06-22
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
Move ECLPackage class to common wsclient location

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The ECLPackage class used by HIPIE and Kelbase would best be located in the HPCC-JAPI project referenced by both. \u00a0This class is a plain old java object that holds the information needed to compile ecl (list of imports, ecl to compile/packaged ecl, application values) as well as an errors collection for both ecl compilation errors and hpcc runtime errors.\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I propose putting the class into the utils directory."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
