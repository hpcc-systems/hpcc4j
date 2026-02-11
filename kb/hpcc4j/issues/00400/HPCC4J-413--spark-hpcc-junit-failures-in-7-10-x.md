---
id: jira-HPCC4J-413
title: HPCC4J-413 – Spark-hpcc Junit failures in 7.10.x
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-413"
project: HPCC4J
key: HPCC4J-413
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-05-04
updated: 2021-05-13
resolved: 2021-05-13
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
Spark-hpcc Junit failures in 7.10.x

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Test Result", "marks": [{"type": "link", "attrs": {"href": "http://10.240.61.86/view/JavaProjects/job/SPARK-7.10.x-deploy/366/testReport/"}}]}, {"type": "text", "text": "\u00a0(2 failures / \u00b10)"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.spark.RDDTest.simpleRDDTest", "marks": [{"type": "link", "attrs": {"href": "http://10.240.61.86/view/JavaProjects/job/SPARK-7.10.x-deploy/org.hpccsystems$spark-hpcc/366/testReport/junit/org.hpccsystems.spark/RDDTest/simpleRDDTest/"}}]}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.spark.RDDTest.simpleRDDFilteredTest", "marks": [{"type": "link", "attrs": {"href": "http://10.240.61.86/view/JavaProjects/job/SPARK-7.10.x-deploy/org.hpccsystems$spark-hpcc/366/testReport/junit/org.hp

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
