---
id: jira-HPCC4J-83
title: HPCC4J-83 – NPE if isWorkunitComplete(String wuid) is called for an archived WUID.
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-83"
project: HPCC4J
key: HPCC4J-83
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-07-27
updated: 2017-08-31
resolved: 2017-08-03
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
NPE if isWorkunitComplete(String wuid) is called for an archived WUID.

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "See "}, {"type": "text", "text": "https://github.com/hpcc-systems/HIPIE/issues/2812#issuecomment-313389732", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HIPIE/issues/2812#issuecomment-313389732"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Test.java", "marks": [{"type": "strong"}]}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "@Test\r\n    public void testWsclient() throws Exception {\r\n        final String wuid = \"W20170609-111606\";\r\n        HPCCConnection conn = hipieService.getHpccManager().getConnection(\"ramps_cert\");\r\n        conn.getHpccWorkunitService().isWorkunitComplete(wuid);\r\n    }"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "If the wuid used above is archived, the following stack is returned."}]}, {"type": "codeBlock", "content": [{"type": "

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC4J-82
- 01. Relates: HPCC4J-86
