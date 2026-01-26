---
id: jira-HPCC4J-58
title: HPCC4J-58 – JAPI - documenation change regarding build workflow
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-58"
project: HPCC4J
key: HPCC4J-58
status: Resolved
statusCategory: Done
resolution: Duplicate
created: 2016-12-20
updated: 2017-03-13
resolved: 2017-03-13
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
JAPI - documenation change regarding build workflow

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We are removing the ability to build from the JAPI directory.  Before you could do a `mvn install` command from the root JAPI directory and build wsclient, clienttools, and rdf2hpcc all at once.  We're moving away from this model and will be releasing all 3 components separately even though they're contained in the same repository."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Basically we need to remove any build information that references the root JAPI directory.  I will have more tickets regarding each components documentation as the project goes on."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
