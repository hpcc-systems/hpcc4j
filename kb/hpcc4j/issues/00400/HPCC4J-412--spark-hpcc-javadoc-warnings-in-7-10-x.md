---
id: jira-HPCC4J-412
title: HPCC4J-412 – Spark-hpcc javadoc warnings in 7.10.x
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-412"
project: HPCC4J
key: HPCC4J-412
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2021-05-04
updated: 2024-04-08
resolved: 2023-08-14
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
Spark-hpcc javadoc warnings in 7.10.x

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "7 warnings[WARNING] Javadoc Warnings[WARNING] /jenkins2/workspace/SPARK-7.10.x-deploy/DataAccess/src/main/java/org/hpccsystems/spark/HpccFile.java:108: warning - @return tag has no arguments.[WARNING] /jenkins2/workspace/SPARK-7.10.x-deploy/DataAccess/src/main/java/org/hpccsystems/spark/HpccFileWriter.java:316: warning - @param argument \"RDD\" is not a parameter name.[WARNING] /jenkins2/workspace/SPARK-7.10.x-deploy/DataAccess/src/main/java/org/hpccsystems/spark/HpccFileWriter.java:336: warning - @param argument \"scalaRDD\" is not a parameter name.[WARNING] /jenkins2/workspace/SPARK-7.10.x-deploy/DataAccess/src/main/java/org/hpccsystems/spark/HpccFileWriter.java:444: warning - @param argument \"rowDictionary\" is not a parameter name.[WARNING] /jenkins2/workspace/SPARK-7.10.x-deploy/DataAccess/src/main/java/org/hpccsystems/spark/HpccRDD.java:154: warning - @return tag has no argument

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.
