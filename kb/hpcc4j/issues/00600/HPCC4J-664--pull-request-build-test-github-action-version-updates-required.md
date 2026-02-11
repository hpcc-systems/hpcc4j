---
id: jira-HPCC4J-664
title: HPCC4J-664 – Pull request build test github action version updates required
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-664"
project: HPCC4J
key: HPCC4J-664
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-11-06
updated: 2024-12-02
resolved: 2024-12-02
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
Pull request build test github action version updates required

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "build", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/11686135910/job/32541197940"}}, {"type": "strong"}]}, {"type": "text", "text": " ", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/11686135910/job/32541197940"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Your workflow is using a version of actions/cache that is scheduled for deprecation, actions/cache@v2. Please update your workflow to use the latest version of actions/cache to avoid interruptions. Learn more: "}, {"type": "inlineCard", "attrs": {"url": "https://github.blog/changelog/2024-09-16-notice-of-upcoming-deprecations-and-changes-in-github-actions-services/"}}, {"type": "text", "text": " "}]}, {"type": "paragraph"}, {"type": "paragraph"}, {"type": "table", "attrs": {"isNumberColumnEnabled": false, "la

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
