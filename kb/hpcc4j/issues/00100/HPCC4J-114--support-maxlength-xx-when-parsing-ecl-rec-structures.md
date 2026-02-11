---
id: jira-HPCC4J-114
title: "HPCC4J-114 – Support, \"{,MAXLENGTH(xx) when parsing ecl rec structures"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-114"
project: HPCC4J
key: HPCC4J-114
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-04-16
updated: 2018-07-10
resolved: 2018-07-10
components:   - WSClient
fixVersions:   - 7.0.0
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
Support, "{,MAXLENGTH(xx) when parsing ecl rec structures

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently the following record structure fails when trying to parse it:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "{,maxLength(84)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0string4 sic4_code, string80 sic4_description };"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Update the ecl parsing antlr grammer in wsclient to handle parsing inline rec structures with \",maxlength(xx) or other opts."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
