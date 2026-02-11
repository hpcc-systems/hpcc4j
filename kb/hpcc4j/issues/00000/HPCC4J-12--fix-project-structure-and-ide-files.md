---
id: jira-HPCC4J-12
title: HPCC4J-12 – Fix project structure and IDE files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-12"
project: HPCC4J
key: HPCC4J-12
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-07-23
updated: 2015-08-10
resolved: 2015-07-30
components:   - BuildPackaging
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
Fix project structure and IDE files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There are a few cleanup items we need to perform to bring this repo inline with best practices:"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Module names should be simple (not java package structure names)"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Maven versions should include SNAPSHOT qualifier"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Master should be used for active work "}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "(which means master version > version branches)"}]}]}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Environment specific files shou

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
