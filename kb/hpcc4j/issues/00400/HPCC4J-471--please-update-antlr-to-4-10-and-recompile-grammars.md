---
id: jira-HPCC4J-471
title: HPCC4J-471 – Please update ANTLR to 4.10 (and recompile grammars)
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-471"
project: HPCC4J
key: HPCC4J-471
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-07-13
updated: 2022-07-18
resolved: 2022-07-18
components: []
fixVersions:   - 8.8.0
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
Please update ANTLR to 4.10 (and recompile grammars)

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I recently tried applying the following updates to a project using hpccsystems:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.antlr:antlr4 ..................................... 4.9.3 -> 4.10.1", "marks": [{"type": "code"}]}, {"type": "hardBreak"}, {"type": "text", "text": "org.antlr:antlr4-runtime ............................. 4.9.3 -> 4.10.1", "marks": [{"type": "code"}]}, {"type": "hardBreak"}, {"type": "text", "text": "org.hpccsystems:dfsclient ....................... 8.6.34-1 -> 8.6.40-1", "marks": [{"type": "code"}]}, {"type": "hardBreak"}, {"type": "text", "text": "org.hpccsystems:wsclient ........................ 8.6.34-1 -> 8.6.40-1", "marks": [{"type": "code"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "but saw errors in some of our unit tests indicating the hpccsystems code includes ANTLR-generated code that is incompatible with the

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
