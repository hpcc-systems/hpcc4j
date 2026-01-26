---
id: jira-HPCC4J-573
title: "HPCC4J-573 – Antlr support of SET OF UTF8 field3set { DEFAULT(['']) }"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-573"
project: HPCC4J
key: HPCC4J-573
status: Resolved
statusCategory: Done
resolution: null
created: 2024-01-30
updated: 2024-03-28
resolved: null
components: []
fixVersions:   - 9.4.48
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
Antlr support of SET OF UTF8 field3set { DEFAULT(['']) }

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The ecl"}, {"type": "hardBreak"}, {"type": "text", "text": "SET OF UTF8 field3set { DEFAULT(['']) }"}, {"type": "hardBreak"}, {"type": "text", "text": "SET OF STRING field4set { DEFAULT(['']) }"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Isn't supported by the current antlr grammar file.\u00a0 It will load SET OF UTF8; without the { DEFAULT(['']) } update the grammar to support this syntax.\u00a0"}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
