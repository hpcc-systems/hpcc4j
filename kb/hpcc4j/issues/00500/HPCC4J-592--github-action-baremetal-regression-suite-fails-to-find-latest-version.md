---
id: jira-HPCC4J-592
title: "HPCC4J-592 – Github Action: Baremetal regression suite, fails to find latest version"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-592"
project: HPCC4J
key: HPCC4J-592
status: Resolved
statusCategory: Done
resolution: null
created: 2024-04-02
updated: 2024-04-03
resolved: null
components:   - BuildPackaging
fixVersions:
  - 9.2.76
  - 9.4.50
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
Github Action: Baremetal regression suite, fails to find latest version

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Baremetal Github Action doesn\u2019t find latest version if a release has not been cut within the target branch. In this case should fallback to latest version that has been released."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
