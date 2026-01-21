# Issue Validation Agent

Automated issue validation system using GitHub Copilot CLI to analyze, validate, and provide feedback on GitHub issues.

## Overview

The validation agent performs a multi-step analysis:

1. **Summarize** - Creates structured summary of the issue
2. **Validate** - Comprehensive validation using IssueValidationPrompt → **Markdown output**
3. **Documentation Check** - Searches for existing solutions in docs/wiki → JSON output
4. **Duplicate Detection** - Identifies duplicate or related issues → JSON output
5. **User Response** - Generates concise, actionable comment synthesizing all analysis

## Configuration

### Global Settings

Edit these constants in `IssueValidationAgent.py`:

```python
COPILOT_MODEL = "gpt-4"  # Model to use with Copilot CLI
COPILOT_TIMEOUT = 120    # Timeout in seconds
MAX_ISSUES_TO_CHECK = 200  # Issues to check for duplicates
```

### Environment Variables

Required:
- `GITHUB_TOKEN` - GitHub token with repo access
- `ISSUE_NUMBER` - Issue number to validate
- `ISSUE_TITLE` - Issue title
- `ISSUE_BODY` - Issue body/description
- `ISSUE_AUTHOR` - Issue author username
- `REPOSITORY` - Repository in format `owner/repo`

Optional:
- `COPILOT_PAT` - GitHub token with Copilot access (defaults to GITHUB_TOKEN)

## Prompt System

All prompts are externalized to `.github/prompts/` for easy customization:

| Prompt File | Purpose | Output Format |
|------------|---------|---------------|
| `SummarizeIssuePrompt.md` | Creates structured issue summary | Markdown |
| `IssueValidationPrompt.md` | **Comprehensive validation with checklist** | **Markdown Report** |
| `CheckDocumentationPrompt.md` | Searches for existing solutions | JSON |
| `CheckDuplicatesPrompt.md` | Detects duplicate issues | JSON |
| `GenerateUserResponsePrompt.md` | Creates user-facing comment | Markdown |

### Customizing Prompts

Edit the markdown files in `.github/prompts/` to adjust:
- Analysis criteria and checklists
- Output format (markdown structure or JSON schema)
- Tone and messaging
- Required fields and validation rules

#### IssueValidationPrompt.md Specifics
This prompt replaced the original `.github/IssueAnalysisPrompt.md` and:
- Performs all validation checks in one comprehensive pass
- Uses template substitution for `{ISSUE_TITLE}` and `{ISSUE_BODY}`
- Outputs markdown instead of JSON for better readability
- Includes "Guidance Notes" section for GenerateUserResponsePrompt
- Contains all validation checklist items from issue templatesce notes for later steps
- More readable for debugging and human review
- Easier to extend with new validation criteria

#### Step 5: GenerateUserResponsePrompt.md
- **Consumes the markdown validation report** along with other analysis
- Converts technical validation findings into user-friendly questions
- Applies tone guidelines and formatting rules
- Generates the final collapsible-section comment

This separation allows:
- Validation logic stays comprehensive and detailed
- User communication is optimized for clarity and helpfulness
- Easy to update validation criteria without changing user messaging

### Customizing Prompts

Edit the markdown files in `.github/prompts/` to adjust:
- Analysis criteria
- Output format
- Tone and messaging
- Required fields

## User Comment Format

The agent generates concise comments with:

- **Clear action items** - Numbered list of what user should do
- **Collapsible sections** - Detailed guidance hidden by default
- **User-focused language** - Avoids developer jargon
- **Helpful resources** - Links to docs, related issues, workarounds

### Example Comment Structure

```markdown
Thank you for submitting this issue!

We need some additional information to help resolve this.

## Action Required

1. Provide your HPCC4J version
2. Include the full error stack trace
3. Specify your Java version

<details>
<summary>📋 Detailed Guidance</summary>

**Finding your HPCC4J version:**
Check your pom.xml or run: `mvn dependency:tree | grep hpccsystems`

...
</details>

<details>
<summary>🔍 Related Information</summary>

This may be related to #123 and #456
</details>
```

## Labels Applied

The agent automatically applies labels:

- `needs-more-information` - Issue missing required details
- `duplicate` - Issue is duplicate of another

## Workflow Integration

Used in `.github/workflows/issue-validation.yml`:

```yaml
- name: Run validation agent
  env:
    COPILOT_PAT: ${{ secrets.COPILOT_PAT }}
    GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
    ISSUE_NUMBER: ${{ github.event.issue.number }}
    ISSUE_TITLE: ${{ github.event.issue.title }}
    ISSUE_BODY: ${{ github.event.issue.body }}
    ISSUE_AUTHOR: ${{ github.event.issue.user.login }}
    REPOSITORY: ${{ github.repository }}
  run: python .github/scripts/IssueValidationAgent.py
```

## Output

Console output shows progress with status indicators:

Step 2: Validating completeness
✓ Issue appears complete

Step 3: Checking documentation
  Loaded 8 wiki pages
✓ Not documented

Step 4: Checking for duplicates
  Checking against 200 issues
✓ Found 2 related issues

Step 5: Generating user response
✓ User comment generated
✓ Posted comment to issue #123

Step 4: Checking for duplicates
  Checking against 200 issues
✓ Found 2 related issues

Step 5: Generating user response
✓ User comment generated
✓ Posted comment to issue #123

============================================================
✓ Validation workflow completed successfully
============================================================
```
## Differences from Old Version

### Improvements

1. **Externalized prompts** - All prompts in separate markdown files
2. **Configurable model** - Global `COPILOT_MODEL` constant
3. **User-focused output** - Comments target users, not developers
4. **Collapsible sections** - Keeps comments concise with expandable details
5. **Better error handling** - Robust markdown and JSON parsing
6. **Clearer console output** - Progress indicators with ✓/✗
7. **Structured analysis** - Results stored for final synthesis
8. **Comprehensive validation** - Single markdown report with all checks
9. **Flexible output formats** - Markdown for validation, JSON for specific checks

### Architecture Changes

#### Step 2 Redesign
- **Old:** Simple JSON validation with limited fields
- **New:** Comprehensive markdown report using IssueValidationPrompt.md
  - Includes all checklist items from original IssueAnalysisPrompt.md
  - Template substitution for issue content
  - Extractssuggested labels from markdown
  - More maintainable and extensible

#### Prompt Organization
- **Old:** Single large prompt file in `.github/`
- **New:** Modular prompts in `.github/prompts/` directory
  - Each step has dedicated prompt
  - Validation prompt outputs markdown for human readability
  - Response generation prompt consumes all analysis artifacts

### Benefits

- **Single responsibility** - Each step does one thing well
- **Composable** - Easy to add/remove validation steps
- **Testable** - Prompts can be tested independently
- **Maintainable** - Prompt changes don't require code changes
- **Debuggable** - Markdown reports are easy to read and review
7. **Structured analysis** - Results stored for final synthesis

### Architecture

- **Single responsibility** - Each step does one thing
- **Composable** - Easy to add/remove validation steps
- **Testable** - Prompts can be tested independently
- **Maintainable** - Prompt changes don't require code changes
