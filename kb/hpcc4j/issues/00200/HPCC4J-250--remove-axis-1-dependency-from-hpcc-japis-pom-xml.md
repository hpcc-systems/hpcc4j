---
id: jira-HPCC4J-250
title: HPCC4J-250 – Remove axis 1 dependency from HPCC-JAPIs pom.xml
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-250"
project: HPCC4J
key: HPCC4J-250
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-29
updated: 2019-10-29
resolved: 2019-10-29
components:   - WSClient
fixVersions:   - 7.6.8
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
Remove axis 1 dependency from HPCC-JAPIs pom.xml

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "mvn dependency:tree in wsclient reveals that axis is still included in the build. The axis dependency needs to be removed from the parent hpcc-japis pom.xml"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
