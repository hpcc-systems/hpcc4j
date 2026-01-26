---
id: jira-HPCC4J-480
title: HPCC4J-480 – onDFUFileCreateV2 returns error when trying to write to cloud-based HPCC Cluster
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-480"
project: HPCC4J
key: HPCC4J-480
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-08-08
updated: 2023-03-16
resolved: 2023-03-16
components:   - WSClient
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
onDFUFileCreateV2 returns error when trying to write to cloud-based HPCC Cluster

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When attempting to write a file to the cloud-based "}, {"type": "text", "text": "http://10.146.176.14:8010", "marks": [{"type": "link", "attrs": {"href": "http://10.146.176.14:8010/"}}]}, {"type": "text", "text": " cluster using the onDFUFileCreateV2 service, the following error occurs:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "onDFUFileCreateV2: file signing certificate ('signing' ) not defined in configuration.: Failed to create dfufile"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The on-prem mechanism for activating this feature (updating the environment.xml with entries for each cluster/pem and propagating that key to the various clusters) doesn't apply, as apparently the environment.xml file doesn't exist for cloud-based hpcc clusters."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "How do we activate this capability for

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
