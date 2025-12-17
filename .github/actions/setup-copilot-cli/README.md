# Setup GitHub Copilot CLI Action

A reusable GitHub Action that installs and configures the GitHub Copilot CLI for use in workflows.

## Features

- ✅ Installs GitHub Copilot CLI via npm
- ✅ Configures GitHub CLI authentication
- ✅ Validates authentication is working
- ✅ Returns installed Copilot version as output
- ✅ Supports custom Node.js versions

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

## Outputs

| Output | Description |
|--------|-------------|
| `copilot-version` | The installed version of GitHub Copilot CLI |

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
          GH_TOKEN: ${{ secrets.GITHUB_TOKEN }}
        run: |
          git diff HEAD~1 | copilot -p "Review this code change and suggest improvements"
```

## Troubleshooting

### Authentication Fails

If you see "GitHub CLI authentication failed":

1. Verify your token has the `copilot` scope
2. Ensure the secret is correctly configured in repository settings
3. Check that Copilot is enabled for your account/organization

### Copilot CLI Not Found

If `copilot` command is not found in subsequent steps:

- Ensure you're running on a supported OS (ubuntu-latest, macos-latest, windows-latest)
- The npm global installation should work on all platforms
