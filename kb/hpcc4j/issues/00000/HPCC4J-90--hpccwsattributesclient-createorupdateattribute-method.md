---
id: jira-HPCC4J-90
title: HPCC4J-90 – HPCCWsAttributesClient.createOrUpdateAttribute() method 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-90"
project: HPCC4J
key: HPCC4J-90
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-08-31
updated: 2017-09-19
resolved: 2017-09-19
components:   - WSClient
fixVersions:   - 1.2.2
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
HPCCWsAttributesClient.createOrUpdateAttribute() method 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently, when HIPIE needs to save an attribute to a remote repo, a lot of \"does attribute exist\" checks are made."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Hipie checks whether or not an attribute exists. If not, it calls createAttribute, if so it calls updateAttribute()."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "createAttribute() checks if an attribute exists; if so it throws an error, if not, it creates it and calls UpdateAttribute(). Which checks if the attribute exists before updating it."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "So there's 2-3 calls to check if an attribute exists for every attribute created or updated."}]}, {"type": "paragraph", "content": [{"type":

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
