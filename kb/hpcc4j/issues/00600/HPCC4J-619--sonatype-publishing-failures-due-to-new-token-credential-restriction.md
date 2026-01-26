---
id: jira-HPCC4J-619
title: HPCC4J-619 – Sonatype publishing failures due to new token credential restriction
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-619"
project: HPCC4J
key: HPCC4J-619
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-06-24
updated: 2024-06-24
resolved: 2024-06-24
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
Sonatype publishing failures due to new token credential restriction

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Github actions responsible for publishing deliverables to sonatype are failing w/ the following error:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "status: 401 Content access is protected by token"}]}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/actions/runs/9646969322/job/26604678586#step:4:166"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Description of problem:"}]}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://support.sonatype.com/hc/en-us/articles/360049469534-401-Content-access-is-protected-by-token-when-accessing-repositories"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Steps to resolve:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "W

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
