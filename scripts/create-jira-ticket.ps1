#!/usr/bin/env pwsh
<#
.SYNOPSIS
    Create a new JIRA ticket for HPCC4J project using JIRA CLI

.DESCRIPTION
    This script creates a new JIRA ticket in the HPCC4J project with proper formatting
    and follows the project's conventions for ticket creation.

.PARAMETER Summary
    Brief summary/title of the JIRA ticket (required)

.PARAMETER Description
    Detailed description of the issue or feature request

.PARAMETER IssueType
    Type of issue: Bug, Task, Story, Improvement (default: Task)

.PARAMETER Priority
    Priority level: Highest, High, Medium, Low, Lowest (default: Medium)

.PARAMETER Component
    Component affected: commons-hpcc, wsclient, dfsclient, spark-hpcc, clienttools, rdf2hpcc

.PARAMETER FixVersion
    Target fix version (e.g., 10.0.4, 10.2.0)

.PARAMETER Labels
    Comma-separated list of labels to add to the ticket

.PARAMETER DryRun
    Show what would be created without actually creating the ticket

.EXAMPLE
    .\create-jira-ticket.ps1 -Summary "Add baremetal known server issues workflow" -Description "Create GitHub Actions workflow for testing known server-side issues in baremetal environment" -IssueType Task -Component "Build/CI"

.EXAMPLE
    .\create-jira-ticket.ps1 -Summary "Fix connection timeout in spark connector" -IssueType Bug -Component spark-hpcc -Priority High -FixVersion "10.0.4"

#>

param(
    [Parameter(Mandatory=$true)]
    [string]$Summary,

    [Parameter(Mandatory=$false)]
    [string]$Description = "",

    [Parameter(Mandatory=$false)]
    [ValidateSet("Bug", "Task", "Story", "Improvement", "Epic")]
    [string]$IssueType = "Task",

    [Parameter(Mandatory=$false)]
    [ValidateSet("Highest", "High", "Medium", "Low", "Lowest")]
    [string]$Priority = "Medium",

    [Parameter(Mandatory=$false)]
    [string]$Component = "",

    [Parameter(Mandatory=$false)]
    [string]$FixVersion = "",

    [Parameter(Mandatory=$false)]
    [string]$Labels = "",

    [Parameter(Mandatory=$false)]
    [switch]$DryRun
)

# Function to search for similar tickets
function Search-SimilarTickets {
    param(
        [string]$SearchTerm,
        [string]$ProjectKey
    )

    try {
        Write-Host "Searching for similar tickets..." -ForegroundColor Yellow

        # Properly escape and quote the search term to prevent JQL injection
        # Replace double quotes with escaped quotes and wrap in double quotes for literal string
        $EscapedSearchTerm = $SearchTerm -replace '"', '\\"'
        # Search for tickets with similar summary in the project using quoted literal
        $SearchResult = acli jira workitem search --jql "summary ~ \`"$EscapedSearchTerm\`" AND project = '$ProjectKey'" --json 2>$null

        if ($LASTEXITCODE -eq 0 -and $SearchResult) {
            $Issues = $SearchResult | ConvertFrom-Json

            if ($Issues.workItems -and $Issues.workItems.Count -gt 0) {
                Write-Host "Found $($Issues.workItems.Count) similar ticket(s):" -ForegroundColor Yellow

                foreach ($Issue in $Issues.workItems) {
                    $Status = if ($Issue.status) { $Issue.status.name } else { "Unknown" }
                    Write-Host "  - $($Issue.key): $($Issue.summary) (Status: $Status)" -ForegroundColor Cyan
                    Write-Host "    URL: https://hpccsystems.atlassian.net/browse/$($Issue.key)" -ForegroundColor Gray
                }

                Write-Host ""
                $Continue = Read-Host "Similar tickets found. Do you still want to create a new ticket? (y/N)"
                return ($Continue -eq "y" -or $Continue -eq "Y")
            }
        }

        Write-Host "No similar tickets found." -ForegroundColor Green
        return $true

    } catch {
        Write-Warning "Could not search for similar tickets: $_"
        Write-Host "Proceeding with ticket creation..." -ForegroundColor Yellow
        return $true
    }
}

# Check if acli (Atlassian CLI) is installed
if (-not (Get-Command "acli" -ErrorAction SilentlyContinue)) {
    Write-Error "Atlassian CLI (acli) is not installed. Please install it first:"
    Write-Host "  Download from: https://developer.atlassian.com/cloud/acli/"
    exit 1
}

# Validate Atlassian CLI is configured
try {
    $status = acli jira auth status 2>$null
    if ($LASTEXITCODE -ne 0) {
        throw "Not authenticated"
    }
} catch {
    Write-Error "Atlassian CLI is not configured. Please run 'acli jira auth login' first to set up your credentials."
    exit 1
}

# Project key for HPCC4J
$ProjectKey = "HPCC4J"

# Build the acli jira workitem create command
$CreateArgs = @(
    "jira", "workitem", "create",
    "--project", $ProjectKey,
    "--summary", $Summary,
    "--type", $IssueType
)

# Add description if provided
if ($Description) {
    $CreateArgs += @("--description", $Description)
}

# Add labels if provided (acli supports --label with comma-separated values)
if ($Labels) {
    $CreateArgs += @("--label", $Labels)
}

# Note: acli doesn't support priority, component, or fix-version in create command
# These would need to be set after creation using edit command

# Show what would be created
Write-Host "Creating JIRA ticket with the following details:" -ForegroundColor Green
Write-Host "  Project: $ProjectKey" -ForegroundColor Yellow
Write-Host "  Summary: $Summary" -ForegroundColor Yellow
Write-Host "  Type: $IssueType" -ForegroundColor Yellow
Write-Host "  Priority: $Priority" -ForegroundColor Yellow

if ($Description) {
    Write-Host "  Description: $Description" -ForegroundColor Yellow
}
if ($Component) {
    Write-Host "  Component: $Component (will need to be set manually)" -ForegroundColor Yellow
}
if ($FixVersion) {
    Write-Host "  Fix Version: $FixVersion (will need to be set manually)" -ForegroundColor Yellow
}
if ($Labels) {
    Write-Host "  Labels: $Labels" -ForegroundColor Yellow
}

Write-Host ""

# Search for similar tickets before creating
if (-not $DryRun) {
    $ShouldContinue = Search-SimilarTickets -SearchTerm $Summary -ProjectKey $ProjectKey
    if (-not $ShouldContinue) {
        Write-Host "Ticket creation cancelled due to similar tickets." -ForegroundColor Yellow
        exit 0
    }
}

if ($DryRun) {
    Write-Host "DRY RUN: Would execute:" -ForegroundColor Cyan
    Write-Host "acli $($CreateArgs -join ' ')" -ForegroundColor Cyan
    exit 0
}

# Confirm before creating
$Confirmation = Read-Host "Do you want to create this JIRA ticket? (y/N)"
if ($Confirmation -ne "y" -and $Confirmation -ne "Y") {
    Write-Host "Ticket creation cancelled." -ForegroundColor Yellow
    exit 0
}

# Execute the acli jira workitem create command
Write-Host "Creating JIRA ticket..." -ForegroundColor Green
try {
    $Result = & acli @CreateArgs

    if ($LASTEXITCODE -eq 0) {
        Write-Host "JIRA ticket created successfully!" -ForegroundColor Green
        Write-Host $Result

        # Extract ticket number from result if possible
        if ($Result -match "($ProjectKey-\d+)") {
            $TicketNumber = $Matches[1]
            Write-Host ""
            Write-Host "Ticket Number: $TicketNumber" -ForegroundColor Cyan
            Write-Host "URL: https://hpccsystems.atlassian.net/browse/$TicketNumber" -ForegroundColor Cyan

            # Suggest next steps
            Write-Host ""
            Write-Host "Next steps:" -ForegroundColor Green
            Write-Host "1. Create topic branch: git checkout -b $TicketNumber-<descriptive-name>" -ForegroundColor Yellow
            Write-Host "2. Make your changes" -ForegroundColor Yellow
            Write-Host "3. Commit with: $TicketNumber <commit message>" -ForegroundColor Yellow
        }
    } else {
        Write-Error "Failed to create JIRA ticket. Exit code: $LASTEXITCODE"
        Write-Host $Result
        exit 1
    }
} catch {
    Write-Error "Error creating JIRA ticket: $_"
    exit 1
}
