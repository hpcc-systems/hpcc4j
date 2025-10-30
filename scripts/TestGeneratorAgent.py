#!/usr/bin/env python3
"""
Test Generator Agent for HPCC4J

This script automates the process of generating comprehensive tests for HPCC Java client methods.

Usage:
    ./TestGeneratorAgent.py <SERVICE_NAME> <METHOD_NAME> --hpcc-source <HPCC_PLATFORM_DIR>
    
Example:
    ./TestGeneratorAgent.py WsDFU getFileDataColumns --hpcc-source ../HPCC-Platform
    ./TestGeneratorAgent.py WsDFU getFileDataColumns -s ~/projects/HPCC-Platform

Arguments:
    SERVICE_NAME       Name of the HPCC service (e.g., WsDFU, WsWorkunits)
    METHOD_NAME        Name of the method to test (e.g., getFileDataColumns)
    --hpcc-source, -s  Path to HPCC Platform source code directory (required)
                       Can be relative (e.g., ../HPCC-Platform) or absolute
                       The script will convert it to an absolute path

The script will:
1. Generate a method analysis using the MethodAnalysisPrompt.md template
2. Create test cases based on the analysis
3. Build the project and fix compilation errors
4. Run tests with iterative failure analysis (up to 5 iterations):
   - Analyze each test failure to determine validity
   - Classify failures as client-side or server-side issues
   - Perform root cause analysis
   - Apply appropriate actions:
     * Fix invalid test cases
     * Categorize client issues with @Category(UnverifiedClientIssues.class)
     * Categorize server issues with @Category(UnverifiedServerIssues.class)
   - Generate comprehensive analysis reports
   - Continue until all tests pass or are properly categorized
"""
import subprocess
import os
import sys
import shlex
import argparse
import glob
import json

# === Configuration ===
def parse_arguments():
    parser = argparse.ArgumentParser(description="Generate tests for HPCC service methods")
    parser.add_argument("SERVICE_NAME", help="Name of the service to test")
    parser.add_argument("METHOD_NAME", help="Name of the method to test")
    parser.add_argument("--hpcc-source", "-s", 
                        dest="HPCC_SOURCE_DIR",
                        required=True,
                        help="Path to HPCC Platform source code directory (e.g., ../HPCC-Platform)")
    parser.add_argument("--hpccconn",
                        dest="HPCC_CONN",
                        default=None,
                        help="HPCC cluster connection URL (e.g., http://eclwatch.default:8010). "
                             "If not specified, uses HPCCCONN environment variable or default.")
    parser.add_argument("--wssqlconn",
                        dest="WSSQL_CONN",
                        default=None,
                        help="WsSQL connection URL (e.g., http://sql2ecl.default:8510). "
                             "If not specified, uses WSSQLCONN environment variable or default.")
    parser.add_argument("--hpccuser",
                        dest="HPCC_USER",
                        default=None,
                        help="HPCC cluster username for authentication. "
                             "If not specified, uses HPCCUSER environment variable or empty string.")
    parser.add_argument("--hpccpass",
                        dest="HPCC_PASS",
                        default=None,
                        help="HPCC cluster password for authentication. "
                             "If not specified, uses HPCCPASS environment variable or empty string.")
    parser.add_argument("--skip-analysis", 
                        action="store_true",
                        help="Skip Step 1 (analysis generation) if analysis file already exists")
    parser.add_argument("--start-from-step",
                        type=int,
                        choices=[1, 2, 3, 4],
                        default=1,
                        help="Start from a specific step (1=Analysis, 2=Test Generation, 3=Build, 4=Test Execution)")
    return parser.parse_args()

args = parse_arguments()
SERVICE_NAME = args.SERVICE_NAME
METHOD_NAME = args.METHOD_NAME
HPCC_SOURCE_DIR = os.path.abspath(args.HPCC_SOURCE_DIR)  # Convert to absolute path
SKIP_ANALYSIS = args.skip_analysis
START_FROM_STEP = args.start_from_step

# Validate that the HPCC source directory exists
if not os.path.exists(HPCC_SOURCE_DIR):
    print(f"❌ Error: HPCC Platform source directory not found: {HPCC_SOURCE_DIR}")
    sys.exit(1)

# Validate that it looks like an HPCC Platform directory
esp_dir = os.path.join(HPCC_SOURCE_DIR, "esp")
if not os.path.exists(esp_dir):
    print(f"⚠️  Warning: '{esp_dir}' not found. Are you sure this is the HPCC Platform source directory?")
    response = input("Continue anyway? (y/N): ")
    if response.lower() != 'y':
        sys.exit(1)

print(f"✅ Using HPCC Platform source: {HPCC_SOURCE_DIR}")

PROMPT_FILE = "MethodAnalysisPrompt.md"
ANALYSIS_FILE = f"{SERVICE_NAME}.{METHOD_NAME}Analysis.md"
EXPECTED_RESULTS_FILE = f"{SERVICE_NAME}.{METHOD_NAME}ExpectedTestResults.md"
TEST_FILE_GLOB = f"**/{SERVICE_NAME}ClientTest.java"
FAILURE_ANALYSIS_FILE = f"{SERVICE_NAME}.{METHOD_NAME}FailureAnalysis.md"

# Maximum iterations for test fixing and categorization
MAX_TEST_FIX_ITERATIONS = 5

# === Helper Functions ===
def run_cmd(cmd, cwd=None, capture=False, check=True):
    """Run a shell command with optional capture."""
    print(f"\n🧩 Running: {cmd}")
    result = subprocess.run(shlex.split(cmd), cwd=cwd, capture_output=capture, text=True)
    if result.returncode != 0 and check:
        print(f"❌ Command failed: {cmd}")
        print(result.stderr)
        sys.exit(result.returncode)
    return result.stdout if capture else None


# ========== Copilot CLI whitelist configuration ==========
# List of tools the Copilot CLI is allowed to use when invoked by this script.
# Edit this list to add or remove allowed tools. Keep names as the Copilot CLI expects
# (the script will pass each entry as "--allow-tool <name>").
# Suggested tools useful for generating and fixing tests:
# - git: to read repository history/branches and manage patches
# - mvn: to run builds and tests
# - bash / sh: for running shell commands or helper scripts
# - python: to run small python helpers or inspections
# - curl: to fetch remote schemas or WSDLs when needed
# - docker: to manage ephemeral test services or containers
# - sed/awk/find/ls: common shell utilities used in small helpers
# These are suggestions — adapt to your environment and Copilot CLI tool names.
COPILOT_WHITELIST = [
    "mvn",
    "bash",
    "python",
    "curl",
    "sed",
    "awk",
    "find",
    "grep",
    "ls",
]


def build_copilot_cmd(prompt_text):
    """Return a list suitable for subprocess.run for invoking the copilot CLI
    with the current whitelist. Each whitelist entry is passed as '--allow-tool <name>'.
    This keeps the list easily editable in one place (COPILOT_WHITELIST).
    """
    cmd = ["copilot", "-p", prompt_text]
    # Add one '--allow-tool <tool>' pair per whitelisted tool
    # for tool in COPILOT_WHITELIST:
    #     cmd.extend(["--allow-tool", tool])

    cmd.extend(["--allow-all-tools"])
    return cmd


def copilot_generate(prompt_file, output_file, variables=None):
    """Invoke Copilot CLI to process a Markdown instruction file with variables."""
    # Read the prompt file and substitute variables
    with open(prompt_file, 'r') as f:
        prompt_content = f.read()
    
    # Replace variable placeholders with actual values
    if variables:
        for key, value in variables.items():
            prompt_content = prompt_content.replace(f"${{{key}}}", value)
    
    # Add HPCC Platform source directory context
    hpcc_context = f"""

## HPCC Platform Source Code Location

The HPCC Platform source code is located at: `{HPCC_SOURCE_DIR}`

**Important Paths:**
- ESP Service Implementations: `{os.path.join(HPCC_SOURCE_DIR, 'esp/services/ws_' + SERVICE_NAME)}`
- IDL Definitions: `{os.path.join(HPCC_SOURCE_DIR, 'esp/scm/ws_' + SERVICE_NAME + '.ecm')}`

**Access Note:** 
Since the HPCC Platform source may be outside the current workspace, you may need to:
1. Read files using their absolute paths
2. Search within the HPCC source directory structure explicitly
3. Use file_search or grep_search tools with the full path: `{HPCC_SOURCE_DIR}`

**Key Service Files to Review:**
- Server-side implementation: `{os.path.join(HPCC_SOURCE_DIR, 'esp/services/ws_' + SERVICE_NAME)}/`
- IDL definition: `{os.path.join(HPCC_SOURCE_DIR, 'esp/scm/ws_' + SERVICE_NAME + '.ecm')}`
"""
    
    # Create the prompt with file output directive and HPCC context
    full_prompt = f"""{prompt_content}{hpcc_context}

## Output Instructions

Please create the analysis file `{output_file}` in the current directory ({os.getcwd()}).

**Important**: Use the `create_file` tool or similar file creation capability to save the analysis output to: {output_file}

Make sure the file is created in: {os.path.abspath(output_file)}
"""
    
    print(f"\n🤖 Running Copilot with prompt for {output_file}...")
    print(f"📁 HPCC Platform source: {HPCC_SOURCE_DIR}")
    print(f"📂 Output directory: {os.getcwd()}")
    print(f"📄 Target file: {os.path.abspath(output_file)}")
    print("Note: This will run Copilot interactively. Please review the analysis and ensure it's saved to the correct file.")
    
    # Use subprocess with proper argument passing (build flags from whitelist)
    result = subprocess.run(build_copilot_cmd(full_prompt))
    
    # Check if the output file was created
    if not os.path.exists(output_file):
        print(f"\n⚠️  Warning: Expected output file {output_file} was not created.")
        print(f"Expected location: {os.path.abspath(output_file)}")
        print("\nCopilot may have encountered permission issues or the file may be in a different location.")
        print("Options:")
        print("  1. Press Enter if you created the file manually")
        print("  2. Press Ctrl+C to exit and fix the issue")
        input("\nPress Enter to continue once the file has been created...")
        
        # Check again after user confirmation
        if not os.path.exists(output_file):
            print(f"❌ Error: File {output_file} still not found at {os.path.abspath(output_file)}")
            print("Exiting. Please create the file manually and restart from this step.")
            sys.exit(1)
    
    print(f"✅ Analysis file {output_file} was created successfully!")


def copilot_fix(prompt, context_files):
    """Invoke Copilot to fix compilation or test issues."""
    # Add context files to the prompt
    context_content = ""
    for file in context_files:
        if os.path.exists(file):
            with open(file, 'r') as f:
                context_content += f"\n\n--- Content of {file} ---\n{f.read()}\n"
    
    # Add HPCC Platform source context
    hpcc_context = f"""

**HPCC Platform Source Location:**
The HPCC Platform source code is at: `{HPCC_SOURCE_DIR}`
- Server implementations: `{os.path.join(HPCC_SOURCE_DIR, 'esp/services')}`
- IDL definitions: `{os.path.join(HPCC_SOURCE_DIR, 'esp/scm')}`

If you need to reference server-side code, use these absolute paths.
"""
    
    full_prompt = f"{prompt}\n\nContext files:{context_content}{hpcc_context}"
    
    print(f"\n🤖 Running Copilot to fix issues...")
    
    # Use subprocess with proper argument passing (build flags from whitelist)
    result = subprocess.run(build_copilot_cmd(full_prompt))
    
    print("✅ Copilot fix completed!")


def run_maven_goal(goal):
    """Run a Maven goal and stream output."""
    cmd = f"mvn {goal} -B"
    run_cmd(cmd)


def find_test_results():
    """Collect test results from surefire reports."""
    results_dir = "target/surefire-reports"
    if not os.path.exists(results_dir):
        return ""
    results = []
    for file in os.listdir(results_dir):
        if file.endswith(".txt") or file.endswith(".xml"):
            with open(os.path.join(results_dir, file)) as f:
                results.append(f.read())
    return "\n".join(results)


def parse_test_failures():
    """Parse test results and extract detailed failure information."""
    results_dir = "target/surefire-reports"
    if not os.path.exists(results_dir):
        return []
    
    failures = []
    for file in os.listdir(results_dir):
        if file.endswith(".txt"):
            with open(os.path.join(results_dir, file)) as f:
                content = f.read()
                # Extract test failures - this is a simplified parser
                # In practice, you might want to parse XML for more structured data
                if "FAILURE!" in content or "ERROR!" in content:
                    failures.append({
                        "file": file,
                        "content": content
                    })
    return failures


def run_individual_test(test_class, test_name, hpcc_conn="http://eclwatch.default:8010", wssql_conn="http://sql2ecl.default:8510", hpcc_user="", hpcc_pass="", disable_dataset_generation=False):
    """
    Run an individual test method and return the result.
    
    Args:
        test_class: The test class name (e.g., "WsDFUClientTest")
        test_name: The test method name (e.g., "testGetFileDataColumns")
        hpcc_conn: HPCC connection URL
        wssql_conn: WsSQL connection URL
        hpcc_user: HPCC username for authentication
        hpcc_pass: HPCC password for authentication
        disable_dataset_generation: If True, skips dataset generation (for iterations after the first)
        
    Returns:
        dict with keys: test_name, passed, output, error_message
    """
    test_spec = f"{test_class}#{test_name}"
    cmd = [
        "mvn", "-B",
        "--activate-profiles", "jenkins-on-demand,remote-test",
        "-pl", "wsclient",
        f"-Dhpccconn={hpcc_conn}",
        f"-Dwssqlconn={wssql_conn}",
    ]
    
    # Add credentials if provided
    if hpcc_user:
        cmd.append(f"-Dhpccuser={hpcc_user}")
    if hpcc_pass:
        cmd.append(f"-Dhpccpass={hpcc_pass}")
    
    # Disable dataset generation for iterations after the first
    if disable_dataset_generation:
        cmd.append("-Ddisabledatasetgeneration=true")
    
    cmd.extend([
        f"-Dtest={test_spec}",
        "package"
    ])
    
    print(f"\n🧪 Running test: {test_name}")
    print(f"   Command: {' '.join(cmd)}")
    
    result = subprocess.run(cmd, capture_output=True, text=True)
    
    # Parse the output to determine success/failure
    passed = result.returncode == 0
    output = result.stdout + "\n" + result.stderr
    print(output)
    
    # Extract error message if test failed
    error_message = ""
    if not passed:
        # Try to extract meaningful error from output
        lines = output.split('\n')
        for i, line in enumerate(lines):
            if 'FAILURE!' in line or 'ERROR!' in line or 'AssertionError' in line:
                # Get some context around the error
                start = max(0, i - 2)
                end = min(len(lines), i + 10)
                error_message = '\n'.join(lines[start:end])
                break
        
        if not error_message:
            error_message = output[-2000:]  # Last 2000 chars if we can't find specific error
    
    return {
        "test_name": test_name,
        "passed": passed,
        "output": output,
        "error_message": error_message,
        "exit_code": result.returncode
    }


def load_test_metadata(metadata_file):
    """Load test metadata from JSON file."""
    if not os.path.exists(metadata_file):
        print(f"⚠️  Warning: Test metadata file {metadata_file} not found")
        return None
    
    with open(metadata_file, 'r') as f:
        return json.load(f)


def save_test_results(results, iteration):
    """Save test results to a JSON file."""
    results_file = f"{SERVICE_NAME}.{METHOD_NAME}TestResults_Iteration{iteration}.json"
    
    with open(results_file, 'w') as f:
        json.dump(results, f, indent=2)
    
    print(f"✅ Test results saved to: {results_file}")
    return results_file



def analyze_test_failure(test_name, failure_details, iteration):
    """
    Use Copilot to analyze a test failure and categorize it.
    Returns a dict with analysis results.
    """
    analysis_prompt = f"""
# Test Failure Analysis - Iteration {iteration}

## Test Information
**Test Name:** {test_name}
**Failure Details:**
```
{failure_details}
```

## Analysis Requirements

Please analyze this test failure and provide a comprehensive assessment:

### 1. Test Case Validity
Determine if the test case itself is valid:
- **VALID**: The test is correctly written and tests a legitimate scenario
- **INVALID**: The test has incorrect logic, wrong assertions, or tests an impossible scenario

### 2. Failure Classification (if test is VALID)
If the test is valid, classify where the issue occurs:
- **CLIENT-SIDE**: Issue in the Java client code (wrapper classes, request building, response parsing)
- **SERVER-SIDE**: Issue in the HPCC Platform ESP service implementation
- **TEST-ENVIRONMENT**: Issue with test setup, data, or configuration (not a code bug)

### 3. Root Cause Analysis
Provide a detailed root cause analysis:
- What is the specific error or failure?
- What is the expected behavior vs. actual behavior?
- What component is responsible for the failure?
- Are there any stack traces, error messages, or logs that provide clues?

### 4. Recommended Action
Based on the analysis, recommend ONE of the following:
- **FIX-TEST**: Test case is invalid and needs correction
- **CATEGORIZE-CLIENT**: Valid test, client-side issue, add @Category(UnverifiedClientIssues.class)
- **CATEGORIZE-SERVER**: Valid test, server-side issue, add @Category(UnverifiedServerIssues.class)
- **INVESTIGATE**: Needs more information or manual investigation

### 5. Proposed Solution (if applicable)
If FIX-TEST is recommended, provide the specific code changes needed.

## Output Format

Provide your analysis in the following JSON-compatible format:

```json
{{
  "test_name": "{test_name}",
  "iteration": {iteration},
  "validity": "VALID|INVALID",
  "classification": "CLIENT-SIDE|SERVER-SIDE|TEST-ENVIRONMENT|N/A",
  "root_cause": "Detailed explanation of the root cause",
  "recommended_action": "FIX-TEST|CATEGORIZE-CLIENT|CATEGORIZE-SERVER|INVESTIGATE",
  "proposed_solution": "Specific solution or code changes if FIX-TEST, otherwise explanation",
  "confidence": "HIGH|MEDIUM|LOW"
}}
```

Also save a detailed markdown analysis to: {FAILURE_ANALYSIS_FILE}
"""
    
    print(f"\n🔍 Analyzing failure for: {test_name}")
    
    # Use subprocess with proper argument passing
    result = subprocess.run(build_copilot_cmd(analysis_prompt))
    
    print(f"✅ Analysis completed for: {test_name}")
    
    # Read the analysis file if it was created
    if os.path.exists(FAILURE_ANALYSIS_FILE):
        with open(FAILURE_ANALYSIS_FILE, 'r') as f:
            analysis_content = f.read()
        return analysis_content
    else:
        print(f"⚠️  Warning: Analysis file not created, using default categorization")
        return None


def apply_test_categorization(test_name, category, test_file_path):
    """
    Apply a category annotation to a specific test method.
    """
    categorization_prompt = f"""
Please add the appropriate @Category annotation to the test method `{test_name}` in the test file.

**Category to apply:** {category}

**Instructions:**
1. Find the test method named `{test_name}` in {test_file_path}
2. Add the import statement if not already present:
   - For CLIENT issues: `import org.hpccsystems.commons.annotations.UnverifiedClientIssues;`
   - For SERVER issues: `import org.hpccsystems.commons.annotations.UnverifiedServerIssues;`
3. Add the annotation line:
   - For CLIENT issues: `@Category(UnverifiedClientIssues.class)`
   - For SERVER issues: `@Category(UnverifiedServerIssues.class)`
4. Place the annotation immediately before the @Test annotation

**Example:**
```java
@Category(UnverifiedClientIssues.class)
@Test
public void testMethodName() {{
    // test code
}}
```

Make sure to preserve all existing annotations and code structure.
"""
    
    print(f"\n🏷️  Categorizing test: {test_name} as {category}")
    
    # Use subprocess with proper argument passing
    result = subprocess.run(build_copilot_cmd(categorization_prompt))
    
    print(f"✅ Categorization applied to: {test_name}")


def fix_invalid_test(test_name, proposed_solution, test_file_path):
    """
    Fix an invalid test case based on the proposed solution.
    """
    fix_prompt = f"""
Please fix the invalid test case `{test_name}` in {test_file_path}.

**Proposed Solution:**
{proposed_solution}

**Instructions:**
1. Find the test method named `{test_name}`
2. Apply the proposed fixes carefully
3. Ensure the test logic is correct and assertions are valid
4. Maintain code style and formatting
5. Do not modify other tests

Make the necessary changes to fix this test.
"""
    
    print(f"\n🔧 Fixing invalid test: {test_name}")
    
    # Use subprocess with proper argument passing
    result = subprocess.run(build_copilot_cmd(fix_prompt))
    
    print(f"✅ Test fix applied to: {test_name}")


def generate_failure_summary(all_analyses, iteration):
    """
    Generate a comprehensive summary document of all test failures and their analyses.
    """
    summary_file = f"{SERVICE_NAME}.{METHOD_NAME}FailureSummary_Iteration{iteration}.md"
    
    summary_prompt = f"""
# Test Failure Summary - Iteration {iteration}

Please create a comprehensive summary document of all test failure analyses.

**Summary File:** {summary_file}

## Required Sections:

### 1. Executive Summary
- Total tests analyzed
- Tests fixed
- Tests categorized as client issues
- Tests categorized as server issues
- Tests requiring investigation

### 2. Detailed Analysis Results
For each test, include:
- Test name
- Validity assessment
- Classification
- Root cause
- Action taken

### 3. Client-Side Issues
List all tests categorized as client-side issues with:
- Brief description of each issue
- Affected component
- Potential fix location

### 4. Server-Side Issues
List all tests categorized as server-side issues with:
- Brief description of each issue
- Affected service/method
- Expected vs actual behavior

### 5. Fixed Tests
List all invalid tests that were corrected with:
- What was wrong
- How it was fixed

### 6. Recommendations
- Next steps for addressing client issues
- Next steps for addressing server issues
- Suggestions for improving test coverage

Please read the analysis file {FAILURE_ANALYSIS_FILE} and create this comprehensive summary in {summary_file}.
"""
    
    print(f"\n📊 Generating failure summary for iteration {iteration}...")
    
    # Use subprocess with proper argument passing
    result = subprocess.run(build_copilot_cmd(summary_prompt))
    
    if os.path.exists(summary_file):
        print(f"✅ Summary generated: {summary_file}")
    else:
        print(f"⚠️  Warning: Summary file not created")


def compare_results(expected, actual):
    """Compare expected vs actual test outcomes."""
    return expected.strip() == actual.strip()


# === Step 1: Generate Method Analysis ===
if START_FROM_STEP <= 1:
    if SKIP_ANALYSIS and os.path.exists(ANALYSIS_FILE):
        print(f"⏭️  Skipping Step 1: Analysis file {ANALYSIS_FILE} already exists")
    else:
        print("🔍 Step 1: Analyzing method using Copilot CLI...")
        copilot_generate(PROMPT_FILE, ANALYSIS_FILE, {"ServiceName": SERVICE_NAME, "MethodName": METHOD_NAME})
else:
    print(f"⏭️  Skipping Step 1: Starting from Step {START_FROM_STEP}")

# === Step 2: Implement Tests from Analysis ===
if START_FROM_STEP <= 2:
    print("🧪 Step 2: Generating tests from analysis...")

    # Check if analysis file exists before proceeding
    if not os.path.exists(ANALYSIS_FILE):
        print(f"❌ Error: Analysis file {ANALYSIS_FILE} was not created in Step 1.")
        print("Please create the analysis file manually and re-run from Step 2, or restart the script.")
        sys.exit(1)

    with open(ANALYSIS_FILE) as f:
        analysis_content = f.read()

    TEST_METADATA_FILE = f"{SERVICE_NAME}.{METHOD_NAME}TestMetadata.json"
    
    test_generation_prompt = (
        f"Read {ANALYSIS_FILE} and implement the recommended test cases "
        f"for {SERVICE_NAME}.{METHOD_NAME}. Create {EXPECTED_RESULTS_FILE} "
        f"with the expected results for each test.\n\n"
        f"Additionally, create a JSON file named {TEST_METADATA_FILE} with the following structure:\n"
        f"{{\n"
        f'  "service": "{SERVICE_NAME}",\n'
        f'  "method": "{METHOD_NAME}",\n'
        f'  "testClass": "{SERVICE_NAME}ClientTest",\n'
        f'  "tests": [\n'
        f'    {{\n'
        f'      "testName": "testMethodName",\n'
        f'      "description": "Brief description of what this test validates",\n'
        f'      "category": "basic|edge-case|error-handling|integration",\n'
        f'      "expectedOutcome": "PASS|SKIP",\n'
        f'      "requiresData": true|false,\n'
        f'      "notes": "Any special considerations or requirements"\n'
        f'    }}\n'
        f'  ]\n'
        f'}}\n\n'
        f"List ALL test methods you create in this JSON file. This metadata will be used to:\n"
        f"1. Run each test individually using: mvn -B --activate-profiles jenkins-on-demand,remote-test "
        f"-Dhpccconn=http://eclwatch.default:8010 -Dwssqlconn=http://sql2ecl.default:8510 "
        f"-Dtest={SERVICE_NAME}ClientTest#<testName> package\n"
        f"2. Track test results and categorize failures\n"
        f"3. Generate comprehensive test reports\n\n"
        f"Ensure the testName values exactly match the method names in the test class."
    )
    copilot_fix(test_generation_prompt, [ANALYSIS_FILE])
    
    # Verify the metadata file was created
    if not os.path.exists(TEST_METADATA_FILE):
        print(f"⚠️  Warning: Test metadata file {TEST_METADATA_FILE} was not created.")
        print(f"Creating a basic template...")
        template = {
            "service": SERVICE_NAME,
            "method": METHOD_NAME,
            "testClass": f"{SERVICE_NAME}ClientTest",
            "tests": []
        }
        with open(TEST_METADATA_FILE, 'w') as f:
            json.dump(template, f, indent=2)
        print(f"✅ Created template file: {TEST_METADATA_FILE}")
        print(f"⚠️  Please populate it with test information before proceeding to Step 4")
else:
    print(f"⏭️  Skipping Step 2: Starting from Step {START_FROM_STEP}")
    TEST_METADATA_FILE = f"{SERVICE_NAME}.{METHOD_NAME}TestMetadata.json"

# === Step 3: Build Project and Fix Compilation Issues ===
if START_FROM_STEP <= 3:
    print("🏗️ Step 3: Building Java project with Maven...")
    while True:
        result = subprocess.run(["mvn", "package", "-B"], capture_output=True, text=True)
        if result.returncode == 0:
            print("✅ Build succeeded!")
            break
        else:
            print("⚠️ Build failed — attempting to fix test files only...")
            error_text = result.stderr[:8000]  # limit for context
            copilot_fix("Fix compilation errors ONLY in the test files", [ANALYSIS_FILE, EXPECTED_RESULTS_FILE])
            print("🔁 Retrying build...")
else:
    print(f"⏭️  Skipping Step 3: Starting from Step {START_FROM_STEP}")

# === Step 4: Run Tests with Iterative Failure Analysis ===
if START_FROM_STEP <= 4:
    print("🚀 Step 4: Running tests with comprehensive failure analysis...")
    print(f"📋 Maximum iterations: {MAX_TEST_FIX_ITERATIONS}")

    # Load test metadata
    TEST_METADATA_FILE = f"{SERVICE_NAME}.{METHOD_NAME}TestMetadata.json"
    test_metadata = load_test_metadata(TEST_METADATA_FILE)
    
    if not test_metadata:
        print(f"❌ Error: Cannot proceed without test metadata file: {TEST_METADATA_FILE}")
        print(f"Please ensure Step 2 completed successfully and created this file.")
        sys.exit(1)
    
    test_class = test_metadata.get("testClass", f"{SERVICE_NAME}ClientTest")
    tests_to_run = test_metadata.get("tests", [])
    
    if not tests_to_run:
        print(f"⚠️  Warning: No tests found in metadata file. Falling back to running all tests in class.")
        # Fallback: try to discover tests from the test class
        test_file_matches = glob.glob(TEST_FILE_GLOB, recursive=True)
        if test_file_matches:
            test_file_path = test_file_matches[0]
            print(f"✅ Found test file: {test_file_path}")
        else:
            print(f"❌ Error: Cannot find test file matching {TEST_FILE_GLOB}")
            sys.exit(1)
    else:
        print(f"✅ Found {len(tests_to_run)} tests to run")
        # Find the test file path
        test_file_matches = glob.glob(TEST_FILE_GLOB, recursive=True)
        if not test_file_matches:
            print(f"⚠️  Warning: Could not find test file matching {TEST_FILE_GLOB}")
            test_file_path = f"wsclient/src/test/java/org/hpccsystems/ws/client/{SERVICE_NAME}ClientTest.java"
            print(f"Using default path: {test_file_path}")
        else:
            test_file_path = test_file_matches[0]
            print(f"✅ Found test file: {test_file_path}")

    iteration = 0
    all_analyses = []

    # Get HPCC connection settings from command-line args, environment, or use defaults
    hpcc_conn = args.HPCC_CONN or os.environ.get("HPCCCONN", "http://eclwatch.default:8010")
    wssql_conn = args.WSSQL_CONN or os.environ.get("WSSQLCONN", "http://sql2ecl.default:8510")
    hpcc_user = args.HPCC_USER or os.environ.get("HPCCUSER", "")
    hpcc_pass = args.HPCC_PASS or os.environ.get("HPCCPASS", "")
    
    print(f"\n🔗 Using HPCC connection: {hpcc_conn}")
    print(f"🔗 Using WsSQL connection: {wssql_conn}")
    if hpcc_user:
        print(f"🔐 Using HPCC username: {hpcc_user}")
        print(f"🔐 Using HPCC password: {'*' * len(hpcc_pass)}")
    else:
        print(f"🔓 No authentication credentials provided")

    # Track which tests to run (starts with all tests, then only failures)
    tests_to_execute = tests_to_run.copy()

    while iteration < MAX_TEST_FIX_ITERATIONS:
        iteration += 1
        print(f"\n{'='*60}")
        print(f"🔄 ITERATION {iteration}/{MAX_TEST_FIX_ITERATIONS}")
        print(f"{'='*60}")
    
        # Only generate datasets on the first iteration
        disable_dataset_generation = (iteration > 1)
        if disable_dataset_generation:
            print(f"🚫 Dataset generation DISABLED for iteration {iteration} (only runs on iteration 1)")
        else:
            print(f"✅ Dataset generation ENABLED for iteration {iteration}")
        
        # Run tests
        print(f"\n🧪 Running {len(tests_to_execute)} test(s) individually...")
        test_results = []
        
        for test_info in tests_to_execute:
            test_name = test_info.get("testName")
            if not test_name:
                print(f"⚠️  Skipping test with missing testName: {test_info}")
                continue
            
            # Run the individual test
            result = run_individual_test(test_class, test_name, hpcc_conn, wssql_conn, hpcc_user, hpcc_pass, disable_dataset_generation)
            test_results.append({
                "metadata": test_info,
                "result": result
            })
            
            # Print immediate result
            if result["passed"]:
                print(f"   ✅ {test_name} - PASSED")
            else:
                print(f"   ❌ {test_name} - FAILED")
        
        # Save test results
        results_file = save_test_results(test_results, iteration)
        
        # Collect failures
        failures = [tr for tr in test_results if not tr["result"]["passed"]]
    
        if not failures:
            print("\n🎉 All tests passed!")
            break
    
        print(f"\n⚠️  Found {len(failures)} test failure(s)")
        
        # Calculate statistics
        passed_count = len([tr for tr in test_results if tr["result"]["passed"]])
        failed_count = len(failures)
        
        print(f"\n📊 Iteration {iteration} Results:")
        print(f"   Total Tests Run: {len(test_results)}")
        print(f"   Passed: {passed_count}")
        print(f"   Failed: {failed_count}")
    
        # Build comprehensive failure report for batch analysis
        print(f"\n📝 Preparing comprehensive failure report...")
        
        failure_report = f"""
# Test Failure Report - Iteration {iteration}
# Service: {SERVICE_NAME}, Method: {METHOD_NAME}

## Summary
- Total tests run: {len(test_results)}
- Tests passed: {passed_count}
- Tests failed: {failed_count}
- Test results file: {results_file}
- Test file: {test_file_path}

## Failed Tests Details

"""
        
        for idx, failure_data in enumerate(failures, 1):
            test_name = failure_data["result"]["test_name"]
            test_metadata_info = failure_data["metadata"]
            failure_content = failure_data["result"]["error_message"]
            full_output = failure_data["result"]["output"]
            
            failure_report += f"""
### {idx}. {test_name}

**Test Metadata:**
- Category: {test_metadata_info.get('category', 'unknown')}
- Description: {test_metadata_info.get('description', 'N/A')}
- Expected Outcome: {test_metadata_info.get('expectedOutcome', 'PASS')}
- Requires Data: {test_metadata_info.get('requiresData', False)}
- Required Dataset: {test_metadata_info.get('requiredDataset', 'N/A')}
- Notes: {test_metadata_info.get('notes', 'N/A')}

**Exit Code:** {failure_data["result"]["exit_code"]}

**Error Message:**
```
{failure_content}
```

**Full Output (last 2000 chars):**
```
{full_output[-2000:]}
```

---

"""
        
        # Save the comprehensive failure report
        failure_report_file = f"{SERVICE_NAME}.{METHOD_NAME}FailureReport_Iteration{iteration}.md"
        with open(failure_report_file, 'w') as f:
            f.write(failure_report)
        
        print(f"✅ Failure report saved: {failure_report_file}")
        
        # Now analyze ALL failures at once with Copilot
        print(f"\n🤖 Analyzing all {len(failures)} failure(s) with Copilot...")
        
        batch_analysis_prompt = f"""
# Batch Test Failure Analysis - Iteration {iteration}

Please analyze all test failures in {failure_report_file} and determine the appropriate actions.

## Your Task

Review each failed test and categorize them into:

1. **INVALID_TEST**: Test case has incorrect logic, wrong assertions, or tests impossible scenarios
   - These should be FIXED
   
2. **CLIENT_ISSUE**: Valid test that exposes a bug in the Java client wrapper code
   - These should be marked with @Category(UnverifiedClientIssues.class)
   
3. **SERVER_ISSUE**: Valid test that exposes a bug in the HPCC Platform ESP service
   - These should be marked with @Category(UnverifiedServerIssues.class)
   
4. **DATA_ISSUE**: Valid test but required dataset doesn't exist or has wrong data
   - These should be marked with @Category annotation or skipped with @Ignore
   
5. **INVESTIGATE**: Unclear classification that needs manual review

## Required Actions

For each test, you must:

1. **If INVALID_TEST**: Fix the test code in {test_file_path}
   - Correct assertions
   - Fix test logic
   - Update test setup
   - Make the test valid

2. **If CLIENT_ISSUE**: Add categorization annotation to {test_file_path}
   - Add import: `import org.hpccsystems.commons.annotations.UnverifiedClientIssues;`
   - Add annotation: `@Category(UnverifiedClientIssues.class)` before @Test
   - Keep test unchanged otherwise

3. **If SERVER_ISSUE**: Add categorization annotation to {test_file_path}
   - Add import: `import org.hpccsystems.commons.annotations.UnverifiedServerIssues;`
   - Add annotation: `@Category(UnverifiedServerIssues.class)` before @Test
   - Keep test unchanged otherwise

4. **If DATA_ISSUE**: 
   - If dataset is expected to exist but missing: mark as CLIENT_ISSUE or SERVER_ISSUE as appropriate
   - If dataset creation is pending (notes indicate SKIP): leave as-is for now
   
5. **If INVESTIGATE**: Add comment to test explaining why manual review is needed

## Analysis Output

After analyzing all failures, create a summary file: {SERVICE_NAME}.{METHOD_NAME}BatchAnalysis_Iteration{iteration}.md

Structure:
```markdown
# Batch Analysis Summary - Iteration {iteration}

## Tests to Fix (INVALID_TEST)
- testName1: reason why invalid, what to fix
- testName2: reason why invalid, what to fix

## Tests to Categorize as Client Issues
- testName3: brief explanation of client bug
- testName4: brief explanation of client bug

## Tests to Categorize as Server Issues  
- testName5: brief explanation of server bug
- testName6: brief explanation of server bug

## Tests Requiring Investigation
- testName7: why unclear

## Actions Taken
- Fixed X invalid tests
- Categorized Y as client issues
- Categorized Z as server issues
```

**IMPORTANT**: Make ALL necessary changes to {test_file_path} NOW. Don't just create the analysis file - actually modify the test code.

After making changes:
1. Save the analysis summary
2. Ensure all test fixes and categorizations are applied
3. The next iteration will re-run the failed tests to verify fixes

Test file location: {test_file_path}
Failure report: {failure_report_file}
Test results: {results_file}
"""
        
        # Run Copilot for batch analysis and fixes
        print(f"\n🔧 Running Copilot to analyze and fix all failures...")
        subprocess.run(build_copilot_cmd(batch_analysis_prompt))
        
        # Check if analysis file was created
        analysis_summary_file = f"{SERVICE_NAME}.{METHOD_NAME}BatchAnalysis_Iteration{iteration}.md"
        if os.path.exists(analysis_summary_file):
            print(f"✅ Analysis summary created: {analysis_summary_file}")
            with open(analysis_summary_file, 'r') as f:
                analysis_content = f.read()
            print(f"\n📋 Analysis Summary:\n{analysis_content[:500]}...")
        else:
            print(f"⚠️  Warning: Analysis summary not created at {analysis_summary_file}")
        
        # Prepare to re-run only the failed tests in next iteration
        tests_to_execute = failures
        
        print(f"\n🔁 Next iteration will re-run {len(failures)} failed test(s)")
        
                # Give user a chance to review before continuing
        print(f"\n⏸️  Iteration {iteration} complete. Copilot should have made fixes.")
        print(f"   - Review {analysis_summary_file} for details")
        print(f"   - Check {test_file_path} for changes")
        print(f"   - Failed tests will be re-run in next iteration")

    # Final summary
    print(f"\n{'='*60}")
    print("📋 FINAL SUMMARY")
    print(f"{'='*60}")
    print(f"Total iterations: {iteration}")
    
    # Count final results
    final_passed = 0
    final_failed = 0
    if test_results:
        final_passed = len([tr for tr in test_results if tr["result"]["passed"]])
        final_failed = len([tr for tr in test_results if not tr["result"]["passed"]])
        print(f"Final Results: {final_passed} passed, {final_failed} failed out of {len(test_results)} tests")
    else:
        print("No test results available")

    # Generate final comprehensive report
    final_report_prompt = f"""
Create a final comprehensive test report for {SERVICE_NAME}.{METHOD_NAME} that includes:

1. **Test Execution Summary**
   - Total iterations: {iteration}
   - Total test failures analyzed: {len(all_analyses)}
   - Final test status: {final_passed} passed, {final_failed} failed
   - Test metadata file: {TEST_METADATA_FILE}
   - Latest results file: {results_file if 'results_file' in locals() else 'N/A'}

2. **Issue Categories**
   - List all tests with @Category(UnverifiedClientIssues.class)
   - List all tests with @Category(UnverifiedServerIssues.class)
   - List all fixed tests

3. **Detailed Findings**
   - Client-side issues discovered
   - Server-side issues discovered
   - Test case problems corrected

4. **Individual Test Results**
   For each test, include:
   - Test name and category
   - Pass/Fail status
   - Description and expected outcome
   - Any issues or notes

5. **Recommendations**
   - Priority items for client-side fixes
   - Priority items for server-side fixes
   - Test coverage improvements

6. **Next Steps**
   - Actions required before merging
   - Items requiring manual investigation
   - Follow-up work needed

Review all test result files (*TestResults_Iteration*.json) and analysis files to compile this report.

Save this report to: {SERVICE_NAME}.{METHOD_NAME}FinalReport.md
"""

    print("\n📝 Generating final comprehensive report...")
    subprocess.run(build_copilot_cmd(final_report_prompt))

    if os.path.exists(f"{SERVICE_NAME}.{METHOD_NAME}FinalReport.md"):
        print(f"✅ Final report created: {SERVICE_NAME}.{METHOD_NAME}FinalReport.md")
    else:
        print(f"⚠️  Final report not created")

    print("\n🎉 Test analysis and categorization complete!")
    print(f"\n📁 Generated Files:")
    print(f"   - {ANALYSIS_FILE}")
    print(f"   - {EXPECTED_RESULTS_FILE}")
    print(f"   - {TEST_METADATA_FILE}")
    print(f"   - {FAILURE_ANALYSIS_FILE}")
    print(f"   - {SERVICE_NAME}.{METHOD_NAME}FinalReport.md")
    print(f"   - {SERVICE_NAME}.{METHOD_NAME}FailureSummary_Iteration*.md")
    print(f"   - {SERVICE_NAME}.{METHOD_NAME}TestResults_Iteration*.json")
else:
    print(f"⏭️  Skipping Step 4: Not requested")

print("\n✅ Process complete!")
