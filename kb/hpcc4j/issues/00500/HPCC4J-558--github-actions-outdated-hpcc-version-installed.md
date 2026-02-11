---
id: jira-HPCC4J-558
title: "HPCC4J-558 – Github Actions: Outdated HPCC Version Installed"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-558"
project: HPCC4J
key: HPCC4J-558
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-11-22
updated: 2023-11-27
resolved: 2023-11-27
components: []
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
Github Actions: Outdated HPCC Version Installed

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Recently outdated versions of the platform have been installed instead of latest."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This appears to be related how the \"latest\" image is being resolved and not an issue with the helm charts themselves"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Test on my local machine indicates removing the latest tag and allowing the version in the helm chart to dictate the version to install resolves this issue"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
