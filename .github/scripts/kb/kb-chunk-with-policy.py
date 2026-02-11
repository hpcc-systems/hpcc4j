#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
kb-chunk-with-policy.py

Wrapper that adds a --policy flag on top of kb-source-markdow-chunk.py.
It orchestrates multiple passes according to a YAML policy file and
concatenates per-pass index.jsonl files into the final out-dir.

Usage (policy mode):
  python .github/scripts/kb/kb-chunk-with-policy.py \
    --out-dir ".kb_index_enhanced" \
    --source-base "https://github.com/OWNER/REPO/blob/BRANCH" \
    --policy ".github/scripts/kb/chunking-policy.yml"

Usage (passthrough mode, no --policy):
  python .github/scripts/kb/kb-chunk-with-policy.py \
    --kb-root hpcc4j/kb/hpcc4j \
    --out-dir ".kb_index_enhanced" \
    --source-base "..." \
    --max-chars 2400 \
    --overlap 300 \
    --ext .md
"""

import argparse
import glob
import os
import pathlib
import re
import subprocess
import sys
from typing import List, Tuple, Dict, Any, Optional

try:
    import yaml  # pip install pyyaml
except Exception:
    print("ERROR: PyYAML is required. Install with: pip install pyyaml", file=sys.stderr)
    raise

UNDERLYING_CHUNKER = ".github/scripts/kb/kb-source-markdow-chunk.py"


def log(msg: str) -> None:
    print(f"[policy-chunker] {msg}", flush=True)


def die(msg: str, code: int = 2) -> None:
    print(f"[policy-chunker] ERROR: {msg}", file=sys.stderr, flush=True)
    sys.exit(code)


def parse_args() -> Tuple[argparse.Namespace, List[str]]:
    p = argparse.ArgumentParser(
        description="Policy-driven orchestrator over kb-source-markdow-chunk.py",
        allow_abbrev=False
    )
    p.add_argument("--kb-root", default=None, help="Optional when using --policy.")
    p.add_argument("--out-dir", required=True, help="Final output directory.")
    p.add_argument("--source-base", required=False, help="Base URL for source links.")
    p.add_argument("--ext", nargs="+", default=[".md"], help="Extensions to include (default: .md).")
    p.add_argument("--topics-map", default=None, help="Optional topics map path to forward.")
    p.add_argument("--policy", default=None, help="Path to YAML policy file.")
    args, unknown = p.parse_known_args()
    return args, unknown


def load_policy(path: str) -> Dict[str, Any]:
    path = os.path.abspath(path)
    if not os.path.isfile(path):
        die(f"Policy file not found: {path}")
    with open(path, "r", encoding="utf-8") as f:
        data = yaml.safe_load(f) or {}
    if not isinstance(data, dict):
        die("Policy must be a YAML mapping (dict) at top level.")
    data.setdefault("defaults", {})
    data.setdefault("rules", [])
    if not isinstance(data["rules"], list):
        die("Policy 'rules' must be a list.")
    return data


def derive_root_from_glob(pattern: str) -> str:
    specials = ["*", "?", "["]
    indices = [pattern.find(ch) for ch in specials if ch in pattern]
    first_meta = min(indices) if indices else -1
    if first_meta == -1:
        return pattern if os.path.isdir(pattern) else (os.path.dirname(pattern) or ".")
    cut = pattern.rfind(os.sep, 0, first_meta)
    return (pattern[:cut] if cut != -1 else ".").rstrip(os.sep) or "."


def sanitize_name(s: str) -> str:
    return re.sub(r"[^\w\-.]+", "_", (s or "group")).strip("_") or "group"


def ensure_dir(path: str) -> None:
    os.makedirs(path, exist_ok=True)


def concat_jsonl(in_files: List[str], out_file: str) -> int:
    """
    Concatenate jsonl files and return total line count written.
    """
    ensure_dir(os.path.dirname(out_file))
    total = 0
    with open(out_file, "w", encoding="utf-8") as out:
        for f in in_files:
            if not os.path.isfile(f):
                continue
            with open(f, "r", encoding="utf-8") as inp:
                for line in inp:
                    out.write(line)
                    total += 1
    return total


def list_matches(pattern: str) -> List[str]:
    return glob.glob(pattern, recursive=True)


def any_matches(pattern: str) -> bool:
    return len(list_matches(pattern)) > 0


def run_underlying_once(
    kb_root: str,
    out_dir: str,
    source_base: str,
    exts: List[str],
    max_chars: Optional[int],
    overlap: Optional[int],
    topics_map: Optional[str],
    passthru: Optional[List[str]] = None
) -> None:
    cmd = [sys.executable, UNDERLYING_CHUNKER,
           "--kb-root", kb_root,
           "--out-dir", out_dir]

    if source_base:
        cmd += ["--source-base", source_base]
    if exts:
        cmd += ["--ext"] + exts
    if max_chars is not None:
        cmd += ["--max-chars", str(max_chars)]
    if overlap is not None:
        cmd += ["--overlap", str(overlap)]
    if topics_map:
        cmd += ["--topics-map", topics_map]
    if passthru:
        cmd += passthru

    log(f"Invoking: {' '.join(cmd)}")
    subprocess.run(cmd, check=True)


def compute_common_root(paths: List[str]) -> Optional[str]:
    """
    Compute a common directory root across a set of globs (after deriving roots).
    """
    if not paths:
        return None
    roots = [os.path.abspath(derive_root_from_glob(p)) for p in paths]
    try:
        common = os.path.commonpath(roots)
    except Exception:
        return None
    return common


def count_lines(path: str) -> int:
    if not os.path.isfile(path):
        return 0
    n = 0
    with open(path, "r", encoding="utf-8") as f:
        for _ in f:
            n += 1
    return n


def main() -> None:
    args, _unknown = parse_args()

    # Passthrough mode
    if not args.policy:
        log("No --policy provided. Passthrough to underlying chunker.")
        cmd = [sys.executable, UNDERLYING_CHUNKER] + sys.argv[1:]
        log(f"Invoking passthrough: {' '.join(cmd)}")
        subprocess.run(cmd, check=True)
        return

    # Policy mode
    policy = load_policy(args.policy)
    defaults = policy.get("defaults", {}) or {}
    rules = policy.get("rules", []) or []

    if not args.source_base:
        die("--source-base is required when using --policy.")

    exts = args.ext or [".md"]
    final_out = os.path.abspath(args.out_dir)
    tmp_root = os.path.abspath(".kb_tmp")
    ensure_dir(final_out)
    ensure_dir(tmp_root)

    produced: List[str] = []
    produced_nonempty: List[str] = []
    rule_globs: List[str] = []

    for idx, rule in enumerate(rules, start=1):
        if not isinstance(rule, dict):
            log(f"Skipping rule {idx}: not a mapping")
            continue

        path_glob = rule.get("path_glob") or rule.get("glob")
        if not path_glob:
            log(f"Skipping rule {idx}: missing 'path_glob'")
            continue

        rule_globs.append(path_glob)

        max_chars = rule.get("max_chars", defaults.get("max_chars"))
        overlap = rule.get("overlap", defaults.get("overlap"))

        # Derive scan root for the underlying chunker
        scan_root = derive_root_from_glob(path_glob)

        # Diagnostics: what matches does this glob find?
        matches = list_matches(path_glob)
        if not matches:
            log(f"Rule {idx}: no matches for glob '{path_glob}'; skipping.")
            continue
        log(f"Rule {idx}: glob='{path_glob}' -> root='{scan_root}' "
            f"matches={len(matches)}")

        # Show up to 5 sample matches to aid debugging
        for sample in matches[:5]:
            log(f"  sample: {sample}")

        group = sanitize_name(path_glob)
        out_dir = os.path.join(tmp_root, group)
        ensure_dir(out_dir)

        log(f"Rule {idx}: max_chars={max_chars} overlap={overlap}")
        run_underlying_once(
            kb_root=scan_root,
            out_dir=out_dir,
            source_base=args.source_base,
            exts=exts,
            max_chars=max_chars,
            overlap=overlap,
            topics_map=args.topics_map,
            passthru=None
        )

        jsonl = os.path.join(out_dir, "index.jsonl")
        if os.path.isfile(jsonl):
            produced.append(jsonl)
            lines = count_lines(jsonl)
            if lines > 0:
                produced_nonempty.append(jsonl)
                log(f"Rule {idx}: produced {lines} chunks -> {jsonl}")
            else:
                log(f"Rule {idx}: WARNING: {jsonl} exists but is empty.")
        else:
            log(f"Rule {idx}: WARNING: expected {jsonl} not found.")

    final_index = os.path.join(final_out, "index.jsonl")

    # If we got any non-empty per-rule output, merge those (prefer non-empty),
    # otherwise merge whatever was produced (may be empty).
    to_merge = produced_nonempty if produced_nonempty else produced

    if to_merge:
        total = concat_jsonl(to_merge, final_index)
        log(f"Wrote merged index to {final_index} (total chunks: {total})")
        if total > 0:
            log("Done.")
            return
        else:
            log("Merged index is empty after concatenation.")
    else:
        log("No per-rule index.jsonl files were produced.")

    # Fallback: try a single pass over a broader root so we don't end up empty.
    log("Attempting fallback chunking because no non-empty output was produced by rules.")
    fallback_root = (
        args.kb_root
        or os.environ.get("KB_ROOT")
        or compute_common_root(rule_globs)
        or "hpcc4j/kb/hpcc4j"
    )
    log(f"Fallback root resolved to: {fallback_root}")

    fallback_dir = os.path.join(tmp_root, "fallback_all")
    ensure_dir(fallback_dir)

    # Use defaults for chunk sizing if available
    fb_max = defaults.get("max_chars")
    fb_ovl = defaults.get("overlap")

    run_underlying_once(
        kb_root=fallback_root,
        out_dir=fallback_dir,
        source_base=args.source_base,
        exts=exts,
        max_chars=fb_max,
        overlap=fb_ovl,
        topics_map=args.topics_map,
        passthru=None
    )

    fb_jsonl = os.path.join(fallback_dir, "index.jsonl")
    if os.path.isfile(fb_jsonl):
        total = concat_jsonl([fb_jsonl], final_index)
        log(f"Fallback wrote {total} chunks to {final_index}")
        # Even if total == 0, ensure the file exists so downstream checks can fail-fast
        if total == 0 and not os.path.isfile(final_index):
            ensure_dir(os.path.dirname(final_index))
            open(final_index, "w", encoding="utf-8").close()
    else:
        log("Fallback did not produce an index.jsonl; creating an empty final index.")
        ensure_dir(os.path.dirname(final_index))
        open(final_index, "w", encoding="utf-8").close()

    log("Done.")


if __name__ == "__main__":
    main()