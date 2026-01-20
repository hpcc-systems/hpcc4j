# Generate User Response Prompt

Create a concise, friendly comment for the issue author based on the comprehensive validation analysis.

## Project-Specific Information

{PROJECT_SPECIFIC_INFO}

---

## Input Context

You have access to:
- **Issue Validation Report** - Detailed validation analysis with missing information
- **Issue Summary** - Structured summary of the issue
- **Documentation Check** - Whether issue is documented
- **Duplicate Detection** - Related or duplicate issues

## Task

Generate a GitHub comment that:
1. **Thanks the user** for submitting (always positive opening)
2. **Provides clear assessment** - What's the status? (1-2 sentences)
3. **Lists specific action items** - Numbered list of what user should do
4. **Hides details in collapsible sections** - Keep main message concise
5. **Is friendly and constructive** - Never dismissive or blaming
6. **Focuses on USER actions** - Not developer tasks

## Output Format

Provide **only** the markdown comment (no explanation or meta-text):

```markdown
Thank you for submitting this issue! [Personalized opening based on issue type]

[1-2 sentence assessment of current state]

## 📋 Action Required

1. [Specific action with how-to]
2. [Specific action with how-to]
3. [Specific action with how-to]

<details>
<summary>ℹ️ How to Find This Information</summary>

### [Missing Item 1]
[Detailed step-by-step instructions]

### [Missing Item 2]
[Detailed step-by-step instructions]

</details>

[OPTIONAL SECTIONS BELOW - Include only if relevant]

<details>
<summary>🔍 Related Resources</summary>

[Include if documentation check found relevant info OR duplicates detected]
- [Link to documentation with brief description]
- Related issue: #123 - [brief context]
- Possible workaround: [description]

</details>

<details>
<summary>⚠️ Important Notes</summary>

[Include if there are validation issues, compatibility concerns, or security notes]
- [Compatibility warning]
- [Version requirement note]
- [Security reminder - don't share passwords]

</details>

[OPTIONAL: If needs upgrade or known issue]
**Note:** This may be resolved in HPCC4J version X.X.X. Consider upgrading if possible.

[OPTIONAL: If documented solution exists]
**Tip:** This appears to be covered in [location]. Please review and let us know if you need clarification.

---
*Please update your issue with the requested information. We'll review it again once you've provided these details.*
```

## Content Guidelines

### For Missing Information
Convert validation report's "Critical Missing Information" into user-friendly questions with instructions. Reference the **Version-Specific Guidance** section from the Project-Specific Information above to provide accurate, project-specific instructions on how to find version numbers and other technical details.

### For Documentation Hits
If documentation check found solution:
- Acknowledge their issue is valid
- Kindly point to documentation
- Offer to clarify if docs aren't clear

### For Duplicates
If duplicate detected (high confidence):
- Note similarity to other issue(s)
- Ask if their case is different
- Provide links to related discussions

### For User Errors (Suspected)
If appears to be configuration error:
- Don't accuseBe tactful
- Provide debugging steps
- Suggest checking configuration
- Offer to help if steps don't resolve

### Tone Examples

**Welcoming:**
- "Thank you for reporting this!" (bugs)
- "Thanks for the feature suggestion!" (features)
- "Thanks for reaching out!" (questions)

**Encouraging:**
- "We'd like to help resolve this"
- "This will help us investigate"
- "We appreciate you taking the time"

**Avoid:**
- ❌ "You forgot to include..."
- ❌ "This is a duplicate"
- ❌ "You should have..."
- ✅ "To help us investigate, we need..."
- ✅ "This appears similar to #123"
- ✅ "Please also provide..."

## Special Cases

### Complete and Valid Issue
```markdown
Thank you for the detailed bug report!

This issue has all the information we need to investigate. We've added it to our backlog and will update you on progress.

<details>
<summary>🔍 In the Meantime</summary>

While we investigate, you might want to check:
- [Relevant documentation or workaround if available]

</details>
```

### Question That's Already Documented
```markdown
Thank you for your question!

This is covered in our [Common Issues and Solutions wiki](link). Specifically, check the section on [topic].

If the documentation doesn't fully address your needs, please let us know what's unclear and we'll be happy to clarify!
```

### High Confidence Duplicate
```markdown
Thank you for reporting this!

This appears very similar to issue #123, which is [open/closed/fixed in version X]. 

Please review that issue and let us know if your situation differs. If it's the same issue, we'll track it there to keep the discussion centralized.
```

## Formatting Rules

1. **Use emojis sparingly** - Only in section headers for clarity (📋 ℹ️ 🔍 ⚠️ 💡)
2. **Bold key terms** - Make scannable
3. **Keep main message <100 words** - Details go in collapsibles
4. **Number action items** - Easy to follow
5. **One clear next step** - Don't overwhelm

## Remember

- Always thank the user first
- Be specific about what's needed
- Provide clear instructions
- Keep tone friendly and professional
- Focus on enabling the user to help themselves
