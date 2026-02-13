# GitHub Actions Workflow Trigger Summary

This document provides a quick reference table summarizing all workflows and their recommended trigger configurations.

## Quick Reference Table

| Workflow | Purpose | Current Trigger | Path Filters Needed? | Priority |
|----------|---------|-----------------|---------------------|----------|
| **BuildTestCandidateAndMaster.yml** | Build candidate branches | Push to candidate-* | ✅ Yes | High |
| **JAPIPRBuildAction.yml** | Test pull requests | All PRs | ✅ Yes | High |
| **Nightly.yml** | Nightly scheduled build | Cron schedule | ❌ No | N/A |
| **javadocTest.yml** | Test Javadoc generation | PRs to master/candidate | ✅ Yes | Medium |
| **baremetal-regression-suite.yml** | Integration tests (bare metal) | PRs + manual | ✅ Yes | Medium |
| **baremetal-known-server-issues.yml** | Test known issues | Manual only | ❌ No | N/A |
| **k8s-regression-suite.yml** | Integration tests (K8s) | PRs + manual | ✅ Yes | Medium |
| **codeql-analysis.yml** | Security scanning | Push/PR/schedule | ✅ Yes (push/PR only) | Medium |
| **publish-release-on-merge.yml** | Publish releases | Tag push (*-release) | ❌ No | N/A |
| **publish-snapshots-on-merge.yml** | Publish snapshots | Push to master/candidate | ✅ Yes | High |
| **Jirabot.yml** | Update Jira on PR open | PR opened/reopened | ❌ No | N/A |
| **JirabotMerge.yml** | Update Jira on PR merge | PR closed (merged) | ❌ No | N/A |
| **auto-upmerge.yml** | Auto-merge to branches | PR closed (merged) | ❌ No | N/A |
| **upmerge-test.yml** | Test upmerge conflicts | PR opened/reopened | ✅ Yes | Medium |
| **upmerge-comment.yml** | Post upmerge results | Workflow run completion | ❌ No | N/A |
| **build-docker.yml** | Build Docker images | Reusable workflow | ❌ No | N/A |

## Standard Path Filters

### Include Patterns (Common)
```yaml
paths:
  - '**.java'           # All Java source files
  - '**.xml'            # XML configuration files
  - 'pom.xml'           # Root Maven config
  - '**/pom.xml'        # Module Maven configs
  - 'src/**'            # Source directories
  - '.github/workflows/<workflow-name>.yml'  # The workflow itself
```

### Ignore Patterns (Common)
```yaml
paths-ignore:
  - '**.md'             # Markdown documentation
  - 'docs/**'           # Documentation directory
  - 'LICENSE'           # License file
  - '.gitignore'        # Git ignore file
  - 'eclipse/**'        # IDE configuration
```

## Workflow-Specific Filters

### For Build/Test Workflows
**Workflows:** BuildTestCandidateAndMaster.yml, JAPIPRBuildAction.yml

Should trigger on: Source code, build configs, properties files  
Should ignore: Documentation, IDE configs, other workflow files

### For Integration Tests
**Workflows:** baremetal-regression-suite.yml, k8s-regression-suite.yml

Should trigger on: Source code, build configs  
Should ignore: Documentation, IDE configs, test-only changes might be considered

### For Publishing Workflows
**Workflows:** publish-snapshots-on-merge.yml

Should trigger on: Source code in src/ directories, build configs  
Should ignore: Documentation, workflow files, test-only changes, IDE configs

### For Code Quality
**Workflows:** codeql-analysis.yml, javadocTest.yml

Should trigger on: Java source files, build configs  
Should ignore: Documentation, test files (CodeQL), IDE configs

### For Branch Management
**Workflows:** upmerge-test.yml

Should trigger on: Source code, build configs  
Should ignore: Documentation, IDE configs, workflow files

## Impact Analysis

### High Priority (Immediate Benefits)
These workflows run frequently and would see significant savings:

1. **publish-snapshots-on-merge.yml**
   - Currently: Runs on every push to master/candidate
   - Problem: Publishes snapshots even for doc-only changes
   - Benefit: Avoids unnecessary Maven Central uploads

2. **JAPIPRBuildAction.yml**
   - Currently: Runs on all PRs
   - Problem: Builds even for workflow-only or doc-only PRs
   - Benefit: Saves ~5-10 minutes per doc-only PR

3. **BuildTestCandidateAndMaster.yml**
   - Currently: Runs on every candidate branch push
   - Problem: Builds even for documentation updates
   - Benefit: Saves CI resources on non-code changes

### Medium Priority (Optimization)
These workflows would benefit but have less frequent impact:

4. **baremetal-regression-suite.yml** & **k8s-regression-suite.yml**
   - Currently: Run on all PRs
   - Problem: Long-running tests for doc changes
   - Benefit: Saves 15-30 minutes per doc-only PR

5. **javadocTest.yml**
   - Currently: Runs on all PRs
   - Problem: Generates Javadoc for non-code changes
   - Benefit: Saves ~2-5 minutes per non-code PR

6. **upmerge-test.yml**
   - Currently: Runs on all candidate branch PRs
   - Problem: Tests conflicts for doc-only changes
   - Benefit: Cleaner workflow run history

7. **codeql-analysis.yml**
   - Currently: Runs on all pushes/PRs
   - Problem: Security scans for non-code changes
   - Benefit: Saves ~10-15 minutes per non-code change

## Estimated Savings

Based on typical activity patterns:

### Per Documentation-Only PR
- Build time saved: ~5-10 minutes (JAPIPRBuildAction.yml)
- Integration test time saved: ~15-30 minutes (regression suites)
- Total per doc PR: ~20-40 minutes of CI time

### Per Documentation-Only Push to Master/Candidate
- Build time saved: ~5-10 minutes (BuildTestCandidateAndMaster.yml)
- Publishing time saved: ~3-5 minutes (publish-snapshots-on-merge.yml)
- Security scan time saved: ~10-15 minutes (codeql-analysis.yml)
- Total per doc push: ~18-30 minutes of CI time

### Monthly Savings (Estimated)
Assuming 20-30% of PRs and pushes are documentation/workflow-only:
- **5-10 hours of CI time per month**
- **Reduced noise in workflow runs**
- **Faster feedback for actual code changes**

## Implementation Order

### Phase 1: Highest Impact (Week 1)
1. ✅ publish-snapshots-on-merge.yml
2. ✅ JAPIPRBuildAction.yml
3. ✅ BuildTestCandidateAndMaster.yml

### Phase 2: Integration Tests (Week 2)
4. ✅ baremetal-regression-suite.yml
5. ✅ k8s-regression-suite.yml

### Phase 3: Quality & Branch Management (Week 3)
6. ✅ javadocTest.yml
7. ✅ codeql-analysis.yml
8. ✅ upmerge-test.yml

## Testing Checklist

After implementing each path filter:

- [ ] Test with a documentation-only PR (e.g., updating README.md)
  - Expected: Workflow should NOT trigger
- [ ] Test with a source code PR (e.g., updating a .java file)
  - Expected: Workflow SHOULD trigger
- [ ] Test with a workflow file change (e.g., updating the workflow itself)
  - Expected: Workflow SHOULD trigger (if workflow is in paths)
- [ ] Test with a mixed PR (doc + code)
  - Expected: Workflow SHOULD trigger
- [ ] Test with build config change (e.g., updating pom.xml)
  - Expected: Workflow SHOULD trigger

## Monitoring

After deployment, monitor:

1. **Workflow Execution Frequency**
   - Compare runs before and after implementation
   - Target: 20-30% reduction in total workflow runs

2. **False Negatives**
   - Ensure no legitimate changes are being ignored
   - Watch for issues reported that weren't caught by CI

3. **Developer Feedback**
   - Confirm developers see faster PR feedback
   - Check if any workflows are missed when they shouldn't be

## Rollback Plan

If any issues arise:

1. Path filters can be easily removed by reverting the workflow changes
2. No code changes are needed, only workflow YAML updates
3. Each workflow can be rolled back independently

## Related Documentation

- Full Analysis: [WORKFLOW-TRIGGER-ANALYSIS.md](WORKFLOW-TRIGGER-ANALYSIS.md)
- GitHub Actions Path Filtering: https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#onpushpull_requestpull_request_targetpathspaths-ignore

---

**Document Version:** 1.0  
**Last Updated:** 2026-02-13  
**Maintained By:** HPCC4J Team
