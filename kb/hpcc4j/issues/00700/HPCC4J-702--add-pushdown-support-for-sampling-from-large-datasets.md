---
id: jira-HPCC4J-702
title: HPCC4J-702 – Add pushdown support for sampling from large datasets
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-702"
project: HPCC4J
key: HPCC4J-702
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-04-02
updated: 2025-07-11
resolved: null
components:   - Spark
fixVersions:
  - 9.12.20
  - 9.14.2
labels: []
applies_to: hpcc4j: >= 9.12.20
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Add pushdown support for sampling from large datasets

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The spark-hpcc connector has been game changing for analytics. However we often need to work with small samples of large datasets that we would not want to send across the wire in their entirety to sample in Databricks. For example, there are files measuring Terabytes where a sample measuring a few gigabytes would suffice."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This feature request is to help understand how difficult it would be to push down a sampling mechanism to the row-service. Something like specifying a float between [0, 1] and having the row service only serve a record if a random float is less than the requested value."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Technically, I am sure this is a huge lift, but I am curious about the experts' takes. Our alternative is to submit an ECL job that samples the file and writes it out to be

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
