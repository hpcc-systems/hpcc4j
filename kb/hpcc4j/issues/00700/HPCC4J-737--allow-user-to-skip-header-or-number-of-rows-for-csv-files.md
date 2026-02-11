---
id: jira-HPCC4J-737
title: HPCC4J-737 – Allow user to skip header or number of rows for csv files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-737"
project: HPCC4J
key: HPCC4J-737
status: New
statusCategory: To Do
resolution: null
created: 2025-08-21
updated: 2025-08-21
resolved: null
components:   - Spark
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Allow user to skip header or number of rows for csv files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Is it an intended use case that users can use spark-hpcc to read csv files? If so, spark makes it harder than it should be to skip the first line of input. I understand why this is hard, but am hoping that the spark-hpcc connector has a means of identifying this header row and can discard it when an option is set. The spark schema should still be preserved, however."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I could see this as exposed to the user in a two ways:"}]}, {"type": "orderedList", "attrs": {"order": 1}, "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "header = True,  option which follows the spark.read.csv convention"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "skiprows = 1, option which follows the pandas Dataframe convention"}]}]}]}, {"type":

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
