---
id: jira-HPCC4J-71
title: HPCC4J-71 – RDF2hpcc sample file no longer available
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-71"
project: HPCC4J
key: HPCC4J-71
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-01-03
updated: 2017-01-04
resolved: 2017-01-04
components:   - RDFIngest
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
RDF2hpcc sample file no longer available

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The rdf2hpcc tool readme references a sample turtle file no longer available:"}, {"type": "hardBreak"}, {"type": "text", "text": "\""}, {"type": "text", "text": "http://www-users.cs.york.ac.uk/~jc/teaching/arin/camera.owl.turtle", "marks": [{"type": "link", "attrs": {"href": "http://www-users.cs.york.ac.uk/~jc/teaching/arin/camera.owl.turtle"}}]}, {"type": "text", "text": "\""}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Consider creating/copying a sample file such as "}, {"type": "text", "text": "https://gist.github.com/kal/ee1260ceb462d8e0d5bb#file-log_sample-ttl", "marks": [{"type": "link", "attrs": {"href": "https://gist.github.com/kal/ee1260ceb462d8e0d5bb#file-log_sample-ttl"}}]}, {"type": "hardBreak"}, {"type": "text", "text": "and updating the readme file."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
