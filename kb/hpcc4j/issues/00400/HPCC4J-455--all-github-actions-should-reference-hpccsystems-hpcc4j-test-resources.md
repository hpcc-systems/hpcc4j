---
id: jira-HPCC4J-455
title: HPCC4J-455 – All Github actions should reference hpccsystems/hpcc4j test resources
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-455"
project: HPCC4J
key: HPCC4J-455
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-04-14
updated: 2022-05-16
resolved: 2022-05-16
components:   - BuildPackaging
fixVersions:   - 8.6.x
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
All Github actions should reference hpccsystems/hpcc4j test resources

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Github actions referencing Michael-Gardner/hpccsystems-java-project-testbed/main/generatedata.sh should instead reference counterpart from hpccsystems repo ("}, {"type": "text", "text": "https://raw.githubusercontent.com/hpcc-systems/hpcc4j/master/wsclient/src/test/resources/generatedata.sh", "marks": [{"type": "link", "attrs": {"href": "https://raw.githubusercontent.com/hpcc-systems/hpcc4j/master/wsclient/src/test/resources/generatedata.sh"}}]}, {"type": "text", "text": ")"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "offending lines:"}, {"type": "hardBreak"}, {"type": "text", "text": "https://github.com/hpcc-systems/hpcc4j/blob/9f016799ad6e8e1259d764ec38046cf3037abc36/.github/workflows/remoteUnitTests.yml#L47", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/blob/9f016799ad6e8e1259d764ec38046cf3037abc36/.github/workflows/remoteU

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
