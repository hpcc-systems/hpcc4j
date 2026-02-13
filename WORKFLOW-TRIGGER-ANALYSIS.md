# GitHub Actions Workflow Trigger Analysis

## Overview
This document provides a comprehensive analysis of all GitHub Actions workflows in the hpcc4j repository, identifying appropriate file path triggers for each workflow to avoid unnecessary executions.

## Workflow Categories

### 1. Build & Test Workflows

#### 1.1 BuildTestCandidateAndMaster.yml
**Purpose:** Builds candidate branches on push  
**Current Triggers:** Push to candidate-* branches  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - '**.xml'
  - '**.properties'
  - 'pom.xml'
  - '**/pom.xml'
  - '.github/workflows/BuildTestCandidateAndMaster.yml'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
```
**Justification:** Should only trigger when source code, build configurations (pom.xml), or the workflow itself changes. Documentation changes should not trigger builds.

#### 1.2 JAPIPRBuildAction.yml
**Purpose:** Tests pull requests  
**Current Triggers:** All pull requests  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - '**.xml'
  - '**.properties'
  - 'pom.xml'
  - '**/pom.xml'
  - '.github/workflows/JAPIPRBuildAction.yml'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
  - '.github/workflows/Jirabot*.yml'
  - '.github/workflows/upmerge*.yml'
  - '.github/workflows/auto-upmerge.yml'
  - '.github/workflows/publish-*.yml'
```
**Justification:** PR builds should run for any code changes but skip pure documentation or workflow-only changes that don't affect the build.

#### 1.3 Nightly.yml
**Purpose:** Nightly builds (scheduled)  
**Current Triggers:** Cron schedule (weekdays at 2 AM)  
**Recommended Path Filters:** N/A (scheduled job should always run)  
**Justification:** Scheduled jobs should always run regardless of file changes to catch environment issues and ensure regular validation.

#### 1.4 javadocTest.yml
**Purpose:** Tests Javadoc generation for PRs  
**Current Triggers:** Pull requests to master/candidate branches  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - 'pom.xml'
  - '**/pom.xml'
  - '.github/workflows/javadocTest.yml'
paths-ignore:
  - '**/test/**'
  - 'docs/**'
  - '**.md'
```
**Justification:** Only needs to run when Java source code or build configuration changes. Test files don't typically contain Javadoc, so can be ignored.

### 2. Integration Test Workflows

#### 2.1 baremetal-regression-suite.yml
**Purpose:** Runs integration tests against HPCC Platform on bare metal  
**Current Triggers:** Pull requests and manual dispatch  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - 'pom.xml'
  - '**/pom.xml'
  - '.github/workflows/baremetal-regression-suite.yml'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
```
**Justification:** Integration tests should run for code changes but not for documentation-only changes.

#### 2.2 baremetal-known-server-issues.yml
**Purpose:** Tests known server-side issues (manual dispatch)  
**Current Triggers:** Manual workflow_dispatch only  
**Recommended Path Filters:** N/A (manual trigger)  
**Justification:** Manual dispatch workflows don't need path filters as they're explicitly triggered by users.

#### 2.3 k8s-regression-suite.yml
**Purpose:** Runs integration tests on Kubernetes  
**Current Triggers:** Pull requests and manual dispatch  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - 'pom.xml'
  - '**/pom.xml'
  - '.github/workflows/k8s-regression-suite.yml'
  - '.github/actions/build-k8s/**'
  - '.github/actions/deploy-hpcc-k8s/**'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
```
**Justification:** K8s tests should run for code changes and when K8s deployment actions change.

### 3. Code Quality & Security Workflows

#### 3.1 codeql-analysis.yml
**Purpose:** Security scanning with CodeQL  
**Current Triggers:** Push to master/candidate, PRs, weekly schedule  
**Recommended Path Filters (for push/PR only):**
```yaml
paths:
  - '**.java'
  - 'pom.xml'
  - '**/pom.xml'
  - '.github/workflows/codeql-analysis.yml'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
  - '**/test/**/*.java'
```
**Justification:** Security scanning only needs to run when source code changes. Test code is less critical for security. Scheduled runs should always execute (no filter for schedule trigger).

### 4. Release & Publishing Workflows

#### 4.1 publish-release-on-merge.yml
**Purpose:** Publishes releases to Maven Central  
**Current Triggers:** Push of tags matching *-release  
**Recommended Path Filters:** None  
**Justification:** Release publishing is tag-based and should always run when release tags are created, regardless of what files changed.

#### 4.2 publish-snapshots-on-merge.yml
**Purpose:** Publishes snapshot builds to Maven Central  
**Current Triggers:** Push to master/candidate branches  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - '**.xml'
  - 'pom.xml'
  - '**/pom.xml'
  - 'src/**'
  - 'commons-hpcc/src/**'
  - 'wsclient/src/**'
  - 'dfsclient/src/**'
  - 'spark-hpcc/src/**'
  - 'clienttools/src/**'
  - 'rdf2hpcc/src/**'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
  - '.github/workflows/**'
  - '**/test/**'
```
**Justification:** Snapshots should only be published when actual source code changes that would produce different artifacts. Workflow changes, test-only changes, and documentation should not trigger snapshot releases.

### 5. Jira Integration Workflows

#### 5.1 Jirabot.yml
**Purpose:** Updates Jira issues when PRs are opened  
**Current Triggers:** PR opened/reopened to master/candidate  
**Recommended Path Filters:** None  
**Justification:** Jira integration should run for all PRs regardless of file changes to ensure proper issue tracking.

#### 5.2 JirabotMerge.yml
**Purpose:** Updates Jira issues when PRs are merged  
**Current Triggers:** PR closed (merged) to master/candidate  
**Recommended Path Filters:** None  
**Justification:** Jira updates must happen for all merged PRs to maintain accurate issue status, regardless of what files were changed.

### 6. Branch Management Workflows

#### 6.1 auto-upmerge.yml
**Purpose:** Automatically upmerges changes to downstream branches  
**Current Triggers:** PR closed (merged) to candidate branches  
**Recommended Path Filters:** None  
**Justification:** Upmerging should happen for all merges to maintain branch consistency, regardless of file types changed.

#### 6.2 upmerge-test.yml
**Purpose:** Tests if PR changes will cause upmerge conflicts  
**Current Triggers:** PR opened/reopened to candidate branches  
**Recommended Path Filters:**
```yaml
paths:
  - '**.java'
  - '**.xml'
  - 'pom.xml'
  - '**/pom.xml'
  - 'src/**'
paths-ignore:
  - '**.md'
  - 'docs/**'
  - 'LICENSE'
  - '.gitignore'
  - 'eclipse/**'
```
**Justification:** Upmerge conflict testing is most relevant for source code changes. Documentation-only changes rarely cause upmerge conflicts.

#### 6.3 upmerge-comment.yml
**Purpose:** Posts upmerge test results as PR comments  
**Current Triggers:** Workflow run completion of upmerge-test  
**Recommended Path Filters:** None  
**Justification:** This workflow is triggered by another workflow's completion, not file changes, so path filters don't apply.

### 7. Docker Build Workflows

#### 7.1 build-docker.yml
**Purpose:** Reusable workflow for building HPCC Platform Docker images  
**Current Triggers:** workflow_call (reusable)  
**Recommended Path Filters:** N/A  
**Justification:** Reusable workflows are called by other workflows and don't have their own triggers.

## Summary of Recommendations

### High Priority Changes
1. **publish-snapshots-on-merge.yml**: Add path filters to avoid publishing snapshots for workflow-only or documentation changes
2. **JAPIPRBuildAction.yml**: Add path filters to reduce unnecessary PR builds
3. **BuildTestCandidateAndMaster.yml**: Add path filters to avoid builds on documentation changes

### Medium Priority Changes
4. **baremetal-regression-suite.yml**: Add path filters to skip tests for documentation changes
5. **k8s-regression-suite.yml**: Add path filters to skip K8s tests for documentation changes
6. **javadocTest.yml**: Add path filters to run only when relevant files change
7. **upmerge-test.yml**: Add path filters to test only when source code changes
8. **codeql-analysis.yml**: Add path filters for push/PR triggers (keep schedule unconditional)

### No Changes Needed
9. **Jirabot.yml**: Must run for all PRs
10. **JirabotMerge.yml**: Must run for all merges
11. **auto-upmerge.yml**: Must run for all merges
12. **upmerge-comment.yml**: Triggered by workflow completion
13. **publish-release-on-merge.yml**: Tag-based, always publish releases
14. **Nightly.yml**: Scheduled, should always run
15. **baremetal-known-server-issues.yml**: Manual dispatch only
16. **build-docker.yml**: Reusable workflow

## Implementation Guidelines

### Best Practices for Path Filters

1. **Always include the workflow file itself** in the paths so changes to the workflow trigger a test
2. **Use paths-ignore for documentation** (*.md, docs/**, LICENSE, etc.)
3. **Include all source directories** explicitly for clarity
4. **Be conservative with test workflows** - it's better to run tests unnecessarily than to miss a bug
5. **Use precise patterns** - `**.java` is better than `**/*` for Java projects

### Testing Recommendations

After implementing path filters:
1. Test with documentation-only PRs to ensure builds don't trigger
2. Test with source code changes to ensure builds still trigger
3. Test with mixed changes to verify filter logic
4. Monitor workflow execution frequency before and after changes

## File Structure Reference

### Source Code Directories
- `commons-hpcc/src/` - Common utilities
- `wsclient/src/` - Web service client code
- `dfsclient/src/` - Distributed file system client
- `spark-hpcc/src/` - Spark connector
- `clienttools/src/` - Client tools
- `rdf2hpcc/src/` - RDF ingestion tool

### Build Configuration
- `pom.xml` - Root Maven configuration
- `**/pom.xml` - Module Maven configurations

### Documentation
- `*.md` - Markdown documentation
- `docs/` - Documentation directory
- `README.md` - Project readme

### Infrastructure
- `.github/workflows/` - GitHub Actions workflows
- `.github/actions/` - Reusable GitHub Actions
- `eclipse/` - Eclipse IDE configuration

## Additional Optimization Opportunities

1. **Caching Strategy**: Most workflows already use Maven caching, but ensure consistency across all workflows
2. **Concurrency Groups**: Consider adding concurrency groups to cancel outdated workflow runs when new commits are pushed
3. **Matrix Strategy**: Some workflows could benefit from matrix builds to test multiple configurations in parallel
4. **Conditional Jobs**: Use job-level conditions to skip certain jobs based on changed files
5. **Workflow Dependencies**: Consider workflow dependencies to avoid redundant work across workflows

## Conclusion

Implementing these path-based triggers will significantly reduce unnecessary workflow executions, saving CI/CD resources and reducing pull request noise. The most impactful changes are to the snapshot publishing and PR build workflows, which currently run for all changes regardless of relevance.
