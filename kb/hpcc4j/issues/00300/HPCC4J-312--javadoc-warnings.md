---
id: jira-HPCC4J-312
title: HPCC4J-312 – JavaDoc warnings
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-312"
project: HPCC4J
key: HPCC4J-312
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-05-22
updated: 2020-10-27
resolved: 2020-10-27
components:   - Spark
fixVersions:   - 7.12.x
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
JavaDoc warnings

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "9:23:21 Generating /mnt/disk1/jenkins2/workspace/Java-Projects-7.6.48-rc1/Spark-HPCC/DataAccess/target/apidocs/help-doc.html..."}, {"type": "hardBreak"}, {"type": "text", "text": "09:23:21 7 warnings"}, {"type": "hardBreak"}, {"type": "text", "text": "09:23:21 [WARNING] Javadoc Warnings"}, {"type": "hardBreak"}, {"type": "text", "text": "09:23:21 [WARNING] /mnt/disk1/jenkins2/workspace/Java-Projects-7.6.48-rc1/Spark-HPCC/DataAccess/src/main/java/org/hpccsystems/spark/HpccFile.java:108: warning - @return tag has no arguments."}, {"type": "hardBreak"}, {"type": "text", "text": "09:23:21 [WARNING] /mnt/disk1/jenkins2/workspace/Java-Projects-7.6.48-rc1/Spark-HPCC/DataAccess/src/main/java/org/hpccsystems/spark/HpccFileWriter.java:316: warning - @param argument \"RDD\" is not a parameter name."}, {"type": "hardBreak"}, {"type": "text", "text": "09:23:21 [WARNING] /mnt/disk1/jenkins2/workspac

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
