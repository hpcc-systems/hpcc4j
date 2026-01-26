---
id: jira-HPCC4J-93
title: HPCC4J-93 – Proper use of Action and ActionEx properties of WUInfo
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-93"
project: HPCC4J
key: HPCC4J-93
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2017-09-01
updated: 2019-01-15
resolved: 2019-01-15
components:   - WSClient
fixVersions:   - 7.0.2
labels:   - Post70RC1
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
Proper use of Action and ActionEx properties of WUInfo

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "All WsClient logic based on ECLWorkunit Action, should take into consideration the fact that this attribute might not always be populated."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Note from Kevin Wang:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I guess that the WorkunitInfo calls WsWorkunits.WUInfo to get information about an ECL workunit. The methods (incouding WsWorkunits.WUInfo) in the WsWorkunits uses a class called ECLWorkunit to return various information about an ECL workunit. But, not all of the variables inside the class are returned by each method. The ECLWorkunit.WUInfo only populates the ActionEx variable, not Action variable. So, I guess that the WorkunitInfo.getAction() always returns

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.
