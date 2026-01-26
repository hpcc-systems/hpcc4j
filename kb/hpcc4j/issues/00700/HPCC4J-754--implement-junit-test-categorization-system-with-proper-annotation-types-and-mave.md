---
id: jira-HPCC4J-754
title: HPCC4J-754 – Implement JUnit test categorization system with proper annotation types and Maven profiles
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-754"
project: HPCC4J
key: HPCC4J-754
status: Merge Pending
statusCategory: In Progress
resolution: null
created: 2025-10-23
updated: 2025-10-23
resolved: null
components: []
fixVersions: []
labels:
  - annotations
  - enhancement
  - junit
  - maven
  - test-categories
  - testing
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Implement JUnit test categorization system with proper annotation types and Maven profiles

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Background: The HPCC4J project needed a robust test categorization system to enable selective test execution based on test types (base tests, remote tests, integration tests, known server issues, etc.). The existing system used plain Java interfaces instead of proper JUnit annotation types, which prevented proper integration with Maven Surefire plugin and JUnit's @Category mechanism. Changes Implemented: 1. Converted Test Category Interfaces to Annotation Types - BaseTests: interface \u00e2\u2020\u2019 @interface - RemoteTests: interface \u00e2\u2020\u2019 @interface - IntegrationTests: interface \u00e2\u2020\u2019 @interface - RegressionTests: interface \u00e2\u2020\u2019 @interface - Benchmark: interface \u00e2\u2020\u2019 @interface - KnownServerIssueTests: new annotation type (was KnownServerSideFailure) 2. Added Maven Profile System - known-server-issues: Profile for tests with kn

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
