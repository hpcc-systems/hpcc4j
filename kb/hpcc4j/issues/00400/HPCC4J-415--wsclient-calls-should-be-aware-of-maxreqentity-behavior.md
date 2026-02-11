---
id: jira-HPCC4J-415
title: HPCC4J-415 – WsClient calls should be aware of maxreqentity behavior
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-415"
project: HPCC4J
key: HPCC4J-415
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-05-05
updated: 2021-09-14
resolved: 2021-08-06
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
WsClient calls should be aware of maxreqentity behavior

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "in certain cases WsWorkunitsStub::wUCreateAndUpdate creates "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "the workunit but fails to populate it.\u00a0 Since the cluster happily creates the empty workunit in unknown state and the api fails to populate it the API should clean up after it self.\u00a0 It would be helpful and easier to debug/trace/diagnose issues if in the catch the code would try to update the workunit and set the error the API logged into the workunit and mark the workunit failed.\u00a0 "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Specifically the case the ECL was so large it was exceeding the maxRequestEntityLength value of the cluster.\u00a0 However the only thing that the API saw was simply a \"broken pipe\" and it left the workunit it created in unknown state.", "marks": [{"type": "textColor", "attrs": {"color": "#242424"}}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC4J-359
- 02. Blocks: HPCC-25894
