---
id: jira-HPCC4J-684
title: HPCC4J-684 – DFSClient CVEs
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-684"
project: HPCC4J
key: HPCC4J-684
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-02-05
updated: 2025-02-06
resolved: 2025-02-06
components:
  - BuildPackaging
  - dfsclient
fixVersions:
  - 9.10.4
  - 9.8.58
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
DFSClient CVEs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Mavencentral reports several CVEs associated with dfsclient deps:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Vulnerabilities from dependencies:"}, {"type": "hardBreak"}, {"type": "text", "text": "CVE-2024-47561", "marks": [{"type": "link", "attrs": {"href": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2024-47561"}}]}, {"type": "hardBreak"}, {"type": "text", "text": "CVE-2023-39410", "marks": [{"type": "link", "attrs": {"href": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-39410"}}]}]}, {"type": "paragraph"}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2023-39410"}}, {"type": "text", "text": " "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
