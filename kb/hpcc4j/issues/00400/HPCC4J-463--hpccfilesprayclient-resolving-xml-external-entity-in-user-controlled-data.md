---
id: jira-HPCC4J-463
title: HPCC4J-463 – HPCCFileSprayClient - Resolving XML external entity in user-controlled data
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-463"
project: HPCC4J
key: HPCC4J-463
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-06-09
updated: 2022-07-07
resolved: 2022-07-07
components:   - WSClient
fixVersions:   - 8.8.0
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
HPCCFileSprayClient - Resolving XML external entity in user-controlled data

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/rpastrana/HPCC4J/security/code-scanning/5", "marks": [{"type": "link", "attrs": {"href": "https://github.com/rpastrana/HPCC4J/security/code-scanning/5"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Parsing untrusted XML files with a weakly configured XML parser may lead to an XML External Entity (XXE) attack. This type of attack uses external entity references to access arbitrary files on a system, carry out denial of service, or server side request forgery. Even when the result of parsing is not returned to the user, out-of-band data retrieval techniques may allow attackers to steal sensitive data. Denial of services can also be carried out in this situation."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
