---
id: jira-HPCC4J-236
title: HPCC4J-236 – Automate JAPI/SPARK branch creation
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-236"
project: HPCC4J
key: HPCC4J-236
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-02
updated: 2020-02-07
resolved: 2020-02-07
components:   - BuildPackaging
fixVersions:   - 7.6.26
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
Automate JAPI/SPARK branch creation

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Utilize existing HPCC logic to go_rc, go_gold."}, {"type": "hardBreak"}, {"type": "text", "text": "Utilize Maven plugin to fetch project version (mvn.help)"}, {"type": "hardBreak"}, {"type": "text", "text": "Utilize Maven plugin to inject new version into pom, and update dep versions (mvn.release)"}, {"type": "hardBreak"}, {"type": "text", "text": "for go_gold:"}, {"type": "hardBreak"}, {"type": "text", "text": "ensure we're on even point, remove snapshots from all poms,"}, {"type": "hardBreak"}, {"type": "text", "text": "commit, push upstream, go back to X-branch, upmerge current branch to X-branch, then up tick version to odd number, add snapshot postfix, commit, push,"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC-23454
