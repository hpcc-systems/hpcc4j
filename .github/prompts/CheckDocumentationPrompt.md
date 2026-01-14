# Documentation Coverage Check Prompt

Analyze if this issue is already addressed in available documentation, README files, or wiki pages.

## Task

Determine if:
1. The issue is documented with a solution
2. It's a known limitation or expected behavior
3. There are workarounds available
4. User error is likely

## Output Format

Respond with ONLY a JSON object (no markdown code blocks):

```json
{
  "documented": true/false,
  "documentation_location": "specific file/section or null",
  "is_known_issue": true/false,
  "is_user_error": true/false,
  "solution_available": true/false,
  "workarounds": ["workaround description"],
  "debugging_steps": ["step description"],
  "user_message": "Brief, friendly message to post (or null)"
}
```

## Guidelines

- If documented, provide exact location
- Be helpful, not dismissive
- Suggest concrete debugging steps
- Only set is_user_error if highly confident
