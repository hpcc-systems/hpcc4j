---
id: jira-HPCC4J-39
title: HPCC4J-39 – Enhance ECL Record parsing to consume annotations in ecl comments
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-39"
project: HPCC4J
key: HPCC4J-39
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-01-29
updated: 2016-06-15
resolved: 2016-06-13
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
Enhance ECL Record parsing to consume annotations in ecl comments

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HIPIE wants to store metadata in ECL record structures. For example:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "RECORD"}, {"type": "hardBreak"}, {"type": "text", "text": "STRING9 ssn  // @METATYPE(SSN)"}, {"type": "hardBreak"}, {"type": "text", "text": "INTEGER4 dob // @METATYPE(DOB)"}, {"type": "hardBreak"}, {"type": "text", "text": "END"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Extend the wsclient ecl parser that parses record structures to check for @METATYPE inside comments. If the comments are on the same line as a record field, apply the annotation to that field.  Handle both // and /* */ comment structures."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Suggest adding an annotations collection to ECLRecordInfo object."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Update DFUFileDetailInfo.getRecordE

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
