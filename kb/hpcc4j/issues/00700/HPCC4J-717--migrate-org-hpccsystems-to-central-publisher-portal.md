---
id: jira-HPCC4J-717
title: HPCC4J-717 – Migrate org.hpccsystems to Central Publisher Portal
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-717"
project: HPCC4J
key: HPCC4J-717
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-05-12
updated: 2025-05-15
resolved: null
components:   - BuildPackaging
fixVersions:
  - 9.6.108
  - 9.8.84
  - 9.10.30
  - 9.12.4
labels: []
applies_to: hpcc4j: >= 9.6.108
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Migrate org.hpccsystems to Central Publisher Portal

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The OSSRH service will reach end-of-life on "}, {"type": "text", "text": "June 30th, 2025", "marks": [{"type": "link", "attrs": {"href": "https://central.sonatype.org/news/20250326_ossrh_sunset/"}}]}, {"type": "text", "text": ". Learn more about how to transfer to the Central Publishing Portal "}, {"type": "text", "text": "here", "marks": [{"type": "link", "attrs": {"href": "https://central.sonatype.org/faq/what-is-different-between-central-portal-and-legacy-ossrh/#process-to-migrate"}}]}, {"type": "text", "text": "."}]}, {"type": "paragraph"}, {"type": "heading", "attrs": {"level": 2}, "content": [{"type": "text", "text": "Publishing"}, {"type": "text", "text": "\u2693\ufe0e", "marks": [{"type": "link", "attrs": {"href": "https://central.sonatype.org/faq/what-is-different-between-central-portal-and-legacy-ossrh/#publishing"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "te

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
