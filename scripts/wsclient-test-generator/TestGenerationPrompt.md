Read ${ANALYSIS_FILE} and implement the recommended test cases 
for ${SERVICE_NAME}.${METHOD_NAME}. Create ${EXPECTED_RESULTS_FILE} 
with the expected results for each test.

Additionally, create a JSON file named ${TEST_METADATA_FILE} with the following structure:
{
  "service": "${SERVICE_NAME}",
  "method": "${METHOD_NAME}",
  "testClass": "${SERVICE_NAME}ClientTest",
  "tests": [
    {
      "testName": "testMethodName",
      "description": "Brief description of what this test validates",
      "category": "basic|edge-case|error-handling|integration",
      "expectedOutcome": "PASS|SKIP",
      "requiresData": true|false,
      "notes": "Any special considerations or requirements"
    }
  ]
}

List ALL test methods you create in this JSON file. This metadata will be used to:
1. Run each test individually using: mvn -B --activate-profiles jenkins-on-demand,remote-test 
   -Dhpccconn=http://eclwatch.default:8010 -Dwssqlconn=http://sql2ecl.default:8510 
   -Dtest=${SERVICE_NAME}ClientTest#<testName> test
2. Track test results and categorize failures
3. Generate comprehensive test reports

Ensure the testName values exactly match the method names in the test class.
