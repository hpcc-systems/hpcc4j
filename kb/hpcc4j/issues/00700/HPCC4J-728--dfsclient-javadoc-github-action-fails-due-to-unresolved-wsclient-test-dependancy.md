---
id: jira-HPCC4J-728
title: HPCC4J-728 – DFSClient javadoc github action fails due to unresolved wsclient test dependancy
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-728"
project: HPCC4J
key: HPCC4J-728
status: Resolved
statusCategory: Done
resolution: Duplicate
created: 2025-06-23
updated: 2025-09-11
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
DFSClient javadoc github action fails due to unresolved wsclient test dependancy

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/actions/runs/15789606699/job/44605565664#step:5:1091"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] Total time: 57.347 s"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] Finished at: 2025-06-23T16:01:57Z"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[INFO] ------------------------------------------------------------------------"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Error: Failed to execute goal on project dfsclient: Could not resolve dependencies for project org.hpccsystems:dfsclient:jar:9.12.13-0-SNAPSHOT"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Error: dependency: org.hpccsystems:wsclient:jar:tests:9.12.13-0-SNAPSHOT (test)"}]}, {"type": "paragraph", "content": [{"type": "text", "text

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
