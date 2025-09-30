# GitHub Actions Workflows

This directory contains GitHub Actions workflows for the HPCC4J project.

## WSDL Validation Workflow

### Overview
The `wsdl-validation.yml` workflow automatically validates WSDL changes in pull requests to ensure consistency and prevent build breaks.

### Triggers
- **Pull Request Events**: `opened`, `reopened`, `synchronize`
- **Path Filter**: Only triggers when files in `wsclient/src/main/resources/WSDLs/` are modified

### What It Does

1. **WSDL Versioning Validation**
   - Checks if unversioned WSDL files (e.g., `WsDFU.wsdl`) have been changed
   - Ensures that corresponding versioned WSDL files (e.g., `WsDFU-165.wsdl`) are also included in the PR
   - Prevents incomplete WSDL updates that could break version compatibility

2. **Stub Generation Testing**
   - Identifies affected services based on changed WSDL files
   - Tests individual service stub generation using Maven profiles (e.g., `mvn -P generate-wsdfu-stub process-resources`)
   - Tests the comprehensive stub generation using `mvn -P generate-wsclient-stub process-resources`
   - Verifies that stub files are created in the expected locations: `wsclient/src/main/java/org/hpccsystems/ws/client/gen/axis2/*/latest`

3. **Wrapper Generation Testing**
   - Tests the `Axis2ADBStubWrapperMaker` utility for affected services
   - Ensures wrapper files are generated correctly in `wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen`

4. **Build Integration**
   - Verifies that the project builds successfully after stub and wrapper generation
   - Ensures no compilation errors are introduced

### Service Mapping
The workflow automatically maps WSDL files to their corresponding service names:

| WSDL File | Service Name | Maven Profile |
|-----------|--------------|---------------|
| FileSpray.wsdl | filespray | generate-filespray-stub |
| WsAttributes.wsdl | wsattributes | generate-wsattributes-stub |
| WsCloud.wsdl | wscloud | generate-wscloud-stub |
| WsDFU.wsdl | wsdfu | generate-wsdfu-stub |
| WsDFUXRef.wsdl | wsdfuxref | generate-wsdfuxref-stub |
| WsFileIO.wsdl | wsfileio | generate-wsfileio-stub |
| WsPackageProcess.wsdl | wspackageprocess | generate-wspackageprocess-stub |
| WsResources.wsdl | wsresources | generate-wsresources-stub |
| WsSMC.wsdl | wssmc | generate-wssmc-stub |
| WsSQL.wsdl | wssql | generate-wssql-stub |
| WsStore.wsdl | wsstore | generate-wsstore-stub |
| WsTopology.wsdl | wstopology | generate-wstopology-stub |
| WsWorkunits.wsdl | wsworkunits | generate-wsworkunits-stub |
| Ws_codesign.wsdl | wscodesign | generate-wscodesign-stub |

### Expected Behavior
- ✅ **Pass**: When versioned WSDLs are provided for unversioned WSDL changes
- ✅ **Pass**: When only versioned WSDLs are changed
- ✅ **Pass**: When stub and wrapper generation succeeds for all affected services
- ❌ **Fail**: When unversioned WSDLs are changed without corresponding versioned WSDLs
- ❌ **Fail**: When stub generation fails for any affected service
- ❌ **Fail**: When wrapper generation fails for any affected service
- ❌ **Fail**: When the project fails to build after stub/wrapper generation

### Manual Testing
To manually test the components locally:

```bash
# Test individual service stub generation
cd wsclient
mvn -P generate-wsdfu-stub process-resources

# Test comprehensive stub generation
mvn -P generate-wsclient-stub process-resources

# Test wrapper generation
mvn compile
mvn dependency:build-classpath -Dmdep.outputFile=/tmp/cp.txt
CLASSPATH=$(cat /tmp/cp.txt):target/classes
java -classpath $CLASSPATH org.hpccsystems.ws.client.utils.Axis2ADBStubWrapperMaker \
  outputpackage=org.hpccsystems.ws.client.wrappers.gen \
  targetpackage=org.hpccsystems.ws.client.gen.axis2.wsdfu.latest \
  servicename=WsDFU \
  outputdir=src/main/java
```

### Troubleshooting
- **Missing versioned WSDL**: Add a versioned WSDL file matching the pattern `ServiceName-VERSION.wsdl`
- **Stub generation failure**: Check that the WSDL file is valid and accessible
- **Wrapper generation failure**: Ensure the stub files exist and are properly generated
- **Build failure**: Check for compilation errors in generated code