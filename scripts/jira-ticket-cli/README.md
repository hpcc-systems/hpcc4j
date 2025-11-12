# HPCC4J Scripts

This directory contains utility scripts for HPCC4J development and maintenance.

## JIRA Ticket Creation Scripts

### create-jira-ticket.ps1 (PowerShell)

A comprehensive PowerShell script for creating JIRA tickets using Atlassian CLI (acli).

**Usage:**
```powershell
.\create-jira-ticket.ps1 -Summary "Brief description" [-Description "Detailed description"] [-IssueType Task] [-Priority Medium] [-Component "component-name"] [-FixVersion "10.0.4"] [-Labels "label1,label2"] [-DryRun]
```

**Examples:**
```powershell
# Create a task for GitHub Actions workflow
.\create-jira-ticket.ps1 -Summary "Add baremetal known server issues workflow" -Description "Create GitHub Actions workflow for testing known server-side issues in baremetal environment" -IssueType Task -Component "Build/CI"

# Create a bug report with high priority
.\create-jira-ticket.ps1 -Summary "Fix connection timeout in spark connector" -IssueType Bug -Component spark-hpcc -Priority High -FixVersion "10.0.4"

# Dry run to see what would be created
.\create-jira-ticket.ps1 -Summary "Test ticket" -DryRun
```

### create-jira-ticket.sh (Bash)

A simpler bash script for cross-platform compatibility.

**Usage:**
```bash
./create-jira-ticket.sh "Summary" ["Description"] [IssueType] [Priority] [Component]
```

**Examples:**
```bash
# Create a task
./create-jira-ticket.sh "Add baremetal workflow" "Create GitHub Actions workflow" Task Medium "Build/CI"

# Create a bug report
./create-jira-ticket.sh "Fix timeout issue" "" Bug High spark-hpcc
```

## Prerequisites

Both scripts require the [Atlassian CLI (acli)](https://developer.atlassian.com/cloud/acli/) to be installed and configured:

1. **Install Atlassian CLI:**
    Download from: https://developer.atlassian.com/cloud/acli/guides/install-acli/

2. **Configure Atlassian CLI:**
    ```bash
    acli jira auth login
    ```

    Follow the prompts to configure your JIRA Cloud instance and authentication.

3. **Optional - Install jq (recommended for bash script):**
    The bash script can use `jq` for better JSON parsing. If not available, it falls back to basic text parsing.
    ```bash
    # Ubuntu/Debian
    sudo apt-get install jq
    
    # macOS
    brew install jq
    
    # Windows (via chocolatey)
    choco install jq
    ```

## Script Features

- **Validation**: Checks for Atlassian CLI installation and configuration
- **Duplicate detection**: Searches for similar tickets before creation to prevent duplicates
- **Interactive confirmation**: Asks for confirmation before creating tickets
- **Ticket URL generation**: Provides direct links to created tickets
- **Next steps guidance**: Suggests branch naming and commit message format
- **Error handling**: Provides clear error messages for common issues

**Note**: Due to Atlassian CLI limitations, some fields like priority, component, and fix version cannot be set during ticket creation and will need to be set manually in JIRA after creation.

### Duplicate Detection

Both scripts include intelligent duplicate detection that:

1. **Searches existing tickets**: Uses JQL to search for tickets with similar summaries in the HPCC4J project
2. **Shows matches**: Displays found tickets with their key, summary, and status
3. **Provides choice**: Asks if you want to proceed when similar tickets are found
4. **Graceful fallback**: If search fails, continues with ticket creation

The duplicate detection helps maintain a clean ticket backlog by preventing unintentional duplicate tickets.

## HPCC4J Project Conventions

The scripts follow HPCC4J project conventions:

- **Project Key**: HPCC4J
- **Ticket Format**: HPCC4J-XXX
- **Branch Naming**: `HPCC4J-XXX-descriptive-name`
- **Commit Messages**: Start with `HPCC4J-XXX` followed by description

## Components

Common component values for HPCC4J:
- `commons-hpcc` - Common utilities and base classes
- `wsclient` - Web service client libraries
- `dfsclient` - Distributed file system client
- `spark-hpcc` - Spark connector for HPCC
- `clienttools` - Java interface to HPCC client tools
- `rdf2hpcc` - RDF data ingestion tool
- `Build/CI` - Build system and CI/CD related

## Issue Types

- **Bug** - Something isn't working correctly
- **Task** - General development task
- **Story** - User story or feature request
- **Improvement** - Enhancement to existing functionality
- **Epic** - Large feature or initiative

## Priorities

- **Highest** - Critical, blocks development
- **High** - Important, should be addressed soon
- **Medium** - Normal priority (default)
- **Low** - Nice to have
- **Lowest** - Minor, can be deferred
