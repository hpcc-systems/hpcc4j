---
id: jira-HPCC4J-143
title: HPCC4J-143 – Create deployable commons-hpcc pom.xml
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-143"
project: HPCC4J
key: HPCC4J-143
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-01-10
updated: 2019-01-22
resolved: 2019-01-22
components:
  - BuildPackaging
  - hpcc-commons
fixVersions:   - 1.0.0
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
Create deployable commons-hpcc pom.xml

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "current pom.xml fails upon test execution, also this project needs to be deployable to mvncentral"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
