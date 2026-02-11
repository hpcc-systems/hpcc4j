---
id: jira-HPCC4J-491
title: "HPCC4J-491 – jsch doesn't support the encryption used by github"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-491"
project: HPCC4J
key: HPCC4J-491
status: Resolved
statusCategory: Done
resolution: Timed Out
created: 2022-10-10
updated: 2024-04-08
resolved: 2023-01-09
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
jsch doesn't support the encryption used by github

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Due to github encryption requirements state here: "}, {"type": "text", "text": "[https://github.blog/2021-09-01-improving-git-protocol-security-github/]", "marks": [{"type": "code"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The current com.jcraft.jsch.JSch that is used in jgit and other technologies does not support the modern encryption algorithms, and hasn't seen updates in a while."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Moving to "}, {"type": "text", "text": "https://github.com/mwiede/jsch", "marks": [{"type": "link", "attrs": {"href": "https://github.com/mwiede/jsch"}}]}, {"type": "text", "text": " + bouncy castle adds in support for the algorithms ECDSA, and Ed25519 which are supported by most of the major players.\u00a0 mwiede by it self supports these algorithms but adding bouncy castle extends that support down to Java 11 (and po

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.
