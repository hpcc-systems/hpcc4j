#!/bin/bash
#
# create-jira-ticket.sh - Create JIRA tickets for HPCC4J project
#
# Usage: ./create-jira-ticket.sh "Summary" ["Description"] [IssueType] [Priority] [Component]
#
# Examples:
#   ./create-jira-ticket.sh "Add baremetal known server issues workflow" "Create GitHub Actions workflow for testing known server-side issues" Task Medium "Build/CI"
#   ./create-jira-ticket.sh "Fix connection timeout in spark connector" "" Bug High spark-hpcc
#

set -e

# Function to search for similar tickets
search_similar_tickets() {
    local search_term="$1"
    local project_key="$2"

    echo "Searching for similar tickets..."

    # Properly escape and quote the search term to prevent JQL injection
    # Replace double quotes with escaped quotes and wrap in double quotes for literal string
    local escaped_search_term="${search_term//\"/\\\"}"
    # Search for tickets with similar summary in the project using quoted literal
    local search_result
    if search_result=$(acli jira workitem search --jql "summary ~ \"$escaped_search_term\" AND project = '$project_key'" --json 2>/dev/null) && [ -n "$search_result" ]; then
        # Check if we have any results using proper JSON parsing
        local count
        if command -v jq &> /dev/null; then
            count=$(echo "$search_result" | jq '.workItems | length' 2>/dev/null || echo "0")
        else
            # Fallback to grep if jq is not available
            count=$(echo "$search_result" | grep -o '"key"' | wc -l)
        fi

        if [ "$count" -gt 0 ]; then
            echo "Found $count similar ticket(s):"

            # Extract and display ticket information using jq if available, fallback to grep
            if command -v jq &> /dev/null; then
                echo "$search_result" | jq -r '.workItems[]? | "  - \(.key): \(.summary)"' 2>/dev/null
            else
                # Fallback: Extract ticket information using process substitution to avoid subshell
                while IFS= read -r line; do
                    if [[ $line =~ \"key\":[[:space:]]*\"([^\"]+)\" ]]; then
                        echo "  - ${BASH_REMATCH[1]}"
                    fi
                done < <(echo "$search_result" | grep '"key"')
            fi

            echo ""
            read -p "Similar tickets found. Do you still want to create a new ticket? (y/N): " -n 1 -r
            echo ""

            if [[ ! $REPLY =~ ^[Yy]$ ]]; then
                return 1
            fi
        fi
    fi

    echo "No similar tickets found or proceeding with creation."
    return 0
}

# Check if acli (Atlassian CLI) is installed
if ! command -v acli &> /dev/null; then
    echo "ERROR: Atlassian CLI (acli) is not installed. Please install it first:"
    echo "  Download from: https://developer.atlassian.com/cloud/acli/"
    exit 1
fi

# Check if acli is configured
if ! acli jira auth status &> /dev/null; then
    echo "ERROR: Atlassian CLI is not configured. Please run 'acli jira auth login' first to set up your credentials."
    exit 1
fi

# Parameters
SUMMARY="${1:-}"
DESCRIPTION="${2:-}"
ISSUE_TYPE="${3:-Task}"
PRIORITY="${4:-Medium}"
COMPONENT="${5:-}"
PROJECT_KEY="HPCC4J"

# Validate required parameters
if [ -z "$SUMMARY" ]; then
    echo "Usage: $0 \"Summary\" [\"Description\"] [IssueType] [Priority] [Component]"
    echo ""
    echo "Parameters:"
    echo "  Summary     - Brief summary/title of the JIRA ticket (required)"
    echo "  Description - Detailed description (optional)"
    echo "  IssueType   - Bug, Task, Story, Improvement (default: Task)"
    echo "  Priority    - Highest, High, Medium, Low, Lowest (default: Medium)"
    echo "  Component   - Component name (optional)"
    echo ""
    echo "Examples:"
    echo "  $0 \"Add baremetal workflow\" \"Create GitHub Actions workflow\" Task Medium \"Build/CI\""
    echo "  $0 \"Fix timeout issue\" \"\" Bug High spark-hpcc"
    exit 1
fi

# Build acli jira workitem create command
CREATE_ARGS=(
    "jira" "workitem" "create"
    "--project" "$PROJECT_KEY"
    "--summary" "$SUMMARY"
    "--type" "$ISSUE_TYPE"
)

# Add optional parameters
if [ -n "$DESCRIPTION" ]; then
    CREATE_ARGS+=("--description" "$DESCRIPTION")
fi

# Note: acli doesn't support component in create command
# Component would need to be set after creation

# Show what will be created
echo "Creating JIRA ticket with the following details:"
echo "  Project: $PROJECT_KEY"
echo "  Summary: $SUMMARY"
echo "  Type: $ISSUE_TYPE"
echo "  Priority: $PRIORITY"

if [ -n "$DESCRIPTION" ]; then
    echo "  Description: $DESCRIPTION"
fi

if [ -n "$COMPONENT" ]; then
    echo "  Component: $COMPONENT (will need to be set manually)"
fi

echo ""

# Search for similar tickets before creating
if ! search_similar_tickets "$SUMMARY" "$PROJECT_KEY"; then
    echo "Ticket creation cancelled due to similar tickets."
    exit 0
fi

# Confirm before creating
read -p "Do you want to create this JIRA ticket? (y/N): " -n 1 -r
echo ""

if [[ ! $REPLY =~ ^[Yy]$ ]]; then
    echo "Ticket creation cancelled."
    exit 0
fi

# Create the ticket
echo "Creating JIRA ticket..."
RESULT=$(acli "${CREATE_ARGS[@]}")
EXIT_CODE=$?

if [ $EXIT_CODE -eq 0 ]; then
    echo "JIRA ticket created successfully!"
    echo "$RESULT"

    # Extract ticket number
    if [[ $RESULT =~ ($PROJECT_KEY-[0-9]+) ]]; then
        TICKET_NUMBER="${BASH_REMATCH[1]}"
        echo ""
        echo "Ticket Number: $TICKET_NUMBER"
        echo "URL: https://hpccsystems.atlassian.net/browse/$TICKET_NUMBER"

        # Suggest next steps
        echo ""
        echo "Next steps:"
        echo "1. Create topic branch: git checkout -b $TICKET_NUMBER-<descriptive-name>"
        echo "2. Make your changes"
        echo "3. Commit with: $TICKET_NUMBER <commit message>"
    fi
else
    echo "ERROR: Failed to create JIRA ticket"
    exit 1
fi
