---
id: jira-HPCC4J-182
title: HPCC4J-182 – Poms not properly pulling snapshots from third party snapshot repositories
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-182"
project: HPCC4J
key: HPCC4J-182
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-19
updated: 2019-04-22
resolved: 2019-04-22
components:   - BuildPackaging
fixVersions:   - 7.2.x
labels:   - Bug
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
Poms not properly pulling snapshots from third party snapshot repositories

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The third party repository we push our snapshots too does not automatically get pulled when we designate a dependency to be a snapshot (for development builds)."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Add a <repository> definition for the snapshot repo, so it will fetch the appropriate jars at build time."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
