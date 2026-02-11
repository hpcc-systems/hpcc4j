---
id: jira-HPCC4J-131
title: "HPCC4J-131 – Create a common \"ErrorBlock\" type class to return error info from wsclient"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-131"
project: HPCC4J
key: HPCC4J-131
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-10-12
updated: 2019-05-23
resolved: 2019-05-23
components:   - WSClient
fixVersions:   - 7.2.16
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
Create a common "ErrorBlock" type class to return error info from wsclient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "As per discussion with Rodrigo at the conference, It would be extremely useful to be able to hand a collection of errors back from wsclient (or other packages) rather than throwing a single exception."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "For example, espexceptionarray could be converted into a collection of error/info/warning errors."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HIPIE has something like this already that could be used as a template:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/SALT/blob/master/runtime/src/main/java/com/relx/rba/tardis/runtime/errors/ErrorBlock.java", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/SALT/blob/master/runtime/src/main/java/com/relx/rba/tardis/runtime/errors/ErrorBlock.java"}}]}, {"type": "text", "text": "\u00a0 ,

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
