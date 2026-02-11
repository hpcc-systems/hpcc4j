---
id: jira-HPCC4J-727
title: HPCC4J-727 – Update .m2 caching step in github actions
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-727"
project: HPCC4J
key: HPCC4J-727
status: New
statusCategory: To Do
resolution: null
created: 2025-06-23
updated: 2025-09-11
resolved: null
components: []
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Update .m2 caching step in github actions

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://docs.github.com/en/actions/use-cases-and-examples/building-and-testing/building-and-testing-java-with-maven"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "You can cache your dependencies to speed up your workflow runs. After a successful run, your local Maven repository will be stored in a cache. In future workflow runs, the cache will be restored so that dependencies don't need to be downloaded from remote Maven repositories. You can cache dependencies simply using the "}, {"type": "text", "text": "setup-java", "marks": [{"type": "code"}]}, {"type": "text", "text": " action", "marks": [{"type": "link", "attrs": {"href": "https://github.com/marketplace/actions/setup-java-jdk"}}]}, {"type": "text", "text": " or can use "}, {"type": "text", "text": "cache", "marks": [{"type": "code"}]}, {"type": "text", "text": " ac

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
