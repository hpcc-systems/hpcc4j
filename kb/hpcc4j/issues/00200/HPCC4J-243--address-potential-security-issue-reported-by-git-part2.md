---
id: jira-HPCC4J-243
title: HPCC4J-243 – Address potential security issue reported by git part2
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-243"
project: HPCC4J
key: HPCC4J-243
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-21
updated: 2019-11-14
resolved: 2019-11-14
components:   - Spark
fixVersions:   - 7.6.10
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
Address potential security issue reported by git part2

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Security Alerts:"}, {"type": "hardBreak"}, {"type": "text", "text": "CVE-2018-17190"}, {"type": "hardBreak"}, {"type": "text", "text": "More information"}, {"type": "hardBreak"}, {"type": "text", "text": "low severity"}, {"type": "hardBreak"}, {"type": "text", "text": "Vulnerable versions: >= 0"}, {"type": "hardBreak"}, {"type": "text", "text": "Patched version: No fix"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In all versions of Apache Spark, its standalone resource manager accepts code to execute on a 'master' host, that then runs that code on 'worker' hosts. The master itself does not, by design, execute user code. A specially-crafted request to the master can, however, cause the master to execute code too. Note that this does not affect standalone clusters with authentication enabled. While the master host typically has less outbound access to other resources

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
