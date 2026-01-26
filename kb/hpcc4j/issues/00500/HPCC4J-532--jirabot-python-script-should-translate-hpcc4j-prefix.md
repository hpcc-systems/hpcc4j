---
id: jira-HPCC4J-532
title: HPCC4J-532 – Jirabot python script should translate hpcc4j prefix
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-532"
project: HPCC4J
key: HPCC4J-532
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-08-10
updated: 2023-11-06
resolved: 2023-11-02
components:   - BuildPackaging
fixVersions:
  - 9.2.16
  - 9.4.x
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
Jirabot python script should translate hpcc4j prefix

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Ensure github action targets actual Jira based or PR/Commit header prefix:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "raise JIRAError( "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "jira.exceptions.JIRAError: JiraError HTTP 404 url: ***rest/api/2/issue/HPCC4J-501 "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "text: Issue Does Not Exist"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
