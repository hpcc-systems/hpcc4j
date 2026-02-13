# Workflow Trigger Optimization - Recommendations

## Executive Summary

This document provides specific, actionable recommendations for optimizing GitHub Actions workflow triggers in the hpcc4j repository. Implementing these recommendations will reduce unnecessary CI/CD executions by an estimated 20-30%, saving approximately 5-10 hours of CI time per month.

## Key Findings

### Current State
- **16 workflows** are configured in the repository
- **8 workflows** would benefit from path-based trigger filters
- **8 workflows** should remain unchanged (Jira integration, manual dispatch, scheduled, or reusable)
- Many workflows currently trigger on documentation-only or workflow-only changes

### Impact of Changes
- Reduced CI resource consumption
- Faster PR feedback (no waiting for irrelevant builds)
- Cleaner workflow run history
- Better signal-to-noise ratio in CI results

## Detailed Recommendations by Workflow

### 1. publish-snapshots-on-merge.yml ⭐ HIGHEST PRIORITY

**Current Behavior:** Publishes Maven snapshots on every push to master or candidate branches  
**Problem:** Uploads snapshots to Maven Central even for documentation or workflow changes  
**Recommended Change:** Add path filters

```yaml
on:
  push:
    branches:
      - 'master'
      - 'candidate-*'
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

**Rationale:**
- Snapshots represent the compiled artifacts that users download
- Only source code changes in `src/` directories produce different artifacts
- Documentation, workflow files, and test-only changes don't affect published artifacts
- This prevents unnecessary Maven Central uploads and version bumps

**Expected Impact:** 
- Reduce snapshot publishes by ~30-40%
- Save 3-5 minutes per avoided publish
- Cleaner artifact repository

---

### 2. JAPIPRBuildAction.yml ⭐ HIGH PRIORITY

**Current Behavior:** Builds and tests on all pull requests  
**Problem:** Runs full build pipeline for documentation-only or workflow-only PRs  
**Recommended Change:** Add path filters

```yaml
on:
  pull_request:
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

**Rationale:**
- PR builds provide fast feedback to developers
- Unnecessary builds delay feedback for documentation authors
- Should still run when the workflow itself changes (for testing)
- Should not run for unrelated workflow changes (Jira, publish, upmerge)

**Expected Impact:**
- Reduce PR builds by ~20-25%
- Save 5-10 minutes per avoided build
- Faster PR approval for documentation changes

---

### 3. BuildTestCandidateAndMaster.yml ⭐ HIGH PRIORITY

**Current Behavior:** Builds candidate branches on every push  
**Problem:** Builds occur even for documentation-only commits  
**Recommended Change:** Add path filters

```yaml
on:
  push:
    branches:
      - 'candidate-*'
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

**Rationale:**
- Candidate branches receive frequent documentation updates
- Build verification is only needed for code changes
- Maintains safety by including the workflow file itself

**Expected Impact:**
- Reduce candidate branch builds by ~25-30%
- Save 5-10 minutes per avoided build
- Cleaner build history

---

### 4. baremetal-regression-suite.yml 🔶 MEDIUM PRIORITY

**Current Behavior:** Runs integration tests on all PRs  
**Problem:** Long-running tests execute for documentation-only PRs  
**Recommended Change:** Add path filters to PR trigger only

```yaml
on:
  pull_request:
    branches:
      - "master"
      - "candidate-*"
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
  workflow_dispatch:  # Keep manual trigger without filters
```

**Rationale:**
- Integration tests take 15-30 minutes to complete
- High cost for documentation-only PRs
- Manual dispatch should remain available for all cases
- Tests are critical, so be conservative with exclusions

**Expected Impact:**
- Reduce test runs by ~20%
- Save 15-30 minutes per avoided test run
- Significant CI resource savings

---

### 5. k8s-regression-suite.yml 🔶 MEDIUM PRIORITY

**Current Behavior:** Runs K8s integration tests on all PRs  
**Problem:** Complex K8s setup and long-running tests for non-code changes  
**Recommended Change:** Add path filters

```yaml
on:
  pull_request:
    branches:
      - "master"
      - "candidate-*"
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
  workflow_dispatch:  # Keep manual trigger without filters
```

**Rationale:**
- K8s tests are resource-intensive (cluster setup, pod deployment)
- Should include K8s action changes since they affect deployment
- Manual trigger allows override when needed

**Expected Impact:**
- Reduce K8s test runs by ~20%
- Save 20-35 minutes per avoided test run
- Reduced pressure on K8s runners

---

### 6. javadocTest.yml 🔶 MEDIUM PRIORITY

**Current Behavior:** Generates and validates Javadoc for all PRs  
**Problem:** Javadoc generation for non-code changes  
**Recommended Change:** Add path filters

```yaml
on:
  pull_request:
    branches:
      - "master"
      - "candidate-*"
    paths:
      - '**.java'
      - 'pom.xml'
      - '**/pom.xml'
      - '.github/workflows/javadocTest.yml'
    paths-ignore:
      - '**/test/**/*.java'  # Test files rarely have meaningful Javadoc
      - 'docs/**'
      - '**.md'
```

**Rationale:**
- Javadoc only changes when Java source files change
- Test files typically don't have extensive Javadoc
- Build configuration changes might affect Javadoc generation

**Expected Impact:**
- Reduce Javadoc builds by ~25%
- Save 2-5 minutes per avoided build
- Cleaner PR checks

---

### 7. codeql-analysis.yml 🔶 MEDIUM PRIORITY

**Current Behavior:** Runs CodeQL security scanning on all pushes, PRs, and weekly  
**Problem:** Security scans for documentation-only changes  
**Recommended Change:** Add path filters to push and pull_request triggers only

```yaml
on:
  push:
    branches: [ "master", "candidate-*" ]
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
  pull_request:
    branches: [ "master", "candidate-*" ]
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
  schedule:  # Keep schedule without filters for comprehensive weekly scan
    - cron: '21 15 * * 4'
```

**Rationale:**
- Security scanning only needs to analyze Java code
- Scheduled runs should remain comprehensive (no filters)
- Weekly full scan catches anything missed by filters

**Expected Impact:**
- Reduce ad-hoc security scans by ~25%
- Save 10-15 minutes per avoided scan
- Weekly comprehensive scan ensures nothing is missed

---

### 8. upmerge-test.yml 🔶 MEDIUM PRIORITY

**Current Behavior:** Tests upmerge conflicts for all candidate branch PRs  
**Problem:** Tests conflicts for documentation-only PRs  
**Recommended Change:** Add path filters

```yaml
on:
  pull_request:
    types: [opened, reopened]
    branches:
      - "candidate-*"
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

**Rationale:**
- Upmerge conflicts typically occur in source code, not documentation
- Documentation follows different patterns across branches
- Maven version conflicts are common and should be tested

**Expected Impact:**
- Reduce upmerge tests by ~25%
- Save 2-5 minutes per avoided test
- Cleaner conflict reporting

---

## Workflows That Should NOT Be Changed

### Jirabot.yml & JirabotMerge.yml
**Reason:** Jira integration must run for all PRs to maintain accurate issue tracking, regardless of file changes.

### auto-upmerge.yml
**Reason:** Upmerging must happen for all merges to maintain branch consistency across the project.

### upmerge-comment.yml
**Reason:** Triggered by workflow completion, not file changes. Path filters don't apply.

### publish-release-on-merge.yml
**Reason:** Release publishing is tag-based. All release tags should publish, regardless of what changed.

### Nightly.yml
**Reason:** Scheduled jobs should always run for comprehensive validation.

### baremetal-known-server-issues.yml
**Reason:** Manual dispatch only. Users explicitly choose when to run.

### build-docker.yml
**Reason:** Reusable workflow called by other workflows. No independent triggers.

---

## Implementation Strategy

### Phase 1: Publishing & PR Builds (Week 1)
**Goal:** Address highest-impact workflows first

1. Update `publish-snapshots-on-merge.yml`
2. Update `JAPIPRBuildAction.yml`
3. Update `BuildTestCandidateAndMaster.yml`

**Test with:**
- Documentation-only PR
- Source code PR
- Mixed PR

**Expected Savings:** ~10-20 minutes per avoided workflow run

---

### Phase 2: Integration Tests (Week 2)
**Goal:** Reduce expensive test runs

4. Update `baremetal-regression-suite.yml`
5. Update `k8s-regression-suite.yml`

**Test with:**
- Documentation-only PR
- Java code change PR
- Test-only change PR

**Expected Savings:** ~30-60 minutes per avoided test run

---

### Phase 3: Quality & Branch Management (Week 3)
**Goal:** Complete optimization

6. Update `javadocTest.yml`
7. Update `codeql-analysis.yml`
8. Update `upmerge-test.yml`

**Test with:**
- Documentation-only PR
- Java code change PR
- Build config change PR

**Expected Savings:** ~15-25 minutes per avoided workflow run

---

## Testing Protocol

For each workflow update:

### Test 1: Documentation-Only Change
```bash
# Create PR with only README.md change
git checkout -b test/doc-only
echo "# Test" >> README.md
git add README.md
git commit -m "docs: test documentation change"
git push origin test/doc-only
# Create PR, verify workflow does NOT trigger
```

**Expected:** Workflow with path filters should NOT run

### Test 2: Source Code Change
```bash
# Create PR with Java file change
git checkout -b test/code-change
# Modify a .java file
git add .
git commit -m "feat: test code change"
git push origin test/code-change
# Create PR, verify workflow DOES trigger
```

**Expected:** Workflow should run normally

### Test 3: Workflow File Change
```bash
# Create PR with workflow change
git checkout -b test/workflow-change
# Modify the workflow file itself
git add .github/workflows/<workflow-name>.yml
git commit -m "ci: test workflow change"
git push origin test/workflow-change
# Create PR, verify workflow DOES trigger
```

**Expected:** Workflow should run (testing itself)

### Test 4: Mixed Change
```bash
# Create PR with both doc and code changes
git checkout -b test/mixed-change
echo "# Test" >> README.md
# Modify a .java file
git add .
git commit -m "feat: mixed changes"
git push origin test/mixed-change
# Create PR, verify workflow DOES trigger
```

**Expected:** Workflow should run (code change present)

---

## Monitoring & Validation

### Week 1-2: Initial Monitoring
- Track total workflow runs per day
- Monitor for any missed builds
- Collect developer feedback

### Week 3-4: Validation
- Compare workflow runs before/after
- Verify no false negatives (missed builds)
- Measure time savings

### Ongoing: Continuous Improvement
- Review workflow efficiency quarterly
- Adjust filters based on patterns
- Update documentation as needed

---

## Success Metrics

### Quantitative Metrics
- **Workflow Execution Reduction:** Target 20-30% fewer runs
- **CI Time Savings:** Target 5-10 hours/month
- **Average PR Feedback Time:** Should improve for doc-only PRs

### Qualitative Metrics
- **Developer Satisfaction:** Faster doc-only PR merges
- **CI Resource Efficiency:** Better utilization of runner time
- **Workflow Clarity:** Cleaner run history

---

## Risk Mitigation

### Potential Risks
1. **False Negatives:** Legitimate changes not triggering workflows
2. **Pattern Mismatches:** Filters not matching actual file structure
3. **Maintenance Overhead:** Keeping filters updated

### Mitigation Strategies
1. **Conservative Filters:** When in doubt, include rather than exclude
2. **Testing Protocol:** Thorough testing before merging
3. **Monitoring:** Active monitoring for first 2 weeks
4. **Easy Rollback:** Simple to remove filters if needed
5. **Weekly Scheduled Jobs:** Comprehensive coverage (CodeQL)

---

## Rollback Procedure

If any issues arise:

1. **Identify the problematic workflow**
2. **Remove the paths/paths-ignore sections**
3. **Commit and push the change**
4. **Workflow reverts to triggering on all changes**

Example:
```yaml
# Before (with filters)
on:
  pull_request:
    paths:
      - '**.java'

# After (rollback)
on:
  pull_request:
    # Removed path filters
```

---

## Additional Optimization Opportunities

### Concurrency Groups
Add to workflows that can be safely cancelled:

```yaml
concurrency:
  group: ${{ github.workflow }}-${{ github.ref }}
  cancel-in-progress: true
```

**Benefit:** Cancels outdated runs when new commits pushed

### Conditional Job Steps
Use step-level conditions for finer control:

```yaml
- name: Run expensive step
  if: contains(github.event.head_commit.modified, '.java')
  run: mvn test
```

**Benefit:** Skip expensive steps within jobs

### Dependent Workflow Optimization
Chain workflows to avoid redundant work:

```yaml
needs: [build-job]
if: success()
```

**Benefit:** Only run downstream jobs if upstream succeeds

---

## Conclusion

Implementing these recommendations will significantly improve CI/CD efficiency in the hpcc4j repository. The phased approach ensures safe rollout with continuous validation. The estimated 20-30% reduction in workflow runs translates to meaningful time and resource savings.

### Next Steps
1. Review and approve recommendations
2. Implement Phase 1 (highest priority workflows)
3. Test thoroughly with multiple PR types
4. Monitor for 1-2 weeks
5. Proceed to Phase 2 and 3

---

**Document Version:** 1.0  
**Last Updated:** 2026-02-13  
**Author:** HPCC4J Team  
**Status:** Ready for Review
