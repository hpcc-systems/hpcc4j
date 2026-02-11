---
id: jira-HPCC4J-608
title: HPCC4J-608 – Jirabot merge fix version failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-608"
project: HPCC4J
key: HPCC4J-608
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-05-28
updated: 2024-07-23
resolved: 2024-07-23
components:   - BuildPackaging
fixVersions:
  - 9.4.0
  - 9.2.108
  - 9.4.82
  - 9.6.34
  - 9.8.8
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
Jirabot merge fix version failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Traceback (most recent call last):"}]}, {"type": "paragraph", "content": [{"type": "text", "text": " File \"/home/runner/work/_temp/5a246ed4-f0ac-4871-84d3-3c4ca97b3c10.py\", line 171, in <module>"}]}, {"type": "paragraph", "content": [{"type": "text", "text": " fixVersions = generateFixVersionList(jira, branch_name)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": " File \"/home/runner/work/_temp/5a246ed4-f0ac-4871-84d3-3c4ca97b3c10.py\", line 87, in generateFixVersionList"}]}, {"type": "paragraph", "content": [{"type": "text", "text": " jira.add_version(fixVersion, 'HPCC4J', fixVersion)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": " File \"/opt/hostedtoolcache/Python/3.8.18/x64/lib/python3.8/site-packages/atlassian/jira.py\", line 2629, in add_version"}]}, {"type": "paragraph", "content": [{"type": "text", "text": " return self.post(url, data=payload

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
