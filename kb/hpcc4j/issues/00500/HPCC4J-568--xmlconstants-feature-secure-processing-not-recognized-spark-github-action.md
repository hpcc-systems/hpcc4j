---
id: jira-HPCC4J-568
title: HPCC4J-568 – XMLConstants/feature/secure-processing not recognized spark github action
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-568"
project: HPCC4J
key: HPCC4J-568
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-01-10
updated: 2025-04-25
resolved: 2025-04-25
components:   - Spark
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
XMLConstants/feature/secure-processing not recognized spark github action

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "As reported in github action failure: "}, {"type": "text", "text": "https://github.com/hpcc-systems/Spark-HPCC/actions/runs/7476344180/job/20346488669?pr=138#step:15:3404", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/Spark-HPCC/actions/runs/7476344180/job/20346488669?pr=138#step:15:3404"}}]}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Feature '"}, {"type": "text", "text": "http://javax.xml.XMLConstants/feature/secure-processing", "marks": [{"type": "link", "attrs": {"href": "http://javax.xml.xmlconstants/feature/secure-processing"}}]}, {"type": "text", "text": "' is not recognized. "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "BaseHPCCWsClient: Could not determine target HPCC Containerization mode, review all HPCC connectio

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
