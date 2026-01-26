---
id: jira-HPCC4J-37
title: HPCC4J-37 – wsdfu does not serialize the DFUArrayActionResult correctly
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-37"
project: HPCC4J
key: HPCC4J-37
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-01-14
updated: 2016-01-22
resolved: 2016-01-22
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
wsdfu does not serialize the DFUArrayActionResult correctly

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The wsdfu generated code is expecting a string back from the DFUArrayActionResult object, but in fact it's an xml block containing <Message><Value>Message Content</Value></Message> which causes the serialization to fail, but the rest of the code to work.  "}, {"type": "mention", "attrs": {"id": "712020:66778395-f7b6-4a38-b705-cf2616f89dd6", "text": "@Rodrigo Pastrana", "accessLevel": ""}}, {"type": "text", "text": " Fixed this issue by creating a hand made wsdl, that I then generated code for, and merged alongside the current wsdfu code.  This now has a message object that encapsulates the xml response correctly."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
