---
id: jira-HPCC4J-79
title: "HPCC4J-79 – When running a workunit, If the WUCreateAndUpdate call times out and returns while the compile's still running, don't submit., "
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-79"
project: HPCC4J
key: HPCC4J-79
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-04-26
updated: 2018-09-28
resolved: 2018-09-28
components:   - WSClient
fixVersions:   - 7.0.0
labels:
  - Post70RC1
  - Post70RC3
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
When running a workunit, If the WUCreateAndUpdate call times out and returns while the compile's still running, don't submit., 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This bug is triggered by a wierd platform issue, where a call to WUCreateAndUpdate creates a workunit that hangs forever in compiling state. "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In this case it looks like HPCC-JAPI is just timing out and returning the wuid to pass to WUSubmit without checking that the status is not \"compiling\". If it's still \"compiling\" after the timeout, we should either abort the compile workunit and throw an error, or try waiting for some specified amount of time before aborting the workunit and throwing an error. WUCreateAndUpdate doesn't have a wait/timeout parameter unfortunately."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
