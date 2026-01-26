---
id: jira-HPCC4J-457
title: "HPCC4J-457 – org.hpccsystems.ws.client.utils.Connection setProtocol function doesn't set isHttps"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-457"
project: HPCC4J
key: HPCC4J-457
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-05-03
updated: 2022-05-16
resolved: 2022-05-16
components: []
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
org.hpccsystems.ws.client.utils.Connection setProtocol function doesn't set isHttps

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "See this function.\u00a0 If the protocol_ is set then isHttps is never set, if its not set thein isHttps is true and protocol is http."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "should be, if protocol has value, if http set ishttps=false if https set ishttps=true"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "the else should be fixed to set isHttps false and protocol http"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "private void setProtocol(String protocol_) {"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0\u00a0\u00a0 if (protocol_ != null && protocol_.length() > 0)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "{ \u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0 this.protocol = protocol_; \u00a0\u00a0\u00a0 }"}]}, {"type": "paragrap

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
