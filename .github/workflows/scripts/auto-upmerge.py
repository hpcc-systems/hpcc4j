#!/usr/bin/env python3
"""
Auto-upmerge script for HPCC4J
Automatically upmerges changes from lower branches to higher branches.
"""

import os
import re
import subprocess
import sys
import json
import time


# Global log buffer for artifact generation
_log_buffer = []


def log(message, to_artifact=True):
    """Print to stdout and optionally buffer for artifact."""
    print(message)
    if to_artifact:
        _log_buffer.append(message)


def log_header(title):
    """Print a formatted header."""
    separator = "=" * 60
    log(f"\n{separator}")
    log(title)
    log(f"{separator}\n")


def log_section(title):
    """Print a formatted section header."""
    log(f"\n{title}")
    log("-" * len(title))


def get_buffered_logs():
    """Return all buffered log messages."""
    return "\n".join(_log_buffer)


def extractVersion(versionStr):
    parts = versionStr.split('.')
    if len(parts) != 3:
        print(f'Invalid version: {versionStr}')
        sys.exit(1)
    if parts[2].lower() == 'x':
        parts[2] = '0'

    major, minor, point = map(int, parts)
    return [major, minor, point]


def buildBranchString(version):
    major, minor, point = map(int, version)
    return f"candidate-{major}.{minor}.x"


def createReleaseTagPattern(projectConfig, major=None, minor=None, point=None):
    releaseTagPrefix = projectConfig.get('tagPrefix')
    releaseTagPostfix = projectConfig.get('tagPostfix')

    if releaseTagPrefix is None or releaseTagPostfix is None:
        print('Error: PROJECT_CONFIG is missing required fields: tagPrefix and/or tagPostfix')
        sys.exit(1)

    releaseTagPattern = re.escape(releaseTagPrefix)
    if major is not None:
        releaseTagPattern += str(major) + '\\.'
    else:
        releaseTagPattern += '[0-9]+\\.'

    if minor is not None:
        releaseTagPattern += str(minor) + '\\.'
    else:
        releaseTagPattern += '[0-9]+\\.'

    if point is not None:
        releaseTagPattern += str(point) + '(-[0-9]+)?'
    else:
        releaseTagPattern += '[0-9]+(-[0-9]+)?'

    releaseTagPattern += re.escape(releaseTagPostfix) + '$'

    return releaseTagPattern


def getLatestSemVer(projectConfig, major=None, minor=None, point=None):
    """Get latest semantic version tag matching the pattern."""
    # Get all tags sorted by version
    result = subprocess.run(
        ["git", "tag", "--list", "--sort=-v:refname"],
        capture_output=True, text=True, check=True
    )
    
    if not result.stdout.strip():
        print('Unable to retrieve git tags.')
        sys.exit(1)
    
    # Build regex pattern for filtering
    pattern = createReleaseTagPattern(projectConfig, major, minor, point)
    regex = re.compile(pattern)
    
    # Find first matching tag
    for tag in result.stdout.strip().split('\n'):
        if regex.match(tag):
            # Extract version from tag
            versionPattern = re.compile(r".*[^0-9]+([0-9]+\.[0-9]+\.[0-9]+).*")
            versionMatch = versionPattern.match(tag)
            if versionMatch:
                return extractVersion(versionMatch.group(1))
    
    print(f'Unable to find tag matching pattern: {pattern}')
    sys.exit(2)


def generateUpMergeBranchList(projectConfig, branchName):
    latestVersion = getLatestSemVer(projectConfig)

    versions = []
    if branchName == "master":
        return versions
    else:
        # Extract candidate branch major / minor version
        candidateBranchPattern = re.compile(r"candidate-([0-9]+\.[0-9]+\.([0-9]+|x)).*")
        branchVersionMatch = candidateBranchPattern.match(branchName)
        if not branchVersionMatch:
            print(f'Branch {branchName} does not match expected pattern')
            sys.exit(1)
        
        branchVersion = extractVersion(branchVersionMatch.group(1))

        curMajor = branchVersion[0]
        latestMajor = latestVersion[0]
        while curMajor <= latestMajor:
            latestVersionInMajor = getLatestSemVer(projectConfig, curMajor)

            curMinor = 0
            if curMajor == branchVersion[0]:
                # Start from next minor version to skip current branch
                curMinor = branchVersion[1] + 2

            latestMinor = latestVersionInMajor[1]

            while curMinor <= latestMinor:
                latestPointInMinor = getLatestSemVer(projectConfig, curMajor, curMinor)
                versions.append(buildBranchString([latestPointInMinor[0], latestPointInMinor[1], latestPointInMinor[2] + 2]))
                curMinor += 2
            curMajor += 1

    return versions


def getTargetInBranchVersion(targetBranch):
    # Use git show to get the version from the top-level pom.xml
    cmd = ["git", "show", f"origin/{targetBranch}:pom.xml"]
    result = subprocess.run(cmd, capture_output=True, text=True, check=True)
    pom_content = result.stdout

    version_pattern = re.compile(r'<version>(\s*[0-9]+\.[0-9]+\.[0-9]+(-[0-9]+)?(-SNAPSHOT)?\s*)</version>')
    match = version_pattern.search(pom_content)
    if match:
        return match.group(1).strip()
    else:
        print(f"Error: Unable to find version in pom.xml for branch {targetBranch}")
        sys.exit(1)


def check_merge_conflicts(source_ref, target_ref):
    """Use git merge-tree to check for conflicts without touching working tree.
    
    Returns:
        tuple: (has_conflicts, conflict_info) where conflict_info is a dict with:
            - conflicted_files: list of file paths with conflicts
            - conflict_details: dict mapping file paths to their conflict sections
    """
    # Get the full merge-tree output
    cmd = ["git", "merge-tree", source_ref, target_ref]
    result = subprocess.run(cmd, capture_output=True, text=True)
    
    # Parse the output to find actual conflict markers
    output_lines = result.stdout.strip().split('\n')
    conflicted_files = []
    
    # Extract files from CONFLICT lines in the output
    conflict_pattern = re.compile(r'CONFLICT \([^)]+\): (?:Merge conflict in|.*) (.+)$')
    for line in output_lines:
        match = conflict_pattern.search(line)
        if match:
            filepath = match.group(1).strip()
            if filepath and filepath not in conflicted_files:
                conflicted_files.append(filepath)
    
    # Check if there are any conflicts
    has_conflicts = len(conflicted_files) > 0
    
    if has_conflicts:
        # Parse the full output to extract conflict sections
        conflict_details = parse_merge_tree_conflicts(result.stdout, conflicted_files)
        
        conflict_info = {
            "conflicted_files": conflicted_files,
            "conflict_details": conflict_details
        }
        
        return True, conflict_info
    
    return False, {}


def parse_merge_tree_conflicts(merge_tree_output, conflicted_files):
    """Parse git merge-tree output to extract conflict sections for each file.
    
    The old git merge-tree format outputs index entries with blob IDs.
    We need to reconstruct conflicts using git show on those blobs.
    
    Args:
        merge_tree_output: Full output from git merge-tree command
        conflicted_files: List of file paths known to have conflicts
        
    Returns:
        dict: Mapping of file paths to list of conflict sections
    """
    conflict_details = {}
    
    # Parse the index-style output to find blob IDs for conflicted files
    # Format: "100644 <blob_id> <stage> <filepath>"
    # Stage 1 = base, 2 = ours, 3 = theirs
    lines = merge_tree_output.split('\n')
    file_blobs = {}  # filepath -> {1: base_blob, 2: ours_blob, 3: theirs_blob}
    
    for line in lines:
        # Match lines like: "100644 d2fd3394be370367322ad997d2305849569bacd3 2       .github/workflows/auto-upmerge.yml"
        parts = line.split()
        if len(parts) >= 4 and parts[0].startswith('100'):
            blob_id = parts[1]
            stage = parts[2]
            # Filepath might have spaces, so join the rest
            filepath = ' '.join(parts[3:])
            
            if filepath in conflicted_files:
                if filepath not in file_blobs:
                    file_blobs[filepath] = {}
                file_blobs[filepath][stage] = blob_id
    
    # For each conflicted file, try to reconstruct the conflict
    for filepath in conflicted_files:
        if filepath in file_blobs:
            blobs = file_blobs[filepath]
            
            # Try to use git merge-file to reconstruct conflict markers
            # We need stage 1 (base), 2 (ours), 3 (theirs)
            if '2' in blobs and '3' in blobs:
                try:
                    # Get the base (common ancestor) - might not exist for add/add conflicts
                    base_blob = blobs.get('1', '')
                    
                    # Use git merge-file to create conflict markers
                    # For add/add conflicts without base, use empty base
                    if base_blob:
                        base_cmd = ['git', 'show', base_blob]
                    else:
                        base_cmd = ['echo', '']
                    
                    ours_cmd = ['git', 'show', blobs['2']]
                    theirs_cmd = ['git', 'show', blobs['3']]
                    
                    # Get blob contents
                    base_content = subprocess.run(base_cmd, capture_output=True, text=True).stdout
                    ours_content = subprocess.run(ours_cmd, capture_output=True, text=True).stdout
                    theirs_content = subprocess.run(theirs_cmd, capture_output=True, text=True).stdout
                    
                    # Create temp files for merge-file
                    import tempfile
                    with tempfile.NamedTemporaryFile(mode='w', delete=False, suffix='.base') as base_f, \
                         tempfile.NamedTemporaryFile(mode='w', delete=False, suffix='.ours') as ours_f, \
                         tempfile.NamedTemporaryFile(mode='w', delete=False, suffix='.theirs') as theirs_f:
                        
                        base_f.write(base_content)
                        ours_f.write(ours_content)
                        theirs_f.write(theirs_content)
                        
                        base_path = base_f.name
                        ours_path = ours_f.name
                        theirs_path = theirs_f.name
                    
                    # Run git merge-file
                    merge_result = subprocess.run(
                        ['git', 'merge-file', '-p', '-L', 'ours', '-L', 'base', '-L', 'theirs',
                         ours_path, base_path, theirs_path],
                        capture_output=True, text=True
                    )
                    
                    # Clean up temp files
                    os.unlink(base_path)
                    os.unlink(ours_path)
                    os.unlink(theirs_path)
                    
                    # Extract conflict sections from the merged output
                    merged_content = merge_result.stdout
                    conflicts = extract_conflict_sections(merged_content)
                    
                    if conflicts:
                        conflict_details[filepath] = conflicts
                    else:
                        conflict_details[filepath] = ["Conflict detected but no conflict markers found"]
                        
                except Exception as e:
                    conflict_details[filepath] = [f"Error extracting conflict: {str(e)}"]
            else:
                conflict_details[filepath] = ["Incomplete blob information - cannot reconstruct conflict"]
        else:
            conflict_details[filepath] = ["File mentioned in CONFLICT but no blob IDs found"]
    
    return conflict_details


def extract_conflict_sections(merged_content):
    """Extract individual conflict sections from merged file content.
    
    Args:
        merged_content: File content with conflict markers
        
    Returns:
        list: List of conflict sections including markers
    """
    conflicts = []
    lines = merged_content.split('\n')
    current_conflict = []
    in_conflict = False
    
    for line in lines:
        if line.startswith('<<<<<<<'):
            in_conflict = True
            current_conflict = [line]
        elif line.startswith('>>>>>>>'):
            if in_conflict:
                current_conflict.append(line)
                conflicts.append('\n'.join(current_conflict))
                current_conflict = []
                in_conflict = False
        elif in_conflict:
            current_conflict.append(line)
    
    return conflicts


def upmerge_to_branch(source_branch, target_branch, pr_number, pr_title):
    log_header(f"Upmerging {source_branch} to {target_branch}")
    
    # Track details for this upmerge attempt
    upmerge_details = {
        "target_branch": target_branch,
        "status": "unknown",
        "error": None,
        "conflict_check": None,
        "steps_completed": []
    }
    
    temp_branch = f"upmerge-temp-{target_branch}"
    original_ref = None  # Track where we started for cleanup
    
    try:
        # Record current HEAD for cleanup purposes
        result = subprocess.run(
            ["git", "rev-parse", "HEAD"],
            capture_output=True, text=True, check=True
        )
        original_ref = result.stdout.strip()
        
        # Fetch latest changes
        subprocess.run(["git", "fetch", "origin"], check=True)
        upmerge_details["steps_completed"].append("fetch")
        
        # Get target branch version
        target_version = getTargetInBranchVersion(target_branch)
        log(f"Target branch version: {target_version}")
        upmerge_details["target_version"] = target_version
        upmerge_details["steps_completed"].append("get_version")
        
        # Create temporary branch from source with aligned versions for conflict checking
        log(f"Creating temporary branch for conflict check...")
        result = subprocess.run(
            ["git", "checkout", "-B", temp_branch, f"origin/{source_branch}"], 
            capture_output=True, text=True
        )
        if result.returncode != 0:
            log(f"Failed to create temp branch: {result.stderr}")
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Failed to create temp branch: {result.stderr}"
            return False, upmerge_details
        upmerge_details["steps_completed"].append("create_temp_branch")
    
        # Update Maven version temporarily for conflict check
        log(f"Aligning version to {target_version} for conflict check...")
        log(f"  Working directory: {os.getcwd()}")
        log(f"  Checking Maven availability...")
        mvn_check = subprocess.run(["mvn", "--version"], capture_output=True, text=True)
        log(f"  Maven version output: {mvn_check.stdout[:200]}")
        
        mvn_result = subprocess.run(
            ["mvn", "versions:set", f"-DnewVersion={target_version}", "-DgenerateBackupPoms=false"],
            capture_output=True, text=True
        )
        if mvn_result.returncode != 0:
            log(f"Failed to update Maven versions:")
            log(f"  Return code: {mvn_result.returncode}")
            log(f"  STDOUT: {mvn_result.stdout}")
            log(f"  STDERR: {mvn_result.stderr}")
            # Cleanup: detach HEAD before deleting temp branch (we're currently on it)
            subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Maven version set failed (conflict check): stdout={mvn_result.stdout}, stderr={mvn_result.stderr}"
            return False, upmerge_details
        log(f"  ✓ Version alignment successful")
        upmerge_details["steps_completed"].append("align_version_temp")
        
        # Commit version changes to temp branch for conflict checking
        # Use shell globbing to find all pom.xml files
        find_poms_result = subprocess.run(
            ["find", ".", "-name", "pom.xml", "-type", "f"],
            capture_output=True, text=True
        )
        pom_files = [f.strip() for f in find_poms_result.stdout.strip().split('\n') if f.strip()]
        
        if pom_files:
            add_result = subprocess.run(
                ["git", "add"] + pom_files,
                capture_output=True, text=True
            )
            if add_result.returncode != 0:
                log(f"Failed to stage version changes: {add_result.stderr}")
                subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
                subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
                upmerge_details["status"] = "failed"
                upmerge_details["error"] = f"Git add failed: {add_result.stderr}"
                return False, upmerge_details
        
        # Check if there are actually staged changes (not just untracked files)
        # Use git diff --cached to check only staged changes
        diff_result = subprocess.run(
            ["git", "diff", "--cached", "--quiet"],
            capture_output=True, text=True
        )
        
        # diff --quiet returns 0 if no changes, 1 if changes exist
        has_staged_changes = diff_result.returncode != 0
        
        if not has_staged_changes:
            log("No version changes to commit (versions already aligned)")
            log(f"  Source version and target version are both: {target_version}")
            # This is not actually a failure - versions are already aligned
            # Skip to conflict check without version commit
            upmerge_details["steps_completed"].append("skip_version_commit_already_aligned")
        else:
            commit_result = subprocess.run(
                ["git", "commit", "-m", f"[TEMP] Align version to {target_version}"],
                capture_output=True, text=True
            )
            if commit_result.returncode != 0:
                log(f"Failed to commit version changes:")
                log(f"  STDOUT: {commit_result.stdout}")
                log(f"  STDERR: {commit_result.stderr}")
                subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
                subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
                upmerge_details["status"] = "failed"
                upmerge_details["error"] = f"Git commit failed: stdout={commit_result.stdout}, stderr={commit_result.stderr}"
                return False, upmerge_details
            upmerge_details["steps_completed"].append("commit_temp_version")
    
        # Check for merge conflicts using merge-tree (dry-run)
        log("Checking for merge conflicts...")
        has_conflicts, conflict_info = check_merge_conflicts(
            temp_branch, 
            f"origin/{target_branch}"
        )
        
        upmerge_details["conflict_check"] = {
            "has_conflicts": has_conflicts,
            "conflicted_files": conflict_info.get("conflicted_files", []),
            "conflict_details": conflict_info.get("conflict_details", {})
        }
        
        if has_conflicts:
            conflicted_files = conflict_info.get("conflicted_files", [])
            log(f"❌ Conflicts detected during upmerge to {target_branch}:")
            log(f"   Total conflicted files: {len(conflicted_files)}")
            
            # Show summary of conflicted files
            for filepath in conflicted_files[:10]:  # Show first 10 files
                log(f"   • {filepath}")
            if len(conflicted_files) > 10:
                log(f"   ... and {len(conflicted_files) - 10} more files")
            
            # Cleanup: detach HEAD before deleting temp branch
            subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "conflicts"
            return False, upmerge_details
        
        log("✓ No conflicts detected")
        upmerge_details["steps_completed"].append("conflict_check_passed")
        
        # Now checkout target branch and perform squash merge from temp branch
        # Use -B to create/reset local branch from remote ref (handles non-existent local branches)
        log(f"Checking out {target_branch} from origin...")
        result = subprocess.run(
            ["git", "checkout", "-B", target_branch, f"origin/{target_branch}"], 
            capture_output=True, text=True
        )
        if result.returncode != 0:
            log(f"Failed to checkout {target_branch}: {result.stderr}")
            # Cleanup: detach HEAD before deleting temp branch
            subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Failed to checkout {target_branch}: {result.stderr}"
            return False, upmerge_details
        
        # Squash merge temp branch (flattens all commits including version alignment)
        log(f"Squash-merging temp branch (removes version alignment from history)...")
        merge_msg = f"Merge {source_branch} to {target_branch}\n\nAuto-upmerge from PR #{pr_number}: {pr_title}"
        result = subprocess.run(
            ["git", "merge", "--squash", temp_branch],
            capture_output=True, text=True
        )
        
        if result.returncode != 0:
            log(f"Squash merge failed:")
            log(f"  STDOUT: {result.stdout}")
            log(f"  STDERR: {result.stderr}")
            # Squash merge doesn't create merge state, so use reset instead of abort
            log(f"  Resetting {target_branch} to clean state...")
            subprocess.run(["git", "reset", "--hard", f"origin/{target_branch}"], capture_output=True)
            subprocess.run(["git", "clean", "-fd"], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Squash merge failed: {result.stderr}"
            return False, upmerge_details
        
        log("✓ Squash merge successful")
        upmerge_details["steps_completed"].append("squash_merge")
        
        # Clean up temp branch
        subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
        upmerge_details["steps_completed"].append("cleanup_temp_branch")
        
        # Commit the merge with version changes included
        log("Committing merge...")
        result = subprocess.run(
            ["git", "commit", "-s", "-m", merge_msg],
            capture_output=True, text=True
        )
        if result.returncode != 0:
            log(f"Failed to commit: {result.stderr}")
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Commit failed: {result.stderr}"
            return False, upmerge_details
        
        # Push to origin
        log(f"Pushing to origin/{target_branch}...")
        result = subprocess.run(
            ["git", "push", "origin", target_branch],
            capture_output=True, text=True
        )
        if result.returncode != 0:
            log(f"Failed to push: {result.stderr}")
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Push failed: {result.stderr}"
            return False, upmerge_details
        
        upmerge_details["steps_completed"].append("push")
        upmerge_details["status"] = "success"
        log(f"✅ Successfully upmerged to {target_branch}")
        return True, upmerge_details
        
    except Exception as e:
        upmerge_details["status"] = "exception"
        upmerge_details["error"] = str(e)
        log(f"Exception during upmerge: {e}")
        return False, upmerge_details
    
    finally:
        # Always cleanup: restore original ref and delete temp branch
        if original_ref:
            log("Cleaning up: restoring original checkout...")
            subprocess.run(
                ["git", "checkout", "--detach", original_ref], 
                capture_output=True
            )
        
        # Check if temp branch exists and delete it
        branch_check = subprocess.run(
            ["git", "rev-parse", "--verify", temp_branch],
            capture_output=True
        )
        if branch_check.returncode == 0:
            log(f"Cleaning up: deleting temporary branch {temp_branch}...")
            subprocess.run(
                ["git", "branch", "-D", temp_branch],
                capture_output=True
            )


def main():
    # Get environment variables
    pr_number = os.environ['PULL_REQUEST_NUMBER']
    pr_title = os.environ['PULL_REQUEST_TITLE']
    base_branch = os.environ['BASE_BRANCH']
    
    # Get project config from environment variable or use default
    projectConfigJson = os.environ.get('PROJECT_CONFIG')
    if projectConfigJson:
        projectConfig = json.loads(projectConfigJson)
    else:
        # Fallback to hardcoded config if environment variable is not set
        log("Warning: PROJECT_CONFIG environment variable not set, using default configuration")
        projectConfig = {
            "projectName": "HPCC4J",
            "projectPrefixes": ["HPCC4J"],
            "tagPrefix": "hpcc4j_",
            "tagPostfix": "-release"
        }
    
    if not isinstance(projectConfig, dict):
        log('Error: PROJECT_CONFIG is not a valid JSON object, aborting.')
        sys.exit(1)
    
    if 'tagPrefix' not in projectConfig or 'tagPostfix' not in projectConfig:
        log('Error: PROJECT_CONFIG is missing required fields: tagPrefix and/or tagPostfix')
        sys.exit(1)
    
    log_header("Auto-Upmerge Process")
    log(f"PR #{pr_number}: {pr_title}")
    log(f"Base branch: {base_branch}")
    
    # Generate list of target branches
    target_branches = generateUpMergeBranchList(projectConfig, base_branch)
    target_branches.append("master")
    
    log(f"\nTarget branches for upmerge: {target_branches}")
    
    # Track results
    successful_upmerges = []
    failed_upmerges = []
    detailed_results = []
    
    # Perform upmerges
    for target_branch in target_branches:
        try:
            success, details = upmerge_to_branch(base_branch, target_branch, pr_number, pr_title)
            detailed_results.append(details)
            if success:
                successful_upmerges.append(target_branch)
            else:
                failed_upmerges.append(target_branch)
        except Exception as e:
            log(f"Exception during upmerge to {target_branch}: {e}")
            failed_upmerges.append(target_branch)
            detailed_results.append({
                "target_branch": target_branch,
                "status": "exception",
                "error": str(e),
                "steps_completed": []
            })
    
    # Create summary
    log_header("UPMERGE SUMMARY")
    log(f"✅ Successful upmerges ({len(successful_upmerges)}):")
    for branch in successful_upmerges:
        log(f"  - {branch}")
    
    if failed_upmerges:
        log(f"\n❌ Failed upmerges ({len(failed_upmerges)}):")
        for branch in failed_upmerges:
            log(f"  - {branch}")
    
    # Save results for reporting
    results = {
        "pr_number": pr_number,
        "pr_title": pr_title,
        "base_branch": base_branch,
        "successful_upmerges": successful_upmerges,
        "failed_upmerges": failed_upmerges,
        "detailed_results": detailed_results,
        "timestamp": time.strftime("%Y-%m-%d %H:%M:%S UTC", time.gmtime())
    }
    
    with open('upmerge-results.json', 'w') as f:
        json.dump(results, f, indent=2)
    
    # Create detailed conflict report if there were any conflicts
    conflicts_found = any(
        detail.get('conflict_check') and detail.get('conflict_check').get('has_conflicts', False)
        for detail in detailed_results
    )
    
    if conflicts_found:
        with open('upmerge-conflicts.md', 'w') as f:
            f.write(f"# Upmerge Conflict Report\n\n")
            f.write(f"**PR:** #{pr_number} - {pr_title}\n")
            f.write(f"**Base Branch:** {base_branch}\n")
            f.write(f"**Generated:** {results['timestamp']}\n\n")
            f.write("---\n\n")
            
            for detail in detailed_results:
                conflict_check = detail.get('conflict_check')
                if conflict_check and conflict_check.get('has_conflicts', False):
                    target = detail['target_branch']
                    conflicted_files = conflict_check.get('conflicted_files', [])
                    conflict_details = conflict_check.get('conflict_details', {})
                    
                    f.write(f"## {target}\n\n")
                    f.write(f"**Status:** Conflicts detected\n")
                    f.write(f"**Conflicted Files:** {len(conflicted_files)}\n\n")
                    
                    if conflicted_files:
                        f.write("### Conflicted Files\n\n")
                        for filepath in conflicted_files:
                            f.write(f"- `{filepath}`\n")
                        f.write("\n")
                    
                    if conflict_details:
                        f.write("### Conflict Details\n\n")
                        for filepath, conflicts in conflict_details.items():
                            f.write(f"#### {filepath}\n\n")
                            for i, conflict in enumerate(conflicts, 1):
                                f.write(f"**Conflict {i}:**\n")
                                f.write("```diff\n")
                                f.write(conflict)
                                f.write("\n```\n\n")
                    
                    f.write("---\n\n")
    
    # Create human-readable summary using buffered logs
    with open('upmerge-summary.txt', 'w') as f:
        f.write(get_buffered_logs())
        f.write("\n\n")
        f.write("=" * 60 + "\n")
        f.write("DETAILED RESULTS\n")
        f.write("=" * 60 + "\n\n")
        
        for detail in detailed_results:
            f.write(f"Target Branch: {detail['target_branch']}\n")
            f.write(f"  Status: {detail.get('status', 'unknown')}\n")
            f.write(f"  Steps Completed: {', '.join(detail.get('steps_completed', []))}\n")
            if detail.get('error'):
                f.write(f"  Error: {detail['error']}\n")
            conflict_check = detail.get('conflict_check')
            if conflict_check:
                f.write(f"  Had Conflicts: {conflict_check.get('has_conflicts', 'unknown')}\n")
                if conflict_check.get('has_conflicts'):
                    conflicted_files = conflict_check.get('conflicted_files', [])
                    f.write(f"  Conflicted Files ({len(conflicted_files)}):\n")
                    for filepath in conflicted_files[:20]:  # Show first 20 files
                        f.write(f"    - {filepath}\n")
                    if len(conflicted_files) > 20:
                        f.write(f"    ... and {len(conflicted_files) - 20} more\n")
            f.write("\n")
    
    # Exit with error if any upmerges failed
    if failed_upmerges:
        log("\n⚠️  Some upmerges failed. Manual intervention may be required.")
        sys.exit(1)
    else:
        log("\n✅ All upmerges completed successfully!")


if __name__ == "__main__":
    main()
