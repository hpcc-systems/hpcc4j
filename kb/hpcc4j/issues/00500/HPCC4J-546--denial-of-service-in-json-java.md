---
id: jira-HPCC4J-546
title: HPCC4J-546 – Denial of Service in JSON-Java 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-546"
project: HPCC4J
key: HPCC4J-546
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-10-13
updated: 2023-11-13
resolved: 2023-11-13
components:   - WSClient
fixVersions:   - 9.4.x
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
Denial of Service in JSON-Java 

{"type": "doc", "version": 1, "content": [{"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "https://github.com/advisories/GHSA-rm7j-f5g5-27vv", "marks": [{"type": "link", "attrs": {"href": "https://github.com/advisories/GHSA-rm7j-f5g5-27vv"}}]}]}, {"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "Package"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.json:json  ("}, {"type": "text", "text": "Maven", "marks": [{"type": "link", "attrs": {"href": "https://github.com/advisories?query=ecosystem%3Amaven"}}]}, {"type": "text", "text": ") "}]}, {"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "Affected versions"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "<= 20230618"}]}, {"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "Patched versions"}]}, {"type": "paragra

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
