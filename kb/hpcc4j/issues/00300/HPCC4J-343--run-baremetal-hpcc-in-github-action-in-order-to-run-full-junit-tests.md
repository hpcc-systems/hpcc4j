---
id: jira-HPCC4J-343
title: HPCC4J-343 – Run baremetal HPCC in github action in order to run full junit tests
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-343"
project: HPCC4J
key: HPCC4J-343
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-10-20
updated: 2021-03-12
resolved: 2021-03-12
components:   - BuildPackaging
fixVersions:   - 7.12.36
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
Run baremetal HPCC in github action in order to run full junit tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "deploy and run official HPCC baremetal\u00a0 image within GithubAction environment in order to run full junit profile."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "some information: "}, {"type": "text", "text": "https://stackoverflow.com/questions/57549439/how-do-i-use-docker-with-github-actions", "marks": [{"type": "link", "attrs": {"href": "https://stackoverflow.com/questions/57549439/how-do-i-use-docker-with-github-actions"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "As an aside, the hpcc actions show us how to control certain aspects of github actions and can be used for reference:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HPCC-Platform/tree/master/.github/workflows", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HPCC-Platform/tree/master/.github/workflo

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
