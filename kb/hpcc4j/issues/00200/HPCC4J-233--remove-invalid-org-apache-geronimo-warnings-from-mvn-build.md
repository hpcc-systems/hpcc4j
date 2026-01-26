---
id: jira-HPCC4J-233
title: HPCC4J-233 – Remove invalid org.apache.geronimo warnings from mvn build
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-233"
project: HPCC4J
key: HPCC4J-233
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2019-09-24
updated: 2024-04-08
resolved: 2020-02-04
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
Remove invalid org.apache.geronimo warnings from mvn build

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[WARNING] Failed to build parent project for org.apache.geronimo.genesis.config:config:pom:1.1"}, {"type": "hardBreak"}, {"type": "text", "text": "[WARNING] Failed to build parent project for org.apache.geronimo.genesis.config:project-config:pom:1.1"}, {"type": "hardBreak"}, {"type": "text", "text": "[WARNING] Failed to build parent project for org.apache.geronimo.specs:specs:pom:1.3"}, {"type": "hardBreak"}, {"type": "text", "text": "[WARNING] Failed to build parent project for org.apache.geronimo.specs:geronimo-stax-api_1.0_spec:bundle:1.0.1"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[WARNING] Failed to build parent project for org.apache.geronimo.genesis.config:config:pom:1.1"}, {"type": "hardBreak"}, {"type": "text", "text": "[WARNING] Failed to build parent project for org.apache.geronimo.genesis.config:project-config:pom:1.1"}, {"type": "hardBreak"}, {"type"

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.
