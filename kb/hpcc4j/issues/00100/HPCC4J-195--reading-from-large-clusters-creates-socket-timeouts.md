---
id: jira-HPCC4J-195
title: HPCC4J-195 – Reading from large clusters creates socket timeouts
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-195"
project: HPCC4J
key: HPCC4J-195
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-20
updated: 2019-07-09
resolved: 2019-07-09
components:   - dfsclient
fixVersions:   - 7.2.16
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
Reading from large clusters creates socket timeouts

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The default 1 second socket timeout in RowServiceInputStream.makeActive() is being hit when connecting to clusters with large numbers of thor nodes. "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Fix: either update the default timeout to something higher (5 or 10 seconds?) And/or provide a way to override this value in makeActive()"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
