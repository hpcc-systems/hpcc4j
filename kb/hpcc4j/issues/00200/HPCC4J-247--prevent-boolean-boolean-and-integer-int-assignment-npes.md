---
id: jira-HPCC4J-247
title: HPCC4J-247 – Prevent Boolean/boolean and Integer/int assignment NPEs
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-247"
project: HPCC4J
key: HPCC4J-247
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-25
updated: 2020-05-11
resolved: 2020-05-11
components:   - WSClient
fixVersions:   - 7.8.12
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
Prevent Boolean/boolean and Integer/int assignment NPEs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There are cases throughout wsclient where it's possible that Booleans in wrapper classes could be set to booleans in the raw classes. Same for Integers being set to int values. These could trigger NullPointerExceptions."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Go through the code and identify/fix all cases where this could occur."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
