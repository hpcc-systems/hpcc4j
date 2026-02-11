---
id: jira-HPCC4J-586
title: HPCC4J-586 – Add OTel support and instrumentation to HPCC4J projects
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-586"
project: HPCC4J
key: HPCC4J-586
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-03-08
updated: 2024-06-07
resolved: 2024-06-07
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
Add OTel support and instrumentation to HPCC4J projects

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add Otel support of context propagation and instrumentation:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://opentelemetry.io/docs/languages/java/getting-started/", "marks": [{"type": "link", "attrs": {"href": "https://opentelemetry.io/docs/languages/java/getting-started/"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "Prerequisites"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Ensure that you have the following installed locally:"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Java JDK 17+, due to the use of Spring Boot 3; "}, {"type": "text", "text": "Java 8+ otherwise", "marks": [{"type": "link", "attrs": {"href": "https://github.com/open-teleme

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
