# Setup GitHub Copilot CLI Action

A reusable GitHub Action that installs and configures the GitHub Copilot CLI for use in workflows.

## Features

- ✅ Installs GitHub Copilot CLI via npm
- ✅ Configures GitHub CLI authentication
- ✅ Validates authentication is working
- ✅ Returns installed Copilot version as output
- ✅ Supports custom Node.js versions
- ✅ Usage limits per actor per month
- ✅ Actor whitelist and blacklist controls

## Usage

### Basic Usage

```yaml
steps:
  - name: Checkout repository
    uses: actions/checkout@v4

  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.COPILOT_PAT }}

  - name: Use Copilot CLI
    env:
      GH_TOKEN: ${{ secrets.COPILOT_PAT }}
    run: |
      copilot -p "your prompt here"
```

### With Custom Node Version

```yaml
steps:
  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.COPILOT_PAT }}
      node-version: '18'
```

## Inputs

| Input | Description | Required | Default |
|-------|-------------|----------|---------|
| `copilot-pat` | GitHub token with Copilot access | Yes | - |
| `node-version` | Node.js version to install | No | `20` |
| `max-runs-per-month` | Maximum workflow runs per actor per month (0 = unlimited) | No | `0` |
| `github-token` | GitHub token for API access (needed for usage tracking) | No | `''` |
| `workflow-file` | Workflow filename for usage tracking (e.g., `issue-validation.yml`) | No | `''` |
| `actor-whitelist` | Comma-separated list of allowed GitHub usernames (empty = allow all) | No | `''` |
| `actor-blacklist` | Comma-separated list of blocked GitHub usernames | No | `''` |

## Outputs

| Output | Description |
|--------|-------------|
| `copilot-version` | The installed version of GitHub Copilot CLI |
| `usage-check-passed` | Whether the usage limit check passed (true/false) |
| `runs-this-month` | Number of times the actor has run this workflow in the past month |

### With Run Limits
Limits the number of workflow runs by actor per month:

```yaml
  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.COPILOT_PAT }}
      github-token: ${{ secrets.GITHUB_TOKEN }}
      max-runs-per-month: 60
      workflow-file: 'my-workflow.yml'
```

### With Actor Whitelist

Restrict workflow access to specific users:

```yaml
steps:
  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.COPILOT_PAT }}
      actor-whitelist: 'user1,user2,maintainer3'
```

### With Actor Blacklist

Block specific users from running the workflow:

```yaml
steps:
  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.COPILOT_PAT }}
      actor-blacklist: 'spammer1,badactor2'
```

### Combined Access Controls

Use all access control features together:

```yaml
steps:
  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.COPILOT_PAT }}
      github-token: ${{ secrets.GITHUB_TOKEN }}
      max-runs-per-month: 50
      workflow-file: 'issue-validation.yml'
      actor-whitelist: 'team-member1,team-member2,team-member3'
      actor-blacklist: 'suspended-user'
```

## Requirements

### Authentication Token

The `copilot-pat` input requires a GitHub token with Copilot access:

- **Option 1**: Use `secrets.GITHUB_TOKEN` if your repository has Copilot enabled
- **Option 2**: Create a Personal Access Token (PAT) with the `copilot` scope and store it as a repository secret

### Repository Checkout

**Important**: When using this action as a local action (`./.github/actions/...`), you must checkout the repository first:

```yaml
steps:
  - name: Checkout repository
    uses: actions/checkout@v4

  - name: Setup GitHub Copilot CLI
    uses: ./.github/actions/setup-copilot-cli
    with:
      copilot-pat: ${{ secrets.GITHUB_TOKEN }}
```

## Examples

### Example: Code Review

```yaml
jobs:
  review:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      
      - name: Setup Copilot
        uses: ./.github/actions/setup-copilot-cli
        with:
          copilot-pat: ${{ secrets.GITHUB_TOKEN }}
      
      - name: Review changes
        env:
          git diff HEAD~1 | copilot -p "Review this code change and suggest improvements"
```

## Troubleshooting

### Authentication Fails

If you see "GitHub CLI authentication failed":

1. Verify your token has the `copilot` scope
2. Ensure the secret is correctly configured in repository settings
3. Check that Copilot is enabled for your account/organization

### Usage Limit Errors

If you see "Usage limit exceeded" but believe it's incorrect:

1. Verify the `workflow-file` parameter matches the actual workflow filename exactly
2. Check that `github-token` has permissions to access the Actions API
3. Usage is counted per 30-day rolling window, not calendar month
4. Contact a repository administrator to increase the limit if needed

### Actor Access Denied

If you see "Actor is not whitelisted" or "Actor is blacklisted":

1. **Whitelist**: Verify your GitHub username is in the `actor-whitelist` parameter
2. **Blacklist**: Contact a repository administrator if you believe you were blocked incorrectly
3. Check for typos in usernames (case-sensitive, no @ symbol)
4. Ensure comma separation with no spaces (or spaces will be trimmed automatically)

## Notes

- **Usage tracking** requires the `github-token` to have `actions:read` permission (default for `GITHUB_TOKEN`)
- **Actor validation** happens before any Copilot installation to save resources
- **Whitelist is optional** - if not specified, all non-blacklisted users can run the workflow
- **Usage counts** are based on workflow runs in the past 30 days, updated in real-timet month.

### Actor Whitelist

Restrict workflow access to a specific set of approved users:

- Provide a comma-separated list of GitHub usernames in `actor-whitelist`
- If specified, **only** users in the whitelist can run the workflow
- If empty (default), all non-blacklisted users are allowed
- Case-sensitive username matching
- Whitespace is automatically trimmed from usernames

**Use Cases:**
- Limit expensive operations to maintainers only
- Restrict AI-powered workflows to trusted team members
- Gradual rollout to specific beta testers

### Actor Blacklist

Block specific users from running the workflow:

- Provide a comma-separated list of GitHub usernames in `actor-blacklist`
- Blacklisted users are denied access regardless of whitelist status
- Blacklist is checked **before** whitelist validation
- Useful for blocking spam or abuse

**Priority Order:**
1. Blacklist is checked first (immediate denial if matched)
2. Whitelist is checked second (if specified)
3. Usage limits are checked last (if configured)

### Access Control Examples

#### Example 1: Team-Only Access with Usage Limits

```yaml
- name: Setup Copilot CLI
  uses: ./.github/actions/setup-copilot-cli
  with:
    copilot-pat: ${{ secrets.COPILOT_PAT }}
    github-token: ${{ secrets.GITHUB_TOKEN }}
    workflow-file: 'ai-code-review.yml'
    max-runs-per-month: 100
    actor-whitelist: 'maintainer1,maintainer2,lead-dev,senior-engineer'
```

#### Example 2: Open Access with Abuse Prevention

```yaml
- name: Setup Copilot CLI
  uses: ./.github/actions/setup-copilot-cli
  with:
    copilot-pat: ${{ secrets.COPILOT_PAT }}
    github-token: ${{ secrets.GITHUB_TOKEN }}
    workflow-file: 'issue-validator.yml'
    max-runs-per-month: 50
    actor-blacklist: 'spam-bot,abusive-user,rate-limiter'
```

#### Example 3: Strict Controls for Production

```yaml
- name: Setup Copilot CLI
  uses: ./.github/actions/setup-copilot-cli
  with:
    copilot-pat: ${{ secrets.COPILOT_PAT }}
    github-token: ${{ secrets.GITHUB_TOKEN }}
    workflow-file: 'deploy-assistant.yml'
    max-runs-per-month: 20
    actor-whitelist: 'devops-lead,cto,release-manager'
    actor-blacklist: 'former-employee'
```     run: |
          git diff HEAD~1 | copilot -p "Review this code change and suggest improvements"
```
