---
id: jira-HPCC4J-31
title: HPCC4J-31 – Restructure MVN build to deploy to public mvn repo
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-31"
project: HPCC4J
key: HPCC4J-31
status: Resolved
statusCategory: Done
resolution: Duplicate
created: 2015-11-03
updated: 2024-04-08
resolved: 2017-01-04
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
pull_requests: []
---
## Outcome (from JIRA)
Restructure MVN build to deploy to public mvn repo

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently all JAPI projects are structured to deploy to internal mvn repo only. JAPI should deploy to publicly available mvn repo as well."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "See "}, {"type": "text", "text": "https://oss.sonatype.org/#nexus-search;quick~hpcc", "marks": [{"type": "link", "attrs": {"href": "https://oss.sonatype.org/#nexus-search;quick~hpcc"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/irieksts", "marks": [{"type": "link", "attrs": {"href": "https://github.com/irieksts"}}]}, {"type": "text", "text": " is aware of this effort and has been a great resource for this type of work."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/mjkrumlauf", "marks": [{"type": "link", "attrs": {"href": "https://github.com/mjkrumlauf"}}]}, {"type": "text", "text": " is another great resourc

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
