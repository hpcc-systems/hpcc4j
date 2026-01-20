#!/usr/bin/env python3
"""
GitHub Issue Validation Agent
Analyzes incoming issues using Copilot CLI to determine completeness and quality.
Validates against requirements, checks documentation, and detects duplicates.
"""

import os
import json
import subprocess
import tempfile
from pathlib import Path
from github import Github

# Global configuration
COPILOT_MODEL = "gpt-4.1"  # Model to use with Copilot CLI
COPILOT_TIMEOUT = 120  # Timeout in seconds for Copilot calls
MAX_ISSUES_TO_CHECK = 200  # Limit for duplicate detection

class IssueValidationAgent:
    def __init__(self):
        self.github_token = os.environ['GITHUB_TOKEN']
        self.copilot_pat = os.environ.get('COPILOT_PAT', os.environ['GITHUB_TOKEN'])
        self.issue_number = os.environ['ISSUE_NUMBER']
        self.issue_title = os.environ['ISSUE_TITLE']
        self.issue_body = os.environ.get('ISSUE_BODY', '')
        self.issue_author = os.environ['ISSUE_AUTHOR']
        self.repository = os.environ['REPOSITORY']
        
        self.gh = Github(self.github_token)
        self.repo = self.gh.get_repo(self.repository)
        self.issue = self.repo.get_issue(int(self.issue_number))
        
        self.temp_dir = Path(tempfile.mkdtemp())
        self.prompts_dir = Path(".github/prompts")
        self.project_info_file = Path(".github/ProjectSpecificInformation.md")
        self.analysis_results = {}
        
        # Load project-specific information
        self.project_info = self._load_project_info()
    
    def _load_project_info(self):
        """Load project-specific information from ProjectSpecificInformation.md."""
        if not self.project_info_file.exists():
            print("  Warning: ProjectSpecificInformation.md not found")
            return "No project-specific information available."
        
        try:
            content = self.project_info_file.read_text()
            print("  ✓ Loaded project-specific information")
            return content
        except Exception as e:
            print(f"  Warning: Error loading project info: {e}")
            return "No project-specific information available."
    
    def run_copilot(self, prompt, context_files=None):
        """Execute copilot CLI with given prompt and optional context files (concatenated)."""
        full_prompt = prompt
        if context_files:
            for file in context_files:
                file_path = Path(file)
                if file_path.exists():
                    content = file_path.read_text()
                    full_prompt += f"\n\n---\n# Context from {file_path.name}\n" + content
        cmd = ['copilot', '-p', full_prompt, '--model', COPILOT_MODEL]
        env = os.environ.copy()
        env['GITHUB_TOKEN'] = self.copilot_pat
        try:
            result = subprocess.run(
                cmd,
                capture_output=True,
                text=True,
                env=env,
                timeout=COPILOT_TIMEOUT
            )
            if result.returncode == 0:
                return result.stdout
            else:
                print(f"Copilot CLI failed: {result.stderr}")
                return None
        except subprocess.TimeoutExpired:
            print(f"Copilot command timed out after {COPILOT_TIMEOUT}s")
            return None
        except Exception as e:
            print(f"Error running copilot: {e}")
            return None
    
    def load_prompt(self, prompt_name):
        """Load a prompt template from the prompts directory and inject project info."""
        prompt_file = self.prompts_dir / f"{prompt_name}.md"
        if not prompt_file.exists():
            print(f"Warning: {prompt_file} not found")
            return None
        
        prompt = prompt_file.read_text()
        
        # Inject project-specific information if placeholder exists
        if '{PROJECT_SPECIFIC_INFO}' in prompt:
            prompt = prompt.replace('{PROJECT_SPECIFIC_INFO}', self.project_info)
        
        return prompt
    
    def parse_json_response(self, response):
        """Parse JSON from Copilot response, handling markdown code blocks."""
        if not response:
            return None
        
        try:
            response = response.strip()
            # Remove markdown code blocks if present
            if response.startswith("```"):
                lines = response.split("\n")
                # Find start and end of JSON
                start_idx = 1
                end_idx = len(lines) - 1
                if lines[1].strip().lower() in ['json', '{']:
                    start_idx = 1 if lines[1].strip() == '{' else 2
                response = "\n".join(lines[start_idx:end_idx])
            
            return json.loads(response)
        except json.JSONDecodeError as e:
            print(f"Failed to parse JSON: {e}")
            print(f"Raw response: {response[:500]}")
            return None
    
    def step1_summarize_issue(self):
        """Generate structured summary of the issue."""
        print(f"Step 1: Summarizing issue #{self.issue_number}")
        
        issue_content = f"""# Issue #{self.issue_number}: {self.issue_title}
**Author:** {self.issue_author}

## Description
{self.issue_body or "(No description provided)"}
"""
        
        issue_file = self.temp_dir / "current_issue.md"
        issue_file.write_text(issue_content)
        
        prompt = self.load_prompt("SummarizeIssuePrompt")
        if not prompt:
            return None
        
        summary = self.run_copilot(prompt, [str(issue_file)])
        
        if summary:
            summary_file = self.temp_dir / "issue_summary.md"
            summary_file.write_text(summary)
            self.analysis_results['summary'] = summary
            print("✓ Summary generated")
            return str(summary_file)
        return None
    
    def step2_validate_completeness(self, summary_file):
        """Validate issue completeness against template requirements."""
        print("Step 2: Validating completeness")
        
        # Load issue templates
        templates = self._load_issue_templates()
        templates_text = self._format_templates_for_prompt(templates)
        
        prompt_template = self.load_prompt("IssueValidationPrompt")
        if not prompt_template:
            return {"valid": True, "reason": "No validation prompt"}
        
        # Replace placeholders in the prompt
        prompt = prompt_template.replace("{ISSUE_TITLE}", self.issue_title)
        prompt = prompt.replace("{ISSUE_BODY}", self.issue_body or "(No description provided)")
        prompt = prompt.replace("{ISSUE_TEMPLATES}", templates_text)
        
        # Run validation - output will be markdown, not JSON
        result = self.run_copilot(prompt, [summary_file])
        
        if result:
            # Save the markdown validation report
            validation_file = self.temp_dir / "validation_report.md"
            validation_file.write_text(result)
            self.analysis_results['validation'] = result
            self.analysis_results['validation_file'] = str(validation_file)
            
            # Parse key information from the markdown for labels
            needs_more_info = "NEEDS_MORE_INFO" in result
            suggested_labels = self._extract_suggested_labels(result)
            
            if needs_more_info:
                print("✗ Issue needs more information")
                self.issue.add_to_labels("needs-more-information")
            else:
                print("✓ Issue appears complete")
            
            # Apply suggested labels from the validation
            if suggested_labels:
                for label in suggested_labels:
                    try:
                        self.issue.add_to_labels(label)
                    except:
                        pass  # Ignore if label doesn't exist
            
            return {"valid": not needs_more_info, "report": result}
        
        return {"valid": True, "reason": "No result"}
    
    def _extract_suggested_labels(self, markdown_report):
        """Extract suggested labels from the markdown validation report."""
        labels = []
        lines = markdown_report.split('\n')
        
        for i, line in enumerate(lines):
            if 'Suggested Labels' in line or '### Suggested Labels' in line:
                # Get the next non-empty line
                for j in range(i+1, min(i+5, len(lines))):
                    label_line = lines[j].strip()
                    if label_line and not label_line.startswith('#'):
                        # Parse comma-separated labels
                        labels = [l.strip() for l in label_line.replace('[', '').replace(']', '').split(',')]
                        break
                break
        
        return labels
    
    def _strip_markdown_wrapper(self, text):
        """Remove markdown code block wrappers from Copilot CLI output."""
        if not text:
            return text
        
        text = text.strip()
        
        # Check if wrapped in markdown code blocks
        if text.startswith("```"):
            lines = text.split("\n")
            # Remove first line (```markdown or similar)
            if len(lines) > 2:
                # Find the closing ```
                for i in range(len(lines) - 1, 0, -1):
                    if lines[i].strip() == "```":
                        # Return content between the code block markers
                        return "\n".join(lines[1:i])
                # If no closing ``` found, just remove the opening
                return "\n".join(lines[1:])
        
        return text
    
    def _load_issue_templates(self):
        """Load all issue template files from .github/ISSUE_TEMPLATE directory."""
        templates = {}
        template_dir = Path(".github/ISSUE_TEMPLATE")
        
        if not template_dir.exists():
            print("  Warning: Issue template directory not found")
            return templates
        
        # Load all .yml template files
        for template_file in template_dir.glob("*.yml"):
            if template_file.name == "config.yml":
                continue  # Skip config file
            
            try:
                content = template_file.read_text()
                templates[template_file.name] = content
                print(f"  Loaded template: {template_file.name}")
            except Exception as e:
                print(f"  Warning: Could not load {template_file.name}: {e}")
        
        return templates
    
    def _format_templates_for_prompt(self, templates):
        """Format loaded templates for inclusion in the validation prompt."""
        if not templates:
            return "No issue templates found in repository."
        
        formatted = []
        for filename, content in templates.items():
            formatted.append(f"### Template: {filename}")
            formatted.append("```yaml")
            formatted.append(content)
            formatted.append("```")
            formatted.append("")  # Empty line between templates
        
        return "\n".join(formatted)
    
    def step3_check_documentation(self, summary_file):
        """Check if issue is covered in documentation."""
        print("Step 3: Checking documentation")
        
        # Gather README files
        readme_files = [str(f) for f in Path(".").glob("**/README.md")][:10]
        context_files = [summary_file] + readme_files
        
        # Try to get wiki pages
        wiki_dir = self.temp_dir / "wiki"
        try:
            wiki_url = f"https://github.com/{self.repository}.wiki.git"
            result = subprocess.run(
                ["git", "clone", "--depth", "1", wiki_url, str(wiki_dir)],
                capture_output=True,
                timeout=30
            )
            
            if result.returncode == 0:
                wiki_files = [str(f) for f in wiki_dir.glob("*.md")]
                context_files.extend(wiki_files[:10])
                print(f"  Loaded {len(wiki_files)} wiki pages")
        except:
            print("  Wiki not available")
        
        prompt = self.load_prompt("CheckDocumentationPrompt")
        if not prompt:
            return {}
        
        result = self.run_copilot(prompt, context_files)
        analysis = self.parse_json_response(result)
        
        if analysis:
            self.analysis_results['documentation'] = analysis
            
            if analysis.get("documented") or analysis.get("is_known_issue"):
                print("✓ Found in documentation")
            else:
                print("✓ Not documented")
            
            return analysis
        
        return {}
    
    def step4_check_duplicates(self, summary_file):
        """Check for duplicate or related issues."""
        print("Step 4: Checking for duplicates")
        
        # Compile issue history
        issues_data = []
        for issue in self.repo.get_issues(state='all', sort='updated', direction='desc')[:MAX_ISSUES_TO_CHECK]:
            if issue.number == int(self.issue_number):
                continue
            
            issues_data.append({
                "number": issue.number,
                "title": issue.title,
                "body": (issue.body or "")[:500],
                "state": issue.state,
                "labels": [label.name for label in issue.labels],
                "created_at": issue.created_at.isoformat()
            })
        
        issues_file = self.temp_dir / "issues_history.json"
        issues_file.write_text(json.dumps(issues_data, indent=2))
        print(f"  Checking against {len(issues_data)} issues")
        
        prompt = self.load_prompt("CheckDuplicatesPrompt")
        if not prompt:
            return {}
        
        result = self.run_copilot(prompt, [summary_file, str(issues_file)])
        analysis = self.parse_json_response(result)
        
        if analysis:
            self.analysis_results['duplicates'] = analysis
            
            if analysis.get("is_duplicate"):
                print("✗ Duplicate detected")
                self.issue.add_to_labels("duplicate")
            elif analysis.get("related_issues"):
                print(f"✓ Found {len(analysis['related_issues'])} related issues")
            else:
                print("✓ No duplicates found")
            
            return analysis
        
        return {}
    
    def generate_user_comment(self):
        """Generate concise, user-friendly comment with action items."""
        print("Step 5: Generating user response")
        
        # Create analysis context with all markdown reports
        context = f"""# Complete Analysis Context

## Issue Summary
{self.analysis_results.get('summary', 'Not available')}

---

## Validation Report
{self.analysis_results.get('validation', 'Not available')}

---

## Documentation Check
{json.dumps(self.analysis_results.get('documentation', {}), indent=2)}

---

## Duplicate Check
{json.dumps(self.analysis_results.get('duplicates', {}), indent=2)}
"""
        
        context_file = self.temp_dir / "analysis_context.md"
        context_file.write_text(context)
        
        # Include the validation file if it exists for additional context
        context_files = [str(context_file)]
        if 'validation_file' in self.analysis_results:
            context_files.append(self.analysis_results['validation_file'])
        
        prompt = self.load_prompt("GenerateUserResponsePrompt")
        if not prompt:
            return None
        
        comment = self.run_copilot(prompt, context_files)
        
        if comment:
            # Strip markdown code block wrappers if present
            comment = self._strip_markdown_wrapper(comment)
            print("✓ User comment generated")
            return comment
        
        return None
    
    def post_comment(self, comment):
        """Post the validation comment to the issue."""
        if not comment:
            print("No comment to post")
            return
        
        try:
            self.issue.create_comment(comment)
            print(f"✓ Posted comment to issue #{self.issue_number}")
        except Exception as e:
            print(f"✗ Failed to post comment: {e}")
            raise
    
    def run(self):
        """Execute the full validation workflow."""
        print(f"\n{'='*60}")
        print(f"Validating Issue #{self.issue_number}: {self.issue_title}")
        print(f"{'='*60}\n")
        
        try:
            # Step 1: Summarize issue
            summary_file = self.step1_summarize_issue()
            if not summary_file:
                print("✗ Failed to generate summary")
                return
            
            # Step 2: Validate completeness
            validation = self.step2_validate_completeness(summary_file)
            
            # Step 3: Check documentation (always run for context)
            self.step3_check_documentation(summary_file)
            
            # Step 4: Check duplicates
            self.step4_check_duplicates(summary_file)
            
            # Step 5: Generate and post user-friendly comment
            comment = self.generate_user_comment()
            if comment:
                self.post_comment(comment)
            
            print(f"\n{'='*60}")
            print("✓ Validation workflow completed successfully")
            print(f"{'='*60}\n")
            
        except Exception as e:
            print(f"\n✗ Error during validation: {e}")
            raise
        finally:
            # Cleanup
            import shutil
            shutil.rmtree(self.temp_dir, ignore_errors=True)


if __name__ == "__main__":
    agent = IssueValidationAgent()
    agent.run()
