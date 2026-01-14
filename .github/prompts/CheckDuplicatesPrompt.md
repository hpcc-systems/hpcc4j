# Duplicate and Related Issues Check Prompt

Compare this issue against historical issues to identify duplicates, related issues, or regressions.

## Task

Analyze the issue similarity based on:
- Problem description
- Error messages
- Affected modules
- Symptoms and behavior

## Output Format

Respond with ONLY a JSON object (no markdown code blocks):

```json
{
  "is_duplicate": true/false,
  "duplicate_confidence": "high/medium/low",
  "duplicate_of": [issue_numbers],
  "related_issues": [issue_numbers],
  "is_regression": true/false,
  "regression_of": issue_number or null,
  "needs_upgrade": true/false,
  "upgrade_version": "version or null",
  "user_message": "Brief explanation for user (or null)"
}
```

## Guidelines

- Only mark as duplicate if very similar (high confidence)
- Include related issues even if not exact duplicates
- Check if reported as fixed in a previous version
- Suggest version upgrade if issue was resolved
