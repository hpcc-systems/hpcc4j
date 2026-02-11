---
id: jira-HPCC4J-103
title: HPCC4J-103 – createOrUpdateAttributes method that updates multiple items at once
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-103"
project: HPCC4J
key: HPCC4J-103
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-22
updated: 2018-06-22
resolved: 2018-06-22
components:   - WSClient
fixVersions:   - 1.2.2
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
createOrUpdateAttributes method that updates multiple items at once

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In some cases, HIPIE & LUCI use HPCC-JAPI to create/update several dozen attributes at once. \u00a0It would be very handy and much faster to have a method that takes multiple items and updates them all in a single update request rather than cycling through each one. This might also address the intermittant LDAP exceptions/out of resources/transaction timeouts that occur in Dataland when several dozen update/create attribute requests are made simultaneously from multiple threads."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
