---
id: jira-HPCC4J-45
title: HPCC4J-45 – Multiple States for WuQuery
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-45"
project: HPCC4J
key: HPCC4J-45
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2016-04-25
updated: 2016-04-25
resolved: 2016-04-25
components:   - WSClient
fixVersions: []
labels:   - Feature
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
Multiple States for WuQuery

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HIPIE/DSP would like a way to display a list of all \"active\" work units.  This would be any workunits in the following states: \"running\",\"compiling\",\"blocked\",\"queued\" or \"aborting\"."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The current WUQuery schema only allows passing of a single state."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HIPIE/issues/1503", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HIPIE/issues/1503"}}]}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
