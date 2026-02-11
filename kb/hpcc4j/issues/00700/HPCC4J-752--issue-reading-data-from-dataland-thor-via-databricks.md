---
id: jira-HPCC4J-752
title: HPCC4J-752 – Issue Reading Data from Dataland Thor via Databricks
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-752"
project: HPCC4J
key: HPCC4J-752
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-10-22
updated: 2025-10-31
resolved: null
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
---
## Outcome (from JIRA)
Issue Reading Data from Dataland Thor via Databricks

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I\u2019m reaching out regarding an issue we\u2019re encountering while attempting to validate connectivity and data flow between our Analytics Databricks environment and the Dataland Thor cluster."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "We\u2019ve confirmed that the Databricks environment can successfully connect to Thor \u00a0("}, {"type": "text", "text": "https://eclwatch-hpcc.us-dataland-prod.azure.lnrsg.io:443", "marks": [{"type": "link", "attrs": {"href": "https://eclwatch-hpcc.us-dataland-prod.azure.lnrsg.io:443"}}, {"type": "underline"}]}, {"type": "text", "text": ") and retrieve the dataset schema. However, when attempting to display the data using Spark, the data engineer receives the following error:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Py4JJavaError: An error occurred while calling o597.showString."}]}, {"type": "paragraph

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
