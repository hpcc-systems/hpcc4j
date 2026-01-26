---
id: jira-HPCC4J-359
title: HPCC4J-359 – dfsclient should utilize dafilesrv commcompression 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-359"
project: HPCC4J
key: HPCC4J-359
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2020-11-18
updated: 2023-04-24
resolved: 2023-04-24
components:   - dfsclient
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
dfsclient should utilize dafilesrv commcompression 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "/* Notes on protocol:"}, {"type": "hardBreak"}, {"type": "text", "text": "*"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "A JSON request with these top-level fields:"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\"format\" - the format of the reply. Supported formats = \"binary\", \"xml\", \"json\""}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\"handle\" - the handle of for a file session that was previously open (for continuation)"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\"commCompression\" - compression format of the communication protocol. Supports \"LZ4\", \"LZW\", \"FLZ\" (TBD: \"ZLIB\")"}]}]}, {"type": "listItem", "content": [{"ty

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.

## Related
- 01. Relates: HPCC4J-415
- 01. Relates: HPCC-21445
