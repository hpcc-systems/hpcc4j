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
    """Use git merge-tree to check for conflicts without touching working tree."""
    cmd = ["git", "merge-tree", "--name-only", source_ref, target_ref]
    result = subprocess.run(cmd, capture_output=True, text=True)
    
    # merge-tree --name-only: non-zero return code or non-empty output indicates conflicts
    if result.returncode != 0 or result.stdout.strip():
        # Parse conflicting file list from output
        conflicts = [f.strip() for f in result.stdout.strip().split('\n') if f.strip()]
        return True, conflicts
    
    return False, []


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
        add_result = subprocess.run(
            ["git", "add", "pom.xml", "**/pom.xml"], 
            capture_output=True, text=True
        )
        if add_result.returncode != 0:
            log(f"Failed to stage version changes: {add_result.stderr}")
            subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Git add failed: {add_result.stderr}"
            return False, upmerge_details
        
        # Verify there are changes to commit
        status_result = subprocess.run(
            ["git", "status", "--porcelain"],
            capture_output=True, text=True
        )
        if not status_result.stdout.strip():
            log("No version changes to commit (versions already aligned)")
            subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = "No changes staged for commit"
            return False, upmerge_details
        
        commit_result = subprocess.run(
            ["git", "commit", "-m", f"[TEMP] Align version to {target_version}"],
            capture_output=True, text=True
        )
        if commit_result.returncode != 0:
            log(f"Failed to commit version changes: {commit_result.stderr}")
            subprocess.run(["git", "checkout", "--detach", original_ref], capture_output=True)
            subprocess.run(["git", "branch", "-D", temp_branch], capture_output=True)
            upmerge_details["status"] = "failed"
            upmerge_details["error"] = f"Git commit failed: {commit_result.stderr}"
            return False, upmerge_details
        upmerge_details["steps_completed"].append("commit_temp_version")
    
        # Check for merge conflicts using merge-tree (dry-run)
        log("Checking for merge conflicts...")
        has_conflicts, conflict_details = check_merge_conflicts(
            temp_branch, 
            f"origin/{target_branch}"
        )
        
        upmerge_details["conflict_check"] = {
            "has_conflicts": has_conflicts,
            "details": conflict_details[:20] if conflict_details else []
        }
        
        if has_conflicts:
            log(f"❌ Conflicts detected during upmerge to {target_branch}:")
            for detail in conflict_details[:10]:  # Show first 10 conflict lines
                log(f"   {detail}")
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
            if detail.get('conflict_check'):
                f.write(f"  Had Conflicts: {detail['conflict_check'].get('has_conflicts', 'unknown')}\n")
            f.write("\n")
    
    # Exit with error if any upmerges failed
    if failed_upmerges:
        log("\n⚠️  Some upmerges failed. Manual intervention may be required.")
        sys.exit(1)
    else:
        log("\n✅ All upmerges completed successfully!")


if __name__ == "__main__":
    main()
