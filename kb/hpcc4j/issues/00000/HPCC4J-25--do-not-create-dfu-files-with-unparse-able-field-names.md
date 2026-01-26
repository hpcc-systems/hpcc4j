---
id: jira-HPCC4J-25
title: HPCC4J-25 – Do not create dfu files with unparse-able field names
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-25"
project: HPCC4J
key: HPCC4J-25
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2015-08-14
updated: 2016-01-04
resolved: 2016-01-04
components:   - RDFIngest
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
Do not create dfu files with unparse-able field names

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Certain components enforce strict field naming conventions which disallow the use of '-' characters. The RDF ingest process should avoid any invalid characters."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
