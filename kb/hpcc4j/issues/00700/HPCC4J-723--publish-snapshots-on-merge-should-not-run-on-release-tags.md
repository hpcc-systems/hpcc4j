---
id: jira-HPCC4J-723
title: HPCC4J-723 – publish-snapshots-on-merge should not run on release tags
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-723"
project: HPCC4J
key: HPCC4J-723
status: New
statusCategory: To Do
resolution: null
created: 2025-05-21
updated: 2025-09-30
resolved: null
components:   - BuildPackaging
fixVersions: []
labels:   - CopilotCandidate
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
publish-snapshots-on-merge should not run on release tags

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The github action attempts to bail out if a release tag is detected, but apparently the condition used "}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "if: contains(github.ref_name, '-release') == false"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Is no longer working as expected."}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
