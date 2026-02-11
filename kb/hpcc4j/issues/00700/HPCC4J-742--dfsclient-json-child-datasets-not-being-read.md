---
id: jira-HPCC4J-742
title: "HPCC4J-742 – DFSClient: JSON child datasets not being read"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-742"
project: HPCC4J
key: HPCC4J-742
status: New
statusCategory: To Do
resolution: null
created: 2025-08-27
updated: 2025-08-27
resolved: null
components:   - dfsclient
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
DFSClient: JSON child datasets not being read

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In at least one dataset on discover labs child datasets inside of a JSON file aren\u2019t being read."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This seems to have something to do with the specific record structure of the file and or child datasets"}]}]}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "subjectjsonlayout := RECORD\n   string1 subject_indicator{xpath('subject_indicator')};\n   unsigned1 subject_id{xpath('subject_id')};\n   string10 pfname{xpath('pfname')};\n   string15 fname{xpath('fname')};\n   string15 mname{xpath('mname')};\n   string35 lname{xpath('lname')};\n   string3 sname{xpath('sname')};\n   unsigned4 dob{xpath('dob')};\n   unsigned1 age{xpath('age')};\n   string1 gender{xpath('gender')};\n   string15 telephone_number{xpath('

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
