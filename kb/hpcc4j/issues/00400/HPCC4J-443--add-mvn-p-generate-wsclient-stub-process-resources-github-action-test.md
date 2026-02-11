---
id: jira-HPCC4J-443
title: HPCC4J-443 – Add mvn -P generate-wsclient-stub process-resources Github action test
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-443"
project: HPCC4J
key: HPCC4J-443
status: New
statusCategory: To Do
resolution: null
created: 2021-10-28
updated: 2025-09-29
resolved: null
components:   - BuildPackaging
fixVersions: []
labels:   - CopilotCandidate
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
Add mvn -P generate-wsclient-stub process-resources Github action test

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In order to ensure pom changes do not break the wsdl2java logic, add new github action testing"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "mvn -P generate-wsclient-stub process-resources"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "folowed by regular build"}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
