---
id: jira-HPCC4J-490
title: HPCC4J-490 – HPCCWsFileIOClient readFileData requires landign zone name vs ip/host in containerized version but worked on the ip on hardware
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-490"
project: HPCC4J
key: HPCC4J-490
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2022-09-19
updated: 2022-10-28
resolved: 2022-10-28
components: []
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
HPCCWsFileIOClient readFileData requires landign zone name vs ip/host in containerized version but worked on the ip on hardware

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Result is \"Failed to access the destination: localhost /StockANN.csv.\""}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In non containerized this could take the ip for the landing zone, in containerized it requires the dropzone name."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
