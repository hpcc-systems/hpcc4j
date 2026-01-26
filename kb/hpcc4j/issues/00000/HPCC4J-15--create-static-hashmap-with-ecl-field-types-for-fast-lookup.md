---
id: jira-HPCC4J-15
title: HPCC4J-15 – create static hashmap with ecl field types for fast lookup
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-15"
project: HPCC4J
key: HPCC4J-15
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2015-07-24
updated: 2024-04-08
resolved: 2015-08-10
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
create static hashmap with ecl field types for fast lookup

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "fyi "}, {"type": "mention", "attrs": {"id": "62e8e034c1b3a10ac3a9c670", "text": "@Drea Leed", "accessLevel": ""}}, {"type": "hardBreak"}, {"type": "text", "text": "we should use fast lookup hash rather than string comparisons for field type names:"}, {"type": "hardBreak"}, {"type": "text", "text": "GetRecordFromECL line 335."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Migrate mapECLTypeNameToSQLType from jdbc driver to japi for general use."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
