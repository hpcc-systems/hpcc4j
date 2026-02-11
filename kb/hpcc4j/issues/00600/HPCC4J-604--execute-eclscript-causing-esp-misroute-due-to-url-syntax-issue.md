---
id: jira-HPCC4J-604
title: HPCC4J-604 – Execute ECLScript causing ESP misroute due to url syntax issue
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-604"
project: HPCC4J
key: HPCC4J-604
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-05-22
updated: 2024-06-07
resolved: 2024-06-07
components:   - WSClient
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
Execute ECLScript causing ESP misroute due to url syntax issue

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Requests to WsWU:CreateAndUpdate have been rejected by ESP, apparently due to invalid URL/query param delimiter:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "0005F51E PRG 2024-05-21 13:57:03.170 37697 66921 \"Creating secure socket\""}, {"type": "hardBreak"}, {"type": "text", "text": "0005F51F PRG 2024-05-21 13:57:03.170 37697 66921 \"Accepting from secure socket\""}, {"type": "hardBreak"}, {"type": "text", "text": "0005F520 PRG 2024-05-21 13:57:03.247 37697 66921 \"SSL accept ok, using TLS_AES_256_GCM_SHA384\""}, {"type": "hardBreak"}, {"type": "text", "text": "0005F521 PRG 2024-05-21 13:57:03.247 37697 66921 \"Request from secure socket\""}, {"type": "hardBreak"}, {"type": "text", "text": "0005F522 PRG 2024-05-21 13:57:03.262 37697 66921 \"HTTP First Line: POST /WsWorkunits&rawxml_ HTTP/1.1\"", "marks": [{"type": "strong"}]}, {"type": "hardBreak"}, {"type": "text"

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
