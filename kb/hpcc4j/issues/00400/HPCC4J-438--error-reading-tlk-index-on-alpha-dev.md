---
id: jira-HPCC4J-438
title: HPCC4J-438 – Error reading TLK Index on alpha dev
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-438"
project: HPCC4J
key: HPCC4J-438
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-10-15
updated: 2021-10-18
resolved: 2021-10-18
components:   - dfsclient
fixVersions:   - 8.4.x
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
Error reading TLK Index on alpha dev

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\u00a0The following error\u2019s being thrown on line 518 of BinaryRecordReader"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "2021-10-14 16:20:53 ERROR GenericQuery:103 - LocalId:GNhBnBbb1qJDrLFfG7Z2Fn ERROR(120) Exception:Failed to acquire file access or retrieve meta info for: 'thor_data400::key::insuranceheader_xlink::20210723_java::did::word::fname' with error: PartitionProcessor: Error while attempting to read TLK: Fatal read error: Failed to parse next record: Error while parsing field: initialchar of type: STRING: : Failure to read hpcc file>thor_data400::key::insuranceheader_xlink::20210723_java::did::word::fname"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.commons.errors.HpccFileException: Failed to acquire file access or retrieve meta info for: 'thor_

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
