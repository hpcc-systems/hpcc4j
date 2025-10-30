# TestGeneratorAgent.py - Automated Test Generation for HPCC4J

## Overview

TestGeneratorAgent.py is an AI-powered Python script that automates the complete lifecycle of generating, building, executing, and analyzing comprehensive test suites for HPCC Java client methods. It leverages GitHub Copilot CLI to intelligently create tests, fix compilation errors, and categorize test failures.

## Features

- 🤖 **AI-Powered Test Generation**: Uses Copilot CLI to analyze HPCC Platform source code and generate comprehensive test cases
- 🔍 **Method Analysis**: Deep analysis of server-side ESDL/ECM definitions and ESP service implementations
- 🧪 **Test Metadata**: Generates structured JSON metadata for precise test execution and tracking
- 🏗️ **Automated Build Fixing**: Iteratively fixes compilation errors with AI assistance
- 🔄 **Iterative Test Execution**: Runs tests individually with detailed failure analysis
- 📊 **Intelligent Categorization**: Automatically classifies failures as client-side, server-side, or invalid tests
- 📝 **Comprehensive Reporting**: Generates detailed analysis documents and final reports

## Prerequisites

1. **Python 3.7+** with standard libraries
2. **GitHub Copilot CLI** installed and configured (`copilot` command available)
3. **Maven** installed for building and testing Java projects
4. **HPCC Platform Source Code** - local clone of the HPCC-Platform repository
5. **HPCC4J Project** - the workspace where tests will be generated
6. **Running HPCC Cluster** - accessible for test execution (for Step 4)

## Installation

No installation required beyond prerequisites. Make the script executable:

```bash
chmod +x TestGeneratorAgent.py
```

## Usage

### Basic Command Format

```bash
./TestGeneratorAgent.py <SERVICE_NAME> <METHOD_NAME> --hpcc-source <HPCC_PLATFORM_DIR> [OPTIONS]
```

### Required Arguments

| Argument | Description | Example |
|----------|-------------|---------|
| `SERVICE_NAME` | Name of the HPCC service | `WsDFU`, `WsWorkunits`, `WsTopology` |
| `METHOD_NAME` | Name of the method to test | `getFileDataColumns`, `getDatasetFields` |
| `--hpcc-source` or `-s` | Path to HPCC Platform source code | `../HPCC-Platform` or `/Users/dev/HPCC-Platform` |

### Optional Arguments

| Argument | Description | Default |
|----------|-------------|---------|
| `--skip-analysis` | Skip Step 1 if analysis file exists | `false` |
| `--start-from-step N` | Start from specific step (1-4) | `1` |

### Environment Variables

Configure HPCC cluster connections (used in Step 4):

```bash
export HPCCCONN="http://eclwatch.default:8010"
export WSSQLCONN="http://sql2ecl.default:8510"
```

## The Four-Step Process

### Step 1: Method Analysis

**Purpose**: Generate comprehensive analysis of the method to be tested

**Actions**:
- Reads `MethodAnalysisPrompt.md` template
- Analyzes HPCC Platform source code (ESDL definitions, ESP implementations)
- Generates detailed method documentation

**Output**: `{Service}.{Method}Analysis.md`

**Example**:
```bash
./TestGeneratorAgent.py WsDFU getDatasetFields --hpcc-source ../HPCC-Platform
```

### Step 2: Test Generation

**Purpose**: Implement test cases based on the analysis

**Actions**:
- Reads the analysis file from Step 1
- Generates comprehensive test cases covering:
  - Basic functionality tests
  - Edge cases
  - Error handling scenarios
- Creates test metadata JSON file
- Generates expected results document

**Outputs**:
- `{Service}.{Method}ExpectedTestResults.md`
- `{Service}.{Method}TestMetadata.json`
- Modified `{Service}ClientTest.java` with new test methods

**Test Metadata Structure**:
```json
{
  "service": "WsDFU",
  "method": "getDatasetFields",
  "testClass": "WsDFUClientTest",
  "tests": [
    {
      "testName": "testMethodName",
      "description": "What the test validates",
      "category": "basic|edge-case|error-handling|integration",
      "expectedOutcome": "PASS|SKIP",
      "requiresData": true,
      "requiredDataset": "~dataset::name",
      "notes": "Additional context"
    }
  ]
}
```

**Example**:
```bash
# Run from Step 2 only
./TestGeneratorAgent.py WsDFU getDatasetFields --hpcc-source ../HPCC-Platform --start-from-step 2
```

### Step 3: Build and Fix

**Purpose**: Compile the project and fix any compilation errors

**Actions**:
- Runs `mvn package -B`
- If compilation fails:
  - Analyzes error messages
  - Uses Copilot to fix test file errors
  - Retries build
- Continues until successful build

**Example**:
```bash
# Run from Step 3 only (if analysis and tests already exist)
./TestGeneratorAgent.py WsDFU getDatasetFields --hpcc-source ../HPCC-Platform --start-from-step 3
```

### Step 4: Test Execution and Analysis

**Purpose**: Run tests individually and analyze failures

**Actions**:
1. **Load Test Metadata**: Reads the JSON file from Step 2
2. **Individual Test Execution**: Runs each test separately:
   ```bash
   mvn -B --activate-profiles jenkins-on-demand \
       -Dhpccconn=<HPCCCONN> \
       -Dwssqlconn=<WSSQLCONN> \
       -Dtest={TestClass}#{testName} \
       package
   ```
3. **Failure Analysis**: For each failed test:
   - Analyzes error messages and stack traces
   - Determines if test is valid or invalid
   - Classifies as client-side or server-side issue
   - Performs root cause analysis
4. **Automated Actions**:
   - **Invalid Tests**: Fixes test logic and retries
   - **Client Issues**: Adds `@Category(UnverifiedClientIssues.class)`
   - **Server Issues**: Adds `@Category(UnverifiedServerIssues.class)`
5. **Iteration**: Repeats up to 5 times or until all tests pass/are categorized

**Outputs**:
- `{Service}.{Method}TestResults_Iteration{N}.json` - Detailed results per iteration
- `{Service}.{Method}FailureAnalysis.md` - Analysis of failures
- `{Service}.{Method}FailureSummary_Iteration{N}.md` - Summary per iteration
- `{Service}.{Method}FinalReport.md` - Comprehensive final report
- Modified test files with categorization annotations

**Example**:
```bash
# Set connection URLs
export HPCCCONN="http://my-cluster:8010"
export WSSQLCONN="http://my-sql:8510"

# Run Step 4 only
./TestGeneratorAgent.py WsDFU getDatasetFields --hpcc-source ../HPCC-Platform --start-from-step 4
```

## Complete Examples

### Example 1: Full Run (All Steps)

```bash
./TestGeneratorAgent.py WsDFU getFileDataColumns \
    --hpcc-source /Users/dev/HPCC-Platform
```

This will:
1. Analyze the `getFileDataColumns` method
2. Generate comprehensive tests
3. Build the project (fixing errors as needed)
4. Run and analyze all tests

### Example 2: Skip Analysis if Already Done

```bash
./TestGeneratorAgent.py WsDFU getFileDataColumns \
    --hpcc-source ../HPCC-Platform \
    --skip-analysis
```

### Example 3: Resume from Test Execution

```bash
# If Steps 1-3 completed, just run tests
export HPCCCONN="http://play.hpccsystems.com:8010"

./TestGeneratorAgent.py WsDFU getDatasetFields \
    --hpcc-source ../HPCC-Platform \
    --start-from-step 4
```

### Example 4: Generate Tests for New Method

```bash
./TestGeneratorAgent.py WsWorkunits getWorkunitResults \
    --hpcc-source ~/projects/HPCC-Platform
```

## Generated Files

After a complete run, the following files are created:

| File | Description | Step |
|------|-------------|------|
| `{Service}.{Method}Analysis.md` | Comprehensive method analysis | 1 |
| `{Service}.{Method}ExpectedTestResults.md` | Expected test outcomes | 2 |
| `{Service}.{Method}TestMetadata.json` | Test execution metadata | 2 |
| `{Service}ClientTest.java` | Modified test class with new tests | 2 |
| `{Service}.{Method}TestResults_Iteration{N}.json` | Results per iteration | 4 |
| `{Service}.{Method}FailureAnalysis.md` | Detailed failure analysis | 4 |
| `{Service}.{Method}FailureSummary_Iteration{N}.md` | Summary per iteration | 4 |
| `{Service}.{Method}FinalReport.md` | Final comprehensive report | 4 |

## Test Categorization System

The agent automatically categorizes test failures:

### ✅ Valid Tests - Client Issues
Tests correctly written but fail due to client-side bugs:
```java
@Category(UnverifiedClientIssues.class)
@Test
public void testMethodName() {
    // Test that found a client bug
}
```

### ✅ Valid Tests - Server Issues
Tests correctly written but fail due to server-side bugs:
```java
@Category(UnverifiedServerIssues.class)
@Test
public void testMethodName() {
    // Test that found a server bug
}
```

### ❌ Invalid Tests
Tests with incorrect logic - these are fixed and re-run:
- Wrong assertions
- Incorrect test setup
- Testing impossible scenarios

## Configuration

### Copilot Tool Whitelist

Edit the `COPILOT_WHITELIST` in [`TestGeneratorAgent.py`](TestGeneratorAgent.py ) to control which tools Copilot can use:

```python
COPILOT_WHITELIST = [
    "mvn",      # Maven build tool
    "bash",     # Shell commands
    "python",   # Python scripts
    "curl",     # HTTP requests
    "sed",      # Text processing
    "awk",      # Text processing
    "find",     # File search
    "grep",     # Text search
    "ls",       # Directory listing
]
```

### Maximum Iterations

Modify `MAX_TEST_FIX_ITERATIONS` to change the number of failure analysis iterations:

```python
MAX_TEST_FIX_ITERATIONS = 5
```

## Test Metadata JSON Schema

The JSON file generated in Step 2 follows this structure:

```json
{
  "service": "string",
  "method": "string", 
  "testClass": "string",
  "tests": [
    {
      "testName": "string (exact test method name)",
      "description": "string (what test validates)",
      "category": "basic|edge-case|error-handling|integration",
      "expectedOutcome": "PASS|SKIP",
      "requiresData": boolean,
      "requiredDataset": "string (optional)",
      "notes": "string (additional context)"
    }
  ],
  "testConfiguration": {
    "hpccConnection": "string",
    "wssqlConnection": "string",
    "defaultCluster": "string",
    "maxTestTimeout": number,
    "retryAttempts": number
  },
  "datasetRequirements": {
    "existing": ["array of existing datasets"],
    "newRequired": ["array of datasets to create"]
  }
}
```

## Troubleshooting

### Issue: Analysis file not created

**Symptom**: Step 1 completes but `{Service}.{Method}Analysis.md` doesn't exist

**Solution**:
1. Check file permissions in current directory
2. Manually create the file when prompted
3. Verify Copilot CLI is working: `copilot --version`

### Issue: Build fails repeatedly

**Symptom**: Step 3 keeps failing compilation

**Solution**:
1. Check Maven is installed: `mvn --version`
2. Manually run `mvn clean package` to see errors
3. Check that Java version matches project requirements (Java 8+)
4. Review compilation errors and fix manually if needed

### Issue: Step 4 fails to find test metadata

**Symptom**: Error message about missing `{Service}.{Method}TestMetadata.json`

**Solution**:
1. Run from Step 2 to generate the metadata file
2. Manually create the JSON file using the schema above
3. Ensure the file is in the current directory

### Issue: Tests fail with connection errors

**Symptom**: Tests fail with connection refused or timeout errors

**Solution**:
1. Verify HPCC cluster is running and accessible
2. Check connection URLs: `echo $HPCCCONN`
3. Test connection manually: `curl $HPCCCONN/WsDfu?ver_`
4. Update environment variables with correct URLs

### Issue: All tests marked as needing investigation

**Symptom**: No automatic categorization happens

**Solution**:
1. Review `{Service}.{Method}FailureAnalysis.md` for details
2. Increase iteration count if pattern emerges
3. Manually review and categorize if AI is uncertain

## Best Practices

### 1. Review Generated Analysis
After Step 1, review the analysis document to ensure it accurately describes the method.

### 2. Check Test Metadata
After Step 2, verify the JSON metadata contains all expected tests with correct names.

### 3. Manual Test Review
Review generated test code to ensure it follows project conventions and coding standards.

### 4. Incremental Testing
For large test suites, consider running Step 4 multiple times with subsets of tests.

### 5. Dataset Preparation
Before Step 4, ensure all required datasets exist on the HPCC cluster or mark tests as SKIP.

### 6. Version Control
Commit after each successful step:
```bash
git add .
git commit -m "feat: Add {Method} analysis (Step 1)"
git commit -m "feat: Generate {Method} tests (Step 2)"
git commit -m "feat: Pass {Method} tests (Step 4)"
```

## Integration with HPCC4J Conventions

The agent follows HPCC4J project conventions:

- ✅ All test classes extend `BaseHPCCWsClientTest`
- ✅ Uses Apache 2.0 license headers (current year)
- ✅ Follows Eclipse formatter configuration
- ✅ Uses wrapper classes instead of Axis2 stubs
- ✅ Implements proper connection pooling patterns
- ✅ Uses JUnit test annotations
- ✅ Categorizes unverified issues appropriately

## Advanced Usage

### Custom Maven Profiles

Modify `run_individual_test()` function to use different Maven profiles:

```python
cmd = [
    "mvn", "-B",
    "--activate-profiles", "your-custom-profile",
    f"-Dhpccconn={hpcc_conn}",
    f"-Dtest={test_spec}",
    "package"
]
```

### Custom Analysis Prompts

Edit `MethodAnalysisPrompt.md` to customize the analysis generation:
- Add specific requirements
- Include additional context
- Specify test coverage criteria

### Parallel Test Execution

For faster execution, modify Step 4 to run tests in parallel (requires careful error handling).

## Contributing

When enhancing TestGeneratorAgent.py:

1. Maintain the four-step structure
2. Preserve backward compatibility
3. Document new features in this README
4. Add examples for new functionality
5. Test with multiple service/method combinations

## License

This tool is part of the HPCC4J project and follows the same Apache 2.0 license.

## Support

For issues or questions:
1. Check this README's troubleshooting section
2. Review generated analysis and report files
3. Examine log output for error details
4. Consult HPCC4J project documentation

## Changelog

### Current Version
- ✅ Four-step automated test generation
- ✅ Individual test execution with Maven profiles
- ✅ JSON metadata for test tracking
- ✅ Iterative failure analysis and categorization
- ✅ Comprehensive reporting
- ✅ HPCC Platform source code integration
- ✅ Environment variable configuration

---

**Note**: This tool uses AI (GitHub Copilot CLI) extensively. Review all generated code before committing to ensure quality and correctness.
